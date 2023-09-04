
package servicioinversiones.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSSimulacionInversion;


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
 *         &lt;element name="SimularInversionResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}MSSimulacionInversion" minOccurs="0"/&gt;
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
    "simularInversionResult"
})
@XmlRootElement(name = "SimularInversionResponse")
public class SimularInversionResponse {

    @XmlElementRef(name = "SimularInversionResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSSimulacionInversion> simularInversionResult;

    /**
     * Obtiene el valor de la propiedad simularInversionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     *     
     */
    public JAXBElement<MSSimulacionInversion> getSimularInversionResult() {
        return simularInversionResult;
    }

    /**
     * Define el valor de la propiedad simularInversionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     *     
     */
    public void setSimularInversionResult(JAXBElement<MSSimulacionInversion> value) {
        this.simularInversionResult = value;
    }

}
