
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasLibreta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasLibreta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosGeneralesCliente" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Lineas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LineasPendientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfLineaPendienteLibreta" minOccurs="0"/&gt;
 *         &lt;element name="OficinaCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasLibreta", propOrder = {
    "datosCliente",
    "descripcionProducto",
    "fechaApertura",
    "idCliente",
    "lineas",
    "lineasPendientes",
    "oficinaCuenta"
})
public class MSConsultasLibreta
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "DatosCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCliente> datosCliente;
    @XmlElementRef(name = "DescripcionProducto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionProducto;
    @XmlElement(name = "FechaApertura")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaApertura;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElement(name = "Lineas")
    protected Integer lineas;
    @XmlElementRef(name = "LineasPendientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLineaPendienteLibreta> lineasPendientes;
    @XmlElementRef(name = "OficinaCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficinaCuenta;

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
     * Obtiene el valor de la propiedad descripcionProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionProducto() {
        return descripcionProducto;
    }

    /**
     * Define el valor de la propiedad descripcionProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionProducto(JAXBElement<String> value) {
        this.descripcionProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaApertura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Define el valor de la propiedad fechaApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaApertura(XMLGregorianCalendar value) {
        this.fechaApertura = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad lineas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineas() {
        return lineas;
    }

    /**
     * Define el valor de la propiedad lineas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineas(Integer value) {
        this.lineas = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasPendientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLineaPendienteLibreta> getLineasPendientes() {
        return lineasPendientes;
    }

    /**
     * Define el valor de la propiedad lineasPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     *     
     */
    public void setLineasPendientes(JAXBElement<ArrayOfLineaPendienteLibreta> value) {
        this.lineasPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad oficinaCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficinaCuenta() {
        return oficinaCuenta;
    }

    /**
     * Define el valor de la propiedad oficinaCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficinaCuenta(JAXBElement<String> value) {
        this.oficinaCuenta = value;
    }

}
