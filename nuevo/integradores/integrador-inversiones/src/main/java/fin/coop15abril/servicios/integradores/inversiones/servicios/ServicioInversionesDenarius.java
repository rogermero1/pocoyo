package fin.coop15abril.servicios.integradores.inversiones.servicios;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.Inversion;
import fin.coop15abril.servicios.comunes.utilerias.DateUtils;
import fin.coop15abril.servicios.integradores.inversiones.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import servicioinversiones.externalservices.web.corebanking.denarius.IServiciosInversiones;
import servicioinversiones.externalservices.web.corebanking.denarius.ServiciosInversiones;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.DatosInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasInversion;

@Service
@Slf4j
public class ServicioInversionesDenarius {

	private IServiciosInversiones interfazInversiones;

	@Autowired
	private ConfiguradorDenarius denariusConfig;

	@PostConstruct
	private void init() {
		try {
			log.info("Iniciando servicio Inversiones: " + denariusConfig.getUrlServicioInversiones());
			interfazInversiones = (new ServiciosInversiones(new URL(denariusConfig.getUrlServicioInversiones())))
					.getWSHttpBindingIServiciosInversiones(new AddressingFeature(true, true));
		} catch (Exception e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
	}

	private JAXBElement<Cabecera> cabeceraServicioInversion() {
		ObjectFactory of = new ObjectFactory();
		Cabecera cabecera = new Cabecera();
		cabecera.setCanal(of.createCabeceraCanal("INT"));
		cabecera.setOficina(Integer.valueOf(denariusConfig.getOficina()));
		cabecera.setOrganizacion(of.createCabeceraOrganizacion(denariusConfig.getOrganizacion()));
		cabecera.setUsuario(of.createCabeceraUsuario(denariusConfig.getUsuario()));
		return of.createCabecera(cabecera);
	}

	public List<Inversion> consultaInversionesPorIdentificacion(String identificacion) {

		MEIdentificacionCliente request = new MEIdentificacionCliente();
		MSConsultasInversion response;

		ObjectFactory ofCredito = new ObjectFactory();

		request.setCabecera(cabeceraServicioInversion());
		request.setIdentificacionCliente(ofCredito.createMEIdentificacionClienteIdentificacionCliente(identificacion));

		response = interfazInversiones.consultarSaldosCuentas(request);

		List<Inversion> lista = new ArrayList<>();
		
		if (Boolean.FALSE.equals(response.isOk())) {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			return lista;
		}
		
		for (DatosInversion inv : response.getInversiones().getValue().getDatosInversion()) {
			lista.add(new Inversion(inv.getNumeroOperacion().getValue(), inv.getTipoCaptacion().getValue(),
					inv.getTipoPagoInteres().getValue(), inv.getMonto().getValue().doubleValue(),
					inv.getMontoAcruar().doubleValue(), inv.getMontoBloqueado().doubleValue(),
					inv.getMontoPignoracion().doubleValue(), inv.getCodigoEstado().getValue(),
					inv.getEstado().getValue(), inv.getIdOficialCaptador(), inv.getOficialCaptador().getValue(),
					inv.getOficialPrincipal().getValue(), inv.getIdOficina(), inv.getTasa().doubleValue(),
					inv.getTasaAnterior().doubleValue(), inv.getPlazo(), inv.getDiasTranscurridos(),
					inv.getDetalleOrigRecurso().getValue(), inv.getEndosado().getValue(), inv.isCustodia(),
					inv.isImpreso(), inv.getImpuesto().doubleValue(), inv.getInteres().doubleValue(),
					inv.getInteresActual().doubleValue(), inv.getInteresPorRecibir().doubleValue(),
					inv.getInteresRecibido().doubleValue(), inv.getInteresRetenido().doubleValue(),
					inv.getInteresTotal().doubleValue(), inv.getMargen().doubleValue(), inv.isTasaReajustable(),
					inv.isRenovacion(), inv.getPorcentajePignoracion().doubleValue(),
					DateUtils.fechaToString(inv.getFechaValor()), 
					DateUtils.fechaToString(inv.getFechaRecibo()),
					DateUtils.fechaToString(inv.getFechaVencimiento()),
					DateUtils.fechaToString(inv.getFechaCancelacion().getValue()),
					DateUtils.fechaToString(inv.getFechaEfectivizacion().getValue()),
					DateUtils.fechaToString(inv.getFechaNegociacion().getValue()),
					DateUtils.fechaToString(inv.getFechaProximoInteres().getValue())));
		}

		return lista;
	}

}
