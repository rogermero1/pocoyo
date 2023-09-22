
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para PagoPeriodico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PagoPeriodico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FechaFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="InteresAcumulado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Irf" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Nro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagoPeriodico", propOrder = {
    "dias",
    "fechaFinal",
    "fechaInicial",
    "interesAcumulado",
    "irf",
    "nro",
    "valor"
})
public class PagoPeriodico {

    @XmlElement(name = "Dias")
    protected Integer dias;
    @XmlElement(name = "FechaFinal")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinal;
    @XmlElement(name = "FechaInicial")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInicial;
    @XmlElement(name = "InteresAcumulado")
    protected BigDecimal interesAcumulado;
    @XmlElement(name = "Irf")
    protected BigDecimal irf;
    @XmlElement(name = "Nro")
    protected Integer nro;
    @XmlElement(name = "Valor")
    protected BigDecimal valor;

    /**
     * Obtiene el valor de la propiedad dias.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDias() {
        return dias;
    }

    /**
     * Define el valor de la propiedad dias.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDias(Integer value) {
        this.dias = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Define el valor de la propiedad fechaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinal(XMLGregorianCalendar value) {
        this.fechaFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicial() {
        return fechaInicial;
    }

    /**
     * Define el valor de la propiedad fechaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicial(XMLGregorianCalendar value) {
        this.fechaInicial = value;
    }

    /**
     * Obtiene el valor de la propiedad interesAcumulado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresAcumulado() {
        return interesAcumulado;
    }

    /**
     * Define el valor de la propiedad interesAcumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresAcumulado(BigDecimal value) {
        this.interesAcumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad irf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIrf() {
        return irf;
    }

    /**
     * Define el valor de la propiedad irf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIrf(BigDecimal value) {
        this.irf = value;
    }

    /**
     * Obtiene el valor de la propiedad nro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNro() {
        return nro;
    }

    /**
     * Define el valor de la propiedad nro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNro(Integer value) {
        this.nro = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
