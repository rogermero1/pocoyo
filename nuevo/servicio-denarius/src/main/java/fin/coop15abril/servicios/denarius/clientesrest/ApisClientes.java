package fin.coop15abril.servicios.denarius.clientesrest;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteCondicionME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.denarius.configuracion.FeingConfig;

@FeignClient(name = "apisClientes", url = "http", configuration = FeingConfig.class)
public interface ApisClientes {

	@PostMapping(value = "/consulta-cliente", consumes = { "application/json" }, produces = { "application/json" })
	public DatosClienteMS consultaClientesPorIdentificacion(URI url, DatosClienteME request) throws ExcepcionApp;
	
	@PostMapping(value = "/consulta-cliente-condicion", consumes = { "application/json" }, produces = { "application/json" })
	public List<DatosClienteMS> consultaClientesCondicion(URI url, DatosClienteCondicionME request) throws ExcepcionApp;


}
