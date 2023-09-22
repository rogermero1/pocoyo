
package servicioinversiones.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosInversionCliente;


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
 *         &lt;element name="SimularInversionClienteResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}MSDatosInversionCliente" minOccurs="0"/&gt;
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
    "simularInversionClienteResult"
})
@XmlRootElement(name = "SimularInversionClienteResponse")
public class SimularInversionClienteResponse {

    @XmlElementRef(name = "SimularInversionClienteResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDatosInversionCliente> simularInversionClienteResult;

    /**
     * Obtiene el valor de la propiedad simularInversionClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     *     
     */
    public JAXBElement<MSDatosInversionCliente> getSimularInversionClienteResult() {
        return simularInversionClienteResult;
    }

    /**
     * Define el valor de la propiedad simularInversionClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     *     
     */
    public void setSimularInversionClienteResult(JAXBElement<MSDatosInversionCliente> value) {
        this.simularInversionClienteResult = value;
    }

}
