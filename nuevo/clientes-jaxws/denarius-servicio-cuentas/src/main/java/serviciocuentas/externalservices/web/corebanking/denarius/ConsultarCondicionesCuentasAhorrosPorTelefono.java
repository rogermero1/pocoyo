
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METelefono;


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
 *         &lt;element name="meTelefono" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}METelefono" minOccurs="0"/&gt;
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
    "meTelefono"
})
@XmlRootElement(name = "ConsultarCondicionesCuentasAhorrosPorTelefono")
public class ConsultarCondicionesCuentasAhorrosPorTelefono {

    @XmlElementRef(name = "meTelefono", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<METelefono> meTelefono;

    /**
     * Obtiene el valor de la propiedad meTelefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     *     
     */
    public JAXBElement<METelefono> getMeTelefono() {
        return meTelefono;
    }

    /**
     * Define el valor de la propiedad meTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     *     
     */
    public void setMeTelefono(JAXBElement<METelefono> value) {
        this.meTelefono = value;
    }

}
