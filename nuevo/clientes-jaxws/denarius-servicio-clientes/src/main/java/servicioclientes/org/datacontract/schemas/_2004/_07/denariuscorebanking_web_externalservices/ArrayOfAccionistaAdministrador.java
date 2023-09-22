
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfAccionistaAdministrador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAccionistaAdministrador"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccionistaAdministrador" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}AccionistaAdministrador" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAccionistaAdministrador", propOrder = {
    "accionistaAdministrador"
})
public class ArrayOfAccionistaAdministrador {

    @XmlElement(name = "AccionistaAdministrador", nillable = true)
    protected List<AccionistaAdministrador> accionistaAdministrador;

    /**
     * Gets the value of the accionistaAdministrador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accionistaAdministrador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccionistaAdministrador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccionistaAdministrador }
     * 
     * 
     */
    public List<AccionistaAdministrador> getAccionistaAdministrador() {
        if (accionistaAdministrador == null) {
            accionistaAdministrador = new ArrayList<AccionistaAdministrador>();
        }
        return this.accionistaAdministrador;
    }

}
