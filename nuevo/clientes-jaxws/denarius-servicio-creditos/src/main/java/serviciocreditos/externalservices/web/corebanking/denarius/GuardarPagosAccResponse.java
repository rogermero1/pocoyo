
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSRegistroPago;


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
 *         &lt;element name="GuardarPagosAccResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSRegistroPago" minOccurs="0"/&gt;
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
    "guardarPagosAccResult"
})
@XmlRootElement(name = "GuardarPagosAccResponse")
public class GuardarPagosAccResponse {

    @XmlElementRef(name = "GuardarPagosAccResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSRegistroPago> guardarPagosAccResult;

    /**
     * Obtiene el valor de la propiedad guardarPagosAccResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     *     
     */
    public JAXBElement<MSRegistroPago> getGuardarPagosAccResult() {
        return guardarPagosAccResult;
    }

    /**
     * Define el valor de la propiedad guardarPagosAccResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     *     
     */
    public void setGuardarPagosAccResult(JAXBElement<MSRegistroPago> value) {
        this.guardarPagosAccResult = value;
    }

}
