
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
 * <p>Clase Java para MEPagoSpi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEPagoSpi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoBceBancoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoTransferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreOrdenante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuentaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoIdentificacionBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEPagoSpi", propOrder = {
    "codigoBceBancoBeneficiario",
    "identificacionBeneficiario",
    "montoTransferencia",
    "nombreBeneficiario",
    "nombreOrdenante",
    "numeroCuentaBeneficiario",
    "numeroOperacion",
    "tipoCuentaBeneficiario",
    "tipoIdentificacionBeneficiario",
    "transaccion"
})
public class MEPagoSpi
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoBceBancoBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoBceBancoBeneficiario;
    @XmlElementRef(name = "IdentificacionBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionBeneficiario;
    @XmlElement(name = "MontoTransferencia")
    protected BigDecimal montoTransferencia;
    @XmlElementRef(name = "NombreBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreBeneficiario;
    @XmlElementRef(name = "NombreOrdenante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreOrdenante;
    @XmlElementRef(name = "NumeroCuentaBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuentaBeneficiario;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElementRef(name = "TipoCuentaBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaBeneficiario;
    @XmlElementRef(name = "TipoIdentificacionBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoIdentificacionBeneficiario;
    @XmlElementRef(name = "Transaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transaccion;

    /**
     * Obtiene el valor de la propiedad codigoBceBancoBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoBceBancoBeneficiario() {
        return codigoBceBancoBeneficiario;
    }

    /**
     * Define el valor de la propiedad codigoBceBancoBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoBceBancoBeneficiario(JAXBElement<String> value) {
        this.codigoBceBancoBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionBeneficiario() {
        return identificacionBeneficiario;
    }

    /**
     * Define el valor de la propiedad identificacionBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionBeneficiario(JAXBElement<String> value) {
        this.identificacionBeneficiario = value;
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
     * Obtiene el valor de la propiedad nombreBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreBeneficiario() {
        return nombreBeneficiario;
    }

    /**
     * Define el valor de la propiedad nombreBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreBeneficiario(JAXBElement<String> value) {
        this.nombreBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreOrdenante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreOrdenante() {
        return nombreOrdenante;
    }

    /**
     * Define el valor de la propiedad nombreOrdenante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreOrdenante(JAXBElement<String> value) {
        this.nombreOrdenante = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuentaBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuentaBeneficiario() {
        return numeroCuentaBeneficiario;
    }

    /**
     * Define el valor de la propiedad numeroCuentaBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuentaBeneficiario(JAXBElement<String> value) {
        this.numeroCuentaBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroOperacion() {
        return numeroOperacion;
    }

    /**
     * Define el valor de la propiedad numeroOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroOperacion(JAXBElement<String> value) {
        this.numeroOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuentaBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuentaBeneficiario() {
        return tipoCuentaBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoCuentaBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuentaBeneficiario(JAXBElement<String> value) {
        this.tipoCuentaBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIdentificacionBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoIdentificacionBeneficiario() {
        return tipoIdentificacionBeneficiario;
    }

    /**
     * Define el valor de la propiedad tipoIdentificacionBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoIdentificacionBeneficiario(JAXBElement<String> value) {
        this.tipoIdentificacionBeneficiario = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransaccion(JAXBElement<String> value) {
        this.transaccion = value;
    }

}
