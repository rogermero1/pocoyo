
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasDatosCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasDatosCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosGeneralesCliente" minOccurs="0"/&gt;
 *         &lt;element name="DatosCuenta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosGeneralesCuenta" minOccurs="0"/&gt;
 *         &lt;element name="NombreAgencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasDatosCuenta", propOrder = {
    "datosCliente",
    "datosCuenta",
    "nombreAgencia"
})
public class MSConsultasDatosCuenta
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "DatosCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCliente> datosCliente;
    @XmlElementRef(name = "DatosCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCuenta> datosCuenta;
    @XmlElementRef(name = "NombreAgencia", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreAgencia;

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     *     
     */
    public JAXBElement<DatosGeneralesCliente> getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     *     
     */
    public void setDatosCliente(JAXBElement<DatosGeneralesCliente> value) {
        this.datosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     *     
     */
    public JAXBElement<DatosGeneralesCuenta> getDatosCuenta() {
        return datosCuenta;
    }

    /**
     * Define el valor de la propiedad datosCuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     *     
     */
    public void setDatosCuenta(JAXBElement<DatosGeneralesCuenta> value) {
        this.datosCuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreAgencia.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreAgencia() {
        return nombreAgencia;
    }

    /**
     * Define el valor de la propiedad nombreAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreAgencia(JAXBElement<String> value) {
        this.nombreAgencia = value;
    }

}
