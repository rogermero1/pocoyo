
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEDatosChequeDevolver complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEDatosChequeDevolver"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChequesDevueltos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfChequeDevuelto" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEDatosChequeDevolver", propOrder = {
    "chequesDevueltos"
})
public class MEDatosChequeDevolver
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "ChequesDevueltos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfChequeDevuelto> chequesDevueltos;

    /**
     * Obtiene el valor de la propiedad chequesDevueltos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     *     
     */
    public JAXBElement<ArrayOfChequeDevuelto> getChequesDevueltos() {
        return chequesDevueltos;
    }

    /**
     * Define el valor de la propiedad chequesDevueltos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     *     
     */
    public void setChequesDevueltos(JAXBElement<ArrayOfChequeDevuelto> value) {
        this.chequesDevueltos = value;
    }

}
