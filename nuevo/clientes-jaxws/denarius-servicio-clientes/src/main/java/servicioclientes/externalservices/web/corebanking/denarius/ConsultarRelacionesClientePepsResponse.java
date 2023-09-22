
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaRelaciones;


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
 *         &lt;element name="ConsultarRelacionesClientePepsResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MSConsultaRelaciones" minOccurs="0"/&gt;
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
    "consultarRelacionesClientePepsResult"
})
@XmlRootElement(name = "ConsultarRelacionesClientePepsResponse")
public class ConsultarRelacionesClientePepsResponse {

    @XmlElementRef(name = "ConsultarRelacionesClientePepsResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultaRelaciones> consultarRelacionesClientePepsResult;

    /**
     * Obtiene el valor de la propiedad consultarRelacionesClientePepsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     *     
     */
    public JAXBElement<MSConsultaRelaciones> getConsultarRelacionesClientePepsResult() {
        return consultarRelacionesClientePepsResult;
    }

    /**
     * Define el valor de la propiedad consultarRelacionesClientePepsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     *     
     */
    public void setConsultarRelacionesClientePepsResult(JAXBElement<MSConsultaRelaciones> value) {
        this.consultarRelacionesClientePepsResult = value;
    }

}
