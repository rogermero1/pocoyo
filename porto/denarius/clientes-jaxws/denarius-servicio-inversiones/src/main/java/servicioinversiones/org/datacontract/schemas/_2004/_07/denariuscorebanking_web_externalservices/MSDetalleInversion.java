
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSDetalleInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSDetalleInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Intervinientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}ArrayOfClienteCaptacion" minOccurs="0"/&gt;
 *         &lt;element name="Inversion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}DatosInversion" minOccurs="0"/&gt;
 *         &lt;element name="PagosPeriodicos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}ArrayOfPagoPeriodico" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSDetalleInversion", propOrder = {
    "intervinientes",
    "inversion",
    "pagosPeriodicos"
})
public class MSDetalleInversion
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Intervinientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClienteCaptacion> intervinientes;
    @XmlElementRef(name = "Inversion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosInversion> inversion;
    @XmlElementRef(name = "PagosPeriodicos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPagoPeriodico> pagosPeriodicos;

    /**
     * Obtiene el valor de la propiedad intervinientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClienteCaptacion> getIntervinientes() {
        return intervinientes;
    }

    /**
     * Define el valor de la propiedad intervinientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     *     
     */
    public void setIntervinientes(JAXBElement<ArrayOfClienteCaptacion> value) {
        this.intervinientes = value;
    }

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
     * Obtiene el valor de la propiedad pagosPeriodicos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPagoPeriodico> getPagosPeriodicos() {
        return pagosPeriodicos;
    }

    /**
     * Define el valor de la propiedad pagosPeriodicos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     *     
     */
    public void setPagosPeriodicos(JAXBElement<ArrayOfPagoPeriodico> value) {
        this.pagosPeriodicos = value;
    }

}
