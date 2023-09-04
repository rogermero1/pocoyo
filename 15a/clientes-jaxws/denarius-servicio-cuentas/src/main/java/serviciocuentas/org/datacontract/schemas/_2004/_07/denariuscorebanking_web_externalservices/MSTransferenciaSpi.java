
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSTransferenciaSpi complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSTransferenciaSpi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bancos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfBanco" minOccurs="0"/&gt;
 *         &lt;element name="IdTransferenciaSpi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SaldoAGirar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoContable" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SaldoDisponible" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSTransferenciaSpi", propOrder = {
    "bancos",
    "idTransferenciaSpi",
    "saldoAGirar",
    "saldoContable",
    "saldoDisponible"
})
public class MSTransferenciaSpi
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Bancos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBanco> bancos;
    @XmlElement(name = "IdTransferenciaSpi")
    protected Integer idTransferenciaSpi;
    @XmlElement(name = "SaldoAGirar")
    protected BigDecimal saldoAGirar;
    @XmlElement(name = "SaldoContable")
    protected BigDecimal saldoContable;
    @XmlElement(name = "SaldoDisponible")
    protected BigDecimal saldoDisponible;

    /**
     * Obtiene el valor de la propiedad bancos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBanco> getBancos() {
        return bancos;
    }

    /**
     * Define el valor de la propiedad bancos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     *     
     */
    public void setBancos(JAXBElement<ArrayOfBanco> value) {
        this.bancos = value;
    }

    /**
     * Obtiene el valor de la propiedad idTransferenciaSpi.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTransferenciaSpi() {
        return idTransferenciaSpi;
    }

    /**
     * Define el valor de la propiedad idTransferenciaSpi.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTransferenciaSpi(Integer value) {
        this.idTransferenciaSpi = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoAGirar.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoAGirar() {
        return saldoAGirar;
    }

    /**
     * Define el valor de la propiedad saldoAGirar.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoAGirar(BigDecimal value) {
        this.saldoAGirar = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoContable.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoContable() {
        return saldoContable;
    }

    /**
     * Define el valor de la propiedad saldoContable.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoContable(BigDecimal value) {
        this.saldoContable = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDisponible.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDisponible() {
        return saldoDisponible;
    }

    /**
     * Define el valor de la propiedad saldoDisponible.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDisponible(BigDecimal value) {
        this.saldoDisponible = value;
    }

}
