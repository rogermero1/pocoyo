
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


/**
 * <p>Clase Java para DatosOrigenFondos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosOrigenFondos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActividadEconomicaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActividadEconomicaClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Canton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CiudadClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinoFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetallesFormulario" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetalleOrigenFondos" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DomicilioClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaEnvioOtp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaValidacionOtp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdControlFormulario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCuenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdDatosOrigenFondos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdGeneracionOtp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOficina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdVerificacionBiometria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdVerificacionOtp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfoGeneracionOtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InfoVerificacionOtp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreDepositante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreUsuarioTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroFormulario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OcupacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OcupacionClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Oficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigenFondos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaisResidencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Parroquia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfesionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProfesionClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RepresentanteLegalCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoClienteTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoConvencional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UsuarioTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorAcumulado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorUltimaTransaccion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosOrigenFondos", propOrder = {
    "actividadEconomicaCliente",
    "actividadEconomicaClienteTransaccion",
    "canton",
    "ciudadCliente",
    "ciudadClienteTransaccion",
    "destinoFondos",
    "detallesFormulario",
    "domicilioCliente",
    "domicilioClienteTransaccion",
    "fechaEnvioOtp",
    "fechaRegistro",
    "fechaValidacionOtp",
    "idCliente",
    "idClienteTransaccion",
    "idControlFormulario",
    "idCuenta",
    "idDatosOrigenFondos",
    "idGeneracionOtp",
    "idOficina",
    "idTipoTransaccion",
    "idVerificacionBiometria",
    "idVerificacionOtp",
    "identificacionCliente",
    "identificacionClienteTransaccion",
    "infoGeneracionOtp",
    "infoVerificacionOtp",
    "nombreCliente",
    "nombreClienteTransaccion",
    "nombreDepositante",
    "nombreUsuarioTransaccion",
    "numeroCuenta",
    "numeroFormulario",
    "ocupacionCliente",
    "ocupacionClienteTransaccion",
    "oficina",
    "origenFondos",
    "paisResidencia",
    "parroquia",
    "profesionCliente",
    "profesionClienteTransaccion",
    "provincia",
    "representanteLegalCliente",
    "telefonoCliente",
    "telefonoClienteTransaccion",
    "telefonoConvencional",
    "tipoProducto",
    "tipoTransaccion",
    "usuarioTransaccion",
    "valorAcumulado",
    "valorUltimaTransaccion"
})
public class DatosOrigenFondos {

    @XmlElementRef(name = "ActividadEconomicaCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomicaCliente;
    @XmlElementRef(name = "ActividadEconomicaClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomicaClienteTransaccion;
    @XmlElementRef(name = "Canton", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> canton;
    @XmlElementRef(name = "CiudadCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadCliente;
    @XmlElementRef(name = "CiudadClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudadClienteTransaccion;
    @XmlElementRef(name = "DestinoFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinoFondos;
    @XmlElementRef(name = "DetallesFormulario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleOrigenFondos> detallesFormulario;
    @XmlElementRef(name = "DomicilioCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioCliente;
    @XmlElementRef(name = "DomicilioClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domicilioClienteTransaccion;
    @XmlElementRef(name = "FechaEnvioOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaEnvioOtp;
    @XmlElement(name = "FechaRegistro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElementRef(name = "FechaValidacionOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaValidacionOtp;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElementRef(name = "IdClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idClienteTransaccion;
    @XmlElementRef(name = "IdControlFormulario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idControlFormulario;
    @XmlElement(name = "IdCuenta")
    protected Integer idCuenta;
    @XmlElementRef(name = "IdDatosOrigenFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idDatosOrigenFondos;
    @XmlElementRef(name = "IdGeneracionOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idGeneracionOtp;
    @XmlElement(name = "IdOficina")
    protected Integer idOficina;
    @XmlElement(name = "IdTipoTransaccion")
    protected Integer idTipoTransaccion;
    @XmlElementRef(name = "IdVerificacionBiometria", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idVerificacionBiometria;
    @XmlElementRef(name = "IdVerificacionOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idVerificacionOtp;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElementRef(name = "IdentificacionClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionClienteTransaccion;
    @XmlElementRef(name = "InfoGeneracionOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> infoGeneracionOtp;
    @XmlElementRef(name = "InfoVerificacionOtp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> infoVerificacionOtp;
    @XmlElementRef(name = "NombreCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCliente;
    @XmlElementRef(name = "NombreClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreClienteTransaccion;
    @XmlElementRef(name = "NombreDepositante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreDepositante;
    @XmlElementRef(name = "NombreUsuarioTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreUsuarioTransaccion;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;
    @XmlElementRef(name = "NumeroFormulario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroFormulario;
    @XmlElementRef(name = "OcupacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ocupacionCliente;
    @XmlElementRef(name = "OcupacionClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ocupacionClienteTransaccion;
    @XmlElementRef(name = "Oficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficina;
    @XmlElementRef(name = "OrigenFondos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origenFondos;
    @XmlElementRef(name = "PaisResidencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paisResidencia;
    @XmlElementRef(name = "Parroquia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parroquia;
    @XmlElementRef(name = "ProfesionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profesionCliente;
    @XmlElementRef(name = "ProfesionClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profesionClienteTransaccion;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "RepresentanteLegalCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> representanteLegalCliente;
    @XmlElementRef(name = "TelefonoCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoCliente;
    @XmlElementRef(name = "TelefonoClienteTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoClienteTransaccion;
    @XmlElementRef(name = "TelefonoConvencional", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoConvencional;
    @XmlElementRef(name = "TipoProducto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoProducto;
    @XmlElementRef(name = "TipoTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTransaccion;
    @XmlElementRef(name = "UsuarioTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioTransaccion;
    @XmlElement(name = "ValorAcumulado")
    protected BigDecimal valorAcumulado;
    @XmlElement(name = "ValorUltimaTransaccion")
    protected BigDecimal valorUltimaTransaccion;

    /**
     * Obtiene el valor de la propiedad actividadEconomicaCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActividadEconomicaCliente() {
        return actividadEconomicaCliente;
    }

    /**
     * Define el valor de la propiedad actividadEconomicaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActividadEconomicaCliente(JAXBElement<String> value) {
        this.actividadEconomicaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad actividadEconomicaClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActividadEconomicaClienteTransaccion() {
        return actividadEconomicaClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad actividadEconomicaClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActividadEconomicaClienteTransaccion(JAXBElement<String> value) {
        this.actividadEconomicaClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad canton.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCanton() {
        return canton;
    }

    /**
     * Define el valor de la propiedad canton.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCanton(JAXBElement<String> value) {
        this.canton = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadCliente() {
        return ciudadCliente;
    }

    /**
     * Define el valor de la propiedad ciudadCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadCliente(JAXBElement<String> value) {
        this.ciudadCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudadClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudadClienteTransaccion() {
        return ciudadClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad ciudadClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudadClienteTransaccion(JAXBElement<String> value) {
        this.ciudadClienteTransaccion = value;
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
     * Obtiene el valor de la propiedad detallesFormulario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleOrigenFondos> getDetallesFormulario() {
        return detallesFormulario;
    }

    /**
     * Define el valor de la propiedad detallesFormulario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     *     
     */
    public void setDetallesFormulario(JAXBElement<ArrayOfDetalleOrigenFondos> value) {
        this.detallesFormulario = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomicilioCliente() {
        return domicilioCliente;
    }

    /**
     * Define el valor de la propiedad domicilioCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomicilioCliente(JAXBElement<String> value) {
        this.domicilioCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomicilioClienteTransaccion() {
        return domicilioClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad domicilioClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomicilioClienteTransaccion(JAXBElement<String> value) {
        this.domicilioClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEnvioOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaEnvioOtp() {
        return fechaEnvioOtp;
    }

    /**
     * Define el valor de la propiedad fechaEnvioOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaEnvioOtp(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaEnvioOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValidacionOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaValidacionOtp() {
        return fechaValidacionOtp;
    }

    /**
     * Define el valor de la propiedad fechaValidacionOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaValidacionOtp(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaValidacionOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdClienteTransaccion() {
        return idClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad idClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdClienteTransaccion(JAXBElement<Integer> value) {
        this.idClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idControlFormulario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdControlFormulario() {
        return idControlFormulario;
    }

    /**
     * Define el valor de la propiedad idControlFormulario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdControlFormulario(JAXBElement<Integer> value) {
        this.idControlFormulario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCuenta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCuenta() {
        return idCuenta;
    }

    /**
     * Define el valor de la propiedad idCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCuenta(Integer value) {
        this.idCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idDatosOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdDatosOrigenFondos() {
        return idDatosOrigenFondos;
    }

    /**
     * Define el valor de la propiedad idDatosOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdDatosOrigenFondos(JAXBElement<Integer> value) {
        this.idDatosOrigenFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad idGeneracionOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdGeneracionOtp() {
        return idGeneracionOtp;
    }

    /**
     * Define el valor de la propiedad idGeneracionOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdGeneracionOtp(JAXBElement<Integer> value) {
        this.idGeneracionOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOficina() {
        return idOficina;
    }

    /**
     * Define el valor de la propiedad idOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOficina(Integer value) {
        this.idOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoTransaccion() {
        return idTipoTransaccion;
    }

    /**
     * Define el valor de la propiedad idTipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoTransaccion(Integer value) {
        this.idTipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idVerificacionBiometria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdVerificacionBiometria() {
        return idVerificacionBiometria;
    }

    /**
     * Define el valor de la propiedad idVerificacionBiometria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdVerificacionBiometria(JAXBElement<String> value) {
        this.idVerificacionBiometria = value;
    }

    /**
     * Obtiene el valor de la propiedad idVerificacionOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdVerificacionOtp() {
        return idVerificacionOtp;
    }

    /**
     * Define el valor de la propiedad idVerificacionOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdVerificacionOtp(JAXBElement<Integer> value) {
        this.idVerificacionOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Define el valor de la propiedad identificacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionCliente(JAXBElement<String> value) {
        this.identificacionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionClienteTransaccion() {
        return identificacionClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad identificacionClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionClienteTransaccion(JAXBElement<String> value) {
        this.identificacionClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad infoGeneracionOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfoGeneracionOtp() {
        return infoGeneracionOtp;
    }

    /**
     * Define el valor de la propiedad infoGeneracionOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfoGeneracionOtp(JAXBElement<String> value) {
        this.infoGeneracionOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad infoVerificacionOtp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInfoVerificacionOtp() {
        return infoVerificacionOtp;
    }

    /**
     * Define el valor de la propiedad infoVerificacionOtp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInfoVerificacionOtp(JAXBElement<String> value) {
        this.infoVerificacionOtp = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Define el valor de la propiedad nombreCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCliente(JAXBElement<String> value) {
        this.nombreCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreClienteTransaccion() {
        return nombreClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad nombreClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreClienteTransaccion(JAXBElement<String> value) {
        this.nombreClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDepositante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreDepositante() {
        return nombreDepositante;
    }

    /**
     * Define el valor de la propiedad nombreDepositante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreDepositante(JAXBElement<String> value) {
        this.nombreDepositante = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreUsuarioTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreUsuarioTransaccion() {
        return nombreUsuarioTransaccion;
    }

    /**
     * Define el valor de la propiedad nombreUsuarioTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreUsuarioTransaccion(JAXBElement<String> value) {
        this.nombreUsuarioTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuenta(JAXBElement<String> value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroFormulario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroFormulario() {
        return numeroFormulario;
    }

    /**
     * Define el valor de la propiedad numeroFormulario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroFormulario(JAXBElement<String> value) {
        this.numeroFormulario = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOcupacionCliente() {
        return ocupacionCliente;
    }

    /**
     * Define el valor de la propiedad ocupacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOcupacionCliente(JAXBElement<String> value) {
        this.ocupacionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad ocupacionClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOcupacionClienteTransaccion() {
        return ocupacionClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad ocupacionClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOcupacionClienteTransaccion(JAXBElement<String> value) {
        this.ocupacionClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficina(JAXBElement<String> value) {
        this.oficina = value;
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
     * Obtiene el valor de la propiedad paisResidencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaisResidencia() {
        return paisResidencia;
    }

    /**
     * Define el valor de la propiedad paisResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaisResidencia(JAXBElement<String> value) {
        this.paisResidencia = value;
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
     * Obtiene el valor de la propiedad profesionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfesionCliente() {
        return profesionCliente;
    }

    /**
     * Define el valor de la propiedad profesionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfesionCliente(JAXBElement<String> value) {
        this.profesionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad profesionClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfesionClienteTransaccion() {
        return profesionClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad profesionClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfesionClienteTransaccion(JAXBElement<String> value) {
        this.profesionClienteTransaccion = value;
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
     * Obtiene el valor de la propiedad representanteLegalCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRepresentanteLegalCliente() {
        return representanteLegalCliente;
    }

    /**
     * Define el valor de la propiedad representanteLegalCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRepresentanteLegalCliente(JAXBElement<String> value) {
        this.representanteLegalCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoCliente() {
        return telefonoCliente;
    }

    /**
     * Define el valor de la propiedad telefonoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoCliente(JAXBElement<String> value) {
        this.telefonoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoClienteTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoClienteTransaccion() {
        return telefonoClienteTransaccion;
    }

    /**
     * Define el valor de la propiedad telefonoClienteTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoClienteTransaccion(JAXBElement<String> value) {
        this.telefonoClienteTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoConvencional.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoConvencional() {
        return telefonoConvencional;
    }

    /**
     * Define el valor de la propiedad telefonoConvencional.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoConvencional(JAXBElement<String> value) {
        this.telefonoConvencional = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Define el valor de la propiedad tipoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoProducto(JAXBElement<String> value) {
        this.tipoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTransaccion(JAXBElement<String> value) {
        this.tipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioTransaccion() {
        return usuarioTransaccion;
    }

    /**
     * Define el valor de la propiedad usuarioTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioTransaccion(JAXBElement<String> value) {
        this.usuarioTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorAcumulado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorAcumulado() {
        return valorAcumulado;
    }

    /**
     * Define el valor de la propiedad valorAcumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorAcumulado(BigDecimal value) {
        this.valorAcumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad valorUltimaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUltimaTransaccion() {
        return valorUltimaTransaccion;
    }

    /**
     * Define el valor de la propiedad valorUltimaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUltimaTransaccion(BigDecimal value) {
        this.valorUltimaTransaccion = value;
    }

}
