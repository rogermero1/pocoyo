package fin.coop15abril.servicios.integradores.creditos.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.dtos.Credito;
import fin.coop15abril.servicios.comunes.dtos.CuotaComun;
import fin.coop15abril.servicios.comunes.dtos.DatosCarteraME;
import fin.coop15abril.servicios.comunes.dtos.DatosCreditoME;
import fin.coop15abril.servicios.comunes.dtos.DatosOperacionME;
import fin.coop15abril.servicios.comunes.dtos.Operacion;
import fin.coop15abril.servicios.integradores.creditos.servicios.ServicioCreditosDenarius;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api")
@Slf4j
public class ControladorCreditos {

	@Autowired
	private ServicioCreditosDenarius servicioCreditos;

	@GetMapping(value = "")
	public String estado() {
		return "OK";
	}

	@Operation(summary = "Consulta Creditos", description = "Consulta creditos por Identificacion")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-creditos", consumes = { "application/json" }, produces = { "application/json" })
	public List<Credito> consultaCreditos(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosCreditoME.class)) @Valid @RequestBody DatosCreditoME request)
			throws Exception {

		try {
			log.info("Procesando consulta de creditos para operacion: " + request.getNumeroOperacion() + " idCliente: "
					+ request.getIdCliente());

			// 2 consulta x operacion, 0 consulta x idCliente
			return servicioCreditos.consultaCreditos(request.getIdCliente() == null ? 2 : 0,
					request.getIdCliente() == null ? request.getNumeroOperacion() : request.getIdCliente(),
					request.getConsultarPlanPagos(), request.getConsultarDatosAdicionales());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//		} catch (ExcepcionApp e) {
//			log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw e;
		}
	}

	@Operation(summary = "Consulta Tabla Amortizacion Cartera", description = "Consulta de Tabla Amortizacion Cartera")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-tabla", consumes = { "application/json" }, produces = { "application/json" })
	public List<CuotaComun> consultaTablaAmortizacionCartera(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosCarteraME.class)) @Valid @RequestBody DatosCarteraME request)
			throws Exception {
		try {
			log.info("Procesando consulta de tabla de amortizacion - Cuotas para: " + request.getCodigo());
			return servicioCreditos.consultaCuotas(request.getCodigo());
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Consulta Operaciones", description = "Consulta de Operaciones")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-operaciones", consumes = { "application/json" }, produces = { "application/json" })
	public List<Operacion> consultaCreditosPorOperacion(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosOperacionME.class)) @Valid @RequestBody DatosOperacionME request)
			throws Exception {
		log.info("4");
		try {
			log.info("Procesando consulta de Operaciones para: " + request.getCodigo());			
			return servicioCreditos.consultaCreditosPorOperacion(request.getTipoConsulta(), request.getCodigo());			
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
	}

}
