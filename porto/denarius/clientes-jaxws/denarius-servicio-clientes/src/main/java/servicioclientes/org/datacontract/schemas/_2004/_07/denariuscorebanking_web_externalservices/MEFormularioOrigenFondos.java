
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEFormularioOrigenFondos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEFormularioOrigenFondos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Formulario" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosOrigenFondos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEFormularioOrigenFondos", propOrder = {
    "formulario"
})
public class MEFormularioOrigenFondos
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "Formulario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosOrigenFondos> formulario;

    /**
     * Obtiene el valor de la propiedad formulario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     *     
     */
    public JAXBElement<DatosOrigenFondos> getFormulario() {
        return formulario;
    }

    /**
     * Define el valor de la propiedad formulario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     *     
     */
    public void setFormulario(JAXBElement<DatosOrigenFondos> value) {
        this.formulario = value;
    }

}
