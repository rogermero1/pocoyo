
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosSaldos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosSaldos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChequesAnulados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChequesPendientes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ChequesSinFondos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CreditosAlMes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CreditosHoy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DebitosAlMes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DebitosHoy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FechaRetencion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoBloqueado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoRetenido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedio6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePromedioSemestral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizarHoy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorEfectivizarRemesas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio4" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio5" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Promedio6" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PromedioActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PromedioSemestral" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoAGirar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoPromedioDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TransaccionesMes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosSaldos", propOrder = {
    "chequesAnulados",
    "chequesPendientes",
    "chequesSinFondos",
    "creditosAlMes",
    "creditosHoy",
    "debitosAlMes",
    "debitosHoy",
    "fechaRetencion",
    "montoBloqueado",
    "montoRetenido",
    "nombrePromedio1",
    "nombrePromedio2",
    "nombrePromedio3",
    "nombrePromedio4",
    "nombrePromedio5",
    "nombrePromedio6",
    "nombrePromedioSemestral",
    "porEfectivizar",
    "porEfectivizarHoy",
    "porEfectivizarRemesas",
    "promedio1",
    "promedio2",
    "promedio3",
    "promedio4",
    "promedio5",
    "promedio6",
    "promedioActual",
    "promedioSemestral",
    "saldoAGirar",
    "saldoContable",
    "saldoDisponible",
    "saldoPromedioDisponible",
    "transaccionesMes"
})
public class DatosSaldos {

    @XmlElement(name = "ChequesAnulados")
    protected Integer chequesAnulados;
    @XmlElement(name = "ChequesPendientes")
    protected Integer chequesPendientes;
    @XmlElement(name = "ChequesSinFondos")
    protected Integer chequesSinFondos;
    @XmlElement(name = "CreditosAlMes")
    protected BigDecimal creditosAlMes;
    @XmlElement(name = "CreditosHoy")
    protected BigDecimal creditosHoy;
    @XmlElement(name = "DebitosAlMes")
    protected BigDecimal debitosAlMes;
    @XmlElement(name = "DebitosHoy")
    protected BigDecimal debitosHoy;
    @XmlElementRef(name = "FechaRetencion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaRetencion;
    @XmlElement(name = "MontoBloqueado")
    protected BigDecimal montoBloqueado;
    @XmlElement(name = "MontoRetenido")
    protected BigDecimal montoRetenido;
    @XmlElementRef(name = "NombrePromedio1", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio1;
    @XmlElementRef(name = "NombrePromedio2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio2;
    @XmlElementRef(name = "NombrePromedio3", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio3;
    @XmlElementRef(name = "NombrePromedio4", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio4;
    @XmlElementRef(name = "NombrePromedio5", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio5;
    @XmlElementRef(name = "NombrePromedio6", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedio6;
    @XmlElementRef(name = "NombrePromedioSemestral", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePromedioSemestral;
    @XmlElement(name = "PorEfectivizar")
    protected BigDecimal porEfectivizar;
    @XmlElement(name = "PorEfectivizarHoy")
    protected BigDecimal porEfectivizarHoy;
    @XmlElement(name = "PorEfectivizarRemesas")
    protected BigDecimal porEfectivizarRemesas;
    @XmlElement(name = "Promedio1")
    protected BigDecimal promedio1;
    @XmlElement(name = "Promedio2")
    protected BigDecimal promedio2;
    @XmlElement(name = "Promedio3")
    protected BigDecimal promedio3;
    @XmlElement(name = "Promedio4")
    protected BigDecimal promedio4;
    @XmlElement(name = "Promedio5")
    protected BigDecimal promedio5;
    @XmlElement(name = "Promedio6")
    protected BigDecimal promedio6;
    @XmlElement(name = "PromedioActual")
    protected BigDecimal promedioActual;
    @XmlElement(name = "PromedioSemestral")
    protected BigDecimal promedioSemestral;
    @XmlElement(name = "SaldoAGirar")
    protected BigDecimal saldoAGirar;
    @XmlElement(name = "SaldoContable")
    protected BigDecimal saldoContable;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElement(name = "SaldoPromedioDisponible")
    protected BigDecimal saldoPromedioDisponible;
    @XmlElement(name = "TransaccionesMes")
    protected Integer transaccionesMes;

    /**
     * Obtiene el valor de la propiedad chequesAnulados.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequesAnulados() {
        return chequesAnulados;
    }

    /**
     * Define el valor de la propiedad chequesAnulados.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequesAnulados(Integer value) {
        this.chequesAnulados = value;
    }

    /**
     * Obtiene el valor de la propiedad chequesPendientes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequesPendientes() {
        return chequesPendientes;
    }

    /**
     * Define el valor de la propiedad chequesPendientes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequesPendientes(Integer value) {
        this.chequesPendientes = value;
    }

    /**
     * Obtiene el valor de la propiedad chequesSinFondos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChequesSinFondos() {
        return chequesSinFondos;
    }

    /**
     * Define el valor de la propiedad chequesSinFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChequesSinFondos(Integer value) {
        this.chequesSinFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad creditosAlMes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditosAlMes() {
        return creditosAlMes;
    }

    /**
     * Define el valor de la propiedad creditosAlMes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditosAlMes(BigDecimal value) {
        this.creditosAlMes = value;
    }

    /**
     * Obtiene el valor de la propiedad creditosHoy.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditosHoy() {
        return creditosHoy;
    }

    /**
     * Define el valor de la propiedad creditosHoy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditosHoy(BigDecimal value) {
        this.creditosHoy = value;
    }

    /**
     * Obtiene el valor de la propiedad debitosAlMes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitosAlMes() {
        return debitosAlMes;
    }

    /**
     * Define el valor de la propiedad debitosAlMes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitosAlMes(BigDecimal value) {
        this.debitosAlMes = value;
    }

    /**
     * Obtiene el valor de la propiedad debitosHoy.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDebitosHoy() {
        return debitosHoy;
    }

    /**
     * Define el valor de la propiedad debitosHoy.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDebitosHoy(BigDecimal value) {
        this.debitosHoy = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRetencion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaRetencion() {
        return fechaRetencion;
    }

    /**
     * Define el valor de la propiedad fechaRetencion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaRetencion(JAXBElement<String> value) {
        this.fechaRetencion = value;
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
     * Obtiene el valor de la propiedad nombrePromedio1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio1() {
        return nombrePromedio1;
    }

    /**
     * Define el valor de la propiedad nombrePromedio1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio1(JAXBElement<String> value) {
        this.nombrePromedio1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedio2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio2() {
        return nombrePromedio2;
    }

    /**
     * Define el valor de la propiedad nombrePromedio2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio2(JAXBElement<String> value) {
        this.nombrePromedio2 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedio3.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio3() {
        return nombrePromedio3;
    }

    /**
     * Define el valor de la propiedad nombrePromedio3.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio3(JAXBElement<String> value) {
        this.nombrePromedio3 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedio4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio4() {
        return nombrePromedio4;
    }

    /**
     * Define el valor de la propiedad nombrePromedio4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio4(JAXBElement<String> value) {
        this.nombrePromedio4 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedio5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio5() {
        return nombrePromedio5;
    }

    /**
     * Define el valor de la propiedad nombrePromedio5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio5(JAXBElement<String> value) {
        this.nombrePromedio5 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedio6.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedio6() {
        return nombrePromedio6;
    }

    /**
     * Define el valor de la propiedad nombrePromedio6.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedio6(JAXBElement<String> value) {
        this.nombrePromedio6 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePromedioSemestral.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePromedioSemestral() {
        return nombrePromedioSemestral;
    }

    /**
     * Define el valor de la propiedad nombrePromedioSemestral.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePromedioSemestral(JAXBElement<String> value) {
        this.nombrePromedioSemestral = value;
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
     * Obtiene el valor de la propiedad porEfectivizarRemesas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorEfectivizarRemesas() {
        return porEfectivizarRemesas;
    }

    /**
     * Define el valor de la propiedad porEfectivizarRemesas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorEfectivizarRemesas(BigDecimal value) {
        this.porEfectivizarRemesas = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio1.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio1() {
        return promedio1;
    }

    /**
     * Define el valor de la propiedad promedio1.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio1(BigDecimal value) {
        this.promedio1 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio2.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio2() {
        return promedio2;
    }

    /**
     * Define el valor de la propiedad promedio2.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio2(BigDecimal value) {
        this.promedio2 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio3.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio3() {
        return promedio3;
    }

    /**
     * Define el valor de la propiedad promedio3.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio3(BigDecimal value) {
        this.promedio3 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio4.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio4() {
        return promedio4;
    }

    /**
     * Define el valor de la propiedad promedio4.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio4(BigDecimal value) {
        this.promedio4 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio5.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio5() {
        return promedio5;
    }

    /**
     * Define el valor de la propiedad promedio5.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio5(BigDecimal value) {
        this.promedio5 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedio6.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedio6() {
        return promedio6;
    }

    /**
     * Define el valor de la propiedad promedio6.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio6(BigDecimal value) {
        this.promedio6 = value;
    }

    /**
     * Obtiene el valor de la propiedad promedioActual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedioActual() {
        return promedioActual;
    }

    /**
     * Define el valor de la propiedad promedioActual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedioActual(BigDecimal value) {
        this.promedioActual = value;
    }

    /**
     * Obtiene el valor de la propiedad promedioSemestral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPromedioSemestral() {
        return promedioSemestral;
    }

    /**
     * Define el valor de la propiedad promedioSemestral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedioSemestral(BigDecimal value) {
        this.promedioSemestral = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoAGirar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoAGirar() {
        return saldoAGirar;
    }

    /**
     * Define el valor de la propiedad saldoAGirar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoAGirar(BigDecimal value) {
        this.saldoAGirar = value;
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
     * Obtiene el valor de la propiedad saldoPromedioDisponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoPromedioDisponible() {
        return saldoPromedioDisponible;
    }

    /**
     * Define el valor de la propiedad saldoPromedioDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoPromedioDisponible(BigDecimal value) {
        this.saldoPromedioDisponible = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionesMes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransaccionesMes() {
        return transaccionesMes;
    }

    /**
     * Define el valor de la propiedad transaccionesMes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransaccionesMes(Integer value) {
        this.transaccionesMes = value;
    }

}
