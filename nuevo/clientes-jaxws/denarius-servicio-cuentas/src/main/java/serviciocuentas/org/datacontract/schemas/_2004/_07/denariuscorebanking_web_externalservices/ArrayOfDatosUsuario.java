
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosUsuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosUsuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosUsuario" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosUsuario" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosUsuario", propOrder = {
    "datosUsuario"
})
public class ArrayOfDatosUsuario {

    @XmlElement(name = "DatosUsuario", nillable = true)
    protected List<DatosUsuario> datosUsuario;

    /**
     * Gets the value of the datosUsuario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosUsuario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosUsuario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosUsuario }
     * 
     * 
     */
    public List<DatosUsuario> getDatosUsuario() {
        if (datosUsuario == null) {
            datosUsuario = new ArrayList<DatosUsuario>();
        }
        return this.datosUsuario;
    }

}
