
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSDocumentosCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSDocumentosCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentosCredito" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}ArrayOfDocumento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSDocumentosCredito", propOrder = {
    "documentosCredito"
})
public class MSDocumentosCredito
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "DocumentosCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumento> documentosCredito;

    /**
     * Obtiene el valor de la propiedad documentosCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumento> getDocumentosCredito() {
        return documentosCredito;
    }

    /**
     * Define el valor de la propiedad documentosCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     *     
     */
    public void setDocumentosCredito(JAXBElement<ArrayOfDocumento> value) {
        this.documentosCredito = value;
    }

}
