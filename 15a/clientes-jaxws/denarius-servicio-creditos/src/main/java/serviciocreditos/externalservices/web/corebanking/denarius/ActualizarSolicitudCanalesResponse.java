
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditoCanales;


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
 *         &lt;element name="ActualizarSolicitudCanalesResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSCreditoCanales" minOccurs="0"/&gt;
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
    "actualizarSolicitudCanalesResult"
})
@XmlRootElement(name = "ActualizarSolicitudCanalesResponse")
public class ActualizarSolicitudCanalesResponse {

    @XmlElementRef(name = "ActualizarSolicitudCanalesResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSCreditoCanales> actualizarSolicitudCanalesResult;

    /**
     * Obtiene el valor de la propiedad actualizarSolicitudCanalesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     *     
     */
    public JAXBElement<MSCreditoCanales> getActualizarSolicitudCanalesResult() {
        return actualizarSolicitudCanalesResult;
    }

    /**
     * Define el valor de la propiedad actualizarSolicitudCanalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     *     
     */
    public void setActualizarSolicitudCanalesResult(JAXBElement<MSCreditoCanales> value) {
        this.actualizarSolicitudCanalesResult = value;
    }

}
