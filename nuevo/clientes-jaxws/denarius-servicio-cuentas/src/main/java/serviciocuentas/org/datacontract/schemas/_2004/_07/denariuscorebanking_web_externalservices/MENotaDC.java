
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MENotaDC complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MENotaDC"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Causal" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="FechaProceso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdOficina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTransaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoAjuste" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MENotaDC", propOrder = {
    "causal",
    "fechaProceso",
    "idOficina",
    "idTransaccion",
    "monto",
    "numeroCuenta",
    "referencia",
    "referencia2",
    "tipoAjuste"
})
public class MENotaDC
    extends MensajeEntradaBase
{

    @XmlElement(name = "Causal")
    protected Short causal;
    @XmlElement(name = "FechaProceso")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaProceso;
    @XmlElement(name = "IdOficina")
    protected Integer idOficina;
    @XmlElement(name = "IdTransaccion")
    protected Integer idTransaccion;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;
    @XmlElementRef(name = "Referencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "Referencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia2;
    @XmlElementRef(name = "TipoAjuste", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoAjuste;

    /**
     * Obtiene el valor de la propiedad causal.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCausal() {
        return causal;
    }

    /**
     * Define el valor de la propiedad causal.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCausal(Short value) {
        this.causal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProceso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaProceso() {
        return fechaProceso;
    }

    /**
     * Define el valor de la propiedad fechaProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaProceso(XMLGregorianCalendar value) {
        this.fechaProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad idOficina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOficina() {
        return idOficina;
    }

    /**
     * Define el valor de la propiedad idOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOficina(Integer value) {
        this.idOficina = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    /**
     * Define el valor de la propiedad idTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTransaccion(Integer value) {
        this.idTransaccion = value;
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
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuenta(JAXBElement<String> value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia(JAXBElement<String> value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia2() {
        return referencia2;
    }

    /**
     * Define el valor de la propiedad referencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia2(JAXBElement<String> value) {
        this.referencia2 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAjuste.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoAjuste() {
        return tipoAjuste;
    }

    /**
     * Define el valor de la propiedad tipoAjuste.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoAjuste(JAXBElement<String> value) {
        this.tipoAjuste = value;
    }

}
