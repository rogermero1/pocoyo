package fin.coop15abril.servicios.integradores.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntegradorClientesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IntegradorClientesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IntegradorClientesApplication.class);
	}

}
