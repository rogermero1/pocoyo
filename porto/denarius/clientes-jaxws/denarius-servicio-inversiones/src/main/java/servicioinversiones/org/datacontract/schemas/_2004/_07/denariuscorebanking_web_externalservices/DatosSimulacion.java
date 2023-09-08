
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosSimulacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosSimulacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Interes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeImpuesto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RangoPlazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaNominal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalRecibirInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosSimulacion", propOrder = {
    "impuesto",
    "interes",
    "porcentajeImpuesto",
    "rangoPlazo",
    "tasaEfectiva",
    "tasaNominal",
    "totalRecibirInteres"
})
public class DatosSimulacion {

    @XmlElement(name = "Impuesto")
    protected BigDecimal impuesto;
    @XmlElement(name = "Interes")
    protected BigDecimal interes;
    @XmlElement(name = "PorcentajeImpuesto")
    protected BigDecimal porcentajeImpuesto;
    @XmlElementRef(name = "RangoPlazo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rangoPlazo;
    @XmlElement(name = "TasaEfectiva")
    protected BigDecimal tasaEfectiva;
    @XmlElement(name = "TasaNominal")
    protected BigDecimal tasaNominal;
    @XmlElement(name = "TotalRecibirInteres")
    protected BigDecimal totalRecibirInteres;

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpuesto(BigDecimal value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad interes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteres() {
        return interes;
    }

    /**
     * Define el valor de la propiedad interes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteres(BigDecimal value) {
        this.interes = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    /**
     * Define el valor de la propiedad porcentajeImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeImpuesto(BigDecimal value) {
        this.porcentajeImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad rangoPlazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRangoPlazo() {
        return rangoPlazo;
    }

    /**
     * Define el valor de la propiedad rangoPlazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRangoPlazo(JAXBElement<String> value) {
        this.rangoPlazo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaEfectiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaEfectiva() {
        return tasaEfectiva;
    }

    /**
     * Define el valor de la propiedad tasaEfectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaEfectiva(BigDecimal value) {
        this.tasaEfectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaNominal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaNominal() {
        return tasaNominal;
    }

    /**
     * Define el valor de la propiedad tasaNominal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaNominal(BigDecimal value) {
        this.tasaNominal = value;
    }

    /**
     * Obtiene el valor de la propiedad totalRecibirInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalRecibirInteres() {
        return totalRecibirInteres;
    }

    /**
     * Define el valor de la propiedad totalRecibirInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalRecibirInteres(BigDecimal value) {
        this.totalRecibirInteres = value;
    }

}
