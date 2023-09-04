
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaReferenciasPersonales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaReferenciasPersonales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReferenciasPersonales" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfReferenciaPersonal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaReferenciasPersonales", propOrder = {
    "referenciasPersonales"
})
public class MSConsultaReferenciasPersonales
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "ReferenciasPersonales", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfReferenciaPersonal> referenciasPersonales;

    /**
     * Obtiene el valor de la propiedad referenciasPersonales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     *     
     */
    public JAXBElement<ArrayOfReferenciaPersonal> getReferenciasPersonales() {
        return referenciasPersonales;
    }

    /**
     * Define el valor de la propiedad referenciasPersonales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     *     
     */
    public void setReferenciasPersonales(JAXBElement<ArrayOfReferenciaPersonal> value) {
        this.referenciasPersonales = value;
    }

}
