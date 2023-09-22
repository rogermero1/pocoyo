
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DetallePasivo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetallePasivo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodDestinoCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodEmisor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodInstitucion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodPlazo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DividendoMensual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Institucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoActual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoFuenteExterna" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MontoOrigen" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreFuenteExterna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObservacionesVerificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Secuencial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Verificado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetallePasivo", propOrder = {
    "codDestinoCredito",
    "codEmisor",
    "codInstitucion",
    "codPlazo",
    "dividendoMensual",
    "institucion",
    "montoActual",
    "montoFuenteExterna",
    "montoOrigen",
    "nombreFuenteExterna",
    "observaciones",
    "observacionesVerificacion",
    "secuencial",
    "tipoCredito",
    "vencimiento",
    "verificado"
})
public class DetallePasivo {

    @XmlElementRef(name = "CodDestinoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codDestinoCredito;
    @XmlElementRef(name = "CodEmisor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codEmisor;
    @XmlElementRef(name = "CodInstitucion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codInstitucion;
    @XmlElementRef(name = "CodPlazo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> codPlazo;
    @XmlElementRef(name = "DividendoMensual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dividendoMensual;
    @XmlElementRef(name = "Institucion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> institucion;
    @XmlElementRef(name = "MontoActual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montoActual;
    @XmlElement(name = "MontoFuenteExterna")
    protected BigDecimal montoFuenteExterna;
    @XmlElementRef(name = "MontoOrigen", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> montoOrigen;
    @XmlElementRef(name = "NombreFuenteExterna", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreFuenteExterna;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "ObservacionesVerificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observacionesVerificacion;
    @XmlElementRef(name = "Secuencial", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> secuencial;
    @XmlElementRef(name = "TipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCredito;
    @XmlElementRef(name = "Vencimiento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> vencimiento;
    @XmlElement(name = "Verificado")
    protected Boolean verificado;

    /**
     * Obtiene el valor de la propiedad codDestinoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodDestinoCredito() {
        return codDestinoCredito;
    }

    /**
     * Define el valor de la propiedad codDestinoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodDestinoCredito(JAXBElement<Integer> value) {
        this.codDestinoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codEmisor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodEmisor() {
        return codEmisor;
    }

    /**
     * Define el valor de la propiedad codEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodEmisor(JAXBElement<Integer> value) {
        this.codEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad codInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodInstitucion() {
        return codInstitucion;
    }

    /**
     * Define el valor de la propiedad codInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodInstitucion(JAXBElement<Integer> value) {
        this.codInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad codPlazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCodPlazo() {
        return codPlazo;
    }

    /**
     * Define el valor de la propiedad codPlazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCodPlazo(JAXBElement<Integer> value) {
        this.codPlazo = value;
    }

    /**
     * Obtiene el valor de la propiedad dividendoMensual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDividendoMensual() {
        return dividendoMensual;
    }

    /**
     * Define el valor de la propiedad dividendoMensual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDividendoMensual(JAXBElement<BigDecimal> value) {
        this.dividendoMensual = value;
    }

    /**
     * Obtiene el valor de la propiedad institucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstitucion() {
        return institucion;
    }

    /**
     * Define el valor de la propiedad institucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstitucion(JAXBElement<String> value) {
        this.institucion = value;
    }

    /**
     * Obtiene el valor de la propiedad montoActual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontoActual() {
        return montoActual;
    }

    /**
     * Define el valor de la propiedad montoActual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontoActual(JAXBElement<BigDecimal> value) {
        this.montoActual = value;
    }

    /**
     * Obtiene el valor de la propiedad montoFuenteExterna.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoFuenteExterna() {
        return montoFuenteExterna;
    }

    /**
     * Define el valor de la propiedad montoFuenteExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoFuenteExterna(BigDecimal value) {
        this.montoFuenteExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad montoOrigen.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMontoOrigen() {
        return montoOrigen;
    }

    /**
     * Define el valor de la propiedad montoOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMontoOrigen(JAXBElement<BigDecimal> value) {
        this.montoOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreFuenteExterna.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreFuenteExterna() {
        return nombreFuenteExterna;
    }

    /**
     * Define el valor de la propiedad nombreFuenteExterna.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreFuenteExterna(JAXBElement<String> value) {
        this.nombreFuenteExterna = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad observacionesVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservacionesVerificacion() {
        return observacionesVerificacion;
    }

    /**
     * Define el valor de la propiedad observacionesVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservacionesVerificacion(JAXBElement<String> value) {
        this.observacionesVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencial.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSecuencial() {
        return secuencial;
    }

    /**
     * Define el valor de la propiedad secuencial.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSecuencial(JAXBElement<Integer> value) {
        this.secuencial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define el valor de la propiedad tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCredito(JAXBElement<String> value) {
        this.tipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad vencimiento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVencimiento() {
        return vencimiento;
    }

    /**
     * Define el valor de la propiedad vencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVencimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.vencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad verificado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificado() {
        return verificado;
    }

    /**
     * Define el valor de la propiedad verificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificado(Boolean value) {
        this.verificado = value;
    }

}
