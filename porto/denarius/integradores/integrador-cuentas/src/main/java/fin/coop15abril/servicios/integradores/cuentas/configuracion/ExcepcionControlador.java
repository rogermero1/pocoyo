package fin.coop15abril.servicios.integradores.cuentas.configuracion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExcepcionControlador {

	@ExceptionHandler()
	@ResponseBody
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	String handleException(Exception e) {
		log.error(e.getCause() + " " + e.getMessage());
		return "{ \"Codigo\" : 500, \"MensajeUsuario\" : \"Se ha producido un error\", \"MensajeTecnico\" : \""
				+ e.getMessage() + "\"}";
	}

	@ExceptionHandler()
	@ResponseBody
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	String handleException(ExcepcionApp e) {
		log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
		return "{ \"Codigo\" : " + e.getCodigo() + ", \"MensajeUsuario\" : \"" + e.getMensajeUsuario()
				+ "\", \"MensajeTecnico\" : \"" + e.getMensajeTecnico() + "\" }";
	}
}
