
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionCorresponsales;


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
 *         &lt;element name="EjecutarTransaccionCorresponsalesResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSTransaccionCorresponsales" minOccurs="0"/&gt;
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
    "ejecutarTransaccionCorresponsalesResult"
})
@XmlRootElement(name = "EjecutarTransaccionCorresponsalesResponse")
public class EjecutarTransaccionCorresponsalesResponse {

    @XmlElementRef(name = "EjecutarTransaccionCorresponsalesResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSTransaccionCorresponsales> ejecutarTransaccionCorresponsalesResult;

    /**
     * Obtiene el valor de la propiedad ejecutarTransaccionCorresponsalesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     *     
     */
    public JAXBElement<MSTransaccionCorresponsales> getEjecutarTransaccionCorresponsalesResult() {
        return ejecutarTransaccionCorresponsalesResult;
    }

    /**
     * Define el valor de la propiedad ejecutarTransaccionCorresponsalesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     *     
     */
    public void setEjecutarTransaccionCorresponsalesResult(JAXBElement<MSTransaccionCorresponsales> value) {
        this.ejecutarTransaccionCorresponsalesResult = value;
    }

}
