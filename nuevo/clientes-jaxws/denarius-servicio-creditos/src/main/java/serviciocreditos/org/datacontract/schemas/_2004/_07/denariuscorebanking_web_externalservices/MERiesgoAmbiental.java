
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MERiesgoAmbiental complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MERiesgoAmbiental"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Archivo" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="IdTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ListaPreguntas" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}ArrayOfCatalogoItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MERiesgoAmbiental", propOrder = {
    "archivo",
    "idTramite",
    "listaPreguntas"
})
public class MERiesgoAmbiental
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "Archivo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> archivo;
    @XmlElement(name = "IdTramite")
    protected Integer idTramite;
    @XmlElementRef(name = "ListaPreguntas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCatalogoItem> listaPreguntas;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setArchivo(JAXBElement<byte[]> value) {
        this.archivo = value;
    }

    /**
     * Obtiene el valor de la propiedad idTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTramite() {
        return idTramite;
    }

    /**
     * Define el valor de la propiedad idTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTramite(Integer value) {
        this.idTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad listaPreguntas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCatalogoItem> getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * Define el valor de la propiedad listaPreguntas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     *     
     */
    public void setListaPreguntas(JAXBElement<ArrayOfCatalogoItem> value) {
        this.listaPreguntas = value;
    }

}
