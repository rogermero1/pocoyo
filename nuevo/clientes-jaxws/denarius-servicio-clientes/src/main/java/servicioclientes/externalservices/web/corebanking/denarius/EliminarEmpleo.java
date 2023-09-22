
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEEmpleo;


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
 *         &lt;element name="meEmpleo" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEEmpleo" minOccurs="0"/&gt;
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
    "meEmpleo"
})
@XmlRootElement(name = "EliminarEmpleo")
public class EliminarEmpleo {

    @XmlElementRef(name = "meEmpleo", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEEmpleo> meEmpleo;

    /**
     * Obtiene el valor de la propiedad meEmpleo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     *     
     */
    public JAXBElement<MEEmpleo> getMeEmpleo() {
        return meEmpleo;
    }

    /**
     * Define el valor de la propiedad meEmpleo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     *     
     */
    public void setMeEmpleo(JAXBElement<MEEmpleo> value) {
        this.meEmpleo = value;
    }

}
