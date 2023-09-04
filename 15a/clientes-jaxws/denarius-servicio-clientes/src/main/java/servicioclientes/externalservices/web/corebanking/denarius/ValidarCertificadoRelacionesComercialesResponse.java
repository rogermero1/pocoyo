
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
 *         &lt;element name="ValidarCertificadoRelacionesComercialesResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase" minOccurs="0"/&gt;
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
    "validarCertificadoRelacionesComercialesResult"
})
@XmlRootElement(name = "ValidarCertificadoRelacionesComercialesResponse")
public class ValidarCertificadoRelacionesComercialesResponse {

    @XmlElementRef(name = "ValidarCertificadoRelacionesComercialesResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeSalidaBase> validarCertificadoRelacionesComercialesResult;

    /**
     * Obtiene el valor de la propiedad validarCertificadoRelacionesComercialesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeSalidaBase> getValidarCertificadoRelacionesComercialesResult() {
        return validarCertificadoRelacionesComercialesResult;
    }

    /**
     * Define el valor de la propiedad validarCertificadoRelacionesComercialesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public void setValidarCertificadoRelacionesComercialesResult(JAXBElement<MensajeSalidaBase> value) {
        this.validarCertificadoRelacionesComercialesResult = value;
    }

}
