
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaTarjetaDebito;


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
 *         &lt;element name="ConsultarSaldoTarjetaDebitoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSConsultaTarjetaDebito" minOccurs="0"/&gt;
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
    "consultarSaldoTarjetaDebitoResult"
})
@XmlRootElement(name = "ConsultarSaldoTarjetaDebitoResponse")
public class ConsultarSaldoTarjetaDebitoResponse {

    @XmlElementRef(name = "ConsultarSaldoTarjetaDebitoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultaTarjetaDebito> consultarSaldoTarjetaDebitoResult;

    /**
     * Obtiene el valor de la propiedad consultarSaldoTarjetaDebitoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     *     
     */
    public JAXBElement<MSConsultaTarjetaDebito> getConsultarSaldoTarjetaDebitoResult() {
        return consultarSaldoTarjetaDebitoResult;
    }

    /**
     * Define el valor de la propiedad consultarSaldoTarjetaDebitoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     *     
     */
    public void setConsultarSaldoTarjetaDebitoResult(JAXBElement<MSConsultaTarjetaDebito> value) {
        this.consultarSaldoTarjetaDebitoResult = value;
    }

}
