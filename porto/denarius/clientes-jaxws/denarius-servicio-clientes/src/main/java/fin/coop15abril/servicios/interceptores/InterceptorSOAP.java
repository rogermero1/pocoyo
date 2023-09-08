package fin.coop15abril.servicios.interceptores;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
//import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterceptorSOAP implements SOAPHandler<SOAPMessageContext> {

	private static Logger log = LoggerFactory.getLogger(InterceptorSOAP.class);

//	@EJB
//	private ServicioLogWs servicioLogWs;

	private String interfaz = "";
	private String operacion = "";

	@Override
	public void close(MessageContext arg0) {
		// System.out.println("InterceptorWS->close");
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// System.out.println("InterceptorWS->handleFault");
		logToSystemOut(arg0);
		return true;
	}

	@Override
	public boolean handleMessage(SOAPMessageContext arg0) {
		// System.out.println("InterceptorWS->handleMessage");
		logToSystemOut(arg0);
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// System.out.println("InterceptorWS->getHeaders");
		return Collections.emptySet();
	}

	private void logToSystemOut(SOAPMessageContext smc) {
		try {
			// Determina el request/response
			Boolean outboundProperty = (Boolean) smc.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

			// Obtiene el mensaje
			SOAPMessage message = smc.getMessage();
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			message.writeTo(out);
			String soapXml = new String(out.toByteArray());

			if (!outboundProperty.booleanValue()) {
				// Response
				log.info(" ** Response **");
				log.info("Interfaz: " + interfaz);
				log.info("Operacion:" + operacion);
				log.info("XmlResponse: " + soapXml);
			} else {
				// Request
				this.interfaz = smc.get(MessageContext.WSDL_INTERFACE).toString();
				this.operacion = smc.get(MessageContext.WSDL_OPERATION).toString();

				log.info(" ** Request **");
				log.info("Interfaz: " + interfaz);
				log.info("Operacion:" + operacion);
				log.info("XmlRequest: " + soapXml);
			}
		} catch (Exception e) {
			log.error("Exception in handler: " + e.getMessage());
		}
	}

}