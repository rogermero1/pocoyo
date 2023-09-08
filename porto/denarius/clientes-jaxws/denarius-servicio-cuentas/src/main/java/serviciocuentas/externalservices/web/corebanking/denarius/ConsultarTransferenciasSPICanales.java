
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaTransferenciasSPI;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="meConsultaTransferencias" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MEConsultaTransferenciasSPI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "meConsultaTransferencias"
})
@XmlRootElement(name = "ConsultarTransferenciasSPICanales")
public class ConsultarTransferenciasSPICanales {

    @XmlElementRef(name = "meConsultaTransferencias", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MEConsultaTransferenciasSPI> meConsultaTransferencias;

    /**
     * Obtiene el valor de la propiedad meConsultaTransferencias.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     *     
     */
    public JAXBElement<MEConsultaTransferenciasSPI> getMeConsultaTransferencias() {
        return meConsultaTransferencias;
    }

    /**
     * Define el valor de la propiedad meConsultaTransferencias.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     *     
     */
    public void setMeConsultaTransferencias(JAXBElement<MEConsultaTransferenciasSPI> value) {
        this.meConsultaTransferencias = value;
    }

}
