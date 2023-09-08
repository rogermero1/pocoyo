
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MEIdentificacionCliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEIdentificacionCliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoProducto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdEstado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NivelEstudios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NivelEstudiosConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCargas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="RolCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TasaPreferencial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoProceso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoVivienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransaccionOrigen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEIdentificacionCliente", propOrder = {
    "codigoProducto",
    "estadoCivil",
    "idEstado",
    "identificacionCliente",
    "identificacionConyuge",
    "nivelEstudios",
    "nivelEstudiosConyuge",
    "numeroCargas",
    "rolCliente",
    "tasaPreferencial",
    "tipoProceso",
    "tipoVivienda",
    "transaccionOrigen"
})
public class MEIdentificacionCliente
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CodigoProducto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoProducto;
    @XmlElementRef(name = "EstadoCivil", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estadoCivil;
    @XmlElement(name = "IdEstado")
    protected Integer idEstado;
    @XmlElementRef(name = "IdentificacionCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionCliente;
    @XmlElementRef(name = "IdentificacionConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificacionConyuge;
    @XmlElementRef(name = "NivelEstudios", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nivelEstudios;
    @XmlElementRef(name = "NivelEstudiosConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nivelEstudiosConyuge;
    @XmlElement(name = "NumeroCargas")
    protected Integer numeroCargas;
    @XmlElementRef(name = "RolCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rolCliente;
    @XmlElement(name = "TasaPreferencial")
    protected Boolean tasaPreferencial;
    @XmlElement(name = "TipoProceso")
    protected Integer tipoProceso;
    @XmlElementRef(name = "TipoVivienda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoVivienda;
    @XmlElement(name = "TransaccionOrigen")
    protected Integer transaccionOrigen;

    /**
     * Obtiene el valor de la propiedad codigoProducto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProducto() {
        return codigoProducto;
    }

    /**
     * Define el valor de la propiedad codigoProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProducto(JAXBElement<String> value) {
        this.codigoProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstadoCivil(JAXBElement<String> value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad idEstado.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEstado() {
        return idEstado;
    }

    /**
     * Define el valor de la propiedad idEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEstado(Integer value) {
        this.idEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionCliente() {
        return identificacionCliente;
    }

    /**
     * Define el valor de la propiedad identificacionCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionCliente(JAXBElement<String> value) {
        this.identificacionCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdentificacionConyuge() {
        return identificacionConyuge;
    }

    /**
     * Define el valor de la propiedad identificacionConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdentificacionConyuge(JAXBElement<String> value) {
        this.identificacionConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEstudios.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNivelEstudios() {
        return nivelEstudios;
    }

    /**
     * Define el valor de la propiedad nivelEstudios.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNivelEstudios(JAXBElement<String> value) {
        this.nivelEstudios = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelEstudiosConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNivelEstudiosConyuge() {
        return nivelEstudiosConyuge;
    }

    /**
     * Define el valor de la propiedad nivelEstudiosConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNivelEstudiosConyuge(JAXBElement<String> value) {
        this.nivelEstudiosConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCargas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCargas() {
        return numeroCargas;
    }

    /**
     * Define el valor de la propiedad numeroCargas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCargas(Integer value) {
        this.numeroCargas = value;
    }

    /**
     * Obtiene el valor de la propiedad rolCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRolCliente() {
        return rolCliente;
    }

    /**
     * Define el valor de la propiedad rolCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRolCliente(JAXBElement<String> value) {
        this.rolCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tasaPreferencial.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTasaPreferencial() {
        return tasaPreferencial;
    }

    /**
     * Define el valor de la propiedad tasaPreferencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTasaPreferencial(Boolean value) {
        this.tasaPreferencial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProceso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoProceso() {
        return tipoProceso;
    }

    /**
     * Define el valor de la propiedad tipoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoProceso(Integer value) {
        this.tipoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoVivienda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoVivienda() {
        return tipoVivienda;
    }

    /**
     * Define el valor de la propiedad tipoVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoVivienda(JAXBElement<String> value) {
        this.tipoVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransaccionOrigen() {
        return transaccionOrigen;
    }

    /**
     * Define el valor de la propiedad transaccionOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransaccionOrigen(Integer value) {
        this.transaccionOrigen = value;
    }

}
