
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MENdNc complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MENdNc"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NdNc" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}NotaDebitoCredito" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MENdNc", propOrder = {
    "ndNc"
})
public class MENdNc
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "NdNc", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<NotaDebitoCredito> ndNc;

    /**
     * Obtiene el valor de la propiedad ndNc.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     *     
     */
    public JAXBElement<NotaDebitoCredito> getNdNc() {
        return ndNc;
    }

    /**
     * Define el valor de la propiedad ndNc.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     *     
     */
    public void setNdNc(JAXBElement<NotaDebitoCredito> value) {
        this.ndNc = value;
    }

}
