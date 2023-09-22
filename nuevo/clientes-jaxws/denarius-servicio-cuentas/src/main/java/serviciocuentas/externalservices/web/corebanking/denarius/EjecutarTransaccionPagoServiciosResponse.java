
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionPagoServicios;


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
 *         &lt;element name="EjecutarTransaccionPagoServiciosResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSTransaccionPagoServicios" minOccurs="0"/&gt;
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
    "ejecutarTransaccionPagoServiciosResult"
})
@XmlRootElement(name = "EjecutarTransaccionPagoServiciosResponse")
public class EjecutarTransaccionPagoServiciosResponse {

    @XmlElementRef(name = "EjecutarTransaccionPagoServiciosResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSTransaccionPagoServicios> ejecutarTransaccionPagoServiciosResult;

    /**
     * Obtiene el valor de la propiedad ejecutarTransaccionPagoServiciosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     *     
     */
    public JAXBElement<MSTransaccionPagoServicios> getEjecutarTransaccionPagoServiciosResult() {
        return ejecutarTransaccionPagoServiciosResult;
    }

    /**
     * Define el valor de la propiedad ejecutarTransaccionPagoServiciosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     *     
     */
    public void setEjecutarTransaccionPagoServiciosResult(JAXBElement<MSTransaccionPagoServicios> value) {
        this.ejecutarTransaccionPagoServiciosResult = value;
    }

}
