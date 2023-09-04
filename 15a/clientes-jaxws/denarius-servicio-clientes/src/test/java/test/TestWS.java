package test;

import java.net.URL;

import javax.xml.ws.soap.AddressingFeature;

import servicioclientes.externalservices.web.corebanking.denarius.IServiciosClientes;
import servicioclientes.externalservices.web.corebanking.denarius.ServiciosClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.Cabecera;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCliente;

public class TestWS {
// -Dcom.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true

	public static void main(String[] args) {

		try {

			//System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
			
			ServiciosClientes interfaz = new ServiciosClientes(
					// new
					// URL("https://corepruebas.denariusonline.com:41998/ServiciosClientes.svc?wsdl"));
					//new URL("http://192.168.50.6:9998/ServiciosClientes.svc?wsdl"));
					new URL("https://corepruebas.denariusonline.com:41998/ServiciosClientes.svc?wsdl"));

			// meConsulta req = new

			MEConsultasCliente req = new MEConsultasCliente();
			MSConsultasCliente resp = new MSConsultasCliente();

			servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory of1 = new servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.ObjectFactory();
			servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory of2 = new servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.ObjectFactory();

			System.out.println("arma cabecera req");

			Cabecera cabecera = new Cabecera();
			cabecera.setCanal(of1.createCabeceraCanal("INT"));
			cabecera.setOficina(2);
			cabecera.setOrganizacion(of1.createCabeceraOrganizacion("15DeAbril"));
			cabecera.setUsuario(of1.createCabeceraUsuario("15abriltest"));

			req.setIdentificacionCliente(of2.createMEConsultasClienteIdentificacionCliente("1312598269"));
			req.setCabecera(of1.createCabecera(cabecera));

			System.out.println("depues req");

			// interfaz.getPort(null).

			//Map<String, List<String>> requestHeaders = new HashMap<>();
			//requestHeaders.put("Host",Arrays.asList("200.100.1.47:8001"));
			
			

			IServiciosClientes client = 
					//interfaz.getWSHttpBindingIServiciosClientes();
					interfaz.getWSHttpBindingIServiciosClientes(new AddressingFeature(true, true));
			
			//((BindingProvider) client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
			//client.soapMethod(param1, param2);


			resp = client.consultarDatosCliente(req);

			// resp = interfaz.getWSHttpBindingIServiciosClientes(new
			// AddressingFeature(true, false))
			// .consultarDatosCliente(req);

			System.out.println("respuesta");
			System.out.println(resp.getDatosCliente().getValue().getNombres().getValue());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
