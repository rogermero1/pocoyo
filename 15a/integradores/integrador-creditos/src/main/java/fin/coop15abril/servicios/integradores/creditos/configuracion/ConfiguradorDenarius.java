package fin.coop15abril.servicios.integradores.creditos.configuracion;

import java.io.FileInputStream;
import java.util.Properties;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Getter
public class ConfiguradorDenarius {
	
	private static Properties configuracion = new Properties();

	private String organizacion;
	private String usuario;
	private String oficina;
	private String urlServicioCreditos;

	@PostConstruct
	private void init() {
		try {

			log.info("Inicializando propiedades de Configuracion Denarius");

			String rutaConfiguracion = System.getProperty("propDenarius");
			log.info("Properties: " + rutaConfiguracion);

			configuracion.load(new FileInputStream(rutaConfiguracion));

			String host = configuracion.getProperty("HOST");
			organizacion = configuracion.getProperty("ORGANIZACION");
			usuario = configuracion.getProperty("USUARIO");
			oficina = configuracion.getProperty("OFICINA");
			String servicioCreditos = configuracion.getProperty("SERVICIO_CREDITOS");

			log.info("utilizando HOST: " + host);
			log.info("Organizacion: " + organizacion);
			log.info("Usuario: " + usuario);
			log.info("Oficina: " + oficina);
			log.info("servicioCreditos: " + servicioCreditos);
			this.urlServicioCreditos = host + servicioCreditos;

		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

}
