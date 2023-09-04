
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para EvaluacionEconomicaConsumo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EvaluacionEconomicaConsumo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alimentacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Arriendo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapacidadAhorro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapacidadPago" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ColchonCuotaCapacidad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="ComprasNegocioFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CumpleCapacidad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CumplePatrimonio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CumpleRelacionCuotaIngreso" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Cuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DeudaActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Egresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EgresosCargas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EgresosConyuge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="EgresosNegocioFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="FechaEvaluacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="GastosFinancieros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdEvaluacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOcupacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOcupacionPareja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ingresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosActividad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IngresosConyuge" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MensajeCumpleCapacidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajeCumplePatrimonio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MensajeCumpleRelacionCuotaIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NivelEndeudamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCargas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Patrimonio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PensionesAlimenticias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PensionesJubilares" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeAlimentacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeAporteIessPrivado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeAporteIessPublico" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeCapacidadPago" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeCargas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeFondoReserva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Remesas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rentas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaSeguroDesgravamen" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TipoEvaluacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TotalActivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalEgresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalIngresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalPasivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UtilidadBrutaNegocioFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UtilidadNetaNegocioFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="UtilidadOperativa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VentasNegocioFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluacionEconomicaConsumo", propOrder = {
    "alimentacion",
    "arriendo",
    "baseImponible",
    "capacidadAhorro",
    "capacidadPago",
    "colchonCuotaCapacidad",
    "comprasNegocioFamiliar",
    "cumpleCapacidad",
    "cumplePatrimonio",
    "cumpleRelacionCuotaIngreso",
    "cuota",
    "deudaActual",
    "egresos",
    "egresosCargas",
    "egresosConyuge",
    "egresosNegocioFamiliar",
    "fechaEvaluacion",
    "gastosFinancieros",
    "idCliente",
    "idEvaluacion",
    "idOcupacion",
    "idOcupacionPareja",
    "idSolicitud",
    "ingresos",
    "ingresosActividad",
    "ingresosConyuge",
    "mensajeCumpleCapacidad",
    "mensajeCumplePatrimonio",
    "mensajeCumpleRelacionCuotaIngreso",
    "nivelEndeudamiento",
    "numeroCargas",
    "patrimonio",
    "pensionesAlimenticias",
    "pensionesJubilares",
    "porcentajeAlimentacion",
    "porcentajeAporteIessPrivado",
    "porcentajeAporteIessPublico",
    "porcentajeCapacidadPago",
    "porcentajeCargas",
    "porcentajeFondoReserva",
    "remesas",
    "rentas",
    "tasaSeguroDesgravamen",
    "tipoEvaluacion",
    "totalActivos",
    "totalEgresos",
    "totalIngresos",
    "totalPasivos",
    "utilidadBrutaNegocioFamiliar",
    "utilidadNetaNegocioFamiliar",
    "utilidadOperativa",
    "ventasNegocioFamiliar"
})
@XmlSeeAlso({
    EvaluacionEconomicaMicro.class
})
public class EvaluacionEconomicaConsumo {

    @XmlElement(name = "Alimentacion")
    protected BigDecimal alimentacion;
    @XmlElement(name = "Arriendo")
    protected BigDecimal arriendo;
    @XmlElement(name = "BaseImponible")
    protected BigDecimal baseImponible;
    @XmlElement(name = "CapacidadAhorro")
    protected BigDecimal capacidadAhorro;
    @XmlElement(name = "CapacidadPago")
    protected BigDecimal capacidadPago;
    @XmlElement(name = "ColchonCuotaCapacidad")
    protected Double colchonCuotaCapacidad;
    @XmlElement(name = "ComprasNegocioFamiliar")
    protected BigDecimal comprasNegocioFamiliar;
    @XmlElement(name = "CumpleCapacidad")
    protected Boolean cumpleCapacidad;
    @XmlElement(name = "CumplePatrimonio")
    protected Boolean cumplePatrimonio;
    @XmlElement(name = "CumpleRelacionCuotaIngreso")
    protected Boolean cumpleRelacionCuotaIngreso;
    @XmlElement(name = "Cuota")
    protected BigDecimal cuota;
    @XmlElement(name = "DeudaActual")
    protected BigDecimal deudaActual;
    @XmlElement(name = "Egresos")
    protected BigDecimal egresos;
    @XmlElement(name = "EgresosCargas")
    protected BigDecimal egresosCargas;
    @XmlElement(name = "EgresosConyuge")
    protected BigDecimal egresosConyuge;
    @XmlElement(name = "EgresosNegocioFamiliar")
    protected BigDecimal egresosNegocioFamiliar;
    @XmlElementRef(name = "FechaEvaluacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaEvaluacion;
    @XmlElement(name = "GastosFinancieros")
    protected BigDecimal gastosFinancieros;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElement(name = "IdEvaluacion")
    protected Integer idEvaluacion;
    @XmlElementRef(name = "IdOcupacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idOcupacion;
    @XmlElementRef(name = "IdOcupacionPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idOcupacionPareja;
    @XmlElement(name = "IdSolicitud")
    protected Integer idSolicitud;
    @XmlElement(name = "Ingresos")
    protected BigDecimal ingresos;
    @XmlElement(name = "IngresosActividad")
    protected BigDecimal ingresosActividad;
    @XmlElement(name = "IngresosConyuge")
    protected BigDecimal ingresosConyuge;
    @XmlElementRef(name = "MensajeCumpleCapacidad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeCumpleCapacidad;
    @XmlElementRef(name = "MensajeCumplePatrimonio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeCumplePatrimonio;
    @XmlElementRef(name = "MensajeCumpleRelacionCuotaIngreso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mensajeCumpleRelacionCuotaIngreso;
    @XmlElement(name = "NivelEndeudamiento")
    protected BigDecimal nivelEndeudamiento;
    @XmlElement(name = "NumeroCargas")
    protected Integer numeroCargas;
    @XmlElement(name = "Patrimonio")
    protected BigDecimal patrimonio;
    @XmlElement(name = "PensionesAlimenticias")
    protected BigDecimal pensionesAlimenticias;
    @XmlElement(name = "PensionesJubilares")
    protected BigDecimal pensionesJubilares;
    @XmlElement(name = "PorcentajeAlimentacion")
    protected BigDecimal porcentajeAlimentacion;
    @XmlElement(name = "PorcentajeAporteIessPrivado")
    protected BigDecimal porcentajeAporteIessPrivado;
    @XmlElement(name = "PorcentajeAporteIessPublico")
    protected BigDecimal porcentajeAporteIessPublico;
    @XmlElement(name = "PorcentajeCapacidadPago")
    protected BigDecimal porcentajeCapacidadPago;
    @XmlElement(name = "PorcentajeCargas")
    protected BigDecimal porcentajeCargas;
    @XmlElement(name = "PorcentajeFondoReserva")
    protected BigDecimal porcentajeFondoReserva;
    @XmlElement(name = "Remesas")
    protected BigDecimal remesas;
    @XmlElement(name = "Rentas")
    protected BigDecimal rentas;
    @XmlElement(name = "TasaSeguroDesgravamen")
    protected BigDecimal tasaSeguroDesgravamen;
    @XmlElement(name = "TipoEvaluacion")
    protected Integer tipoEvaluacion;
    @XmlElement(name = "TotalActivos")
    protected BigDecimal totalActivos;
    @XmlElement(name = "TotalEgresos")
    protected BigDecimal totalEgresos;
    @XmlElement(name = "TotalIngresos")
    protected BigDecimal totalIngresos;
    @XmlElement(name = "TotalPasivos")
    protected BigDecimal totalPasivos;
    @XmlElement(name = "UtilidadBrutaNegocioFamiliar")
    protected BigDecimal utilidadBrutaNegocioFamiliar;
    @XmlElement(name = "UtilidadNetaNegocioFamiliar")
    protected BigDecimal utilidadNetaNegocioFamiliar;
    @XmlElement(name = "UtilidadOperativa")
    protected BigDecimal utilidadOperativa;
    @XmlElement(name = "VentasNegocioFamiliar")
    protected BigDecimal ventasNegocioFamiliar;

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
     * Obtiene el valor de la propiedad arriendo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArriendo() {
        return arriendo;
    }

    /**
     * Define el valor de la propiedad arriendo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArriendo(BigDecimal value) {
        this.arriendo = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBaseImponible(BigDecimal value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadAhorro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapacidadAhorro() {
        return capacidadAhorro;
    }

    /**
     * Define el valor de la propiedad capacidadAhorro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadAhorro(BigDecimal value) {
        this.capacidadAhorro = value;
    }

    /**
     * Obtiene el valor de la propiedad capacidadPago.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapacidadPago() {
        return capacidadPago;
    }

    /**
     * Define el valor de la propiedad capacidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapacidadPago(BigDecimal value) {
        this.capacidadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad colchonCuotaCapacidad.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getColchonCuotaCapacidad() {
        return colchonCuotaCapacidad;
    }

    /**
     * Define el valor de la propiedad colchonCuotaCapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setColchonCuotaCapacidad(Double value) {
        this.colchonCuotaCapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad comprasNegocioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getComprasNegocioFamiliar() {
        return comprasNegocioFamiliar;
    }

    /**
     * Define el valor de la propiedad comprasNegocioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setComprasNegocioFamiliar(BigDecimal value) {
        this.comprasNegocioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad cumpleCapacidad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumpleCapacidad() {
        return cumpleCapacidad;
    }

    /**
     * Define el valor de la propiedad cumpleCapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumpleCapacidad(Boolean value) {
        this.cumpleCapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad cumplePatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumplePatrimonio() {
        return cumplePatrimonio;
    }

    /**
     * Define el valor de la propiedad cumplePatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumplePatrimonio(Boolean value) {
        this.cumplePatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad cumpleRelacionCuotaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCumpleRelacionCuotaIngreso() {
        return cumpleRelacionCuotaIngreso;
    }

    /**
     * Define el valor de la propiedad cumpleRelacionCuotaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCumpleRelacionCuotaIngreso(Boolean value) {
        this.cumpleRelacionCuotaIngreso = value;
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
     * Obtiene el valor de la propiedad deudaActual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDeudaActual() {
        return deudaActual;
    }

    /**
     * Define el valor de la propiedad deudaActual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDeudaActual(BigDecimal value) {
        this.deudaActual = value;
    }

    /**
     * Obtiene el valor de la propiedad egresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresos() {
        return egresos;
    }

    /**
     * Define el valor de la propiedad egresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresos(BigDecimal value) {
        this.egresos = value;
    }

    /**
     * Obtiene el valor de la propiedad egresosCargas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosCargas() {
        return egresosCargas;
    }

    /**
     * Define el valor de la propiedad egresosCargas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosCargas(BigDecimal value) {
        this.egresosCargas = value;
    }

    /**
     * Obtiene el valor de la propiedad egresosConyuge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosConyuge() {
        return egresosConyuge;
    }

    /**
     * Define el valor de la propiedad egresosConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosConyuge(BigDecimal value) {
        this.egresosConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad egresosNegocioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosNegocioFamiliar() {
        return egresosNegocioFamiliar;
    }

    /**
     * Define el valor de la propiedad egresosNegocioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosNegocioFamiliar(BigDecimal value) {
        this.egresosNegocioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    /**
     * Define el valor de la propiedad fechaEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaEvaluacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad gastosFinancieros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosFinancieros() {
        return gastosFinancieros;
    }

    /**
     * Define el valor de la propiedad gastosFinancieros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosFinancieros(BigDecimal value) {
        this.gastosFinancieros = value;
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
     * Obtiene el valor de la propiedad idEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    /**
     * Define el valor de la propiedad idEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEvaluacion(Integer value) {
        this.idEvaluacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdOcupacion() {
        return idOcupacion;
    }

    /**
     * Define el valor de la propiedad idOcupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdOcupacion(JAXBElement<Integer> value) {
        this.idOcupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacionPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdOcupacionPareja() {
        return idOcupacionPareja;
    }

    /**
     * Define el valor de la propiedad idOcupacionPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdOcupacionPareja(JAXBElement<Integer> value) {
        this.idOcupacionPareja = value;
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
     * Obtiene el valor de la propiedad ingresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresos() {
        return ingresos;
    }

    /**
     * Define el valor de la propiedad ingresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresos(BigDecimal value) {
        this.ingresos = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosActividad.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosActividad() {
        return ingresosActividad;
    }

    /**
     * Define el valor de la propiedad ingresosActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosActividad(BigDecimal value) {
        this.ingresosActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad ingresosConyuge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosConyuge() {
        return ingresosConyuge;
    }

    /**
     * Define el valor de la propiedad ingresosConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosConyuge(BigDecimal value) {
        this.ingresosConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeCumpleCapacidad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeCumpleCapacidad() {
        return mensajeCumpleCapacidad;
    }

    /**
     * Define el valor de la propiedad mensajeCumpleCapacidad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeCumpleCapacidad(JAXBElement<String> value) {
        this.mensajeCumpleCapacidad = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeCumplePatrimonio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeCumplePatrimonio() {
        return mensajeCumplePatrimonio;
    }

    /**
     * Define el valor de la propiedad mensajeCumplePatrimonio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeCumplePatrimonio(JAXBElement<String> value) {
        this.mensajeCumplePatrimonio = value;
    }

    /**
     * Obtiene el valor de la propiedad mensajeCumpleRelacionCuotaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMensajeCumpleRelacionCuotaIngreso() {
        return mensajeCumpleRelacionCuotaIngreso;
    }

    /**
     * Define el valor de la propiedad mensajeCumpleRelacionCuotaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMensajeCumpleRelacionCuotaIngreso(JAXBElement<String> value) {
        this.mensajeCumpleRelacionCuotaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEndeudamiento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNivelEndeudamiento() {
        return nivelEndeudamiento;
    }

    /**
     * Define el valor de la propiedad nivelEndeudamiento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNivelEndeudamiento(BigDecimal value) {
        this.nivelEndeudamiento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCargas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCargas() {
        return numeroCargas;
    }

    /**
     * Define el valor de la propiedad numeroCargas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCargas(Integer value) {
        this.numeroCargas = value;
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
     * Obtiene el valor de la propiedad pensionesAlimenticias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPensionesAlimenticias() {
        return pensionesAlimenticias;
    }

    /**
     * Define el valor de la propiedad pensionesAlimenticias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPensionesAlimenticias(BigDecimal value) {
        this.pensionesAlimenticias = value;
    }

    /**
     * Obtiene el valor de la propiedad pensionesJubilares.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPensionesJubilares() {
        return pensionesJubilares;
    }

    /**
     * Define el valor de la propiedad pensionesJubilares.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPensionesJubilares(BigDecimal value) {
        this.pensionesJubilares = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeAlimentacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeAlimentacion() {
        return porcentajeAlimentacion;
    }

    /**
     * Define el valor de la propiedad porcentajeAlimentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeAlimentacion(BigDecimal value) {
        this.porcentajeAlimentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeAporteIessPrivado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeAporteIessPrivado() {
        return porcentajeAporteIessPrivado;
    }

    /**
     * Define el valor de la propiedad porcentajeAporteIessPrivado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeAporteIessPrivado(BigDecimal value) {
        this.porcentajeAporteIessPrivado = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeAporteIessPublico.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeAporteIessPublico() {
        return porcentajeAporteIessPublico;
    }

    /**
     * Define el valor de la propiedad porcentajeAporteIessPublico.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeAporteIessPublico(BigDecimal value) {
        this.porcentajeAporteIessPublico = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeCapacidadPago.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeCapacidadPago() {
        return porcentajeCapacidadPago;
    }

    /**
     * Define el valor de la propiedad porcentajeCapacidadPago.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeCapacidadPago(BigDecimal value) {
        this.porcentajeCapacidadPago = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeCargas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeCargas() {
        return porcentajeCargas;
    }

    /**
     * Define el valor de la propiedad porcentajeCargas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeCargas(BigDecimal value) {
        this.porcentajeCargas = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeFondoReserva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeFondoReserva() {
        return porcentajeFondoReserva;
    }

    /**
     * Define el valor de la propiedad porcentajeFondoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeFondoReserva(BigDecimal value) {
        this.porcentajeFondoReserva = value;
    }

    /**
     * Obtiene el valor de la propiedad remesas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRemesas() {
        return remesas;
    }

    /**
     * Define el valor de la propiedad remesas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRemesas(BigDecimal value) {
        this.remesas = value;
    }

    /**
     * Obtiene el valor de la propiedad rentas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentas() {
        return rentas;
    }

    /**
     * Define el valor de la propiedad rentas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentas(BigDecimal value) {
        this.rentas = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaSeguroDesgravamen.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaSeguroDesgravamen() {
        return tasaSeguroDesgravamen;
    }

    /**
     * Define el valor de la propiedad tasaSeguroDesgravamen.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaSeguroDesgravamen(BigDecimal value) {
        this.tasaSeguroDesgravamen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoEvaluacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoEvaluacion() {
        return tipoEvaluacion;
    }

    /**
     * Define el valor de la propiedad tipoEvaluacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoEvaluacion(Integer value) {
        this.tipoEvaluacion = value;
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
     * Obtiene el valor de la propiedad totalEgresos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalEgresos() {
        return totalEgresos;
    }

    /**
     * Define el valor de la propiedad totalEgresos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalEgresos(BigDecimal value) {
        this.totalEgresos = value;
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
     * Obtiene el valor de la propiedad utilidadBrutaNegocioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadBrutaNegocioFamiliar() {
        return utilidadBrutaNegocioFamiliar;
    }

    /**
     * Define el valor de la propiedad utilidadBrutaNegocioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadBrutaNegocioFamiliar(BigDecimal value) {
        this.utilidadBrutaNegocioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadNetaNegocioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadNetaNegocioFamiliar() {
        return utilidadNetaNegocioFamiliar;
    }

    /**
     * Define el valor de la propiedad utilidadNetaNegocioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadNetaNegocioFamiliar(BigDecimal value) {
        this.utilidadNetaNegocioFamiliar = value;
    }

    /**
     * Obtiene el valor de la propiedad utilidadOperativa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadOperativa() {
        return utilidadOperativa;
    }

    /**
     * Define el valor de la propiedad utilidadOperativa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadOperativa(BigDecimal value) {
        this.utilidadOperativa = value;
    }

    /**
     * Obtiene el valor de la propiedad ventasNegocioFamiliar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentasNegocioFamiliar() {
        return ventasNegocioFamiliar;
    }

    /**
     * Define el valor de la propiedad ventasNegocioFamiliar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentasNegocioFamiliar(BigDecimal value) {
        this.ventasNegocioFamiliar = value;
    }

}
