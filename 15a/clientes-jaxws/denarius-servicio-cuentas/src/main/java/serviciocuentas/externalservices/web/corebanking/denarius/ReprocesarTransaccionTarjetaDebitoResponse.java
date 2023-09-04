
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


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
 *         &lt;element name="ReprocesarTransaccionTarjetaDebitoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase" minOccurs="0"/&gt;
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
    "reprocesarTransaccionTarjetaDebitoResult"
})
@XmlRootElement(name = "ReprocesarTransaccionTarjetaDebitoResponse")
public class ReprocesarTransaccionTarjetaDebitoResponse {

    @XmlElementRef(name = "ReprocesarTransaccionTarjetaDebitoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MensajeSalidaBase> reprocesarTransaccionTarjetaDebitoResult;

    /**
     * Obtiene el valor de la propiedad reprocesarTransaccionTarjetaDebitoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public JAXBElement<MensajeSalidaBase> getReprocesarTransaccionTarjetaDebitoResult() {
        return reprocesarTransaccionTarjetaDebitoResult;
    }

    /**
     * Define el valor de la propiedad reprocesarTransaccionTarjetaDebitoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     *     
     */
    public void setReprocesarTransaccionTarjetaDebitoResult(JAXBElement<MensajeSalidaBase> value) {
        this.reprocesarTransaccionTarjetaDebitoResult = value;
    }

}
