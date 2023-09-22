
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaClientesCondiciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaClientesCondiciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDatosCliente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaClientesCondiciones", propOrder = {
    "clientes"
})
public class MSConsultaClientesCondiciones
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Clientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosCliente> clientes;

    /**
     * Obtiene el valor de la propiedad clientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosCliente> getClientes() {
        return clientes;
    }

    /**
     * Define el valor de la propiedad clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     *     
     */
    public void setClientes(JAXBElement<ArrayOfDatosCliente> value) {
        this.clientes = value;
    }

}
