
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFormularioOrigenFondos;


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
 *         &lt;element name="meFormulario" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MEFormularioOrigenFondos" minOccurs="0"/&gt;
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
    "meFormulario"
})
@XmlRootElement(name = "ActualizarFormularioOrigenFondos")
public class ActualizarFormularioOrigenFondos {

    @XmlElementRef(name = "meFormulario", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEFormularioOrigenFondos> meFormulario;

    /**
     * Obtiene el valor de la propiedad meFormulario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     *     
     */
    public JAXBElement<MEFormularioOrigenFondos> getMeFormulario() {
        return meFormulario;
    }

    /**
     * Define el valor de la propiedad meFormulario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     *     
     */
    public void setMeFormulario(JAXBElement<MEFormularioOrigenFondos> value) {
        this.meFormulario = value;
    }

}
