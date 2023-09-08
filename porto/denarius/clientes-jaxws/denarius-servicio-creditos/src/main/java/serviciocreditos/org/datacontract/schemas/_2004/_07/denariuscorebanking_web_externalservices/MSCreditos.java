
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

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSCreditos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSCreditos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="CargaFinanciera" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Clientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfClienteTramite" minOccurs="0"/&gt;
 *         &lt;element name="CuotasPendientes" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfCuota" minOccurs="0"/&gt;
 *         &lt;element name="FechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdSolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InteresAnticipado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Operaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfOperacionCartera" minOccurs="0"/&gt;
 *         &lt;element name="PagosOperaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfPago" minOccurs="0"/&gt;
 *         &lt;element name="PlazoExtendido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RubrosDesembolso" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfRubro" minOccurs="0"/&gt;
 *         &lt;element name="SaldosOperaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfSaldosOperacion" minOccurs="0"/&gt;
 *         &lt;element name="TablaAmortizacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfCuota" minOccurs="0"/&gt;
 *         &lt;element name="TasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaReferencial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaSede" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalCuotas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalSede" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorDescuentoTasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorIntereses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorPrimeraCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTotalCuotas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSCreditos", propOrder = {
    "archivo",
    "cargaFinanciera",
    "clientes",
    "cuotasPendientes",
    "fechaExpiracion",
    "fechaInicio",
    "fechaVencimiento",
    "idSolicitud",
    "interesAnticipado",
    "numeroCuenta",
    "numeroOperacion",
    "operaciones",
    "pagosOperaciones",
    "plazoExtendido",
    "rubrosDesembolso",
    "saldosOperaciones",
    "tablaAmortizacion",
    "tasaEfectiva",
    "tasaInteres",
    "tasaReferencial",
    "tasaSede",
    "totalCuotas",
    "totalSede",
    "totalVencido",
    "valorCredito",
    "valorDescuentoTasa",
    "valorIntereses",
    "valorPrimeraCuota",
    "valorTotalCuotas",
    "valorVigente"
})
public class MSCreditos
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Archivo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> archivo;
    @XmlElement(name = "CargaFinanciera")
    protected BigDecimal cargaFinanciera;
    @XmlElementRef(name = "Clientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClienteTramite> clientes;
    @XmlElementRef(name = "CuotasPendientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCuota> cuotasPendientes;
    @XmlElement(name = "FechaExpiracion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExpiracion;
    @XmlElement(name = "FechaInicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(name = "FechaVencimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(name = "IdSolicitud")
    protected Integer idSolicitud;
    @XmlElement(name = "InteresAnticipado")
    protected BigDecimal interesAnticipado;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElementRef(name = "Operaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOperacionCartera> operaciones;
    @XmlElementRef(name = "PagosOperaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPago> pagosOperaciones;
    @XmlElement(name = "PlazoExtendido")
    protected Integer plazoExtendido;
    @XmlElementRef(name = "RubrosDesembolso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRubro> rubrosDesembolso;
    @XmlElementRef(name = "SaldosOperaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaldosOperacion> saldosOperaciones;
    @XmlElementRef(name = "TablaAmortizacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCuota> tablaAmortizacion;
    @XmlElement(name = "TasaEfectiva")
    protected BigDecimal tasaEfectiva;
    @XmlElement(name = "TasaInteres")
    protected BigDecimal tasaInteres;
    @XmlElement(name = "TasaReferencial")
    protected BigDecimal tasaReferencial;
    @XmlElement(name = "TasaSede")
    protected BigDecimal tasaSede;
    @XmlElement(name = "TotalCuotas")
    protected BigDecimal totalCuotas;
    @XmlElement(name = "TotalSede")
    protected BigDecimal totalSede;
    @XmlElement(name = "TotalVencido")
    protected BigDecimal totalVencido;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name = "ValorDescuentoTasa")
    protected BigDecimal valorDescuentoTasa;
    @XmlElement(name = "ValorIntereses")
    protected BigDecimal valorIntereses;
    @XmlElement(name = "ValorPrimeraCuota")
    protected BigDecimal valorPrimeraCuota;
    @XmlElement(name = "ValorTotalCuotas")
    protected BigDecimal valorTotalCuotas;
    @XmlElement(name = "ValorVigente")
    protected BigDecimal valorVigente;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setArchivo(JAXBElement<byte[]> value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad cargaFinanciera.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCargaFinanciera() {
        return cargaFinanciera;
    }

    /**
     * Define el valor de la propiedad cargaFinanciera.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCargaFinanciera(BigDecimal value) {
        this.cargaFinanciera = value;
    }

    /**
     * Obtiene el valor de la propiedad clientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClienteTramite> getClientes() {
        return clientes;
    }

    /**
     * Define el valor de la propiedad clientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     *     
     */
    public void setClientes(JAXBElement<ArrayOfClienteTramite> value) {
        this.clientes = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotasPendientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCuota> getCuotasPendientes() {
        return cuotasPendientes;
    }

    /**
     * Define el valor de la propiedad cuotasPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public void setCuotasPendientes(JAXBElement<ArrayOfCuota> value) {
        this.cuotasPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpiracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Define el valor de la propiedad fechaExpiracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpiracion(XMLGregorianCalendar value) {
        this.fechaExpiracion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicio(XMLGregorianCalendar value) {
        this.fechaInicio = value;
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
     * Obtiene el valor de la propiedad idSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Define el valor de la propiedad idSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitud(Integer value) {
        this.idSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad interesAnticipado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresAnticipado() {
        return interesAnticipado;
    }

    /**
     * Define el valor de la propiedad interesAnticipado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresAnticipado(BigDecimal value) {
        this.interesAnticipado = value;
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
     * Obtiene el valor de la propiedad operaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOperacionCartera> getOperaciones() {
        return operaciones;
    }

    /**
     * Define el valor de la propiedad operaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     *     
     */
    public void setOperaciones(JAXBElement<ArrayOfOperacionCartera> value) {
        this.operaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad pagosOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPago> getPagosOperaciones() {
        return pagosOperaciones;
    }

    /**
     * Define el valor de la propiedad pagosOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     *     
     */
    public void setPagosOperaciones(JAXBElement<ArrayOfPago> value) {
        this.pagosOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoExtendido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazoExtendido() {
        return plazoExtendido;
    }

    /**
     * Define el valor de la propiedad plazoExtendido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazoExtendido(Integer value) {
        this.plazoExtendido = value;
    }

    /**
     * Obtiene el valor de la propiedad rubrosDesembolso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRubro> getRubrosDesembolso() {
        return rubrosDesembolso;
    }

    /**
     * Define el valor de la propiedad rubrosDesembolso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     *     
     */
    public void setRubrosDesembolso(JAXBElement<ArrayOfRubro> value) {
        this.rubrosDesembolso = value;
    }

    /**
     * Obtiene el valor de la propiedad saldosOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaldosOperacion> getSaldosOperaciones() {
        return saldosOperaciones;
    }

    /**
     * Define el valor de la propiedad saldosOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     *     
     */
    public void setSaldosOperaciones(JAXBElement<ArrayOfSaldosOperacion> value) {
        this.saldosOperaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tablaAmortizacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCuota> getTablaAmortizacion() {
        return tablaAmortizacion;
    }

    /**
     * Define el valor de la propiedad tablaAmortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public void setTablaAmortizacion(JAXBElement<ArrayOfCuota> value) {
        this.tablaAmortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaEfectiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaEfectiva() {
        return tasaEfectiva;
    }

    /**
     * Define el valor de la propiedad tasaEfectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaEfectiva(BigDecimal value) {
        this.tasaEfectiva = value;
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
     * Obtiene el valor de la propiedad tasaReferencial.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaReferencial() {
        return tasaReferencial;
    }

    /**
     * Define el valor de la propiedad tasaReferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaReferencial(BigDecimal value) {
        this.tasaReferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaSede.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaSede() {
        return tasaSede;
    }

    /**
     * Define el valor de la propiedad tasaSede.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaSede(BigDecimal value) {
        this.tasaSede = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCuotas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCuotas() {
        return totalCuotas;
    }

    /**
     * Define el valor de la propiedad totalCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCuotas(BigDecimal value) {
        this.totalCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad totalSede.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalSede() {
        return totalSede;
    }

    /**
     * Define el valor de la propiedad totalSede.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalSede(BigDecimal value) {
        this.totalSede = value;
    }

    /**
     * Obtiene el valor de la propiedad totalVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalVencido() {
        return totalVencido;
    }

    /**
     * Define el valor de la propiedad totalVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalVencido(BigDecimal value) {
        this.totalVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    /**
     * Define el valor de la propiedad valorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCredito(BigDecimal value) {
        this.valorCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad valorDescuentoTasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDescuentoTasa() {
        return valorDescuentoTasa;
    }

    /**
     * Define el valor de la propiedad valorDescuentoTasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDescuentoTasa(BigDecimal value) {
        this.valorDescuentoTasa = value;
    }

    /**
     * Obtiene el valor de la propiedad valorIntereses.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorIntereses() {
        return valorIntereses;
    }

    /**
     * Define el valor de la propiedad valorIntereses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorIntereses(BigDecimal value) {
        this.valorIntereses = value;
    }

    /**
     * Obtiene el valor de la propiedad valorPrimeraCuota.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorPrimeraCuota() {
        return valorPrimeraCuota;
    }

    /**
     * Define el valor de la propiedad valorPrimeraCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorPrimeraCuota(BigDecimal value) {
        this.valorPrimeraCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotalCuotas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalCuotas() {
        return valorTotalCuotas;
    }

    /**
     * Define el valor de la propiedad valorTotalCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalCuotas(BigDecimal value) {
        this.valorTotalCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad valorVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorVigente() {
        return valorVigente;
    }

    /**
     * Define el valor de la propiedad valorVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorVigente(BigDecimal value) {
        this.valorVigente = value;
    }

}
