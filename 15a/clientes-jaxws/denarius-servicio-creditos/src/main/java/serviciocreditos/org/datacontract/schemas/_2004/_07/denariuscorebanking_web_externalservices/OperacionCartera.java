
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

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
 * <p>Clase Java para OperacionCartera complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionCartera"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodOficial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodOficina" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="CodigoActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCantonDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDesEspecifico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOrigenRecursos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoParroquiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProvinciaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoSegmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoOp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DesTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescFormaRecepcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescTipoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescTipoPlazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionCantonDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionCiudadDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionDesEspecifico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionOrigenRecursos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionParroquiaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionProvinciaDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionSegmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EnviadoCartera" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoOper" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="EstadoSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeEmision" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaDeVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacionCartera" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoAprobado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoDesembolsado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreOficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuotas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDeTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacionCartera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoCapital" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoInteres" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="SaldoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPlazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionCartera", propOrder = {
    "actividadEconomica",
    "codOficial",
    "codOficina",
    "codigoActividadEconomica",
    "codigoCantonDestino",
    "codigoCiudadDestino",
    "codigoCliente",
    "codigoDesEspecifico",
    "codigoMoneda",
    "codigoOficina",
    "codigoOrigenRecursos",
    "codigoParroquiaDestino",
    "codigoProvinciaDestino",
    "codigoSector",
    "codigoSegmento",
    "codigoTipoCredito",
    "codigoTipoOp",
    "cuenta",
    "desMoneda",
    "desSector",
    "desTipoOperacion",
    "descFormaRecepcion",
    "descTipoCuota",
    "descTipoPlazo",
    "descripcionCantonDestino",
    "descripcionCiudadDestino",
    "descripcionDesEspecifico",
    "descripcionOficina",
    "descripcionOrigenRecursos",
    "descripcionParroquiaDestino",
    "descripcionProvinciaDestino",
    "descripcionSegmento",
    "enviadoCartera",
    "estado",
    "estadoOper",
    "estadoSolicitud",
    "fechaDeEmision",
    "fechaDeVencimiento",
    "fechaLiquidacion",
    "idOperacionCartera",
    "idTipoCredito",
    "identificacionCliente",
    "montoAprobado",
    "montoDesembolsado",
    "nombreCliente",
    "nombreOficial",
    "numeroCuotas",
    "numeroDeTramite",
    "numeroOperacionCartera",
    "periodoCapital",
    "periodoInteres",
    "plazo",
    "saldoCapital",
    "segmento",
    "tasaInteres",
    "tipoCredito",
    "tipoCuota",
    "tipoPlazo",
    "valorCuota"
})
public class OperacionCartera {

    @XmlElementRef(name = "ActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomica;
    @XmlElement(name = "CodOficial")
    protected Integer codOficial;
    @XmlElementRef(name = "CodOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> codOficina;
    @XmlElementRef(name = "CodigoActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoActividadEconomica;
    @XmlElementRef(name = "CodigoCantonDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCantonDestino;
    @XmlElementRef(name = "CodigoCiudadDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoCiudadDestino;
    @XmlElement(name = "CodigoCliente")
    protected Integer codigoCliente;
    @XmlElementRef(name = "CodigoDesEspecifico", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoDesEspecifico;
    @XmlElementRef(name = "CodigoMoneda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoMoneda;
    @XmlElementRef(name = "CodigoOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoOficina;
    @XmlElementRef(name = "CodigoOrigenRecursos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoOrigenRecursos;
    @XmlElementRef(name = "CodigoParroquiaDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoParroquiaDestino;
    @XmlElementRef(name = "CodigoProvinciaDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProvinciaDestino;
    @XmlElementRef(name = "CodigoSector", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoSector;
    @XmlElementRef(name = "CodigoSegmento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoSegmento;
    @XmlElementRef(name = "CodigoTipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoCredito;
    @XmlElementRef(name = "CodigoTipoOp", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoOp;
    @XmlElementRef(name = "Cuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuenta;
    @XmlElementRef(name = "DesMoneda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desMoneda;
    @XmlElementRef(name = "DesSector", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desSector;
    @XmlElementRef(name = "DesTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTipoOperacion;
    @XmlElementRef(name = "DescFormaRecepcion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descFormaRecepcion;
    @XmlElementRef(name = "DescTipoCuota", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descTipoCuota;
    @XmlElementRef(name = "DescTipoPlazo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descTipoPlazo;
    @XmlElementRef(name = "DescripcionCantonDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionCantonDestino;
    @XmlElementRef(name = "DescripcionCiudadDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionCiudadDestino;
    @XmlElementRef(name = "DescripcionDesEspecifico", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionDesEspecifico;
    @XmlElementRef(name = "DescripcionOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionOficina;
    @XmlElementRef(name = "DescripcionOrigenRecursos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionOrigenRecursos;
    @XmlElementRef(name = "DescripcionParroquiaDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionParroquiaDestino;
    @XmlElementRef(name = "DescripcionProvinciaDestino", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionProvinciaDestino;
    @XmlElementRef(name = "DescripcionSegmento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionSegmento;
    @XmlElement(name = "EnviadoCartera")
    protected Boolean enviadoCartera;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElement(name = "EstadoOper")
    @XmlSchemaType(name = "unsignedByte")
    protected Short estadoOper;
    @XmlElementRef(name = "EstadoSolicitud", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoSolicitud;
    @XmlElementRef(name = "FechaDeEmision", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaDeEmision;
    @XmlElementRef(name = "FechaDeVencimiento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaDeVencimiento;
    @XmlElementRef(name = "FechaLiquidacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaLiquidacion;
    @XmlElement(name = "IdOperacionCartera")
    protected Integer idOperacionCartera;
    @XmlElementRef(name = "IdTipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTipoCredito;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElement(name = "MontoAprobado")
    protected BigDecimal montoAprobado;
    @XmlElement(name = "MontoDesembolsado")
    protected BigDecimal montoDesembolsado;
    @XmlElementRef(name = "NombreCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCliente;
    @XmlElementRef(name = "NombreOficial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOficial;
    @XmlElement(name = "NumeroCuotas")
    protected Integer numeroCuotas;
    @XmlElement(name = "NumeroDeTramite")
    protected Integer numeroDeTramite;
    @XmlElementRef(name = "NumeroOperacionCartera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacionCartera;
    @XmlElement(name = "PeriodoCapital")
    protected Short periodoCapital;
    @XmlElement(name = "PeriodoInteres")
    protected Short periodoInteres;
    @XmlElement(name = "Plazo")
    protected Short plazo;
    @XmlElement(name = "SaldoCapital")
    protected BigDecimal saldoCapital;
    @XmlElementRef(name = "Segmento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> segmento;
    @XmlElement(name = "TasaInteres")
    protected BigDecimal tasaInteres;
    @XmlElementRef(name = "TipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCredito;
    @XmlElementRef(name = "TipoCuota", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuota;
    @XmlElementRef(name = "TipoPlazo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPlazo;
    @XmlElement(name = "ValorCuota")
    protected BigDecimal valorCuota;

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
     * Obtiene el valor de la propiedad codOficial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodOficial() {
        return codOficial;
    }

    /**
     * Define el valor de la propiedad codOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodOficial(Integer value) {
        this.codOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad codOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getCodOficina() {
        return codOficina;
    }

    /**
     * Define el valor de la propiedad codOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setCodOficina(JAXBElement<Short> value) {
        this.codOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoActividadEconomica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    /**
     * Define el valor de la propiedad codigoActividadEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoActividadEconomica(JAXBElement<String> value) {
        this.codigoActividadEconomica = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCantonDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCantonDestino() {
        return codigoCantonDestino;
    }

    /**
     * Define el valor de la propiedad codigoCantonDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCantonDestino(JAXBElement<String> value) {
        this.codigoCantonDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCiudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoCiudadDestino() {
        return codigoCiudadDestino;
    }

    /**
     * Define el valor de la propiedad codigoCiudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoCiudadDestino(JAXBElement<String> value) {
        this.codigoCiudadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define el valor de la propiedad codigoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoCliente(Integer value) {
        this.codigoCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDesEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoDesEspecifico() {
        return codigoDesEspecifico;
    }

    /**
     * Define el valor de la propiedad codigoDesEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoDesEspecifico(JAXBElement<String> value) {
        this.codigoDesEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoMoneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoMoneda() {
        return codigoMoneda;
    }

    /**
     * Define el valor de la propiedad codigoMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoMoneda(JAXBElement<String> value) {
        this.codigoMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoOficina() {
        return codigoOficina;
    }

    /**
     * Define el valor de la propiedad codigoOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoOficina(JAXBElement<String> value) {
        this.codigoOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOrigenRecursos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoOrigenRecursos() {
        return codigoOrigenRecursos;
    }

    /**
     * Define el valor de la propiedad codigoOrigenRecursos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoOrigenRecursos(JAXBElement<String> value) {
        this.codigoOrigenRecursos = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoParroquiaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoParroquiaDestino() {
        return codigoParroquiaDestino;
    }

    /**
     * Define el valor de la propiedad codigoParroquiaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoParroquiaDestino(JAXBElement<String> value) {
        this.codigoParroquiaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProvinciaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProvinciaDestino() {
        return codigoProvinciaDestino;
    }

    /**
     * Define el valor de la propiedad codigoProvinciaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProvinciaDestino(JAXBElement<String> value) {
        this.codigoProvinciaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSector() {
        return codigoSector;
    }

    /**
     * Define el valor de la propiedad codigoSector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSector(JAXBElement<String> value) {
        this.codigoSector = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoSegmento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSegmento() {
        return codigoSegmento;
    }

    /**
     * Define el valor de la propiedad codigoSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSegmento(JAXBElement<String> value) {
        this.codigoSegmento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoCredito() {
        return codigoTipoCredito;
    }

    /**
     * Define el valor de la propiedad codigoTipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoCredito(JAXBElement<String> value) {
        this.codigoTipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoOp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoOp() {
        return codigoTipoOp;
    }

    /**
     * Define el valor de la propiedad codigoTipoOp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoOp(JAXBElement<String> value) {
        this.codigoTipoOp = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuenta(JAXBElement<String> value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad desMoneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesMoneda() {
        return desMoneda;
    }

    /**
     * Define el valor de la propiedad desMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesMoneda(JAXBElement<String> value) {
        this.desMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad desSector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesSector() {
        return desSector;
    }

    /**
     * Define el valor de la propiedad desSector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesSector(JAXBElement<String> value) {
        this.desSector = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTipoOperacion() {
        return desTipoOperacion;
    }

    /**
     * Define el valor de la propiedad desTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTipoOperacion(JAXBElement<String> value) {
        this.desTipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descFormaRecepcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescFormaRecepcion() {
        return descFormaRecepcion;
    }

    /**
     * Define el valor de la propiedad descFormaRecepcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescFormaRecepcion(JAXBElement<String> value) {
        this.descFormaRecepcion = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoCuota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescTipoCuota() {
        return descTipoCuota;
    }

    /**
     * Define el valor de la propiedad descTipoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescTipoCuota(JAXBElement<String> value) {
        this.descTipoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoPlazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescTipoPlazo() {
        return descTipoPlazo;
    }

    /**
     * Define el valor de la propiedad descTipoPlazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescTipoPlazo(JAXBElement<String> value) {
        this.descTipoPlazo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCantonDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionCantonDestino() {
        return descripcionCantonDestino;
    }

    /**
     * Define el valor de la propiedad descripcionCantonDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionCantonDestino(JAXBElement<String> value) {
        this.descripcionCantonDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionCiudadDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionCiudadDestino() {
        return descripcionCiudadDestino;
    }

    /**
     * Define el valor de la propiedad descripcionCiudadDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionCiudadDestino(JAXBElement<String> value) {
        this.descripcionCiudadDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionDesEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionDesEspecifico() {
        return descripcionDesEspecifico;
    }

    /**
     * Define el valor de la propiedad descripcionDesEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionDesEspecifico(JAXBElement<String> value) {
        this.descripcionDesEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionOficina() {
        return descripcionOficina;
    }

    /**
     * Define el valor de la propiedad descripcionOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionOficina(JAXBElement<String> value) {
        this.descripcionOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOrigenRecursos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionOrigenRecursos() {
        return descripcionOrigenRecursos;
    }

    /**
     * Define el valor de la propiedad descripcionOrigenRecursos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionOrigenRecursos(JAXBElement<String> value) {
        this.descripcionOrigenRecursos = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionParroquiaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionParroquiaDestino() {
        return descripcionParroquiaDestino;
    }

    /**
     * Define el valor de la propiedad descripcionParroquiaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionParroquiaDestino(JAXBElement<String> value) {
        this.descripcionParroquiaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionProvinciaDestino.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionProvinciaDestino() {
        return descripcionProvinciaDestino;
    }

    /**
     * Define el valor de la propiedad descripcionProvinciaDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionProvinciaDestino(JAXBElement<String> value) {
        this.descripcionProvinciaDestino = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionSegmento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionSegmento() {
        return descripcionSegmento;
    }

    /**
     * Define el valor de la propiedad descripcionSegmento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionSegmento(JAXBElement<String> value) {
        this.descripcionSegmento = value;
    }

    /**
     * Obtiene el valor de la propiedad enviadoCartera.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnviadoCartera() {
        return enviadoCartera;
    }

    /**
     * Define el valor de la propiedad enviadoCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnviadoCartera(Boolean value) {
        this.enviadoCartera = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoOper.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getEstadoOper() {
        return estadoOper;
    }

    /**
     * Define el valor de la propiedad estadoOper.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setEstadoOper(Short value) {
        this.estadoOper = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoSolicitud() {
        return estadoSolicitud;
    }

    /**
     * Define el valor de la propiedad estadoSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoSolicitud(JAXBElement<String> value) {
        this.estadoSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeEmision.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaDeEmision() {
        return fechaDeEmision;
    }

    /**
     * Define el valor de la propiedad fechaDeEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaDeEmision(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaDeEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDeVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaDeVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaDeVencimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaDeVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaLiquidacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaLiquidacion() {
        return fechaLiquidacion;
    }

    /**
     * Define el valor de la propiedad fechaLiquidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaLiquidacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaLiquidacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacionCartera.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperacionCartera() {
        return idOperacionCartera;
    }

    /**
     * Define el valor de la propiedad idOperacionCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperacionCartera(Integer value) {
        this.idOperacionCartera = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTipoCredito() {
        return idTipoCredito;
    }

    /**
     * Define el valor de la propiedad idTipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTipoCredito(JAXBElement<Integer> value) {
        this.idTipoCredito = value;
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
     * Obtiene el valor de la propiedad montoAprobado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoAprobado() {
        return montoAprobado;
    }

    /**
     * Define el valor de la propiedad montoAprobado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoAprobado(BigDecimal value) {
        this.montoAprobado = value;
    }

    /**
     * Obtiene el valor de la propiedad montoDesembolsado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoDesembolsado() {
        return montoDesembolsado;
    }

    /**
     * Define el valor de la propiedad montoDesembolsado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoDesembolsado(BigDecimal value) {
        this.montoDesembolsado = value;
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
     * Obtiene el valor de la propiedad nombreOficial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreOficial() {
        return nombreOficial;
    }

    /**
     * Define el valor de la propiedad nombreOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreOficial(JAXBElement<String> value) {
        this.nombreOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuotas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCuotas() {
        return numeroCuotas;
    }

    /**
     * Define el valor de la propiedad numeroCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCuotas(Integer value) {
        this.numeroCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDeTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroDeTramite() {
        return numeroDeTramite;
    }

    /**
     * Define el valor de la propiedad numeroDeTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroDeTramite(Integer value) {
        this.numeroDeTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionCartera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOperacionCartera() {
        return numeroOperacionCartera;
    }

    /**
     * Define el valor de la propiedad numeroOperacionCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOperacionCartera(JAXBElement<String> value) {
        this.numeroOperacionCartera = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoCapital.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPeriodoCapital() {
        return periodoCapital;
    }

    /**
     * Define el valor de la propiedad periodoCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPeriodoCapital(Short value) {
        this.periodoCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoInteres.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPeriodoInteres() {
        return periodoInteres;
    }

    /**
     * Define el valor de la propiedad periodoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPeriodoInteres(Short value) {
        this.periodoInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPlazo(Short value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoCapital.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoCapital() {
        return saldoCapital;
    }

    /**
     * Define el valor de la propiedad saldoCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoCapital(BigDecimal value) {
        this.saldoCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSegmento(JAXBElement<Integer> value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Define el valor de la propiedad tasaInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaInteres(BigDecimal value) {
        this.tasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define el valor de la propiedad tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCredito(JAXBElement<String> value) {
        this.tipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuota() {
        return tipoCuota;
    }

    /**
     * Define el valor de la propiedad tipoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuota(JAXBElement<String> value) {
        this.tipoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPlazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPlazo() {
        return tipoPlazo;
    }

    /**
     * Define el valor de la propiedad tipoPlazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPlazo(JAXBElement<String> value) {
        this.tipoPlazo = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCuota() {
        return valorCuota;
    }

    /**
     * Define el valor de la propiedad valorCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCuota(BigDecimal value) {
        this.valorCuota = value;
    }

}
