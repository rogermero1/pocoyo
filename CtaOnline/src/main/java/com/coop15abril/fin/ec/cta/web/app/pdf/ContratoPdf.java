package com.coop15abril.fin.ec.cta.web.app.pdf;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.List;
import com.lowagie.text.ListItem;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class ContratoPdf {

    private String  nombreCuenta;
    private String  dni;
    private Long cuenta;
    private Calendar calendar = Calendar.getInstance();
    private Integer año, dia;
    private String  mes;
    @Autowired
    ResourceLoader resourceLoader;


    public ContratoPdf(String nombreCuenta, String dni,Long cuenta) {
        this.nombreCuenta = nombreCuenta;
        this.cuenta = cuenta;
        this.dni = dni;
        this.año = calendar.get(Calendar.YEAR);
        this.mes = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
    }


    public void createPDF() throws IOException {
    	String ruta = "/";//C:\
        Image logo = Image.getInstance( ruta+"ahorros/images/logo.png" );
        logo.setAlignment(Image.ALIGN_LEFT);
        logo.scaleAbsoluteHeight(20);
        logo.scaleAbsoluteWidth(20);
        logo.scalePercent(50);

        Document document = new Document(PageSize.A4);
        document.setMargins(40,20,30,30);
        PdfWriter.getInstance(document, new FileOutputStream( ruta+"ahorros/contratos/"+cuenta+".pdf" ) );
        document.open();
        document.add( logo );
        Font font = FontFactory.getFont(FontFactory.TIMES_BOLD);
        font.setSize(12);
        Paragraph p = new Paragraph("CONTRATO DE CUENTA DE AHORROS", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        p.setSpacingAfter(15);
        document.add(p);
        Font font2 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font2.setSize(11);
        //parrafos
        Paragraph p1 = new Paragraph("En la ciudad de Portoviejo, a los "+this.dia+" días del mes de "+this.mes+" del año "+this.año+", intervienen por una parte la Cooperativa de Ahorro y Crédito \"15 de abril\" Ltda., quien en adelante se denominará la Cooperativa, y por otra parte el ahorrista a quien se denominará el cliente.",font2);
        p1.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        p1.setSpacingAfter(15);
        document.add(p1);

        //list
        Paragraph pl1 = new Paragraph("\tPara el ejercicio y control de sus transacciones la Cooperativa suministrará al Cliente, una Cartola de Ahorros (Libreta), la misma que será utilizada por él o la persona que autorice debidamente para realizar: Depósitos y Retiros de Ahorros, Depósitos en Certificados de Aportación y Seguro de Vida.", font2);
        pl1.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl1.setSpacingAfter(15);

        Paragraph pl2 = new Paragraph("\tDe acuerdo a los saldos mantenidos en la cuenta de Ahorros, la Cooperativa establecerá rangos y porcentajes para el pago de intereses los que estarán acorde a los ofrecidos por el mercado financiero. Los intereses que genere el capital mantenido, serán acreditados en la cuenta de ahorros al finalizar los meses de junio y diciembre.",font2);
        pl2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl2.setSpacingAfter(15);

        Paragraph pl3 = new Paragraph("\tEl cliente podrá autorizar a una tercera persona para el retiro de fondos de su Cuenta de Ahorros, previa autorización escrita registrada en el reverso de la papeleta de retiro, o por medio de un Poder debidamente legalizado y registrado en la Cooperativa, adjuntando además la libreta de ahorros y los originales de las cédulas de ciudadanía. En el caso de que el retiro proceda a través de un poder, la copia del mismo con la razón notarial de no haber sido revocado deberá de mantenerse en la Cooperativa. Las papeletas de retiro no pueden presentar señales de alteración, caso contrario no se podrá procesar el retiro.",font2);
        pl3.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl3.setSpacingAfter(15);

        Paragraph pl4 = new Paragraph("\tEl cliente se obliga a custodiar la Libreta de Ahorros, y será de su exclusiva responsabilidad el uso indebido de la misma. En caso de pérdida de la Libreta, el Cliente notificará a la Cooperativa para realizar las acciones pertinentes, caso contrario será de su responsabilidad las pérdidas que se produzcan por la falsificación o uso indebido del documento, sin que pueda reclamar dichos valores a la Cooperativa.", font2);
        pl4.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl4.setSpacingAfter(15);

        Paragraph pl5 = new Paragraph("\tEl valor depositado en cheques, será bloqueado y liberado únicamente cuando éstos hayan sido efectivizados. La Cooperativa queda autorizada a efectuar el ajuste respectivo por los valores depositados en cheque que no se hubieren efectivizado, y no se responsabilizará de realizar gestión para el cobro de los cheques que resulten devueltos.", font2);
        pl5.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl5.setSpacingAfter(15);

        Paragraph pl6 = new Paragraph("\tLa Cooperativa se obliga a pagar de los fondos disponibles mantenidos en la cuenta de ahorros, los valores requeridos por el cliente, del saldo disponible que mantenga en su cuenta de ahorros. Este proceso de retiro será efectuado en efectivo ó en cheque girado de las cuentas que la Cooperativa mantiene en bancos de la localidad. La modalidad de pago dependerá del valor retirado, de acuerdo a las Políticas Internas de la Cooperativa.", font2);
        pl6.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl6.setSpacingAfter(15);

        Paragraph pl7 = new Paragraph("\tLa Cooperativa a petición del cliente podrá utilizar los fondos disponibles mediante otros mecanismos de pago, debidamente autorizados, tales como pagos de préstamo, transferencia entre cuentas de la Cooperativa ó transferencias a cuentas de otras instituciones.", font2);
        pl7.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl7.setSpacingAfter(15);

        Paragraph pl8 = new Paragraph("\tTodos los Clientes que mantengan una cuenta en la Cooperativa son solidaria e individualmente responsables de su manejo. Las personas que, sin ser titulares de una cuenta de Ahorros, firmen en ella por autorización expresa del socio o cliente, podrán disponer de los fondos al igual que el titular, con la misma responsabilidad. En todo caso la autorización no exime al titular de responder legalmente sobre el manejo de la cuenta.", font2);
        pl8.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl8.setSpacingAfter(15);

        Paragraph pl9 = new Paragraph("\tEl cliente, declara que los valores  que constan en la Libreta de Ahorros son lícitos y no provienen de ninguna actividad ilegal, ni serán destinados a acciones relacionadas y tipificadas en la Ley de Sustancias Estupefacientes y Psicotrópicas; por lo que autoriza a la Cooperativa a analizar y verificar las transacciones que efectúe, así como también a informar de forma adecuada y documentada a la UAFE o Autoridad competente en caso de investigación, cuando se detectare que en la cuenta de Ahorros se realizan movimientos inusuales o sospechosos, efectuados directamente o por medio de terceras personas. Los Socios y Clientes serán responsables de presentar los justificativos y sustentos al momento que sus depósitos superen el umbral establecido por el organismo de control.", font2);
        pl9.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl9.setSpacingAfter(15);

        Paragraph pl10 = new Paragraph("\tAutorizo expresamente que la Cooperativa entregue la información financiera a los Organismos de Control y al Servicio de Rentas Internas en el marco del cumplimiento de acuerdos o convenios internacionales de intercambio de información ratificados por el Ecuador. De acuerdo a lo requerido por la Superintendencia de Economía Popular y Solidaria en el artículo 3 de la \"Norma de control para el cumplimiento de las exigencias derivadas de la adhesión del Ecuador al foro global sobre transparencia e intercambio de información para fines fiscales\".", font2);
        pl10.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl10.setSpacingAfter(15);

        Paragraph pl11 = new Paragraph("\tLa corporación del seguro de Depósitos es aseguradora de los depósitos hasta la cobertura vigente, por persona natural o jurídica, salvo las excepciones establecidas en la Ley General de Instituciones del Sistema Financiero, reformada por la ley de creación de la red de seguridad Financiera y demás normativa aplicable.", font2);
        pl11.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl11.setSpacingAfter(15);

        Paragraph pl12 = new Paragraph("\tEl Cliente acepta y se ratifica en todas y cada una de las cláusulas de este Contrato y para constancia lo acepta y suscribe.", font2);
        pl12.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        pl12.setSpacingAfter(15);

        List list = new List(true);
        list.setIndentationLeft(20);
        list.add( new ListItem(pl1) );
        list.add( new ListItem(pl2) );
        list.add( new ListItem(pl3) );
        list.add( new ListItem(pl4) );
        list.add( new ListItem(pl5) );
        list.add( new ListItem(pl6) );
        list.add( new ListItem(pl7) );
        list.add( new ListItem(pl8) );
        list.add( new ListItem(pl9) );
        list.add( new ListItem(pl10) );
        list.add( new ListItem(pl11) );
        list.add( new ListItem(pl12) );
        document.add(list);
        document.add( Chunk.NEWLINE);
        document.add( Chunk.NEWLINE);
        document.add( Chunk.NEWLINE);
        Paragraph fp1 = new Paragraph(this.nombreCuenta, font2);
        fp1.setAlignment(Paragraph.ALIGN_CENTER);
        Paragraph fp2 = new Paragraph("CC.:"+this.dni, font2);
        fp2.setAlignment(Paragraph.ALIGN_CENTER);

        document.add( fp1 );
        document.add( fp2 );
        document.close();

    }


}
