
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEMonederoElectronico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEMonederoElectronico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Monedero" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MonederoElectronico" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEMonederoElectronico", propOrder = {
    "monedero"
})
public class MEMonederoElectronico
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "Monedero", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<MonederoElectronico> monedero;

    /**
     * Obtiene el valor de la propiedad monedero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     *     
     */
    public JAXBElement<MonederoElectronico> getMonedero() {
        return monedero;
    }

    /**
     * Define el valor de la propiedad monedero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     *     
     */
    public void setMonedero(JAXBElement<MonederoElectronico> value) {
        this.monedero = value;
    }

}
