
package servicioinversiones.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDetalleInversion;


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
 *         &lt;element name="ConsultarDetalleInversionResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}MSDetalleInversion" minOccurs="0"/&gt;
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
    "consultarDetalleInversionResult"
})
@XmlRootElement(name = "ConsultarDetalleInversionResponse")
public class ConsultarDetalleInversionResponse {

    @XmlElementRef(name = "ConsultarDetalleInversionResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDetalleInversion> consultarDetalleInversionResult;

    /**
     * Obtiene el valor de la propiedad consultarDetalleInversionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     *     
     */
    public JAXBElement<MSDetalleInversion> getConsultarDetalleInversionResult() {
        return consultarDetalleInversionResult;
    }

    /**
     * Define el valor de la propiedad consultarDetalleInversionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     *     
     */
    public void setConsultarDetalleInversionResult(JAXBElement<MSDetalleInversion> value) {
        this.consultarDetalleInversionResult = value;
    }

}
