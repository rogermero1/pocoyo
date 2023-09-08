
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EjecutarTransaccionCanalesXmlResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ejecutarTransaccionCanalesXmlResult"
})
@XmlRootElement(name = "EjecutarTransaccionCanalesXmlResponse")
public class EjecutarTransaccionCanalesXmlResponse {

    @XmlElementRef(name = "EjecutarTransaccionCanalesXmlResult", namespace = "Denarius.CoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult> ejecutarTransaccionCanalesXmlResult;

    /**
     * Obtiene el valor de la propiedad ejecutarTransaccionCanalesXmlResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult }{@code >}
     *     
     */
    public JAXBElement<EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult> getEjecutarTransaccionCanalesXmlResult() {
        return ejecutarTransaccionCanalesXmlResult;
    }

    /**
     * Define el valor de la propiedad ejecutarTransaccionCanalesXmlResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult }{@code >}
     *     
     */
    public void setEjecutarTransaccionCanalesXmlResult(JAXBElement<EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult> value) {
        this.ejecutarTransaccionCanalesXmlResult = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class EjecutarTransaccionCanalesXmlResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Obtiene el valor de la propiedad any.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Define el valor de la propiedad any.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
