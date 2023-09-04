
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaClientes;


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
 *         &lt;element name="InformacionFinancieraClientesResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MSConsultaClientes" minOccurs="0"/&gt;
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
    "informacionFinancieraClientesResult"
})
@XmlRootElement(name = "InformacionFinancieraClientesResponse")
public class InformacionFinancieraClientesResponse {

    @XmlElementRef(name = "InformacionFinancieraClientesResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultaClientes> informacionFinancieraClientesResult;

    /**
     * Obtiene el valor de la propiedad informacionFinancieraClientesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     *     
     */
    public JAXBElement<MSConsultaClientes> getInformacionFinancieraClientesResult() {
        return informacionFinancieraClientesResult;
    }

    /**
     * Define el valor de la propiedad informacionFinancieraClientesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     *     
     */
    public void setInformacionFinancieraClientesResult(JAXBElement<MSConsultaClientes> value) {
        this.informacionFinancieraClientesResult = value;
    }

}
