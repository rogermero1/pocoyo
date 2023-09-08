
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSRiesgoAmbiental complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSRiesgoAmbiental"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentoSaras" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}Documento" minOccurs="0"/&gt;
 *         &lt;element name="IdFlujoSaras" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ListaPreguntas" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes}ArrayOfCatalogoItem" minOccurs="0"/&gt;
 *         &lt;element name="NivelRiesgo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSRiesgoAmbiental", propOrder = {
    "documentoSaras",
    "idFlujoSaras",
    "idTramite",
    "listaPreguntas",
    "nivelRiesgo"
})
public class MSRiesgoAmbiental
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "DocumentoSaras", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documentoSaras;
    @XmlElement(name = "IdFlujoSaras")
    protected Integer idFlujoSaras;
    @XmlElement(name = "IdTramite")
    protected Integer idTramite;
    @XmlElementRef(name = "ListaPreguntas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCatalogoItem> listaPreguntas;
    @XmlElement(name = "NivelRiesgo")
    protected Integer nivelRiesgo;

    /**
     * Obtiene el valor de la propiedad documentoSaras.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public JAXBElement<Documento> getDocumentoSaras() {
        return documentoSaras;
    }

    /**
     * Define el valor de la propiedad documentoSaras.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public void setDocumentoSaras(JAXBElement<Documento> value) {
        this.documentoSaras = value;
    }

    /**
     * Obtiene el valor de la propiedad idFlujoSaras.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFlujoSaras() {
        return idFlujoSaras;
    }

    /**
     * Define el valor de la propiedad idFlujoSaras.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFlujoSaras(Integer value) {
        this.idFlujoSaras = value;
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

    /**
     * Obtiene el valor de la propiedad nivelRiesgo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelRiesgo() {
        return nivelRiesgo;
    }

    /**
     * Define el valor de la propiedad nivelRiesgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelRiesgo(Integer value) {
        this.nivelRiesgo = value;
    }

}
