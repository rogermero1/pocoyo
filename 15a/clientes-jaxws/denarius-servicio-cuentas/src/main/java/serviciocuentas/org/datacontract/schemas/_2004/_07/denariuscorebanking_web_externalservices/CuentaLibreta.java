
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


/**
 * <p>Clase Java para CuentaLibreta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CuentaLibreta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}Cuenta"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApellidTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aprobacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aprobador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bloqueada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BloqueoEjecutivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClienteCuenta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}Interviniente" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNegocioAsesor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNegocioRol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoCondicionGiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comunal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CuentaAsociada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatosSaldosCuenta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosSaldos" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionSucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionTipoBloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiaPago" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="DisponibleReal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EsAhorroRentabilidad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EsRestringida" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EstadoContrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoLibreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaPatrimonio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimoMovimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaUltimoMovimientoDTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Funcionario" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdCuentaAsociada" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOficinaApertura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdRol" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdUsuario" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Intervinientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfInterviniente" minOccurs="0"/&gt;
 *         &lt;element name="LineasPendientesLibreta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MontoBloqueado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoRetenido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTitular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroRenovaciones" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Patrimonio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizarHoy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Saldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Simbolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TextoManejaLibreta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAhorroProgramado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoBloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCondicionGiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPersona" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="ValorRetenido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValoresSuspenso" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Vinculada" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Visibilidad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuentaLibreta", propOrder = {
    "apellidTitular",
    "aprobacion",
    "aprobador",
    "bloqueada",
    "bloqueo",
    "bloqueoEjecutivo",
    "clienteCuenta",
    "codigoNegocioAsesor",
    "codigoNegocioRol",
    "codigoTipoCondicionGiro",
    "comunal",
    "contrato",
    "cuentaAsociada",
    "datosSaldosCuenta",
    "descripcionEstado",
    "descripcionSucursal",
    "descripcionTipoBloqueo",
    "diaPago",
    "disponibleReal",
    "esAhorroRentabilidad",
    "esRestringida",
    "estadoContrato",
    "estadoLibreta",
    "fechaPatrimonio",
    "fechaUltimoMovimiento",
    "fechaUltimoMovimientoDTime",
    "fechaVigencia",
    "funcionario",
    "idCuentaAsociada",
    "idOficinaApertura",
    "idRol",
    "idUsuario",
    "identificacionCliente",
    "intervinientes",
    "lineasPendientesLibreta",
    "montoBloqueado",
    "montoMensual",
    "montoRetenido",
    "nombreMoneda",
    "nombreTitular",
    "numeroRenovaciones",
    "patrimonio",
    "plazo",
    "porEfectivizar",
    "porEfectivizarHoy",
    "rol",
    "saldo",
    "saldoDisponible",
    "simbolo",
    "textoManejaLibreta",
    "tipoAhorroProgramado",
    "tipoBloqueo",
    "tipoCondicionGiro",
    "tipoPersona",
    "valorRetenido",
    "valoresSuspenso",
    "vinculada",
    "visibilidad"
})
public class CuentaLibreta
    extends Cuenta
{

    @XmlElementRef(name = "ApellidTitular", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellidTitular;
    @XmlElementRef(name = "Aprobacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aprobacion;
    @XmlElementRef(name = "Aprobador", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aprobador;
    @XmlElementRef(name = "Bloqueada", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloqueada;
    @XmlElementRef(name = "Bloqueo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloqueo;
    @XmlElementRef(name = "BloqueoEjecutivo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloqueoEjecutivo;
    @XmlElementRef(name = "ClienteCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Interviniente> clienteCuenta;
    @XmlElementRef(name = "CodigoNegocioAsesor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocioAsesor;
    @XmlElementRef(name = "CodigoNegocioRol", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocioRol;
    @XmlElementRef(name = "CodigoTipoCondicionGiro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoCondicionGiro;
    @XmlElement(name = "Comunal")
    protected Boolean comunal;
    @XmlElement(name = "Contrato")
    protected Integer contrato;
    @XmlElementRef(name = "CuentaAsociada", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaAsociada;
    @XmlElementRef(name = "DatosSaldosCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosSaldos> datosSaldosCuenta;
    @XmlElementRef(name = "DescripcionEstado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionEstado;
    @XmlElementRef(name = "DescripcionSucursal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionSucursal;
    @XmlElementRef(name = "DescripcionTipoBloqueo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoBloqueo;
    @XmlElement(name = "DiaPago")
    @XmlSchemaType(name = "unsignedByte")
    protected Short diaPago;
    @XmlElement(name = "DisponibleReal")
    protected BigDecimal disponibleReal;
    @XmlElement(name = "EsAhorroRentabilidad")
    protected Boolean esAhorroRentabilidad;
    @XmlElement(name = "EsRestringida")
    protected Boolean esRestringida;
    @XmlElementRef(name = "EstadoContrato", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoContrato;
    @XmlElementRef(name = "EstadoLibreta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoLibreta;
    @XmlElement(name = "FechaPatrimonio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPatrimonio;
    @XmlElementRef(name = "FechaUltimoMovimiento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaUltimoMovimiento;
    @XmlElement(name = "FechaUltimoMovimientoDTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUltimoMovimientoDTime;
    @XmlElement(name = "FechaVigencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVigencia;
    @XmlElement(name = "Funcionario")
    protected Boolean funcionario;
    @XmlElementRef(name = "IdCuentaAsociada", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCuentaAsociada;
    @XmlElement(name = "IdOficinaApertura")
    protected Integer idOficinaApertura;
    @XmlElement(name = "IdRol")
    protected Integer idRol;
    @XmlElement(name = "IdUsuario")
    protected Integer idUsuario;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElementRef(name = "Intervinientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfInterviniente> intervinientes;
    @XmlElement(name = "LineasPendientesLibreta")
    protected Integer lineasPendientesLibreta;
    @XmlElement(name = "MontoBloqueado")
    protected BigDecimal montoBloqueado;
    @XmlElementRef(name = "MontoMensual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montoMensual;
    @XmlElement(name = "MontoRetenido")
    protected BigDecimal montoRetenido;
    @XmlElementRef(name = "NombreMoneda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreMoneda;
    @XmlElementRef(name = "NombreTitular", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreTitular;
    @XmlElement(name = "NumeroRenovaciones")
    protected Integer numeroRenovaciones;
    @XmlElement(name = "Patrimonio")
    protected BigDecimal patrimonio;
    @XmlElementRef(name = "Plazo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> plazo;
    @XmlElement(name = "PorEfectivizar")
    protected BigDecimal porEfectivizar;
    @XmlElement(name = "PorEfectivizarHoy")
    protected BigDecimal porEfectivizarHoy;
    @XmlElementRef(name = "Rol", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rol;
    @XmlElement(name = "Saldo")
    protected BigDecimal saldo;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElementRef(name = "Simbolo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> simbolo;
    @XmlElementRef(name = "TextoManejaLibreta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textoManejaLibreta;
    @XmlElementRef(name = "TipoAhorroProgramado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAhorroProgramado;
    @XmlElementRef(name = "TipoBloqueo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoBloqueo;
    @XmlElementRef(name = "TipoCondicionGiro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCondicionGiro;
    @XmlElement(name = "TipoPersona")
    @XmlSchemaType(name = "unsignedByte")
    protected Short tipoPersona;
    @XmlElement(name = "ValorRetenido")
    protected BigDecimal valorRetenido;
    @XmlElement(name = "ValoresSuspenso")
    protected BigDecimal valoresSuspenso;
    @XmlElement(name = "Vinculada")
    protected Boolean vinculada;
    @XmlElement(name = "Visibilidad")
    protected Boolean visibilidad;

    /**
     * Obtiene el valor de la propiedad apellidTitular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellidTitular() {
        return apellidTitular;
    }

    /**
     * Define el valor de la propiedad apellidTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellidTitular(JAXBElement<String> value) {
        this.apellidTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad aprobacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAprobacion() {
        return aprobacion;
    }

    /**
     * Define el valor de la propiedad aprobacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAprobacion(JAXBElement<String> value) {
        this.aprobacion = value;
    }

    /**
     * Obtiene el valor de la propiedad aprobador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAprobador() {
        return aprobador;
    }

    /**
     * Define el valor de la propiedad aprobador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAprobador(JAXBElement<String> value) {
        this.aprobador = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloqueada() {
        return bloqueada;
    }

    /**
     * Define el valor de la propiedad bloqueada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloqueada(JAXBElement<String> value) {
        this.bloqueada = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloqueo() {
        return bloqueo;
    }

    /**
     * Define el valor de la propiedad bloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloqueo(JAXBElement<String> value) {
        this.bloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad bloqueoEjecutivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloqueoEjecutivo() {
        return bloqueoEjecutivo;
    }

    /**
     * Define el valor de la propiedad bloqueoEjecutivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloqueoEjecutivo(JAXBElement<String> value) {
        this.bloqueoEjecutivo = value;
    }

    /**
     * Obtiene el valor de la propiedad clienteCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     *     
     */
    public JAXBElement<Interviniente> getClienteCuenta() {
        return clienteCuenta;
    }

    /**
     * Define el valor de la propiedad clienteCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     *     
     */
    public void setClienteCuenta(JAXBElement<Interviniente> value) {
        this.clienteCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNegocioAsesor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoNegocioAsesor() {
        return codigoNegocioAsesor;
    }

    /**
     * Define el valor de la propiedad codigoNegocioAsesor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoNegocioAsesor(JAXBElement<String> value) {
        this.codigoNegocioAsesor = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNegocioRol.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoNegocioRol() {
        return codigoNegocioRol;
    }

    /**
     * Define el valor de la propiedad codigoNegocioRol.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoNegocioRol(JAXBElement<String> value) {
        this.codigoNegocioRol = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoCondicionGiro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoCondicionGiro() {
        return codigoTipoCondicionGiro;
    }

    /**
     * Define el valor de la propiedad codigoTipoCondicionGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoCondicionGiro(JAXBElement<String> value) {
        this.codigoTipoCondicionGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad comunal.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComunal() {
        return comunal;
    }

    /**
     * Define el valor de la propiedad comunal.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComunal(Boolean value) {
        this.comunal = value;
    }

    /**
     * Obtiene el valor de la propiedad contrato.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContrato() {
        return contrato;
    }

    /**
     * Define el valor de la propiedad contrato.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContrato(Integer value) {
        this.contrato = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaAsociada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaAsociada() {
        return cuentaAsociada;
    }

    /**
     * Define el valor de la propiedad cuentaAsociada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaAsociada(JAXBElement<String> value) {
        this.cuentaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad datosSaldosCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     *     
     */
    public JAXBElement<DatosSaldos> getDatosSaldosCuenta() {
        return datosSaldosCuenta;
    }

    /**
     * Define el valor de la propiedad datosSaldosCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     *     
     */
    public void setDatosSaldosCuenta(JAXBElement<DatosSaldos> value) {
        this.datosSaldosCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionEstado() {
        return descripcionEstado;
    }

    /**
     * Define el valor de la propiedad descripcionEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionEstado(JAXBElement<String> value) {
        this.descripcionEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionSucursal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionSucursal() {
        return descripcionSucursal;
    }

    /**
     * Define el valor de la propiedad descripcionSucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionSucursal(JAXBElement<String> value) {
        this.descripcionSucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoBloqueo() {
        return descripcionTipoBloqueo;
    }

    /**
     * Define el valor de la propiedad descripcionTipoBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoBloqueo(JAXBElement<String> value) {
        this.descripcionTipoBloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad diaPago.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDiaPago() {
        return diaPago;
    }

    /**
     * Define el valor de la propiedad diaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDiaPago(Short value) {
        this.diaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibleReal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibleReal() {
        return disponibleReal;
    }

    /**
     * Define el valor de la propiedad disponibleReal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibleReal(BigDecimal value) {
        this.disponibleReal = value;
    }

    /**
     * Obtiene el valor de la propiedad esAhorroRentabilidad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsAhorroRentabilidad() {
        return esAhorroRentabilidad;
    }

    /**
     * Define el valor de la propiedad esAhorroRentabilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsAhorroRentabilidad(Boolean value) {
        this.esAhorroRentabilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad esRestringida.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEsRestringida() {
        return esRestringida;
    }

    /**
     * Define el valor de la propiedad esRestringida.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEsRestringida(Boolean value) {
        this.esRestringida = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoContrato.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoContrato() {
        return estadoContrato;
    }

    /**
     * Define el valor de la propiedad estadoContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoContrato(JAXBElement<String> value) {
        this.estadoContrato = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoLibreta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoLibreta() {
        return estadoLibreta;
    }

    /**
     * Define el valor de la propiedad estadoLibreta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoLibreta(JAXBElement<String> value) {
        this.estadoLibreta = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPatrimonio() {
        return fechaPatrimonio;
    }

    /**
     * Define el valor de la propiedad fechaPatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPatrimonio(XMLGregorianCalendar value) {
        this.fechaPatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimoMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    /**
     * Define el valor de la propiedad fechaUltimoMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaUltimoMovimiento(JAXBElement<String> value) {
        this.fechaUltimoMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUltimoMovimientoDTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUltimoMovimientoDTime() {
        return fechaUltimoMovimientoDTime;
    }

    /**
     * Define el valor de la propiedad fechaUltimoMovimientoDTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUltimoMovimientoDTime(XMLGregorianCalendar value) {
        this.fechaUltimoMovimientoDTime = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVigencia.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * Define el valor de la propiedad fechaVigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVigencia(XMLGregorianCalendar value) {
        this.fechaVigencia = value;
    }

    /**
     * Obtiene el valor de la propiedad funcionario.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFuncionario() {
        return funcionario;
    }

    /**
     * Define el valor de la propiedad funcionario.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFuncionario(Boolean value) {
        this.funcionario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCuentaAsociada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCuentaAsociada() {
        return idCuentaAsociada;
    }

    /**
     * Define el valor de la propiedad idCuentaAsociada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCuentaAsociada(JAXBElement<Integer> value) {
        this.idCuentaAsociada = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficinaApertura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOficinaApertura() {
        return idOficinaApertura;
    }

    /**
     * Define el valor de la propiedad idOficinaApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOficinaApertura(Integer value) {
        this.idOficinaApertura = value;
    }

    /**
     * Obtiene el valor de la propiedad idRol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * Define el valor de la propiedad idRol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdRol(Integer value) {
        this.idRol = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
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
     * Obtiene el valor de la propiedad intervinientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfInterviniente> getIntervinientes() {
        return intervinientes;
    }

    /**
     * Define el valor de la propiedad intervinientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     *     
     */
    public void setIntervinientes(JAXBElement<ArrayOfInterviniente> value) {
        this.intervinientes = value;
    }

    /**
     * Obtiene el valor de la propiedad lineasPendientesLibreta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineasPendientesLibreta() {
        return lineasPendientesLibreta;
    }

    /**
     * Define el valor de la propiedad lineasPendientesLibreta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineasPendientesLibreta(Integer value) {
        this.lineasPendientesLibreta = value;
    }

    /**
     * Obtiene el valor de la propiedad montoBloqueado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoBloqueado() {
        return montoBloqueado;
    }

    /**
     * Define el valor de la propiedad montoBloqueado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoBloqueado(BigDecimal value) {
        this.montoBloqueado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMensual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontoMensual() {
        return montoMensual;
    }

    /**
     * Define el valor de la propiedad montoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontoMensual(JAXBElement<BigDecimal> value) {
        this.montoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad montoRetenido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoRetenido() {
        return montoRetenido;
    }

    /**
     * Define el valor de la propiedad montoRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoRetenido(BigDecimal value) {
        this.montoRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreMoneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreMoneda() {
        return nombreMoneda;
    }

    /**
     * Define el valor de la propiedad nombreMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreMoneda(JAXBElement<String> value) {
        this.nombreMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTitular.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreTitular() {
        return nombreTitular;
    }

    /**
     * Define el valor de la propiedad nombreTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreTitular(JAXBElement<String> value) {
        this.nombreTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroRenovaciones.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroRenovaciones() {
        return numeroRenovaciones;
    }

    /**
     * Define el valor de la propiedad numeroRenovaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroRenovaciones(Integer value) {
        this.numeroRenovaciones = value;
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
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setPlazo(JAXBElement<Short> value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad porEfectivizar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorEfectivizar() {
        return porEfectivizar;
    }

    /**
     * Define el valor de la propiedad porEfectivizar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorEfectivizar(BigDecimal value) {
        this.porEfectivizar = value;
    }

    /**
     * Obtiene el valor de la propiedad porEfectivizarHoy.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorEfectivizarHoy() {
        return porEfectivizarHoy;
    }

    /**
     * Define el valor de la propiedad porEfectivizarHoy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorEfectivizarHoy(BigDecimal value) {
        this.porEfectivizarHoy = value;
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

    /**
     * Obtiene el valor de la propiedad saldo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * Define el valor de la propiedad saldo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldo(BigDecimal value) {
        this.saldo = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDisponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Define el valor de la propiedad saldoDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDisponible(BigDecimal value) {
        this.saldoDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad simbolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSimbolo() {
        return simbolo;
    }

    /**
     * Define el valor de la propiedad simbolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSimbolo(JAXBElement<String> value) {
        this.simbolo = value;
    }

    /**
     * Obtiene el valor de la propiedad textoManejaLibreta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextoManejaLibreta() {
        return textoManejaLibreta;
    }

    /**
     * Define el valor de la propiedad textoManejaLibreta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextoManejaLibreta(JAXBElement<String> value) {
        this.textoManejaLibreta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAhorroProgramado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAhorroProgramado() {
        return tipoAhorroProgramado;
    }

    /**
     * Define el valor de la propiedad tipoAhorroProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAhorroProgramado(JAXBElement<String> value) {
        this.tipoAhorroProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoBloqueo() {
        return tipoBloqueo;
    }

    /**
     * Define el valor de la propiedad tipoBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoBloqueo(JAXBElement<String> value) {
        this.tipoBloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCondicionGiro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCondicionGiro() {
        return tipoCondicionGiro;
    }

    /**
     * Define el valor de la propiedad tipoCondicionGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCondicionGiro(JAXBElement<String> value) {
        this.tipoCondicionGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPersona.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTipoPersona() {
        return tipoPersona;
    }

    /**
     * Define el valor de la propiedad tipoPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTipoPersona(Short value) {
        this.tipoPersona = value;
    }

    /**
     * Obtiene el valor de la propiedad valorRetenido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRetenido() {
        return valorRetenido;
    }

    /**
     * Define el valor de la propiedad valorRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRetenido(BigDecimal value) {
        this.valorRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad valoresSuspenso.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValoresSuspenso() {
        return valoresSuspenso;
    }

    /**
     * Define el valor de la propiedad valoresSuspenso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValoresSuspenso(BigDecimal value) {
        this.valoresSuspenso = value;
    }

    /**
     * Obtiene el valor de la propiedad vinculada.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVinculada() {
        return vinculada;
    }

    /**
     * Define el valor de la propiedad vinculada.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVinculada(Boolean value) {
        this.vinculada = value;
    }

    /**
     * Obtiene el valor de la propiedad visibilidad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibilidad() {
        return visibilidad;
    }

    /**
     * Define el valor de la propiedad visibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibilidad(Boolean value) {
        this.visibilidad = value;
    }

}
