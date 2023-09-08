
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSVinculado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSVinculado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionVinculado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EsFuncionario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FechaFinFuncionario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicioFuncionario" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVinculacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCausalVinculado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresCompletos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Relaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfRelacionesAsignacion" minOccurs="0"/&gt;
 *         &lt;element name="Vinculado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSVinculado", propOrder = {
    "codigoVinculado",
    "descripcionVinculado",
    "esFuncionario",
    "fechaFinFuncionario",
    "fechaInicioFuncionario",
    "fechaVinculacion",
    "idCausalVinculado",
    "identificacion",
    "nombresCompletos",
    "relaciones",
    "vinculado"
})
public class MSVinculado
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "CodigoVinculado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoVinculado;
    @XmlElementRef(name = "DescripcionVinculado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionVinculado;
    @XmlElement(name = "EsFuncionario")
    protected Boolean esFuncionario;
    @XmlElementRef(name = "FechaFinFuncionario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaFinFuncionario;
    @XmlElementRef(name = "FechaInicioFuncionario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaInicioFuncionario;
    @XmlElementRef(name = "FechaVinculacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVinculacion;
    @XmlElement(name = "IdCausalVinculado")
    protected Integer idCausalVinculado;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElementRef(name = "NombresCompletos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresCompletos;
    @XmlElementRef(name = "Relaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRelacionesAsignacion> relaciones;
    @XmlElement(name = "Vinculado")
    protected Boolean vinculado;

    /**
     * Obtiene el valor de la propiedad codigoVinculado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoVinculado() {
        return codigoVinculado;
    }

    /**
     * Define el valor de la propiedad codigoVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoVinculado(JAXBElement<String> value) {
        this.codigoVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionVinculado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionVinculado() {
        return descripcionVinculado;
    }

    /**
     * Define el valor de la propiedad descripcionVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionVinculado(JAXBElement<String> value) {
        this.descripcionVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad esFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsFuncionario() {
        return esFuncionario;
    }

    /**
     * Define el valor de la propiedad esFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsFuncionario(Boolean value) {
        this.esFuncionario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaFinFuncionario() {
        return fechaFinFuncionario;
    }

    /**
     * Define el valor de la propiedad fechaFinFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaFinFuncionario(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaFinFuncionario = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioFuncionario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaInicioFuncionario() {
        return fechaInicioFuncionario;
    }

    /**
     * Define el valor de la propiedad fechaInicioFuncionario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaInicioFuncionario(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaInicioFuncionario = value;
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
     * Obtiene el valor de la propiedad idCausalVinculado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCausalVinculado() {
        return idCausalVinculado;
    }

    /**
     * Define el valor de la propiedad idCausalVinculado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCausalVinculado(Integer value) {
        this.idCausalVinculado = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacion(JAXBElement<String> value) {
        this.identificacion = value;
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
     * Obtiene el valor de la propiedad relaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRelacionesAsignacion> getRelaciones() {
        return relaciones;
    }

    /**
     * Define el valor de la propiedad relaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     *     
     */
    public void setRelaciones(JAXBElement<ArrayOfRelacionesAsignacion> value) {
        this.relaciones = value;
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
