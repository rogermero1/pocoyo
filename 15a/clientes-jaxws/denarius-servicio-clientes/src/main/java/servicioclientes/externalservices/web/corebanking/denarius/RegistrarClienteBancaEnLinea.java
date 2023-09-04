
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEIdentificacion;


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
 *         &lt;element name="meRegistro" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEIdentificacion" minOccurs="0"/&gt;
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
    "meRegistro"
})
@XmlRootElement(name = "RegistrarClienteBancaEnLinea")
public class RegistrarClienteBancaEnLinea {

    @XmlElementRef(name = "meRegistro", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEIdentificacion> meRegistro;

    /**
     * Obtiene el valor de la propiedad meRegistro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     *     
     */
    public JAXBElement<MEIdentificacion> getMeRegistro() {
        return meRegistro;
    }

    /**
     * Define el valor de la propiedad meRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     *     
     */
    public void setMeRegistro(JAXBElement<MEIdentificacion> value) {
        this.meRegistro = value;
    }

}
