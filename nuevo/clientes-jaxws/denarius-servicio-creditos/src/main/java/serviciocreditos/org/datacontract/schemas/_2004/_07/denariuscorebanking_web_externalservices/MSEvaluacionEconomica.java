
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSEvaluacionEconomica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSEvaluacionEconomica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClasesRubro" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfClaseRubro" minOccurs="0"/&gt;
 *         &lt;element name="ClasesRubroPareja" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfClaseRubro" minOccurs="0"/&gt;
 *         &lt;element name="EvaluacionConsumo" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}EvaluacionEconomicaConsumo" minOccurs="0"/&gt;
 *         &lt;element name="EvaluacionMicro" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos}EvaluacionEconomicaMicro" minOccurs="0"/&gt;
 *         &lt;element name="ListaActivos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetalleActivo" minOccurs="0"/&gt;
 *         &lt;element name="ListaDetalleProductos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetalleProductoMicroempresa" minOccurs="0"/&gt;
 *         &lt;element name="ListaManoObra" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfManoObraMicroempresa" minOccurs="0"/&gt;
 *         &lt;element name="ListaPasivos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfDetallePasivo" minOccurs="0"/&gt;
 *         &lt;element name="Rubros" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfRubroIngresoEgreso" minOccurs="0"/&gt;
 *         &lt;element name="RubrosPareja" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}ArrayOfRubroIngresoEgreso" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSEvaluacionEconomica", propOrder = {
    "clasesRubro",
    "clasesRubroPareja",
    "evaluacionConsumo",
    "evaluacionMicro",
    "listaActivos",
    "listaDetalleProductos",
    "listaManoObra",
    "listaPasivos",
    "rubros",
    "rubrosPareja"
})
public class MSEvaluacionEconomica
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "ClasesRubro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClaseRubro> clasesRubro;
    @XmlElementRef(name = "ClasesRubroPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClaseRubro> clasesRubroPareja;
    @XmlElementRef(name = "EvaluacionConsumo", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<EvaluacionEconomicaConsumo> evaluacionConsumo;
    @XmlElementRef(name = "EvaluacionMicro", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<EvaluacionEconomicaMicro> evaluacionMicro;
    @XmlElementRef(name = "ListaActivos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleActivo> listaActivos;
    @XmlElementRef(name = "ListaDetalleProductos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleProductoMicroempresa> listaDetalleProductos;
    @XmlElementRef(name = "ListaManoObra", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfManoObraMicroempresa> listaManoObra;
    @XmlElementRef(name = "ListaPasivos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetallePasivo> listaPasivos;
    @XmlElementRef(name = "Rubros", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRubroIngresoEgreso> rubros;
    @XmlElementRef(name = "RubrosPareja", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRubroIngresoEgreso> rubrosPareja;

    /**
     * Obtiene el valor de la propiedad clasesRubro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClaseRubro> getClasesRubro() {
        return clasesRubro;
    }

    /**
     * Define el valor de la propiedad clasesRubro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     *     
     */
    public void setClasesRubro(JAXBElement<ArrayOfClaseRubro> value) {
        this.clasesRubro = value;
    }

    /**
     * Obtiene el valor de la propiedad clasesRubroPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClaseRubro> getClasesRubroPareja() {
        return clasesRubroPareja;
    }

    /**
     * Define el valor de la propiedad clasesRubroPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     *     
     */
    public void setClasesRubroPareja(JAXBElement<ArrayOfClaseRubro> value) {
        this.clasesRubroPareja = value;
    }

    /**
     * Obtiene el valor de la propiedad evaluacionConsumo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     *     
     */
    public JAXBElement<EvaluacionEconomicaConsumo> getEvaluacionConsumo() {
        return evaluacionConsumo;
    }

    /**
     * Define el valor de la propiedad evaluacionConsumo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     *     
     */
    public void setEvaluacionConsumo(JAXBElement<EvaluacionEconomicaConsumo> value) {
        this.evaluacionConsumo = value;
    }

    /**
     * Obtiene el valor de la propiedad evaluacionMicro.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     *     
     */
    public JAXBElement<EvaluacionEconomicaMicro> getEvaluacionMicro() {
        return evaluacionMicro;
    }

    /**
     * Define el valor de la propiedad evaluacionMicro.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     *     
     */
    public void setEvaluacionMicro(JAXBElement<EvaluacionEconomicaMicro> value) {
        this.evaluacionMicro = value;
    }

    /**
     * Obtiene el valor de la propiedad listaActivos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleActivo> getListaActivos() {
        return listaActivos;
    }

    /**
     * Define el valor de la propiedad listaActivos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     *     
     */
    public void setListaActivos(JAXBElement<ArrayOfDetalleActivo> value) {
        this.listaActivos = value;
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

    /**
     * Obtiene el valor de la propiedad listaPasivos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetallePasivo> getListaPasivos() {
        return listaPasivos;
    }

    /**
     * Define el valor de la propiedad listaPasivos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     *     
     */
    public void setListaPasivos(JAXBElement<ArrayOfDetallePasivo> value) {
        this.listaPasivos = value;
    }

    /**
     * Obtiene el valor de la propiedad rubros.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRubroIngresoEgreso> getRubros() {
        return rubros;
    }

    /**
     * Define el valor de la propiedad rubros.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     *     
     */
    public void setRubros(JAXBElement<ArrayOfRubroIngresoEgreso> value) {
        this.rubros = value;
    }

    /**
     * Obtiene el valor de la propiedad rubrosPareja.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRubroIngresoEgreso> getRubrosPareja() {
        return rubrosPareja;
    }

    /**
     * Define el valor de la propiedad rubrosPareja.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     *     
     */
    public void setRubrosPareja(JAXBElement<ArrayOfRubroIngresoEgreso> value) {
        this.rubrosPareja = value;
    }

}
