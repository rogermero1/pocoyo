package fin.coop15abril.servicios.denarius.clientesrest;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.Inversion;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.denarius.configuracion.FeingConfig;

@FeignClient(name = "apisInversiones", url = "http", configuration = FeingConfig.class)
public interface ApisInversiones {

	@PostMapping(value = "/consulta-inversiones", consumes = { "application/json" }, produces = { "application/json" })
	public List<Inversion> consultaInversionesPorIdentificacion(URI url, DatosClienteME request) throws ExcepcionApp;
}
