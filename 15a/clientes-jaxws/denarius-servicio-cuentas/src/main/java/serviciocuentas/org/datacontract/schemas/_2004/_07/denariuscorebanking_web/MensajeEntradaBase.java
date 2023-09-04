
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaAhorroProgramado;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECanjeLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECompensacionTarjetaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaDatosTarjeta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaSaldoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaSaldosTarjetasCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaTarjetaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaTransferenciasSPI;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasMovimientos;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEContratoCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECrearCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosChequeDevolver;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosCheques;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosUsuario;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDocumentosCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEEstadoCuentaDigital;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEMonederoElectronico;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MENdNc;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MENdNcAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MENotaDC;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPagoSpi;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPagoTarjeta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERenovacionAhorro;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReversoNdNc;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimularAhorro;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METelefono;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransaccionCanales;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransaccionCorresponsales;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransaccionKisko;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransaccionPagoServicios;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransaccionTarjetaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransferencia;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransferenciaMonederoElectronico;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransferenciaPagoDirecto;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METransferenciaSpi;


/**
 * <p>Clase Java para MensajeEntradaBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MensajeEntradaBase"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cabecera" type="{http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices}Cabecera" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeEntradaBase", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    MEIdentificacionCliente.class,
    MEConsultasCuenta.class,
    MENdNc.class,
    MEReversoNdNc.class,
    MENdNcAtm.class,
    MEConsultasLibreta.class,
    MECanjeLibreta.class,
    MEConsultasMovimientos.class,
    MEConsultaSaldoAtm.class,
    METransferenciaSpi.class,
    MENotaDC.class,
    MEDatosChequeDevolver.class,
    MEDatosUsuario.class,
    MEDatosCheques.class,
    METransferencia.class,
    MEConsultasCliente.class,
    METransferenciaPagoDirecto.class,
    MEMonederoElectronico.class,
    METransferenciaMonederoElectronico.class,
    METransaccionTarjetaDebito.class,
    MEConsultaTarjetaDebito.class,
    MECompensacionTarjetaDebito.class,
    METelefono.class,
    METransaccionCanales.class,
    MECrearCuenta.class,
    MESimularAhorro.class,
    MEAperturaAhorroProgramado.class,
    MERenovacionAhorro.class,
    MECreacionCliente.class,
    MEPagoSpi.class,
    MEAperturaCuenta.class,
    METransaccionPagoServicios.class,
    MEConsultaSaldosTarjetasCliente.class,
    MEPagoTarjeta.class,
    MEConsultaDatosTarjeta.class,
    METransaccionCorresponsales.class,
    MEDocumentosCuenta.class,
    MEConsultaCuenta.class,
    METransaccionKisko.class,
    MEConsultaTransferenciasSPI.class,
    MEContratoCuenta.class,
    MEEstadoCuentaDigital.class
})
public class MensajeEntradaBase {

    @XmlElementRef(name = "Cabecera", namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices", type = JAXBElement.class, required = false)
    protected JAXBElement<Cabecera> cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public JAXBElement<Cabecera> getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cabecera }{@code >}
     *     
     */
    public void setCabecera(JAXBElement<Cabecera> value) {
        this.cabecera = value;
    }

}
