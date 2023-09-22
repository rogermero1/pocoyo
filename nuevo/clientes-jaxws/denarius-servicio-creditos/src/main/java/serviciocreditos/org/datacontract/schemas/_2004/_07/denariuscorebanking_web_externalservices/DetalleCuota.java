
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleCuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleCuota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acumulado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CodigoRubro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="EstadoRubro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCuota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTabla" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuota" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Pagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Periodo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PlazoRubro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Proyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Rubro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaldoRecalculado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoRubro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Tasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TipoRubro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleCuota", propOrder = {
    "acumulado",
    "codigoRubro",
    "estado",
    "estadoRubro",
    "idCuota",
    "idOperacion",
    "idTabla",
    "numeroCuota",
    "pagado",
    "periodo",
    "plazoRubro",
    "proyectado",
    "rubro",
    "saldoRecalculado",
    "saldoRubro",
    "tasa",
    "tipoRubro"
})
public class DetalleCuota {

    @XmlElement(name = "Acumulado")
    protected BigDecimal acumulado;
    @XmlElement(name = "CodigoRubro")
    protected Integer codigoRubro;
    @XmlElement(name = "Estado")
    protected Integer estado;
    @XmlElementRef(name = "EstadoRubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoRubro;
    @XmlElement(name = "IdCuota")
    protected Integer idCuota;
    @XmlElement(name = "IdOperacion")
    protected Integer idOperacion;
    @XmlElement(name = "IdTabla")
    protected Integer idTabla;
    @XmlElement(name = "NumeroCuota")
    protected Integer numeroCuota;
    @XmlElement(name = "Pagado")
    protected BigDecimal pagado;
    @XmlElement(name = "Periodo")
    protected Integer periodo;
    @XmlElement(name = "PlazoRubro")
    protected Integer plazoRubro;
    @XmlElement(name = "Proyectado")
    protected BigDecimal proyectado;
    @XmlElementRef(name = "Rubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rubro;
    @XmlElement(name = "SaldoRecalculado")
    protected BigDecimal saldoRecalculado;
    @XmlElement(name = "SaldoRubro")
    protected BigDecimal saldoRubro;
    @XmlElement(name = "Tasa")
    protected BigDecimal tasa;
    @XmlElementRef(name = "TipoRubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoRubro;

    /**
     * Obtiene el valor de la propiedad acumulado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcumulado() {
        return acumulado;
    }

    /**
     * Define el valor de la propiedad acumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcumulado(BigDecimal value) {
        this.acumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoRubro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoRubro() {
        return codigoRubro;
    }

    /**
     * Define el valor de la propiedad codigoRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoRubro(Integer value) {
        this.codigoRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstado(Integer value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRubro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoRubro() {
        return estadoRubro;
    }

    /**
     * Define el valor de la propiedad estadoRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoRubro(JAXBElement<String> value) {
        this.estadoRubro = value;
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
     * Obtiene el valor de la propiedad idTabla.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTabla() {
        return idTabla;
    }

    /**
     * Define el valor de la propiedad idTabla.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTabla(Integer value) {
        this.idTabla = value;
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
     * Obtiene el valor de la propiedad pagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPagado() {
        return pagado;
    }

    /**
     * Define el valor de la propiedad pagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPagado(BigDecimal value) {
        this.pagado = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodo(Integer value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoRubro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazoRubro() {
        return plazoRubro;
    }

    /**
     * Define el valor de la propiedad plazoRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazoRubro(Integer value) {
        this.plazoRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad proyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProyectado() {
        return proyectado;
    }

    /**
     * Define el valor de la propiedad proyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProyectado(BigDecimal value) {
        this.proyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad rubro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRubro() {
        return rubro;
    }

    /**
     * Define el valor de la propiedad rubro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRubro(JAXBElement<String> value) {
        this.rubro = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoRecalculado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoRecalculado() {
        return saldoRecalculado;
    }

    /**
     * Define el valor de la propiedad saldoRecalculado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoRecalculado(BigDecimal value) {
        this.saldoRecalculado = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoRubro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoRubro() {
        return saldoRubro;
    }

    /**
     * Define el valor de la propiedad saldoRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoRubro(BigDecimal value) {
        this.saldoRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad tasa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Define el valor de la propiedad tasa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRubro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoRubro() {
        return tipoRubro;
    }

    /**
     * Define el valor de la propiedad tipoRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoRubro(JAXBElement<String> value) {
        this.tipoRubro = value;
    }

}
