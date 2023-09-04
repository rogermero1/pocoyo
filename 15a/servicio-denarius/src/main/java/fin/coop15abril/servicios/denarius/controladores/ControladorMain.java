package fin.coop15abril.servicios.denarius.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class ControladorMain {

	@GetMapping(value = "")
	public String estado() {
		return "OK";
	}

}
