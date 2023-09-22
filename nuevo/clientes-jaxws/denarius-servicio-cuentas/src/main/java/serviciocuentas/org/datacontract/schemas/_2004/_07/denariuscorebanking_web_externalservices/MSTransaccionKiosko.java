
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSTransaccionKiosko complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSTransaccionKiosko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaHoraFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaHoraInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdDatosOrigenFondos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSTransaccionKiosko", propOrder = {
    "fechaHoraFin",
    "fechaHoraInicio",
    "idDatosOrigenFondos"
})
public class MSTransaccionKiosko
    extends MensajeSalidaBase
{

    @XmlElement(name = "FechaHoraFin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraFin;
    @XmlElement(name = "FechaHoraInicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraInicio;
    @XmlElement(name = "IdDatosOrigenFondos")
    protected Integer idDatosOrigenFondos;

    /**
     * Obtiene el valor de la propiedad fechaHoraFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraFin() {
        return fechaHoraFin;
    }

    /**
     * Define el valor de la propiedad fechaHoraFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraFin(XMLGregorianCalendar value) {
        this.fechaHoraFin = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHoraInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    /**
     * Define el valor de la propiedad fechaHoraInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraInicio(XMLGregorianCalendar value) {
        this.fechaHoraInicio = value;
    }

    /**
     * Obtiene el valor de la propiedad idDatosOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDatosOrigenFondos() {
        return idDatosOrigenFondos;
    }

    /**
     * Define el valor de la propiedad idDatosOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDatosOrigenFondos(Integer value) {
        this.idDatosOrigenFondos = value;
    }

}
