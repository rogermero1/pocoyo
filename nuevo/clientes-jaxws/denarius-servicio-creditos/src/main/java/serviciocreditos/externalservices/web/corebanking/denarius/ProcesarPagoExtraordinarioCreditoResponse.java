
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSResultadoPagoCredito;


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
 *         &lt;element name="ProcesarPagoExtraordinarioCreditoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSResultadoPagoCredito" minOccurs="0"/&gt;
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
    "procesarPagoExtraordinarioCreditoResult"
})
@XmlRootElement(name = "ProcesarPagoExtraordinarioCreditoResponse")
public class ProcesarPagoExtraordinarioCreditoResponse {

    @XmlElementRef(name = "ProcesarPagoExtraordinarioCreditoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSResultadoPagoCredito> procesarPagoExtraordinarioCreditoResult;

    /**
     * Obtiene el valor de la propiedad procesarPagoExtraordinarioCreditoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     *     
     */
    public JAXBElement<MSResultadoPagoCredito> getProcesarPagoExtraordinarioCreditoResult() {
        return procesarPagoExtraordinarioCreditoResult;
    }

    /**
     * Define el valor de la propiedad procesarPagoExtraordinarioCreditoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     *     
     */
    public void setProcesarPagoExtraordinarioCreditoResult(JAXBElement<MSResultadoPagoCredito> value) {
        this.procesarPagoExtraordinarioCreditoResult = value;
    }

}
