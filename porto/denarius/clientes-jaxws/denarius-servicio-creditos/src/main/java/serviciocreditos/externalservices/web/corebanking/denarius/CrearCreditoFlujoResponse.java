
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditoConsolidado;


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
 *         &lt;element name="CrearCreditoFlujoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSCreditoConsolidado" minOccurs="0"/&gt;
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
    "crearCreditoFlujoResult"
})
@XmlRootElement(name = "CrearCreditoFlujoResponse")
public class CrearCreditoFlujoResponse {

    @XmlElementRef(name = "CrearCreditoFlujoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSCreditoConsolidado> crearCreditoFlujoResult;

    /**
     * Obtiene el valor de la propiedad crearCreditoFlujoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     *     
     */
    public JAXBElement<MSCreditoConsolidado> getCrearCreditoFlujoResult() {
        return crearCreditoFlujoResult;
    }

    /**
     * Define el valor de la propiedad crearCreditoFlujoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     *     
     */
    public void setCrearCreditoFlujoResult(JAXBElement<MSCreditoConsolidado> value) {
        this.crearCreditoFlujoResult = value;
    }

}
