
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERelacionCliente;


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
 *         &lt;element name="meRelacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MERelacionCliente" minOccurs="0"/&gt;
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
    "meRelacion"
})
@XmlRootElement(name = "RegistrarRelacion")
public class RegistrarRelacion {

    @XmlElementRef(name = "meRelacion", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MERelacionCliente> meRelacion;

    /**
     * Obtiene el valor de la propiedad meRelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     *     
     */
    public JAXBElement<MERelacionCliente> getMeRelacion() {
        return meRelacion;
    }

    /**
     * Define el valor de la propiedad meRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     *     
     */
    public void setMeRelacion(JAXBElement<MERelacionCliente> value) {
        this.meRelacion = value;
    }

}
