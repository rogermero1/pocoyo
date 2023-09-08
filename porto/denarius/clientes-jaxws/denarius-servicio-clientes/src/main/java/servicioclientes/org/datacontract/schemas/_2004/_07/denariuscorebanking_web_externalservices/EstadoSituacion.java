
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoSituacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoSituacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alimentacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ArriendoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Arriendos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxCobrar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxPagar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Educacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Efectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GastoBasico" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteNatural" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IngresoConyugue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OrigenOtrosGastos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrigenOtrosIngresos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosActivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosGastos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPasivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Patrimonio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Prestamos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Salud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SueldoPropio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TarjetaCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalActivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalGastos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalIngresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalPasivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Transporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorOtrosIngresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoSituacion", propOrder = {
    "alimentacion",
    "arriendoMensual",
    "arriendos",
    "cuentasxCobrar",
    "cuentasxPagar",
    "depositos",
    "educacion",
    "efectivo",
    "gastoBasico",
    "idClienteNatural",
    "ingresoConyugue",
    "origenOtrosGastos",
    "origenOtrosIngresos",
    "otrosActivos",
    "otrosGastos",
    "otrosPasivos",
    "patrimonio",
    "prestamos",
    "salud",
    "sueldoPropio",
    "tarjetaCredito",
    "totalActivos",
    "totalGastos",
    "totalIngresos",
    "totalPasivos",
    "transporte",
    "valorOtrosIngresos"
})
public class EstadoSituacion {

    @XmlElement(name = "Alimentacion")
    protected BigDecimal alimentacion;
    @XmlElement(name = "ArriendoMensual")
    protected BigDecimal arriendoMensual;
    @XmlElement(name = "Arriendos")
    protected BigDecimal arriendos;
    @XmlElement(name = "CuentasxCobrar")
    protected BigDecimal cuentasxCobrar;
    @XmlElement(name = "CuentasxPagar")
    protected BigDecimal cuentasxPagar;
    @XmlElement(name = "Depositos")
    protected BigDecimal depositos;
    @XmlElement(name = "Educacion")
    protected BigDecimal educacion;
    @XmlElement(name = "Efectivo")
    protected BigDecimal efectivo;
    @XmlElement(name = "GastoBasico")
    protected BigDecimal gastoBasico;
    @XmlElement(name = "IdClienteNatural")
    protected Integer idClienteNatural;
    @XmlElement(name = "IngresoConyugue")
    protected BigDecimal ingresoConyugue;
    @XmlElementRef(name = "OrigenOtrosGastos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origenOtrosGastos;
    @XmlElementRef(name = "OrigenOtrosIngresos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origenOtrosIngresos;
    @XmlElement(name = "OtrosActivos")
    protected BigDecimal otrosActivos;
    @XmlElement(name = "OtrosGastos")
    protected BigDecimal otrosGastos;
    @XmlElement(name = "OtrosPasivos")
    protected BigDecimal otrosPasivos;
    @XmlElement(name = "Patrimonio")
    protected BigDecimal patrimonio;
    @XmlElement(name = "Prestamos")
    protected BigDecimal prestamos;
    @XmlElement(name = "Salud")
    protected BigDecimal salud;
    @XmlElement(name = "SueldoPropio")
    protected BigDecimal sueldoPropio;
    @XmlElement(name = "TarjetaCredito")
    protected BigDecimal tarjetaCredito;
    @XmlElement(name = "TotalActivos")
    protected BigDecimal totalActivos;
    @XmlElement(name = "TotalGastos")
    protected BigDecimal totalGastos;
    @XmlElement(name = "TotalIngresos")
    protected BigDecimal totalIngresos;
    @XmlElement(name = "TotalPasivos")
    protected BigDecimal totalPasivos;
    @XmlElement(name = "Transporte")
    protected BigDecimal transporte;
    @XmlElement(name = "ValorOtrosIngresos")
    protected BigDecimal valorOtrosIngresos;

    /**
     * Obtiene el valor de la propiedad alimentacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAlimentacion() {
        return alimentacion;
    }

    /**
     * Define el valor de la propiedad alimentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAlimentacion(BigDecimal value) {
        this.alimentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad arriendoMensual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArriendoMensual() {
        return arriendoMensual;
    }

    /**
     * Define el valor de la propiedad arriendoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArriendoMensual(BigDecimal value) {
        this.arriendoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad arriendos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArriendos() {
        return arriendos;
    }

    /**
     * Define el valor de la propiedad arriendos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArriendos(BigDecimal value) {
        this.arriendos = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasxCobrar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuentasxCobrar() {
        return cuentasxCobrar;
    }

    /**
     * Define el valor de la propiedad cuentasxCobrar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuentasxCobrar(BigDecimal value) {
        this.cuentasxCobrar = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasxPagar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuentasxPagar() {
        return cuentasxPagar;
    }

    /**
     * Define el valor de la propiedad cuentasxPagar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuentasxPagar(BigDecimal value) {
        this.cuentasxPagar = value;
    }

    /**
     * Obtiene el valor de la propiedad depositos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepositos() {
        return depositos;
    }

    /**
     * Define el valor de la propiedad depositos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepositos(BigDecimal value) {
        this.depositos = value;
    }

    /**
     * Obtiene el valor de la propiedad educacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEducacion() {
        return educacion;
    }

    /**
     * Define el valor de la propiedad educacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEducacion(BigDecimal value) {
        this.educacion = value;
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
     * Obtiene el valor de la propiedad gastoBasico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastoBasico() {
        return gastoBasico;
    }

    /**
     * Define el valor de la propiedad gastoBasico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastoBasico(BigDecimal value) {
        this.gastoBasico = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteNatural.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteNatural() {
        return idClienteNatural;
    }

    /**
     * Define el valor de la propiedad idClienteNatural.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteNatural(Integer value) {
        this.idClienteNatural = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoConyugue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoConyugue() {
        return ingresoConyugue;
    }

    /**
     * Define el valor de la propiedad ingresoConyugue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoConyugue(BigDecimal value) {
        this.ingresoConyugue = value;
    }

    /**
     * Obtiene el valor de la propiedad origenOtrosGastos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigenOtrosGastos() {
        return origenOtrosGastos;
    }

    /**
     * Define el valor de la propiedad origenOtrosGastos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigenOtrosGastos(JAXBElement<String> value) {
        this.origenOtrosGastos = value;
    }

    /**
     * Obtiene el valor de la propiedad origenOtrosIngresos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigenOtrosIngresos() {
        return origenOtrosIngresos;
    }

    /**
     * Define el valor de la propiedad origenOtrosIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigenOtrosIngresos(JAXBElement<String> value) {
        this.origenOtrosIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosActivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosActivos() {
        return otrosActivos;
    }

    /**
     * Define el valor de la propiedad otrosActivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosActivos(BigDecimal value) {
        this.otrosActivos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosGastos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosGastos() {
        return otrosGastos;
    }

    /**
     * Define el valor de la propiedad otrosGastos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosGastos(BigDecimal value) {
        this.otrosGastos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPasivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosPasivos() {
        return otrosPasivos;
    }

    /**
     * Define el valor de la propiedad otrosPasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosPasivos(BigDecimal value) {
        this.otrosPasivos = value;
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
     * Obtiene el valor de la propiedad prestamos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrestamos() {
        return prestamos;
    }

    /**
     * Define el valor de la propiedad prestamos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrestamos(BigDecimal value) {
        this.prestamos = value;
    }

    /**
     * Obtiene el valor de la propiedad salud.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalud() {
        return salud;
    }

    /**
     * Define el valor de la propiedad salud.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalud(BigDecimal value) {
        this.salud = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldoPropio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSueldoPropio() {
        return sueldoPropio;
    }

    /**
     * Define el valor de la propiedad sueldoPropio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSueldoPropio(BigDecimal value) {
        this.sueldoPropio = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjetaCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTarjetaCredito() {
        return tarjetaCredito;
    }

    /**
     * Define el valor de la propiedad tarjetaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTarjetaCredito(BigDecimal value) {
        this.tarjetaCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad totalActivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalActivos() {
        return totalActivos;
    }

    /**
     * Define el valor de la propiedad totalActivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalActivos(BigDecimal value) {
        this.totalActivos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalGastos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGastos() {
        return totalGastos;
    }

    /**
     * Define el valor de la propiedad totalGastos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGastos(BigDecimal value) {
        this.totalGastos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalIngresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIngresos() {
        return totalIngresos;
    }

    /**
     * Define el valor de la propiedad totalIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIngresos(BigDecimal value) {
        this.totalIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad totalPasivos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPasivos() {
        return totalPasivos;
    }

    /**
     * Define el valor de la propiedad totalPasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPasivos(BigDecimal value) {
        this.totalPasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad transporte.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransporte() {
        return transporte;
    }

    /**
     * Define el valor de la propiedad transporte.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransporte(BigDecimal value) {
        this.transporte = value;
    }

    /**
     * Obtiene el valor de la propiedad valorOtrosIngresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorOtrosIngresos() {
        return valorOtrosIngresos;
    }

    /**
     * Define el valor de la propiedad valorOtrosIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorOtrosIngresos(BigDecimal value) {
        this.valorOtrosIngresos = value;
    }

}
