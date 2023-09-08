
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAprobarFase;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECalcularCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECarpetaDocumentosCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaScore;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaSolicitudAutomotriz;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasGarantia;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionGarantia;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreditoAutomotriz;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreditoCanales;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreditoConsolidado;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreditos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDocumentoCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDocumentoFirmaElectronica;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFirmaElectronicaPersona;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEGuardarCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionEvaluacion;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPagoExtraordinarioCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReasignacionGarantia;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERegistroPago;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERenovacionCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERespuestaFirmaElectronica;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERiesgoAmbiental;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacion;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METipoCartera;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METipoProcesoCredito;


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
    MECreditos.class,
    MEConsultasCredito.class,
    MECreacionGarantia.class,
    MEReasignacionGarantia.class,
    MEConsultasGarantia.class,
    METipoCartera.class,
    MERegistroPago.class,
    MESimulacion.class,
    MEConsultaScore.class,
    MECreditoCanales.class,
    MEDocumentoCredito.class,
    MECreditoConsolidado.class,
    MECreditoAutomotriz.class,
    MEConsultaSolicitudAutomotriz.class,
    MERenovacionCredito.class,
    METipoProcesoCredito.class,
    MECalcularCredito.class,
    MEGuardarCredito.class,
    MEInformacionEvaluacion.class,
    MECreacionCredito.class,
    MECarpetaDocumentosCredito.class,
    MEAprobarFase.class,
    MERiesgoAmbiental.class,
    MEPagoExtraordinarioCredito.class,
    MEDocumentoFirmaElectronica.class,
    MEFirmaElectronicaPersona.class,
    MERespuestaFirmaElectronica.class,
    MEIdentificacionCliente.class
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
