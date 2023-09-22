
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSTransaccionCanales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSTransaccionCanales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransaccionCanales" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}TransaccionCanales" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSTransaccionCanales", propOrder = {
    "transaccionCanales"
})
public class MSTransaccionCanales
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "TransaccionCanales", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<TransaccionCanales> transaccionCanales;

    /**
     * Obtiene el valor de la propiedad transaccionCanales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     *     
     */
    public JAXBElement<TransaccionCanales> getTransaccionCanales() {
        return transaccionCanales;
    }

    /**
     * Define el valor de la propiedad transaccionCanales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     *     
     */
    public void setTransaccionCanales(JAXBElement<TransaccionCanales> value) {
        this.transaccionCanales = value;
    }

}
