
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSSimulacionPagoCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSSimulacionPagoCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CapitalPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="CapitalProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Credito" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}TramiteCredito" minOccurs="0"/&gt;
 *         &lt;element name="Cuotas" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfCuota" minOccurs="0"/&gt;
 *         &lt;element name="InteresPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="InteresProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="MoraProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="OtrosProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SegDesPagado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="SegDesProyectado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSSimulacionPagoCredito", propOrder = {
    "capitalPagado",
    "capitalProyectado",
    "credito",
    "cuotas",
    "interesPagado",
    "interesProyectado",
    "moraPagado",
    "moraProyectado",
    "otrosPagado",
    "otrosProyectado",
    "segDesPagado",
    "segDesProyectado"
})
public class MSSimulacionPagoCredito
    extends MensajeSalidaBase
{

    @XmlElement(name = "CapitalPagado")
    protected BigDecimal capitalPagado;
    @XmlElement(name = "CapitalProyectado")
    protected BigDecimal capitalProyectado;
    @XmlElementRef(name = "Credito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<TramiteCredito> credito;
    @XmlElementRef(name = "Cuotas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCuota> cuotas;
    @XmlElement(name = "InteresPagado")
    protected BigDecimal interesPagado;
    @XmlElement(name = "InteresProyectado")
    protected BigDecimal interesProyectado;
    @XmlElement(name = "MoraPagado")
    protected BigDecimal moraPagado;
    @XmlElement(name = "MoraProyectado")
    protected BigDecimal moraProyectado;
    @XmlElement(name = "OtrosPagado")
    protected BigDecimal otrosPagado;
    @XmlElement(name = "OtrosProyectado")
    protected BigDecimal otrosProyectado;
    @XmlElement(name = "SegDesPagado")
    protected BigDecimal segDesPagado;
    @XmlElement(name = "SegDesProyectado")
    protected BigDecimal segDesProyectado;

    /**
     * Obtiene el valor de la propiedad capitalPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalPagado() {
        return capitalPagado;
    }

    /**
     * Define el valor de la propiedad capitalPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalPagado(BigDecimal value) {
        this.capitalPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad capitalProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCapitalProyectado() {
        return capitalProyectado;
    }

    /**
     * Define el valor de la propiedad capitalProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCapitalProyectado(BigDecimal value) {
        this.capitalProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad credito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     *     
     */
    public JAXBElement<TramiteCredito> getCredito() {
        return credito;
    }

    /**
     * Define el valor de la propiedad credito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     *     
     */
    public void setCredito(JAXBElement<TramiteCredito> value) {
        this.credito = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCuota> getCuotas() {
        return cuotas;
    }

    /**
     * Define el valor de la propiedad cuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     *     
     */
    public void setCuotas(JAXBElement<ArrayOfCuota> value) {
        this.cuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad interesPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresPagado() {
        return interesPagado;
    }

    /**
     * Define el valor de la propiedad interesPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresPagado(BigDecimal value) {
        this.interesPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad interesProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInteresProyectado() {
        return interesProyectado;
    }

    /**
     * Define el valor de la propiedad interesProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInteresProyectado(BigDecimal value) {
        this.interesProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraPagado() {
        return moraPagado;
    }

    /**
     * Define el valor de la propiedad moraPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraPagado(BigDecimal value) {
        this.moraPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad moraProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoraProyectado() {
        return moraProyectado;
    }

    /**
     * Define el valor de la propiedad moraProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoraProyectado(BigDecimal value) {
        this.moraProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosPagado() {
        return otrosPagado;
    }

    /**
     * Define el valor de la propiedad otrosPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosPagado(BigDecimal value) {
        this.otrosPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad otrosProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOtrosProyectado() {
        return otrosProyectado;
    }

    /**
     * Define el valor de la propiedad otrosProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOtrosProyectado(BigDecimal value) {
        this.otrosProyectado = value;
    }

    /**
     * Obtiene el valor de la propiedad segDesPagado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegDesPagado() {
        return segDesPagado;
    }

    /**
     * Define el valor de la propiedad segDesPagado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegDesPagado(BigDecimal value) {
        this.segDesPagado = value;
    }

    /**
     * Obtiene el valor de la propiedad segDesProyectado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSegDesProyectado() {
        return segDesProyectado;
    }

    /**
     * Define el valor de la propiedad segDesProyectado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSegDesProyectado(BigDecimal value) {
        this.segDesProyectado = value;
    }

}
