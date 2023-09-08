
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaInversionSolicitud;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaProducto;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInstruccionInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacionInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacionInversionCliente;


/**
 * <p>Clase Java para MensajeEntradaBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MensajeEntradaBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}Cabecera" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeEntradaBase", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    MEConsultaProducto.class,
    MEIdentificacionCliente.class,
    MESimulacionInversion.class,
    MESimulacionInversionCliente.class,
    MEAperturaInversion.class,
    MEInstruccionInversion.class,
    MEAperturaInversionSolicitud.class
})
public class MensajeEntradaBase {

    @XmlElementRef(name = "Cabecera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Cabecera> cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public JAXBElement<Cabecera> getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public void setCabecera(JAXBElement<Cabecera> value) {
        this.cabecera = value;
    }

}
