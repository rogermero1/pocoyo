
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEEmpleo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEEmpleo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Empleo" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}Empleo" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEEmpleo", propOrder = {
    "empleo",
    "idCliente"
})
public class MEEmpleo
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "Empleo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Empleo> empleo;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;

    /**
     * Obtiene el valor de la propiedad empleo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     *     
     */
    public JAXBElement<Empleo> getEmpleo() {
        return empleo;
    }

    /**
     * Define el valor de la propiedad empleo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     *     
     */
    public void setEmpleo(JAXBElement<Empleo> value) {
        this.empleo = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

}
