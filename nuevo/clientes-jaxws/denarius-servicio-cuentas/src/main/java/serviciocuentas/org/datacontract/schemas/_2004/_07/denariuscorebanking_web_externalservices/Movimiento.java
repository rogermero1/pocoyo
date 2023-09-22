
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
 * <p>Clase Java para Movimiento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Movimiento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Causal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comprobante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitoCredito" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Efectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="HoraRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdMovimiento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdMovimientoBig" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="IdOficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NombreCausal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OficinaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reversada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Reverso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SufijoCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tipo" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movimiento", propOrder = {
    "causal",
    "comprobante",
    "debitoCredito",
    "efectivo",
    "fechaProceso",
    "fechaRegistro",
    "fechaTransaccion",
    "horaRegistro",
    "idMovimiento",
    "idMovimientoBig",
    "idOficinaOrigen",
    "idTransaccion",
    "nombreCausal",
    "nombreOficina",
    "nombreTransaccion",
    "oficinaOrigen",
    "porEfectivizar",
    "referencia",
    "referencia2",
    "reversada",
    "reverso",
    "saldoContable",
    "saldoDisponible",
    "sucursal",
    "sufijoCuenta",
    "tipo",
    "total",
    "transaccion",
    "usuario"
})
public class Movimiento {

    @XmlElementRef(name = "Causal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> causal;
    @XmlElementRef(name = "Comprobante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comprobante;
    @XmlElement(name = "DebitoCredito")
    protected Integer debitoCredito;
    @XmlElement(name = "Efectivo")
    protected BigDecimal efectivo;
    @XmlElementRef(name = "FechaProceso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaProceso;
    @XmlElementRef(name = "FechaRegistro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaRegistro;
    @XmlElement(name = "FechaTransaccion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransaccion;
    @XmlElementRef(name = "HoraRegistro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> horaRegistro;
    @XmlElement(name = "IdMovimiento")
    protected Integer idMovimiento;
    @XmlElement(name = "IdMovimientoBig")
    protected Long idMovimientoBig;
    @XmlElement(name = "IdOficinaOrigen")
    protected Integer idOficinaOrigen;
    @XmlElement(name = "IdTransaccion")
    protected Integer idTransaccion;
    @XmlElementRef(name = "NombreCausal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCausal;
    @XmlElementRef(name = "NombreOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOficina;
    @XmlElementRef(name = "NombreTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreTransaccion;
    @XmlElementRef(name = "OficinaOrigen", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficinaOrigen;
    @XmlElement(name = "PorEfectivizar")
    protected BigDecimal porEfectivizar;
    @XmlElementRef(name = "Referencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "Referencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia2;
    @XmlElementRef(name = "Reversada", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reversada;
    @XmlElementRef(name = "Reverso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reverso;
    @XmlElement(name = "SaldoContable")
    protected BigDecimal saldoContable;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElementRef(name = "Sucursal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sucursal;
    @XmlElementRef(name = "SufijoCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sufijoCuenta;
    @XmlElement(name = "Tipo")
    protected Integer tipo;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElementRef(name = "Transaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transaccion;
    @XmlElementRef(name = "Usuario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuario;

    /**
     * Obtiene el valor de la propiedad causal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCausal() {
        return causal;
    }

    /**
     * Define el valor de la propiedad causal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCausal(JAXBElement<String> value) {
        this.causal = value;
    }

    /**
     * Obtiene el valor de la propiedad comprobante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComprobante() {
        return comprobante;
    }

    /**
     * Define el valor de la propiedad comprobante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComprobante(JAXBElement<String> value) {
        this.comprobante = value;
    }

    /**
     * Obtiene el valor de la propiedad debitoCredito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDebitoCredito() {
        return debitoCredito;
    }

    /**
     * Define el valor de la propiedad debitoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDebitoCredito(Integer value) {
        this.debitoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad efectivo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEfectivo() {
        return efectivo;
    }

    /**
     * Define el valor de la propiedad efectivo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEfectivo(BigDecimal value) {
        this.efectivo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProceso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Define el valor de la propiedad fechaProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaProceso(JAXBElement<String> value) {
        this.fechaProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaRegistro(JAXBElement<String> value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Define el valor de la propiedad fechaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransaccion(XMLGregorianCalendar value) {
        this.fechaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad horaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoraRegistro() {
        return horaRegistro;
    }

    /**
     * Define el valor de la propiedad horaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoraRegistro(JAXBElement<String> value) {
        this.horaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad idMovimiento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    /**
     * Define el valor de la propiedad idMovimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMovimiento(Integer value) {
        this.idMovimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad idMovimientoBig.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdMovimientoBig() {
        return idMovimientoBig;
    }

    /**
     * Define el valor de la propiedad idMovimientoBig.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdMovimientoBig(Long value) {
        this.idMovimientoBig = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOficinaOrigen() {
        return idOficinaOrigen;
    }

    /**
     * Define el valor de la propiedad idOficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOficinaOrigen(Integer value) {
        this.idOficinaOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTransaccion(Integer value) {
        this.idTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCausal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCausal() {
        return nombreCausal;
    }

    /**
     * Define el valor de la propiedad nombreCausal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCausal(JAXBElement<String> value) {
        this.nombreCausal = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreOficina() {
        return nombreOficina;
    }

    /**
     * Define el valor de la propiedad nombreOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreOficina(JAXBElement<String> value) {
        this.nombreOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreTransaccion() {
        return nombreTransaccion;
    }

    /**
     * Define el valor de la propiedad nombreTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreTransaccion(JAXBElement<String> value) {
        this.nombreTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad oficinaOrigen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficinaOrigen() {
        return oficinaOrigen;
    }

    /**
     * Define el valor de la propiedad oficinaOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficinaOrigen(JAXBElement<String> value) {
        this.oficinaOrigen = value;
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
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia(JAXBElement<String> value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia2() {
        return referencia2;
    }

    /**
     * Define el valor de la propiedad referencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia2(JAXBElement<String> value) {
        this.referencia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad reversada.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReversada() {
        return reversada;
    }

    /**
     * Define el valor de la propiedad reversada.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReversada(JAXBElement<String> value) {
        this.reversada = value;
    }

    /**
     * Obtiene el valor de la propiedad reverso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReverso() {
        return reverso;
    }

    /**
     * Define el valor de la propiedad reverso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReverso(JAXBElement<String> value) {
        this.reverso = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoContable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoContable() {
        return saldoContable;
    }

    /**
     * Define el valor de la propiedad saldoContable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoContable(BigDecimal value) {
        this.saldoContable = value;
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
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSucursal(JAXBElement<String> value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad sufijoCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSufijoCuenta() {
        return sufijoCuenta;
    }

    /**
     * Define el valor de la propiedad sufijoCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSufijoCuenta(JAXBElement<String> value) {
        this.sufijoCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipo(Integer value) {
        this.tipo = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransaccion(JAXBElement<String> value) {
        this.transaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

}
