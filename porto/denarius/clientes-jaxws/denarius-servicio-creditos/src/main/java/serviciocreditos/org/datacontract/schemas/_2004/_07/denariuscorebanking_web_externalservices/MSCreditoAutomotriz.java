
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSCreditoAutomotriz complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSCreditoAutomotriz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cotizacion1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Cotizacion2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Cotizacion3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Cotizacion4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Cotizacion5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IdPresolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSCreditoAutomotriz", propOrder = {
    "cotizacion1",
    "cotizacion2",
    "cotizacion3",
    "cotizacion4",
    "cotizacion5",
    "idPresolicitud"
})
public class MSCreditoAutomotriz
    extends MensajeSalidaBase
{

    @XmlElement(name = "Cotizacion1")
    protected BigDecimal cotizacion1;
    @XmlElement(name = "Cotizacion2")
    protected BigDecimal cotizacion2;
    @XmlElement(name = "Cotizacion3")
    protected BigDecimal cotizacion3;
    @XmlElement(name = "Cotizacion4")
    protected BigDecimal cotizacion4;
    @XmlElement(name = "Cotizacion5")
    protected BigDecimal cotizacion5;
    @XmlElementRef(name = "IdPresolicitud", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idPresolicitud;

    /**
     * Obtiene el valor de la propiedad cotizacion1.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacion1() {
        return cotizacion1;
    }

    /**
     * Define el valor de la propiedad cotizacion1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacion1(BigDecimal value) {
        this.cotizacion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacion2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacion2() {
        return cotizacion2;
    }

    /**
     * Define el valor de la propiedad cotizacion2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacion2(BigDecimal value) {
        this.cotizacion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacion3.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacion3() {
        return cotizacion3;
    }

    /**
     * Define el valor de la propiedad cotizacion3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacion3(BigDecimal value) {
        this.cotizacion3 = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacion4.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacion4() {
        return cotizacion4;
    }

    /**
     * Define el valor de la propiedad cotizacion4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacion4(BigDecimal value) {
        this.cotizacion4 = value;
    }

    /**
     * Obtiene el valor de la propiedad cotizacion5.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCotizacion5() {
        return cotizacion5;
    }

    /**
     * Define el valor de la propiedad cotizacion5.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCotizacion5(BigDecimal value) {
        this.cotizacion5 = value;
    }

    /**
     * Obtiene el valor de la propiedad idPresolicitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdPresolicitud() {
        return idPresolicitud;
    }

    /**
     * Define el valor de la propiedad idPresolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdPresolicitud(JAXBElement<String> value) {
        this.idPresolicitud = value;
    }

}
