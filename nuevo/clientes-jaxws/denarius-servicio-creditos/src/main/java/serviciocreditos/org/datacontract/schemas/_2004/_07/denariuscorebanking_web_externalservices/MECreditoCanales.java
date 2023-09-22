
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
 * <p>Clase Java para MECreditoCanales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECreditoCanales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditoPreferencial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NoResidente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ServicioAsistencias" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TerminalAutoservicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalActivos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECreditoCanales", propOrder = {
    "codigoTipoOperacion",
    "creditoPreferencial",
    "identificacionCliente",
    "monto",
    "noResidente",
    "plazo",
    "servicioAsistencias",
    "terminalAutoservicio",
    "totalActivos"
})
public class MECreditoCanales
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoOperacion;
    @XmlElement(name = "CreditoPreferencial")
    protected Boolean creditoPreferencial;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElement(name = "NoResidente")
    protected Boolean noResidente;
    @XmlElement(name = "Plazo")
    protected Integer plazo;
    @XmlElementRef(name = "ServicioAsistencias", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> servicioAsistencias;
    @XmlElementRef(name = "TerminalAutoservicio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> terminalAutoservicio;
    @XmlElement(name = "TotalActivos")
    protected BigDecimal totalActivos;

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
     * Obtiene el valor de la propiedad creditoPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreditoPreferencial() {
        return creditoPreferencial;
    }

    /**
     * Define el valor de la propiedad creditoPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreditoPreferencial(Boolean value) {
        this.creditoPreferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Define el valor de la propiedad identificacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionCliente(JAXBElement<String> value) {
        this.identificacionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad monto.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * Define el valor de la propiedad monto.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMonto(BigDecimal value) {
        this.monto = value;
    }

    /**
     * Obtiene el valor de la propiedad noResidente.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoResidente() {
        return noResidente;
    }

    /**
     * Define el valor de la propiedad noResidente.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoResidente(Boolean value) {
        this.noResidente = value;
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
     * Obtiene el valor de la propiedad servicioAsistencias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getServicioAsistencias() {
        return servicioAsistencias;
    }

    /**
     * Define el valor de la propiedad servicioAsistencias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setServicioAsistencias(JAXBElement<Boolean> value) {
        this.servicioAsistencias = value;
    }

    /**
     * Obtiene el valor de la propiedad terminalAutoservicio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTerminalAutoservicio() {
        return terminalAutoservicio;
    }

    /**
     * Define el valor de la propiedad terminalAutoservicio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTerminalAutoservicio(JAXBElement<String> value) {
        this.terminalAutoservicio = value;
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

}
