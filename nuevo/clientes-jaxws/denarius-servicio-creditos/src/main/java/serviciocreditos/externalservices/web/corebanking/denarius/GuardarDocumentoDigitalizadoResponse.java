
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


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
 *         &lt;element name="GuardarDocumentoDigitalizadoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase" minOccurs="0"/&gt;
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
    "guardarDocumentoDigitalizadoResult"
})
@XmlRootElement(name = "GuardarDocumentoDigitalizadoResponse")
public class GuardarDocumentoDigitalizadoResponse {

    @XmlElementRef(name = "GuardarDocumentoDigitalizadoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeSalidaBase> guardarDocumentoDigitalizadoResult;

    /**
     * Obtiene el valor de la propiedad guardarDocumentoDigitalizadoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeSalidaBase> getGuardarDocumentoDigitalizadoResult() {
        return guardarDocumentoDigitalizadoResult;
    }

    /**
     * Define el valor de la propiedad guardarDocumentoDigitalizadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public void setGuardarDocumentoDigitalizadoResult(JAXBElement<MensajeSalidaBase> value) {
        this.guardarDocumentoDigitalizadoResult = value;
    }

}
