
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParametroProspeccionCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParametroProspeccionCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoTipoCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroProspeccionCredito", propOrder = {
    "codigoTipoCredito",
    "codigoTipoOperacion",
    "idTipoCredito",
    "idTipoOperacion"
})
public class ParametroProspeccionCredito {

    @XmlElementRef(name = "CodigoTipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoCredito;
    @XmlElementRef(name = "CodigoTipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoOperacion;
    @XmlElement(name = "IdTipoCredito")
    protected Integer idTipoCredito;
    @XmlElement(name = "IdTipoOperacion")
    protected Integer idTipoOperacion;

    /**
     * Obtiene el valor de la propiedad codigoTipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoCredito() {
        return codigoTipoCredito;
    }

    /**
     * Define el valor de la propiedad codigoTipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoCredito(JAXBElement<String> value) {
        this.codigoTipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoOperacion() {
        return codigoTipoOperacion;
    }

    /**
     * Define el valor de la propiedad codigoTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoOperacion(JAXBElement<String> value) {
        this.codigoTipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoCredito() {
        return idTipoCredito;
    }

    /**
     * Define el valor de la propiedad idTipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoCredito(Integer value) {
        this.idTipoCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoOperacion() {
        return idTipoOperacion;
    }

    /**
     * Define el valor de la propiedad idTipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoOperacion(Integer value) {
        this.idTipoOperacion = value;
    }

}
