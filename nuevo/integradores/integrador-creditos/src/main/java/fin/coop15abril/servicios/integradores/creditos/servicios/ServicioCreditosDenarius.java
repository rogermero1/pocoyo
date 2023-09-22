package fin.coop15abril.servicios.integradores.creditos.servicios;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.Credito;
import fin.coop15abril.servicios.comunes.dtos.CuotaComun;
import fin.coop15abril.servicios.comunes.dtos.Operacion;
import fin.coop15abril.servicios.comunes.utilerias.DateUtils;
import fin.coop15abril.servicios.integradores.creditos.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import serviciocreditos.externalservices.web.corebanking.denarius.IServiciosCreditos;
import serviciocreditos.externalservices.web.corebanking.denarius.ServiciosCreditos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.Cuota;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METipoCartera;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.OperacionCartera;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.TramiteCredito;

@Service
@Slf4j
public class ServicioCreditosDenarius {

	private IServiciosCreditos interfazCreditos;

	@Autowired
	private ConfiguradorDenarius denariusConfig;

	@PostConstruct
	private void init() {
		try {
			log.info("Iniciando servicio Creditos: " + denariusConfig.getUrlServicioCreditos());
			this.interfazCreditos = (new ServiciosCreditos(new URL(denariusConfig.getUrlServicioCreditos())))
					.getWSHttpBindingIServiciosCreditos(new AddressingFeature(true, true));
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

	private JAXBElement<Cabecera> cabeceraServicioCliente() {
		ObjectFactory of = new ObjectFactory();
		Cabecera cabecera = new Cabecera();
		cabecera.setCanal(of.createCabeceraCanal("INT"));
		cabecera.setOficina(Integer.valueOf(denariusConfig.getOficina()));
		cabecera.setOrganizacion(of.createCabeceraOrganizacion(denariusConfig.getOrganizacion()));
		cabecera.setUsuario(of.createCabeceraUsuario(denariusConfig.getUsuario()));
		return of.createCabecera(cabecera);
	}

	public List<Credito> consultaCreditos(Integer tipoConsulta, String codigo, Boolean consultarPlanPagos,
			Boolean consultarDatosAdicionales) {

		METipoCartera request = new METipoCartera();
		MEIdentificacionCliente request2 = new MEIdentificacionCliente();

		MSCreditos response;
		MSConsultasCredito response2 = null;

		serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCredito = new serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCliente());
		// request.setIdentificacionCliente(ofCredito.createMEIdentificacionClienteIdentificacionCliente(identificacion));
		request.setCodigo(ofCredito.createMETipoCarteraCodigo(codigo));
		request.setTipoConsulta(tipoConsulta);

		response = interfazCreditos.consultarOperacion(request);

		if (Boolean.TRUE.equals(consultarDatosAdicionales)
				&& !response.getOperaciones().getValue().getOperacionCartera().isEmpty()) {
			ObjectFactory of2 = new ObjectFactory();
			request2.setCabecera(cabeceraServicioCliente());
			request2.setIdentificacionCliente(of2.createMEIdentificacionClienteIdentificacionCliente(response
					.getOperaciones().getValue().getOperacionCartera().get(0).getIdentificacionCliente().getValue()));
			response2 = interfazCreditos.consultarCreditosCliente(request2);
		}

		List<Credito> lista = new ArrayList<>();

		if (Boolean.FALSE.equals(response.isOk())) {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			return lista;
		}

		for (OperacionCartera credito : response.getOperaciones().getValue().getOperacionCartera()) {

			// solo operaciones activas
			if (credito.getEstadoOper().intValue() == 1) {

				TramiteCredito tramite = null;
				if (Boolean.TRUE.equals(consultarDatosAdicionales)) {
					tramite = response2.getCreditos().getValue().getTramiteCredito().stream()
							.filter(c -> c.getNumeroOperacion().toString()
									.equals(credito.getNumeroOperacionCartera().getValue().trim()))
							.findFirst().orElse(null);
				}

				lista.add(new Credito(credito.getIdOperacionCartera(), credito.getNumeroOperacionCartera().getValue(),
						credito.getNumeroDeTramite(), credito.getCodOficial(),
						Integer.valueOf(credito.getCodOficina().getValue()), Integer.valueOf(credito.getEstadoOper()),
						credito.getEstado().getValue(), credito.getCodigoTipoOp().getValue(),
						credito.getDesTipoOperacion().getValue(), credito.getCodigoTipoCredito().getValue(),
						credito.getTipoCredito().getValue(), credito.getIdTipoCredito().getValue(),
						credito.getCodigoSegmento().getValue(), credito.getDescripcionSegmento().getValue(),
						credito.getCodigoSector().getValue(), credito.getDesSector().getValue(),
						credito.getCodigoActividadEconomica().getValue(), credito.getActividadEconomica().getValue(),
						credito.getCodigoProvinciaDestino().getValue(),
						credito.getDescripcionProvinciaDestino().getValue(),
						credito.getCodigoCantonDestino().getValue(), credito.getDescripcionCantonDestino().getValue(),
						credito.getCodigoCiudadDestino().getValue(), credito.getDescripcionCiudadDestino().getValue(),
						credito.getCodigoParroquiaDestino().getValue(),
						credito.getDescripcionParroquiaDestino().getValue(), credito.getTipoCuota().getValue(),
						credito.getDescTipoCuota().getValue(), credito.getTipoPlazo().getValue(),
						credito.getDescTipoPlazo().getValue(), Integer.valueOf(credito.getPlazo()),
						credito.getNumeroCuotas(), Integer.valueOf(credito.getPeriodoCapital()),
						Integer.valueOf(credito.getPeriodoInteres()),
						DateUtils.fechaToString(credito.getFechaDeEmision().getValue()),
						DateUtils.fechaToString(credito.getFechaLiquidacion().getValue()),
						DateUtils.fechaToString(credito.getFechaDeVencimiento().getValue()),
						credito.getTasaInteres().doubleValue(), credito.getMontoAprobado().doubleValue(),
						credito.getMontoDesembolsado().doubleValue(), credito.getSaldoCapital().doubleValue(),
						credito.getValorCuota().doubleValue(), credito.getCuenta().getValue(),
						tramite == null ? null : tramite.isEnRenovacion(),
						tramite == null ? null : DateUtils.fechaToString(tramite.getFechaVencimientoDividendo()),
						tramite == null ? null : tramite.getDiaPago().intValue(),
						tramite == null ? null : tramite.getDiasMora(),
						tramite == null ? null : tramite.getDiasXDividendo(),
						tramite == null ? null : tramite.getMontoEncaje().doubleValue(),
						tramite == null ? null : tramite.getInteres().doubleValue(),
						tramite == null ? null : tramite.getInteresXMora().doubleValue(),
						tramite == null ? null : tramite.getMontoVencido().doubleValue(),
						tramite == null ? null : tramite.getSaldoOperacion().doubleValue()));
			}
		}

		return lista;

	}

	public List<CuotaComun> consultaCuotas(String codigo) {

		//METipoCartera request = new METipoCartera();
		MEConsultasCredito request = new MEConsultasCredito();
		MSCreditos response;

		serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCredito = new serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCliente());
		//request.setCodigo(ofCredito.createMETipoCarteraCodigo(codigo));
		request.setNumeroOperacion(ofCredito.createMEConsultasCreditoNumeroOperacion(codigo));

		response = interfazCreditos.consultarTablaAmortizacionCartera(request);

		List<CuotaComun> lista = new ArrayList<>();

		for (Cuota cuota : response.getTablaAmortizacion().getValue().getCuota()) {

			lista.add(new CuotaComun(cuota.getCapitalPagado().doubleValue(), cuota.getCapitalProyectado().doubleValue(),
					cuota.getCodEstado(), cuota.getEstado().getValue(), DateUtils.fechaToString(cuota.getFechaInicio()),
					DateUtils.fechaToString(cuota.getFechaVencimiento()), cuota.getIdCliente(), cuota.getIdCuota(),
					cuota.getIdOperacion(), cuota.getInteresPagado().doubleValue(),
					cuota.getInteresProyectado().doubleValue(), cuota.getMoraPagado().doubleValue(),
					cuota.getMoraProyectado().doubleValue(), cuota.getNumeroCuota(),
					cuota.getNumeroOperacion().getValue(), cuota.getOtrosPagado().doubleValue(),
					cuota.getOtrosProyectado().doubleValue(), cuota.getSaldoCapital().doubleValue(),
					cuota.getSeguroPagado().doubleValue(), cuota.getSeguroProyectado().doubleValue(),
					cuota.getTotalProyectado().doubleValue(), cuota.getValor().doubleValue()));

		}

		return lista;
	}
	
	public List<Operacion> consultaCreditosPorOperacion(Integer tipoconsulta, String codigo) {
		
		METipoCartera request = new METipoCartera();
		MSCreditos response;

		serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCredito = new serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();
		request.setCabecera(cabeceraServicioCliente());
		request.setCodigo(ofCredito.createMETipoCarteraCodigo(codigo));
		request.setTipoConsulta(tipoconsulta);
		response = interfazCreditos.consultarOperacion(request);
		List<Operacion> lista = new ArrayList<>();		
		for (OperacionCartera credito : response.getOperaciones().getValue().getOperacionCartera()) {			
			lista.add(new Operacion(credito.getActividadEconomica().getValue(),					
									credito.getCodOficial(), 
									credito.getCodOficina().getValue().intValue(), 
									credito.getCodigoActividadEconomica().getValue(),
									credito.getCodigoCantonDestino().getValue(), 
									credito.getDescripcionCiudadDestino().getValue(), 
									credito.getCodigoCliente(), 
									credito.getCodigoDesEspecifico().getValue(),
									credito.getCodigoMoneda().getValue(), 
									credito.getCodigoOficina().getValue(), 
									credito.getCodigoOrigenRecursos().getValue(), 
									credito.getCodigoParroquiaDestino().getValue(),
									credito.getCodigoProvinciaDestino().getValue(), 
									credito.getCodigoSector().getValue(), 
									credito.getCodigoSegmento().getValue(), 
									credito.getCodigoTipoCredito().getValue(),
									credito.getCodigoTipoOp().getValue(), 
									credito.getCuenta().getValue(), 
									credito.getDesMoneda().getValue(),
									credito.getDesSector().getValue(), 
									credito.getDesTipoOperacion().getValue(),
									credito.getDescFormaRecepcion().getValue(),
									credito.getDescTipoCuota().getValue(), 
									credito.getDescTipoPlazo().getValue(), 
									credito.getDescripcionCantonDestino().getValue(),
									credito.getDescripcionCiudadDestino().getValue(), 
									credito.getDescripcionDesEspecifico().getValue(), 
									credito.getDescripcionOficina().getValue(),
									credito.getDescripcionOrigenRecursos().getValue(), 
									credito.getDescripcionParroquiaDestino().getValue(), 
									credito.getDescripcionProvinciaDestino().getValue(),
									credito.getDescripcionSegmento().getValue(), 
									credito.isEnviadoCartera(), 
									credito.getEstado().getValue(), 
									credito.getEstadoOper().intValue(),
									credito.getEstadoSolicitud().getValue(),
									DateUtils.fechaToString(credito.getFechaDeEmision().getValue()),
									DateUtils.fechaToString(credito.getFechaDeVencimiento().getValue()),
									DateUtils.fechaToString(credito.getFechaLiquidacion().getValue()),
									credito.getIdOperacionCartera(), 
									credito.getIdTipoCredito().getValue(), 
									credito.getIdentificacionCliente().getValue(), 
									credito.getMontoAprobado().doubleValue(),
									credito.getMontoDesembolsado().doubleValue(), 
									credito.getNombreCliente().getValue(), 
									credito.getNombreOficial().getValue(), 
									credito.getNumeroCuotas(),
									credito.getNumeroDeTramite(), 
									credito.getNumeroOperacionCartera().getValue(), 
									credito.getPeriodoCapital().intValue(),
									credito.getPeriodoInteres().intValue(),
									credito.getPlazo().intValue(), 
									credito.getSaldoCapital().doubleValue(), 
									credito.getSegmento().getValue(), 
									credito.getTasaInteres().doubleValue(), 
									credito.getTipoCredito().getValue(),
									credito.getTipoCuota().getValue(), 
									credito.getTipoPlazo().getValue(), 
									credito.getValorCuota().doubleValue()));
		}
		return lista;
	}
}
