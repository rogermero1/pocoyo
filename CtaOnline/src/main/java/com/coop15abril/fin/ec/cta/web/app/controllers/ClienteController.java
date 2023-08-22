package com.coop15abril.fin.ec.cta.web.app.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.coop15abril.fin.ec.cta.web.app.models.entity.Balance;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosComplementario;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosPersonal;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Domicilio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Empleo;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ReferenciaCliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Telefono;
import com.coop15abril.fin.ec.cta.web.app.service.ClienteService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:8080")
@RequestMapping("/cliente")
public class ClienteController {
	//private static final Logger logger = LoggerFactory.getLogger(ProcesaSolicitudController.class);

	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = "/datosP", produces = MediaType.APPLICATION_JSON_VALUE)
	public DatosPersonal datosPersonales(HttpSession session) {
		return clienteService.getDatosPersonales(session.getAttribute("usuario").toString());
	}

	@GetMapping(value = "/datosD", produces = MediaType.APPLICATION_JSON_VALUE)
	public Domicilio datosDireccion(@SessionAttribute("usuario") String cliente) {
		return clienteService.getDireccionCliente(cliente);
	}

	@GetMapping(value = "/datosT", produces = MediaType.APPLICATION_JSON_VALUE)
	public Telefono datosTelefono(@SessionAttribute("usuario") String cliente) {
		return clienteService.getTelefonoCliente(cliente);
	}

	@GetMapping(value = "/datosE", produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleo datosEmpleo(@SessionAttribute("usuario") String cliente) {
		return clienteService.getEmpleo(cliente);
	}

	@GetMapping(value = "/datosEB", produces = MediaType.APPLICATION_JSON_VALUE)
	public Balance datosEmpleoBalance(@SessionAttribute("usuario") String cliente) {
		return clienteService.getBalance(cliente);
	}

	@GetMapping(value = "/datosRP", produces = MediaType.APPLICATION_JSON_VALUE)
	public ReferenciaCliente datosReferenciaPersonal(@SessionAttribute("usuario") String cliente) {
		return clienteService.getReferenciaCliente(cliente);
	}

	@GetMapping(value = "/datosCP", produces = MediaType.APPLICATION_JSON_VALUE)
	public DatosComplementario datosComplementarios(@SessionAttribute("usuario") String cliente) {
		return clienteService.getDatosComplementario(cliente);
	}

}
