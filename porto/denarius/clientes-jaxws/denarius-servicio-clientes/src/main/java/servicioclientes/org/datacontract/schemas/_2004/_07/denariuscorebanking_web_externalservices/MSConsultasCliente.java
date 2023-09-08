
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Agencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoAgencia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DatosAdicionales" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosAdicionalesCliente" minOccurs="0"/&gt;
 *         &lt;element name="DatosCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosGeneralesCliente" minOccurs="0"/&gt;
 *         &lt;element name="FechaContable" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasCliente", propOrder = {
    "agencia",
    "codigoAgencia",
    "datosAdicionales",
    "datosCliente",
    "fechaContable"
})
public class MSConsultasCliente
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Agencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agencia;
    @XmlElement(name = "CodigoAgencia")
    protected Integer codigoAgencia;
    @XmlElementRef(name = "DatosAdicionales", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosAdicionalesCliente> datosAdicionales;
    @XmlElementRef(name = "DatosCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCliente> datosCliente;
    @XmlElement(name = "FechaContable")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaContable;

    /**
     * Obtiene el valor de la propiedad agencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgencia() {
        return agencia;
    }

    /**
     * Define el valor de la propiedad agencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgencia(JAXBElement<String> value) {
        this.agencia = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoAgencia() {
        return codigoAgencia;
    }

    /**
     * Define el valor de la propiedad codigoAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoAgencia(Integer value) {
        this.codigoAgencia = value;
    }

    /**
     * Obtiene el valor de la propiedad datosAdicionales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     *     
     */
    public JAXBElement<DatosAdicionalesCliente> getDatosAdicionales() {
        return datosAdicionales;
    }

    /**
     * Define el valor de la propiedad datosAdicionales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     *     
     */
    public void setDatosAdicionales(JAXBElement<DatosAdicionalesCliente> value) {
        this.datosAdicionales = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     *     
     */
    public JAXBElement<DatosGeneralesCliente> getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     *     
     */
    public void setDatosCliente(JAXBElement<DatosGeneralesCliente> value) {
        this.datosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaContable.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaContable() {
        return fechaContable;
    }

    /**
     * Define el valor de la propiedad fechaContable.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaContable(XMLGregorianCalendar value) {
        this.fechaContable = value;
    }

}
