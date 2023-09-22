
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEAccionistaAdministrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEAccionistaAdministrador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdministradorAccionista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cargo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdAccionistaAdministrador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionJuridico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PorcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEAccionistaAdministrador", propOrder = {
    "administradorAccionista",
    "cargo",
    "idAccionistaAdministrador",
    "identificacion",
    "identificacionJuridico",
    "porcentajeParticipacion"
})
public class MEAccionistaAdministrador
    extends MensajeEntradaBase
{

    @XmlElement(name = "AdministradorAccionista")
    protected Integer administradorAccionista;
    @XmlElementRef(name = "Cargo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cargo;
    @XmlElement(name = "IdAccionistaAdministrador")
    protected Integer idAccionistaAdministrador;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElementRef(name = "IdentificacionJuridico", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionJuridico;
    @XmlElement(name = "PorcentajeParticipacion")
    protected BigDecimal porcentajeParticipacion;

    /**
     * Obtiene el valor de la propiedad administradorAccionista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdministradorAccionista() {
        return administradorAccionista;
    }

    /**
     * Define el valor de la propiedad administradorAccionista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdministradorAccionista(Integer value) {
        this.administradorAccionista = value;
    }

    /**
     * Obtiene el valor de la propiedad cargo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCargo() {
        return cargo;
    }

    /**
     * Define el valor de la propiedad cargo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCargo(JAXBElement<String> value) {
        this.cargo = value;
    }

    /**
     * Obtiene el valor de la propiedad idAccionistaAdministrador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdAccionistaAdministrador() {
        return idAccionistaAdministrador;
    }

    /**
     * Define el valor de la propiedad idAccionistaAdministrador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdAccionistaAdministrador(Integer value) {
        this.idAccionistaAdministrador = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacion(JAXBElement<String> value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionJuridico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionJuridico() {
        return identificacionJuridico;
    }

    /**
     * Define el valor de la propiedad identificacionJuridico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionJuridico(JAXBElement<String> value) {
        this.identificacionJuridico = value;
    }

    /**
     * Obtiene el valor de la propiedad porcentajeParticipacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Define el valor de la propiedad porcentajeParticipacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeParticipacion(BigDecimal value) {
        this.porcentajeParticipacion = value;
    }

}
