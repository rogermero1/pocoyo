
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosContacto;


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
 *         &lt;element name="ActualizarDatosContactoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MSDatosContacto" minOccurs="0"/&gt;
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
    "actualizarDatosContactoResult"
})
@XmlRootElement(name = "ActualizarDatosContactoResponse")
public class ActualizarDatosContactoResponse {

    @XmlElementRef(name = "ActualizarDatosContactoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDatosContacto> actualizarDatosContactoResult;

    /**
     * Obtiene el valor de la propiedad actualizarDatosContactoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     *     
     */
    public JAXBElement<MSDatosContacto> getActualizarDatosContactoResult() {
        return actualizarDatosContactoResult;
    }

    /**
     * Define el valor de la propiedad actualizarDatosContactoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     *     
     */
    public void setActualizarDatosContactoResult(JAXBElement<MSDatosContacto> value) {
        this.actualizarDatosContactoResult = value;
    }

}
