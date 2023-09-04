
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para METransferenciaPagoDirecto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="METransferenciaPagoDirecto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CantonOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DireccionOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCausal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoTransferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MotivoTransferencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreInstitucion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuentaOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProvinciaOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecuencialOrigen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoIdentificacionOrdenanteBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoTransferencia" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "METransferenciaPagoDirecto", propOrder = {
    "cantonOrdenanteBeneficiario",
    "codigoInstitucion",
    "direccionOrdenanteBeneficiario",
    "idCausal",
    "identificacionOrdenanteBeneficiario",
    "montoTransferencia",
    "motivoTransferencia",
    "nombreInstitucion",
    "nombreOrdenanteBeneficiario",
    "numeroCuentaCliente",
    "numeroCuentaOrdenanteBeneficiario",
    "provinciaOrdenanteBeneficiario",
    "secuencialOrigen",
    "telefonoOrdenanteBeneficiario",
    "tipoCuentaOrdenanteBeneficiario",
    "tipoIdentificacionOrdenanteBeneficiario",
    "tipoTransferencia"
})
public class METransferenciaPagoDirecto
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CantonOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cantonOrdenanteBeneficiario;
    @XmlElementRef(name = "CodigoInstitucion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoInstitucion;
    @XmlElementRef(name = "DireccionOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccionOrdenanteBeneficiario;
    @XmlElement(name = "IdCausal")
    protected Integer idCausal;
    @XmlElementRef(name = "IdentificacionOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionOrdenanteBeneficiario;
    @XmlElement(name = "MontoTransferencia")
    protected BigDecimal montoTransferencia;
    @XmlElementRef(name = "MotivoTransferencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> motivoTransferencia;
    @XmlElementRef(name = "NombreInstitucion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreInstitucion;
    @XmlElementRef(name = "NombreOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOrdenanteBeneficiario;
    @XmlElementRef(name = "NumeroCuentaCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuentaCliente;
    @XmlElementRef(name = "NumeroCuentaOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuentaOrdenanteBeneficiario;
    @XmlElementRef(name = "ProvinciaOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provinciaOrdenanteBeneficiario;
    @XmlElement(name = "SecuencialOrigen")
    protected Integer secuencialOrigen;
    @XmlElementRef(name = "TelefonoOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoOrdenanteBeneficiario;
    @XmlElementRef(name = "TipoCuentaOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaOrdenanteBeneficiario;
    @XmlElementRef(name = "TipoIdentificacionOrdenanteBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacionOrdenanteBeneficiario;
    @XmlElement(name = "TipoTransferencia")
    protected Integer tipoTransferencia;

    /**
     * Obtiene el valor de la propiedad cantonOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCantonOrdenanteBeneficiario() {
        return cantonOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad cantonOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCantonOrdenanteBeneficiario(JAXBElement<String> value) {
        this.cantonOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoInstitucion() {
        return codigoInstitucion;
    }

    /**
     * Define el valor de la propiedad codigoInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoInstitucion(JAXBElement<String> value) {
        this.codigoInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccionOrdenanteBeneficiario() {
        return direccionOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad direccionOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccionOrdenanteBeneficiario(JAXBElement<String> value) {
        this.direccionOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad idCausal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCausal() {
        return idCausal;
    }

    /**
     * Define el valor de la propiedad idCausal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCausal(Integer value) {
        this.idCausal = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionOrdenanteBeneficiario() {
        return identificacionOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad identificacionOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionOrdenanteBeneficiario(JAXBElement<String> value) {
        this.identificacionOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad montoTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTransferencia() {
        return montoTransferencia;
    }

    /**
     * Define el valor de la propiedad montoTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTransferencia(BigDecimal value) {
        this.montoTransferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad motivoTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMotivoTransferencia() {
        return motivoTransferencia;
    }

    /**
     * Define el valor de la propiedad motivoTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMotivoTransferencia(JAXBElement<String> value) {
        this.motivoTransferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreInstitucion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreInstitucion() {
        return nombreInstitucion;
    }

    /**
     * Define el valor de la propiedad nombreInstitucion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreInstitucion(JAXBElement<String> value) {
        this.nombreInstitucion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreOrdenanteBeneficiario() {
        return nombreOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad nombreOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreOrdenanteBeneficiario(JAXBElement<String> value) {
        this.nombreOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    /**
     * Define el valor de la propiedad numeroCuentaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuentaCliente(JAXBElement<String> value) {
        this.numeroCuentaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuentaOrdenanteBeneficiario() {
        return numeroCuentaOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad numeroCuentaOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuentaOrdenanteBeneficiario(JAXBElement<String> value) {
        this.numeroCuentaOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad provinciaOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvinciaOrdenanteBeneficiario() {
        return provinciaOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad provinciaOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvinciaOrdenanteBeneficiario(JAXBElement<String> value) {
        this.provinciaOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencialOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecuencialOrigen() {
        return secuencialOrigen;
    }

    /**
     * Define el valor de la propiedad secuencialOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecuencialOrigen(Integer value) {
        this.secuencialOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoOrdenanteBeneficiario() {
        return telefonoOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad telefonoOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoOrdenanteBeneficiario(JAXBElement<String> value) {
        this.telefonoOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuentaOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuentaOrdenanteBeneficiario() {
        return tipoCuentaOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoCuentaOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuentaOrdenanteBeneficiario(JAXBElement<String> value) {
        this.tipoCuentaOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionOrdenanteBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoIdentificacionOrdenanteBeneficiario() {
        return tipoIdentificacionOrdenanteBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionOrdenanteBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoIdentificacionOrdenanteBeneficiario(JAXBElement<String> value) {
        this.tipoIdentificacionOrdenanteBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransferencia.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoTransferencia() {
        return tipoTransferencia;
    }

    /**
     * Define el valor de la propiedad tipoTransferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoTransferencia(Integer value) {
        this.tipoTransferencia = value;
    }

}
