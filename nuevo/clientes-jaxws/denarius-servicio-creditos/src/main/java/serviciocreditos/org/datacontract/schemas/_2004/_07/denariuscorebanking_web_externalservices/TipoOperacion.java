
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TipoOperacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AceptaAnticipado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuotaCompleta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DesTipoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="MontoMaximo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoMinimo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoCapital" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoInteres" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PeriodoReajuste" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Precancelacion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reajustable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Reduccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Renovacion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoAmortizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAplicacionPagos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoCobroIntereses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoOperacion", propOrder = {
    "aceptaAnticipado",
    "codigoTipoOperacion",
    "cuotaCompleta",
    "desTipoCuota",
    "descripcionMoneda",
    "descripcionTipoOperacion",
    "moneda",
    "montoMaximo",
    "montoMinimo",
    "periodoCapital",
    "periodoInteres",
    "periodoReajuste",
    "precancelacion",
    "reajustable",
    "reduccion",
    "renovacion",
    "tipoAmortizacion",
    "tipoAplicacionPagos",
    "tipoCobroIntereses",
    "tipoCuota"
})
public class TipoOperacion {

    @XmlElement(name = "AceptaAnticipado")
    protected Boolean aceptaAnticipado;
    @XmlElementRef(name = "CodigoTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoOperacion;
    @XmlElement(name = "CuotaCompleta")
    protected Boolean cuotaCompleta;
    @XmlElementRef(name = "DesTipoCuota", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> desTipoCuota;
    @XmlElementRef(name = "DescripcionMoneda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionMoneda;
    @XmlElementRef(name = "DescripcionTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoOperacion;
    @XmlElement(name = "Moneda")
    @XmlSchemaType(name = "unsignedByte")
    protected Short moneda;
    @XmlElement(name = "MontoMaximo")
    protected BigDecimal montoMaximo;
    @XmlElement(name = "MontoMinimo")
    protected BigDecimal montoMinimo;
    @XmlElement(name = "PeriodoCapital")
    protected Integer periodoCapital;
    @XmlElement(name = "PeriodoInteres")
    protected Integer periodoInteres;
    @XmlElement(name = "PeriodoReajuste")
    protected Integer periodoReajuste;
    @XmlElement(name = "Precancelacion")
    protected Boolean precancelacion;
    @XmlElement(name = "Reajustable")
    protected Boolean reajustable;
    @XmlElementRef(name = "Reduccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reduccion;
    @XmlElement(name = "Renovacion")
    protected Boolean renovacion;
    @XmlElementRef(name = "TipoAmortizacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAmortizacion;
    @XmlElement(name = "TipoAplicacionPagos")
    protected Boolean tipoAplicacionPagos;
    @XmlElementRef(name = "TipoCobroIntereses", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCobroIntereses;
    @XmlElementRef(name = "TipoCuota", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuota;

    /**
     * Obtiene el valor de la propiedad aceptaAnticipado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAceptaAnticipado() {
        return aceptaAnticipado;
    }

    /**
     * Define el valor de la propiedad aceptaAnticipado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAceptaAnticipado(Boolean value) {
        this.aceptaAnticipado = value;
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
     * Obtiene el valor de la propiedad cuotaCompleta.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCuotaCompleta() {
        return cuotaCompleta;
    }

    /**
     * Define el valor de la propiedad cuotaCompleta.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCuotaCompleta(Boolean value) {
        this.cuotaCompleta = value;
    }

    /**
     * Obtiene el valor de la propiedad desTipoCuota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDesTipoCuota() {
        return desTipoCuota;
    }

    /**
     * Define el valor de la propiedad desTipoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDesTipoCuota(JAXBElement<String> value) {
        this.desTipoCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionMoneda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionMoneda() {
        return descripcionMoneda;
    }

    /**
     * Define el valor de la propiedad descripcionMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionMoneda(JAXBElement<String> value) {
        this.descripcionMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoOperacion() {
        return descripcionTipoOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoOperacion(JAXBElement<String> value) {
        this.descripcionTipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMoneda(Short value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMaximo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    /**
     * Define el valor de la propiedad montoMaximo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMaximo(BigDecimal value) {
        this.montoMaximo = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMinimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMinimo() {
        return montoMinimo;
    }

    /**
     * Define el valor de la propiedad montoMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMinimo(BigDecimal value) {
        this.montoMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoCapital.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoCapital() {
        return periodoCapital;
    }

    /**
     * Define el valor de la propiedad periodoCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoCapital(Integer value) {
        this.periodoCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoInteres.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoInteres() {
        return periodoInteres;
    }

    /**
     * Define el valor de la propiedad periodoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoInteres(Integer value) {
        this.periodoInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoReajuste.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoReajuste() {
        return periodoReajuste;
    }

    /**
     * Define el valor de la propiedad periodoReajuste.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoReajuste(Integer value) {
        this.periodoReajuste = value;
    }

    /**
     * Obtiene el valor de la propiedad precancelacion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrecancelacion() {
        return precancelacion;
    }

    /**
     * Define el valor de la propiedad precancelacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrecancelacion(Boolean value) {
        this.precancelacion = value;
    }

    /**
     * Obtiene el valor de la propiedad reajustable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReajustable() {
        return reajustable;
    }

    /**
     * Define el valor de la propiedad reajustable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReajustable(Boolean value) {
        this.reajustable = value;
    }

    /**
     * Obtiene el valor de la propiedad reduccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReduccion() {
        return reduccion;
    }

    /**
     * Define el valor de la propiedad reduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReduccion(JAXBElement<String> value) {
        this.reduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad renovacion.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRenovacion() {
        return renovacion;
    }

    /**
     * Define el valor de la propiedad renovacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenovacion(Boolean value) {
        this.renovacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAmortizacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAmortizacion() {
        return tipoAmortizacion;
    }

    /**
     * Define el valor de la propiedad tipoAmortizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAmortizacion(JAXBElement<String> value) {
        this.tipoAmortizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAplicacionPagos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTipoAplicacionPagos() {
        return tipoAplicacionPagos;
    }

    /**
     * Define el valor de la propiedad tipoAplicacionPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTipoAplicacionPagos(Boolean value) {
        this.tipoAplicacionPagos = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCobroIntereses.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCobroIntereses() {
        return tipoCobroIntereses;
    }

    /**
     * Define el valor de la propiedad tipoCobroIntereses.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCobroIntereses(JAXBElement<String> value) {
        this.tipoCobroIntereses = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuota.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuota() {
        return tipoCuota;
    }

    /**
     * Define el valor de la propiedad tipoCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuota(JAXBElement<String> value) {
        this.tipoCuota = value;
    }

}
