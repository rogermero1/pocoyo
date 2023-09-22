
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEInstruccionInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEInstruccionInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoInstruccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CorreoNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdValidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoCancelacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoIncremento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodicidadRenovacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlazoRenovacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoNotificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEInstruccionInversion", propOrder = {
    "codigoInstruccion",
    "correoNotificacion",
    "idOperacion",
    "idValidacion",
    "identificacion",
    "montoCancelacion",
    "montoIncremento",
    "numeroCuenta",
    "periodicidadRenovacion",
    "plazoRenovacion",
    "telefonoNotificacion"
})
public class MEInstruccionInversion
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoInstruccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoInstruccion;
    @XmlElementRef(name = "CorreoNotificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> correoNotificacion;
    @XmlElement(name = "IdOperacion")
    protected Integer idOperacion;
    @XmlElementRef(name = "IdValidacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idValidacion;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElement(name = "MontoCancelacion")
    protected BigDecimal montoCancelacion;
    @XmlElement(name = "MontoIncremento")
    protected BigDecimal montoIncremento;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;
    @XmlElement(name = "PeriodicidadRenovacion")
    protected Integer periodicidadRenovacion;
    @XmlElement(name = "PlazoRenovacion")
    protected Integer plazoRenovacion;
    @XmlElementRef(name = "TelefonoNotificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoNotificacion;

    /**
     * Obtiene el valor de la propiedad codigoInstruccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoInstruccion() {
        return codigoInstruccion;
    }

    /**
     * Define el valor de la propiedad codigoInstruccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoInstruccion(JAXBElement<String> value) {
        this.codigoInstruccion = value;
    }

    /**
     * Obtiene el valor de la propiedad correoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorreoNotificacion() {
        return correoNotificacion;
    }

    /**
     * Define el valor de la propiedad correoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorreoNotificacion(JAXBElement<String> value) {
        this.correoNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperacion() {
        return idOperacion;
    }

    /**
     * Define el valor de la propiedad idOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperacion(Integer value) {
        this.idOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idValidacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdValidacion() {
        return idValidacion;
    }

    /**
     * Define el valor de la propiedad idValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdValidacion(JAXBElement<String> value) {
        this.idValidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacion(JAXBElement<String> value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoCancelacion() {
        return montoCancelacion;
    }

    /**
     * Define el valor de la propiedad montoCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoCancelacion(BigDecimal value) {
        this.montoCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoIncremento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoIncremento() {
        return montoIncremento;
    }

    /**
     * Define el valor de la propiedad montoIncremento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoIncremento(BigDecimal value) {
        this.montoIncremento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuenta(JAXBElement<String> value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidadRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodicidadRenovacion() {
        return periodicidadRenovacion;
    }

    /**
     * Define el valor de la propiedad periodicidadRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodicidadRenovacion(Integer value) {
        this.periodicidadRenovacion = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazoRenovacion() {
        return plazoRenovacion;
    }

    /**
     * Define el valor de la propiedad plazoRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazoRenovacion(Integer value) {
        this.plazoRenovacion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoNotificacion() {
        return telefonoNotificacion;
    }

    /**
     * Define el valor de la propiedad telefonoNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoNotificacion(JAXBElement<String> value) {
        this.telefonoNotificacion = value;
    }

}
