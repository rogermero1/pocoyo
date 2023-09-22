
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MESimularAhorro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MESimularAhorro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="MontoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Plazo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MESimularAhorro", propOrder = {
    "fechaInicio",
    "montoMensual",
    "plazo"
})
public class MESimularAhorro
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "FechaInicio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaInicio;
    @XmlElement(name = "MontoMensual")
    protected BigDecimal montoMensual;
    @XmlElement(name = "Plazo")
    protected Short plazo;

    /**
     * Obtiene el valor de la propiedad fechaInicio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Define el valor de la propiedad fechaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaInicio(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad montoMensual.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoMensual() {
        return montoMensual;
    }

    /**
     * Define el valor de la propiedad montoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoMensual(BigDecimal value) {
        this.montoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad plazo.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPlazo() {
        return plazo;
    }

    /**
     * Define el valor de la propiedad plazo.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPlazo(Short value) {
        this.plazo = value;
    }

}
