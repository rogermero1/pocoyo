
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaDireccionesCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaDireccionesCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Direcciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDatosDireccion" minOccurs="0"/&gt;
 *         &lt;element name="Telefonos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDatosTelefono" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaDireccionesCliente", propOrder = {
    "direcciones",
    "telefonos"
})
public class MSConsultaDireccionesCliente
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Direcciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosDireccion> direcciones;
    @XmlElementRef(name = "Telefonos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosTelefono> telefonos;

    /**
     * Obtiene el valor de la propiedad direcciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosDireccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Define el valor de la propiedad direcciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     *     
     */
    public void setDirecciones(JAXBElement<ArrayOfDatosDireccion> value) {
        this.direcciones = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosTelefono> getTelefonos() {
        return telefonos;
    }

    /**
     * Define el valor de la propiedad telefonos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     *     
     */
    public void setTelefonos(JAXBElement<ArrayOfDatosTelefono> value) {
        this.telefonos = value;
    }

}
