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

import fin.coop15abril.servicios.denarius.servicios.IntegradorDenariusCuentas;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/cuentas")
@Slf4j
public class ControladorCuentas {
	@Autowired
	private IntegradorDenariusCuentas denarius;

	@Operation(summary = "Api", description = "Consulta genérica para servicios Cuentas Denarius")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/api", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseApi api(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = RequestApi.class)) @Valid @RequestBody RequestApi request) {
		try {
			log.info("Procesando solicitud para método: " + request.getNombreMetodo());
			switch (request.getNombreMetodo()) {
			case "bloquearCuentas":
				return new ResponseApi("200", "OK", denarius.bloquearCuentasCliente(request.getDataJson()));
			case "consultarCuenta":
				return new ResponseApi("200", "OK", denarius.consultarCuentaPorNumeroCta(request.getDataJson()));
			//break;
			case "consultaSaldoAtm":
				return new ResponseApi("200", "OK", denarius.consultaSaldoAtm(request.getDataJson()));
			//break;
			case "compensarNotaDebitoAtm":
				return new ResponseApi("200", "OK", denarius.compensarNotaDebitoAtm(request.getDataJson()));
			//break;
			case "generarNotaDebitoAtm":
				return new ResponseApi("200", "OK", denarius.generarNotaDebitoAtm(request.getDataJson()));
			//break;
			case "compensarNotaDebito":
				return new ResponseApi("200", "OK", denarius.compensarNotaDebito(request.getDataJson()));
			//break;
			case "generarNotaDebito":
				return new ResponseApi("200", "OK", denarius.generarNotaDebito(request.getDataJson()));
			//break;
			case "compensarNotaCredito":
				return new ResponseApi("200", "OK", denarius.compensarNotaCredito(request.getDataJson()));
			//break;
			case "generarNotaCredito":
				return new ResponseApi("200", "OK", denarius.generarNotaCredito(request.getDataJson()));
			//break;
			default:
				return new ResponseApi("400", "Metodo inválido", "");
			}
		} catch (ExcepcionApp e) {
			log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
			return new ResponseApi(e.getCodigo(), e.getMensajeUsuario(), e.getMensajeTecnico());
		} catch (Exception e) {
			log.error(e.getMessage());
			return new ResponseApi("500", e.getMessage(), null);
		}
	}
}
