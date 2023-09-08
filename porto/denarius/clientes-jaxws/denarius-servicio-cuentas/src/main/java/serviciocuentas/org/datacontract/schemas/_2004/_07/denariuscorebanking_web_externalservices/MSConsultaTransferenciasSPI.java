
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaTransferenciasSPI complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaTransferenciasSPI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultadoTransferencias" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfDetalleSpi" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaTransferenciasSPI", propOrder = {
    "resultadoTransferencias"
})
public class MSConsultaTransferenciasSPI
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "ResultadoTransferencias", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleSpi> resultadoTransferencias;

    /**
     * Obtiene el valor de la propiedad resultadoTransferencias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleSpi> getResultadoTransferencias() {
        return resultadoTransferencias;
    }

    /**
     * Define el valor de la propiedad resultadoTransferencias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     *     
     */
    public void setResultadoTransferencias(JAXBElement<ArrayOfDetalleSpi> value) {
        this.resultadoTransferencias = value;
    }

}
