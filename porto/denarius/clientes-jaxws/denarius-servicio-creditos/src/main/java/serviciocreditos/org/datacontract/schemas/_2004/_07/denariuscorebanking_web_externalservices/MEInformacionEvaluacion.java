
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEInformacionEvaluacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEInformacionEvaluacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EvaluacionConsumo" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}EvaluacionEconomicaConsumo" minOccurs="0"/&gt;
 *         &lt;element name="EvaluacionMicro" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}EvaluacionEconomicaMicro" minOccurs="0"/&gt;
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoProceso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEInformacionEvaluacion", propOrder = {
    "evaluacionConsumo",
    "evaluacionMicro",
    "identificacion",
    "tipoProceso"
})
public class MEInformacionEvaluacion
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "EvaluacionConsumo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<EvaluacionEconomicaConsumo> evaluacionConsumo;
    @XmlElementRef(name = "EvaluacionMicro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<EvaluacionEconomicaMicro> evaluacionMicro;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacion;
    @XmlElement(name = "TipoProceso")
    protected Integer tipoProceso;

    /**
     * Obtiene el valor de la propiedad evaluacionConsumo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     *     
     */
    public JAXBElement<EvaluacionEconomicaConsumo> getEvaluacionConsumo() {
        return evaluacionConsumo;
    }

    /**
     * Define el valor de la propiedad evaluacionConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     *     
     */
    public void setEvaluacionConsumo(JAXBElement<EvaluacionEconomicaConsumo> value) {
        this.evaluacionConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad evaluacionMicro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     *     
     */
    public JAXBElement<EvaluacionEconomicaMicro> getEvaluacionMicro() {
        return evaluacionMicro;
    }

    /**
     * Define el valor de la propiedad evaluacionMicro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     *     
     */
    public void setEvaluacionMicro(JAXBElement<EvaluacionEconomicaMicro> value) {
        this.evaluacionMicro = value;
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
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoProceso(Integer value) {
        this.tipoProceso = value;
    }

}
