
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaOrigenFondos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaOrigenFondos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FormulariosOrigenFondos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDatosOrigenFondos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaOrigenFondos", propOrder = {
    "formulariosOrigenFondos"
})
public class MSConsultaOrigenFondos
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "FormulariosOrigenFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosOrigenFondos> formulariosOrigenFondos;

    /**
     * Obtiene el valor de la propiedad formulariosOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosOrigenFondos> getFormulariosOrigenFondos() {
        return formulariosOrigenFondos;
    }

    /**
     * Define el valor de la propiedad formulariosOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     *     
     */
    public void setFormulariosOrigenFondos(JAXBElement<ArrayOfDatosOrigenFondos> value) {
        this.formulariosOrigenFondos = value;
    }

}
