
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultasMovimientosCuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultasMovimientosCuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}CuentaLibreta" minOccurs="0"/&gt;
 *         &lt;element name="CuotasAhorroProgramado" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfDatosCuotasAhorroProgramado" minOccurs="0"/&gt;
 *         &lt;element name="DetallesInteresDiario" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfDetalleInteresDiario" minOccurs="0"/&gt;
 *         &lt;element name="IdentificacionTitular" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Movimientos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfMovimiento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultasMovimientosCuenta", propOrder = {
    "cuenta",
    "cuotasAhorroProgramado",
    "detallesInteresDiario",
    "identificacionTitular",
    "movimientos"
})
public class MSConsultasMovimientosCuenta
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Cuenta", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<CuentaLibreta> cuenta;
    @XmlElementRef(name = "CuotasAhorroProgramado", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosCuotasAhorroProgramado> cuotasAhorroProgramado;
    @XmlElementRef(name = "DetallesInteresDiario", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetalleInteresDiario> detallesInteresDiario;
    @XmlElement(name = "IdentificacionTitular")
    protected Boolean identificacionTitular;
    @XmlElementRef(name = "Movimientos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimiento> movimientos;

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     *     
     */
    public JAXBElement<CuentaLibreta> getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     *     
     */
    public void setCuenta(JAXBElement<CuentaLibreta> value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotasAhorroProgramado.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosCuotasAhorroProgramado> getCuotasAhorroProgramado() {
        return cuotasAhorroProgramado;
    }

    /**
     * Define el valor de la propiedad cuotasAhorroProgramado.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     *     
     */
    public void setCuotasAhorroProgramado(JAXBElement<ArrayOfDatosCuotasAhorroProgramado> value) {
        this.cuotasAhorroProgramado = value;
    }

    /**
     * Obtiene el valor de la propiedad detallesInteresDiario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetalleInteresDiario> getDetallesInteresDiario() {
        return detallesInteresDiario;
    }

    /**
     * Define el valor de la propiedad detallesInteresDiario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     *     
     */
    public void setDetallesInteresDiario(JAXBElement<ArrayOfDetalleInteresDiario> value) {
        this.detallesInteresDiario = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionTitular.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdentificacionTitular() {
        return identificacionTitular;
    }

    /**
     * Define el valor de la propiedad identificacionTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdentificacionTitular(Boolean value) {
        this.identificacionTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad movimientos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfMovimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Define el valor de la propiedad movimientos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     *     
     */
    public void setMovimientos(JAXBElement<ArrayOfMovimiento> value) {
        this.movimientos = value;
    }

}
