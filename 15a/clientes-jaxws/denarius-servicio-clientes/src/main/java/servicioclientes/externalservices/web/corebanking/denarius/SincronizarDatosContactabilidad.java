
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meBase" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meBase"
})
@XmlRootElement(name = "SincronizarDatosContactabilidad")
public class SincronizarDatosContactabilidad {

    @XmlElementRef(name = "meBase", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeEntradaBase> meBase;

    /**
     * Obtiene el valor de la propiedad meBase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeEntradaBase> getMeBase() {
        return meBase;
    }

    /**
     * Define el valor de la propiedad meBase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     *     
     */
    public void setMeBase(JAXBElement<MensajeEntradaBase> value) {
        this.meBase = value;
    }

}
