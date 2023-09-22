
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosRenovacion;


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
 *         &lt;element name="BuscarDatosRenovacionResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}MSDatosRenovacion" minOccurs="0"/&gt;
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
    "buscarDatosRenovacionResult"
})
@XmlRootElement(name = "BuscarDatosRenovacionResponse")
public class BuscarDatosRenovacionResponse {

    @XmlElementRef(name = "BuscarDatosRenovacionResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSDatosRenovacion> buscarDatosRenovacionResult;

    /**
     * Obtiene el valor de la propiedad buscarDatosRenovacionResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     *     
     */
    public JAXBElement<MSDatosRenovacion> getBuscarDatosRenovacionResult() {
        return buscarDatosRenovacionResult;
    }

    /**
     * Define el valor de la propiedad buscarDatosRenovacionResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     *     
     */
    public void setBuscarDatosRenovacionResult(JAXBElement<MSDatosRenovacion> value) {
        this.buscarDatosRenovacionResult = value;
    }

}
