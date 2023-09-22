
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


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
 *         &lt;element name="RegistrarClienteBancaEnLineaResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase" minOccurs="0"/&gt;
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
    "registrarClienteBancaEnLineaResult"
})
@XmlRootElement(name = "RegistrarClienteBancaEnLineaResponse")
public class RegistrarClienteBancaEnLineaResponse {

    @XmlElementRef(name = "RegistrarClienteBancaEnLineaResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeSalidaBase> registrarClienteBancaEnLineaResult;

    /**
     * Obtiene el valor de la propiedad registrarClienteBancaEnLineaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeSalidaBase> getRegistrarClienteBancaEnLineaResult() {
        return registrarClienteBancaEnLineaResult;
    }

    /**
     * Define el valor de la propiedad registrarClienteBancaEnLineaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public void setRegistrarClienteBancaEnLineaResult(JAXBElement<MensajeSalidaBase> value) {
        this.registrarClienteBancaEnLineaResult = value;
    }

}
