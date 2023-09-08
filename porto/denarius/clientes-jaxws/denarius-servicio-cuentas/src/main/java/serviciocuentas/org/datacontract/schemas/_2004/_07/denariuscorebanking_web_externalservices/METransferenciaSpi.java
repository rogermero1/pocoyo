
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
 * <p>Clase Java para METransferenciaSpi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="METransferenciaSpi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoBceBancoBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Instrucciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MontoTransferencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="NombreBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCausal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuentaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuentaOrdenante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaBeneficiario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "METransferenciaSpi", propOrder = {
    "codigoBceBancoBeneficiario",
    "identificacionBeneficiario",
    "instrucciones",
    "montoTransferencia",
    "nombreBeneficiario",
    "numeroCausal",
    "numeroCuentaBeneficiario",
    "numeroCuentaOrdenante",
    "referencia",
    "referencia2",
    "tipoCuentaBeneficiario"
})
public class METransferenciaSpi
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoBceBancoBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoBceBancoBeneficiario;
    @XmlElementRef(name = "IdentificacionBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionBeneficiario;
    @XmlElementRef(name = "Instrucciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instrucciones;
    @XmlElement(name = "MontoTransferencia")
    protected BigDecimal montoTransferencia;
    @XmlElementRef(name = "NombreBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreBeneficiario;
    @XmlElementRef(name = "NumeroCausal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numeroCausal;
    @XmlElementRef(name = "NumeroCuentaBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuentaBeneficiario;
    @XmlElementRef(name = "NumeroCuentaOrdenante", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuentaOrdenante;
    @XmlElementRef(name = "Referencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "Referencia2", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia2;
    @XmlElementRef(name = "TipoCuentaBeneficiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaBeneficiario;

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
     * Obtiene el valor de la propiedad instrucciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstrucciones() {
        return instrucciones;
    }

    /**
     * Define el valor de la propiedad instrucciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstrucciones(JAXBElement<String> value) {
        this.instrucciones = value;
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
     * Obtiene el valor de la propiedad numeroCausal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumeroCausal() {
        return numeroCausal;
    }

    /**
     * Define el valor de la propiedad numeroCausal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumeroCausal(JAXBElement<Integer> value) {
        this.numeroCausal = value;
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
     * Obtiene el valor de la propiedad numeroCuentaOrdenante.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuentaOrdenante() {
        return numeroCuentaOrdenante;
    }

    /**
     * Define el valor de la propiedad numeroCuentaOrdenante.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuentaOrdenante(JAXBElement<String> value) {
        this.numeroCuentaOrdenante = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia() {
        return referencia;
    }

    /**
     * Define el valor de la propiedad referencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia(JAXBElement<String> value) {
        this.referencia = value;
    }

    /**
     * Obtiene el valor de la propiedad referencia2.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferencia2() {
        return referencia2;
    }

    /**
     * Define el valor de la propiedad referencia2.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferencia2(JAXBElement<String> value) {
        this.referencia2 = value;
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

}
