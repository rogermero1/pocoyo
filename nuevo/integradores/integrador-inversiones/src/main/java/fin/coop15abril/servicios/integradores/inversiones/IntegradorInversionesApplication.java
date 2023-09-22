package fin.coop15abril.servicios.integradores.inversiones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntegradorInversionesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IntegradorInversionesApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IntegradorInversionesApplication.class);
	}

}
