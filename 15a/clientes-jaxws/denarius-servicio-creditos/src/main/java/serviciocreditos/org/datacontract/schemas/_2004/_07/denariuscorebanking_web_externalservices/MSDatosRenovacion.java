
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
 * <p>Clase Java para MSDatosRenovacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSDatosRenovacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MontoCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Operaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfOperacionCarteraRenovacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSDatosRenovacion", propOrder = {
    "montoCredito",
    "operaciones"
})
public class MSDatosRenovacion
    extends MensajeSalidaBase
{

    @XmlElement(name = "MontoCredito")
    protected BigDecimal montoCredito;
    @XmlElementRef(name = "Operaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOperacionCarteraRenovacion> operaciones;

    /**
     * Obtiene el valor de la propiedad montoCredito.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoCredito() {
        return montoCredito;
    }

    /**
     * Define el valor de la propiedad montoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoCredito(BigDecimal value) {
        this.montoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad operaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOperacionCarteraRenovacion> getOperaciones() {
        return operaciones;
    }

    /**
     * Define el valor de la propiedad operaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     *     
     */
    public void setOperaciones(JAXBElement<ArrayOfOperacionCarteraRenovacion> value) {
        this.operaciones = value;
    }

}
