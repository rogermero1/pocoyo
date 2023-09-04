
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfManoObraMicroempresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfManoObraMicroempresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManoObraMicroempresa" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ManoObraMicroempresa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfManoObraMicroempresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", propOrder = {
    "manoObraMicroempresa"
})
public class ArrayOfManoObraMicroempresa {

    @XmlElement(name = "ManoObraMicroempresa", nillable = true)
    protected List<ManoObraMicroempresa> manoObraMicroempresa;

    /**
     * Gets the value of the manoObraMicroempresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manoObraMicroempresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManoObraMicroempresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManoObraMicroempresa }
     * 
     * 
     */
    public List<ManoObraMicroempresa> getManoObraMicroempresa() {
        if (manoObraMicroempresa == null) {
            manoObraMicroempresa = new ArrayList<ManoObraMicroempresa>();
        }
        return this.manoObraMicroempresa;
    }

}
