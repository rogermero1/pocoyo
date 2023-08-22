/**
 * 
 */
package com.coop15abril.fin.ec.cta.web.app.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.coop15abril.fin.ec.cta.web.app.models.entity.Cliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CorreoEmisor;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CuentaAhorro;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ValidaCliente;
import com.coop15abril.fin.ec.cta.web.app.service.CuentaAhorroService;
import com.coop15abril.fin.ec.cta.web.app.service.ExtrasService;
import com.coop15abril.fin.ec.cta.web.app.service.OpstionService;

/**
 * @author cristian.german
 *
 */

@Controller
@SessionAttributes("usuario")
public class ProcesaSolicitudController {

	private static final Logger logger = LoggerFactory.getLogger(ProcesaSolicitudController.class);
	private CorreoEmisor correoEmisor;

	@Autowired
	private CuentaAhorroService ahorroService;

	@Autowired
	private ExtrasService extrasService;

	@Autowired
	private OpstionService optionService;

	@GetMapping(name = "/")
	public String index(HttpServletRequest request, Map<String, Object> model) {
		model.put("titulo", "Cuentas de Ahorro | Coop15abril");
		if (request.getSession(false) != null) {
			request.getSession().invalidate();
		}
		return "verifica";
	}

	
	@PostMapping("/ingreso")
	public String validaCliente(HttpServletRequest request, @RequestParam String txt_identificacion, @RequestParam String txt_cod_dactilar, Model model) {

		ValidaCliente validaCliente = ahorroService.VerificaCliente(txt_identificacion);
     
		logger.info("error " + validaCliente.getError());
		logger.info("mensaje " + validaCliente.getMensaje());

		if (validaCliente.getError() != null) {
			logger.error("Verifica Cliente Error en el procedure :" + validaCliente.getError());
			return "500";
		}

		if ((validaCliente.getMensaje() != null && (!validaCliente.getMensaje().equalsIgnoreCase("99")))) {

			model.addAttribute("mensaje", validaCliente.getMensaje());
			return "response";
		}
		        
		model.addAttribute("usuario", txt_identificacion);
		model.addAttribute("dni", txt_identificacion);
		model.addAttribute("cod_dactilar", txt_cod_dactilar);
		model.addAttribute("opt", validaCliente.getMensaje());
		model.addAttribute("titulo", "Cuentas de Ahorro | Coop15abril");
		
		logger.info(" empleado " + optionService.getCorreoEmpleado() );
		
		return "home/index";
	}

	@PostMapping("/procesa")
	public ResponseEntity<?> procesaCliente(@Valid @RequestBody Cliente PersonaDatos, BindingResult result) throws Exception {
		
		Map<String,Object> model = new HashMap<>();
		CuentaAhorro cuentaAhorro = null;
		correoEmisor = optionService.getCorreoEmisor();	
		String correoEmpleado = optionService.getCorreoEmpleado();
	 		
	    //verify client
		ValidaCliente validaCliente = ahorroService.VerificaCliente(PersonaDatos.getCodigoIdentificacion());
		
		logger.info( PersonaDatos.toString() );
 		
		//valid client
		if ((!StringUtils.isEmpty(validaCliente.getMensaje())) && (!validaCliente.getMensaje().equals("99"))) {
			model.put("error", validaCliente.getMensaje());
			logger.error("Error de validacion: cliente ya tiene cuenta o esta en alguna lista de bloqueo");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}
		
       if ( result.hasErrors() ) {
    	    logger.error("Error de validacion: validacion de campos erronea "); 
    	    logger.error("Errores: "+result.getAllErrors() );
            model.put("errors-validacion", "validacion de campos erronea ");
            return  new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
        }		
    
		//create account
		cuentaAhorro = PersonaDatos.getOpt() == 99 ? ahorroService.CrearCuentaActualizaCliente(PersonaDatos) : ahorroService.CrearCuentaAgregarCliente(PersonaDatos);

		if (cuentaAhorro.getCodigoError() != null) {
			model.put("error", "Error al crear cuenta");
			logger.error("ERROR AL CREAR CUENTA DE AHORROS");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}

		if (cuentaAhorro.getCuenta() == null) {
			model.put("error", "Error al crear cuenta");
			logger.error("Error al crear cuenta numero de cuenta es null");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}
			
		
		//create and send agreement email
		if ( !extrasService.CrearContrato(PersonaDatos.getApellidoUno()+" "+PersonaDatos.getApellidosDos()+" "+PersonaDatos.getNombres(),PersonaDatos.getCodigoIdentificacion(), cuentaAhorro.getCuenta()) ) {
			logger.error("Error al generar archivo de contrato de cuenta de ahorro "+cuentaAhorro.getCuenta());
		}		
		/*
		 * if (
		 * !extrasService.EnviarEmail(PersonaDatos.getApellidoUno()+" "+PersonaDatos.
		 * getApellidosDos() + " " +PersonaDatos.getNombres(),
		 * PersonaDatos.getEmail(),cuentaAhorro.getCuenta(), correoEmisor) ) {
		 * logger.error("Error de envio de correo para el email:"+PersonaDatos.getEmail(
		 * )+",  con numero de cuenta "+cuentaAhorro.getCuenta()); }
		 */
	    
		//send email
		if ( !extrasService.EnviaEmailEmpleado(correoEmpleado, cuentaAhorro.getCuenta().toString(), PersonaDatos.getApellidoUno()+" "+PersonaDatos.getApellidosDos() + " " +PersonaDatos.getNombres(), PersonaDatos.getCodigoIdentificacion(), PersonaDatos.getCedulaFileF(), PersonaDatos.getCedulaFileP(), PersonaDatos.getSbFile(), correoEmisor) ) {
			  logger.error("Error de envio de correo para el email: "+correoEmpleado+",  con numero de cuenta "+cuentaAhorro.getCuenta());			  
		}		
		
		model.put("email", PersonaDatos.getEmail());
		model.put("cuenta", cuentaAhorro.getCuenta());		
		return new ResponseEntity<Map<String, Object>>(model, HttpStatus.CREATED);
	}

	@PostMapping("/upload")
	public ResponseEntity<?> uploadFile(@RequestParam("cedula_file_f") MultipartFile cedula_file_f, 
	                                    @RequestParam("cedula_file_p") MultipartFile cedula_file_p,	
										@RequestParam("sb_file") MultipartFile sb_file, 
										@RequestParam("dni") String dni){
											
		Map<String, Object> model = new HashMap<>();
		correoEmisor = optionService.getCorreoEmisor();

		//valid  files
		if (cedula_file_f == null || cedula_file_f.isEmpty()) {
			model.put("error", "Por favor seleccione archivo cedula parte frontal");
			logger.error("Error el archivo cedula parte frontal  esta null o vacio");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}		
		
		if (cedula_file_p == null || cedula_file_p.isEmpty()) {
			model.put("error", "Por favor seleccione archivo cedula parte posterior");
			logger.error("Error el archivo cedula parte posterior esta null o vacio");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}		 
		
		if (sb_file == null || sb_file.isEmpty()) {
			model.put("error", "Por favor seleccione un archivo");
			logger.error("Error el archivo sb esta null o vacio");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}
		// upload files
		String cedulaUploadF = extrasService.subirArchivo(cedula_file_f, dni , "cedula_lado_frontal");
		if ( cedulaUploadF == "error" ) {
			model.put("error", "Error al subir file cedula lado frontal");
			logger.error("Error al subir file cedula lado frontal");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}
				
		String cedulaUploadP = extrasService.subirArchivo(cedula_file_p, dni, "cedula_lado_posterior");
		if (cedulaUploadP == "error") {
			model.put("error", "Error al subir file cedula lado posterior");
			logger.error("Error al subir file cedula lado posterior");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}		 
		
		String sbUpload = extrasService.subirArchivo(sb_file, dni, "servicio_basico");
		if ( sbUpload == "error" ) {
			model.put("error", "Error al subir file sb_file");
			logger.error("Error al procesar subida de archivo servicio básico_file");
			return new ResponseEntity<Map<String, Object>>(model, HttpStatus.BAD_REQUEST);
		}
		
	    logger.info("Arcivhos de cedula y servicio basico para el dni:"+dni+", subidos correctamente ");
		model.put("cedulaUploadF", cedulaUploadF);
		model.put("cedulaUploadP", cedulaUploadP);
		model.put("sbUpload", sbUpload);
		model.put("message", "ok");
		return new ResponseEntity<Map<String, Object>>(model, HttpStatus.CREATED);
	}

	@GetMapping("/terminos/medios")
	public String terminos() {
		return "Partials/medios_electronicos";
	}

}
