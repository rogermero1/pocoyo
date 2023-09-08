
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfRelacionesAsignacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRelacionesAsignacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelacionesAsignacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}RelacionesAsignacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRelacionesAsignacion", propOrder = {
    "relacionesAsignacion"
})
public class ArrayOfRelacionesAsignacion {

    @XmlElement(name = "RelacionesAsignacion", nillable = true)
    protected List<RelacionesAsignacion> relacionesAsignacion;

    /**
     * Gets the value of the relacionesAsignacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacionesAsignacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacionesAsignacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelacionesAsignacion }
     * 
     * 
     */
    public List<RelacionesAsignacion> getRelacionesAsignacion() {
        if (relacionesAsignacion == null) {
            relacionesAsignacion = new ArrayList<RelacionesAsignacion>();
        }
        return this.relacionesAsignacion;
    }

}
