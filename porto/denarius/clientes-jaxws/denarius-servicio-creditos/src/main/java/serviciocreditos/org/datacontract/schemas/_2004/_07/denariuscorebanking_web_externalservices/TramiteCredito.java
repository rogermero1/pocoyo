
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
 * <p>Clase Java para TramiteCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TramiteCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOficial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuotasPagadas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DiaPago" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="DiasMora" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DiasXDividendo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EnRenovacion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaConc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaPago" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVenc" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimientoDividendo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Interes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresXMora" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoEncaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreDeudor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreOficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDividendo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="OperacionBanco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SaldoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoOperacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "TramiteCredito", propOrder = {
    "codEstado",
    "codigoCliente",
    "codigoOficial",
    "codigoProducto",
    "codigoTipoCredito",
    "cuotasPagadas",
    "diaPago",
    "diasMora",
    "diasXDividendo",
    "enRenovacion",
    "estado",
    "estadoOperacion",
    "fechaConc",
    "fechaPago",
    "fechaVenc",
    "fechaVencimientoDividendo",
    "idMoneda",
    "interes",
    "interesXMora",
    "monto",
    "montoEncaje",
    "montoVencido",
    "nombreDeudor",
    "nombreOficial",
    "numeroDividendo",
    "numeroOperacion",
    "operacionBanco",
    "plazo",
    "saldoCapital",
    "saldoOperacion",
    "tasaEfectiva",
    "tasaInteres",
    "tipo",
    "valor",
    "valorCuota"
})
public class TramiteCredito {

    @XmlElement(name = "CodEstado")
    protected Integer codEstado;
    @XmlElement(name = "CodigoCliente")
    protected Integer codigoCliente;
    @XmlElement(name = "CodigoOficial")
    protected Integer codigoOficial;
    @XmlElementRef(name = "CodigoProducto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProducto;
    @XmlElementRef(name = "CodigoTipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoCredito;
    @XmlElement(name = "CuotasPagadas")
    protected Integer cuotasPagadas;
    @XmlElement(name = "DiaPago")
    @XmlSchemaType(name = "unsignedByte")
    protected Short diaPago;
    @XmlElement(name = "DiasMora")
    protected Integer diasMora;
    @XmlElement(name = "DiasXDividendo")
    protected Integer diasXDividendo;
    @XmlElement(name = "EnRenovacion")
    protected Boolean enRenovacion;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "EstadoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoOperacion;
    @XmlElement(name = "FechaConc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConc;
    @XmlElement(name = "FechaPago")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPago;
    @XmlElement(name = "FechaVenc")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVenc;
    @XmlElement(name = "FechaVencimientoDividendo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoDividendo;
    @XmlElement(name = "IdMoneda")
    protected Integer idMoneda;
    @XmlElement(name = "Interes")
    protected BigDecimal interes;
    @XmlElement(name = "InteresXMora")
    protected BigDecimal interesXMora;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElement(name = "MontoEncaje")
    protected BigDecimal montoEncaje;
    @XmlElement(name = "MontoVencido")
    protected BigDecimal montoVencido;
    @XmlElementRef(name = "NombreDeudor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreDeudor;
    @XmlElementRef(name = "NombreOficial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOficial;
    @XmlElement(name = "NumeroDividendo")
    protected Integer numeroDividendo;
    @XmlElement(name = "NumeroOperacion")
    protected Integer numeroOperacion;
    @XmlElementRef(name = "OperacionBanco", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operacionBanco;
    @XmlElement(name = "Plazo")
    protected Integer plazo;
    @XmlElement(name = "SaldoCapital")
    protected BigDecimal saldoCapital;
    @XmlElement(name = "SaldoOperacion")
    protected BigDecimal saldoOperacion;
    @XmlElement(name = "TasaEfectiva")
    protected BigDecimal tasaEfectiva;
    @XmlElement(name = "TasaInteres")
    protected BigDecimal tasaInteres;
    @XmlElementRef(name = "Tipo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipo;
    @XmlElement(name = "Valor")
    protected BigDecimal valor;
    @XmlElement(name = "ValorCuota")
    protected BigDecimal valorCuota;

    /**
     * Obtiene el valor de la propiedad codEstado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEstado() {
        return codEstado;
    }

    /**
     * Define el valor de la propiedad codEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEstado(Integer value) {
        this.codEstado = value;
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
     * Obtiene el valor de la propiedad codigoOficial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoOficial() {
        return codigoOficial;
    }

    /**
     * Define el valor de la propiedad codigoOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoOficial(Integer value) {
        this.codigoOficial = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProducto(JAXBElement<String> value) {
        this.codigoProducto = value;
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
     * Obtiene el valor de la propiedad cuotasPagadas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCuotasPagadas() {
        return cuotasPagadas;
    }

    /**
     * Define el valor de la propiedad cuotasPagadas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCuotasPagadas(Integer value) {
        this.cuotasPagadas = value;
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
     * Obtiene el valor de la propiedad diasMora.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasMora() {
        return diasMora;
    }

    /**
     * Define el valor de la propiedad diasMora.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasMora(Integer value) {
        this.diasMora = value;
    }

    /**
     * Obtiene el valor de la propiedad diasXDividendo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiasXDividendo() {
        return diasXDividendo;
    }

    /**
     * Define el valor de la propiedad diasXDividendo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiasXDividendo(Integer value) {
        this.diasXDividendo = value;
    }

    /**
     * Obtiene el valor de la propiedad enRenovacion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnRenovacion() {
        return enRenovacion;
    }

    /**
     * Define el valor de la propiedad enRenovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnRenovacion(Boolean value) {
        this.enRenovacion = value;
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
     * Obtiene el valor de la propiedad estadoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoOperacion() {
        return estadoOperacion;
    }

    /**
     * Define el valor de la propiedad estadoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoOperacion(JAXBElement<String> value) {
        this.estadoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaConc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaConc() {
        return fechaConc;
    }

    /**
     * Define el valor de la propiedad fechaConc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaConc(XMLGregorianCalendar value) {
        this.fechaConc = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVenc.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVenc() {
        return fechaVenc;
    }

    /**
     * Define el valor de la propiedad fechaVenc.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVenc(XMLGregorianCalendar value) {
        this.fechaVenc = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoDividendo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoDividendo() {
        return fechaVencimientoDividendo;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoDividendo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoDividendo(XMLGregorianCalendar value) {
        this.fechaVencimientoDividendo = value;
    }

    /**
     * Obtiene el valor de la propiedad idMoneda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMoneda() {
        return idMoneda;
    }

    /**
     * Define el valor de la propiedad idMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMoneda(Integer value) {
        this.idMoneda = value;
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
     * Obtiene el valor de la propiedad interesXMora.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresXMora() {
        return interesXMora;
    }

    /**
     * Define el valor de la propiedad interesXMora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresXMora(BigDecimal value) {
        this.interesXMora = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad montoEncaje.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoEncaje() {
        return montoEncaje;
    }

    /**
     * Define el valor de la propiedad montoEncaje.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoEncaje(BigDecimal value) {
        this.montoEncaje = value;
    }

    /**
     * Obtiene el valor de la propiedad montoVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoVencido() {
        return montoVencido;
    }

    /**
     * Define el valor de la propiedad montoVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoVencido(BigDecimal value) {
        this.montoVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreDeudor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreDeudor() {
        return nombreDeudor;
    }

    /**
     * Define el valor de la propiedad nombreDeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreDeudor(JAXBElement<String> value) {
        this.nombreDeudor = value;
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
     * Obtiene el valor de la propiedad numeroDividendo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroDividendo() {
        return numeroDividendo;
    }

    /**
     * Define el valor de la propiedad numeroDividendo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroDividendo(Integer value) {
        this.numeroDividendo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Define el valor de la propiedad numeroOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroOperacion(Integer value) {
        this.numeroOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad operacionBanco.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperacionBanco() {
        return operacionBanco;
    }

    /**
     * Define el valor de la propiedad operacionBanco.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperacionBanco(JAXBElement<String> value) {
        this.operacionBanco = value;
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
     * Obtiene el valor de la propiedad saldoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoOperacion() {
        return saldoOperacion;
    }

    /**
     * Define el valor de la propiedad saldoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoOperacion(BigDecimal value) {
        this.saldoOperacion = value;
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
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipo(JAXBElement<String> value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
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
