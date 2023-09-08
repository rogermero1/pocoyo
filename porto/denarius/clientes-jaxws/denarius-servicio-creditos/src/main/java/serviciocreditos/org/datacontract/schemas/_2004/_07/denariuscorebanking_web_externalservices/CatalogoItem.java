
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CatalogoItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CatalogoItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoNegocioPadre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigosNegocioNiveles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCodigoPadre" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NivelSeleccionado" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="Parametro1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Parametro4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Parametro5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UltimoNivel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Vigente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoItem", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", propOrder = {
    "codigoNegocio",
    "codigoNegocioPadre",
    "codigosNegocioNiveles",
    "descripcion",
    "id",
    "idCodigoPadre",
    "nivelSeleccionado",
    "parametro1",
    "parametro4",
    "parametro5",
    "ultimoNivel",
    "vigente"
})
public class CatalogoItem {

    @XmlElementRef(name = "CodigoNegocio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocio;
    @XmlElementRef(name = "CodigoNegocioPadre", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoNegocioPadre;
    @XmlElementRef(name = "CodigosNegocioNiveles", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigosNegocioNiveles;
    @XmlElementRef(name = "Descripcion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "Id", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> id;
    @XmlElementRef(name = "IdCodigoPadre", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCodigoPadre;
    @XmlElementRef(name = "NivelSeleccionado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> nivelSeleccionado;
    @XmlElementRef(name = "Parametro1", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> parametro1;
    @XmlElementRef(name = "Parametro4", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> parametro4;
    @XmlElementRef(name = "Parametro5", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parametro5;
    @XmlElementRef(name = "UltimoNivel", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> ultimoNivel;
    @XmlElementRef(name = "Vigente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> vigente;

    /**
     * Obtiene el valor de la propiedad codigoNegocio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoNegocio() {
        return codigoNegocio;
    }

    /**
     * Define el valor de la propiedad codigoNegocio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoNegocio(JAXBElement<String> value) {
        this.codigoNegocio = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoNegocioPadre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoNegocioPadre() {
        return codigoNegocioPadre;
    }

    /**
     * Define el valor de la propiedad codigoNegocioPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoNegocioPadre(JAXBElement<String> value) {
        this.codigoNegocioPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad codigosNegocioNiveles.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigosNegocioNiveles() {
        return codigosNegocioNiveles;
    }

    /**
     * Define el valor de la propiedad codigosNegocioNiveles.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigosNegocioNiveles(JAXBElement<String> value) {
        this.codigosNegocioNiveles = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setId(JAXBElement<Integer> value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idCodigoPadre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCodigoPadre() {
        return idCodigoPadre;
    }

    /**
     * Define el valor de la propiedad idCodigoPadre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCodigoPadre(JAXBElement<Integer> value) {
        this.idCodigoPadre = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelSeleccionado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getNivelSeleccionado() {
        return nivelSeleccionado;
    }

    /**
     * Define el valor de la propiedad nivelSeleccionado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setNivelSeleccionado(JAXBElement<Short> value) {
        this.nivelSeleccionado = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro1.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParametro1() {
        return parametro1;
    }

    /**
     * Define el valor de la propiedad parametro1.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParametro1(JAXBElement<Integer> value) {
        this.parametro1 = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro4.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getParametro4() {
        return parametro4;
    }

    /**
     * Define el valor de la propiedad parametro4.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setParametro4(JAXBElement<Integer> value) {
        this.parametro4 = value;
    }

    /**
     * Obtiene el valor de la propiedad parametro5.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParametro5() {
        return parametro5;
    }

    /**
     * Define el valor de la propiedad parametro5.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParametro5(JAXBElement<String> value) {
        this.parametro5 = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoNivel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUltimoNivel() {
        return ultimoNivel;
    }

    /**
     * Define el valor de la propiedad ultimoNivel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUltimoNivel(JAXBElement<Boolean> value) {
        this.ultimoNivel = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVigente() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVigente(JAXBElement<Boolean> value) {
        this.vigente = value;
    }

}
