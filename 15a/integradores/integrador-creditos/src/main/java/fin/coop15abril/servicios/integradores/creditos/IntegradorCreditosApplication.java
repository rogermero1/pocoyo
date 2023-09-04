package fin.coop15abril.servicios.integradores.creditos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IntegradorCreditosApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(IntegradorCreditosApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IntegradorCreditosApplication.class);
	}

}
