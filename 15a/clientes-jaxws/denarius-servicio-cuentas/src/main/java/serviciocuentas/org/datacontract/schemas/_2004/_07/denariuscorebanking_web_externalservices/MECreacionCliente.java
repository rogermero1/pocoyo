
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MECreacionCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECreacionCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActividadEconomicaEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Activos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CallePrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallePrincipalTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleTransversal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleTransversalTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CantonDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEtnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionReferencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EgresoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Estudios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaIngresoEmpresa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNacimientoPareja" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IngresoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Nacionalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreReferencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombresPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCargas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentescoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParentescoReferencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParroquiaDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pasivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PatromonioInicial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PrimerApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimerApellidoPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductoInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Profesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedesSociales" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfRedSocial" minOccurs="0"/&gt;
 *         &lt;element name="ReferenciaDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenciaDireccionTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResidenciaFiscal" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ResidenciaFiscal" minOccurs="0"/&gt;
 *         &lt;element name="SegundoApellido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SegundoApellidoPareja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sexo" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="SueldoEmpresa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoReferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoReferencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoSms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoTrabajo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoActividad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCliente" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="TipoIdentificacion" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="TipoPersona" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="TipoVivienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECreacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", propOrder = {
    "actividadEconomica",
    "actividadEconomicaEmpresa",
    "activos",
    "callePrincipal",
    "callePrincipalTrabajo",
    "calleTransversal",
    "calleTransversalTrabajo",
    "cantonDireccion",
    "cantonDireccionTrabajo",
    "cargoEmpresa",
    "ciudadDireccion",
    "ciudadDireccionTrabajo",
    "codigoEtnia",
    "codigoOficial",
    "direccionReferencia",
    "direccionReferencia2",
    "egresoMensual",
    "email",
    "estadoCivil",
    "estudios",
    "fechaIngresoEmpresa",
    "fechaNacimiento",
    "fechaNacimientoPareja",
    "identificacion",
    "identificacionPareja",
    "ingresoMensual",
    "nacionalidad",
    "nombreEmpresa",
    "nombreReferencia",
    "nombreReferencia2",
    "nombres",
    "nombresPareja",
    "numeroCargas",
    "numeroDireccion",
    "numeroDireccionTrabajo",
    "pais",
    "parentescoReferencia",
    "parentescoReferencia2",
    "parroquiaDireccion",
    "parroquiaDireccionTrabajo",
    "pasivos",
    "patromonioInicial",
    "primerApellido",
    "primerApellidoPareja",
    "productoInicial",
    "profesion",
    "provincia",
    "provinciaDireccion",
    "provinciaDireccionTrabajo",
    "redesSociales",
    "referenciaDireccion",
    "referenciaDireccionTrabajo",
    "residenciaFiscal",
    "segundoApellido",
    "segundoApellidoPareja",
    "sexo",
    "sueldoEmpresa",
    "telefono",
    "telefonoReferencia",
    "telefonoReferencia2",
    "telefonoSms",
    "telefonoTrabajo",
    "tipoActividad",
    "tipoCliente",
    "tipoIdentificacion",
    "tipoPersona",
    "tipoVivienda"
})
public class MECreacionCliente
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "ActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomica;
    @XmlElementRef(name = "ActividadEconomicaEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomicaEmpresa;
    @XmlElement(name = "Activos")
    protected BigDecimal activos;
    @XmlElementRef(name = "CallePrincipal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callePrincipal;
    @XmlElementRef(name = "CallePrincipalTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callePrincipalTrabajo;
    @XmlElementRef(name = "CalleTransversal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleTransversal;
    @XmlElementRef(name = "CalleTransversalTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleTransversalTrabajo;
    @XmlElementRef(name = "CantonDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantonDireccion;
    @XmlElementRef(name = "CantonDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantonDireccionTrabajo;
    @XmlElementRef(name = "CargoEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargoEmpresa;
    @XmlElementRef(name = "CiudadDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadDireccion;
    @XmlElementRef(name = "CiudadDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadDireccionTrabajo;
    @XmlElementRef(name = "CodigoEtnia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEtnia;
    @XmlElementRef(name = "CodigoOficial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoOficial;
    @XmlElementRef(name = "DireccionReferencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionReferencia;
    @XmlElementRef(name = "DireccionReferencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionReferencia2;
    @XmlElementRef(name = "EgresoMensual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> egresoMensual;
    @XmlElementRef(name = "Email", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "EstadoCivil")
    protected Integer estadoCivil;
    @XmlElementRef(name = "Estudios", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estudios;
    @XmlElement(name = "FechaIngresoEmpresa")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngresoEmpresa;
    @XmlElement(name = "FechaNacimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    @XmlElement(name = "FechaNacimientoPareja")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimientoPareja;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElementRef(name = "IdentificacionPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionPareja;
    @XmlElementRef(name = "IngresoMensual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ingresoMensual;
    @XmlElementRef(name = "Nacionalidad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nacionalidad;
    @XmlElementRef(name = "NombreEmpresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreEmpresa;
    @XmlElementRef(name = "NombreReferencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreReferencia;
    @XmlElementRef(name = "NombreReferencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreReferencia2;
    @XmlElementRef(name = "Nombres", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombres;
    @XmlElementRef(name = "NombresPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombresPareja;
    @XmlElement(name = "NumeroCargas")
    protected Integer numeroCargas;
    @XmlElementRef(name = "NumeroDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDireccion;
    @XmlElementRef(name = "NumeroDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDireccionTrabajo;
    @XmlElementRef(name = "Pais", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "ParentescoReferencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentescoReferencia;
    @XmlElementRef(name = "ParentescoReferencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentescoReferencia2;
    @XmlElementRef(name = "ParroquiaDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquiaDireccion;
    @XmlElementRef(name = "ParroquiaDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquiaDireccionTrabajo;
    @XmlElement(name = "Pasivos")
    protected BigDecimal pasivos;
    @XmlElementRef(name = "PatromonioInicial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> patromonioInicial;
    @XmlElementRef(name = "PrimerApellido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellido;
    @XmlElementRef(name = "PrimerApellidoPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primerApellidoPareja;
    @XmlElementRef(name = "ProductoInicial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productoInicial;
    @XmlElementRef(name = "Profesion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profesion;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "ProvinciaDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaDireccion;
    @XmlElementRef(name = "ProvinciaDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaDireccionTrabajo;
    @XmlElementRef(name = "RedesSociales", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRedSocial> redesSociales;
    @XmlElementRef(name = "ReferenciaDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenciaDireccion;
    @XmlElementRef(name = "ReferenciaDireccionTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenciaDireccionTrabajo;
    @XmlElementRef(name = "ResidenciaFiscal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ResidenciaFiscal> residenciaFiscal;
    @XmlElementRef(name = "SegundoApellido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellido;
    @XmlElementRef(name = "SegundoApellidoPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segundoApellidoPareja;
    @XmlElement(name = "Sexo")
    protected Integer sexo;
    @XmlElement(name = "SueldoEmpresa")
    protected BigDecimal sueldoEmpresa;
    @XmlElementRef(name = "Telefono", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefono;
    @XmlElementRef(name = "TelefonoReferencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoReferencia;
    @XmlElementRef(name = "TelefonoReferencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoReferencia2;
    @XmlElementRef(name = "TelefonoSms", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoSms;
    @XmlElementRef(name = "TelefonoTrabajo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoTrabajo;
    @XmlElementRef(name = "TipoActividad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoActividad;
    @XmlElement(name = "TipoCliente")
    protected Integer tipoCliente;
    @XmlElement(name = "TipoIdentificacion")
    protected Integer tipoIdentificacion;
    @XmlElement(name = "TipoPersona")
    protected Integer tipoPersona;
    @XmlElementRef(name = "TipoVivienda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoVivienda;

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
     * Obtiene el valor de la propiedad actividadEconomicaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActividadEconomicaEmpresa() {
        return actividadEconomicaEmpresa;
    }

    /**
     * Define el valor de la propiedad actividadEconomicaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActividadEconomicaEmpresa(JAXBElement<String> value) {
        this.actividadEconomicaEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad activos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivos() {
        return activos;
    }

    /**
     * Define el valor de la propiedad activos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivos(BigDecimal value) {
        this.activos = value;
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
     * Obtiene el valor de la propiedad callePrincipalTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallePrincipalTrabajo() {
        return callePrincipalTrabajo;
    }

    /**
     * Define el valor de la propiedad callePrincipalTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallePrincipalTrabajo(JAXBElement<String> value) {
        this.callePrincipalTrabajo = value;
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
     * Obtiene el valor de la propiedad calleTransversalTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalleTransversalTrabajo() {
        return calleTransversalTrabajo;
    }

    /**
     * Define el valor de la propiedad calleTransversalTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalleTransversalTrabajo(JAXBElement<String> value) {
        this.calleTransversalTrabajo = value;
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
     * Obtiene el valor de la propiedad cantonDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantonDireccionTrabajo() {
        return cantonDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad cantonDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantonDireccionTrabajo(JAXBElement<String> value) {
        this.cantonDireccionTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargoEmpresa() {
        return cargoEmpresa;
    }

    /**
     * Define el valor de la propiedad cargoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargoEmpresa(JAXBElement<String> value) {
        this.cargoEmpresa = value;
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
     * Obtiene el valor de la propiedad ciudadDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadDireccionTrabajo() {
        return ciudadDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad ciudadDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadDireccionTrabajo(JAXBElement<String> value) {
        this.ciudadDireccionTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEtnia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoEtnia() {
        return codigoEtnia;
    }

    /**
     * Define el valor de la propiedad codigoEtnia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoEtnia(JAXBElement<String> value) {
        this.codigoEtnia = value;
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
     * Obtiene el valor de la propiedad direccionReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionReferencia() {
        return direccionReferencia;
    }

    /**
     * Define el valor de la propiedad direccionReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionReferencia(JAXBElement<String> value) {
        this.direccionReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionReferencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionReferencia2() {
        return direccionReferencia2;
    }

    /**
     * Define el valor de la propiedad direccionReferencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionReferencia2(JAXBElement<String> value) {
        this.direccionReferencia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad egresoMensual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEgresoMensual() {
        return egresoMensual;
    }

    /**
     * Define el valor de la propiedad egresoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEgresoMensual(JAXBElement<BigDecimal> value) {
        this.egresoMensual = value;
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
     * Obtiene el valor de la propiedad fechaIngresoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngresoEmpresa() {
        return fechaIngresoEmpresa;
    }

    /**
     * Define el valor de la propiedad fechaIngresoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngresoEmpresa(XMLGregorianCalendar value) {
        this.fechaIngresoEmpresa = value;
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
     * Obtiene el valor de la propiedad ingresoMensual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIngresoMensual() {
        return ingresoMensual;
    }

    /**
     * Define el valor de la propiedad ingresoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIngresoMensual(JAXBElement<BigDecimal> value) {
        this.ingresoMensual = value;
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
     * Obtiene el valor de la propiedad nombreReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreReferencia() {
        return nombreReferencia;
    }

    /**
     * Define el valor de la propiedad nombreReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreReferencia(JAXBElement<String> value) {
        this.nombreReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreReferencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreReferencia2() {
        return nombreReferencia2;
    }

    /**
     * Define el valor de la propiedad nombreReferencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreReferencia2(JAXBElement<String> value) {
        this.nombreReferencia2 = value;
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
     * Obtiene el valor de la propiedad numeroCargas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCargas() {
        return numeroCargas;
    }

    /**
     * Define el valor de la propiedad numeroCargas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCargas(Integer value) {
        this.numeroCargas = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDireccion() {
        return numeroDireccion;
    }

    /**
     * Define el valor de la propiedad numeroDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDireccion(JAXBElement<String> value) {
        this.numeroDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDireccionTrabajo() {
        return numeroDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad numeroDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDireccionTrabajo(JAXBElement<String> value) {
        this.numeroDireccionTrabajo = value;
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
     * Obtiene el valor de la propiedad parentescoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentescoReferencia() {
        return parentescoReferencia;
    }

    /**
     * Define el valor de la propiedad parentescoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentescoReferencia(JAXBElement<String> value) {
        this.parentescoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad parentescoReferencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentescoReferencia2() {
        return parentescoReferencia2;
    }

    /**
     * Define el valor de la propiedad parentescoReferencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentescoReferencia2(JAXBElement<String> value) {
        this.parentescoReferencia2 = value;
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
     * Obtiene el valor de la propiedad parroquiaDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParroquiaDireccionTrabajo() {
        return parroquiaDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad parroquiaDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParroquiaDireccionTrabajo(JAXBElement<String> value) {
        this.parroquiaDireccionTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad pasivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPasivos() {
        return pasivos;
    }

    /**
     * Define el valor de la propiedad pasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPasivos(BigDecimal value) {
        this.pasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad patromonioInicial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPatromonioInicial() {
        return patromonioInicial;
    }

    /**
     * Define el valor de la propiedad patromonioInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPatromonioInicial(JAXBElement<BigDecimal> value) {
        this.patromonioInicial = value;
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
     * Obtiene el valor de la propiedad productoInicial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductoInicial() {
        return productoInicial;
    }

    /**
     * Define el valor de la propiedad productoInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductoInicial(JAXBElement<String> value) {
        this.productoInicial = value;
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
     * Obtiene el valor de la propiedad provinciaDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaDireccionTrabajo() {
        return provinciaDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad provinciaDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaDireccionTrabajo(JAXBElement<String> value) {
        this.provinciaDireccionTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad redesSociales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRedSocial> getRedesSociales() {
        return redesSociales;
    }

    /**
     * Define el valor de la propiedad redesSociales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     *     
     */
    public void setRedesSociales(JAXBElement<ArrayOfRedSocial> value) {
        this.redesSociales = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenciaDireccion() {
        return referenciaDireccion;
    }

    /**
     * Define el valor de la propiedad referenciaDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenciaDireccion(JAXBElement<String> value) {
        this.referenciaDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaDireccionTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenciaDireccionTrabajo() {
        return referenciaDireccionTrabajo;
    }

    /**
     * Define el valor de la propiedad referenciaDireccionTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenciaDireccionTrabajo(JAXBElement<String> value) {
        this.referenciaDireccionTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad residenciaFiscal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     *     
     */
    public JAXBElement<ResidenciaFiscal> getResidenciaFiscal() {
        return residenciaFiscal;
    }

    /**
     * Define el valor de la propiedad residenciaFiscal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     *     
     */
    public void setResidenciaFiscal(JAXBElement<ResidenciaFiscal> value) {
        this.residenciaFiscal = value;
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
     * Obtiene el valor de la propiedad sexo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSexo() {
        return sexo;
    }

    /**
     * Define el valor de la propiedad sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSexo(Integer value) {
        this.sexo = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldoEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSueldoEmpresa() {
        return sueldoEmpresa;
    }

    /**
     * Define el valor de la propiedad sueldoEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSueldoEmpresa(BigDecimal value) {
        this.sueldoEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad telefono.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefono() {
        return telefono;
    }

    /**
     * Define el valor de la propiedad telefono.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefono(JAXBElement<String> value) {
        this.telefono = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoReferencia() {
        return telefonoReferencia;
    }

    /**
     * Define el valor de la propiedad telefonoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoReferencia(JAXBElement<String> value) {
        this.telefonoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoReferencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoReferencia2() {
        return telefonoReferencia2;
    }

    /**
     * Define el valor de la propiedad telefonoReferencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoReferencia2(JAXBElement<String> value) {
        this.telefonoReferencia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoSms.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoSms() {
        return telefonoSms;
    }

    /**
     * Define el valor de la propiedad telefonoSms.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoSms(JAXBElement<String> value) {
        this.telefonoSms = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    /**
     * Define el valor de la propiedad telefonoTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoTrabajo(JAXBElement<String> value) {
        this.telefonoTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoActividad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoActividad() {
        return tipoActividad;
    }

    /**
     * Define el valor de la propiedad tipoActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoActividad(JAXBElement<String> value) {
        this.tipoActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Define el valor de la propiedad tipoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCliente(Integer value) {
        this.tipoCliente = value;
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

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoPersona(Integer value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVivienda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoVivienda() {
        return tipoVivienda;
    }

    /**
     * Define el valor de la propiedad tipoVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoVivienda(JAXBElement<String> value) {
        this.tipoVivienda = value;
    }

}
