
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasDatosCuenta;


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
 *         &lt;element name="ConsultarInformacionClienteResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSConsultasDatosCuenta" minOccurs="0"/&gt;
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
    "consultarInformacionClienteResult"
})
@XmlRootElement(name = "ConsultarInformacionClienteResponse")
public class ConsultarInformacionClienteResponse {

    @XmlElementRef(name = "ConsultarInformacionClienteResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSConsultasDatosCuenta> consultarInformacionClienteResult;

    /**
     * Obtiene el valor de la propiedad consultarInformacionClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     *     
     */
    public JAXBElement<MSConsultasDatosCuenta> getConsultarInformacionClienteResult() {
        return consultarInformacionClienteResult;
    }

    /**
     * Define el valor de la propiedad consultarInformacionClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     *     
     */
    public void setConsultarInformacionClienteResult(JAXBElement<MSConsultasDatosCuenta> value) {
        this.consultarInformacionClienteResult = value;
    }

}
