
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosUsuario;


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
 *         &lt;element name="ConsultarUsuarioResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSDatosUsuario" minOccurs="0"/&gt;
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
    "consultarUsuarioResult"
})
@XmlRootElement(name = "ConsultarUsuarioResponse")
public class ConsultarUsuarioResponse {

    @XmlElementRef(name = "ConsultarUsuarioResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDatosUsuario> consultarUsuarioResult;

    /**
     * Obtiene el valor de la propiedad consultarUsuarioResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     *     
     */
    public JAXBElement<MSDatosUsuario> getConsultarUsuarioResult() {
        return consultarUsuarioResult;
    }

    /**
     * Define el valor de la propiedad consultarUsuarioResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     *     
     */
    public void setConsultarUsuarioResult(JAXBElement<MSDatosUsuario> value) {
        this.consultarUsuarioResult = value;
    }

}
