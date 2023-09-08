
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreacionCliente;


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
 *         &lt;element name="CrearClienteConsolidadoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}MSCreacionCliente" minOccurs="0"/&gt;
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
    "crearClienteConsolidadoResult"
})
@XmlRootElement(name = "CrearClienteConsolidadoResponse")
public class CrearClienteConsolidadoResponse {

    @XmlElementRef(name = "CrearClienteConsolidadoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSCreacionCliente> crearClienteConsolidadoResult;

    /**
     * Obtiene el valor de la propiedad crearClienteConsolidadoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     *     
     */
    public JAXBElement<MSCreacionCliente> getCrearClienteConsolidadoResult() {
        return crearClienteConsolidadoResult;
    }

    /**
     * Define el valor de la propiedad crearClienteConsolidadoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     *     
     */
    public void setCrearClienteConsolidadoResult(JAXBElement<MSCreacionCliente> value) {
        this.crearClienteConsolidadoResult = value;
    }

}
