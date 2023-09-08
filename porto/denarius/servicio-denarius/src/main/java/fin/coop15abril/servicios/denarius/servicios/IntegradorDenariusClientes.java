package fin.coop15abril.servicios.denarius.servicios;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.JsonUtils;
import fin.coop15abril.servicios.denarius.clientesrest.ApisClientes;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCreditos;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCuentas;
import fin.coop15abril.servicios.denarius.clientesrest.ApisInversiones;
import fin.coop15abril.servicios.denarius.configuracion.ConfiguradorIntegraciones;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultaClienteME;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IntegradorDenariusClientes {

	@Autowired
	private ConfiguradorIntegraciones integradorConfig;

	@Autowired
	private ApisClientes apiClientes;

	@Autowired
	private ApisCuentas apiCuentas;

	@Autowired
	private ApisCreditos apiCreditos;

	@Autowired
	private ApisInversiones apiInversiones;

	public String consultarClientePorIdentificacion(String data) throws Exception {

		ConsultaClienteME consultaClienteME = JsonUtils.jsonToClass(data, ConsultaClienteME.class);

		if (consultaClienteME != null) {
			DatosClienteMS cliente = apiClientes.consultaClientesPorIdentificacion(
					URI.create(integradorConfig.getUrlApisClientes()), new DatosClienteME(
							consultaClienteME.getIdentificacion(), consultaClienteME.getConsultarDatosAdicionales()));

			if (cliente != null) {

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarCuentas())) {
					cliente.setCuentasAhorro(apiCuentas.consultaCuentasPorIdentificacion(
							URI.create(integradorConfig.getUrlApisCuentas()),
							new DatosClienteME(consultaClienteME.getIdentificacion())));
				}

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarCreditos())) {
					cliente.setCreditos(apiCreditos.consultaCreditosPorIdentificacion(
							URI.create(integradorConfig.getUrlApisCreditos()),
							new DatosClienteME(consultaClienteME.getIdentificacion())));
				}

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarInversiones())) {
					cliente.setInversiones(apiInversiones.consultaInversionesPorIdentificacion(
							URI.create(integradorConfig.getUrlApisInversiones()),
							new DatosClienteME(consultaClienteME.getIdentificacion())));
				}

			}

			return JsonUtils.classToJson(cliente);
		} else {
			log.error("IntegracionDenarius: consultaClienteME vacio");
			throw new ExcepcionApp("500", "Error al procesar consulta", "consultaClienteME vacio");
		}

	}

}
