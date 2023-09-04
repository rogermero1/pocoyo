
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CheckListFlujo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CheckListFlujo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExcepcionRequerida" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IdCabeceraCheckList" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCheckList" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdInstanciaFlujo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Mandatorio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NombreCheckList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PermiteExcepcionar" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TipoCheckList" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TransaccionMenu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckListFlujo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", propOrder = {
    "descripcion",
    "excepcionRequerida",
    "idCabeceraCheckList",
    "idCheckList",
    "idInstanciaFlujo",
    "mandatorio",
    "nombreCheckList",
    "observaciones",
    "permiteExcepcionar",
    "tipoCheckList",
    "transaccionMenu",
    "valor"
})
public class CheckListFlujo {

    @XmlElementRef(name = "Descripcion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;
    @XmlElementRef(name = "ExcepcionRequerida", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> excepcionRequerida;
    @XmlElement(name = "IdCabeceraCheckList")
    protected Integer idCabeceraCheckList;
    @XmlElement(name = "IdCheckList")
    protected Integer idCheckList;
    @XmlElement(name = "IdInstanciaFlujo")
    protected Integer idInstanciaFlujo;
    @XmlElementRef(name = "Mandatorio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mandatorio;
    @XmlElementRef(name = "NombreCheckList", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCheckList;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElement(name = "PermiteExcepcionar")
    protected Boolean permiteExcepcionar;
    @XmlElement(name = "TipoCheckList")
    protected Integer tipoCheckList;
    @XmlElement(name = "TransaccionMenu")
    protected Integer transaccionMenu;
    @XmlElementRef(name = "Valor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> valor;

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
     * Obtiene el valor de la propiedad excepcionRequerida.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getExcepcionRequerida() {
        return excepcionRequerida;
    }

    /**
     * Define el valor de la propiedad excepcionRequerida.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setExcepcionRequerida(JAXBElement<Boolean> value) {
        this.excepcionRequerida = value;
    }

    /**
     * Obtiene el valor de la propiedad idCabeceraCheckList.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCabeceraCheckList() {
        return idCabeceraCheckList;
    }

    /**
     * Define el valor de la propiedad idCabeceraCheckList.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCabeceraCheckList(Integer value) {
        this.idCabeceraCheckList = value;
    }

    /**
     * Obtiene el valor de la propiedad idCheckList.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCheckList() {
        return idCheckList;
    }

    /**
     * Define el valor de la propiedad idCheckList.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCheckList(Integer value) {
        this.idCheckList = value;
    }

    /**
     * Obtiene el valor de la propiedad idInstanciaFlujo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdInstanciaFlujo() {
        return idInstanciaFlujo;
    }

    /**
     * Define el valor de la propiedad idInstanciaFlujo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdInstanciaFlujo(Integer value) {
        this.idInstanciaFlujo = value;
    }

    /**
     * Obtiene el valor de la propiedad mandatorio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMandatorio() {
        return mandatorio;
    }

    /**
     * Define el valor de la propiedad mandatorio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMandatorio(JAXBElement<Boolean> value) {
        this.mandatorio = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCheckList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCheckList() {
        return nombreCheckList;
    }

    /**
     * Define el valor de la propiedad nombreCheckList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCheckList(JAXBElement<String> value) {
        this.nombreCheckList = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad permiteExcepcionar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPermiteExcepcionar() {
        return permiteExcepcionar;
    }

    /**
     * Define el valor de la propiedad permiteExcepcionar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPermiteExcepcionar(Boolean value) {
        this.permiteExcepcionar = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCheckList.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCheckList() {
        return tipoCheckList;
    }

    /**
     * Define el valor de la propiedad tipoCheckList.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCheckList(Integer value) {
        this.tipoCheckList = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionMenu.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransaccionMenu() {
        return transaccionMenu;
    }

    /**
     * Define el valor de la propiedad transaccionMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransaccionMenu(Integer value) {
        this.transaccionMenu = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setValor(JAXBElement<Boolean> value) {
        this.valor = value;
    }

}
