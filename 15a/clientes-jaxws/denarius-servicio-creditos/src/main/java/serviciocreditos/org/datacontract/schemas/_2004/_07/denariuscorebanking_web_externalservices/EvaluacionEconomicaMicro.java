
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EvaluacionEconomicaMicro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EvaluacionEconomicaMicro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}EvaluacionEconomicaConsumo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ArriendoNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BienesInmuebles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BienesMuebles" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalTrabajo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxCobrar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxPagar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxPagarCP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuentasxPagarLP" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CuotaPrestamo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Depositos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeudasTarjeta" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Efectivo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Estudios" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ExcepcionNivelVentas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="GastosBasico" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GastosFamilia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GastosFamiliaSF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GastosNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="GastosNegocioSF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Imprevistos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresoNeto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosConyugeSF" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosDependencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosFamilia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosIndependencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosOtrasOcupaciones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosPropios" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Inventario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Inversiones" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Liquidez" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MantenimientoReparacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MargenUtilidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoFinanciarse" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NivelEndeudamientoMicroempresa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="NivelEndeudamientoPatrimonio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="OtrosEgresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosTickets" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Prestamos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RecuperacionVentasNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RotacionCapitalTrabajo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RotacionInventarios" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Salarios" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Salud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ServiciosPublicos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Transporte" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TransporteFamilia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UtilidadFamilia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UtilidadOperativaOtrasMicroempresas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluacionEconomicaMicro", propOrder = {
    "arriendoNegocio",
    "bienesInmuebles",
    "bienesMuebles",
    "capitalTrabajo",
    "cuentasxCobrar",
    "cuentasxPagar",
    "cuentasxPagarCP",
    "cuentasxPagarLP",
    "cuotaPrestamo",
    "depositos",
    "deudasTarjeta",
    "efectivo",
    "estudios",
    "excepcionNivelVentas",
    "gastosBasico",
    "gastosFamilia",
    "gastosFamiliaSF",
    "gastosNegocio",
    "gastosNegocioSF",
    "imprevistos",
    "ingresoNeto",
    "ingresosConyugeSF",
    "ingresosDependencia",
    "ingresosFamilia",
    "ingresosIndependencia",
    "ingresosNegocio",
    "ingresosOtrasOcupaciones",
    "ingresosPropios",
    "inventario",
    "inversiones",
    "liquidez",
    "mantenimientoReparacion",
    "margenUtilidad",
    "montoFinanciarse",
    "nivelEndeudamientoMicroempresa",
    "nivelEndeudamientoPatrimonio",
    "otrosEgresos",
    "otrosTickets",
    "prestamos",
    "recuperacionVentasNegocio",
    "rotacionCapitalTrabajo",
    "rotacionInventarios",
    "salarios",
    "saldoDisponible",
    "salud",
    "serviciosPublicos",
    "transporte",
    "transporteFamilia",
    "utilidadFamilia",
    "utilidadOperativaOtrasMicroempresas"
})
public class EvaluacionEconomicaMicro
    extends EvaluacionEconomicaConsumo
{

    @XmlElement(name = "ArriendoNegocio")
    protected BigDecimal arriendoNegocio;
    @XmlElement(name = "BienesInmuebles")
    protected BigDecimal bienesInmuebles;
    @XmlElement(name = "BienesMuebles")
    protected BigDecimal bienesMuebles;
    @XmlElement(name = "CapitalTrabajo")
    protected BigDecimal capitalTrabajo;
    @XmlElement(name = "CuentasxCobrar")
    protected BigDecimal cuentasxCobrar;
    @XmlElement(name = "CuentasxPagar")
    protected BigDecimal cuentasxPagar;
    @XmlElement(name = "CuentasxPagarCP")
    protected BigDecimal cuentasxPagarCP;
    @XmlElement(name = "CuentasxPagarLP")
    protected BigDecimal cuentasxPagarLP;
    @XmlElement(name = "CuotaPrestamo")
    protected BigDecimal cuotaPrestamo;
    @XmlElement(name = "Depositos")
    protected BigDecimal depositos;
    @XmlElement(name = "DeudasTarjeta")
    protected BigDecimal deudasTarjeta;
    @XmlElement(name = "Efectivo")
    protected BigDecimal efectivo;
    @XmlElement(name = "Estudios")
    protected BigDecimal estudios;
    @XmlElement(name = "ExcepcionNivelVentas")
    protected Boolean excepcionNivelVentas;
    @XmlElement(name = "GastosBasico")
    protected BigDecimal gastosBasico;
    @XmlElement(name = "GastosFamilia")
    protected BigDecimal gastosFamilia;
    @XmlElement(name = "GastosFamiliaSF")
    protected BigDecimal gastosFamiliaSF;
    @XmlElement(name = "GastosNegocio")
    protected BigDecimal gastosNegocio;
    @XmlElement(name = "GastosNegocioSF")
    protected BigDecimal gastosNegocioSF;
    @XmlElement(name = "Imprevistos")
    protected BigDecimal imprevistos;
    @XmlElement(name = "IngresoNeto")
    protected BigDecimal ingresoNeto;
    @XmlElement(name = "IngresosConyugeSF")
    protected BigDecimal ingresosConyugeSF;
    @XmlElement(name = "IngresosDependencia")
    protected BigDecimal ingresosDependencia;
    @XmlElement(name = "IngresosFamilia")
    protected BigDecimal ingresosFamilia;
    @XmlElement(name = "IngresosIndependencia")
    protected BigDecimal ingresosIndependencia;
    @XmlElement(name = "IngresosNegocio")
    protected BigDecimal ingresosNegocio;
    @XmlElement(name = "IngresosOtrasOcupaciones")
    protected BigDecimal ingresosOtrasOcupaciones;
    @XmlElement(name = "IngresosPropios")
    protected BigDecimal ingresosPropios;
    @XmlElement(name = "Inventario")
    protected BigDecimal inventario;
    @XmlElement(name = "Inversiones")
    protected BigDecimal inversiones;
    @XmlElement(name = "Liquidez")
    protected BigDecimal liquidez;
    @XmlElement(name = "MantenimientoReparacion")
    protected BigDecimal mantenimientoReparacion;
    @XmlElement(name = "MargenUtilidad")
    protected BigDecimal margenUtilidad;
    @XmlElement(name = "MontoFinanciarse")
    protected BigDecimal montoFinanciarse;
    @XmlElement(name = "NivelEndeudamientoMicroempresa")
    protected Double nivelEndeudamientoMicroempresa;
    @XmlElement(name = "NivelEndeudamientoPatrimonio")
    protected Double nivelEndeudamientoPatrimonio;
    @XmlElement(name = "OtrosEgresos")
    protected BigDecimal otrosEgresos;
    @XmlElement(name = "OtrosTickets")
    protected BigDecimal otrosTickets;
    @XmlElement(name = "Prestamos")
    protected BigDecimal prestamos;
    @XmlElement(name = "RecuperacionVentasNegocio")
    protected BigDecimal recuperacionVentasNegocio;
    @XmlElement(name = "RotacionCapitalTrabajo")
    protected BigDecimal rotacionCapitalTrabajo;
    @XmlElement(name = "RotacionInventarios")
    protected BigDecimal rotacionInventarios;
    @XmlElement(name = "Salarios")
    protected BigDecimal salarios;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;
    @XmlElement(name = "Salud")
    protected BigDecimal salud;
    @XmlElement(name = "ServiciosPublicos")
    protected BigDecimal serviciosPublicos;
    @XmlElement(name = "Transporte")
    protected BigDecimal transporte;
    @XmlElement(name = "TransporteFamilia")
    protected BigDecimal transporteFamilia;
    @XmlElement(name = "UtilidadFamilia")
    protected BigDecimal utilidadFamilia;
    @XmlElement(name = "UtilidadOperativaOtrasMicroempresas")
    protected BigDecimal utilidadOperativaOtrasMicroempresas;

    /**
     * Obtiene el valor de la propiedad arriendoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArriendoNegocio() {
        return arriendoNegocio;
    }

    /**
     * Define el valor de la propiedad arriendoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArriendoNegocio(BigDecimal value) {
        this.arriendoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad bienesInmuebles.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBienesInmuebles() {
        return bienesInmuebles;
    }

    /**
     * Define el valor de la propiedad bienesInmuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBienesInmuebles(BigDecimal value) {
        this.bienesInmuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad bienesMuebles.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBienesMuebles() {
        return bienesMuebles;
    }

    /**
     * Define el valor de la propiedad bienesMuebles.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBienesMuebles(BigDecimal value) {
        this.bienesMuebles = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalTrabajo() {
        return capitalTrabajo;
    }

    /**
     * Define el valor de la propiedad capitalTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalTrabajo(BigDecimal value) {
        this.capitalTrabajo = value;
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
     * Obtiene el valor de la propiedad cuentasxPagarCP.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuentasxPagarCP() {
        return cuentasxPagarCP;
    }

    /**
     * Define el valor de la propiedad cuentasxPagarCP.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuentasxPagarCP(BigDecimal value) {
        this.cuentasxPagarCP = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentasxPagarLP.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuentasxPagarLP() {
        return cuentasxPagarLP;
    }

    /**
     * Define el valor de la propiedad cuentasxPagarLP.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuentasxPagarLP(BigDecimal value) {
        this.cuentasxPagarLP = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaPrestamo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaPrestamo() {
        return cuotaPrestamo;
    }

    /**
     * Define el valor de la propiedad cuotaPrestamo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaPrestamo(BigDecimal value) {
        this.cuotaPrestamo = value;
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
     * Obtiene el valor de la propiedad deudasTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudasTarjeta() {
        return deudasTarjeta;
    }

    /**
     * Define el valor de la propiedad deudasTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudasTarjeta(BigDecimal value) {
        this.deudasTarjeta = value;
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
     * Obtiene el valor de la propiedad estudios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstudios() {
        return estudios;
    }

    /**
     * Define el valor de la propiedad estudios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstudios(BigDecimal value) {
        this.estudios = value;
    }

    /**
     * Obtiene el valor de la propiedad excepcionNivelVentas.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcepcionNivelVentas() {
        return excepcionNivelVentas;
    }

    /**
     * Define el valor de la propiedad excepcionNivelVentas.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcepcionNivelVentas(Boolean value) {
        this.excepcionNivelVentas = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosBasico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosBasico() {
        return gastosBasico;
    }

    /**
     * Define el valor de la propiedad gastosBasico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosBasico(BigDecimal value) {
        this.gastosBasico = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosFamilia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosFamilia() {
        return gastosFamilia;
    }

    /**
     * Define el valor de la propiedad gastosFamilia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosFamilia(BigDecimal value) {
        this.gastosFamilia = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosFamiliaSF.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosFamiliaSF() {
        return gastosFamiliaSF;
    }

    /**
     * Define el valor de la propiedad gastosFamiliaSF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosFamiliaSF(BigDecimal value) {
        this.gastosFamiliaSF = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosNegocio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosNegocio() {
        return gastosNegocio;
    }

    /**
     * Define el valor de la propiedad gastosNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosNegocio(BigDecimal value) {
        this.gastosNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosNegocioSF.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosNegocioSF() {
        return gastosNegocioSF;
    }

    /**
     * Define el valor de la propiedad gastosNegocioSF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosNegocioSF(BigDecimal value) {
        this.gastosNegocioSF = value;
    }

    /**
     * Obtiene el valor de la propiedad imprevistos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImprevistos() {
        return imprevistos;
    }

    /**
     * Define el valor de la propiedad imprevistos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImprevistos(BigDecimal value) {
        this.imprevistos = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresoNeto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresoNeto() {
        return ingresoNeto;
    }

    /**
     * Define el valor de la propiedad ingresoNeto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresoNeto(BigDecimal value) {
        this.ingresoNeto = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosConyugeSF.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosConyugeSF() {
        return ingresosConyugeSF;
    }

    /**
     * Define el valor de la propiedad ingresosConyugeSF.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosConyugeSF(BigDecimal value) {
        this.ingresosConyugeSF = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosDependencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosDependencia() {
        return ingresosDependencia;
    }

    /**
     * Define el valor de la propiedad ingresosDependencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosDependencia(BigDecimal value) {
        this.ingresosDependencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosFamilia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosFamilia() {
        return ingresosFamilia;
    }

    /**
     * Define el valor de la propiedad ingresosFamilia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosFamilia(BigDecimal value) {
        this.ingresosFamilia = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosIndependencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosIndependencia() {
        return ingresosIndependencia;
    }

    /**
     * Define el valor de la propiedad ingresosIndependencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosIndependencia(BigDecimal value) {
        this.ingresosIndependencia = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosNegocio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosNegocio() {
        return ingresosNegocio;
    }

    /**
     * Define el valor de la propiedad ingresosNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosNegocio(BigDecimal value) {
        this.ingresosNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosOtrasOcupaciones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosOtrasOcupaciones() {
        return ingresosOtrasOcupaciones;
    }

    /**
     * Define el valor de la propiedad ingresosOtrasOcupaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosOtrasOcupaciones(BigDecimal value) {
        this.ingresosOtrasOcupaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosPropios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosPropios() {
        return ingresosPropios;
    }

    /**
     * Define el valor de la propiedad ingresosPropios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosPropios(BigDecimal value) {
        this.ingresosPropios = value;
    }

    /**
     * Obtiene el valor de la propiedad inventario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInventario() {
        return inventario;
    }

    /**
     * Define el valor de la propiedad inventario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInventario(BigDecimal value) {
        this.inventario = value;
    }

    /**
     * Obtiene el valor de la propiedad inversiones.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInversiones() {
        return inversiones;
    }

    /**
     * Define el valor de la propiedad inversiones.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInversiones(BigDecimal value) {
        this.inversiones = value;
    }

    /**
     * Obtiene el valor de la propiedad liquidez.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLiquidez() {
        return liquidez;
    }

    /**
     * Define el valor de la propiedad liquidez.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLiquidez(BigDecimal value) {
        this.liquidez = value;
    }

    /**
     * Obtiene el valor de la propiedad mantenimientoReparacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMantenimientoReparacion() {
        return mantenimientoReparacion;
    }

    /**
     * Define el valor de la propiedad mantenimientoReparacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMantenimientoReparacion(BigDecimal value) {
        this.mantenimientoReparacion = value;
    }

    /**
     * Obtiene el valor de la propiedad margenUtilidad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMargenUtilidad() {
        return margenUtilidad;
    }

    /**
     * Define el valor de la propiedad margenUtilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMargenUtilidad(BigDecimal value) {
        this.margenUtilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFinanciarse.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoFinanciarse() {
        return montoFinanciarse;
    }

    /**
     * Define el valor de la propiedad montoFinanciarse.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoFinanciarse(BigDecimal value) {
        this.montoFinanciarse = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEndeudamientoMicroempresa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNivelEndeudamientoMicroempresa() {
        return nivelEndeudamientoMicroempresa;
    }

    /**
     * Define el valor de la propiedad nivelEndeudamientoMicroempresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNivelEndeudamientoMicroempresa(Double value) {
        this.nivelEndeudamientoMicroempresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEndeudamientoPatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNivelEndeudamientoPatrimonio() {
        return nivelEndeudamientoPatrimonio;
    }

    /**
     * Define el valor de la propiedad nivelEndeudamientoPatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNivelEndeudamientoPatrimonio(Double value) {
        this.nivelEndeudamientoPatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosEgresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosEgresos() {
        return otrosEgresos;
    }

    /**
     * Define el valor de la propiedad otrosEgresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosEgresos(BigDecimal value) {
        this.otrosEgresos = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosTickets.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosTickets() {
        return otrosTickets;
    }

    /**
     * Define el valor de la propiedad otrosTickets.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosTickets(BigDecimal value) {
        this.otrosTickets = value;
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
     * Obtiene el valor de la propiedad recuperacionVentasNegocio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRecuperacionVentasNegocio() {
        return recuperacionVentasNegocio;
    }

    /**
     * Define el valor de la propiedad recuperacionVentasNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRecuperacionVentasNegocio(BigDecimal value) {
        this.recuperacionVentasNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad rotacionCapitalTrabajo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRotacionCapitalTrabajo() {
        return rotacionCapitalTrabajo;
    }

    /**
     * Define el valor de la propiedad rotacionCapitalTrabajo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRotacionCapitalTrabajo(BigDecimal value) {
        this.rotacionCapitalTrabajo = value;
    }

    /**
     * Obtiene el valor de la propiedad rotacionInventarios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRotacionInventarios() {
        return rotacionInventarios;
    }

    /**
     * Define el valor de la propiedad rotacionInventarios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRotacionInventarios(BigDecimal value) {
        this.rotacionInventarios = value;
    }

    /**
     * Obtiene el valor de la propiedad salarios.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSalarios() {
        return salarios;
    }

    /**
     * Define el valor de la propiedad salarios.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSalarios(BigDecimal value) {
        this.salarios = value;
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
     * Obtiene el valor de la propiedad serviciosPublicos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiciosPublicos() {
        return serviciosPublicos;
    }

    /**
     * Define el valor de la propiedad serviciosPublicos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiciosPublicos(BigDecimal value) {
        this.serviciosPublicos = value;
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
     * Obtiene el valor de la propiedad transporteFamilia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransporteFamilia() {
        return transporteFamilia;
    }

    /**
     * Define el valor de la propiedad transporteFamilia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransporteFamilia(BigDecimal value) {
        this.transporteFamilia = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadFamilia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadFamilia() {
        return utilidadFamilia;
    }

    /**
     * Define el valor de la propiedad utilidadFamilia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadFamilia(BigDecimal value) {
        this.utilidadFamilia = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadOperativaOtrasMicroempresas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadOperativaOtrasMicroempresas() {
        return utilidadOperativaOtrasMicroempresas;
    }

    /**
     * Define el valor de la propiedad utilidadOperativaOtrasMicroempresas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadOperativaOtrasMicroempresas(BigDecimal value) {
        this.utilidadOperativaOtrasMicroempresas = value;
    }

}
