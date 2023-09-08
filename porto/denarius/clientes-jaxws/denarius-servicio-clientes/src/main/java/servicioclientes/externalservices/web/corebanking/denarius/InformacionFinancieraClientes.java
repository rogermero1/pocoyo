
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionFinancieraCliente;


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
 *         &lt;element name="meConsultaCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEInformacionFinancieraCliente" minOccurs="0"/&gt;
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
    "meConsultaCliente"
})
@XmlRootElement(name = "InformacionFinancieraClientes")
public class InformacionFinancieraClientes {

    @XmlElementRef(name = "meConsultaCliente", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEInformacionFinancieraCliente> meConsultaCliente;

    /**
     * Obtiene el valor de la propiedad meConsultaCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     *     
     */
    public JAXBElement<MEInformacionFinancieraCliente> getMeConsultaCliente() {
        return meConsultaCliente;
    }

    /**
     * Define el valor de la propiedad meConsultaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     *     
     */
    public void setMeConsultaCliente(JAXBElement<MEInformacionFinancieraCliente> value) {
        this.meConsultaCliente = value;
    }

}
