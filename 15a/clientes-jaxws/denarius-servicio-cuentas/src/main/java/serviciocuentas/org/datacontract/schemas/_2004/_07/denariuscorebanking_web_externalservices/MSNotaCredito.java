
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSNotaCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSNotaCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosCliente" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes}DatosGeneralesCliente" minOccurs="0"/&gt;
 *         &lt;element name="DatosCuenta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosGeneralesCuenta" minOccurs="0"/&gt;
 *         &lt;element name="GenerarFormularioOrigenFondos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MontoAcumulado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Resultado" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ResultadoNdNc" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSNotaCredito", propOrder = {
    "datosCliente",
    "datosCuenta",
    "generarFormularioOrigenFondos",
    "montoAcumulado",
    "resultado"
})
public class MSNotaCredito
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "DatosCliente", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCliente> datosCliente;
    @XmlElementRef(name = "DatosCuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosGeneralesCuenta> datosCuenta;
    @XmlElement(name = "GenerarFormularioOrigenFondos")
    protected Boolean generarFormularioOrigenFondos;
    @XmlElement(name = "MontoAcumulado")
    protected BigDecimal montoAcumulado;
    @XmlElementRef(name = "Resultado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ResultadoNdNc> resultado;

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
     * Obtiene el valor de la propiedad generarFormularioOrigenFondos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerarFormularioOrigenFondos() {
        return generarFormularioOrigenFondos;
    }

    /**
     * Define el valor de la propiedad generarFormularioOrigenFondos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerarFormularioOrigenFondos(Boolean value) {
        this.generarFormularioOrigenFondos = value;
    }

    /**
     * Obtiene el valor de la propiedad montoAcumulado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoAcumulado() {
        return montoAcumulado;
    }

    /**
     * Define el valor de la propiedad montoAcumulado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoAcumulado(BigDecimal value) {
        this.montoAcumulado = value;
    }

    /**
     * Obtiene el valor de la propiedad resultado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     *     
     */
    public JAXBElement<ResultadoNdNc> getResultado() {
        return resultado;
    }

    /**
     * Define el valor de la propiedad resultado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     *     
     */
    public void setResultado(JAXBElement<ResultadoNdNc> value) {
        this.resultado = value;
    }

}
