
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
 * <p>Clase Java para MESimulacionInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MESimulacionInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EsDeudor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EsExento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EsSuperintendencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PagoInteres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Periodicidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TasaPreferencial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TipoCaptacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MESimulacionInversion", propOrder = {
    "esDeudor",
    "esExento",
    "esSuperintendencia",
    "monto",
    "pagoInteres",
    "periodicidad",
    "plazo",
    "tasaPreferencial",
    "tipoCaptacion"
})
public class MESimulacionInversion
    extends MensajeEntradaBase
{

    @XmlElement(name = "EsDeudor")
    protected Boolean esDeudor;
    @XmlElement(name = "EsExento")
    protected Boolean esExento;
    @XmlElement(name = "EsSuperintendencia")
    protected Boolean esSuperintendencia;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElementRef(name = "PagoInteres", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pagoInteres;
    @XmlElement(name = "Periodicidad")
    protected Integer periodicidad;
    @XmlElement(name = "Plazo")
    protected Integer plazo;
    @XmlElementRef(name = "TasaPreferencial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> tasaPreferencial;
    @XmlElement(name = "TipoCaptacion")
    protected Integer tipoCaptacion;

    /**
     * Obtiene el valor de la propiedad esDeudor.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsDeudor() {
        return esDeudor;
    }

    /**
     * Define el valor de la propiedad esDeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsDeudor(Boolean value) {
        this.esDeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad esExento.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsExento() {
        return esExento;
    }

    /**
     * Define el valor de la propiedad esExento.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsExento(Boolean value) {
        this.esExento = value;
    }

    /**
     * Obtiene el valor de la propiedad esSuperintendencia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsSuperintendencia() {
        return esSuperintendencia;
    }

    /**
     * Define el valor de la propiedad esSuperintendencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsSuperintendencia(Boolean value) {
        this.esSuperintendencia = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoInteres.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPagoInteres() {
        return pagoInteres;
    }

    /**
     * Define el valor de la propiedad pagoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPagoInteres(JAXBElement<String> value) {
        this.pagoInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad periodicidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodicidad() {
        return periodicidad;
    }

    /**
     * Define el valor de la propiedad periodicidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodicidad(Integer value) {
        this.periodicidad = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazo(Integer value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTasaPreferencial() {
        return tasaPreferencial;
    }

    /**
     * Define el valor de la propiedad tasaPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTasaPreferencial(JAXBElement<BigDecimal> value) {
        this.tasaPreferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCaptacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCaptacion() {
        return tipoCaptacion;
    }

    /**
     * Define el valor de la propiedad tipoCaptacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCaptacion(Integer value) {
        this.tipoCaptacion = value;
    }

}
