
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

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSSimularAhorro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSSimularAhorro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaExpiracion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Interes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Resultados" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfRespuestaSimulacion" minOccurs="0"/&gt;
 *         &lt;element name="TasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="TotalCuotas" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSSimularAhorro", propOrder = {
    "fechaExpiracion",
    "interes",
    "resultados",
    "tasaInteres",
    "total",
    "totalCuotas"
})
public class MSSimularAhorro
    extends MensajeSalidaBase
{

    @XmlElement(name = "FechaExpiracion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExpiracion;
    @XmlElement(name = "Interes")
    protected BigDecimal interes;
    @XmlElementRef(name = "Resultados", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRespuestaSimulacion> resultados;
    @XmlElement(name = "TasaInteres")
    protected BigDecimal tasaInteres;
    @XmlElement(name = "Total")
    protected BigDecimal total;
    @XmlElement(name = "TotalCuotas")
    protected BigDecimal totalCuotas;

    /**
     * Obtiene el valor de la propiedad fechaExpiracion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaExpiracion() {
        return fechaExpiracion;
    }

    /**
     * Define el valor de la propiedad fechaExpiracion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaExpiracion(XMLGregorianCalendar value) {
        this.fechaExpiracion = value;
    }

    /**
     * Obtiene el valor de la propiedad interes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteres() {
        return interes;
    }

    /**
     * Define el valor de la propiedad interes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteres(BigDecimal value) {
        this.interes = value;
    }

    /**
     * Obtiene el valor de la propiedad resultados.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRespuestaSimulacion> getResultados() {
        return resultados;
    }

    /**
     * Define el valor de la propiedad resultados.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     *     
     */
    public void setResultados(JAXBElement<ArrayOfRespuestaSimulacion> value) {
        this.resultados = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Define el valor de la propiedad tasaInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasaInteres(BigDecimal value) {
        this.tasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

    /**
     * Obtiene el valor de la propiedad totalCuotas.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCuotas() {
        return totalCuotas;
    }

    /**
     * Define el valor de la propiedad totalCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCuotas(BigDecimal value) {
        this.totalCuotas = value;
    }

}
