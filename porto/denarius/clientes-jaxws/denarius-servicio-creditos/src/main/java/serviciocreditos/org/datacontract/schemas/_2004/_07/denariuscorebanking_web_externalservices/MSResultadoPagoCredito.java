
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSResultadoPagoCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSResultadoPagoCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapitalPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SegDesPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSResultadoPagoCredito", propOrder = {
    "capitalPagado",
    "interesPagado",
    "moraPagado",
    "otrosPagado",
    "segDesPagado",
    "totalPagado"
})
public class MSResultadoPagoCredito
    extends MensajeSalidaBase
{

    @XmlElement(name = "CapitalPagado")
    protected BigDecimal capitalPagado;
    @XmlElement(name = "InteresPagado")
    protected BigDecimal interesPagado;
    @XmlElement(name = "MoraPagado")
    protected BigDecimal moraPagado;
    @XmlElement(name = "OtrosPagado")
    protected BigDecimal otrosPagado;
    @XmlElement(name = "SegDesPagado")
    protected BigDecimal segDesPagado;
    @XmlElement(name = "TotalPagado")
    protected BigDecimal totalPagado;

    /**
     * Obtiene el valor de la propiedad capitalPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalPagado() {
        return capitalPagado;
    }

    /**
     * Define el valor de la propiedad capitalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalPagado(BigDecimal value) {
        this.capitalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad interesPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresPagado() {
        return interesPagado;
    }

    /**
     * Define el valor de la propiedad interesPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresPagado(BigDecimal value) {
        this.interesPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraPagado() {
        return moraPagado;
    }

    /**
     * Define el valor de la propiedad moraPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraPagado(BigDecimal value) {
        this.moraPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosPagado() {
        return otrosPagado;
    }

    /**
     * Define el valor de la propiedad otrosPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosPagado(BigDecimal value) {
        this.otrosPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad segDesPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegDesPagado() {
        return segDesPagado;
    }

    /**
     * Define el valor de la propiedad segDesPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegDesPagado(BigDecimal value) {
        this.segDesPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPagado() {
        return totalPagado;
    }

    /**
     * Define el valor de la propiedad totalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPagado(BigDecimal value) {
        this.totalPagado = value;
    }

}
