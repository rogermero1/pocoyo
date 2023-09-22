package fin.coop15abril.servicios.integradores.cuentas.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.dtos.CuentaAhorro;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosReversoNdNcME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultaSaldoAtmME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultaSaldoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarCuentaME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarCuentaMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNdNcAtmME;
import fin.coop15abril.servicios.comunes.dtos.DatosNdNcME;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaCreditoMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
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

	@Operation(summary = "Bloquear Cuentas", description = "Bloquear cuentas de cliente por Identificacion")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/bloquear-cuentas", consumes = { "application/json" }, produces = { "application/json" })
	public String bloquearCuentasCliente(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosClienteME.class)) @Valid @RequestBody DatosClienteME request)
			throws Exception {
		try {
			log.info("Procesando Bloqueo de cuentas para: " + request.getIdentificacion());

			return servicioCuentas.bloquearCuentasCliente(request.getIdentificacion());
		} catch (ExcepcionApp e) {
			log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
	}
	
	@Operation(summary = "Consultar Cuenta Por NumeroCta", description = "Consulta cuentas por numero de cuenta")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-cuentas-por-numero-cuenta", consumes = { "application/json" }, produces = { "application/json" })
	public DatosConsultarCuentaMS consultarCuentaPorNumeroCta(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosConsultarCuentaME.class)) @Valid @RequestBody DatosConsultarCuentaME request)
			throws Exception {
		try {

			log.info("Procesando consulta por número de cuenta para: " + request.getNumeroCuenta());
			return servicioCuentas.consultarCuentaPorNumeroCta(request.getNumeroCuenta());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}	

	@Operation(summary = "Consultar Saldo ATM", description = "Consulta Saldo ATM para servicio del Cajero")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-saldo-atm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosConsultaSaldoAtmMS consultaSaldoAtm(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosConsultaSaldoAtmME.class)) @Valid @RequestBody DatosConsultaSaldoAtmME request)
			throws Exception {
		try {

			log.info("Procesando consulta de saldo atm para: " + request.getNumeroCuenta());
			return servicioCuentas.consultaSaldoAtm(request.getNumeroCuenta(), request.getCausal(), request.getReferencia2());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}		

	@Operation(summary = "Compensar nota debito ATM", description = "Aplica para el reverso de las transaccionenes del cajero")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/compensar-notaDebitoAtm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoAtmMS compensarNotaDebitoAtm(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosReversoNdNcME.class)) @Valid @RequestBody DatosReversoNdNcME request)
			throws Exception {
		try {

			log.info("Procesando compensar notaDebitoAtm para: " + request.getNumeroCuenta());
			return servicioCuentas.compensarNotaDebitoAtm(request.getCausalReverso(), request.getIdMoneda(), request.getMonto(), request.getNumeroCuenta(), request.getReferencia(), request.getReferencia2(), request.getCausalReversoConsulta());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Generar nota de debito ATM", description = "Genera Notas de debito originadas desde el cajero")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/generar-notaDebitoAtm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoAtmMS generarNotaDebitoAtm(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosNdNcAtmME.class)) @Valid @RequestBody DatosNdNcAtmME request)
			throws Exception {
		try {

			log.info("Procesando generar notaDebitoAtm para: " + request.getNumeroCuenta());
			return servicioCuentas.generarNotaDebitoAtm(request.getNumeroCuenta(), request.getCausal(), request.getCausalConsulta(), request.getIdMoneda(), request.getMonto(), request.getReferencia(), request.getReferencia2());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Compensar nota debito", description = "Aplica para el reverso de las transaccionenes de debito")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/compensar-notaDebito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoMS compensarNotaDebito(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosReversoNdNcME.class)) @Valid @RequestBody DatosReversoNdNcME request)
			throws Exception {
		try {

			log.info("Procesando compensar notaDebito para: " + request.getNumeroCuenta());
			return servicioCuentas.compensarNotaDebito(request.getCausalReverso(), request.getIdMoneda(), request.getMonto(), request.getNumeroCuenta(), request.getReferencia(), request.getReferencia2(), request.getIdCausalRetencion());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Generar nota de debito", description = "Genera una nota de debito a una cuenta")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/generar-notaDebito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoMS generarNotaDebito(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosNdNcME.class)) @Valid @RequestBody DatosNdNcME request)
			throws Exception {
		try {

			log.info("Procesando generar notaDebito para: " + request.getNumeroCuenta());
			return servicioCuentas.generarNotaDebito(request.getNumeroCuenta(), request.getCausal(), request.getIdMoneda(), request.getMonto(), request.getReferencia(), request.getReferencia2(), request.getIdCausalRetencion());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Compensar nota credito", description = "Aplica para el reverso de las transaccionenes de credito")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/compensar-NotaCredito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaCreditoMS compensarNotaCredito(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosReversoNdNcME.class)) @Valid @RequestBody DatosReversoNdNcME request)
			throws Exception {
		try {

			log.info("Procesando compensar notaCredito para: " + request.getNumeroCuenta());
			return servicioCuentas.compensarNotaCredito(request.getCausalReverso(), request.getIdMoneda(), request.getMonto(), request.getNumeroCuenta(), request.getReferencia());

// HABILITAR EN CASO DE USAR LA EXCEPCION PERSONALIZADA
//			} catch (ExcepcionApp e) {
//				log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
//				throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}
	
	@Operation(summary = "Generar nota de credito", description = "Genera una nota de credito a una cuenta")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/generar-notaCredito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaCreditoMS generarNotaCredito(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosNdNcME.class)) @Valid @RequestBody DatosNdNcME request)
			throws Exception {
		try {

			log.info("Procesando generar notaCredito para: " + request.getNumeroCuenta());
			return servicioCuentas.generarNotaCredito(request.getNumeroCuenta(), request.getCausal(), request.getIdMoneda(), request.getMonto(), request.getReferencia(), request.getReferencia2());

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
