package fin.coop15abril.servicios.integradores.clientes.servicios;

import java.net.URL;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.soap.AddressingFeature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteMS;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.DateUtils;
import fin.coop15abril.servicios.integradores.clientes.configuracion.ConfiguradorDenarius;
import lombok.extern.slf4j.Slf4j;
import servicioclientes.externalservices.web.corebanking.denarius.IServiciosClientes;
import servicioclientes.externalservices.web.corebanking.denarius.ServiciosClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCliente;

@Service
@Slf4j
public class ServicioClientesDenarius {

	private IServiciosClientes interfazClientes;

	@Autowired
	private ConfiguradorDenarius denariusConfig;

	@PostConstruct
	private void init() {
		try {
			log.info("Iniciando servicio Clientes: " + denariusConfig.getUrlServicioClientes());
			this.interfazClientes = (new ServiciosClientes(new URL(denariusConfig.getUrlServicioClientes())))
					.getWSHttpBindingIServiciosClientes(new AddressingFeature(true, true));
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

	public DatosClienteMS consultarClientePorIdentificacion(String identificacion, Boolean consultarDatosAdicionales)
			throws Exception {

		MEConsultasCliente request = new MEConsultasCliente();
		MSConsultasCliente response;

		servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory ofCliente = new servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

		request.setCabecera(cabeceraServicioCliente());
		request.setIdentificacionCliente(ofCliente.createMEConsultasClienteIdentificacionCliente(identificacion));

		// llamado a ws denarius
		response = interfazClientes.consultarDatosCliente(request);

		if (Boolean.TRUE.equals(response.isOk())) {
			DatosClienteMS consultaClienteMS = new DatosClienteMS();
			consultaClienteMS.setIdCliente(response.getDatosCliente().getValue().getIdCliente());
			consultaClienteMS
					.setTipoIdentificacion(response.getDatosCliente().getValue().getTipoIdentificacion().getValue());
			consultaClienteMS.setIdentificacion(response.getDatosCliente().getValue().getIdentificacion().getValue());
			consultaClienteMS.setNombre1(response.getDatosAdicionales().getValue().getNombre1().getValue());
			consultaClienteMS.setNombre2(response.getDatosAdicionales().getValue().getNombre2().getValue());
			consultaClienteMS.setNombres(response.getDatosAdicionales().getValue().getNombres().getValue());
			consultaClienteMS.setApellido1(response.getDatosAdicionales().getValue().getApellido1().getValue());
			consultaClienteMS.setApellido2(response.getDatosAdicionales().getValue().getApellido2().getValue());
			consultaClienteMS.setApellidos(response.getDatosAdicionales().getValue().getApellidos().getValue());
			consultaClienteMS.setNombreCompleto(response.getDatosCliente().getValue().getNombres().getValue());
			consultaClienteMS.setIdentificacionConyuge(
					response.getDatosCliente().getValue().getIdentificacionConyuge().getValue());
			consultaClienteMS.setNombreConyuge(response.getDatosCliente().getValue().getNombreConyuge().getValue());
			consultaClienteMS
					.setEstadoCivil(response.getDatosCliente().getValue().getDescripcionEstadoCivil().getValue());
			consultaClienteMS.setCelular(response.getDatosAdicionales().getValue().getCelular().getValue());
			consultaClienteMS.setCorreo(response.getDatosCliente().getValue().getEmail().getValue());
			consultaClienteMS
					.setTelefonoAdicional(response.getDatosAdicionales().getValue().getTelefonoAdicional().getValue());
			consultaClienteMS.setFechaNacimiento(
					DateUtils.fechaToString(response.getDatosCliente().getValue().getFechaNacimiento().getValue()));
			consultaClienteMS.setNivelEducacion(response.getDatosCliente().getValue().getTipoEducacion().getValue());
			consultaClienteMS.setTipoVivienda(response.getDatosCliente().getValue().getTipoVivienda().getValue());
			consultaClienteMS.setGenero(response.getDatosCliente().getValue().getGenero().getValue());
			consultaClienteMS.setIdActividadEconomica(response.getDatosCliente().getValue().getActividad().getValue());
			consultaClienteMS.setCiudad(response.getDatosCliente().getValue().getCiudad().getValue());
			consultaClienteMS.setDireccion(response.getDatosCliente().getValue().getDireccion().getValue());
			consultaClienteMS.setIdAgencia(response.getCodigoAgencia());
			consultaClienteMS.setNombreAgencia(response.getAgencia().getValue());
			consultaClienteMS.setPep(response.getDatosCliente().getValue().isPEP());
			consultaClienteMS.setResidenciaFiscal(response.getDatosCliente().getValue().isResidenciaFiscal());

			if (Boolean.TRUE.equals(consultarDatosAdicionales)) {
				MEIdentificacionCliente request2 = new MEIdentificacionCliente();
				ObjectFactory of = new ObjectFactory();
				request2.setCabecera(cabeceraServicioCliente());
				request2.setIdentificacionCliente(
						of.createMEIdentificacionClienteIdentificacionCliente(identificacion));

				MSClientes response2 = interfazClientes.consultarClientePorIdentificacion(request2);

				if (Boolean.TRUE.equals(response2.isOk())) {
					consultaClienteMS.setVinculado(response2.getCliente().getValue().isEsVinculado());
					consultaClienteMS.setFuncionario(response2.getCliente().getValue().isEsFuncionario());
					consultaClienteMS.setSocio(response2.getCliente().getValue().isEsSocio());
					consultaClienteMS.setExtranjero(response2.getCliente().getValue().isExtranjero());
					consultaClienteMS.setPotencial(response2.getCliente().getValue().isPotencial());
					consultaClienteMS.setCodigoOficial(response2.getCliente().getValue().getOficial());
					consultaClienteMS.setNombreOficial(response2.getCliente().getValue().getNombreOficial().getValue());
				}
			}

			return consultaClienteMS;
		} else {
			log.error(response.getCodigoError().getValue().toString() + " " + response.getMensajeError().getValue());
			throw new ExcepcionApp(response.getCodigoError().getValue().toString(), "Error al procesar consulta",
					response.getMensajeError().getValue());
		}

	}

}
