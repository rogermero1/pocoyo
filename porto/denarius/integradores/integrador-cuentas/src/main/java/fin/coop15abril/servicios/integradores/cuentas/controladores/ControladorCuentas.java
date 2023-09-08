package fin.coop15abril.servicios.integradores.cuentas.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.dtos.*;
import fin.coop15abril.servicios.integradores.cuentas.servicios.ServicioCuentasDenarius;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api")
@Slf4j
public class ControladorCuentas {

	@Autowired
	private ServicioCuentasDenarius servicioCuentas;

	@GetMapping(value = "")
	public String estado() {
		return "OK";
	}

	@Operation(summary = "Consulta Cuentas", description = "Consulta cuentas por Identificacion")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-cuentas", consumes = { "application/json" }, produces = { "application/json" })
	public List<CuentaAhorro> consultaCuentasPorIdentificacion(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosClienteME.class)) @Valid @RequestBody DatosClienteME request)
			throws Exception {
		try {
			log.info("Procesando consulta de cuentas para: " + request.getIdentificacion());

			return servicioCuentas.consultaCuentasPorIdentificacion(request.getIdentificacion());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
	}

}
