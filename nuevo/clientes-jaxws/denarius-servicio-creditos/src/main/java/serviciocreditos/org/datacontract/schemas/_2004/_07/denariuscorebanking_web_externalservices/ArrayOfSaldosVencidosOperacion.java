
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfSaldosVencidosOperacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSaldosVencidosOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaldosVencidosOperacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}SaldosVencidosOperacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSaldosVencidosOperacion", propOrder = {
    "saldosVencidosOperacion"
})
public class ArrayOfSaldosVencidosOperacion {

    @XmlElement(name = "SaldosVencidosOperacion", nillable = true)
    protected List<SaldosVencidosOperacion> saldosVencidosOperacion;

    /**
     * Gets the value of the saldosVencidosOperacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saldosVencidosOperacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaldosVencidosOperacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaldosVencidosOperacion }
     * 
     * 
     */
    public List<SaldosVencidosOperacion> getSaldosVencidosOperacion() {
        if (saldosVencidosOperacion == null) {
            saldosVencidosOperacion = new ArrayList<SaldosVencidosOperacion>();
        }
        return this.saldosVencidosOperacion;
    }

}
