
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;


/**
 * <p>Clase Java para MEInformacionMicroempresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MEInformacionMicroempresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeEntradaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdOcupacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ListaDetalleProductos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetalleProductoMicroempresa" minOccurs="0"/&gt;
 *         &lt;element name="ListaManoObra" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfManoObraMicroempresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MEInformacionMicroempresa", propOrder = {
    "idOcupacion",
    "listaDetalleProductos",
    "listaManoObra"
})
public class MEInformacionMicroempresa
    extends MensajeEntradaBase
{

    @XmlElement(name = "IdOcupacion")
    protected Integer idOcupacion;
    @XmlElementRef(name = "ListaDetalleProductos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleProductoMicroempresa> listaDetalleProductos;
    @XmlElementRef(name = "ListaManoObra", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManoObraMicroempresa> listaManoObra;

    /**
     * Obtiene el valor de la propiedad idOcupacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOcupacion() {
        return idOcupacion;
    }

    /**
     * Define el valor de la propiedad idOcupacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOcupacion(Integer value) {
        this.idOcupacion = value;
    }

    /**
     * Obtiene el valor de la propiedad listaDetalleProductos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleProductoMicroempresa> getListaDetalleProductos() {
        return listaDetalleProductos;
    }

    /**
     * Define el valor de la propiedad listaDetalleProductos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     *     
     */
    public void setListaDetalleProductos(JAXBElement<ArrayOfDetalleProductoMicroempresa> value) {
        this.listaDetalleProductos = value;
    }

    /**
     * Obtiene el valor de la propiedad listaManoObra.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfManoObraMicroempresa> getListaManoObra() {
        return listaManoObra;
    }

    /**
     * Define el valor de la propiedad listaManoObra.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     *     
     */
    public void setListaManoObra(JAXBElement<ArrayOfManoObraMicroempresa> value) {
        this.listaManoObra = value;
    }

}
