
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransferenciaMonederoElectronico;


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
 *         &lt;element name="CompensarTransferenciaMonederoElectronicoResult" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}MSTransferenciaMonederoElectronico" minOccurs="0"/&gt;
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
    "compensarTransferenciaMonederoElectronicoResult"
})
@XmlRootElement(name = "CompensarTransferenciaMonederoElectronicoResponse")
public class CompensarTransferenciaMonederoElectronicoResponse {

    @XmlElementRef(name = "CompensarTransferenciaMonederoElectronicoResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<MSTransferenciaMonederoElectronico> compensarTransferenciaMonederoElectronicoResult;

    /**
     * Obtiene el valor de la propiedad compensarTransferenciaMonederoElectronicoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     *     
     */
    public JAXBElement<MSTransferenciaMonederoElectronico> getCompensarTransferenciaMonederoElectronicoResult() {
        return compensarTransferenciaMonederoElectronicoResult;
    }

    /**
     * Define el valor de la propiedad compensarTransferenciaMonederoElectronicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     *     
     */
    public void setCompensarTransferenciaMonederoElectronicoResult(JAXBElement<MSTransferenciaMonederoElectronico> value) {
        this.compensarTransferenciaMonederoElectronicoResult = value;
    }

}
