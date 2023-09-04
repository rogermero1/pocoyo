
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSEvaluacionEconomica;


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
 *         &lt;element name="RecuperarInformacionEvaluacionResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSEvaluacionEconomica" minOccurs="0"/&gt;
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
    "recuperarInformacionEvaluacionResult"
})
@XmlRootElement(name = "RecuperarInformacionEvaluacionResponse")
public class RecuperarInformacionEvaluacionResponse {

    @XmlElementRef(name = "RecuperarInformacionEvaluacionResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSEvaluacionEconomica> recuperarInformacionEvaluacionResult;

    /**
     * Obtiene el valor de la propiedad recuperarInformacionEvaluacionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     *     
     */
    public JAXBElement<MSEvaluacionEconomica> getRecuperarInformacionEvaluacionResult() {
        return recuperarInformacionEvaluacionResult;
    }

    /**
     * Define el valor de la propiedad recuperarInformacionEvaluacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     *     
     */
    public void setRecuperarInformacionEvaluacionResult(JAXBElement<MSEvaluacionEconomica> value) {
        this.recuperarInformacionEvaluacionResult = value;
    }

}
