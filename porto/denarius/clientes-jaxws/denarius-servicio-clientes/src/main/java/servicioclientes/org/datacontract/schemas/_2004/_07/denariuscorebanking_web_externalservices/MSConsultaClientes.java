
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

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaClientes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaClientes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accionistas" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfExtractoLegalSociosAccionistas" minOccurs="0"/&gt;
 *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AnioIngresoEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ApellidosPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ApellidosRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallePrincipalEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleSecundariaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoDescripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionNacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinoFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetalleProductoServicios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EgresosMensuales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoRelacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTercero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ingresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosAnuales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NacionalidadEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NacionalidadRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresCompletos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresRepresentante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDireccionEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigenFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosEgresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosIngresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parentesco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parroquia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pep" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PepFamiliares" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoFijo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoRepresentate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoEmpleo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoIdentificacionConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalActivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalPasivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UbicacionGeografica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaClientes", propOrder = {
    "accionistas",
    "actividadEconomica",
    "anioIngresoEmpresa",
    "apellidosPareja",
    "apellidosRepresentante",
    "callePrincipalEmpresa",
    "calleSecundariaEmpresa",
    "cargo",
    "cargoDescripcion",
    "ciudad",
    "ciudadEmpresa",
    "descripcionNacionalidad",
    "destinoFondos",
    "detalleProductoServicios",
    "direccion",
    "egresosMensuales",
    "email",
    "emailOficina",
    "emailRepresentante",
    "estadoCivil",
    "estadoRelacion",
    "fechaNacimiento",
    "identificacionConyuge",
    "identificacionRepresentante",
    "identificacionTercero",
    "ingresos",
    "ingresosAnuales",
    "institucion",
    "nacionalidadEmpresa",
    "nacionalidadRepresentante",
    "nombreEmpresa",
    "nombresCompletos",
    "nombresPareja",
    "nombresRepresentante",
    "numeroDireccionEmpresa",
    "origenFondos",
    "otrosEgresos",
    "otrosIngresos",
    "pais",
    "paisEmpresa",
    "parentesco",
    "parroquia",
    "parroquiaEmpresa",
    "pep",
    "pepFamiliares",
    "profesion",
    "provincia",
    "provinciaEmpresa",
    "sexo",
    "telefonoCelular",
    "telefonoEmpresa",
    "telefonoFijo",
    "telefonoRepresentate",
    "tipoEmpleo",
    "tipoIdentificacionConyuge",
    "totalActivos",
    "totalPasivos",
    "ubicacionGeografica"
})
public class MSConsultaClientes
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Accionistas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfExtractoLegalSociosAccionistas> accionistas;
    @XmlElementRef(name = "ActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomica;
    @XmlElement(name = "AnioIngresoEmpresa")
    protected Integer anioIngresoEmpresa;
    @XmlElementRef(name = "ApellidosPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidosPareja;
    @XmlElementRef(name = "ApellidosRepresentante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidosRepresentante;
    @XmlElementRef(name = "CallePrincipalEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callePrincipalEmpresa;
    @XmlElementRef(name = "CalleSecundariaEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleSecundariaEmpresa;
    @XmlElementRef(name = "Cargo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargo;
    @XmlElementRef(name = "CargoDescripcion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoDescripcion;
    @XmlElementRef(name = "Ciudad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudad;
    @XmlElementRef(name = "CiudadEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadEmpresa;
    @XmlElementRef(name = "DescripcionNacionalidad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionNacionalidad;
    @XmlElementRef(name = "DestinoFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinoFondos;
    @XmlElementRef(name = "DetalleProductoServicios", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalleProductoServicios;
    @XmlElementRef(name = "Direccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElement(name = "EgresosMensuales")
    protected BigDecimal egresosMensuales;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "EmailOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailOficina;
    @XmlElementRef(name = "EmailRepresentante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailRepresentante;
    @XmlElementRef(name = "EstadoCivil", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoCivil;
    @XmlElementRef(name = "EstadoRelacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoRelacion;
    @XmlElement(name = "FechaNacimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElementRef(name = "IdentificacionConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionConyuge;
    @XmlElementRef(name = "IdentificacionRepresentante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionRepresentante;
    @XmlElementRef(name = "IdentificacionTercero", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionTercero;
    @XmlElement(name = "Ingresos")
    protected BigDecimal ingresos;
    @XmlElement(name = "IngresosAnuales")
    protected BigDecimal ingresosAnuales;
    @XmlElementRef(name = "Institucion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> institucion;
    @XmlElementRef(name = "NacionalidadEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacionalidadEmpresa;
    @XmlElementRef(name = "NacionalidadRepresentante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacionalidadRepresentante;
    @XmlElementRef(name = "NombreEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreEmpresa;
    @XmlElementRef(name = "NombresCompletos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresCompletos;
    @XmlElementRef(name = "NombresPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresPareja;
    @XmlElementRef(name = "NombresRepresentante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresRepresentante;
    @XmlElementRef(name = "NumeroDireccionEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDireccionEmpresa;
    @XmlElementRef(name = "OrigenFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origenFondos;
    @XmlElement(name = "OtrosEgresos")
    protected BigDecimal otrosEgresos;
    @XmlElement(name = "OtrosIngresos")
    protected BigDecimal otrosIngresos;
    @XmlElementRef(name = "Pais", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "PaisEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisEmpresa;
    @XmlElementRef(name = "Parentesco", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentesco;
    @XmlElementRef(name = "Parroquia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquia;
    @XmlElementRef(name = "ParroquiaEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquiaEmpresa;
    @XmlElement(name = "Pep")
    protected Boolean pep;
    @XmlElement(name = "PepFamiliares")
    protected Boolean pepFamiliares;
    @XmlElementRef(name = "Profesion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profesion;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "ProvinciaEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaEmpresa;
    @XmlElementRef(name = "Sexo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sexo;
    @XmlElementRef(name = "TelefonoCelular", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoCelular;
    @XmlElementRef(name = "TelefonoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoEmpresa;
    @XmlElementRef(name = "TelefonoFijo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoFijo;
    @XmlElementRef(name = "TelefonoRepresentate", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoRepresentate;
    @XmlElement(name = "TipoEmpleo")
    protected Integer tipoEmpleo;
    @XmlElementRef(name = "TipoIdentificacionConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacionConyuge;
    @XmlElement(name = "TotalActivos")
    protected BigDecimal totalActivos;
    @XmlElement(name = "TotalPasivos")
    protected BigDecimal totalPasivos;
    @XmlElementRef(name = "UbicacionGeografica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ubicacionGeografica;

    /**
     * Obtiene el valor de la propiedad accionistas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     *     
     */
    public JAXBElement<ArrayOfExtractoLegalSociosAccionistas> getAccionistas() {
        return accionistas;
    }

    /**
     * Define el valor de la propiedad accionistas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     *     
     */
    public void setAccionistas(JAXBElement<ArrayOfExtractoLegalSociosAccionistas> value) {
        this.accionistas = value;
    }

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
     * Obtiene el valor de la propiedad anioIngresoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnioIngresoEmpresa() {
        return anioIngresoEmpresa;
    }

    /**
     * Define el valor de la propiedad anioIngresoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnioIngresoEmpresa(Integer value) {
        this.anioIngresoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidosPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidosPareja() {
        return apellidosPareja;
    }

    /**
     * Define el valor de la propiedad apellidosPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidosPareja(JAXBElement<String> value) {
        this.apellidosPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad apellidosRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidosRepresentante() {
        return apellidosRepresentante;
    }

    /**
     * Define el valor de la propiedad apellidosRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidosRepresentante(JAXBElement<String> value) {
        this.apellidosRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad callePrincipalEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallePrincipalEmpresa() {
        return callePrincipalEmpresa;
    }

    /**
     * Define el valor de la propiedad callePrincipalEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallePrincipalEmpresa(JAXBElement<String> value) {
        this.callePrincipalEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad calleSecundariaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalleSecundariaEmpresa() {
        return calleSecundariaEmpresa;
    }

    /**
     * Define el valor de la propiedad calleSecundariaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalleSecundariaEmpresa(JAXBElement<String> value) {
        this.calleSecundariaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargo(JAXBElement<String> value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoDescripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoDescripcion() {
        return cargoDescripcion;
    }

    /**
     * Define el valor de la propiedad cargoDescripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoDescripcion(JAXBElement<String> value) {
        this.cargoDescripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudad(JAXBElement<String> value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadEmpresa() {
        return ciudadEmpresa;
    }

    /**
     * Define el valor de la propiedad ciudadEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadEmpresa(JAXBElement<String> value) {
        this.ciudadEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionNacionalidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionNacionalidad() {
        return descripcionNacionalidad;
    }

    /**
     * Define el valor de la propiedad descripcionNacionalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionNacionalidad(JAXBElement<String> value) {
        this.descripcionNacionalidad = value;
    }

    /**
     * Obtiene el valor de la propiedad destinoFondos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinoFondos() {
        return destinoFondos;
    }

    /**
     * Define el valor de la propiedad destinoFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinoFondos(JAXBElement<String> value) {
        this.destinoFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleProductoServicios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetalleProductoServicios() {
        return detalleProductoServicios;
    }

    /**
     * Define el valor de la propiedad detalleProductoServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetalleProductoServicios(JAXBElement<String> value) {
        this.detalleProductoServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = value;
    }

    /**
     * Obtiene el valor de la propiedad egresosMensuales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosMensuales() {
        return egresosMensuales;
    }

    /**
     * Define el valor de la propiedad egresosMensuales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosMensuales(BigDecimal value) {
        this.egresosMensuales = value;
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
     * Obtiene el valor de la propiedad emailOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailOficina() {
        return emailOficina;
    }

    /**
     * Define el valor de la propiedad emailOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailOficina(JAXBElement<String> value) {
        this.emailOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad emailRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailRepresentante() {
        return emailRepresentante;
    }

    /**
     * Define el valor de la propiedad emailRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailRepresentante(JAXBElement<String> value) {
        this.emailRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCivil(JAXBElement<String> value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoRelacion() {
        return estadoRelacion;
    }

    /**
     * Define el valor de la propiedad estadoRelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoRelacion(JAXBElement<String> value) {
        this.estadoRelacion = value;
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
     * Obtiene el valor de la propiedad identificacionConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionConyuge() {
        return identificacionConyuge;
    }

    /**
     * Define el valor de la propiedad identificacionConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionConyuge(JAXBElement<String> value) {
        this.identificacionConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionRepresentante() {
        return identificacionRepresentante;
    }

    /**
     * Define el valor de la propiedad identificacionRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionRepresentante(JAXBElement<String> value) {
        this.identificacionRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTercero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionTercero() {
        return identificacionTercero;
    }

    /**
     * Define el valor de la propiedad identificacionTercero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionTercero(JAXBElement<String> value) {
        this.identificacionTercero = value;
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
     * Obtiene el valor de la propiedad ingresosAnuales.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosAnuales() {
        return ingresosAnuales;
    }

    /**
     * Define el valor de la propiedad ingresosAnuales.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosAnuales(BigDecimal value) {
        this.ingresosAnuales = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstitucion(JAXBElement<String> value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacionalidadEmpresa() {
        return nacionalidadEmpresa;
    }

    /**
     * Define el valor de la propiedad nacionalidadEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacionalidadEmpresa(JAXBElement<String> value) {
        this.nacionalidadEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nacionalidadRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNacionalidadRepresentante() {
        return nacionalidadRepresentante;
    }

    /**
     * Define el valor de la propiedad nacionalidadRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNacionalidadRepresentante(JAXBElement<String> value) {
        this.nacionalidadRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * Define el valor de la propiedad nombreEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreEmpresa(JAXBElement<String> value) {
        this.nombreEmpresa = value;
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
     * Obtiene el valor de la propiedad nombresRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombresRepresentante() {
        return nombresRepresentante;
    }

    /**
     * Define el valor de la propiedad nombresRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombresRepresentante(JAXBElement<String> value) {
        this.nombresRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDireccionEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDireccionEmpresa() {
        return numeroDireccionEmpresa;
    }

    /**
     * Define el valor de la propiedad numeroDireccionEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDireccionEmpresa(JAXBElement<String> value) {
        this.numeroDireccionEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad origenFondos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigenFondos() {
        return origenFondos;
    }

    /**
     * Define el valor de la propiedad origenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigenFondos(JAXBElement<String> value) {
        this.origenFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosEgresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosEgresos() {
        return otrosEgresos;
    }

    /**
     * Define el valor de la propiedad otrosEgresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosEgresos(BigDecimal value) {
        this.otrosEgresos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosIngresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosIngresos() {
        return otrosIngresos;
    }

    /**
     * Define el valor de la propiedad otrosIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosIngresos(BigDecimal value) {
        this.otrosIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPais(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad paisEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisEmpresa() {
        return paisEmpresa;
    }

    /**
     * Define el valor de la propiedad paisEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisEmpresa(JAXBElement<String> value) {
        this.paisEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad parentesco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentesco() {
        return parentesco;
    }

    /**
     * Define el valor de la propiedad parentesco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentesco(JAXBElement<String> value) {
        this.parentesco = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParroquia() {
        return parroquia;
    }

    /**
     * Define el valor de la propiedad parroquia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParroquia(JAXBElement<String> value) {
        this.parroquia = value;
    }

    /**
     * Obtiene el valor de la propiedad parroquiaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParroquiaEmpresa() {
        return parroquiaEmpresa;
    }

    /**
     * Define el valor de la propiedad parroquiaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParroquiaEmpresa(JAXBElement<String> value) {
        this.parroquiaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad pep.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPep() {
        return pep;
    }

    /**
     * Define el valor de la propiedad pep.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPep(Boolean value) {
        this.pep = value;
    }

    /**
     * Obtiene el valor de la propiedad pepFamiliares.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPepFamiliares() {
        return pepFamiliares;
    }

    /**
     * Define el valor de la propiedad pepFamiliares.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPepFamiliares(Boolean value) {
        this.pepFamiliares = value;
    }

    /**
     * Obtiene el valor de la propiedad profesion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfesion() {
        return profesion;
    }

    /**
     * Define el valor de la propiedad profesion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfesion(JAXBElement<String> value) {
        this.profesion = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaEmpresa() {
        return provinciaEmpresa;
    }

    /**
     * Define el valor de la propiedad provinciaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaEmpresa(JAXBElement<String> value) {
        this.provinciaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSexo(JAXBElement<String> value) {
        this.sexo = value;
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
     * Obtiene el valor de la propiedad telefonoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    /**
     * Define el valor de la propiedad telefonoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoEmpresa(JAXBElement<String> value) {
        this.telefonoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoFijo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoFijo() {
        return telefonoFijo;
    }

    /**
     * Define el valor de la propiedad telefonoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoFijo(JAXBElement<String> value) {
        this.telefonoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoRepresentate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoRepresentate() {
        return telefonoRepresentate;
    }

    /**
     * Define el valor de la propiedad telefonoRepresentate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoRepresentate(JAXBElement<String> value) {
        this.telefonoRepresentate = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEmpleo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoEmpleo() {
        return tipoEmpleo;
    }

    /**
     * Define el valor de la propiedad tipoEmpleo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoEmpleo(Integer value) {
        this.tipoEmpleo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoIdentificacionConyuge() {
        return tipoIdentificacionConyuge;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoIdentificacionConyuge(JAXBElement<String> value) {
        this.tipoIdentificacionConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad totalActivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalActivos() {
        return totalActivos;
    }

    /**
     * Define el valor de la propiedad totalActivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalActivos(BigDecimal value) {
        this.totalActivos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPasivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPasivos() {
        return totalPasivos;
    }

    /**
     * Define el valor de la propiedad totalPasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPasivos(BigDecimal value) {
        this.totalPasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionGeografica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    /**
     * Define el valor de la propiedad ubicacionGeografica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUbicacionGeografica(JAXBElement<String> value) {
        this.ubicacionGeografica = value;
    }

}
