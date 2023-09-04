
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDocumentoCuenta;


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
 *         &lt;element name="ReimprimirContratoCuentaResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSDocumentoCuenta" minOccurs="0"/&gt;
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
    "reimprimirContratoCuentaResult"
})
@XmlRootElement(name = "ReimprimirContratoCuentaResponse")
public class ReimprimirContratoCuentaResponse {

    @XmlElementRef(name = "ReimprimirContratoCuentaResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDocumentoCuenta> reimprimirContratoCuentaResult;

    /**
     * Obtiene el valor de la propiedad reimprimirContratoCuentaResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     *     
     */
    public JAXBElement<MSDocumentoCuenta> getReimprimirContratoCuentaResult() {
        return reimprimirContratoCuentaResult;
    }

    /**
     * Define el valor de la propiedad reimprimirContratoCuentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     *     
     */
    public void setReimprimirContratoCuentaResult(JAXBElement<MSDocumentoCuenta> value) {
        this.reimprimirContratoCuentaResult = value;
    }

}
