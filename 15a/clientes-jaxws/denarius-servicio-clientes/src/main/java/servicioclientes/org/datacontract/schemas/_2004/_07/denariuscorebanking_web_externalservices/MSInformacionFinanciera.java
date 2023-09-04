
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSInformacionFinanciera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSInformacionFinanciera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Activos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetalleActivo" minOccurs="0"/&gt;
 *         &lt;element name="Pasivos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetallePasivo" minOccurs="0"/&gt;
 *         &lt;element name="ResumenEstadoSituacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}EstadoSituacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSInformacionFinanciera", propOrder = {
    "activos",
    "pasivos",
    "resumenEstadoSituacion"
})
public class MSInformacionFinanciera
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Activos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleActivo> activos;
    @XmlElementRef(name = "Pasivos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetallePasivo> pasivos;
    @XmlElementRef(name = "ResumenEstadoSituacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<EstadoSituacion> resumenEstadoSituacion;

    /**
     * Obtiene el valor de la propiedad activos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleActivo> getActivos() {
        return activos;
    }

    /**
     * Define el valor de la propiedad activos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     *     
     */
    public void setActivos(JAXBElement<ArrayOfDetalleActivo> value) {
        this.activos = value;
    }

    /**
     * Obtiene el valor de la propiedad pasivos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetallePasivo> getPasivos() {
        return pasivos;
    }

    /**
     * Define el valor de la propiedad pasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     *     
     */
    public void setPasivos(JAXBElement<ArrayOfDetallePasivo> value) {
        this.pasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad resumenEstadoSituacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     *     
     */
    public JAXBElement<EstadoSituacion> getResumenEstadoSituacion() {
        return resumenEstadoSituacion;
    }

    /**
     * Define el valor de la propiedad resumenEstadoSituacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     *     
     */
    public void setResumenEstadoSituacion(JAXBElement<EstadoSituacion> value) {
        this.resumenEstadoSituacion = value;
    }

}
