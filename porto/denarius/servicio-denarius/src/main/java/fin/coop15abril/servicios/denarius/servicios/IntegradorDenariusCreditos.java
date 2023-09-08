package fin.coop15abril.servicios.denarius.servicios;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.DatosOperacionME;
import fin.coop15abril.servicios.comunes.dtos.DatosOperacionMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.JsonUtils;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCreditos;
import fin.coop15abril.servicios.denarius.configuracion.ConfiguradorIntegraciones;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultaOperacionME;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IntegradorDenariusCreditos {

	@Autowired
	private ConfiguradorIntegraciones integradorConfig;

	@Autowired
	private ApisCreditos apiCreditos;

	public String consultarOperaciones(String data) throws Exception {
		log.info("data: " + data);

		ConsultaOperacionME consultaOperacionME = JsonUtils.jsonToClass(data, ConsultaOperacionME.class);
			

		if (consultaOperacionME != null) {
			log.info("1");
			DatosOperacionMS operacion = new DatosOperacionMS();
			log.info("2");
			operacion.setListaOperaciones(
					apiCreditos.consultaCreditosPorOperacion(URI.create(integradorConfig.getUrlApisCreditos()),
							new DatosOperacionME(consultaOperacionME.getTipoConsulta(),
									consultaOperacionME.getCodigo())));
			log.info("3");
			return JsonUtils.classToJson(operacion);
		} else {
			log.error("IntegracionDenarius: consultaOperacionME vacio");
			throw new ExcepcionApp("500", "Error al procesar consulta", "consultaOperacionME vacio");
		}

	}

}
