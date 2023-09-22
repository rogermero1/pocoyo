
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RelacionesAsignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelacionesAsignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CausalVinculacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoVinculacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdInstancia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdRelacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Validacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vinculado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelacionesAsignacion", propOrder = {
    "causalVinculacion",
    "codigoVinculacion",
    "fechaVinculacion",
    "idInstancia",
    "idRelacion",
    "identificacionD",
    "identificacionI",
    "nombreD",
    "nombreI",
    "relacion",
    "tipoRelacion",
    "validacion",
    "vinculado"
})
public class RelacionesAsignacion {

    @XmlElement(name = "CausalVinculacion")
    protected Integer causalVinculacion;
    @XmlElementRef(name = "CodigoVinculacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoVinculacion;
    @XmlElementRef(name = "FechaVinculacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVinculacion;
    @XmlElementRef(name = "IdInstancia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idInstancia;
    @XmlElementRef(name = "IdRelacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idRelacion;
    @XmlElementRef(name = "IdentificacionD", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionD;
    @XmlElementRef(name = "IdentificacionI", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionI;
    @XmlElementRef(name = "NombreD", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreD;
    @XmlElementRef(name = "NombreI", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreI;
    @XmlElementRef(name = "Relacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relacion;
    @XmlElementRef(name = "TipoRelacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoRelacion;
    @XmlElementRef(name = "Validacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validacion;
    @XmlElement(name = "Vinculado")
    protected Boolean vinculado;

    /**
     * Obtiene el valor de la propiedad causalVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCausalVinculacion() {
        return causalVinculacion;
    }

    /**
     * Define el valor de la propiedad causalVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCausalVinculacion(Integer value) {
        this.causalVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoVinculacion() {
        return codigoVinculacion;
    }

    /**
     * Define el valor de la propiedad codigoVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoVinculacion(JAXBElement<String> value) {
        this.codigoVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVinculacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaVinculacion() {
        return fechaVinculacion;
    }

    /**
     * Define el valor de la propiedad fechaVinculacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaVinculacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaVinculacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstancia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdInstancia() {
        return idInstancia;
    }

    /**
     * Define el valor de la propiedad idInstancia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdInstancia(JAXBElement<Integer> value) {
        this.idInstancia = value;
    }

    /**
     * Obtiene el valor de la propiedad idRelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdRelacion() {
        return idRelacion;
    }

    /**
     * Define el valor de la propiedad idRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdRelacion(JAXBElement<Integer> value) {
        this.idRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionD.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionD() {
        return identificacionD;
    }

    /**
     * Define el valor de la propiedad identificacionD.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionD(JAXBElement<String> value) {
        this.identificacionD = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionI() {
        return identificacionI;
    }

    /**
     * Define el valor de la propiedad identificacionI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionI(JAXBElement<String> value) {
        this.identificacionI = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreD.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreD() {
        return nombreD;
    }

    /**
     * Define el valor de la propiedad nombreD.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreD(JAXBElement<String> value) {
        this.nombreD = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreI() {
        return nombreI;
    }

    /**
     * Define el valor de la propiedad nombreI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreI(JAXBElement<String> value) {
        this.nombreI = value;
    }

    /**
     * Obtiene el valor de la propiedad relacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelacion() {
        return relacion;
    }

    /**
     * Define el valor de la propiedad relacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelacion(JAXBElement<String> value) {
        this.relacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoRelacion() {
        return tipoRelacion;
    }

    /**
     * Define el valor de la propiedad tipoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoRelacion(JAXBElement<String> value) {
        this.tipoRelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad validacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidacion() {
        return validacion;
    }

    /**
     * Define el valor de la propiedad validacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidacion(JAXBElement<String> value) {
        this.validacion = value;
    }

    /**
     * Obtiene el valor de la propiedad vinculado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVinculado() {
        return vinculado;
    }

    /**
     * Define el valor de la propiedad vinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVinculado(Boolean value) {
        this.vinculado = value;
    }

}
