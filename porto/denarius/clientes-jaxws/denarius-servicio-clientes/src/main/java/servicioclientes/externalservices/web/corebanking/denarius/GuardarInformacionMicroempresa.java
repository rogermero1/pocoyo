
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionMicroempresa;


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
 *         &lt;element name="meInformacionMicroempresa" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEInformacionMicroempresa" minOccurs="0"/&gt;
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
    "meInformacionMicroempresa"
})
@XmlRootElement(name = "GuardarInformacionMicroempresa")
public class GuardarInformacionMicroempresa {

    @XmlElementRef(name = "meInformacionMicroempresa", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEInformacionMicroempresa> meInformacionMicroempresa;

    /**
     * Obtiene el valor de la propiedad meInformacionMicroempresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     *     
     */
    public JAXBElement<MEInformacionMicroempresa> getMeInformacionMicroempresa() {
        return meInformacionMicroempresa;
    }

    /**
     * Define el valor de la propiedad meInformacionMicroempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     *     
     */
    public void setMeInformacionMicroempresa(JAXBElement<MEInformacionMicroempresa> value) {
        this.meInformacionMicroempresa = value;
    }

}
