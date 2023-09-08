
package servicioinversiones.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacionInversion;


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
 *         &lt;element name="meSimulacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones}MESimulacionInversion" minOccurs="0"/&gt;
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
    "meSimulacion"
})
@XmlRootElement(name = "SimularInversion")
public class SimularInversion {

    @XmlElementRef(name = "meSimulacion", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MESimulacionInversion> meSimulacion;

    /**
     * Obtiene el valor de la propiedad meSimulacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     *     
     */
    public JAXBElement<MESimulacionInversion> getMeSimulacion() {
        return meSimulacion;
    }

    /**
     * Define el valor de la propiedad meSimulacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     *     
     */
    public void setMeSimulacion(JAXBElement<MESimulacionInversion> value) {
        this.meSimulacion = value;
    }

}
