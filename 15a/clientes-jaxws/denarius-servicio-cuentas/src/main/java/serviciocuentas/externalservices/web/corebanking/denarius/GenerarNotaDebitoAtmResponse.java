
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaDebitoAtm;


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
 *         &lt;element name="GenerarNotaDebitoAtmResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSNotaDebitoAtm" minOccurs="0"/&gt;
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
    "generarNotaDebitoAtmResult"
})
@XmlRootElement(name = "GenerarNotaDebitoAtmResponse")
public class GenerarNotaDebitoAtmResponse {

    @XmlElementRef(name = "GenerarNotaDebitoAtmResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSNotaDebitoAtm> generarNotaDebitoAtmResult;

    /**
     * Obtiene el valor de la propiedad generarNotaDebitoAtmResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     *     
     */
    public JAXBElement<MSNotaDebitoAtm> getGenerarNotaDebitoAtmResult() {
        return generarNotaDebitoAtmResult;
    }

    /**
     * Define el valor de la propiedad generarNotaDebitoAtmResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     *     
     */
    public void setGenerarNotaDebitoAtmResult(JAXBElement<MSNotaDebitoAtm> value) {
        this.generarNotaDebitoAtmResult = value;
    }

}
