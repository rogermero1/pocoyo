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
import fin.coop15abril.servicios.comunes.utilerias.DateUtils;
import fin.coop15abril.servicios.integradores.creditos.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import serviciocreditos.externalservices.web.corebanking.denarius.IServiciosCreditos;
import serviciocreditos.externalservices.web.corebanking.denarius.ServiciosCreditos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCredito;
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

	public List<Credito> consultaCreditosPorIdentificacion(String identificacion) {

		MEIdentificacionCliente request = new MEIdentificacionCliente();
		MSConsultasCredito response;

		ObjectFactory ofCredito = new ObjectFactory();

		request.setCabecera(cabeceraServicioCliente());
		request.setIdentificacionCliente(ofCredito.createMEIdentificacionClienteIdentificacionCliente(identificacion));

		response = interfazCreditos.consultarCreditosCliente(request);

		List<Credito> lista = new ArrayList<>();
		for (TramiteCredito credito : response.getCreditos().getValue().getTramiteCredito()) {
			lista.add(new Credito(credito.getNumeroOperacion(), credito.getOperacionBanco().getValue(),
					credito.getCodEstado(), credito.getEstado().getValue(), credito.getEstadoOperacion().getValue(),
					credito.getCodigoOficial(), credito.getCodigoProducto().getValue(), credito.getTipo().getValue(),
					credito.getCodigoTipoCredito().getValue(), credito.getNumeroDividendo(), credito.getCuotasPagadas(),
					credito.getPlazo(), DateUtils.fechaToString(credito.getFechaConc()),
					DateUtils.fechaToString(credito.getFechaPago()), DateUtils.fechaToString(credito.getFechaVenc()),
					DateUtils.fechaToString(credito.getFechaVencimientoDividendo()), credito.isEnRenovacion(),
					credito.getDiaPago().intValue(), credito.getDiasMora(), credito.getDiasXDividendo(),
					credito.getMonto().doubleValue(), credito.getMontoEncaje().doubleValue(),
					credito.getInteres().doubleValue(), credito.getInteresXMora().doubleValue(),
					credito.getMontoVencido().doubleValue(), credito.getSaldoCapital().doubleValue(),
					credito.getSaldoOperacion().doubleValue(), credito.getTasaInteres().doubleValue(),
					credito.getTasaEfectiva().doubleValue(), credito.getValor().doubleValue(),
					credito.getValorCuota().doubleValue()));
		}

		return lista;

	}

}
