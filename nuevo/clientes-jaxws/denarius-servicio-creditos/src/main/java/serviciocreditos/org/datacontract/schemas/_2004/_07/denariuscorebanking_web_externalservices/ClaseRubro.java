
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaseRubro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClaseRubro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdClaseRubro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOcupacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NombreClaseRubro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDatos" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Signo" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaseRubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", propOrder = {
    "idClaseRubro",
    "idOcupacion",
    "nombreClaseRubro",
    "numeroDatos",
    "signo",
    "total"
})
public class ClaseRubro {

    @XmlElement(name = "IdClaseRubro")
    protected Integer idClaseRubro;
    @XmlElementRef(name = "IdOcupacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idOcupacion;
    @XmlElementRef(name = "NombreClaseRubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreClaseRubro;
    @XmlElement(name = "NumeroDatos")
    protected Integer numeroDatos;
    @XmlElement(name = "Signo")
    protected Integer signo;
    @XmlElement(name = "Total")
    protected BigDecimal total;

    /**
     * Obtiene el valor de la propiedad idClaseRubro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClaseRubro() {
        return idClaseRubro;
    }

    /**
     * Define el valor de la propiedad idClaseRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClaseRubro(Integer value) {
        this.idClaseRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad idOcupacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdOcupacion() {
        return idOcupacion;
    }

    /**
     * Define el valor de la propiedad idOcupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdOcupacion(JAXBElement<Integer> value) {
        this.idOcupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreClaseRubro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreClaseRubro() {
        return nombreClaseRubro;
    }

    /**
     * Define el valor de la propiedad nombreClaseRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreClaseRubro(JAXBElement<String> value) {
        this.nombreClaseRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDatos.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroDatos() {
        return numeroDatos;
    }

    /**
     * Define el valor de la propiedad numeroDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroDatos(Integer value) {
        this.numeroDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad signo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSigno() {
        return signo;
    }

    /**
     * Define el valor de la propiedad signo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSigno(Integer value) {
        this.signo = value;
    }

    /**
     * Obtiene el valor de la propiedad total.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * Define el valor de la propiedad total.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotal(BigDecimal value) {
        this.total = value;
    }

}
