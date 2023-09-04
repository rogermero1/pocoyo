
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCtaAhorros;


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
 *         &lt;element name="DevolverCuentaParaCreditoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSConsultasCtaAhorros" minOccurs="0"/&gt;
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
    "devolverCuentaParaCreditoResult"
})
@XmlRootElement(name = "DevolverCuentaParaCreditoResponse")
public class DevolverCuentaParaCreditoResponse {

    @XmlElementRef(name = "DevolverCuentaParaCreditoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultasCtaAhorros> devolverCuentaParaCreditoResult;

    /**
     * Obtiene el valor de la propiedad devolverCuentaParaCreditoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     *     
     */
    public JAXBElement<MSConsultasCtaAhorros> getDevolverCuentaParaCreditoResult() {
        return devolverCuentaParaCreditoResult;
    }

    /**
     * Define el valor de la propiedad devolverCuentaParaCreditoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     *     
     */
    public void setDevolverCuentaParaCreditoResult(JAXBElement<MSConsultasCtaAhorros> value) {
        this.devolverCuentaParaCreditoResult = value;
    }

}
