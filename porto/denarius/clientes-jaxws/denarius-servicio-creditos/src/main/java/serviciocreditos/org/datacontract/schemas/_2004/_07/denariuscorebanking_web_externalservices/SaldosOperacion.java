
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaldosOperacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaldosOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapitalPorVencer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InteresPorVencer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraPorVencer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPorVencer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoCapital" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoMora" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoOtros" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoSeguro" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeguroPorVencer" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SeguroProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SeguroVencido" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SeguroVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TipoCartera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaldosOperacion", propOrder = {
    "capitalPorVencer",
    "capitalProyectado",
    "capitalVencido",
    "capitalVigente",
    "estado",
    "idCliente",
    "idOperacion",
    "interesPorVencer",
    "interesProyectado",
    "interesVencido",
    "interesVigente",
    "moraPorVencer",
    "moraProyectado",
    "moraVencido",
    "moraVigente",
    "numeroOperacion",
    "otrosPorVencer",
    "otrosProyectado",
    "otrosVencido",
    "otrosVigente",
    "saldoCapital",
    "saldoInteres",
    "saldoMora",
    "saldoOtros",
    "saldoSeguro",
    "segmento",
    "seguroPorVencer",
    "seguroProyectado",
    "seguroVencido",
    "seguroVigente",
    "tipoCartera",
    "tipoOperacion"
})
public class SaldosOperacion {

    @XmlElement(name = "CapitalPorVencer")
    protected BigDecimal capitalPorVencer;
    @XmlElement(name = "CapitalProyectado")
    protected BigDecimal capitalProyectado;
    @XmlElement(name = "CapitalVencido")
    protected BigDecimal capitalVencido;
    @XmlElement(name = "CapitalVigente")
    protected BigDecimal capitalVigente;
    @XmlElement(name = "Estado")
    protected Integer estado;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElement(name = "IdOperacion")
    protected Integer idOperacion;
    @XmlElement(name = "InteresPorVencer")
    protected BigDecimal interesPorVencer;
    @XmlElement(name = "InteresProyectado")
    protected BigDecimal interesProyectado;
    @XmlElement(name = "InteresVencido")
    protected BigDecimal interesVencido;
    @XmlElement(name = "InteresVigente")
    protected BigDecimal interesVigente;
    @XmlElement(name = "MoraPorVencer")
    protected BigDecimal moraPorVencer;
    @XmlElement(name = "MoraProyectado")
    protected BigDecimal moraProyectado;
    @XmlElement(name = "MoraVencido")
    protected BigDecimal moraVencido;
    @XmlElement(name = "MoraVigente")
    protected BigDecimal moraVigente;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElement(name = "OtrosPorVencer")
    protected BigDecimal otrosPorVencer;
    @XmlElement(name = "OtrosProyectado")
    protected BigDecimal otrosProyectado;
    @XmlElement(name = "OtrosVencido")
    protected BigDecimal otrosVencido;
    @XmlElement(name = "OtrosVigente")
    protected BigDecimal otrosVigente;
    @XmlElement(name = "SaldoCapital")
    protected BigDecimal saldoCapital;
    @XmlElement(name = "SaldoInteres")
    protected BigDecimal saldoInteres;
    @XmlElement(name = "SaldoMora")
    protected BigDecimal saldoMora;
    @XmlElement(name = "SaldoOtros")
    protected BigDecimal saldoOtros;
    @XmlElement(name = "SaldoSeguro")
    protected BigDecimal saldoSeguro;
    @XmlElementRef(name = "Segmento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> segmento;
    @XmlElement(name = "SeguroPorVencer")
    protected BigDecimal seguroPorVencer;
    @XmlElement(name = "SeguroProyectado")
    protected BigDecimal seguroProyectado;
    @XmlElement(name = "SeguroVencido")
    protected BigDecimal seguroVencido;
    @XmlElement(name = "SeguroVigente")
    protected BigDecimal seguroVigente;
    @XmlElementRef(name = "TipoCartera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCartera;
    @XmlElementRef(name = "TipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;

    /**
     * Obtiene el valor de la propiedad capitalPorVencer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalPorVencer() {
        return capitalPorVencer;
    }

    /**
     * Define el valor de la propiedad capitalPorVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalPorVencer(BigDecimal value) {
        this.capitalPorVencer = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalProyectado() {
        return capitalProyectado;
    }

    /**
     * Define el valor de la propiedad capitalProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalProyectado(BigDecimal value) {
        this.capitalProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalVencido() {
        return capitalVencido;
    }

    /**
     * Define el valor de la propiedad capitalVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalVencido(BigDecimal value) {
        this.capitalVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalVigente() {
        return capitalVigente;
    }

    /**
     * Define el valor de la propiedad capitalVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalVigente(BigDecimal value) {
        this.capitalVigente = value;
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
     * Obtiene el valor de la propiedad interesPorVencer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresPorVencer() {
        return interesPorVencer;
    }

    /**
     * Define el valor de la propiedad interesPorVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresPorVencer(BigDecimal value) {
        this.interesPorVencer = value;
    }

    /**
     * Obtiene el valor de la propiedad interesProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresProyectado() {
        return interesProyectado;
    }

    /**
     * Define el valor de la propiedad interesProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresProyectado(BigDecimal value) {
        this.interesProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad interesVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresVencido() {
        return interesVencido;
    }

    /**
     * Define el valor de la propiedad interesVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresVencido(BigDecimal value) {
        this.interesVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad interesVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresVigente() {
        return interesVigente;
    }

    /**
     * Define el valor de la propiedad interesVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresVigente(BigDecimal value) {
        this.interesVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad moraPorVencer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraPorVencer() {
        return moraPorVencer;
    }

    /**
     * Define el valor de la propiedad moraPorVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraPorVencer(BigDecimal value) {
        this.moraPorVencer = value;
    }

    /**
     * Obtiene el valor de la propiedad moraProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraProyectado() {
        return moraProyectado;
    }

    /**
     * Define el valor de la propiedad moraProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraProyectado(BigDecimal value) {
        this.moraProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraVencido() {
        return moraVencido;
    }

    /**
     * Define el valor de la propiedad moraVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraVencido(BigDecimal value) {
        this.moraVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad moraVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraVigente() {
        return moraVigente;
    }

    /**
     * Define el valor de la propiedad moraVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraVigente(BigDecimal value) {
        this.moraVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Define el valor de la propiedad numeroOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOperacion(JAXBElement<String> value) {
        this.numeroOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPorVencer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosPorVencer() {
        return otrosPorVencer;
    }

    /**
     * Define el valor de la propiedad otrosPorVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosPorVencer(BigDecimal value) {
        this.otrosPorVencer = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosProyectado() {
        return otrosProyectado;
    }

    /**
     * Define el valor de la propiedad otrosProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosProyectado(BigDecimal value) {
        this.otrosProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosVencido() {
        return otrosVencido;
    }

    /**
     * Define el valor de la propiedad otrosVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosVencido(BigDecimal value) {
        this.otrosVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosVigente() {
        return otrosVigente;
    }

    /**
     * Define el valor de la propiedad otrosVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosVigente(BigDecimal value) {
        this.otrosVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoCapital.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoCapital() {
        return saldoCapital;
    }

    /**
     * Define el valor de la propiedad saldoCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoCapital(BigDecimal value) {
        this.saldoCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoInteres() {
        return saldoInteres;
    }

    /**
     * Define el valor de la propiedad saldoInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoInteres(BigDecimal value) {
        this.saldoInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoMora.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoMora() {
        return saldoMora;
    }

    /**
     * Define el valor de la propiedad saldoMora.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoMora(BigDecimal value) {
        this.saldoMora = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoOtros.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoOtros() {
        return saldoOtros;
    }

    /**
     * Define el valor de la propiedad saldoOtros.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoOtros(BigDecimal value) {
        this.saldoOtros = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoSeguro.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoSeguro() {
        return saldoSeguro;
    }

    /**
     * Define el valor de la propiedad saldoSeguro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoSeguro(BigDecimal value) {
        this.saldoSeguro = value;
    }

    /**
     * Obtiene el valor de la propiedad segmento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSegmento() {
        return segmento;
    }

    /**
     * Define el valor de la propiedad segmento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSegmento(JAXBElement<String> value) {
        this.segmento = value;
    }

    /**
     * Obtiene el valor de la propiedad seguroPorVencer.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroPorVencer() {
        return seguroPorVencer;
    }

    /**
     * Define el valor de la propiedad seguroPorVencer.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroPorVencer(BigDecimal value) {
        this.seguroPorVencer = value;
    }

    /**
     * Obtiene el valor de la propiedad seguroProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroProyectado() {
        return seguroProyectado;
    }

    /**
     * Define el valor de la propiedad seguroProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroProyectado(BigDecimal value) {
        this.seguroProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad seguroVencido.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroVencido() {
        return seguroVencido;
    }

    /**
     * Define el valor de la propiedad seguroVencido.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroVencido(BigDecimal value) {
        this.seguroVencido = value;
    }

    /**
     * Obtiene el valor de la propiedad seguroVigente.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeguroVigente() {
        return seguroVigente;
    }

    /**
     * Define el valor de la propiedad seguroVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeguroVigente(BigDecimal value) {
        this.seguroVigente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCartera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCartera() {
        return tipoCartera;
    }

    /**
     * Define el valor de la propiedad tipoCartera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCartera(JAXBElement<String> value) {
        this.tipoCartera = value;
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

}
