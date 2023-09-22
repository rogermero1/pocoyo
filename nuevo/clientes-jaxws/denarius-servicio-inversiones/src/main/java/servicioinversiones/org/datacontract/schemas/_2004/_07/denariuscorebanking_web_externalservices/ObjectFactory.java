
package servicioinversiones.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices package. 
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

    private final static QName _MEConsultaProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "MEConsultaProducto");
    private final static QName _ArrayOfDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ArrayOfDocumento");
    private final static QName _Documento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Documento");
    private final static QName _MSConsultasInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MSConsultasInversion");
    private final static QName _DatosInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "DatosInversion");
    private final static QName _ArrayOfDatosInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ArrayOfDatosInversion");
    private final static QName _MSDetalleInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MSDetalleInversion");
    private final static QName _ArrayOfClienteCaptacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ArrayOfClienteCaptacion");
    private final static QName _ClienteCaptacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ClienteCaptacion");
    private final static QName _ArrayOfPagoPeriodico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ArrayOfPagoPeriodico");
    private final static QName _PagoPeriodico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "PagoPeriodico");
    private final static QName _MESimulacionInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MESimulacionInversion");
    private final static QName _MSSimulacionInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MSSimulacionInversion");
    private final static QName _ArrayOfDatosSimulacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ArrayOfDatosSimulacion");
    private final static QName _DatosSimulacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "DatosSimulacion");
    private final static QName _MESimulacionInversionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MESimulacionInversionCliente");
    private final static QName _MSDatosInversionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MSDatosInversionCliente");
    private final static QName _MEAperturaInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MEAperturaInversion");
    private final static QName _MEInstruccionInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MEInstruccionInversion");
    private final static QName _MEAperturaInversionSolicitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MEAperturaInversionSolicitud");
    private final static QName _MSDatosInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MSDatosInversion");
    private final static QName _DatosSimulacionRangoPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "RangoPlazo");
    private final static QName _ClienteCaptacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Cliente");
    private final static QName _ClienteCaptacionIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Identificacion");
    private final static QName _ClienteCaptacionRolCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "RolCliente");
    private final static QName _DatosInversionActividadEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "ActividadEconomica");
    private final static QName _DatosInversionCodigoEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "CodigoEstado");
    private final static QName _DatosInversionDetalleOrigRecurso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "DetalleOrigRecurso");
    private final static QName _DatosInversionEndosado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Endosado");
    private final static QName _DatosInversionEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Estado");
    private final static QName _DatosInversionFechaCancelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "FechaCancelacion");
    private final static QName _DatosInversionFechaEfectivizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "FechaEfectivizacion");
    private final static QName _DatosInversionFechaNegociacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "FechaNegociacion");
    private final static QName _DatosInversionFechaProximoInteres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "FechaProximoInteres");
    private final static QName _DatosInversionMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Moneda");
    private final static QName _DatosInversionMonedaCodigoIso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MonedaCodigoIso");
    private final static QName _DatosInversionMonedaSimbolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "MonedaSimbolo");
    private final static QName _DatosInversionMonto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Monto");
    private final static QName _DatosInversionNumeroOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "NumeroOperacion");
    private final static QName _DatosInversionOficialCaptador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "OficialCaptador");
    private final static QName _DatosInversionOficialPrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "OficialPrincipal");
    private final static QName _DatosInversionOrigRecursosString_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "OrigRecursosString");
    private final static QName _DatosInversionReajustable_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Reajustable");
    private final static QName _DatosInversionTipoCaptacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TipoCaptacion");
    private final static QName _DatosInversionTipoPagoInteres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TipoPagoInteres");
    private final static QName _MSDatosInversionTablaPagos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TablaPagos");
    private final static QName _MEAperturaInversionSolicitudDocumentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Documentos");
    private final static QName _MEAperturaInversionSolicitudNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "NumeroCuenta");
    private final static QName _MEAperturaInversionSolicitudPagoInteres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "PagoInteres");
    private final static QName _MEAperturaInversionSolicitudTasaPreferencial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TasaPreferencial");
    private final static QName _MEInstruccionInversionCodigoInstruccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "CodigoInstruccion");
    private final static QName _MEInstruccionInversionCorreoNotificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "CorreoNotificacion");
    private final static QName _MEInstruccionInversionIdValidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "IdValidacion");
    private final static QName _MEInstruccionInversionTelefonoNotificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TelefonoNotificacion");
    private final static QName _MEAperturaInversionFormaRecepcionAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "FormaRecepcionAdicional");
    private final static QName _MEAperturaInversionNumeroCuentaCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "NumeroCuentaCredito");
    private final static QName _MEAperturaInversionNumeroCuentaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "NumeroCuentaDebito");
    private final static QName _MSSimulacionInversionTablaSimulaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "TablaSimulaciones");
    private final static QName _MSDetalleInversionIntervinientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Intervinientes");
    private final static QName _MSDetalleInversionInversion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Inversion");
    private final static QName _MSDetalleInversionPagosPeriodicos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "PagosPeriodicos");
    private final static QName _MSConsultasInversionInversiones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", "Inversiones");
    private final static QName _DocumentoClaseDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ClaseDocumento");
    private final static QName _DocumentoCodigoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigoTipoDocumento");
    private final static QName _DocumentoContenido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Contenido");
    private final static QName _DocumentoContenidoReverso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ContenidoReverso");
    private final static QName _DocumentoEnlace_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Enlace");
    private final static QName _DocumentoEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Estado");
    private final static QName _DocumentoExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Extension");
    private final static QName _DocumentoIdCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdCliente");
    private final static QName _DocumentoIdEnvio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdEnvio");
    private final static QName _DocumentoLoginDigitalizador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "LoginDigitalizador");
    private final static QName _DocumentoNombreArchivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NombreArchivo");
    private final static QName _DocumentoObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Observaciones");
    private final static QName _DocumentoRolCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "RolCliente");
    private final static QName _DocumentoTipoContenido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "TipoContenido");
    private final static QName _DocumentoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "TipoDocumento");
    private final static QName _MEConsultaProductoNumeroProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NumeroProducto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MEConsultaProducto }
     * 
     */
    public MEConsultaProducto createMEConsultaProducto() {
        return new MEConsultaProducto();
    }

    /**
     * Create an instance of {@link ArrayOfDocumento }
     * 
     */
    public ArrayOfDocumento createArrayOfDocumento() {
        return new ArrayOfDocumento();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link MSConsultasInversion }
     * 
     */
    public MSConsultasInversion createMSConsultasInversion() {
        return new MSConsultasInversion();
    }

    /**
     * Create an instance of {@link MSDetalleInversion }
     * 
     */
    public MSDetalleInversion createMSDetalleInversion() {
        return new MSDetalleInversion();
    }

    /**
     * Create an instance of {@link MESimulacionInversion }
     * 
     */
    public MESimulacionInversion createMESimulacionInversion() {
        return new MESimulacionInversion();
    }

    /**
     * Create an instance of {@link MSSimulacionInversion }
     * 
     */
    public MSSimulacionInversion createMSSimulacionInversion() {
        return new MSSimulacionInversion();
    }

    /**
     * Create an instance of {@link MESimulacionInversionCliente }
     * 
     */
    public MESimulacionInversionCliente createMESimulacionInversionCliente() {
        return new MESimulacionInversionCliente();
    }

    /**
     * Create an instance of {@link MSDatosInversionCliente }
     * 
     */
    public MSDatosInversionCliente createMSDatosInversionCliente() {
        return new MSDatosInversionCliente();
    }

    /**
     * Create an instance of {@link MEAperturaInversion }
     * 
     */
    public MEAperturaInversion createMEAperturaInversion() {
        return new MEAperturaInversion();
    }

    /**
     * Create an instance of {@link MEInstruccionInversion }
     * 
     */
    public MEInstruccionInversion createMEInstruccionInversion() {
        return new MEInstruccionInversion();
    }

    /**
     * Create an instance of {@link MEAperturaInversionSolicitud }
     * 
     */
    public MEAperturaInversionSolicitud createMEAperturaInversionSolicitud() {
        return new MEAperturaInversionSolicitud();
    }

    /**
     * Create an instance of {@link MSDatosInversion }
     * 
     */
    public MSDatosInversion createMSDatosInversion() {
        return new MSDatosInversion();
    }

    /**
     * Create an instance of {@link DatosInversion }
     * 
     */
    public DatosInversion createDatosInversion() {
        return new DatosInversion();
    }

    /**
     * Create an instance of {@link ArrayOfDatosInversion }
     * 
     */
    public ArrayOfDatosInversion createArrayOfDatosInversion() {
        return new ArrayOfDatosInversion();
    }

    /**
     * Create an instance of {@link ArrayOfClienteCaptacion }
     * 
     */
    public ArrayOfClienteCaptacion createArrayOfClienteCaptacion() {
        return new ArrayOfClienteCaptacion();
    }

    /**
     * Create an instance of {@link ClienteCaptacion }
     * 
     */
    public ClienteCaptacion createClienteCaptacion() {
        return new ClienteCaptacion();
    }

    /**
     * Create an instance of {@link ArrayOfPagoPeriodico }
     * 
     */
    public ArrayOfPagoPeriodico createArrayOfPagoPeriodico() {
        return new ArrayOfPagoPeriodico();
    }

    /**
     * Create an instance of {@link PagoPeriodico }
     * 
     */
    public PagoPeriodico createPagoPeriodico() {
        return new PagoPeriodico();
    }

    /**
     * Create an instance of {@link ArrayOfDatosSimulacion }
     * 
     */
    public ArrayOfDatosSimulacion createArrayOfDatosSimulacion() {
        return new ArrayOfDatosSimulacion();
    }

    /**
     * Create an instance of {@link DatosSimulacion }
     * 
     */
    public DatosSimulacion createDatosSimulacion() {
        return new DatosSimulacion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaProducto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaProducto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "MEConsultaProducto")
    public JAXBElement<MEConsultaProducto> createMEConsultaProducto(MEConsultaProducto value) {
        return new JAXBElement<MEConsultaProducto>(_MEConsultaProducto_QNAME, MEConsultaProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ArrayOfDocumento")
    public JAXBElement<ArrayOfDocumento> createArrayOfDocumento(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_ArrayOfDocumento_QNAME, ArrayOfDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Documento")
    public JAXBElement<Documento> createDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MSConsultasInversion")
    public JAXBElement<MSConsultasInversion> createMSConsultasInversion(MSConsultasInversion value) {
        return new JAXBElement<MSConsultasInversion>(_MSConsultasInversion_QNAME, MSConsultasInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "DatosInversion")
    public JAXBElement<DatosInversion> createDatosInversion(DatosInversion value) {
        return new JAXBElement<DatosInversion>(_DatosInversion_QNAME, DatosInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ArrayOfDatosInversion")
    public JAXBElement<ArrayOfDatosInversion> createArrayOfDatosInversion(ArrayOfDatosInversion value) {
        return new JAXBElement<ArrayOfDatosInversion>(_ArrayOfDatosInversion_QNAME, ArrayOfDatosInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDetalleInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MSDetalleInversion")
    public JAXBElement<MSDetalleInversion> createMSDetalleInversion(MSDetalleInversion value) {
        return new JAXBElement<MSDetalleInversion>(_MSDetalleInversion_QNAME, MSDetalleInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ArrayOfClienteCaptacion")
    public JAXBElement<ArrayOfClienteCaptacion> createArrayOfClienteCaptacion(ArrayOfClienteCaptacion value) {
        return new JAXBElement<ArrayOfClienteCaptacion>(_ArrayOfClienteCaptacion_QNAME, ArrayOfClienteCaptacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteCaptacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClienteCaptacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ClienteCaptacion")
    public JAXBElement<ClienteCaptacion> createClienteCaptacion(ClienteCaptacion value) {
        return new JAXBElement<ClienteCaptacion>(_ClienteCaptacion_QNAME, ClienteCaptacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ArrayOfPagoPeriodico")
    public JAXBElement<ArrayOfPagoPeriodico> createArrayOfPagoPeriodico(ArrayOfPagoPeriodico value) {
        return new JAXBElement<ArrayOfPagoPeriodico>(_ArrayOfPagoPeriodico_QNAME, ArrayOfPagoPeriodico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagoPeriodico")
    public JAXBElement<PagoPeriodico> createPagoPeriodico(PagoPeriodico value) {
        return new JAXBElement<PagoPeriodico>(_PagoPeriodico_QNAME, PagoPeriodico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MESimulacionInversion")
    public JAXBElement<MESimulacionInversion> createMESimulacionInversion(MESimulacionInversion value) {
        return new JAXBElement<MESimulacionInversion>(_MESimulacionInversion_QNAME, MESimulacionInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimulacionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MSSimulacionInversion")
    public JAXBElement<MSSimulacionInversion> createMSSimulacionInversion(MSSimulacionInversion value) {
        return new JAXBElement<MSSimulacionInversion>(_MSSimulacionInversion_QNAME, MSSimulacionInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ArrayOfDatosSimulacion")
    public JAXBElement<ArrayOfDatosSimulacion> createArrayOfDatosSimulacion(ArrayOfDatosSimulacion value) {
        return new JAXBElement<ArrayOfDatosSimulacion>(_ArrayOfDatosSimulacion_QNAME, ArrayOfDatosSimulacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "DatosSimulacion")
    public JAXBElement<DatosSimulacion> createDatosSimulacion(DatosSimulacion value) {
        return new JAXBElement<DatosSimulacion>(_DatosSimulacion_QNAME, DatosSimulacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacionInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacionInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MESimulacionInversionCliente")
    public JAXBElement<MESimulacionInversionCliente> createMESimulacionInversionCliente(MESimulacionInversionCliente value) {
        return new JAXBElement<MESimulacionInversionCliente>(_MESimulacionInversionCliente_QNAME, MESimulacionInversionCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MSDatosInversionCliente")
    public JAXBElement<MSDatosInversionCliente> createMSDatosInversionCliente(MSDatosInversionCliente value) {
        return new JAXBElement<MSDatosInversionCliente>(_MSDatosInversionCliente_QNAME, MSDatosInversionCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MEAperturaInversion")
    public JAXBElement<MEAperturaInversion> createMEAperturaInversion(MEAperturaInversion value) {
        return new JAXBElement<MEAperturaInversion>(_MEAperturaInversion_QNAME, MEAperturaInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInstruccionInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInstruccionInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MEInstruccionInversion")
    public JAXBElement<MEInstruccionInversion> createMEInstruccionInversion(MEInstruccionInversion value) {
        return new JAXBElement<MEInstruccionInversion>(_MEInstruccionInversion_QNAME, MEInstruccionInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaInversionSolicitud }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaInversionSolicitud }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MEAperturaInversionSolicitud")
    public JAXBElement<MEAperturaInversionSolicitud> createMEAperturaInversionSolicitud(MEAperturaInversionSolicitud value) {
        return new JAXBElement<MEAperturaInversionSolicitud>(_MEAperturaInversionSolicitud_QNAME, MEAperturaInversionSolicitud.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MSDatosInversion")
    public JAXBElement<MSDatosInversion> createMSDatosInversion(MSDatosInversion value) {
        return new JAXBElement<MSDatosInversion>(_MSDatosInversion_QNAME, MSDatosInversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "RangoPlazo", scope = DatosSimulacion.class)
    public JAXBElement<String> createDatosSimulacionRangoPlazo(String value) {
        return new JAXBElement<String>(_DatosSimulacionRangoPlazo_QNAME, String.class, DatosSimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Cliente", scope = ClienteCaptacion.class)
    public JAXBElement<String> createClienteCaptacionCliente(String value) {
        return new JAXBElement<String>(_ClienteCaptacionCliente_QNAME, String.class, ClienteCaptacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = ClienteCaptacion.class)
    public JAXBElement<String> createClienteCaptacionIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, ClienteCaptacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "RolCliente", scope = ClienteCaptacion.class)
    public JAXBElement<String> createClienteCaptacionRolCliente(String value) {
        return new JAXBElement<String>(_ClienteCaptacionRolCliente_QNAME, String.class, ClienteCaptacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "ActividadEconomica", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionActividadEconomica(String value) {
        return new JAXBElement<String>(_DatosInversionActividadEconomica_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Cliente", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionCliente(String value) {
        return new JAXBElement<String>(_ClienteCaptacionCliente_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "CodigoEstado", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionCodigoEstado(String value) {
        return new JAXBElement<String>(_DatosInversionCodigoEstado_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "DetalleOrigRecurso", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionDetalleOrigRecurso(String value) {
        return new JAXBElement<String>(_DatosInversionDetalleOrigRecurso_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Endosado", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionEndosado(String value) {
        return new JAXBElement<String>(_DatosInversionEndosado_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Estado", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionEstado(String value) {
        return new JAXBElement<String>(_DatosInversionEstado_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "FechaCancelacion", scope = DatosInversion.class)
    public JAXBElement<XMLGregorianCalendar> createDatosInversionFechaCancelacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosInversionFechaCancelacion_QNAME, XMLGregorianCalendar.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "FechaEfectivizacion", scope = DatosInversion.class)
    public JAXBElement<XMLGregorianCalendar> createDatosInversionFechaEfectivizacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosInversionFechaEfectivizacion_QNAME, XMLGregorianCalendar.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "FechaNegociacion", scope = DatosInversion.class)
    public JAXBElement<XMLGregorianCalendar> createDatosInversionFechaNegociacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosInversionFechaNegociacion_QNAME, XMLGregorianCalendar.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "FechaProximoInteres", scope = DatosInversion.class)
    public JAXBElement<XMLGregorianCalendar> createDatosInversionFechaProximoInteres(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosInversionFechaProximoInteres_QNAME, XMLGregorianCalendar.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Moneda", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionMoneda(String value) {
        return new JAXBElement<String>(_DatosInversionMoneda_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MonedaCodigoIso", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionMonedaCodigoIso(String value) {
        return new JAXBElement<String>(_DatosInversionMonedaCodigoIso_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "MonedaSimbolo", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionMonedaSimbolo(String value) {
        return new JAXBElement<String>(_DatosInversionMonedaSimbolo_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Monto", scope = DatosInversion.class)
    public JAXBElement<BigDecimal> createDatosInversionMonto(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DatosInversionMonto_QNAME, BigDecimal.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroOperacion", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionNumeroOperacion(String value) {
        return new JAXBElement<String>(_DatosInversionNumeroOperacion_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "OficialCaptador", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionOficialCaptador(String value) {
        return new JAXBElement<String>(_DatosInversionOficialCaptador_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "OficialPrincipal", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionOficialPrincipal(String value) {
        return new JAXBElement<String>(_DatosInversionOficialPrincipal_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "OrigRecursosString", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionOrigRecursosString(String value) {
        return new JAXBElement<String>(_DatosInversionOrigRecursosString_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Reajustable", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionReajustable(String value) {
        return new JAXBElement<String>(_DatosInversionReajustable_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TipoCaptacion", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionTipoCaptacion(String value) {
        return new JAXBElement<String>(_DatosInversionTipoCaptacion_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TipoPagoInteres", scope = DatosInversion.class)
    public JAXBElement<String> createDatosInversionTipoPagoInteres(String value) {
        return new JAXBElement<String>(_DatosInversionTipoPagoInteres_QNAME, String.class, DatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Estado", scope = MSDatosInversion.class)
    public JAXBElement<String> createMSDatosInversionEstado(String value) {
        return new JAXBElement<String>(_DatosInversionEstado_QNAME, String.class, MSDatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroOperacion", scope = MSDatosInversion.class)
    public JAXBElement<String> createMSDatosInversionNumeroOperacion(String value) {
        return new JAXBElement<String>(_DatosInversionNumeroOperacion_QNAME, String.class, MSDatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TablaPagos", scope = MSDatosInversion.class)
    public JAXBElement<ArrayOfPagoPeriodico> createMSDatosInversionTablaPagos(ArrayOfPagoPeriodico value) {
        return new JAXBElement<ArrayOfPagoPeriodico>(_MSDatosInversionTablaPagos_QNAME, ArrayOfPagoPeriodico.class, MSDatosInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Documentos", scope = MEAperturaInversionSolicitud.class)
    public JAXBElement<ArrayOfDocumento> createMEAperturaInversionSolicitudDocumentos(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_MEAperturaInversionSolicitudDocumentos_QNAME, ArrayOfDocumento.class, MEAperturaInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = MEAperturaInversionSolicitud.class)
    public JAXBElement<String> createMEAperturaInversionSolicitudIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, MEAperturaInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroCuenta", scope = MEAperturaInversionSolicitud.class)
    public JAXBElement<String> createMEAperturaInversionSolicitudNumeroCuenta(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudNumeroCuenta_QNAME, String.class, MEAperturaInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagoInteres", scope = MEAperturaInversionSolicitud.class)
    public JAXBElement<String> createMEAperturaInversionSolicitudPagoInteres(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudPagoInteres_QNAME, String.class, MEAperturaInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TasaPreferencial", scope = MEAperturaInversionSolicitud.class)
    public JAXBElement<BigDecimal> createMEAperturaInversionSolicitudTasaPreferencial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MEAperturaInversionSolicitudTasaPreferencial_QNAME, BigDecimal.class, MEAperturaInversionSolicitud.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "CodigoInstruccion", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionCodigoInstruccion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionCodigoInstruccion_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "CorreoNotificacion", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionCorreoNotificacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionCorreoNotificacion_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "IdValidacion", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionIdValidacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionIdValidacion_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroCuenta", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionNumeroCuenta(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudNumeroCuenta_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TelefonoNotificacion", scope = MEInstruccionInversion.class)
    public JAXBElement<String> createMEInstruccionInversionTelefonoNotificacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionTelefonoNotificacion_QNAME, String.class, MEInstruccionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "CorreoNotificacion", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionCorreoNotificacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionCorreoNotificacion_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "FormaRecepcionAdicional", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionFormaRecepcionAdicional(String value) {
        return new JAXBElement<String>(_MEAperturaInversionFormaRecepcionAdicional_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "IdValidacion", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionIdValidacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionIdValidacion_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroCuentaCredito", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionNumeroCuentaCredito(String value) {
        return new JAXBElement<String>(_MEAperturaInversionNumeroCuentaCredito_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroCuentaDebito", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionNumeroCuentaDebito(String value) {
        return new JAXBElement<String>(_MEAperturaInversionNumeroCuentaDebito_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagoInteres", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionPagoInteres(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudPagoInteres_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TasaPreferencial", scope = MEAperturaInversion.class)
    public JAXBElement<BigDecimal> createMEAperturaInversionTasaPreferencial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MEAperturaInversionSolicitudTasaPreferencial_QNAME, BigDecimal.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TelefonoNotificacion", scope = MEAperturaInversion.class)
    public JAXBElement<String> createMEAperturaInversionTelefonoNotificacion(String value) {
        return new JAXBElement<String>(_MEInstruccionInversionTelefonoNotificacion_QNAME, String.class, MEAperturaInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "NumeroOperacion", scope = MSDatosInversionCliente.class)
    public JAXBElement<String> createMSDatosInversionClienteNumeroOperacion(String value) {
        return new JAXBElement<String>(_DatosInversionNumeroOperacion_QNAME, String.class, MSDatosInversionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TablaPagos", scope = MSDatosInversionCliente.class)
    public JAXBElement<ArrayOfPagoPeriodico> createMSDatosInversionClienteTablaPagos(ArrayOfPagoPeriodico value) {
        return new JAXBElement<ArrayOfPagoPeriodico>(_MSDatosInversionTablaPagos_QNAME, ArrayOfPagoPeriodico.class, MSDatosInversionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Identificacion", scope = MESimulacionInversionCliente.class)
    public JAXBElement<String> createMESimulacionInversionClienteIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCaptacionIdentificacion_QNAME, String.class, MESimulacionInversionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagoInteres", scope = MESimulacionInversionCliente.class)
    public JAXBElement<String> createMESimulacionInversionClientePagoInteres(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudPagoInteres_QNAME, String.class, MESimulacionInversionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TablaPagos", scope = MSSimulacionInversion.class)
    public JAXBElement<ArrayOfPagoPeriodico> createMSSimulacionInversionTablaPagos(ArrayOfPagoPeriodico value) {
        return new JAXBElement<ArrayOfPagoPeriodico>(_MSDatosInversionTablaPagos_QNAME, ArrayOfPagoPeriodico.class, MSSimulacionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TablaSimulaciones", scope = MSSimulacionInversion.class)
    public JAXBElement<ArrayOfDatosSimulacion> createMSSimulacionInversionTablaSimulaciones(ArrayOfDatosSimulacion value) {
        return new JAXBElement<ArrayOfDatosSimulacion>(_MSSimulacionInversionTablaSimulaciones_QNAME, ArrayOfDatosSimulacion.class, MSSimulacionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagoInteres", scope = MESimulacionInversion.class)
    public JAXBElement<String> createMESimulacionInversionPagoInteres(String value) {
        return new JAXBElement<String>(_MEAperturaInversionSolicitudPagoInteres_QNAME, String.class, MESimulacionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "TasaPreferencial", scope = MESimulacionInversion.class)
    public JAXBElement<BigDecimal> createMESimulacionInversionTasaPreferencial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MEAperturaInversionSolicitudTasaPreferencial_QNAME, BigDecimal.class, MESimulacionInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteCaptacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Intervinientes", scope = MSDetalleInversion.class)
    public JAXBElement<ArrayOfClienteCaptacion> createMSDetalleInversionIntervinientes(ArrayOfClienteCaptacion value) {
        return new JAXBElement<ArrayOfClienteCaptacion>(_MSDetalleInversionIntervinientes_QNAME, ArrayOfClienteCaptacion.class, MSDetalleInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Inversion", scope = MSDetalleInversion.class)
    public JAXBElement<DatosInversion> createMSDetalleInversionInversion(DatosInversion value) {
        return new JAXBElement<DatosInversion>(_MSDetalleInversionInversion_QNAME, DatosInversion.class, MSDetalleInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoPeriodico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "PagosPeriodicos", scope = MSDetalleInversion.class)
    public JAXBElement<ArrayOfPagoPeriodico> createMSDetalleInversionPagosPeriodicos(ArrayOfPagoPeriodico value) {
        return new JAXBElement<ArrayOfPagoPeriodico>(_MSDetalleInversionPagosPeriodicos_QNAME, ArrayOfPagoPeriodico.class, MSDetalleInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Inversion", scope = MSConsultasInversion.class)
    public JAXBElement<DatosInversion> createMSConsultasInversionInversion(DatosInversion value) {
        return new JAXBElement<DatosInversion>(_MSDetalleInversionInversion_QNAME, DatosInversion.class, MSConsultasInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosInversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Inversiones", name = "Inversiones", scope = MSConsultasInversion.class)
    public JAXBElement<ArrayOfDatosInversion> createMSConsultasInversionInversiones(ArrayOfDatosInversion value) {
        return new JAXBElement<ArrayOfDatosInversion>(_MSConsultasInversionInversiones_QNAME, ArrayOfDatosInversion.class, MSConsultasInversion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ClaseDocumento", scope = Documento.class)
    public JAXBElement<String> createDocumentoClaseDocumento(String value) {
        return new JAXBElement<String>(_DocumentoClaseDocumento_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CodigoTipoDocumento", scope = Documento.class)
    public JAXBElement<String> createDocumentoCodigoTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoCodigoTipoDocumento_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Contenido", scope = Documento.class)
    public JAXBElement<byte[]> createDocumentoContenido(byte[] value) {
        return new JAXBElement<byte[]>(_DocumentoContenido_QNAME, byte[].class, Documento.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ContenidoReverso", scope = Documento.class)
    public JAXBElement<byte[]> createDocumentoContenidoReverso(byte[] value) {
        return new JAXBElement<byte[]>(_DocumentoContenidoReverso_QNAME, byte[].class, Documento.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Enlace", scope = Documento.class)
    public JAXBElement<String> createDocumentoEnlace(String value) {
        return new JAXBElement<String>(_DocumentoEnlace_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Estado", scope = Documento.class)
    public JAXBElement<Boolean> createDocumentoEstado(Boolean value) {
        return new JAXBElement<Boolean>(_DocumentoEstado_QNAME, Boolean.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Extension", scope = Documento.class)
    public JAXBElement<String> createDocumentoExtension(String value) {
        return new JAXBElement<String>(_DocumentoExtension_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdCliente", scope = Documento.class)
    public JAXBElement<Integer> createDocumentoIdCliente(Integer value) {
        return new JAXBElement<Integer>(_DocumentoIdCliente_QNAME, Integer.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdEnvio", scope = Documento.class)
    public JAXBElement<Integer> createDocumentoIdEnvio(Integer value) {
        return new JAXBElement<Integer>(_DocumentoIdEnvio_QNAME, Integer.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "LoginDigitalizador", scope = Documento.class)
    public JAXBElement<String> createDocumentoLoginDigitalizador(String value) {
        return new JAXBElement<String>(_DocumentoLoginDigitalizador_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "NombreArchivo", scope = Documento.class)
    public JAXBElement<String> createDocumentoNombreArchivo(String value) {
        return new JAXBElement<String>(_DocumentoNombreArchivo_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Observaciones", scope = Documento.class)
    public JAXBElement<String> createDocumentoObservaciones(String value) {
        return new JAXBElement<String>(_DocumentoObservaciones_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "RolCliente", scope = Documento.class)
    public JAXBElement<String> createDocumentoRolCliente(String value) {
        return new JAXBElement<String>(_DocumentoRolCliente_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "TipoContenido", scope = Documento.class)
    public JAXBElement<String> createDocumentoTipoContenido(String value) {
        return new JAXBElement<String>(_DocumentoTipoContenido_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "TipoDocumento", scope = Documento.class)
    public JAXBElement<String> createDocumentoTipoDocumento(String value) {
        return new JAXBElement<String>(_DocumentoTipoDocumento_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "NumeroProducto", scope = MEConsultaProducto.class)
    public JAXBElement<String> createMEConsultaProductoNumeroProducto(String value) {
        return new JAXBElement<String>(_MEConsultaProductoNumeroProducto_QNAME, String.class, MEConsultaProducto.class, value);
    }

}
