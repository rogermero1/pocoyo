
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
 * <p>Clase Java para MECompensacionTarjetaDebito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECompensacionTarjetaDebito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaTransaccion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificadorAdquiriente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificadorEmisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MonedaLiq" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoLiq" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MotivoReverso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECompensacionTarjetaDebito", propOrder = {
    "fechaTransaccion",
    "identificador",
    "identificadorAdquiriente",
    "identificadorEmisor",
    "moneda",
    "monedaLiq",
    "monto",
    "montoLiq",
    "motivoReverso",
    "origen"
})
public class MECompensacionTarjetaDebito
    extends MensajeEntradaBase
{

    @XmlElement(name = "FechaTransaccion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTransaccion;
    @XmlElementRef(name = "Identificador", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificador;
    @XmlElementRef(name = "IdentificadorAdquiriente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificadorAdquiriente;
    @XmlElementRef(name = "IdentificadorEmisor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificadorEmisor;
    @XmlElement(name = "Moneda")
    protected Integer moneda;
    @XmlElement(name = "MonedaLiq")
    protected Integer monedaLiq;
    @XmlElement(name = "Monto")
    protected BigDecimal monto;
    @XmlElement(name = "MontoLiq")
    protected BigDecimal montoLiq;
    @XmlElement(name = "MotivoReverso")
    protected Integer motivoReverso;
    @XmlElementRef(name = "Origen", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origen;

    /**
     * Obtiene el valor de la propiedad fechaTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTransaccion() {
        return fechaTransaccion;
    }

    /**
     * Define el valor de la propiedad fechaTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTransaccion(XMLGregorianCalendar value) {
        this.fechaTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificador() {
        return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificador(JAXBElement<String> value) {
        this.identificador = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorAdquiriente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificadorAdquiriente() {
        return identificadorAdquiriente;
    }

    /**
     * Define el valor de la propiedad identificadorAdquiriente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificadorAdquiriente(JAXBElement<String> value) {
        this.identificadorAdquiriente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorEmisor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificadorEmisor() {
        return identificadorEmisor;
    }

    /**
     * Define el valor de la propiedad identificadorEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificadorEmisor(JAXBElement<String> value) {
        this.identificadorEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneda(Integer value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad monedaLiq.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonedaLiq() {
        return monedaLiq;
    }

    /**
     * Define el valor de la propiedad monedaLiq.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonedaLiq(Integer value) {
        this.monedaLiq = value;
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
     * Obtiene el valor de la propiedad montoLiq.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoLiq() {
        return montoLiq;
    }

    /**
     * Define el valor de la propiedad montoLiq.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoLiq(BigDecimal value) {
        this.montoLiq = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoReverso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMotivoReverso() {
        return motivoReverso;
    }

    /**
     * Define el valor de la propiedad motivoReverso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMotivoReverso(Integer value) {
        this.motivoReverso = value;
    }

    /**
     * Obtiene el valor de la propiedad origen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigen() {
        return origen;
    }

    /**
     * Define el valor de la propiedad origen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigen(JAXBElement<String> value) {
        this.origen = value;
    }

}
