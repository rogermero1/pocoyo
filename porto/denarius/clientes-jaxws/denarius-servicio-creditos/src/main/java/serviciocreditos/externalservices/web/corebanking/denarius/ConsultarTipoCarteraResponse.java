
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCatalogos;


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
 *         &lt;element name="ConsultarTipoCarteraResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}MSCatalogos" minOccurs="0"/&gt;
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
    "consultarTipoCarteraResult"
})
@XmlRootElement(name = "ConsultarTipoCarteraResponse")
public class ConsultarTipoCarteraResponse {

    @XmlElementRef(name = "ConsultarTipoCarteraResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSCatalogos> consultarTipoCarteraResult;

    /**
     * Obtiene el valor de la propiedad consultarTipoCarteraResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     *     
     */
    public JAXBElement<MSCatalogos> getConsultarTipoCarteraResult() {
        return consultarTipoCarteraResult;
    }

    /**
     * Define el valor de la propiedad consultarTipoCarteraResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     *     
     */
    public void setConsultarTipoCarteraResult(JAXBElement<MSCatalogos> value) {
        this.consultarTipoCarteraResult = value;
    }

}
