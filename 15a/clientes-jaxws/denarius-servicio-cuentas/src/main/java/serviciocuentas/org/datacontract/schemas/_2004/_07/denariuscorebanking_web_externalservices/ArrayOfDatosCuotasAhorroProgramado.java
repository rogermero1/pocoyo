
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDatosCuotasAhorroProgramado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDatosCuotasAhorroProgramado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosCuotasAhorroProgramado" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosCuotasAhorroProgramado" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDatosCuotasAhorroProgramado", propOrder = {
    "datosCuotasAhorroProgramado"
})
public class ArrayOfDatosCuotasAhorroProgramado {

    @XmlElement(name = "DatosCuotasAhorroProgramado", nillable = true)
    protected List<DatosCuotasAhorroProgramado> datosCuotasAhorroProgramado;

    /**
     * Gets the value of the datosCuotasAhorroProgramado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datosCuotasAhorroProgramado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatosCuotasAhorroProgramado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosCuotasAhorroProgramado }
     * 
     * 
     */
    public List<DatosCuotasAhorroProgramado> getDatosCuotasAhorroProgramado() {
        if (datosCuotasAhorroProgramado == null) {
            datosCuotasAhorroProgramado = new ArrayList<DatosCuotasAhorroProgramado>();
        }
        return this.datosCuotasAhorroProgramado;
    }

}
