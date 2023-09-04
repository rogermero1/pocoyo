
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MECreditoConsolidado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECreditoConsolidado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoActividadEconomica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDestinoEspecifico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDestinoFinanciero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoOficial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoTabla" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiaPago" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdValidacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncluirSeguroEnfermedad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacionRenovar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Segmentacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="VentasAnuales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECreditoConsolidado", propOrder = {
    "codigoActividadEconomica",
    "codigoDestinoEspecifico",
    "codigoDestinoFinanciero",
    "codigoOficial",
    "codigoTipoCredito",
    "codigoTipoOperacion",
    "codigoTipoTabla",
    "diaPago",
    "idValidacion",
    "identificacion",
    "incluirSeguroEnfermedad",
    "numeroOperacionRenovar",
    "plazo",
    "segmentacion",
    "valorCredito",
    "ventasAnuales"
})
public class MECreditoConsolidado
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoActividadEconomica", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoActividadEconomica;
    @XmlElementRef(name = "CodigoDestinoEspecifico", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoDestinoEspecifico;
    @XmlElementRef(name = "CodigoDestinoFinanciero", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoDestinoFinanciero;
    @XmlElementRef(name = "CodigoOficial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoOficial;
    @XmlElementRef(name = "CodigoTipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoCredito;
    @XmlElementRef(name = "CodigoTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoOperacion;
    @XmlElementRef(name = "CodigoTipoTabla", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoTabla;
    @XmlElement(name = "DiaPago")
    protected Integer diaPago;
    @XmlElementRef(name = "IdValidacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idValidacion;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElement(name = "IncluirSeguroEnfermedad")
    protected Boolean incluirSeguroEnfermedad;
    @XmlElementRef(name = "NumeroOperacionRenovar", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacionRenovar;
    @XmlElement(name = "Plazo")
    protected Integer plazo;
    @XmlElementRef(name = "Segmentacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmentacion;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElementRef(name = "VentasAnuales", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ventasAnuales;

    /**
     * Obtiene el valor de la propiedad codigoActividadEconomica.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoActividadEconomica() {
        return codigoActividadEconomica;
    }

    /**
     * Define el valor de la propiedad codigoActividadEconomica.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoActividadEconomica(JAXBElement<String> value) {
        this.codigoActividadEconomica = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDestinoEspecifico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoDestinoEspecifico() {
        return codigoDestinoEspecifico;
    }

    /**
     * Define el valor de la propiedad codigoDestinoEspecifico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoDestinoEspecifico(JAXBElement<String> value) {
        this.codigoDestinoEspecifico = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDestinoFinanciero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoDestinoFinanciero() {
        return codigoDestinoFinanciero;
    }

    /**
     * Define el valor de la propiedad codigoDestinoFinanciero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoDestinoFinanciero(JAXBElement<String> value) {
        this.codigoDestinoFinanciero = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoOficial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoOficial() {
        return codigoOficial;
    }

    /**
     * Define el valor de la propiedad codigoOficial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoOficial(JAXBElement<String> value) {
        this.codigoOficial = value;
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
     * Obtiene el valor de la propiedad codigoTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoOperacion(JAXBElement<String> value) {
        this.codigoTipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoTabla.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoTabla() {
        return codigoTipoTabla;
    }

    /**
     * Define el valor de la propiedad codigoTipoTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoTabla(JAXBElement<String> value) {
        this.codigoTipoTabla = value;
    }

    /**
     * Obtiene el valor de la propiedad diaPago.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaPago() {
        return diaPago;
    }

    /**
     * Define el valor de la propiedad diaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaPago(Integer value) {
        this.diaPago = value;
    }

    /**
     * Obtiene el valor de la propiedad idValidacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdValidacion() {
        return idValidacion;
    }

    /**
     * Define el valor de la propiedad idValidacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdValidacion(JAXBElement<String> value) {
        this.idValidacion = value;
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
     * Obtiene el valor de la propiedad incluirSeguroEnfermedad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluirSeguroEnfermedad() {
        return incluirSeguroEnfermedad;
    }

    /**
     * Define el valor de la propiedad incluirSeguroEnfermedad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluirSeguroEnfermedad(Boolean value) {
        this.incluirSeguroEnfermedad = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacionRenovar.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOperacionRenovar() {
        return numeroOperacionRenovar;
    }

    /**
     * Define el valor de la propiedad numeroOperacionRenovar.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOperacionRenovar(JAXBElement<String> value) {
        this.numeroOperacionRenovar = value;
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
     * Obtiene el valor de la propiedad segmentacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmentacion() {
        return segmentacion;
    }

    /**
     * Define el valor de la propiedad segmentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmentacion(JAXBElement<String> value) {
        this.segmentacion = value;
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
     * Obtiene el valor de la propiedad ventasAnuales.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getVentasAnuales() {
        return ventasAnuales;
    }

    /**
     * Define el valor de la propiedad ventasAnuales.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setVentasAnuales(JAXBElement<BigDecimal> value) {
        this.ventasAnuales = value;
    }

}
