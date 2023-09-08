
package servicioinversiones.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAperturaInversionSolicitud;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaProducto;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInstruccionInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacionInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MESimulacionInversionCliente;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosInversionCliente;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDetalleInversion;
import servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSSimulacionInversion;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the externalservices.web.corebanking.denarius package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarSaldosCuentasMeInversiones_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meInversiones");
    private final static QName _ConsultarSaldosCuentasResponseConsultarSaldosCuentasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosCuentasResult");
    private final static QName _ConsultarDetalleInversionMeInversion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meInversion");
    private final static QName _ConsultarDetalleInversionResponseConsultarDetalleInversionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDetalleInversionResult");
    private final static QName _SimularInversionMeSimulacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meSimulacion");
    private final static QName _SimularInversionResponseSimularInversionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SimularInversionResult");
    private final static QName _SimularInversionClienteResponseSimularInversionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SimularInversionClienteResult");
    private final static QName _AperturarInversionMeApertura_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meApertura");
    private final static QName _AperturarInversionResponseAperturarInversionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AperturarInversionResult");
    private final static QName _IngresarCancelacionRenovacionInversionMeInstruccion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meInstruccion");
    private final static QName _IngresarCancelacionRenovacionInversionResponseIngresarCancelacionRenovacionInversionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "IngresarCancelacionRenovacionInversionResult");
    private final static QName _GenerarCertificadosCaptacionesRenovadasMeLiquidacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meLiquidacion");
    private final static QName _GenerarCertificadosCaptacionesRenovadasResponseGenerarCertificadosCaptacionesRenovadasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarCertificadosCaptacionesRenovadasResult");
    private final static QName _AperturarInversionSolicitudResponseAperturarInversionSolicitudResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AperturarInversionSolicitudResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: externalservices.web.corebanking.denarius
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarSaldosCuentas }
     * 
     */
    public ConsultarSaldosCuentas createConsultarSaldosCuentas() {
        return new ConsultarSaldosCuentas();
    }

    /**
     * Create an instance of {@link ConsultarSaldosCuentasResponse }
     * 
     */
    public ConsultarSaldosCuentasResponse createConsultarSaldosCuentasResponse() {
        return new ConsultarSaldosCuentasResponse();
    }

    /**
     * Create an instance of {@link ConsultarDetalleInversion }
     * 
     */
    public ConsultarDetalleInversion createConsultarDetalleInversion() {
        return new ConsultarDetalleInversion();
    }

    /**
     * Create an instance of {@link ConsultarDetalleInversionResponse }
     * 
     */
    public ConsultarDetalleInversionResponse createConsultarDetalleInversionResponse() {
        return new ConsultarDetalleInversionResponse();
    }

    /**
     * Create an instance of {@link SimularInversion }
     * 
     */
    public SimularInversion createSimularInversion() {
        return new SimularInversion();
    }

    /**
     * Create an instance of {@link SimularInversionResponse }
     * 
     */
    public SimularInversionResponse createSimularInversionResponse() {
        return new SimularInversionResponse();
    }

    /**
     * Create an instance of {@link SimularInversionCliente }
     * 
     */
    public SimularInversionCliente createSimularInversionCliente() {
        return new SimularInversionCliente();
    }

    /**
     * Create an instance of {@link SimularInversionClienteResponse }
     * 
     */
    public SimularInversionClienteResponse createSimularInversionClienteResponse() {
        return new SimularInversionClienteResponse();
    }

    /**
     * Create an instance of {@link AperturarInversion }
     * 
     */
    public AperturarInversion createAperturarInversion() {
        return new AperturarInversion();
    }

    /**
     * Create an instance of {@link AperturarInversionResponse }
     * 
     */
    public AperturarInversionResponse createAperturarInversionResponse() {
        return new AperturarInversionResponse();
    }

    /**
     * Create an instance of {@link IngresarCancelacionRenovacionInversion }
     * 
     */
    public IngresarCancelacionRenovacionInversion createIngresarCancelacionRenovacionInversion() {
        return new IngresarCancelacionRenovacionInversion();
    }

    /**
     * Create an instance of {@link IngresarCancelacionRenovacionInversionResponse }
     * 
     */
    public IngresarCancelacionRenovacionInversionResponse createIngresarCancelacionRenovacionInversionResponse() {
        return new IngresarCancelacionRenovacionInversionResponse();
    }

    /**
     * Create an instance of {@link GenerarCertificadosCaptacionesRenovadas }
     * 
     */
    public GenerarCertificadosCaptacionesRenovadas createGenerarCertificadosCaptacionesRenovadas() {
        return new GenerarCertificadosCaptacionesRenovadas();
    }

    /**
     * Create an instance of {@link GenerarCertificadosCaptacionesRenovadasResponse }
     * 
     */
    public GenerarCertificadosCaptacionesRenovadasResponse createGenerarCertificadosCaptacionesRenovadasResponse() {
        return new GenerarCertificadosCaptacionesRenovadasResponse();
    }

    /**
     * Create an instance of {@link AperturarInversionSolicitud }
     * 
     */
    public AperturarInversionSolicitud createAperturarInversionSolicitud() {
        return new AperturarInversionSolicitud();
    }

    /**
     * Create an instance of {@link AperturarInversionSolicitudResponse }
     * 
     */
    public AperturarInversionSolicitudResponse createAperturarInversionSolicitudResponse() {
        return new AperturarInversionSolicitudResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meInversiones", scope = ConsultarSaldosCuentas.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarSaldosCuentasMeInversiones(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarSaldosCuentasMeInversiones_QNAME, MEIdentificacionCliente.class, ConsultarSaldosCuentas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosCuentasResult", scope = ConsultarSaldosCuentasResponse.class)
    public JAXBElement<MSConsultasInversion> createConsultarSaldosCuentasResponseConsultarSaldosCuentasResult(MSConsultasInversion value) {
        return new JAXBElement<MSConsultasInversion>(_ConsultarSaldosCuentasResponseConsultarSaldosCuentasResult_QNAME, MSConsultasInversion.class, ConsultarSaldosCuentasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaProducto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meInversion", scope = ConsultarDetalleInversion.class)
    public JAXBElement<MEConsultaProducto> createConsultarDetalleInversionMeInversion(MEConsultaProducto value) {
        return new JAXBElement<MEConsultaProducto>(_ConsultarDetalleInversionMeInversion_QNAME, MEConsultaProducto.class, ConsultarDetalleInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDetalleInversionResult", scope = ConsultarDetalleInversionResponse.class)
    public JAXBElement<MSDetalleInversion> createConsultarDetalleInversionResponseConsultarDetalleInversionResult(MSDetalleInversion value) {
        return new JAXBElement<MSDetalleInversion>(_ConsultarDetalleInversionResponseConsultarDetalleInversionResult_QNAME, MSDetalleInversion.class, ConsultarDetalleInversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meSimulacion", scope = SimularInversion.class)
    public JAXBElement<MESimulacionInversion> createSimularInversionMeSimulacion(MESimulacionInversion value) {
        return new JAXBElement<MESimulacionInversion>(_SimularInversionMeSimulacion_QNAME, MESimulacionInversion.class, SimularInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SimularInversionResult", scope = SimularInversionResponse.class)
    public JAXBElement<MSSimulacionInversion> createSimularInversionResponseSimularInversionResult(MSSimulacionInversion value) {
        return new JAXBElement<MSSimulacionInversion>(_SimularInversionResponseSimularInversionResult_QNAME, MSSimulacionInversion.class, SimularInversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacionInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacionInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meSimulacion", scope = SimularInversionCliente.class)
    public JAXBElement<MESimulacionInversionCliente> createSimularInversionClienteMeSimulacion(MESimulacionInversionCliente value) {
        return new JAXBElement<MESimulacionInversionCliente>(_SimularInversionMeSimulacion_QNAME, MESimulacionInversionCliente.class, SimularInversionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SimularInversionClienteResult", scope = SimularInversionClienteResponse.class)
    public JAXBElement<MSDatosInversionCliente> createSimularInversionClienteResponseSimularInversionClienteResult(MSDatosInversionCliente value) {
        return new JAXBElement<MSDatosInversionCliente>(_SimularInversionClienteResponseSimularInversionClienteResult_QNAME, MSDatosInversionCliente.class, SimularInversionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meApertura", scope = AperturarInversion.class)
    public JAXBElement<MEAperturaInversion> createAperturarInversionMeApertura(MEAperturaInversion value) {
        return new JAXBElement<MEAperturaInversion>(_AperturarInversionMeApertura_QNAME, MEAperturaInversion.class, AperturarInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AperturarInversionResult", scope = AperturarInversionResponse.class)
    public JAXBElement<MSDatosInversionCliente> createAperturarInversionResponseAperturarInversionResult(MSDatosInversionCliente value) {
        return new JAXBElement<MSDatosInversionCliente>(_AperturarInversionResponseAperturarInversionResult_QNAME, MSDatosInversionCliente.class, AperturarInversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInstruccionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInstruccionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meInstruccion", scope = IngresarCancelacionRenovacionInversion.class)
    public JAXBElement<MEInstruccionInversion> createIngresarCancelacionRenovacionInversionMeInstruccion(MEInstruccionInversion value) {
        return new JAXBElement<MEInstruccionInversion>(_IngresarCancelacionRenovacionInversionMeInstruccion_QNAME, MEInstruccionInversion.class, IngresarCancelacionRenovacionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "IngresarCancelacionRenovacionInversionResult", scope = IngresarCancelacionRenovacionInversionResponse.class)
    public JAXBElement<MSDatosInversionCliente> createIngresarCancelacionRenovacionInversionResponseIngresarCancelacionRenovacionInversionResult(MSDatosInversionCliente value) {
        return new JAXBElement<MSDatosInversionCliente>(_IngresarCancelacionRenovacionInversionResponseIngresarCancelacionRenovacionInversionResult_QNAME, MSDatosInversionCliente.class, IngresarCancelacionRenovacionInversionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meLiquidacion", scope = GenerarCertificadosCaptacionesRenovadas.class)
    public JAXBElement<MensajeEntradaBase> createGenerarCertificadosCaptacionesRenovadasMeLiquidacion(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarCertificadosCaptacionesRenovadasMeLiquidacion_QNAME, MensajeEntradaBase.class, GenerarCertificadosCaptacionesRenovadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarCertificadosCaptacionesRenovadasResult", scope = GenerarCertificadosCaptacionesRenovadasResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarCertificadosCaptacionesRenovadasResponseGenerarCertificadosCaptacionesRenovadasResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarCertificadosCaptacionesRenovadasResponseGenerarCertificadosCaptacionesRenovadasResult_QNAME, MensajeSalidaBase.class, GenerarCertificadosCaptacionesRenovadasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaInversionSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaInversionSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meApertura", scope = AperturarInversionSolicitud.class)
    public JAXBElement<MEAperturaInversionSolicitud> createAperturarInversionSolicitudMeApertura(MEAperturaInversionSolicitud value) {
        return new JAXBElement<MEAperturaInversionSolicitud>(_AperturarInversionMeApertura_QNAME, MEAperturaInversionSolicitud.class, AperturarInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AperturarInversionSolicitudResult", scope = AperturarInversionSolicitudResponse.class)
    public JAXBElement<MSDatosInversion> createAperturarInversionSolicitudResponseAperturarInversionSolicitudResult(MSDatosInversion value) {
        return new JAXBElement<MSDatosInversion>(_AperturarInversionSolicitudResponseAperturarInversionSolicitudResult_QNAME, MSDatosInversion.class, AperturarInversionSolicitudResponse.class, value);
    }

}
