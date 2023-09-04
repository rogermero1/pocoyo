package fin.coop15abril.servicios.integradores.cuentas.servicios;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.CuentaAhorro;
import fin.coop15abril.servicios.integradores.cuentas.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import serviciocuentas.externalservices.web.corebanking.denarius.IServiciosCuentas;
import serviciocuentas.externalservices.web.corebanking.denarius.ServiciosCuentas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.CuentaLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCtaAhorros;

@Service
@Slf4j
public class ServicioCuentasDenarius {

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
		for (CuentaLibreta cuenta : response.getCuentas().getValue().getCuentaLibreta()) {
			lista.add(new CuentaAhorro(cuenta.getIdCuenta(), cuenta.getIdCliente().getValue(),
					cuenta.getIdClientePrincipal().getValue(), cuenta.getNumero().getValue(),
					cuenta.getCodigoSubproducto().getValue(), cuenta.getDescripcionSubProducto().getValue(),
					cuenta.getNombreProducto().getValue(), cuenta.getNombreMoneda().getValue(),
					cuenta.getEstado().getValue(), cuenta.getFechaApertura().getValue(),
					cuenta.getBloqueo().getValue().equals("S"), cuenta.getTipoBloqueo().getValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoAGirar().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoContable().doubleValue(),
					cuenta.getDatosSaldosCuenta().getValue().getSaldoDisponible().doubleValue(),
					cuenta.getMontoBloqueado().doubleValue(), cuenta.getPorEfectivizar().doubleValue(),
					cuenta.getPorEfectivizarHoy().doubleValue(), cuenta.getValorRetenido().doubleValue(),
					cuenta.getValoresSuspenso().doubleValue()));
		}

		return lista;

	}

}
