package test;

import java.net.URL;

import javax.xml.ws.soap.AddressingFeature;

import serviciocuentas.externalservices.web.corebanking.denarius.IServiciosCuentas;
import serviciocuentas.externalservices.web.corebanking.denarius.ServiciosCuentas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCtaAhorros;

public class TestWS {
// -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true

	public static void main(String[] args) {

		try {

			// System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump",
			// "true");

			ServiciosCuentas interfaz = new ServiciosCuentas(
					// new
					// URL("https://corepruebas.denariusonline.com:41998/ServiciosClientes.svc?wsdl"));
					// new URL("http://192.168.50.6:9998/ServiciosClientes.svc?wsdl"));
					new URL("https://corepruebas.denariusonline.com:41998/ServiciosCuentas.svc?wsdl"));

			// meConsulta req = new

			MEConsultasCuenta req = new MEConsultasCuenta();
			MSConsultasCtaAhorros resp = new MSConsultasCtaAhorros();

			ObjectFactory of1 = new ObjectFactory();

			System.out.println("arma cabecera req");

			Cabecera cabecera = new Cabecera();
			cabecera.setCanal(of1.createCabeceraCanal("INT"));
			cabecera.setOficina(2);
			cabecera.setOrganizacion(of1.createCabeceraOrganizacion("15DeAbril"));
			cabecera.setUsuario(of1.createCabeceraUsuario("15abriltest"));

			req.setIdCliente(297961);
			// req.setIdentificacionCliente(of2.createMEConsultasClienteIdentificacionCliente("1312598269"));
			req.setCabecera(of1.createCabecera(cabecera));

			System.out.println("depues req");

			// interfaz.getPort(null).

			// Map<String, List<String>> requestHeaders = new HashMap<>();
			// requestHeaders.put("Host",Arrays.asList("200.100.1.47:8001"));

			IServiciosCuentas client =
					// interfaz.getWSHttpBindingIServiciosClientes();
					interfaz.getWSHttpBindingIServiciosCuentas(new AddressingFeature(true, true));

			// ((BindingProvider)
			// client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS,
			// requestHeaders);
			// client.soapMethod(param1, param2);

			resp = client.consultarCuenta(req);

			// resp = interfaz.getWSHttpBindingIServiciosClientes(new
			// AddressingFeature(true, false))
			// .consultarDatosCliente(req);

			System.out.println("respuesta");
			System.out.println(resp.isOk());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
