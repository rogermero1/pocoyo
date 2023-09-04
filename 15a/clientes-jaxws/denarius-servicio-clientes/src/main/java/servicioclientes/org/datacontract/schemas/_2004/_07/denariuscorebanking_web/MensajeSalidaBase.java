
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSArchivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaCelular;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaClientesCondiciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaDireccionesCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaOrigenFondos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaParticipacionAccionaria;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaReferenciasPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaRelaciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaRepresentanteLegal;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosContacto;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSFuncionario;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSInformacionFinanciera;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSVinculado;


/**
 * <p>Clase Java para MensajeSalidaBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MensajeSalidaBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MensajeError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ok" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeSalidaBase", propOrder = {
    "codigoError",
    "fechaProceso",
    "mensajeError",
    "numeroTransaccion",
    "ok"
})
@XmlSeeAlso({
    MSClientes.class,
    MSCreacionCliente.class,
    MSConsultasCliente.class,
    MSConsultaDireccionesCliente.class,
    MSConsultaRepresentanteLegal.class,
    MSConsultaCelular.class,
    MSConsultaClientesCondiciones.class,
    MSConsultaEmpleo.class,
    MSConsultaReferenciasPersonales.class,
    MSConsultaClientes.class,
    MSDatosContacto.class,
    MSConsultaOrigenFondos.class,
    MSInformacionFinanciera.class,
    MSFuncionario.class,
    MSVinculado.class,
    MSConsultaRelaciones.class,
    MSConsultaParticipacionAccionaria.class,
    MSArchivo.class
})
public class MensajeSalidaBase {

    @XmlElementRef(name = "CodigoError", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codigoError;
    @XmlElement(name = "FechaProceso")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaProceso;
    @XmlElementRef(name = "MensajeError", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeError;
    @XmlElementRef(name = "NumeroTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroTransaccion;
    @XmlElement(name = "Ok")
    protected Boolean ok;

    /**
     * Obtiene el valor de la propiedad codigoError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodigoError() {
        return codigoError;
    }

    /**
     * Define el valor de la propiedad codigoError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodigoError(JAXBElement<Integer> value) {
        this.codigoError = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProceso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Define el valor de la propiedad fechaProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaProceso(XMLGregorianCalendar value) {
        this.fechaProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeError.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeError() {
        return mensajeError;
    }

    /**
     * Define el valor de la propiedad mensajeError.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeError(JAXBElement<String> value) {
        this.mensajeError = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTransaccion() {
        return numeroTransaccion;
    }

    /**
     * Define el valor de la propiedad numeroTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTransaccion(JAXBElement<String> value) {
        this.numeroTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ok.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOk() {
        return ok;
    }

    /**
     * Define el valor de la propiedad ok.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOk(Boolean value) {
        this.ok = value;
    }

}
