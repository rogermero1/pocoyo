
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditos;


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
 *         &lt;element name="ValidarGarantiasCruzadasResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSCreditos" minOccurs="0"/&gt;
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
    "validarGarantiasCruzadasResult"
})
@XmlRootElement(name = "ValidarGarantiasCruzadasResponse")
public class ValidarGarantiasCruzadasResponse {

    @XmlElementRef(name = "ValidarGarantiasCruzadasResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSCreditos> validarGarantiasCruzadasResult;

    /**
     * Obtiene el valor de la propiedad validarGarantiasCruzadasResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     *     
     */
    public JAXBElement<MSCreditos> getValidarGarantiasCruzadasResult() {
        return validarGarantiasCruzadasResult;
    }

    /**
     * Define el valor de la propiedad validarGarantiasCruzadasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     *     
     */
    public void setValidarGarantiasCruzadasResult(JAXBElement<MSCreditos> value) {
        this.validarGarantiasCruzadasResult = value;
    }

}
