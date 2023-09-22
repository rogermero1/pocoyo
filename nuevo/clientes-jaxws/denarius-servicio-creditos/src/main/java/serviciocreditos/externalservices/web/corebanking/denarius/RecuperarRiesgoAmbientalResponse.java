
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSRiesgoAmbiental;


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
 *         &lt;element name="RecuperarRiesgoAmbientalResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSRiesgoAmbiental" minOccurs="0"/&gt;
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
    "recuperarRiesgoAmbientalResult"
})
@XmlRootElement(name = "RecuperarRiesgoAmbientalResponse")
public class RecuperarRiesgoAmbientalResponse {

    @XmlElementRef(name = "RecuperarRiesgoAmbientalResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSRiesgoAmbiental> recuperarRiesgoAmbientalResult;

    /**
     * Obtiene el valor de la propiedad recuperarRiesgoAmbientalResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     *     
     */
    public JAXBElement<MSRiesgoAmbiental> getRecuperarRiesgoAmbientalResult() {
        return recuperarRiesgoAmbientalResult;
    }

    /**
     * Define el valor de la propiedad recuperarRiesgoAmbientalResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     *     
     */
    public void setRecuperarRiesgoAmbientalResult(JAXBElement<MSRiesgoAmbiental> value) {
        this.recuperarRiesgoAmbientalResult = value;
    }

}
