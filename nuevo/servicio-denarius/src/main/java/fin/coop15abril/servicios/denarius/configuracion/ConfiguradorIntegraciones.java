package fin.coop15abril.servicios.denarius.configuracion;

import java.io.FileInputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Getter
public class ConfiguradorIntegraciones {

	private static Properties configuracion = new Properties();

	private String urlApisClientes;
	private String urlApisCuentas;
	private String urlApisCreditos;
	private String urlApisInversiones;

	@PostConstruct
	private void init() {
		try {

			log.info("Inicializando propiedades de clientes Denarius");

			String rutaConfiguracion = System.getProperty("propDenarius");
			log.info("Properties: " + rutaConfiguracion);

			configuracion.load(new FileInputStream(rutaConfiguracion));

			urlApisClientes = configuracion.getProperty("API_CLIENTES");
			urlApisCuentas = configuracion.getProperty("API_CUENTAS");
			urlApisCreditos = configuracion.getProperty("API_CREDITOS");
			urlApisInversiones = configuracion.getProperty("API_INVERSIONES");

			log.info("urlApisClientes: " + urlApisClientes);
			log.info("urlApisCuentas: " + urlApisCuentas);
			log.info("urlApisCreditos: " + urlApisCreditos);
			log.info("urlApisInversiones: " + urlApisInversiones);

		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

}
