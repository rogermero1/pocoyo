
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteTramite complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteTramite"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direcciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}ArrayOfDireccion" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NombresCompletos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteTramite", propOrder = {
    "codigoRol",
    "direcciones",
    "idClienteTramite",
    "nombresCompletos",
    "rol"
})
public class ClienteTramite {

    @XmlElementRef(name = "CodigoRol", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoRol;
    @XmlElementRef(name = "Direcciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDireccion> direcciones;
    @XmlElement(name = "IdClienteTramite")
    protected Integer idClienteTramite;
    @XmlElementRef(name = "NombresCompletos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresCompletos;
    @XmlElementRef(name = "Rol", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rol;

    /**
     * Obtiene el valor de la propiedad codigoRol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoRol() {
        return codigoRol;
    }

    /**
     * Define el valor de la propiedad codigoRol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoRol(JAXBElement<String> value) {
        this.codigoRol = value;
    }

    /**
     * Obtiene el valor de la propiedad direcciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDireccion> getDirecciones() {
        return direcciones;
    }

    /**
     * Define el valor de la propiedad direcciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     *     
     */
    public void setDirecciones(JAXBElement<ArrayOfDireccion> value) {
        this.direcciones = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteTramite() {
        return idClienteTramite;
    }

    /**
     * Define el valor de la propiedad idClienteTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteTramite(Integer value) {
        this.idClienteTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresCompletos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombresCompletos() {
        return nombresCompletos;
    }

    /**
     * Define el valor de la propiedad nombresCompletos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombresCompletos(JAXBElement<String> value) {
        this.nombresCompletos = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRol(JAXBElement<String> value) {
        this.rol = value;
    }

}
