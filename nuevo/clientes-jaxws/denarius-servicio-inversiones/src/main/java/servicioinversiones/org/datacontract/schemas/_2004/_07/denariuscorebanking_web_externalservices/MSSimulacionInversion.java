
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSSimulacionInversion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSSimulacionInversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Impuesto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Interes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Neto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeImpuesto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TablaPagos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}ArrayOfPagoPeriodico" minOccurs="0"/&gt;
 *         &lt;element name="TablaSimulaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}ArrayOfDatosSimulacion" minOccurs="0"/&gt;
 *         &lt;element name="TasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TasaNominal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSSimulacionInversion", propOrder = {
    "impuesto",
    "interes",
    "neto",
    "porcentajeImpuesto",
    "tablaPagos",
    "tablaSimulaciones",
    "tasaEfectiva",
    "tasaNominal"
})
public class MSSimulacionInversion
    extends MensajeSalidaBase
{

    @XmlElement(name = "Impuesto")
    protected BigDecimal impuesto;
    @XmlElement(name = "Interes")
    protected BigDecimal interes;
    @XmlElement(name = "Neto")
    protected BigDecimal neto;
    @XmlElement(name = "PorcentajeImpuesto")
    protected BigDecimal porcentajeImpuesto;
    @XmlElementRef(name = "TablaPagos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPagoPeriodico> tablaPagos;
    @XmlElementRef(name = "TablaSimulaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosSimulacion> tablaSimulaciones;
    @XmlElement(name = "TasaEfectiva")
    protected BigDecimal tasaEfectiva;
    @XmlElement(name = "TasaNominal")
    protected BigDecimal tasaNominal;

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
     * Obtiene el valor de la propiedad neto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNeto() {
        return neto;
    }

    /**
     * Define el valor de la propiedad neto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNeto(BigDecimal value) {
        this.neto = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeImpuesto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    /**
     * Define el valor de la propiedad porcentajeImpuesto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeImpuesto(BigDecimal value) {
        this.porcentajeImpuesto = value;
    }

    /**
     * Obtiene el valor de la propiedad tablaPagos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPagoPeriodico> getTablaPagos() {
        return tablaPagos;
    }

    /**
     * Define el valor de la propiedad tablaPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     *     
     */
    public void setTablaPagos(JAXBElement<ArrayOfPagoPeriodico> value) {
        this.tablaPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad tablaSimulaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosSimulacion> getTablaSimulaciones() {
        return tablaSimulaciones;
    }

    /**
     * Define el valor de la propiedad tablaSimulaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     *     
     */
    public void setTablaSimulaciones(JAXBElement<ArrayOfDatosSimulacion> value) {
        this.tablaSimulaciones = value;
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
     * Obtiene el valor de la propiedad tasaNominal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaNominal() {
        return tasaNominal;
    }

    /**
     * Define el valor de la propiedad tasaNominal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaNominal(BigDecimal value) {
        this.tasaNominal = value;
    }

}
