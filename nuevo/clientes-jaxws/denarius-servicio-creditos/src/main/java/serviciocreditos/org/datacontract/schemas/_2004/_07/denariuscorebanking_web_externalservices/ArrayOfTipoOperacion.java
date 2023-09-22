
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfTipoOperacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipoOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoOperacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}TipoOperacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipoOperacion", propOrder = {
    "tipoOperacion"
})
public class ArrayOfTipoOperacion {

    @XmlElement(name = "TipoOperacion", nillable = true)
    protected List<TipoOperacion> tipoOperacion;

    /**
     * Gets the value of the tipoOperacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoOperacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoOperacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoOperacion }
     * 
     * 
     */
    public List<TipoOperacion> getTipoOperacion() {
        if (tipoOperacion == null) {
            tipoOperacion = new ArrayList<TipoOperacion>();
        }
        return this.tipoOperacion;
    }

}
