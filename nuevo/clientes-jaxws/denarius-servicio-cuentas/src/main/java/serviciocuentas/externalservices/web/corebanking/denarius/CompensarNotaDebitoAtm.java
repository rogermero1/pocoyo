
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReversoNdNc;


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
 *         &lt;element name="meDebito" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MEReversoNdNc" minOccurs="0"/&gt;
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
    "meDebito"
})
@XmlRootElement(name = "CompensarNotaDebitoAtm")
public class CompensarNotaDebitoAtm {

    @XmlElementRef(name = "meDebito", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEReversoNdNc> meDebito;

    /**
     * Obtiene el valor de la propiedad meDebito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     *     
     */
    public JAXBElement<MEReversoNdNc> getMeDebito() {
        return meDebito;
    }

    /**
     * Define el valor de la propiedad meDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     *     
     */
    public void setMeDebito(JAXBElement<MEReversoNdNc> value) {
        this.meDebito = value;
    }

}
