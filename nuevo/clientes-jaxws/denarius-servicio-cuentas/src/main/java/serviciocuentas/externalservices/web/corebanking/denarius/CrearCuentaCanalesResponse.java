
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNumeroCuenta;


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
 *         &lt;element name="CrearCuentaCanalesResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSNumeroCuenta" minOccurs="0"/&gt;
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
    "crearCuentaCanalesResult"
})
@XmlRootElement(name = "CrearCuentaCanalesResponse")
public class CrearCuentaCanalesResponse {

    @XmlElementRef(name = "CrearCuentaCanalesResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSNumeroCuenta> crearCuentaCanalesResult;

    /**
     * Obtiene el valor de la propiedad crearCuentaCanalesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     *     
     */
    public JAXBElement<MSNumeroCuenta> getCrearCuentaCanalesResult() {
        return crearCuentaCanalesResult;
    }

    /**
     * Define el valor de la propiedad crearCuentaCanalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     *     
     */
    public void setCrearCuentaCanalesResult(JAXBElement<MSNumeroCuenta> value) {
        this.crearCuentaCanalesResult = value;
    }

}
