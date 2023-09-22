
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;


/**
 * <p>Clase Java para MSConsultaMovimientosCorresponsales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MSConsultaMovimientosCorresponsales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}MensajeSalidaBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Movimientos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}ArrayOfMovimiento" minOccurs="0"/&gt;
 *         &lt;element name="Saldos" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas}DatosSaldos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MSConsultaMovimientosCorresponsales", propOrder = {
    "movimientos",
    "saldos"
})
public class MSConsultaMovimientosCorresponsales
    extends MensajeSalidaBase
{

    @XmlElementRef(name = "Movimientos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMovimiento> movimientos;
    @XmlElementRef(name = "Saldos", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", type = JAXBElement.class, required = false)
    protected JAXBElement<DatosSaldos> saldos;

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

    /**
     * Obtiene el valor de la propiedad saldos.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     *     
     */
    public JAXBElement<DatosSaldos> getSaldos() {
        return saldos;
    }

    /**
     * Define el valor de la propiedad saldos.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     *     
     */
    public void setSaldos(JAXBElement<DatosSaldos> value) {
        this.saldos = value;
    }

}
