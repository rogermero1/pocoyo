
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Direccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Direccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Barrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CallePrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CalleTransversal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Clase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Croquis" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionTipoDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EdificioConjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Extranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaModificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FechaVerificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCanton" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdCiudad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdDireccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdPais" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdParroquia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdProvincia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdSector" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="LoginModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Numeracion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OficinaModificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Piso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TelefonoPropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TiempoResidencia" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/&gt;
 *         &lt;element name="TipoDireccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValorVivienda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Verificado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VerificadoPor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Vigencia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", propOrder = {
    "actual",
    "barrio",
    "bloque",
    "callePrincipal",
    "calleTransversal",
    "ciudad",
    "clase",
    "croquis",
    "departamento",
    "descripcionTipoDireccion",
    "edificioConjunto",
    "extranjera",
    "fechaModificacion",
    "fechaVerificacion",
    "idCanton",
    "idCiudad",
    "idDireccion",
    "idPais",
    "idParroquia",
    "idProvincia",
    "idSector",
    "loginModificacion",
    "nombrePropietario",
    "numeracion",
    "numero",
    "observaciones",
    "oficinaModificacion",
    "pais",
    "piso",
    "provincia",
    "sector",
    "telefonoPropietario",
    "tiempoResidencia",
    "tipoDireccion",
    "valorVivienda",
    "verificado",
    "verificadoPor",
    "vigencia"
})
public class Direccion {

    @XmlElementRef(name = "Actual", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> actual;
    @XmlElementRef(name = "Barrio", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> barrio;
    @XmlElementRef(name = "Bloque", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bloque;
    @XmlElementRef(name = "CallePrincipal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callePrincipal;
    @XmlElementRef(name = "CalleTransversal", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calleTransversal;
    @XmlElementRef(name = "Ciudad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ciudad;
    @XmlElementRef(name = "Clase", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> clase;
    @XmlElementRef(name = "Croquis", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> croquis;
    @XmlElementRef(name = "Departamento", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamento;
    @XmlElementRef(name = "DescripcionTipoDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionTipoDireccion;
    @XmlElementRef(name = "EdificioConjunto", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> edificioConjunto;
    @XmlElementRef(name = "Extranjera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extranjera;
    @XmlElementRef(name = "FechaModificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaModificacion;
    @XmlElementRef(name = "FechaVerificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVerificacion;
    @XmlElementRef(name = "IdCanton", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCanton;
    @XmlElementRef(name = "IdCiudad", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCiudad;
    @XmlElementRef(name = "IdDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idDireccion;
    @XmlElementRef(name = "IdPais", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idPais;
    @XmlElementRef(name = "IdParroquia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idParroquia;
    @XmlElementRef(name = "IdProvincia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idProvincia;
    @XmlElementRef(name = "IdSector", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSector;
    @XmlElementRef(name = "LoginModificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> loginModificacion;
    @XmlElementRef(name = "NombrePropietario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombrePropietario;
    @XmlElementRef(name = "Numeracion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeracion;
    @XmlElementRef(name = "Numero", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numero;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "OficinaModificacion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oficinaModificacion;
    @XmlElementRef(name = "Pais", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pais;
    @XmlElementRef(name = "Piso", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> piso;
    @XmlElementRef(name = "Provincia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> provincia;
    @XmlElementRef(name = "Sector", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sector;
    @XmlElementRef(name = "TelefonoPropietario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telefonoPropietario;
    @XmlElementRef(name = "TiempoResidencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> tiempoResidencia;
    @XmlElementRef(name = "TipoDireccion", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tipoDireccion;
    @XmlElementRef(name = "ValorVivienda", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> valorVivienda;
    @XmlElement(name = "Verificado")
    protected Boolean verificado;
    @XmlElementRef(name = "VerificadoPor", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> verificadoPor;
    @XmlElement(name = "Vigencia")
    protected Boolean vigencia;

    /**
     * Obtiene el valor de la propiedad actual.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActual() {
        return actual;
    }

    /**
     * Define el valor de la propiedad actual.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActual(JAXBElement<String> value) {
        this.actual = value;
    }

    /**
     * Obtiene el valor de la propiedad barrio.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBarrio() {
        return barrio;
    }

    /**
     * Define el valor de la propiedad barrio.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBarrio(JAXBElement<String> value) {
        this.barrio = value;
    }

    /**
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBloque(JAXBElement<String> value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad callePrincipal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallePrincipal() {
        return callePrincipal;
    }

    /**
     * Define el valor de la propiedad callePrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallePrincipal(JAXBElement<String> value) {
        this.callePrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad calleTransversal.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalleTransversal() {
        return calleTransversal;
    }

    /**
     * Define el valor de la propiedad calleTransversal.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalleTransversal(JAXBElement<String> value) {
        this.calleTransversal = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCiudad(JAXBElement<String> value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad clase.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getClase() {
        return clase;
    }

    /**
     * Define el valor de la propiedad clase.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setClase(JAXBElement<Integer> value) {
        this.clase = value;
    }

    /**
     * Obtiene el valor de la propiedad croquis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCroquis() {
        return croquis;
    }

    /**
     * Define el valor de la propiedad croquis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCroquis(JAXBElement<byte[]> value) {
        this.croquis = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartamento(JAXBElement<String> value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionTipoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionTipoDireccion() {
        return descripcionTipoDireccion;
    }

    /**
     * Define el valor de la propiedad descripcionTipoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionTipoDireccion(JAXBElement<String> value) {
        this.descripcionTipoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad edificioConjunto.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEdificioConjunto() {
        return edificioConjunto;
    }

    /**
     * Define el valor de la propiedad edificioConjunto.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEdificioConjunto(JAXBElement<String> value) {
        this.edificioConjunto = value;
    }

    /**
     * Obtiene el valor de la propiedad extranjera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtranjera() {
        return extranjera;
    }

    /**
     * Define el valor de la propiedad extranjera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtranjera(JAXBElement<String> value) {
        this.extranjera = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * Define el valor de la propiedad fechaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaModificacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVerificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaVerificacion() {
        return fechaVerificacion;
    }

    /**
     * Define el valor de la propiedad fechaVerificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaVerificacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaVerificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idCanton.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCanton() {
        return idCanton;
    }

    /**
     * Define el valor de la propiedad idCanton.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCanton(JAXBElement<Integer> value) {
        this.idCanton = value;
    }

    /**
     * Obtiene el valor de la propiedad idCiudad.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCiudad() {
        return idCiudad;
    }

    /**
     * Define el valor de la propiedad idCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCiudad(JAXBElement<Integer> value) {
        this.idCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad idDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdDireccion() {
        return idDireccion;
    }

    /**
     * Define el valor de la propiedad idDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdDireccion(JAXBElement<Integer> value) {
        this.idDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad idPais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdPais() {
        return idPais;
    }

    /**
     * Define el valor de la propiedad idPais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdPais(JAXBElement<Integer> value) {
        this.idPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idParroquia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdParroquia() {
        return idParroquia;
    }

    /**
     * Define el valor de la propiedad idParroquia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdParroquia(JAXBElement<Integer> value) {
        this.idParroquia = value;
    }

    /**
     * Obtiene el valor de la propiedad idProvincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdProvincia() {
        return idProvincia;
    }

    /**
     * Define el valor de la propiedad idProvincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdProvincia(JAXBElement<Integer> value) {
        this.idProvincia = value;
    }

    /**
     * Obtiene el valor de la propiedad idSector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSector() {
        return idSector;
    }

    /**
     * Define el valor de la propiedad idSector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSector(JAXBElement<Integer> value) {
        this.idSector = value;
    }

    /**
     * Obtiene el valor de la propiedad loginModificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginModificacion() {
        return loginModificacion;
    }

    /**
     * Define el valor de la propiedad loginModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginModificacion(JAXBElement<String> value) {
        this.loginModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad nombrePropietario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Define el valor de la propiedad nombrePropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombrePropietario(JAXBElement<String> value) {
        this.nombrePropietario = value;
    }

    /**
     * Obtiene el valor de la propiedad numeracion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeracion() {
        return numeracion;
    }

    /**
     * Define el valor de la propiedad numeracion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeracion(JAXBElement<String> value) {
        this.numeracion = value;
    }

    /**
     * Obtiene el valor de la propiedad numero.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumero() {
        return numero;
    }

    /**
     * Define el valor de la propiedad numero.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumero(JAXBElement<String> value) {
        this.numero = value;
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
     * Obtiene el valor de la propiedad oficinaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOficinaModificacion() {
        return oficinaModificacion;
    }

    /**
     * Define el valor de la propiedad oficinaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOficinaModificacion(JAXBElement<String> value) {
        this.oficinaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad pais.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPais() {
        return pais;
    }

    /**
     * Define el valor de la propiedad pais.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPais(JAXBElement<String> value) {
        this.pais = value;
    }

    /**
     * Obtiene el valor de la propiedad piso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getPiso() {
        return piso;
    }

    /**
     * Define el valor de la propiedad piso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setPiso(JAXBElement<Integer> value) {
        this.piso = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProvincia(JAXBElement<String> value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad sector.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSector() {
        return sector;
    }

    /**
     * Define el valor de la propiedad sector.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSector(JAXBElement<String> value) {
        this.sector = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoPropietario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelefonoPropietario() {
        return telefonoPropietario;
    }

    /**
     * Define el valor de la propiedad telefonoPropietario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelefonoPropietario(JAXBElement<String> value) {
        this.telefonoPropietario = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoResidencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getTiempoResidencia() {
        return tiempoResidencia;
    }

    /**
     * Define el valor de la propiedad tiempoResidencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setTiempoResidencia(JAXBElement<Short> value) {
        this.tiempoResidencia = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDireccion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTipoDireccion() {
        return tipoDireccion;
    }

    /**
     * Define el valor de la propiedad tipoDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTipoDireccion(JAXBElement<Integer> value) {
        this.tipoDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad valorVivienda.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getValorVivienda() {
        return valorVivienda;
    }

    /**
     * Define el valor de la propiedad valorVivienda.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setValorVivienda(JAXBElement<BigDecimal> value) {
        this.valorVivienda = value;
    }

    /**
     * Obtiene el valor de la propiedad verificado.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerificado() {
        return verificado;
    }

    /**
     * Define el valor de la propiedad verificado.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerificado(Boolean value) {
        this.verificado = value;
    }

    /**
     * Obtiene el valor de la propiedad verificadoPor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVerificadoPor() {
        return verificadoPor;
    }

    /**
     * Define el valor de la propiedad verificadoPor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVerificadoPor(JAXBElement<String> value) {
        this.verificadoPor = value;
    }

    /**
     * Obtiene el valor de la propiedad vigencia.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVigencia() {
        return vigencia;
    }

    /**
     * Define el valor de la propiedad vigencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVigencia(Boolean value) {
        this.vigencia = value;
    }

}
