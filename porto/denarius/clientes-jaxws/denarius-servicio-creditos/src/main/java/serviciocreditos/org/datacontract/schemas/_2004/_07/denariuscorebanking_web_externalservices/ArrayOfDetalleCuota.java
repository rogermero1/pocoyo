
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDetalleCuota complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDetalleCuota"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DetalleCuota" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}DetalleCuota" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDetalleCuota", propOrder = {
    "detalleCuota"
})
public class ArrayOfDetalleCuota {

    @XmlElement(name = "DetalleCuota", nillable = true)
    protected List<DetalleCuota> detalleCuota;

    /**
     * Gets the value of the detalleCuota property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalleCuota property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalleCuota().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleCuota }
     * 
     * 
     */
    public List<DetalleCuota> getDetalleCuota() {
        if (detalleCuota == null) {
            detalleCuota = new ArrayList<DetalleCuota>();
        }
        return this.detalleCuota;
    }

}
