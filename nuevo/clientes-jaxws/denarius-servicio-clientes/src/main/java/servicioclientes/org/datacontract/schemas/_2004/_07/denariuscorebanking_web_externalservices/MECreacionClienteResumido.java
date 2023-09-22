
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MECreacionClienteResumido complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECreacionClienteResumido"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallePrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleTransversal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Egresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Estudios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimientoPareja" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Genero" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ingresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeracionDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Patrimonio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimerApellidoPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegundoApellidoPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoIdentificacion" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECreacionClienteResumido", propOrder = {
    "actividadEconomica",
    "callePrincipal",
    "calleTransversal",
    "cantonDireccion",
    "ciudadDireccion",
    "codigoOficial",
    "egresos",
    "email",
    "estadoCivil",
    "estudios",
    "fechaNacimiento",
    "fechaNacimientoPareja",
    "genero",
    "identificacion",
    "identificacionPareja",
    "ingresos",
    "nacionalidad",
    "nombres",
    "nombresPareja",
    "numeracionDireccion",
    "parroquiaDireccion",
    "patrimonio",
    "primerApellido",
    "primerApellidoPareja",
    "provinciaDireccion",
    "segundoApellido",
    "segundoApellidoPareja",
    "telefonoCelular",
    "tipoIdentificacion"
})
public class MECreacionClienteResumido
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "ActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomica;
    @XmlElementRef(name = "CallePrincipal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callePrincipal;
    @XmlElementRef(name = "CalleTransversal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleTransversal;
    @XmlElementRef(name = "CantonDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantonDireccion;
    @XmlElementRef(name = "CiudadDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadDireccion;
    @XmlElementRef(name = "CodigoOficial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoOficial;
    @XmlElement(name = "Egresos")
    protected BigDecimal egresos;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "EstadoCivil")
    protected Integer estadoCivil;
    @XmlElementRef(name = "Estudios", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estudios;
    @XmlElement(name = "FechaNacimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "FechaNacimientoPareja")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimientoPareja;
    @XmlElement(name = "Genero")
    protected Integer genero;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElementRef(name = "IdentificacionPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionPareja;
    @XmlElement(name = "Ingresos")
    protected BigDecimal ingresos;
    @XmlElementRef(name = "Nacionalidad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacionalidad;
    @XmlElementRef(name = "Nombres", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombres;
    @XmlElementRef(name = "NombresPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresPareja;
    @XmlElementRef(name = "NumeracionDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeracionDireccion;
    @XmlElementRef(name = "ParroquiaDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquiaDireccion;
    @XmlElement(name = "Patrimonio")
    protected BigDecimal patrimonio;
    @XmlElementRef(name = "PrimerApellido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellido;
    @XmlElementRef(name = "PrimerApellidoPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellidoPareja;
    @XmlElementRef(name = "ProvinciaDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaDireccion;
    @XmlElementRef(name = "SegundoApellido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellido;
    @XmlElementRef(name = "SegundoApellidoPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoPareja;
    @XmlElementRef(name = "TelefonoCelular", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoCelular;
    @XmlElement(name = "TipoIdentificacion")
    protected Integer tipoIdentificacion;

    /**
     * Obtiene el valor de la propiedad actividadEconomica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActividadEconomica() {
        return actividadEconomica;
    }

    /**
     * Define el valor de la propiedad actividadEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActividadEconomica(JAXBElement<String> value) {
        this.actividadEconomica = value;
    }

    /**
     * Obtiene el valor de la propiedad callePrincipal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallePrincipal() {
        return callePrincipal;
    }

    /**
     * Define el valor de la propiedad callePrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallePrincipal(JAXBElement<String> value) {
        this.callePrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad calleTransversal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalleTransversal() {
        return calleTransversal;
    }

    /**
     * Define el valor de la propiedad calleTransversal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalleTransversal(JAXBElement<String> value) {
        this.calleTransversal = value;
    }

    /**
     * Obtiene el valor de la propiedad cantonDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantonDireccion() {
        return cantonDireccion;
    }

    /**
     * Define el valor de la propiedad cantonDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantonDireccion(JAXBElement<String> value) {
        this.cantonDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadDireccion() {
        return ciudadDireccion;
    }

    /**
     * Define el valor de la propiedad ciudadDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadDireccion(JAXBElement<String> value) {
        this.ciudadDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOficial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoOficial() {
        return codigoOficial;
    }

    /**
     * Define el valor de la propiedad codigoOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoOficial(JAXBElement<String> value) {
        this.codigoOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad egresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresos() {
        return egresos;
    }

    /**
     * Define el valor de la propiedad egresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresos(BigDecimal value) {
        this.egresos = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoCivil(Integer value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad estudios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstudios() {
        return estudios;
    }

    /**
     * Define el valor de la propiedad estudios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstudios(JAXBElement<String> value) {
        this.estudios = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Define el valor de la propiedad fechaNacimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNacimientoPareja.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimientoPareja() {
        return fechaNacimientoPareja;
    }

    /**
     * Define el valor de la propiedad fechaNacimientoPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimientoPareja(XMLGregorianCalendar value) {
        this.fechaNacimientoPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad genero.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGenero() {
        return genero;
    }

    /**
     * Define el valor de la propiedad genero.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGenero(Integer value) {
        this.genero = value;
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
     * Obtiene el valor de la propiedad identificacionPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionPareja() {
        return identificacionPareja;
    }

    /**
     * Define el valor de la propiedad identificacionPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionPareja(JAXBElement<String> value) {
        this.identificacionPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresos() {
        return ingresos;
    }

    /**
     * Define el valor de la propiedad ingresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresos(BigDecimal value) {
        this.ingresos = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Define el valor de la propiedad nacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacionalidad(JAXBElement<String> value) {
        this.nacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombres.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombres() {
        return nombres;
    }

    /**
     * Define el valor de la propiedad nombres.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombres(JAXBElement<String> value) {
        this.nombres = value;
    }

    /**
     * Obtiene el valor de la propiedad nombresPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombresPareja() {
        return nombresPareja;
    }

    /**
     * Define el valor de la propiedad nombresPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombresPareja(JAXBElement<String> value) {
        this.nombresPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad numeracionDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeracionDireccion() {
        return numeracionDireccion;
    }

    /**
     * Define el valor de la propiedad numeracionDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeracionDireccion(JAXBElement<String> value) {
        this.numeracionDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParroquiaDireccion() {
        return parroquiaDireccion;
    }

    /**
     * Define el valor de la propiedad parroquiaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParroquiaDireccion(JAXBElement<String> value) {
        this.parroquiaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad patrimonio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPatrimonio() {
        return patrimonio;
    }

    /**
     * Define el valor de la propiedad patrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPatrimonio(BigDecimal value) {
        this.patrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApellido() {
        return primerApellido;
    }

    /**
     * Define el valor de la propiedad primerApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApellido(JAXBElement<String> value) {
        this.primerApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad primerApellidoPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimerApellidoPareja() {
        return primerApellidoPareja;
    }

    /**
     * Define el valor de la propiedad primerApellidoPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimerApellidoPareja(JAXBElement<String> value) {
        this.primerApellidoPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaDireccion() {
        return provinciaDireccion;
    }

    /**
     * Define el valor de la propiedad provinciaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaDireccion(JAXBElement<String> value) {
        this.provinciaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * Define el valor de la propiedad segundoApellido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellido(JAXBElement<String> value) {
        this.segundoApellido = value;
    }

    /**
     * Obtiene el valor de la propiedad segundoApellidoPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegundoApellidoPareja() {
        return segundoApellidoPareja;
    }

    /**
     * Define el valor de la propiedad segundoApellidoPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegundoApellidoPareja(JAXBElement<String> value) {
        this.segundoApellidoPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCelular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Define el valor de la propiedad telefonoCelular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoCelular(JAXBElement<String> value) {
        this.telefonoCelular = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoIdentificacion(Integer value) {
        this.tipoIdentificacion = value;
    }

}
