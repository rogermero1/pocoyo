package fin.coop15abril.servicios.integradores.inversiones.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.Inversion;
import fin.coop15abril.servicios.integradores.inversiones.servicios.ServicioInversionesDenarius;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api")
@Slf4j
public class ControladorInversiones {

	@Autowired
	private ServicioInversionesDenarius servicioInversiones;

	@Operation(summary = "Consulta Inversiones", description = "Consulta inversiones por Identificacion")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-inversiones", consumes = { "application/json" }, produces = { "application/json" })
	public List<Inversion> consultaInversionesPorIdentificacion(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosClienteME.class)) @Valid @RequestBody DatosClienteME request)
			throws Exception {
		try {
			log.info("Procesando consulta de inversiones para: " + request.getIdentificacion());

			return servicioInversiones.consultaInversionesPorIdentificacion(request.getIdentificacion());

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
