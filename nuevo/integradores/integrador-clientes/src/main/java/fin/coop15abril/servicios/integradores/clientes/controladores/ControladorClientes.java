package fin.coop15abril.servicios.integradores.clientes.controladores;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteCondicionME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.integradores.clientes.servicios.ServicioClientesDenarius;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path = "/api")
@Slf4j
public class ControladorClientes {

	@Autowired
	private ServicioClientesDenarius servicioClientes;

	@GetMapping(value = "")
	public String estado() {
		return "OK";
	}

	@Operation(summary = "Consulta Cliente", description = "Consulta cliente por Identificacion")
	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Solicitud Aceptada"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Error 409"),
			@ApiResponse(responseCode = "500", description = "internal server error") })
	@PostMapping(value = "/consulta-cliente", consumes = { "application/json" }, produces = { "application/json" })
	public DatosClienteMS consultaClientePorIdentificacion(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosClienteME.class)) @Valid @RequestBody DatosClienteME request)
			throws Exception {
		try {

			log.info("Procesando consulta de clientes para: " + request.getIdentificacion());

			return servicioClientes.consultarClientePorIdentificacion(request.getIdentificacion(),
					request.getConsultarDatosAdicionales());

		} catch (ExcepcionApp e) {
			log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
			throw e;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}
	}
	
	@PostMapping(value = "/consulta-cliente-condicion", consumes = { "application/json" }, produces = { "application/json" })
	public List<DatosClienteMS> consultaClienteCondicion(
			@Parameter(description = "RequestApi", required = true, schema = @Schema(implementation = DatosClienteCondicionME.class)) @Valid @RequestBody DatosClienteCondicionME request) 
			throws Exception {
		try {

			log.info("Procesando consulta de clientes para: " + "TipoConsulta: " + request.getTipoConsulta() + "ApellidoMaterno: " + request.getApellidoMaterno() + "ApellidoPaterno: " + request.getApellidoPaterno() + "Nombres: " + request.getNombres() + "Identificacion: " + request.getIdentificacion() + "IdCliente" + request.getIdCliente());
			return servicioClientes.consultarClienteCondicion(request.getTipoConsulta(),
															  request.getApellidoMaterno(),
															  request.getApellidoPaterno(),
															  request.getNombres(),
															  request.getIdentificacion(),
															  request.getIdCliente());
		} catch (ExcepcionApp e) {
			log.error(e.getCodigo() + " " + e.getMensajeUsuario() + " " + e.getMensajeTecnico());
			throw e;
			//return Collections.emptyList();
		} catch (Exception e) {
			log.error(e.getMessage());
			throw e;
		}

	}

}
