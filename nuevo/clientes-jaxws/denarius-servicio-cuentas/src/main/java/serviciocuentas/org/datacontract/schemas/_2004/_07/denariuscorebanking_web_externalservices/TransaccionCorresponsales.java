
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransaccionCorresponsales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransaccionCorresponsales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaCorresponsal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdLogCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdLogDebito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdMoneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCorresponsal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SecuencialTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaCorresponsal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoTransaccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValorTransaccion" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransaccionCorresponsales", propOrder = {
    "cuentaCliente",
    "cuentaCorresponsal",
    "cuentaProveedor",
    "idLogCredito",
    "idLogDebito",
    "idMoneda",
    "identificacionCliente",
    "identificacionCorresponsal",
    "numeroOperacion",
    "referencia",
    "secuencialTransaccion",
    "tipoCuentaCliente",
    "tipoCuentaCorresponsal",
    "tipoTransaccion",
    "valorTransaccion"
})
public class TransaccionCorresponsales {

    @XmlElementRef(name = "CuentaCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaCliente;
    @XmlElementRef(name = "CuentaCorresponsal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaCorresponsal;
    @XmlElementRef(name = "CuentaProveedor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaProveedor;
    @XmlElementRef(name = "IdLogCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idLogCredito;
    @XmlElementRef(name = "IdLogDebito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idLogDebito;
    @XmlElement(name = "IdMoneda")
    protected Integer idMoneda;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElementRef(name = "IdentificacionCorresponsal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCorresponsal;
    @XmlElementRef(name = "NumeroOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroOperacion;
    @XmlElementRef(name = "Referencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referencia;
    @XmlElementRef(name = "SecuencialTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> secuencialTransaccion;
    @XmlElementRef(name = "TipoCuentaCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaCliente;
    @XmlElementRef(name = "TipoCuentaCorresponsal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoCuentaCorresponsal;
    @XmlElementRef(name = "TipoTransaccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoTransaccion;
    @XmlElement(name = "ValorTransaccion")
    protected BigDecimal valorTransaccion;

    /**
     * Obtiene el valor de la propiedad cuentaCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaCliente() {
        return cuentaCliente;
    }

    /**
     * Define el valor de la propiedad cuentaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaCliente(JAXBElement<String> value) {
        this.cuentaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaCorresponsal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaCorresponsal() {
        return cuentaCorresponsal;
    }

    /**
     * Define el valor de la propiedad cuentaCorresponsal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaCorresponsal(JAXBElement<String> value) {
        this.cuentaCorresponsal = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaProveedor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaProveedor() {
        return cuentaProveedor;
    }

    /**
     * Define el valor de la propiedad cuentaProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaProveedor(JAXBElement<String> value) {
        this.cuentaProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad idLogCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdLogCredito() {
        return idLogCredito;
    }

    /**
     * Define el valor de la propiedad idLogCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdLogCredito(JAXBElement<Integer> value) {
        this.idLogCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad idLogDebito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdLogDebito() {
        return idLogDebito;
    }

    /**
     * Define el valor de la propiedad idLogDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdLogDebito(JAXBElement<Integer> value) {
        this.idLogDebito = value;
    }

    /**
     * Obtiene el valor de la propiedad idMoneda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdMoneda() {
        return idMoneda;
    }

    /**
     * Define el valor de la propiedad idMoneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdMoneda(Integer value) {
        this.idMoneda = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Define el valor de la propiedad identificacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionCliente(JAXBElement<String> value) {
        this.identificacionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionCorresponsal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionCorresponsal() {
        return identificacionCorresponsal;
    }

    /**
     * Define el valor de la propiedad identificacionCorresponsal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionCorresponsal(JAXBElement<String> value) {
        this.identificacionCorresponsal = value;
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
     * Obtiene el valor de la propiedad secuencialTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecuencialTransaccion() {
        return secuencialTransaccion;
    }

    /**
     * Define el valor de la propiedad secuencialTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecuencialTransaccion(JAXBElement<String> value) {
        this.secuencialTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuentaCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuentaCliente() {
        return tipoCuentaCliente;
    }

    /**
     * Define el valor de la propiedad tipoCuentaCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuentaCliente(JAXBElement<String> value) {
        this.tipoCuentaCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuentaCorresponsal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoCuentaCorresponsal() {
        return tipoCuentaCorresponsal;
    }

    /**
     * Define el valor de la propiedad tipoCuentaCorresponsal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoCuentaCorresponsal(JAXBElement<String> value) {
        this.tipoCuentaCorresponsal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoTransaccion() {
        return tipoTransaccion;
    }

    /**
     * Define el valor de la propiedad tipoTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoTransaccion(JAXBElement<String> value) {
        this.tipoTransaccion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTransaccion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTransaccion() {
        return valorTransaccion;
    }

    /**
     * Define el valor de la propiedad valorTransaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTransaccion(BigDecimal value) {
        this.valorTransaccion = value;
    }

}
