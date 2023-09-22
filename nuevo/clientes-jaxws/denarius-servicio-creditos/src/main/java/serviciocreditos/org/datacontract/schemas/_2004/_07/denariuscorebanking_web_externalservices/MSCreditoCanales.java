
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSCreditoCanales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSCreditoCanales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdSolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValorCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorSegDes" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTasaEfectiva" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTasaInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ValorTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSCreditoCanales", propOrder = {
    "idSolicitud",
    "valorCredito",
    "valorSegDes",
    "valorTasaEfectiva",
    "valorTasaInteres",
    "valorTotal"
})
public class MSCreditoCanales
    extends MensajeSalidaBase
{

    @XmlElement(name = "IdSolicitud")
    protected Integer idSolicitud;
    @XmlElement(name = "ValorCredito")
    protected BigDecimal valorCredito;
    @XmlElement(name = "ValorSegDes")
    protected BigDecimal valorSegDes;
    @XmlElement(name = "ValorTasaEfectiva")
    protected BigDecimal valorTasaEfectiva;
    @XmlElement(name = "ValorTasaInteres")
    protected BigDecimal valorTasaInteres;
    @XmlElement(name = "ValorTotal")
    protected BigDecimal valorTotal;

    /**
     * Obtiene el valor de la propiedad idSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitud() {
        return idSolicitud;
    }

    /**
     * Define el valor de la propiedad idSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitud(Integer value) {
        this.idSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad valorCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    /**
     * Define el valor de la propiedad valorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorCredito(BigDecimal value) {
        this.valorCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad valorSegDes.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorSegDes() {
        return valorSegDes;
    }

    /**
     * Define el valor de la propiedad valorSegDes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorSegDes(BigDecimal value) {
        this.valorSegDes = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTasaEfectiva.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTasaEfectiva() {
        return valorTasaEfectiva;
    }

    /**
     * Define el valor de la propiedad valorTasaEfectiva.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTasaEfectiva(BigDecimal value) {
        this.valorTasaEfectiva = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTasaInteres.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTasaInteres() {
        return valorTasaInteres;
    }

    /**
     * Define el valor de la propiedad valorTasaInteres.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTasaInteres(BigDecimal value) {
        this.valorTasaInteres = value;
    }

    /**
     * Obtiene el valor de la propiedad valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define el valor de la propiedad valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

}
