package fin.coop15abril.servicios.denarius.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.denarius.controladores.dtos.RequestApi;
import fin.coop15abril.servicios.denarius.controladores.dtos.ResponseApi;
import fin.coop15abril.servicios.denarius.servicios.IntegradorDenariusCreditos;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.extern.slf4j.Slf4j;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;


@RestController
@RequestMapping("/creditos")
@Slf4j
public class ControladorCreditos {

	@Autowired
	private IntegradorDenariusCreditos denarius;

	@Operation(summary = "Api", description = "Consulta generica para Creditos Denarius")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud Inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "Internal Server Error") })
	@PostMapping(value = "/api", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseApi api(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = RequestApi.class)) @Valid @RequestBody RequestApi request) {

		try {

			log.info("Procesando solicitud para método: " + request.getNombreMetodo() + " dataJson: "
					+ request.getDataJson());

			switch (request.getNombreMetodo()) {
			case "consultaTablaAmortizacionCartera":
				System.out.println("entra al case");
				return new ResponseApi("200", "OK", denarius.consultarTablaAmortizacionCartera(request.getDataJson()));
			// break;
			case "consultaOperacion":
				System.out.println("entra al case");
				return new ResponseApi("200", "OK", denarius.consultarOperaciones(request.getDataJson()));

			default:
				return new ResponseApi("400", "Metodo inválido", "");
			}

		} catch (ExcepcionApp e) {
			log.error("log 1 : " + e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
			return new ResponseApi(e.getCodigo(), e.getMensajeUsuario(), e.getMensajeTecnico());
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseApi("500", e.getMessage(), null);
		}
	}

}
