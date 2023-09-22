package fin.coop15abril.servicios.denarius.clientesrest;

import java.net.URI;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

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
import fin.coop15abril.servicios.denarius.configuracion.FeingConfig;

@FeignClient(name = "apisCuentas", url = "http", configuration = FeingConfig.class)
public interface ApisCuentas {

	@PostMapping(value = "/consulta-cuentas", consumes = { "application/json" }, produces = { "application/json" })
	public List<CuentaAhorro> consultaCuentasPorIdentificacion(URI url, DatosClienteME request) throws ExcepcionApp;

	@PostMapping(value = "/bloquear-cuentas", consumes = { "application/json" }, produces = { "application/json" })
	public  String bloquearCuentasCliente(URI url, DatosClienteME request) throws ExcepcionApp;
	
	@PostMapping(value = "/consulta-cuentas-por-numero-cuenta", consumes = { "application/json" }, produces = { "application/json" })
	public DatosConsultarCuentaMS consultarCuentaPorNumeroCta(URI url, DatosConsultarCuentaME request) throws ExcepcionApp;

	@PostMapping(value = "/consulta-saldo-atm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosConsultaSaldoAtmMS consultaSaldoAtm(URI url, DatosConsultaSaldoAtmME request) throws ExcepcionApp;
	
	@PostMapping(value = "/compensar-notaDebitoAtm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoAtmMS compensarNotaDebitoAtm(URI url, DatosReversoNdNcME request) throws ExcepcionApp;

	@PostMapping(value = "/generar-notaDebitoAtm", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoAtmMS generarNotaDebitoAtm(URI url, DatosNdNcAtmME request) throws ExcepcionApp;
	
	@PostMapping(value = "/compensar-notaDebito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoMS compensarNotaDebito(URI url, DatosReversoNdNcME request) throws ExcepcionApp;
	
	@PostMapping(value = "/generar-notaDebito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaDebitoMS generarNotaDebito(URI url, DatosNdNcME request) throws ExcepcionApp;

	@PostMapping(value = "/compensar-notaCredito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaCreditoMS compensarNotaCredito(URI url, DatosReversoNdNcME request) throws ExcepcionApp;

	@PostMapping(value = "/generar-notaCredito", consumes = { "application/json" }, produces = { "application/json" })
	public DatosNotaCreditoMS generarNotaCredito(URI url, DatosNdNcME request) throws ExcepcionApp;
}
