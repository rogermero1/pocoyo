
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEReasignacionGarantia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEReasignacionGarantia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoGarantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteNuevo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroTramiteOriginal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEReasignacionGarantia", propOrder = {
    "codigoGarantia",
    "numeroTramiteNuevo",
    "numeroTramiteOriginal"
})
public class MEReasignacionGarantia
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoGarantia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoGarantia;
    @XmlElement(name = "NumeroTramiteNuevo")
    protected Integer numeroTramiteNuevo;
    @XmlElement(name = "NumeroTramiteOriginal")
    protected Integer numeroTramiteOriginal;

    /**
     * Obtiene el valor de la propiedad codigoGarantia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoGarantia() {
        return codigoGarantia;
    }

    /**
     * Define el valor de la propiedad codigoGarantia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoGarantia(JAXBElement<String> value) {
        this.codigoGarantia = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTramiteNuevo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTramiteNuevo() {
        return numeroTramiteNuevo;
    }

    /**
     * Define el valor de la propiedad numeroTramiteNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTramiteNuevo(Integer value) {
        this.numeroTramiteNuevo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroTramiteOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTramiteOriginal() {
        return numeroTramiteOriginal;
    }

    /**
     * Define el valor de la propiedad numeroTramiteOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTramiteOriginal(Integer value) {
        this.numeroTramiteOriginal = value;
    }

}
