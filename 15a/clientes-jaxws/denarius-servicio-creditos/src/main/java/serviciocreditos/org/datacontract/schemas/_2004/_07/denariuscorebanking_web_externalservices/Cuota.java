
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
 * <p>Clase Java para Cuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cuota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapitalPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCuota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InteresPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rubros" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfDetalleCuota" minOccurs="0"/&gt;
 *         &lt;element name="SaldoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SeguroPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SeguroProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cuota", propOrder = {
    "capitalPagado",
    "capitalProyectado",
    "codEstado",
    "estado",
    "fechaInicio",
    "fechaVencimiento",
    "idCliente",
    "idCuota",
    "idOperacion",
    "interesPagado",
    "interesProyectado",
    "moraPagado",
    "moraProyectado",
    "numeroCuota",
    "numeroOperacion",
    "otrosPagado",
    "otrosProyectado",
    "rubros",
    "saldoCapital",
    "seguroPagado",
    "seguroProyectado",
    "totalProyectado",
    "valor"
})
public class Cuota {

    @XmlElement(name = "CapitalPagado")
    protected BigDecimal capitalPagado;
    @XmlElement(name = "CapitalProyectado")
    protected BigDecimal capitalProyectado;
    @XmlElement(name = "CodEstado")
    protected Integer codEstado;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElement(name = "FechaInicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicio;
    @XmlElement(name = "FechaVencimiento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimiento;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElement(name = "IdCuota")
    protected Integer idCuota;
    @XmlElement(name = "IdOperacion")
    protected Integer idOperacion;
    @XmlElement(name = "InteresPagado")
    protected BigDecimal interesPagado;
    @XmlElement(name = "InteresProyectado")
    protected BigDecimal interesProyectado;
    @XmlElement(name = "MoraPagado")
    protected BigDecimal moraPagado;
    @XmlElement(name = "MoraProyectado")
    protected BigDecimal moraProyectado;
    @XmlElement(name = "NumeroCuota")
    protected Integer numeroCuota;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElement(name = "OtrosPagado")
    protected BigDecimal otrosPagado;
    @XmlElement(name = "OtrosProyectado")
    protected BigDecimal otrosProyectado;
    @XmlElementRef(name = "Rubros", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleCuota> rubros;
    @XmlElement(name = "SaldoCapital")
    protected BigDecimal saldoCapital;
    @XmlElement(name = "SeguroPagado")
    protected BigDecimal seguroPagado;
    @XmlElement(name = "SeguroProyectado")
    protected BigDecimal seguroProyectado;
    @XmlElement(name = "TotalProyectado")
    protected BigDecimal totalProyectado;
    @XmlElement(name = "Valor")
    protected BigDecimal valor;

    /**
     * Obtiene el valor de la propiedad capitalPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalPagado() {
        return capitalPagado;
    }

    /**
     * Define el valor de la propiedad capitalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalPagado(BigDecimal value) {
        this.capitalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalProyectado() {
        return capitalProyectado;
    }

    /**
     * Define el valor de la propiedad capitalProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalProyectado(BigDecimal value) {
        this.capitalProyectado = value;
    }

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
     * Obtiene el valor de la propiedad idCuota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCuota() {
        return idCuota;
    }

    /**
     * Define el valor de la propiedad idCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCuota(Integer value) {
        this.idCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperacion() {
        return idOperacion;
    }

    /**
     * Define el valor de la propiedad idOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperacion(Integer value) {
        this.idOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad interesPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresPagado() {
        return interesPagado;
    }

    /**
     * Define el valor de la propiedad interesPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresPagado(BigDecimal value) {
        this.interesPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad interesProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresProyectado() {
        return interesProyectado;
    }

    /**
     * Define el valor de la propiedad interesProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresProyectado(BigDecimal value) {
        this.interesProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraPagado() {
        return moraPagado;
    }

    /**
     * Define el valor de la propiedad moraPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraPagado(BigDecimal value) {
        this.moraPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraProyectado() {
        return moraProyectado;
    }

    /**
     * Define el valor de la propiedad moraProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraProyectado(BigDecimal value) {
        this.moraProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuota.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * Define el valor de la propiedad numeroCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCuota(Integer value) {
        this.numeroCuota = value;
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
     * Obtiene el valor de la propiedad otrosPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosPagado() {
        return otrosPagado;
    }

    /**
     * Define el valor de la propiedad otrosPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosPagado(BigDecimal value) {
        this.otrosPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosProyectado() {
        return otrosProyectado;
    }

    /**
     * Define el valor de la propiedad otrosProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosProyectado(BigDecimal value) {
        this.otrosProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad rubros.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleCuota> getRubros() {
        return rubros;
    }

    /**
     * Define el valor de la propiedad rubros.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     *     
     */
    public void setRubros(JAXBElement<ArrayOfDetalleCuota> value) {
        this.rubros = value;
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
     * Obtiene el valor de la propiedad seguroPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroPagado() {
        return seguroPagado;
    }

    /**
     * Define el valor de la propiedad seguroPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroPagado(BigDecimal value) {
        this.seguroPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad seguroProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroProyectado() {
        return seguroProyectado;
    }

    /**
     * Define el valor de la propiedad seguroProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroProyectado(BigDecimal value) {
        this.seguroProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad totalProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalProyectado() {
        return totalProyectado;
    }

    /**
     * Define el valor de la propiedad totalProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalProyectado(BigDecimal value) {
        this.totalProyectado = value;
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

}
