
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import serviciocuentas.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEConsultasCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEConsultasCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdsClientes" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/&gt;
 *         &lt;element name="ListaNumeroCuentas" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="Modulo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NumeroCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Oficina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Secuencial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoConsulta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Transaccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEConsultasCuenta", propOrder = {
    "idCliente",
    "idsClientes",
    "listaNumeroCuentas",
    "modulo",
    "numeroCuenta",
    "oficina",
    "secuencial",
    "sucursal",
    "tipoConsulta",
    "transaccion"
})
public class MEConsultasCuenta
    extends MensajeEntradaBase
{

    @XmlElement(name = "IdCliente")
    protected Integer idCliente;
    @XmlElementRef(name = "IdsClientes", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idsClientes;
    @XmlElementRef(name = "ListaNumeroCuentas", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> listaNumeroCuentas;
    @XmlElement(name = "Modulo")
    protected Integer modulo;
    @XmlElementRef(name = "NumeroCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroCuenta;
    @XmlElement(name = "Oficina")
    protected Integer oficina;
    @XmlElement(name = "Secuencial")
    protected Integer secuencial;
    @XmlElement(name = "Sucursal")
    protected Integer sucursal;
    @XmlElement(name = "TipoConsulta")
    protected Integer tipoConsulta;
    @XmlElement(name = "Transaccion")
    protected Integer transaccion;

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCliente(Integer value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idsClientes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdsClientes() {
        return idsClientes;
    }

    /**
     * Define el valor de la propiedad idsClientes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdsClientes(JAXBElement<ArrayOfint> value) {
        this.idsClientes = value;
    }

    /**
     * Obtiene el valor de la propiedad listaNumeroCuentas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getListaNumeroCuentas() {
        return listaNumeroCuentas;
    }

    /**
     * Define el valor de la propiedad listaNumeroCuentas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setListaNumeroCuentas(JAXBElement<ArrayOfstring> value) {
        this.listaNumeroCuentas = value;
    }

    /**
     * Obtiene el valor de la propiedad modulo.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModulo() {
        return modulo;
    }

    /**
     * Define el valor de la propiedad modulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModulo(Integer value) {
        this.modulo = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Define el valor de la propiedad numeroCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroCuenta(JAXBElement<String> value) {
        this.numeroCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad oficina.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOficina() {
        return oficina;
    }

    /**
     * Define el valor de la propiedad oficina.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOficina(Integer value) {
        this.oficina = value;
    }

    /**
     * Obtiene el valor de la propiedad secuencial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecuencial() {
        return secuencial;
    }

    /**
     * Define el valor de la propiedad secuencial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecuencial(Integer value) {
        this.secuencial = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSucursal(Integer value) {
        this.sucursal = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define el valor de la propiedad tipoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoConsulta(Integer value) {
        this.tipoConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransaccion() {
        return transaccion;
    }

    /**
     * Define el valor de la propiedad transaccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransaccion(Integer value) {
        this.transaccion = value;
    }

}
