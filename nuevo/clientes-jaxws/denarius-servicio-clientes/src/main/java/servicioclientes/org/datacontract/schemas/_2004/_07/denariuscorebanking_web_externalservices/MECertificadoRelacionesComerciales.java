
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MECertificadoRelacionesComerciales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECertificadoRelacionesComerciales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FechaGenerado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GeneradoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdNumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdVerificacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECertificadoRelacionesComerciales", propOrder = {
    "fechaGenerado",
    "generadoOficina",
    "idCliente",
    "idNumeroCuenta",
    "idVerificacion",
    "numeroCuenta"
})
public class MECertificadoRelacionesComerciales
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "FechaGenerado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fechaGenerado;
    @XmlElementRef(name = "GeneradoOficina", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> generadoOficina;
    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElementRef(name = "IdNumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idNumeroCuenta;
    @XmlElement(name = "IdVerificacion")
    protected Integer idVerificacion;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;

    /**
     * Obtiene el valor de la propiedad fechaGenerado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFechaGenerado() {
        return fechaGenerado;
    }

    /**
     * Define el valor de la propiedad fechaGenerado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFechaGenerado(JAXBElement<String> value) {
        this.fechaGenerado = value;
    }

    /**
     * Obtiene el valor de la propiedad generadoOficina.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGeneradoOficina() {
        return generadoOficina;
    }

    /**
     * Define el valor de la propiedad generadoOficina.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGeneradoOficina(JAXBElement<String> value) {
        this.generadoOficina = value;
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
     * Obtiene el valor de la propiedad idNumeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdNumeroCuenta() {
        return idNumeroCuenta;
    }

    /**
     * Define el valor de la propiedad idNumeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdNumeroCuenta(JAXBElement<Integer> value) {
        this.idNumeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad idVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdVerificacion() {
        return idVerificacion;
    }

    /**
     * Define el valor de la propiedad idVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdVerificacion(Integer value) {
        this.idVerificacion = value;
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

}
