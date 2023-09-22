package fin.coop15abril.servicios.denarius.servicios;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.dtos.DatosCreditoME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteCondicionME;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.JsonUtils;
import fin.coop15abril.servicios.denarius.clientesrest.ApisClientes;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCreditos;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCuentas;
import fin.coop15abril.servicios.denarius.clientesrest.ApisInversiones;
import fin.coop15abril.servicios.denarius.configuracion.ConfiguradorIntegraciones;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultaClienteME;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultarClientesCondicionesME;
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
					URI.create(integradorConfig.getUrlApisClientes()),
					new DatosClienteME(consultaClienteME.getIdentificacion(),
							consultaClienteME.getConsultarDatosAdicionalesCreditos()));

			if (cliente != null) {

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarCuentas())) {
					cliente.setCuentasAhorro(apiCuentas.consultaCuentasPorIdentificacion(
							URI.create(integradorConfig.getUrlApisCuentas()),
							new DatosClienteME(consultaClienteME.getIdentificacion(),
									consultaClienteME.getConsultarDatosAdicionalesCuentas())));
				}

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarCreditos())) {
					cliente.setCreditos(apiCreditos.consultaCreditos(URI.create(integradorConfig.getUrlApisCreditos()),
							new DatosCreditoME(null, cliente.getIdCliente().toString(),
									consultaClienteME.getConsultarPlanPagoCredito(),
									consultaClienteME.getConsultarDatosAdicionalesCreditos())));
				}

				if (Boolean.TRUE.equals(consultaClienteME.getConsultarInversiones())) {
					cliente.setInversiones(apiInversiones.consultaInversionesPorIdentificacion(
							URI.create(integradorConfig.getUrlApisInversiones()),
							new DatosClienteME(consultaClienteME.getIdentificacion(),
									consultaClienteME.getConsultarDatosAdicionalesInversiones())));
				}

			}

			return JsonUtils.classToJson(cliente);
		} else {
			log.error("IntegracionDenarius: consultaClienteME vacio");
			throw new ExcepcionApp("500", "Error al procesar consulta", "consultaClienteME vacio");
		}

	}

	public String consultarClientesCondiciones(String data) throws Exception {

		ConsultarClientesCondicionesME consultarClientesCondicionesME = JsonUtils.jsonToClass(data,
				ConsultarClientesCondicionesME.class);

		if (consultarClientesCondicionesME != null) {
			List<DatosClienteMS> clienteCondicion = apiClientes.consultaClientesCondicion(
					URI.create(integradorConfig.getUrlApisClientes()),
					new DatosClienteCondicionME(consultarClientesCondicionesME.getTipoConsulta(),
							consultarClientesCondicionesME.getApellidoMaterno(),
							consultarClientesCondicionesME.getApellidoPaterno(),
							consultarClientesCondicionesME.getNombres(),
							consultarClientesCondicionesME.getIdentificacion(),
							consultarClientesCondicionesME.getIdCliente()));

			return JsonUtils.classToJson(clienteCondicion);
		} else {
			log.error("IntegracionDenarius: consultarClientesCondicionesME vacio");
			throw new ExcepcionApp("500", "Error al procesar consulta", "consultarClientesCondicionesME vacio");
		}

	}

}
