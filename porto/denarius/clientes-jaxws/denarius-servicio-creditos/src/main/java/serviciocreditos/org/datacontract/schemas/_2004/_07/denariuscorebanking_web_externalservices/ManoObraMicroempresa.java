
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ManoObraMicroempresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ManoObraMicroempresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmpleoFijo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NumeroEmpleados" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sueldo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManoObraMicroempresa", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", propOrder = {
    "empleoFijo",
    "numeroEmpleados",
    "sueldo"
})
public class ManoObraMicroempresa {

    @XmlElement(name = "EmpleoFijo")
    protected Boolean empleoFijo;
    @XmlElement(name = "NumeroEmpleados")
    protected Integer numeroEmpleados;
    @XmlElement(name = "Sueldo")
    protected BigDecimal sueldo;

    /**
     * Obtiene el valor de la propiedad empleoFijo.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmpleoFijo() {
        return empleoFijo;
    }

    /**
     * Define el valor de la propiedad empleoFijo.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmpleoFijo(Boolean value) {
        this.empleoFijo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEmpleados.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroEmpleados() {
        return numeroEmpleados;
    }

    /**
     * Define el valor de la propiedad numeroEmpleados.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroEmpleados(Integer value) {
        this.numeroEmpleados = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSueldo() {
        return sueldo;
    }

    /**
     * Define el valor de la propiedad sueldo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSueldo(BigDecimal value) {
        this.sueldo = value;
    }

}
