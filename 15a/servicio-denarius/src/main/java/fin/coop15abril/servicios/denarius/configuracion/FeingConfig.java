package fin.coop15abril.servicios.denarius.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.codec.ErrorDecoder;

@Configuration
public class FeingConfig {

	@Bean
	ErrorDecoder errorDecoder() {
		return new ControlErrorClienteFeing();
	}

}
