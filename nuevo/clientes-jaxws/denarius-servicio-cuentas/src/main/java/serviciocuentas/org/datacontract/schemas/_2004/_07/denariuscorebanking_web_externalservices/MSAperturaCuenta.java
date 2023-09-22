
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
import serviciocuentas.org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;


/**
 * <p>Clase Java para MSAperturaCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSAperturaCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuentas" type="{http://schemas.datacontract.org/2004/07/System.Collections.Generic}ArrayOfKeyValuePairOfstringstring" minOccurs="0"/&gt;
 *         &lt;element name="DocumentosCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSAperturaCuenta", propOrder = {
    "cuentas",
    "documentosCuenta"
})
public class MSAperturaCuenta
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Cuentas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValuePairOfstringstring> cuentas;
    @XmlElementRef(name = "DocumentosCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentosCuenta;

    /**
     * Obtiene el valor de la propiedad cuentas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> getCuentas() {
        return cuentas;
    }

    /**
     * Define el valor de la propiedad cuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     *     
     */
    public void setCuentas(JAXBElement<ArrayOfKeyValuePairOfstringstring> value) {
        this.cuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad documentosCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentosCuenta() {
        return documentosCuenta;
    }

    /**
     * Define el valor de la propiedad documentosCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentosCuenta(JAXBElement<String> value) {
        this.documentosCuenta = value;
    }

}
