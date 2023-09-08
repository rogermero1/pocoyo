
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


/**
 * <p>Clase Java para ChequeDevuelto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChequeDevuelto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoBancoCheque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDevolucion1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDevolucion2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CodigoDevolucion3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CuentaCheque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdTransaccionHost" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCheque" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroPapeleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCuentaDeposito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValorCheque" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChequeDevuelto", propOrder = {
    "codigoBancoCheque",
    "codigoDevolucion1",
    "codigoDevolucion2",
    "codigoDevolucion3",
    "cuenta",
    "cuentaCheque",
    "fecha",
    "idTransaccionHost",
    "numeroCheque",
    "numeroPapeleta",
    "tipoCuentaDeposito",
    "valorCheque"
})
public class ChequeDevuelto {

    @XmlElement(name = "CodigoBancoCheque")
    protected Integer codigoBancoCheque;
    @XmlElement(name = "CodigoDevolucion1")
    protected Integer codigoDevolucion1;
    @XmlElement(name = "CodigoDevolucion2")
    protected Integer codigoDevolucion2;
    @XmlElement(name = "CodigoDevolucion3")
    protected Integer codigoDevolucion3;
    @XmlElementRef(name = "Cuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuenta;
    @XmlElementRef(name = "CuentaCheque", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaCheque;
    @XmlElement(name = "Fecha")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "IdTransaccionHost")
    protected Integer idTransaccionHost;
    @XmlElement(name = "NumeroCheque")
    protected Integer numeroCheque;
    @XmlElementRef(name = "NumeroPapeleta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroPapeleta;
    @XmlElement(name = "TipoCuentaDeposito")
    protected Integer tipoCuentaDeposito;
    @XmlElement(name = "ValorCheque")
    protected BigDecimal valorCheque;

    /**
     * Obtiene el valor de la propiedad codigoBancoCheque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoBancoCheque() {
        return codigoBancoCheque;
    }

    /**
     * Define el valor de la propiedad codigoBancoCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoBancoCheque(Integer value) {
        this.codigoBancoCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDevolucion1.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoDevolucion1() {
        return codigoDevolucion1;
    }

    /**
     * Define el valor de la propiedad codigoDevolucion1.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoDevolucion1(Integer value) {
        this.codigoDevolucion1 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDevolucion2.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoDevolucion2() {
        return codigoDevolucion2;
    }

    /**
     * Define el valor de la propiedad codigoDevolucion2.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoDevolucion2(Integer value) {
        this.codigoDevolucion2 = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoDevolucion3.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoDevolucion3() {
        return codigoDevolucion3;
    }

    /**
     * Define el valor de la propiedad codigoDevolucion3.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoDevolucion3(Integer value) {
        this.codigoDevolucion3 = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuenta(JAXBElement<String> value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad cuentaCheque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaCheque() {
        return cuentaCheque;
    }

    /**
     * Define el valor de la propiedad cuentaCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaCheque(JAXBElement<String> value) {
        this.cuentaCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransaccionHost.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTransaccionHost() {
        return idTransaccionHost;
    }

    /**
     * Define el valor de la propiedad idTransaccionHost.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTransaccionHost(Integer value) {
        this.idTransaccionHost = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCheque.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCheque() {
        return numeroCheque;
    }

    /**
     * Define el valor de la propiedad numeroCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCheque(Integer value) {
        this.numeroCheque = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPapeleta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroPapeleta() {
        return numeroPapeleta;
    }

    /**
     * Define el valor de la propiedad numeroPapeleta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroPapeleta(JAXBElement<String> value) {
        this.numeroPapeleta = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCuentaDeposito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCuentaDeposito() {
        return tipoCuentaDeposito;
    }

    /**
     * Define el valor de la propiedad tipoCuentaDeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCuentaDeposito(Integer value) {
        this.tipoCuentaDeposito = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCheque.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCheque() {
        return valorCheque;
    }

    /**
     * Define el valor de la propiedad valorCheque.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCheque(BigDecimal value) {
        this.valorCheque = value;
    }

}
