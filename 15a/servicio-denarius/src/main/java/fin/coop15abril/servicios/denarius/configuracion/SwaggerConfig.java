package fin.coop15abril.servicios.denarius.configuracion;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				// .apis(RequestHandlerSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("fin.coop15abril.servicios.denarius.controladores"))
				.paths(PathSelectors.any()).build().apiInfo(getApiInfo());
	}

	private ApiInfo getApiInfo() {
		return new ApiInfo("Apis DENARIUS", "Documentación de apis utilizadas para la integracion con DENARIUS", "1.0", "#",
				new Contact("Developer", "#", "cosito@cosito.com"), "LICENSE", "#", Collections.emptyList());
	}
}
