
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;


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
 *         &lt;element name="meConsulta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEConsultasCliente" minOccurs="0"/&gt;
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
    "meConsulta"
})
@XmlRootElement(name = "ConsultarDatosCliente")
public class ConsultarDatosCliente {

    @XmlElementRef(name = "meConsulta", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEConsultasCliente> meConsulta;

    /**
     * Obtiene el valor de la propiedad meConsulta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     *     
     */
    public JAXBElement<MEConsultasCliente> getMeConsulta() {
        return meConsulta;
    }

    /**
     * Define el valor de la propiedad meConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     *     
     */
    public void setMeConsulta(JAXBElement<MEConsultasCliente> value) {
        this.meConsulta = value;
    }

}
