
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

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
 * <p>Clase Java para DatosInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Cuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Custodia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DetalleOrigRecurso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiasTranscurridos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Endosado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaCancelacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaEfectivizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaNegociacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaProximoInteres" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaValor" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOficialCaptador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOficina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Impreso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Interes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresPorRecibir" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresRecibido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresRetenido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Margen" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonedaCodigoIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonedaSimbolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoAcruar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoBloqueado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoPignoracion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OficialCaptador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OficialPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigRecursosString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajePignoracion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Reajustable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Renovacion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Signo" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Tasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaAnterior" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaReajustable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoCaptacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoPagoInteres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosInversion", propOrder = {
    "actividadEconomica",
    "cliente",
    "codigoEstado",
    "cuota",
    "custodia",
    "detalleOrigRecurso",
    "diasTranscurridos",
    "endosado",
    "estado",
    "fechaCancelacion",
    "fechaEfectivizacion",
    "fechaNegociacion",
    "fechaProximoInteres",
    "fechaRecibo",
    "fechaValor",
    "fechaVencimiento",
    "idCliente",
    "idOficialCaptador",
    "idOficina",
    "identificacion",
    "impreso",
    "impuesto",
    "interes",
    "interesActual",
    "interesPorRecibir",
    "interesRecibido",
    "interesRetenido",
    "interesTotal",
    "margen",
    "moneda",
    "monedaCodigoIso",
    "monedaSimbolo",
    "monto",
    "montoAcruar",
    "montoBloqueado",
    "montoPignoracion",
    "numeroOperacion",
    "oficialCaptador",
    "oficialPrincipal",
    "origRecursosString",
    "plazo",
    "porcentajePignoracion",
    "reajustable",
    "renovacion",
    "signo",
    "tasa",
    "tasaAnterior",
    "tasaReajustable",
    "tipoCaptacion",
    "tipoPagoInteres"
})
public class DatosInversion {

    @XmlElementRef(name = "ActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actividadEconomica;
    @XmlElementRef(name = "Cliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cliente;
    @XmlElementRef(name = "CodigoEstado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoEstado;
    @XmlElement(name = "Cuota")
    protected BigDecimal cuota;
    @XmlElement(name = "Custodia")
    protected Boolean custodia;
    @XmlElementRef(name = "DetalleOrigRecurso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalleOrigRecurso;
    @XmlElement(name = "DiasTranscurridos")
    protected Integer diasTranscurridos;
    @XmlElementRef(name = "Endosado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endosado;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "FechaCancelacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCancelacion;
    @XmlElementRef(name = "FechaEfectivizacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaEfectivizacion;
    @XmlElementRef(name = "FechaNegociacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaNegociacion;
    @XmlElementRef(name = "FechaProximoInteres", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaProximoInteres;
    @XmlElement(name = "FechaRecibo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecibo;
    @XmlElement(name = "FechaValor")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaValor;
    @XmlElement(name = "FechaVencimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElement(name = "IdOficialCaptador")
    protected Integer idOficialCaptador;
    @XmlElement(name = "IdOficina")
    protected Integer idOficina;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElement(name = "Impreso")
    protected Boolean impreso;
    @XmlElement(name = "Impuesto")
    protected BigDecimal impuesto;
    @XmlElement(name = "Interes")
    protected BigDecimal interes;
    @XmlElement(name = "InteresActual")
    protected BigDecimal interesActual;
    @XmlElement(name = "InteresPorRecibir")
    protected BigDecimal interesPorRecibir;
    @XmlElement(name = "InteresRecibido")
    protected BigDecimal interesRecibido;
    @XmlElement(name = "InteresRetenido")
    protected BigDecimal interesRetenido;
    @XmlElement(name = "InteresTotal")
    protected BigDecimal interesTotal;
    @XmlElement(name = "Margen")
    protected BigDecimal margen;
    @XmlElementRef(name = "Moneda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moneda;
    @XmlElementRef(name = "MonedaCodigoIso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaCodigoIso;
    @XmlElementRef(name = "MonedaSimbolo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> monedaSimbolo;
    @XmlElementRef(name = "Monto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> monto;
    @XmlElement(name = "MontoAcruar")
    protected BigDecimal montoAcruar;
    @XmlElement(name = "MontoBloqueado")
    protected BigDecimal montoBloqueado;
    @XmlElement(name = "MontoPignoracion")
    protected BigDecimal montoPignoracion;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElementRef(name = "OficialCaptador", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficialCaptador;
    @XmlElementRef(name = "OficialPrincipal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficialPrincipal;
    @XmlElementRef(name = "OrigRecursosString", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origRecursosString;
    @XmlElement(name = "Plazo")
    protected Integer plazo;
    @XmlElement(name = "PorcentajePignoracion")
    protected BigDecimal porcentajePignoracion;
    @XmlElementRef(name = "Reajustable", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reajustable;
    @XmlElement(name = "Renovacion")
    protected Boolean renovacion;
    @XmlElement(name = "Signo")
    protected Integer signo;
    @XmlElement(name = "Tasa")
    protected BigDecimal tasa;
    @XmlElement(name = "TasaAnterior")
    protected BigDecimal tasaAnterior;
    @XmlElement(name = "TasaReajustable")
    protected Boolean tasaReajustable;
    @XmlElementRef(name = "TipoCaptacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCaptacion;
    @XmlElementRef(name = "TipoPagoInteres", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoPagoInteres;

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
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCliente(JAXBElement<String> value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoEstado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoEstado() {
        return codigoEstado;
    }

    /**
     * Define el valor de la propiedad codigoEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoEstado(JAXBElement<String> value) {
        this.codigoEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad cuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuota() {
        return cuota;
    }

    /**
     * Define el valor de la propiedad cuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuota(BigDecimal value) {
        this.cuota = value;
    }

    /**
     * Obtiene el valor de la propiedad custodia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustodia() {
        return custodia;
    }

    /**
     * Define el valor de la propiedad custodia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustodia(Boolean value) {
        this.custodia = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleOrigRecurso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetalleOrigRecurso() {
        return detalleOrigRecurso;
    }

    /**
     * Define el valor de la propiedad detalleOrigRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetalleOrigRecurso(JAXBElement<String> value) {
        this.detalleOrigRecurso = value;
    }

    /**
     * Obtiene el valor de la propiedad diasTranscurridos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasTranscurridos() {
        return diasTranscurridos;
    }

    /**
     * Define el valor de la propiedad diasTranscurridos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasTranscurridos(Integer value) {
        this.diasTranscurridos = value;
    }

    /**
     * Obtiene el valor de la propiedad endosado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndosado() {
        return endosado;
    }

    /**
     * Define el valor de la propiedad endosado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndosado(JAXBElement<String> value) {
        this.endosado = value;
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
     * Obtiene el valor de la propiedad fechaCancelacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCancelacion() {
        return fechaCancelacion;
    }

    /**
     * Define el valor de la propiedad fechaCancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaCancelacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEfectivizacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaEfectivizacion() {
        return fechaEfectivizacion;
    }

    /**
     * Define el valor de la propiedad fechaEfectivizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaEfectivizacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaEfectivizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaNegociacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaNegociacion() {
        return fechaNegociacion;
    }

    /**
     * Define el valor de la propiedad fechaNegociacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaNegociacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaNegociacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProximoInteres.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaProximoInteres() {
        return fechaProximoInteres;
    }

    /**
     * Define el valor de la propiedad fechaProximoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaProximoInteres(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaProximoInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRecibo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecibo() {
        return fechaRecibo;
    }

    /**
     * Define el valor de la propiedad fechaRecibo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecibo(XMLGregorianCalendar value) {
        this.fechaRecibo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaValor.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValor() {
        return fechaValor;
    }

    /**
     * Define el valor de la propiedad fechaValor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValor(XMLGregorianCalendar value) {
        this.fechaValor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
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
     * Obtiene el valor de la propiedad idOficialCaptador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOficialCaptador() {
        return idOficialCaptador;
    }

    /**
     * Define el valor de la propiedad idOficialCaptador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOficialCaptador(Integer value) {
        this.idOficialCaptador = value;
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
     * Obtiene el valor de la propiedad impreso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImpreso() {
        return impreso;
    }

    /**
     * Define el valor de la propiedad impreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImpreso(Boolean value) {
        this.impreso = value;
    }

    /**
     * Obtiene el valor de la propiedad impuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImpuesto() {
        return impuesto;
    }

    /**
     * Define el valor de la propiedad impuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImpuesto(BigDecimal value) {
        this.impuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad interes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteres() {
        return interes;
    }

    /**
     * Define el valor de la propiedad interes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteres(BigDecimal value) {
        this.interes = value;
    }

    /**
     * Obtiene el valor de la propiedad interesActual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresActual() {
        return interesActual;
    }

    /**
     * Define el valor de la propiedad interesActual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresActual(BigDecimal value) {
        this.interesActual = value;
    }

    /**
     * Obtiene el valor de la propiedad interesPorRecibir.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresPorRecibir() {
        return interesPorRecibir;
    }

    /**
     * Define el valor de la propiedad interesPorRecibir.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresPorRecibir(BigDecimal value) {
        this.interesPorRecibir = value;
    }

    /**
     * Obtiene el valor de la propiedad interesRecibido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresRecibido() {
        return interesRecibido;
    }

    /**
     * Define el valor de la propiedad interesRecibido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresRecibido(BigDecimal value) {
        this.interesRecibido = value;
    }

    /**
     * Obtiene el valor de la propiedad interesRetenido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresRetenido() {
        return interesRetenido;
    }

    /**
     * Define el valor de la propiedad interesRetenido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresRetenido(BigDecimal value) {
        this.interesRetenido = value;
    }

    /**
     * Obtiene el valor de la propiedad interesTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresTotal() {
        return interesTotal;
    }

    /**
     * Define el valor de la propiedad interesTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresTotal(BigDecimal value) {
        this.interesTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad margen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargen() {
        return margen;
    }

    /**
     * Define el valor de la propiedad margen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargen(BigDecimal value) {
        this.margen = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoneda(JAXBElement<String> value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaCodigoIso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaCodigoIso() {
        return monedaCodigoIso;
    }

    /**
     * Define el valor de la propiedad monedaCodigoIso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaCodigoIso(JAXBElement<String> value) {
        this.monedaCodigoIso = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaSimbolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMonedaSimbolo() {
        return monedaSimbolo;
    }

    /**
     * Define el valor de la propiedad monedaSimbolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMonedaSimbolo(JAXBElement<String> value) {
        this.monedaSimbolo = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMonto(JAXBElement<BigDecimal> value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAcruar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoAcruar() {
        return montoAcruar;
    }

    /**
     * Define el valor de la propiedad montoAcruar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoAcruar(BigDecimal value) {
        this.montoAcruar = value;
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
     * Obtiene el valor de la propiedad montoPignoracion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoPignoracion() {
        return montoPignoracion;
    }

    /**
     * Define el valor de la propiedad montoPignoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoPignoracion(BigDecimal value) {
        this.montoPignoracion = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Define el valor de la propiedad numeroOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOperacion(JAXBElement<String> value) {
        this.numeroOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad oficialCaptador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficialCaptador() {
        return oficialCaptador;
    }

    /**
     * Define el valor de la propiedad oficialCaptador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficialCaptador(JAXBElement<String> value) {
        this.oficialCaptador = value;
    }

    /**
     * Obtiene el valor de la propiedad oficialPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficialPrincipal() {
        return oficialPrincipal;
    }

    /**
     * Define el valor de la propiedad oficialPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficialPrincipal(JAXBElement<String> value) {
        this.oficialPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad origRecursosString.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigRecursosString() {
        return origRecursosString;
    }

    /**
     * Define el valor de la propiedad origRecursosString.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigRecursosString(JAXBElement<String> value) {
        this.origRecursosString = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazo(Integer value) {
        this.plazo = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajePignoracion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajePignoracion() {
        return porcentajePignoracion;
    }

    /**
     * Define el valor de la propiedad porcentajePignoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajePignoracion(BigDecimal value) {
        this.porcentajePignoracion = value;
    }

    /**
     * Obtiene el valor de la propiedad reajustable.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReajustable() {
        return reajustable;
    }

    /**
     * Define el valor de la propiedad reajustable.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReajustable(JAXBElement<String> value) {
        this.reajustable = value;
    }

    /**
     * Obtiene el valor de la propiedad renovacion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenovacion() {
        return renovacion;
    }

    /**
     * Define el valor de la propiedad renovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenovacion(Boolean value) {
        this.renovacion = value;
    }

    /**
     * Obtiene el valor de la propiedad signo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSigno() {
        return signo;
    }

    /**
     * Define el valor de la propiedad signo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSigno(Integer value) {
        this.signo = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaAnterior.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaAnterior() {
        return tasaAnterior;
    }

    /**
     * Define el valor de la propiedad tasaAnterior.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaAnterior(BigDecimal value) {
        this.tasaAnterior = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaReajustable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTasaReajustable() {
        return tasaReajustable;
    }

    /**
     * Define el valor de la propiedad tasaReajustable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTasaReajustable(Boolean value) {
        this.tasaReajustable = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCaptacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCaptacion() {
        return tipoCaptacion;
    }

    /**
     * Define el valor de la propiedad tipoCaptacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCaptacion(JAXBElement<String> value) {
        this.tipoCaptacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoPagoInteres.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoPagoInteres() {
        return tipoPagoInteres;
    }

    /**
     * Define el valor de la propiedad tipoPagoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoPagoInteres(JAXBElement<String> value) {
        this.tipoPagoInteres = value;
    }

}
