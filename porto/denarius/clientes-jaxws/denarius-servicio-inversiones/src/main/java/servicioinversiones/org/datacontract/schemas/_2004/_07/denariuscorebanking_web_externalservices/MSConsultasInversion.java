
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inversion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}DatosInversion" minOccurs="0"/&gt;
 *         &lt;element name="Inversiones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}ArrayOfDatosInversion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasInversion", propOrder = {
    "inversion",
    "inversiones"
})
public class MSConsultasInversion
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Inversion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosInversion> inversion;
    @XmlElementRef(name = "Inversiones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosInversion> inversiones;

    /**
     * Obtiene el valor de la propiedad inversion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     *     
     */
    public JAXBElement<DatosInversion> getInversion() {
        return inversion;
    }

    /**
     * Define el valor de la propiedad inversion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     *     
     */
    public void setInversion(JAXBElement<DatosInversion> value) {
        this.inversion = value;
    }

    /**
     * Obtiene el valor de la propiedad inversiones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosInversion> getInversiones() {
        return inversiones;
    }

    /**
     * Define el valor de la propiedad inversiones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     *     
     */
    public void setInversiones(JAXBElement<ArrayOfDatosInversion> value) {
        this.inversiones = value;
    }

}
