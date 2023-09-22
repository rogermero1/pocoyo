
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MECreditos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MECreditos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CuentaGrupal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Deudores" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}ArrayOfClienteTramite" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteDeudor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdClienteGarante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NombreImpreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Opcion" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="Operacion" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}OperacionCartera" minOccurs="0"/&gt;
 *         &lt;element name="SolicitarTarjeta" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MECreditos", propOrder = {
    "cuentaGrupal",
    "deudores",
    "idClienteDeudor",
    "idClienteGarante",
    "idTramite",
    "nombreImpreso",
    "opcion",
    "operacion",
    "solicitarTarjeta"
})
public class MECreditos
    extends MensajeEntradaBase
{

    @XmlElementRef(name = "CuentaGrupal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cuentaGrupal;
    @XmlElementRef(name = "Deudores", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClienteTramite> deudores;
    @XmlElement(name = "IdClienteDeudor")
    protected Integer idClienteDeudor;
    @XmlElement(name = "IdClienteGarante")
    protected Integer idClienteGarante;
    @XmlElement(name = "IdTramite")
    protected Integer idTramite;
    @XmlElementRef(name = "NombreImpreso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreImpreso;
    @XmlElement(name = "Opcion")
    protected Integer opcion;
    @XmlElementRef(name = "Operacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<OperacionCartera> operacion;
    @XmlElement(name = "SolicitarTarjeta")
    protected Boolean solicitarTarjeta;

    /**
     * Obtiene el valor de la propiedad cuentaGrupal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCuentaGrupal() {
        return cuentaGrupal;
    }

    /**
     * Define el valor de la propiedad cuentaGrupal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCuentaGrupal(JAXBElement<String> value) {
        this.cuentaGrupal = value;
    }

    /**
     * Obtiene el valor de la propiedad deudores.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClienteTramite> getDeudores() {
        return deudores;
    }

    /**
     * Define el valor de la propiedad deudores.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     *     
     */
    public void setDeudores(JAXBElement<ArrayOfClienteTramite> value) {
        this.deudores = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteDeudor.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteDeudor() {
        return idClienteDeudor;
    }

    /**
     * Define el valor de la propiedad idClienteDeudor.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteDeudor(Integer value) {
        this.idClienteDeudor = value;
    }

    /**
     * Obtiene el valor de la propiedad idClienteGarante.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClienteGarante() {
        return idClienteGarante;
    }

    /**
     * Define el valor de la propiedad idClienteGarante.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClienteGarante(Integer value) {
        this.idClienteGarante = value;
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
     * Obtiene el valor de la propiedad nombreImpreso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreImpreso() {
        return nombreImpreso;
    }

    /**
     * Define el valor de la propiedad nombreImpreso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreImpreso(JAXBElement<String> value) {
        this.nombreImpreso = value;
    }

    /**
     * Obtiene el valor de la propiedad opcion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOpcion() {
        return opcion;
    }

    /**
     * Define el valor de la propiedad opcion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOpcion(Integer value) {
        this.opcion = value;
    }

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     *     
     */
    public JAXBElement<OperacionCartera> getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     *     
     */
    public void setOperacion(JAXBElement<OperacionCartera> value) {
        this.operacion = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitarTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSolicitarTarjeta() {
        return solicitarTarjeta;
    }

    /**
     * Define el valor de la propiedad solicitarTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolicitarTarjeta(Boolean value) {
        this.solicitarTarjeta = value;
    }

}
