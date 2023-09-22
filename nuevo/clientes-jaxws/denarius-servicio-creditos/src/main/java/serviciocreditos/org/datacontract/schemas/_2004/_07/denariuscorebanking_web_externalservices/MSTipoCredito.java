
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSTipoCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSTipoCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmpleosCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfEmpleo" minOccurs="0"/&gt;
 *         &lt;element name="EmpleosClienteConyuge" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfEmpleo" minOccurs="0"/&gt;
 *         &lt;element name="IdEmpleoPrincipal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdEmpleoPrincipalConyuge" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoCredito" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ParametroProspeccionCredito" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSTipoCredito", propOrder = {
    "empleosCliente",
    "empleosClienteConyuge",
    "idEmpleoPrincipal",
    "idEmpleoPrincipalConyuge",
    "tipoCredito"
})
public class MSTipoCredito
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "EmpleosCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmpleo> empleosCliente;
    @XmlElementRef(name = "EmpleosClienteConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEmpleo> empleosClienteConyuge;
    @XmlElement(name = "IdEmpleoPrincipal")
    protected Integer idEmpleoPrincipal;
    @XmlElementRef(name = "IdEmpleoPrincipalConyuge", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idEmpleoPrincipalConyuge;
    @XmlElementRef(name = "TipoCredito", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ParametroProspeccionCredito> tipoCredito;

    /**
     * Obtiene el valor de la propiedad empleosCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpleo> getEmpleosCliente() {
        return empleosCliente;
    }

    /**
     * Define el valor de la propiedad empleosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     *     
     */
    public void setEmpleosCliente(JAXBElement<ArrayOfEmpleo> value) {
        this.empleosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad empleosClienteConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEmpleo> getEmpleosClienteConyuge() {
        return empleosClienteConyuge;
    }

    /**
     * Define el valor de la propiedad empleosClienteConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     *     
     */
    public void setEmpleosClienteConyuge(JAXBElement<ArrayOfEmpleo> value) {
        this.empleosClienteConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpleoPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEmpleoPrincipal() {
        return idEmpleoPrincipal;
    }

    /**
     * Define el valor de la propiedad idEmpleoPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEmpleoPrincipal(Integer value) {
        this.idEmpleoPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpleoPrincipalConyuge.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdEmpleoPrincipalConyuge() {
        return idEmpleoPrincipalConyuge;
    }

    /**
     * Define el valor de la propiedad idEmpleoPrincipalConyuge.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdEmpleoPrincipalConyuge(JAXBElement<Integer> value) {
        this.idEmpleoPrincipalConyuge = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     *     
     */
    public JAXBElement<ParametroProspeccionCredito> getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define el valor de la propiedad tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     *     
     */
    public void setTipoCredito(JAXBElement<ParametroProspeccionCredito> value) {
        this.tipoCredito = value;
    }

}
