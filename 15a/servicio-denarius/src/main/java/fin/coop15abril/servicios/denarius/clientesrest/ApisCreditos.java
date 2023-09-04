package fin.coop15abril.servicios.denarius.clientesrest;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import fin.coop15abril.servicios.comunes.dtos.Credito;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.denarius.configuracion.FeingConfig;

@FeignClient(name = "apisCreditos", url = "http", configuration = FeingConfig.class)
public interface ApisCreditos {

	@PostMapping(value = "/consulta-creditos", consumes = { "application/json" }, produces = { "application/json" })
	public List<Credito> consultaCreditosPorIdentificacion(URI url, DatosClienteME request) throws ExcepcionApp;

}
