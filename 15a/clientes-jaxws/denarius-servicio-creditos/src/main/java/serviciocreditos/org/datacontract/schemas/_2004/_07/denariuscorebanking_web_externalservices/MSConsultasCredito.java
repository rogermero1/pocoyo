
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Credito" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}TramiteCredito" minOccurs="0"/&gt;
 *         &lt;element name="Creditos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfTramiteCredito" minOccurs="0"/&gt;
 *         &lt;element name="CreditosPareja" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfTramiteCredito" minOccurs="0"/&gt;
 *         &lt;element name="Movimientos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfMovimientoCredito" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasCredito", propOrder = {
    "cantidad",
    "credito",
    "creditos",
    "creditosPareja",
    "movimientos",
    "nombre"
})
public class MSConsultasCredito
    extends MensajeSalidaBase
{

    @XmlElement(name = "Cantidad")
    protected Integer cantidad;
    @XmlElementRef(name = "Credito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<TramiteCredito> credito;
    @XmlElementRef(name = "Creditos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTramiteCredito> creditos;
    @XmlElementRef(name = "CreditosPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTramiteCredito> creditosPareja;
    @XmlElementRef(name = "Movimientos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimientoCredito> movimientos;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad credito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     *     
     */
    public JAXBElement<TramiteCredito> getCredito() {
        return credito;
    }

    /**
     * Define el valor de la propiedad credito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     *     
     */
    public void setCredito(JAXBElement<TramiteCredito> value) {
        this.credito = value;
    }

    /**
     * Obtiene el valor de la propiedad creditos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTramiteCredito> getCreditos() {
        return creditos;
    }

    /**
     * Define el valor de la propiedad creditos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     *     
     */
    public void setCreditos(JAXBElement<ArrayOfTramiteCredito> value) {
        this.creditos = value;
    }

    /**
     * Obtiene el valor de la propiedad creditosPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTramiteCredito> getCreditosPareja() {
        return creditosPareja;
    }

    /**
     * Define el valor de la propiedad creditosPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     *     
     */
    public void setCreditosPareja(JAXBElement<ArrayOfTramiteCredito> value) {
        this.creditosPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad movimientos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimientoCredito> getMovimientos() {
        return movimientos;
    }

    /**
     * Define el valor de la propiedad movimientos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     *     
     */
    public void setMovimientos(JAXBElement<ArrayOfMovimientoCredito> value) {
        this.movimientos = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

}
