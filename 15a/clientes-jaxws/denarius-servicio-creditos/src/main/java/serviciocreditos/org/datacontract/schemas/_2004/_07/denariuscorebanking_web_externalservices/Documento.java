
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Documento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Alto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ancho" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ClaseDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CodigoTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contenido" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ContenidoReverso" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Enlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="EstadoProceso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaDigitalizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCarpeta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCliente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdEnvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdOrigen" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoginDigitalizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Replicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Requerido" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Rol" type="{http://schemas.microsoft.com/2003/10/Serialization/}char" minOccurs="0"/&gt;
 *         &lt;element name="RolCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoCarga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TipoContenido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", propOrder = {
    "alto",
    "ancho",
    "claseDocumento",
    "codigoTipoDocumento",
    "contenido",
    "contenidoReverso",
    "enlace",
    "estado",
    "estadoProceso",
    "extension",
    "fechaDigitalizacion",
    "idCarpeta",
    "idCliente",
    "idDocumento",
    "idEnvio",
    "idOperacion",
    "idOrigen",
    "idTipoDocumento",
    "loginDigitalizador",
    "nombreArchivo",
    "observaciones",
    "replicable",
    "requerido",
    "rol",
    "rolCliente",
    "tipoCarga",
    "tipoContenido",
    "tipoDocumento"
})
public class Documento {

    @XmlElement(name = "Alto")
    protected Integer alto;
    @XmlElement(name = "Ancho")
    protected Integer ancho;
    @XmlElementRef(name = "ClaseDocumento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> claseDocumento;
    @XmlElementRef(name = "CodigoTipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTipoDocumento;
    @XmlElementRef(name = "Contenido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> contenido;
    @XmlElementRef(name = "ContenidoReverso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> contenidoReverso;
    @XmlElementRef(name = "Enlace", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enlace;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> estado;
    @XmlElement(name = "EstadoProceso")
    protected Integer estadoProceso;
    @XmlElementRef(name = "Extension", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extension;
    @XmlElement(name = "FechaDigitalizacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDigitalizacion;
    @XmlElement(name = "IdCarpeta")
    protected Integer idCarpeta;
    @XmlElementRef(name = "IdCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCliente;
    @XmlElement(name = "IdDocumento")
    protected Integer idDocumento;
    @XmlElementRef(name = "IdEnvio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idEnvio;
    @XmlElement(name = "IdOperacion")
    protected Integer idOperacion;
    @XmlElement(name = "IdOrigen")
    protected Integer idOrigen;
    @XmlElement(name = "IdTipoDocumento")
    protected Integer idTipoDocumento;
    @XmlElementRef(name = "LoginDigitalizador", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginDigitalizador;
    @XmlElementRef(name = "NombreArchivo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreArchivo;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElement(name = "Replicable")
    protected Boolean replicable;
    @XmlElement(name = "Requerido")
    protected Boolean requerido;
    @XmlElement(name = "Rol")
    protected Integer rol;
    @XmlElementRef(name = "RolCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rolCliente;
    @XmlElement(name = "TipoCarga")
    protected Integer tipoCarga;
    @XmlElementRef(name = "TipoContenido", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoContenido;
    @XmlElementRef(name = "TipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlto(Integer value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAncho(Integer value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad claseDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClaseDocumento() {
        return claseDocumento;
    }

    /**
     * Define el valor de la propiedad claseDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClaseDocumento(JAXBElement<String> value) {
        this.claseDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    /**
     * Define el valor de la propiedad codigoTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTipoDocumento(JAXBElement<String> value) {
        this.codigoTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad contenido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContenido() {
        return contenido;
    }

    /**
     * Define el valor de la propiedad contenido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContenido(JAXBElement<byte[]> value) {
        this.contenido = value;
    }

    /**
     * Obtiene el valor de la propiedad contenidoReverso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getContenidoReverso() {
        return contenidoReverso;
    }

    /**
     * Define el valor de la propiedad contenidoReverso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setContenidoReverso(JAXBElement<byte[]> value) {
        this.contenidoReverso = value;
    }

    /**
     * Obtiene el valor de la propiedad enlace.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnlace() {
        return enlace;
    }

    /**
     * Define el valor de la propiedad enlace.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnlace(JAXBElement<String> value) {
        this.enlace = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setEstado(JAXBElement<Boolean> value) {
        this.estado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoProceso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoProceso() {
        return estadoProceso;
    }

    /**
     * Define el valor de la propiedad estadoProceso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoProceso(Integer value) {
        this.estadoProceso = value;
    }

    /**
     * Obtiene el valor de la propiedad extension.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtension() {
        return extension;
    }

    /**
     * Define el valor de la propiedad extension.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtension(JAXBElement<String> value) {
        this.extension = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDigitalizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDigitalizacion() {
        return fechaDigitalizacion;
    }

    /**
     * Define el valor de la propiedad fechaDigitalizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDigitalizacion(XMLGregorianCalendar value) {
        this.fechaDigitalizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCarpeta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCarpeta() {
        return idCarpeta;
    }

    /**
     * Define el valor de la propiedad idCarpeta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCarpeta(Integer value) {
        this.idCarpeta = value;
    }

    /**
     * Obtiene el valor de la propiedad idCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCliente() {
        return idCliente;
    }

    /**
     * Define el valor de la propiedad idCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCliente(JAXBElement<Integer> value) {
        this.idCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad idDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdDocumento() {
        return idDocumento;
    }

    /**
     * Define el valor de la propiedad idDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdDocumento(Integer value) {
        this.idDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad idEnvio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdEnvio() {
        return idEnvio;
    }

    /**
     * Define el valor de la propiedad idEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdEnvio(JAXBElement<Integer> value) {
        this.idEnvio = value;
    }

    /**
     * Obtiene el valor de la propiedad idOperacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOperacion() {
        return idOperacion;
    }

    /**
     * Define el valor de la propiedad idOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOperacion(Integer value) {
        this.idOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idOrigen.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOrigen() {
        return idOrigen;
    }

    /**
     * Define el valor de la propiedad idOrigen.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOrigen(Integer value) {
        this.idOrigen = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * Define el valor de la propiedad idTipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTipoDocumento(Integer value) {
        this.idTipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad loginDigitalizador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginDigitalizador() {
        return loginDigitalizador;
    }

    /**
     * Define el valor de la propiedad loginDigitalizador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginDigitalizador(JAXBElement<String> value) {
        this.loginDigitalizador = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArchivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Define el valor de la propiedad nombreArchivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreArchivo(JAXBElement<String> value) {
        this.nombreArchivo = value;
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
     * Obtiene el valor de la propiedad replicable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicable() {
        return replicable;
    }

    /**
     * Define el valor de la propiedad replicable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicable(Boolean value) {
        this.replicable = value;
    }

    /**
     * Obtiene el valor de la propiedad requerido.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequerido() {
        return requerido;
    }

    /**
     * Define el valor de la propiedad requerido.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequerido(Boolean value) {
        this.requerido = value;
    }

    /**
     * Obtiene el valor de la propiedad rol.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRol() {
        return rol;
    }

    /**
     * Define el valor de la propiedad rol.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRol(Integer value) {
        this.rol = value;
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
     * Obtiene el valor de la propiedad tipoCarga.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Define el valor de la propiedad tipoCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoCarga(Integer value) {
        this.tipoCarga = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContenido.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoContenido() {
        return tipoContenido;
    }

    /**
     * Define el valor de la propiedad tipoContenido.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoContenido(JAXBElement<String> value) {
        this.tipoContenido = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

}
