package fin.coop15abril.servicios.integradores.cuentas.servicios;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.CuentaAhorro;
import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultaSaldoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarCuentaMS;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarUltimosMovimientosMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaCreditoMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.DateUtils;
import fin.coop15abril.servicios.integradores.cuentas.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import serviciocuentas.externalservices.web.corebanking.denarius.IServiciosCuentas;
import serviciocuentas.externalservices.web.corebanking.denarius.ServiciosCuentas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.CuentaLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaSaldoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasMovimientos;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MENdNc;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MENdNcAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReversoNdNc;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaSaldoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCtaAhorros;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasMovimientosCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaCredito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaDebitoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.NotaDebitoCredito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.NotaDebitoCreditoAtm;

@Service
@Slf4j
public class ServicioCuentasDenarius {

	private static final String ERROR_CONSULTA = "Error al procesar consulta";

	private IServiciosCuentas interfazCuentas;

	@Autowired
	private ConfiguradorDenarius denariusConfig;

	@PostConstruct
	private void init() {
		try {
			log.info("Iniciando servicio Cuentas: " + denariusConfig.getUrlServicioCuentas());
			interfazCuentas = (new ServiciosCuentas(new URL(denariusConfig.getUrlServicioCuentas())))
					.getWSHttpBindingIServiciosCuentas(new AddressingFeature(true, true));
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

	private JAXBElement<Cabecera> cabeceraServicioCuenta() {
		ObjectFactory of = new ObjectFactory();
		Cabecera cabecera = new Cabecera();
		cabecera.setCanal(of.createCabeceraCanal("INT"));
		cabecera.setOficina(Integer.valueOf(denariusConfig.getOficina()));
		cabecera.setOrganizacion(of.createCabeceraOrganizacion(denariusConfig.getOrganizacion()));
		cabecera.setUsuario(of.createCabeceraUsuario(denariusConfig.getUsuario()));
		return of.createCabecera(cabecera);
	}

	public List<CuentaAhorro> consultaCuentasPorIdentificacion(String identificacion) {
		MEIdentificacionCliente request = new MEIdentificacionCliente();
		MSConsultasCtaAhorros response;

		ObjectFactory ofCuenta = new ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		request.setIdentificacionCliente(ofCuenta.createMEIdentificacionClienteIdentificacionCliente(identificacion));

		// llamado a ws denarius
		response = interfazCuentas.consultarCuentaAhorros(request);

		List<CuentaAhorro> lista = new ArrayList<>();

		if (Boolean.FALSE.equals(response.isOk())) {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			return lista;
		}

		for (CuentaLibreta cuenta : response.getCuentas().getValue().getCuentaLibreta()) {
			lista.add(new CuentaAhorro(cuenta.getIdCuenta(), cuenta.getIdCliente().getValue(),
					cuenta.getIdClientePrincipal().getValue(), Integer.valueOf(cuenta.getIdSucursal().getValue()),
					cuenta.getDescripcionSucursal().getValue(), cuenta.getTipoCuenta().getValue(),
					cuenta.getNumero().getValue(), cuenta.getNombre().getValue(), cuenta.getNombreOficial().getValue(),
					cuenta.getCodigoSubproducto().getValue(), cuenta.getDescripcionSubProducto().getValue(),
					cuenta.getNombreProducto().getValue(), cuenta.getNombreMoneda().getValue(),
					cuenta.getEstado().getValue(), cuenta.getNombreEstadoCuenta().getValue(),
					cuenta.getFechaApertura().getValue(), cuenta.getBloqueo().getValue(),
					cuenta.getBloqueada().getValue(), cuenta.getTipoBloqueo().getValue(),
					cuenta.getDescripcionTipoBloqueo().getValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoAGirar().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoContable().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoDisponible().doubleValue(),
					cuenta.getMontoBloqueado().doubleValue(), cuenta.getPorEfectivizar().doubleValue(),
					cuenta.getPorEfectivizarHoy().doubleValue(), cuenta.getValorRetenido().doubleValue(),
					cuenta.getValoresSuspenso().doubleValue(), cuenta.getTextoManejaLibreta().getValue(),
					cuenta.getTipoAhorroProgramado().getValue(), cuenta.isPermiteRetiros(), cuenta.isEsRestringida(),
					cuenta.getPrincipal().getValue(), cuenta.isVinculada(), cuenta.isVisibilidad()));
		}

		return lista;

	}

	public String bloquearCuentasCliente(String identificacion) throws Exception {
		MEIdentificacionCliente request = new MEIdentificacionCliente();
		MensajeSalidaBase response;

		ObjectFactory ofCuenta = new ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		request.setIdentificacionCliente(ofCuenta.createMEIdentificacionClienteIdentificacionCliente(identificacion));

		// llamado a ws denarius
		response = interfazCuentas.bloquearCuentasCliente(request);
		if (Boolean.TRUE.equals(response.isOk())) {
			return "OK";
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), "Error al bloquear cuenta",
					response.getMensajeError().getValue());
			// return response.getMensajeError().getValue();
		}
	}

	public DatosConsultarCuentaMS consultarCuentaPorNumeroCta(String numeroCuenta) throws Exception {

		MEConsultasCuenta request = new MEConsultasCuenta();
		MSConsultasCtaAhorros response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		request.setNumeroCuenta(ofCliente.createMEConsultasCuentaNumeroCuenta(numeroCuenta));

		// llamado a ws denarius
		response = interfazCuentas.consultarCuenta(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosConsultarCuentaMS datosConsultarCuentaMS = new DatosConsultarCuentaMS();
			CuentaLibreta cuenta = response.getCuenta().getValue();
			datosConsultarCuentaMS.setCuentaAhorro(new CuentaAhorro(cuenta.getIdCuenta(),
					cuenta.getIdCliente().getValue(), cuenta.getIdClientePrincipal().getValue(),
					Integer.valueOf(cuenta.getIdSucursal().getValue()), cuenta.getDescripcionSucursal().getValue(),
					cuenta.getTipoCuenta().getValue(), cuenta.getNumero().getValue(), cuenta.getNombre().getValue(),
					cuenta.getNombreOficial().getValue(), cuenta.getCodigoSubproducto().getValue(),
					cuenta.getDescripcionSubProducto().getValue(), cuenta.getNombreProducto().getValue(),
					cuenta.getNombreMoneda().getValue(), cuenta.getEstado().getValue(),
					cuenta.getNombreEstadoCuenta().getValue(), cuenta.getFechaApertura().getValue(),
					cuenta.getBloqueo().getValue(), cuenta.getBloqueada().getValue(),
					cuenta.getTipoBloqueo().getValue(), cuenta.getDescripcionTipoBloqueo().getValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoAGirar().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoContable().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoDisponible().doubleValue(),
					cuenta.getMontoBloqueado().doubleValue(), cuenta.getPorEfectivizar().doubleValue(),
					cuenta.getPorEfectivizarHoy().doubleValue(), cuenta.getValorRetenido().doubleValue(),
					cuenta.getValoresSuspenso().doubleValue(), cuenta.getTextoManejaLibreta().getValue(),
					cuenta.getTipoAhorroProgramado().getValue(), cuenta.isPermiteRetiros(), cuenta.isEsRestringida(),
					cuenta.getPrincipal().getValue(), cuenta.isVinculada(), cuenta.isVisibilidad()));
			datosConsultarCuentaMS
					.setIdentificacionCliente(response.getCuenta().getValue().getIdentificacionCliente().getValue());

			return datosConsultarCuentaMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}
//MIOOOOO
		
	public DatosConsultaSaldoAtmMS consultaSaldoAtm(String numeroCuenta, Short causal, String referencia2)
			throws Exception {

		MEConsultaSaldoAtm request = new MEConsultaSaldoAtm();
		MSConsultaSaldoAtm response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		request.setNumeroCuenta(ofCliente.createMEConsultaSaldoAtmNumeroCuenta(numeroCuenta));
		request.setCausal(causal);
		request.setReferencia2(ofCliente.createMEConsultaSaldoAtmReferencia2(referencia2));

		// llamado a ws denarius
		response = interfazCuentas.consultarSaldoCuentaAtm(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosConsultaSaldoAtmMS datosConsultaSaldoAtmMS = new DatosConsultaSaldoAtmMS();
			datosConsultaSaldoAtmMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosConsultaSaldoAtmMS.setIdOficina(response.getIdOficina());
			datosConsultaSaldoAtmMS.setOficina(response.getOficina().getValue());
			datosConsultaSaldoAtmMS.setSignoSaldoDisponible(response.getSignoSaldoDisponible().toString());
			datosConsultaSaldoAtmMS.setSaldoDisponible(response.getSaldoDisponible().doubleValue());
			datosConsultaSaldoAtmMS.setComision(response.getComision().doubleValue());
			datosConsultaSaldoAtmMS.setSaldoContable(response.getSaldoContable().doubleValue());
			datosConsultaSaldoAtmMS.setSaldoAGirar(response.getSaldoAGirar().doubleValue());
			datosConsultaSaldoAtmMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			return datosConsultaSaldoAtmMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaDebitoAtmMS compensarNotaDebitoAtm(Short causalReverso, Integer idMoneda, Double monto,
			String numeroCuenta, String referencia, String referencia2, Short causalReversoConsulta) throws Exception {

		MEReversoNdNc request = new MEReversoNdNc();
		MSNotaDebitoAtm response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());

		request.setCausalReverso(ofCliente.createMEReversoNdNcIdCausalRetencion(causalReverso).getValue());
		request.setIdMoneda(idMoneda);
		request.setMonto(BigDecimal.valueOf(monto));
		request.setNumeroCuenta(ofCliente.createMEReversoNdNcNumeroCuenta(numeroCuenta));
		request.setReferencia(ofCliente.createMEReversoNdNcReferencia(referencia));
		request.setReferencia2(ofCliente.createMEReversoNdNcReferencia2(referencia2));
		request.setCausalReversoConsulta(
				ofCliente.createMEReversoNdNcIdCausalRetencion(causalReversoConsulta).getValue());

		// llamado a ws denarius
		response = interfazCuentas.compensarNotaDebitoAtm(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaDebitoAtmMS datosNotaDebitoAtmMS = new DatosNotaDebitoAtmMS();
			datosNotaDebitoAtmMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaDebitoAtmMS.setComisionDebito(response.getComisionDebito().doubleValue());
			datosNotaDebitoAtmMS.setNumeroTransaccionConsulta(response.getNumeroTransaccionConsulta().getValue());
			datosNotaDebitoAtmMS.setComisionConsulta(response.getComisionConsulta().doubleValue());
			datosNotaDebitoAtmMS.setIdOficina(response.getIdOficina());
			datosNotaDebitoAtmMS.setOficina(response.getOficina().getValue());
			datosNotaDebitoAtmMS.setSaldoDisponible(response.getSaldoDisponible().doubleValue());
			datosNotaDebitoAtmMS.setSaldoContable(response.getSaldoContable().doubleValue());
			datosNotaDebitoAtmMS.setSaldoAGirar(response.getSaldoAGirar().doubleValue());
			datosNotaDebitoAtmMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			return datosNotaDebitoAtmMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaDebitoAtmMS generarNotaDebitoAtm(String numeroCuenta, Short causal, Short causalConsulta,
			Integer idMoneda, Double monto, String referencia, String referencia2) throws Exception {

		MENdNcAtm request = new MENdNcAtm();
		NotaDebitoCreditoAtm notaDebitoCreditoAtm = new NotaDebitoCreditoAtm();
		MSNotaDebitoAtm response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		notaDebitoCreditoAtm.setCausal(causal);
		notaDebitoCreditoAtm.setCausalConsulta(causalConsulta);
		notaDebitoCreditoAtm.setIdMoneda(idMoneda);
		notaDebitoCreditoAtm.setMonto(BigDecimal.valueOf(monto));
		notaDebitoCreditoAtm.setNumeroCuenta(ofCliente.createMENotaDCNumeroCuenta(numeroCuenta));
		notaDebitoCreditoAtm.setReferencia(ofCliente.createMENotaDCReferencia(referencia));
		notaDebitoCreditoAtm.setReferencia2(ofCliente.createMENotaDCReferencia2(referencia2));
		request.setNdNc(ofCliente.createMENdNcAtmNdNc(notaDebitoCreditoAtm));

		// llamado a ws denarius
		response = interfazCuentas.generarNotaDebitoAtm(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaDebitoAtmMS datosNotaDebitoAtmMS = new DatosNotaDebitoAtmMS();
			datosNotaDebitoAtmMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaDebitoAtmMS.setComisionDebito(response.getComisionDebito().doubleValue());
			datosNotaDebitoAtmMS.setNumeroTransaccionConsulta(response.getNumeroTransaccionConsulta().getValue());
			datosNotaDebitoAtmMS.setComisionConsulta(response.getComisionConsulta().doubleValue());
			datosNotaDebitoAtmMS.setIdOficina(response.getIdOficina());
			datosNotaDebitoAtmMS.setOficina(response.getOficina().getValue());
			datosNotaDebitoAtmMS.setSaldoDisponible(response.getSaldoDisponible().doubleValue());
			datosNotaDebitoAtmMS.setSaldoContable(response.getSaldoContable().doubleValue());
			datosNotaDebitoAtmMS.setSaldoAGirar(response.getSaldoAGirar().doubleValue());
			datosNotaDebitoAtmMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			return datosNotaDebitoAtmMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaDebitoMS compensarNotaDebito(Short causalReverso, Integer idMoneda, Double monto,
			String numeroCuenta, String referencia, String referencia2, Short idCausalRetencion) throws Exception {

		MEReversoNdNc request = new MEReversoNdNc();
		MSNotaDebito response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());

		request.setCausalReverso(ofCliente.createMEReversoNdNcIdCausalRetencion(causalReverso).getValue());
		request.setIdMoneda(idMoneda);
		request.setMonto(BigDecimal.valueOf(monto));
		request.setNumeroCuenta(ofCliente.createMEReversoNdNcNumeroCuenta(numeroCuenta));
		request.setReferencia(ofCliente.createMEReversoNdNcReferencia(referencia));
		request.setReferencia2(ofCliente.createMEReversoNdNcReferencia2(referencia2));
		request.setIdCausalRetencion(ofCliente.createMEReversoNdNcIdCausalRetencion(idCausalRetencion));

		// llamado a ws denarius
		response = interfazCuentas.compensarNotaDebito(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaDebitoMS datosNotaDebitoMS = new DatosNotaDebitoMS();
			datosNotaDebitoMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaDebitoMS.setIdOficina(response.getResultado().getValue().getIdOficina());
			datosNotaDebitoMS.setOficina(response.getResultado().getValue().getOficina().getValue());
			datosNotaDebitoMS.setSaldoDisponible(response.getResultado().getValue().getSaldoDisponible().doubleValue());
			datosNotaDebitoMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			return datosNotaDebitoMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaDebitoMS generarNotaDebito(String numeroCuenta, Short causal, Integer idMoneda, Double monto,
			String referencia, String referencia2, Short idCausalRetencion) throws Exception {

		MENdNc request = new MENdNc();
		NotaDebitoCredito notaDebitoCredito = new NotaDebitoCredito();
		MSNotaDebito response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		notaDebitoCredito.setCausal(causal);
		notaDebitoCredito.setIdMoneda(idMoneda);
		notaDebitoCredito.setMonto(BigDecimal.valueOf(monto));
		notaDebitoCredito.setNumeroCuenta(ofCliente.createMENotaDCNumeroCuenta(numeroCuenta));
		notaDebitoCredito.setReferencia(ofCliente.createMENotaDCReferencia(referencia));
		notaDebitoCredito.setReferencia2(ofCliente.createMENotaDCReferencia2(referencia2));
		notaDebitoCredito.setIdCausalRetencion(ofCliente.createNotaDebitoCreditoIdCausalRetencion(idCausalRetencion));
		request.setNdNc(ofCliente.createMENdNcNdNc(notaDebitoCredito));

		// llamado a ws denarius
		response = interfazCuentas.generarNotaDebito(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaDebitoMS datosNotaDebitoMS = new DatosNotaDebitoMS();
			datosNotaDebitoMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaDebitoMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			datosNotaDebitoMS.setIdOficina(response.getResultado().getValue().getIdOficina());
			datosNotaDebitoMS.setOficina(response.getResultado().getValue().getOficina().getValue());
			datosNotaDebitoMS
					.setSignoSaldoDisponible(response.getResultado().getValue().getSignoSaldoDisponible().toString());
			datosNotaDebitoMS.setSaldoDisponible(response.getResultado().getValue().getSaldoDisponible().doubleValue());
			datosNotaDebitoMS.setComision(response.getResultado().getValue().getComision().doubleValue());
			datosNotaDebitoMS.setDatosCuenta(new CuentaAhorro(null, null, null, null, null, null, null, null, null,
					null, response.getDatosCuenta().getValue().getDescripcionSubProducto().getValue(), null, null, null,
					null, DateUtils.fechaToString(response.getDatosCuenta().getValue().getFechaApertura()), null, null,
					null, null, response.getDatosCuenta().getValue().getSaldoAGirar().doubleValue(),
					response.getDatosCuenta().getValue().getSaldoContable().doubleValue(),
					response.getDatosCuenta().getValue().getSaldoDisponible().doubleValue(), null, null, null, null,
					null, null, null, null, null, null, null, null));
			return datosNotaDebitoMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaCreditoMS compensarNotaCredito(Short causalReverso, Integer idMoneda, Double monto,
			String numeroCuenta, String referencia) throws Exception {

		MEReversoNdNc request = new MEReversoNdNc();
		MSNotaCredito response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());

		request.setCausalReverso(ofCliente.createMEReversoNdNcIdCausalRetencion(causalReverso).getValue());
		request.setIdMoneda(idMoneda);
		request.setMonto(BigDecimal.valueOf(monto));
		request.setNumeroCuenta(ofCliente.createMEReversoNdNcNumeroCuenta(numeroCuenta));
		request.setReferencia(ofCliente.createMEReversoNdNcReferencia(referencia));

		// llamado a ws denarius
		response = interfazCuentas.compensarNotaCredito(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaCreditoMS datosNotaCreditoMS = new DatosNotaCreditoMS();
			datosNotaCreditoMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaCreditoMS.setIdOficina(response.getResultado().getValue().getIdOficina());
			datosNotaCreditoMS.setOficina(response.getResultado().getValue().getOficina().getValue());
			datosNotaCreditoMS
					.setSaldoDisponible(response.getResultado().getValue().getSaldoDisponible().doubleValue());
			datosNotaCreditoMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			return datosNotaCreditoMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

	public DatosNotaCreditoMS generarNotaCredito(String numeroCuenta, Short causal, Integer idMoneda, Double monto,
			String referencia, String referencia2) throws Exception {

		MENdNc request = new MENdNc();
		NotaDebitoCredito notaDebitoCredito = new NotaDebitoCredito();
		MSNotaCredito response;

		serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCuenta());
		notaDebitoCredito.setCausal(causal);
		notaDebitoCredito.setIdMoneda(idMoneda);
		notaDebitoCredito.setMonto(BigDecimal.valueOf(monto));
		notaDebitoCredito.setNumeroCuenta(ofCliente.createMENotaDCNumeroCuenta(numeroCuenta));
		notaDebitoCredito.setReferencia(ofCliente.createMENotaDCReferencia(referencia));
		notaDebitoCredito.setReferencia2(ofCliente.createMENotaDCReferencia2(referencia2));
		request.setNdNc(ofCliente.createMENdNcNdNc(notaDebitoCredito));

		// llamado a ws denarius
		response = interfazCuentas.generarNotaCredito(request);
		if (Boolean.TRUE.equals(response.isOk())) {
			DatosNotaCreditoMS datosNotaCreditoMS = new DatosNotaCreditoMS();
			datosNotaCreditoMS.setNumeroTransaccion(response.getNumeroTransaccion().getValue());
			datosNotaCreditoMS.setFechaProceso(DateUtils.fechaToString(response.getFechaProceso()));
			datosNotaCreditoMS.setGenerarFormularioOrigenFondos(response.isGenerarFormularioOrigenFondos());
			datosNotaCreditoMS.setMontoAcumulado(response.getMontoAcumulado().doubleValue());
			datosNotaCreditoMS.setIdOficina(response.getResultado().getValue().getIdOficina());
			datosNotaCreditoMS.setOficina(response.getResultado().getValue().getOficina().getValue());
			datosNotaCreditoMS
					.setSignoSaldoDisponible(response.getResultado().getValue().getSignoSaldoDisponible().toString());
			datosNotaCreditoMS
					.setSaldoDisponible(response.getResultado().getValue().getSaldoDisponible().doubleValue());
			datosNotaCreditoMS.setDatosCuenta(new CuentaAhorro(null, null, null, null, null, null, null, null, null,
					null, response.getDatosCuenta().getValue().getDescripcionSubProducto().getValue(), null, null, null,
					null, DateUtils.fechaToString(response.getDatosCuenta().getValue().getFechaApertura()), null, null,
					null, null, response.getDatosCuenta().getValue().getSaldoAGirar().doubleValue(),
					response.getDatosCuenta().getValue().getSaldoContable().doubleValue(),
					response.getDatosCuenta().getValue().getSaldoDisponible().doubleValue(), null, null, null, null,
					null, null, null, null, null, null, null, null));
			datosNotaCreditoMS.setDatosCliente(new DatosClienteMS(response.getDatosCliente().getValue().getIdCliente(),
					response.getDatosCliente().getValue().getTipoIdentificacion().getValue(),
					response.getDatosCliente().getValue().getIdentificacion().getValue(), null, null,
					response.getDatosCliente().getValue().getNombres().getValue(), null, null, null, null, null, null,
					null, response.getDatosCliente().getValue().getTelefono().getValue(),
					response.getDatosCliente().getValue().getEmail().getValue(), null, null, null, null, null, null,
					response.getDatosCliente().getValue().getCiudad().getValue(),
					response.getDatosCliente().getValue().getDireccion().getValue(), null, null, null, null, null, null,
					null, null, null, null, null, null, null, null));
			return datosNotaCreditoMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), ERROR_CONSULTA,
					response.getMensajeError().getValue());
		}
	}

}
