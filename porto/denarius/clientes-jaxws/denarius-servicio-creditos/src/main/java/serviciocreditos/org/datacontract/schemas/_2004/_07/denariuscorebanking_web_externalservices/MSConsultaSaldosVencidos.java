
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaSaldosVencidos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaSaldosVencidos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaldosOperaciones" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfSaldosVencidosOperacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaSaldosVencidos", propOrder = {
    "saldosOperaciones"
})
public class MSConsultaSaldosVencidos
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "SaldosOperaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSaldosVencidosOperacion> saldosOperaciones;

    /**
     * Obtiene el valor de la propiedad saldosOperaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSaldosVencidosOperacion> getSaldosOperaciones() {
        return saldosOperaciones;
    }

    /**
     * Define el valor de la propiedad saldosOperaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     *     
     */
    public void setSaldosOperaciones(JAXBElement<ArrayOfSaldosVencidosOperacion> value) {
        this.saldosOperaciones = value;
    }

}
