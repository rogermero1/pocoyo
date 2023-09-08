
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSGuardarCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSGuardarCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdSolicitudCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSolicitudTarjeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ListaPoliticas" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}ArrayOfCheckListFlujo" minOccurs="0"/&gt;
 *         &lt;element name="PresentarRiesgoAmbiental" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoProceso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorPrimeraCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorSegDes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSGuardarCredito", propOrder = {
    "idSolicitudCredito",
    "idSolicitudTarjeta",
    "listaPoliticas",
    "presentarRiesgoAmbiental",
    "tipoCredito",
    "tipoOperacion",
    "tipoProceso",
    "valorCredito",
    "valorPrimeraCuota",
    "valorSegDes",
    "valorTasaEfectiva",
    "valorTasaInteres",
    "valorTotal"
})
public class MSGuardarCredito
    extends MensajeSalidaBase
{

    @XmlElement(name = "IdSolicitudCredito")
    protected Integer idSolicitudCredito;
    @XmlElement(name = "IdSolicitudTarjeta")
    protected Integer idSolicitudTarjeta;
    @XmlElementRef(name = "ListaPoliticas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCheckListFlujo> listaPoliticas;
    @XmlElement(name = "PresentarRiesgoAmbiental")
    protected Boolean presentarRiesgoAmbiental;
    @XmlElementRef(name = "TipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCredito;
    @XmlElementRef(name = "TipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;
    @XmlElement(name = "TipoProceso")
    protected Integer tipoProceso;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name = "ValorPrimeraCuota")
    protected BigDecimal valorPrimeraCuota;
    @XmlElement(name = "ValorSegDes")
    protected BigDecimal valorSegDes;
    @XmlElement(name = "ValorTasaEfectiva")
    protected BigDecimal valorTasaEfectiva;
    @XmlElement(name = "ValorTasaInteres")
    protected BigDecimal valorTasaInteres;
    @XmlElement(name = "ValorTotal")
    protected BigDecimal valorTotal;

    /**
     * Obtiene el valor de la propiedad idSolicitudCredito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitudCredito() {
        return idSolicitudCredito;
    }

    /**
     * Define el valor de la propiedad idSolicitudCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitudCredito(Integer value) {
        this.idSolicitudCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad idSolicitudTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitudTarjeta() {
        return idSolicitudTarjeta;
    }

    /**
     * Define el valor de la propiedad idSolicitudTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitudTarjeta(Integer value) {
        this.idSolicitudTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad listaPoliticas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCheckListFlujo> getListaPoliticas() {
        return listaPoliticas;
    }

    /**
     * Define el valor de la propiedad listaPoliticas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     *     
     */
    public void setListaPoliticas(JAXBElement<ArrayOfCheckListFlujo> value) {
        this.listaPoliticas = value;
    }

    /**
     * Obtiene el valor de la propiedad presentarRiesgoAmbiental.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresentarRiesgoAmbiental() {
        return presentarRiesgoAmbiental;
    }

    /**
     * Define el valor de la propiedad presentarRiesgoAmbiental.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresentarRiesgoAmbiental(Boolean value) {
        this.presentarRiesgoAmbiental = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define el valor de la propiedad tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCredito(JAXBElement<String> value) {
        this.tipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOperacion(JAXBElement<String> value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoProceso(Integer value) {
        this.tipoProceso = value;
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
     * Obtiene el valor de la propiedad valorSegDes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSegDes() {
        return valorSegDes;
    }

    /**
     * Define el valor de la propiedad valorSegDes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSegDes(BigDecimal value) {
        this.valorSegDes = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTasaEfectiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTasaEfectiva() {
        return valorTasaEfectiva;
    }

    /**
     * Define el valor de la propiedad valorTasaEfectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTasaEfectiva(BigDecimal value) {
        this.valorTasaEfectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTasaInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTasaInteres() {
        return valorTasaInteres;
    }

    /**
     * Define el valor de la propiedad valorTasaInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTasaInteres(BigDecimal value) {
        this.valorTasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

}
