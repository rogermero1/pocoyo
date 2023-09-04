
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaCelular;


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
 *         &lt;element name="ConsultaDatosCelularResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MSConsultaCelular" minOccurs="0"/&gt;
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
    "consultaDatosCelularResult"
})
@XmlRootElement(name = "ConsultaDatosCelularResponse")
public class ConsultaDatosCelularResponse {

    @XmlElementRef(name = "ConsultaDatosCelularResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultaCelular> consultaDatosCelularResult;

    /**
     * Obtiene el valor de la propiedad consultaDatosCelularResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     *     
     */
    public JAXBElement<MSConsultaCelular> getConsultaDatosCelularResult() {
        return consultaDatosCelularResult;
    }

    /**
     * Define el valor de la propiedad consultaDatosCelularResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     *     
     */
    public void setConsultaDatosCelularResult(JAXBElement<MSConsultaCelular> value) {
        this.consultaDatosCelularResult = value;
    }

}
