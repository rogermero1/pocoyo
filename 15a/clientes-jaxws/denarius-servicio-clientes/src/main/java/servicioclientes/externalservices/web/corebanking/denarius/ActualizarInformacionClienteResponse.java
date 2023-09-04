
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
 *         &lt;element name="ActualizarInformacionClienteResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase" minOccurs="0"/&gt;
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
    "actualizarInformacionClienteResult"
})
@XmlRootElement(name = "ActualizarInformacionClienteResponse")
public class ActualizarInformacionClienteResponse {

    @XmlElementRef(name = "ActualizarInformacionClienteResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeSalidaBase> actualizarInformacionClienteResult;

    /**
     * Obtiene el valor de la propiedad actualizarInformacionClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeSalidaBase> getActualizarInformacionClienteResult() {
        return actualizarInformacionClienteResult;
    }

    /**
     * Define el valor de la propiedad actualizarInformacionClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public void setActualizarInformacionClienteResult(JAXBElement<MensajeSalidaBase> value) {
        this.actualizarInformacionClienteResult = value;
    }

}
