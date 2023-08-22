package com.coop15abril.fin.ec.cta.web.app.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.Extras;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CorreoEmisor;
import com.coop15abril.fin.ec.cta.web.app.pdf.ContratoPdf;

@Component
@Service
public class ExtrasService implements Extras {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExtrasService.class);
	private Properties props = new Properties();

	@Override
	public boolean EnviarEmail(String nombreCuenta, String email, Long cuenta, CorreoEmisor emisor) {
		boolean sendEmail = false;
		String ruta = "/";//C:\
		//get session
		Session session = Session.getInstance( getPropertiesEmail() , new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emisor.getCorreo(), emisor.getClave());
			}			
		});
		
		try {			
			  LOGGER.info("inicio de envio de email from: "+emisor.getCorreo()+" to:"+email);
			  StringBuffer  html = this.crearHtml(nombreCuenta,cuenta);
			  Message message = new MimeMessage(session);
              message.setFrom( new InternetAddress(emisor.getCorreo()) );
              message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
              message.setSubject("Apertura De Cuenta De Ahorro Online – Coop15 abril");
              message.setSentDate(new Date());

              MimeBodyPart mimeBodyPart = new MimeBodyPart();
              mimeBodyPart.setContent( html.toString() , "text/html; charset=utf-8");

              MimeBodyPart attachmentBodyPart = new MimeBodyPart();
              attachmentBodyPart.attachFile(new File(ruta+"ahorros/contratos/"+cuenta+".pdf"));
              attachmentBodyPart.setFileName("Contrato.pdf");

              Multipart multipart = new MimeMultipart();
              multipart.addBodyPart(mimeBodyPart);
              multipart.addBodyPart(attachmentBodyPart);
              message.setContent(multipart);
              Transport.send(message);
			  LOGGER.info("ENVIO DE EMAIL OK FROM:"+emisor.getCorreo()+" TO:"+email);
			  sendEmail = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.info("Error al enviar email:" + ex.getMessage().trim());
			sendEmail = false;
		}
	 return sendEmail;			
	}

	@Override
	public boolean CrearContrato(String nombreCuenta, String dni, Long cuenta) {
		boolean state = false;	
		try {
			ContratoPdf pdf = new ContratoPdf(nombreCuenta, dni, cuenta);
			pdf.createPDF();
			LOGGER.info("contrato  se genrero correctamente nombre: " + cuenta + ".pdf");
            state = true;
		} catch (IOException e) {
			e.printStackTrace();
			LOGGER.error("pdf no se genero correctamente  y ocurrio el siguiente error :" + e.getMessage());
			state = false;
		}
     return state;		
	}

	private StringBuffer crearHtml(String nombreCuenta, Long cuenta) {
		StringBuffer htmlString = new StringBuffer(
				"<html><head><title>Correo enviado por la Cooperativa 15 de Abril</title></head><body>");
		htmlString.append(
				"<center><table border=\"0\"><tr><td><img src=\"http://www.coop15abril.fin.ec/images/logo_superior_15onLine.JPG\" alt=\"Cooperativa de Ahorro y Cr&eacute;dito 15 de Abril\"/></td></tr>\n");
		htmlString.append("<tr><td><p align=\"justify\"><br/>Estimado(a) ").append(nombreCuenta).append(" <br/><br/>");
		htmlString.append(
				"Le damos la m&aacute;s cordial bienvenida a su <b>COOPERATIVA 15 DE ABRIL</b>,  su n&uacute;mero de cuenta aperturada v&iacute;a online  es el <b>#")
				.append(cuenta).append("</b>, la misma que se activar&aacute; ");
		htmlString.append(
				" cuando realice el dep&oacute;sito o transferencia por un valor m&iacute;nimo de USD$40,00 d&oacute;lares americanos, tiempo máximo para el deposito o transferencia es de 15 días, caso contrario se");
		htmlString.append(" procederá al cierre de la misma.<br/>");
		htmlString.append(
				"<br/>Se le hace conocer que en los pr&oacute;ximos d&iacute;as un asesor se comunicar&aacute; con usted para validar la informaci&oacute;n proporcionada al momento de la apertura de la cuenta web.<br/>\n");
		htmlString.append("<br/><br/>SU  COOOPERATIVA CON SEGURIDAD Y CONFIANZA <br/><br/></p></td></tr>");
		htmlString.append(
				"<tr><td><img src=\"http://www.coop15abril.fin.ec/images/logo_inferior_15onLine.JPG\" alt=\"Cooperativa de Ahorro y Cr&eacute;dito 15 de Abril\"/></td></tr>\n");
		htmlString.append("</table></center></body></html>");

		return htmlString;
	}

	@Override
	public String subirArchivo(MultipartFile file, String dni, String tipo) {
		String upload = "";
		String fileName = file.getOriginalFilename();
		String finalFileName = dni+"_"+tipo+fileName.substring(fileName.lastIndexOf("."));
		String ruta = "/";//C:\
		StringBuilder builder = new StringBuilder();
		builder.append(ruta);
		builder.append(File.separator);
		builder.append("ahorros/requisitos");
		builder.append(File.separator);
		builder.append(finalFileName);
		try {
			byte[] fileBytes = file.getBytes();
			Path path = Paths.get(builder.toString());
			Files.write(path, fileBytes);
			upload = finalFileName;
		} catch (IOException e) {
			e.printStackTrace();
			LOGGER.error("SE GENERO UNA EXCEPCIÓN AL SUBIR ARCHIVO " + dni + tipo + ", ERROR:" + e.getMessage());
			upload = "error";
		}

		return upload;
	}

	private Properties getPropertiesEmail() {
		props.put("mail.smtp.host", "smtp.office365.com");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.connectiontimeout", "30000");
		props.put("mail.smtp.timeout", "30000");
		return props;
	}

	@Override
	public boolean EnviaEmailEmpleado(String emailEmpleado, String cuenta, String nombreCuenta, String dni, 
			                          String fileNemcdF ,String fileNemcdP,
			                          String fileNemsb, CorreoEmisor emisor) {
		boolean sendEmail = false;
		String ruta = "/";//C:\

		//get session
		Session session = Session.getInstance( getPropertiesEmail() , new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(emisor.getCorreo(), emisor.getClave());
			}			
		});
		
		try {			
			  LOGGER.info("inicio de envio de email from: "+emisor.getCorreo()+" to email empleado:"+emailEmpleado);
			  //message
			  StringBuffer  html = new StringBuffer();
			  html.append("<p>Se ha dado apertura a una cuenta de ahorro vía online con los siguientes datos, se adjunta documentación respectiva.</p>");
			  html.append("<p><strong> Cliente:</strong>&nbsp;"+nombreCuenta+"</p>");
			  html.append("<p><strong> N# Cuenta:</strong>&nbsp;"+cuenta+"</p>");
			  html.append("<p><strong> Cedula:</strong>&nbsp;"+dni+"</p>");
			  
			  Message message = new MimeMessage(session);
              message.setFrom( new InternetAddress(emisor.getCorreo()) );
              message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailEmpleado));
              message.setSubject("Apertura De Cuenta De Ahorro Online – Coop15 abril");
              message.setSentDate(new Date());

              MimeBodyPart mimeBodyPart = new MimeBodyPart();
              mimeBodyPart.setContent( html.toString() , "text/html; charset=utf-8");

              MimeBodyPart attachmentBodyPartCedulaF = new MimeBodyPart();
              attachmentBodyPartCedulaF.attachFile(new File(ruta+"ahorros/requisitos/"+fileNemcdF));
              
              MimeBodyPart attachmentBodyPartCedulaP = new MimeBodyPart();
              attachmentBodyPartCedulaP.attachFile(new File(ruta+"ahorros/requisitos/"+fileNemcdP));
              
              MimeBodyPart attachmentBodyPartsb = new MimeBodyPart();
              attachmentBodyPartsb.attachFile(new File(ruta+"ahorros/requisitos/"+fileNemsb));

              Multipart multipart = new MimeMultipart();
              multipart.addBodyPart(mimeBodyPart);
              multipart.addBodyPart(attachmentBodyPartCedulaF);
              multipart.addBodyPart(attachmentBodyPartCedulaP);
              multipart.addBodyPart(attachmentBodyPartsb);
              message.setContent(multipart);
              Transport.send(message);
			  LOGGER.info("ENVIO DE EMAIL OK FROM:"+emisor.getCorreo()+" TO EMAIL EMPLEADO:"+emailEmpleado);
			  sendEmail = true;
		} catch (Exception ex) {
			ex.printStackTrace();
			LOGGER.info("Error al enviar email:" + ex.getMessage().trim());
			sendEmail = false;
		}
		
	 return sendEmail;			
	}



}
