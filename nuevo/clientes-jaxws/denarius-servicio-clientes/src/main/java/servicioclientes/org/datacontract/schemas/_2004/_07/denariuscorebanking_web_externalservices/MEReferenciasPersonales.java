
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEReferenciasPersonales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEReferenciasPersonales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenciaPersonal" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ReferenciaPersonal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEReferenciasPersonales", propOrder = {
    "referenciaPersonal"
})
public class MEReferenciasPersonales
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "ReferenciaPersonal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ReferenciaPersonal> referenciaPersonal;

    /**
     * Obtiene el valor de la propiedad referenciaPersonal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     *     
     */
    public JAXBElement<ReferenciaPersonal> getReferenciaPersonal() {
        return referenciaPersonal;
    }

    /**
     * Define el valor de la propiedad referenciaPersonal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     *     
     */
    public void setReferenciaPersonal(JAXBElement<ReferenciaPersonal> value) {
        this.referenciaPersonal = value;
    }

}
