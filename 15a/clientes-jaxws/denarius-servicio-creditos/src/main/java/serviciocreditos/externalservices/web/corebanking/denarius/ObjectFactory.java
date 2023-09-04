
package serviciocreditos.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
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
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCalcularCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCatalogos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaCreditoPreferencial;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaSaldosVencidos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaSolicitudAutomotriz;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasGarantias;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreacionGarantia;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditoAutomotriz;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditoCanales;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditoConsolidado;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreditos;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosRenovacion;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDocumentosCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSEvaluacionEconomica;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSGuardarCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSRegistroPago;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSRenovacionCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSResultadoPagoCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSRiesgoAmbiental;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSSimulacionPagoCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSSolicitudCreditoAutomotriz;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTipoCredito;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTipoOperacion;
import serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTipoProcesoCredito;


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

    private final static QName _ConsultarClientesTramiteMeConsultasCreditos_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultasCreditos");
    private final static QName _ConsultarClientesTramiteResponseConsultarClientesTramiteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClientesTramiteResult");
    private final static QName _ConsultarCreditosClienteResponseConsultarCreditosClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCreditosClienteResult");
    private final static QName _ConsultarCreditosIndirectosClienteResponseConsultarCreditosIndirectosClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCreditosIndirectosClienteResult");
    private final static QName _ConsultarMovimientosCreditoMeConsultasCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultasCredito");
    private final static QName _ConsultarMovimientosCreditoResponseConsultarMovimientosCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarMovimientosCreditoResult");
    private final static QName _ConsultarDetalleCreditoResponseConsultarDetalleCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDetalleCreditoResult");
    private final static QName _RegistrarGarantiaClienteMeGarantia_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meGarantia");
    private final static QName _RegistrarGarantiaClienteResponseRegistrarGarantiaClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarGarantiaClienteResult");
    private final static QName _ReasignarGarantiaMeReasignacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meReasignacion");
    private final static QName _ReasignarGarantiaResponseReasignarGarantiaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ReasignarGarantiaResult");
    private final static QName _ConsultarGarantiasMeConsulta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsulta");
    private final static QName _ConsultarGarantiasResponseConsultarGarantiasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarGarantiasResult");
    private final static QName _ConsultarTipoCarteraMeTipoCartera_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTipoCartera");
    private final static QName _ConsultarTipoCarteraResponseConsultarTipoCarteraResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTipoCarteraResult");
    private final static QName _ConsultarDestinoFinancieroResponseConsultarDestinoFinancieroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDestinoFinancieroResult");
    private final static QName _ConsultarSegmentoCreditoResponseConsultarSegmentoCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSegmentoCreditoResult");
    private final static QName _ConsultarTipoOperacionResponseConsultarTipoOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTipoOperacionResult");
    private final static QName _ConsultarTipoDividendoResponseConsultarTipoDividendoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTipoDividendoResult");
    private final static QName _ConsultarOperacionResponseConsultarOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarOperacionResult");
    private final static QName _ConsultarSaldoOperacionResponseConsultarSaldoOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldoOperacionResult");
    private final static QName _ConsultarSaldosVencidosOperacionesResponseConsultarSaldosVencidosOperacionesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosVencidosOperacionesResult");
    private final static QName _ConsultarTablaAmortizacionResponseConsultarTablaAmortizacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTablaAmortizacionResult");
    private final static QName _ConsultarTablaAmortizacionCarteraResponseConsultarTablaAmortizacionCarteraResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTablaAmortizacionCarteraResult");
    private final static QName _ConsultarPagoOperacionResponseConsultarPagoOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarPagoOperacionResult");
    private final static QName _ValidarActividadDestinoMeCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCredito");
    private final static QName _ValidarActividadDestinoResponseValidarActividadDestinoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarActividadDestinoResult");
    private final static QName _ValidarSegmentoResponseValidarSegmentoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarSegmentoResult");
    private final static QName _ValidarRiesgoClienteResponseValidarRiesgoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarRiesgoClienteResult");
    private final static QName _CrearActualizarOperacionResponseCrearActualizarOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearActualizarOperacionResult");
    private final static QName _IniciarFlujoResponseIniciarFlujoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "IniciarFlujoResult");
    private final static QName _IniciarFlujoCreditoNormalResponseIniciarFlujoCreditoNormalResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "IniciarFlujoCreditoNormalResult");
    private final static QName _AnularOperacionResponseAnularOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AnularOperacionResult");
    private final static QName _ActivarOperacionResponseActivarOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActivarOperacionResult");
    private final static QName _ValidarImpresionesResponseValidarImpresionesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarImpresionesResult");
    private final static QName _DesembolsarOperacionResponseDesembolsarOperacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "DesembolsarOperacionResult");
    private final static QName _ConsultarBuroResponseConsultarBuroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarBuroResult");
    private final static QName _ValidarGarantiasCruzadasResponseValidarGarantiasCruzadasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarGarantiasCruzadasResult");
    private final static QName _GuardarPagosAccMeRegistro_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRegistro");
    private final static QName _GuardarPagosAccResponseGuardarPagosAccResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarPagosAccResult");
    private final static QName _CalcularSimulacionMeSimulacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meSimulacion");
    private final static QName _CalcularSimulacionResponseCalcularSimulacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CalcularSimulacionResult");
    private final static QName _ConsultarResumenScoreMeConsultaScore_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaScore");
    private final static QName _ConsultarResumenScoreResponseConsultarResumenScoreResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarResumenScoreResult");
    private final static QName _ConsultarSolicitudesDeudorMeIdentificacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meIdentificacion");
    private final static QName _ConsultarSolicitudesDeudorResponseConsultarSolicitudesDeudorResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSolicitudesDeudorResult");
    private final static QName _SimularCreditoResponseSimularCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SimularCreditoResult");
    private final static QName _ConsultarTablaAmortizacionDetalladaResponseConsultarTablaAmortizacionDetalladaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTablaAmortizacionDetalladaResult");
    private final static QName _ConsultarClienteParaCreditoResponseConsultarClienteParaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClienteParaCreditoResult");
    private final static QName _ConsultarValidarScoreClienteResponseConsultarValidarScoreClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarValidarScoreClienteResult");
    private final static QName _CrearSolicitudCanalesEntrada_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "entrada");
    private final static QName _CrearSolicitudCanalesResponseCrearSolicitudCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearSolicitudCanalesResult");
    private final static QName _ActualizarSolicitudCanalesResponseActualizarSolicitudCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarSolicitudCanalesResult");
    private final static QName _GuardarDocumentoCanalesResponseGuardarDocumentoCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarDocumentoCanalesResult");
    private final static QName _ValidarCondicionesProcesoRapidoResponseValidarCondicionesProcesoRapidoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarCondicionesProcesoRapidoResult");
    private final static QName _LiquidarOperacionesFechaFuturaMeLiquidacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meLiquidacion");
    private final static QName _LiquidarOperacionesFechaFuturaResponseLiquidarOperacionesFechaFuturaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "LiquidarOperacionesFechaFuturaResult");
    private final static QName _CrearCreditoConsolidadoResponseCrearCreditoConsolidadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearCreditoConsolidadoResult");
    private final static QName _DevolverPendientesRegularizacionDocumentosMeRegularizacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRegularizacion");
    private final static QName _DevolverPendientesRegularizacionDocumentosResponseDevolverPendientesRegularizacionDocumentosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "DevolverPendientesRegularizacionDocumentosResult");
    private final static QName _CotizarCreditoAutomotrizMeAutomotriz_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meAutomotriz");
    private final static QName _CotizarCreditoAutomotrizResponseCotizarCreditoAutomotrizResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CotizarCreditoAutomotrizResult");
    private final static QName _GenerarSolicitudCreditoAutomotrizResponseGenerarSolicitudCreditoAutomotrizResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarSolicitudCreditoAutomotrizResult");
    private final static QName _ConsultarEstadoSolicitudAutomotrizResponseConsultarEstadoSolicitudAutomotrizResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarEstadoSolicitudAutomotrizResult");
    private final static QName _RenovarCreditoResponseRenovarCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RenovarCreditoResult");
    private final static QName _BuscarDatosRenovacionResponseBuscarDatosRenovacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "BuscarDatosRenovacionResult");
    private final static QName _ConsultarClienteEliteResponseConsultarClienteEliteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClienteEliteResult");
    private final static QName _CrearCreditoEliteResponseCrearCreditoEliteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearCreditoEliteResult");
    private final static QName _GenerarDocumentosCreditoResponseGenerarDocumentosCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarDocumentosCreditoResult");
    private final static QName _ValidarAprobarCreditoCanalesResponseValidarAprobarCreditoCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarAprobarCreditoCanalesResult");
    private final static QName _EnviarDocumentosCreditoResponseEnviarDocumentosCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EnviarDocumentosCreditoResult");
    private final static QName _GenerarEstadoCuentaLineaCreditoMeEntrada_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meEntrada");
    private final static QName _GenerarEstadoCuentaLineaCreditoResponseGenerarEstadoCuentaLineaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarEstadoCuentaLineaCreditoResult");
    private final static QName _RevisarCupoLineaCreditoResponseRevisarCupoLineaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RevisarCupoLineaCreditoResult");
    private final static QName _RegularizarLiquidacionesLineaCreditoResponseRegularizarLiquidacionesLineaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegularizarLiquidacionesLineaCreditoResult");
    private final static QName _ConsultarTipoCreditoMeTipoCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTipoCredito");
    private final static QName _ConsultarTipoCreditoResponseConsultarTipoCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTipoCreditoResult");
    private final static QName _ConsultarValidarScoreClienteRapiditoResponseConsultarValidarScoreClienteRapiditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarValidarScoreClienteRapiditoResult");
    private final static QName _ConsultarTipoProcesoCreditoMeTipoProceso_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTipoProceso");
    private final static QName _ConsultarTipoProcesoCreditoResponseConsultarTipoProcesoCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTipoProcesoCreditoResult");
    private final static QName _RecuperarInformacionEvaluacionResponseRecuperarInformacionEvaluacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecuperarInformacionEvaluacionResult");
    private final static QName _CalcularCreditoMeCalcularCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCalcularCredito");
    private final static QName _CalcularCreditoResponseCalcularCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CalcularCreditoResult");
    private final static QName _GuardarCreditoMeGuardarCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meGuardarCredito");
    private final static QName _GuardarCreditoResponseGuardarCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarCreditoResult");
    private final static QName _ValidarExcepcionesProcesoResponseValidarExcepcionesProcesoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarExcepcionesProcesoResult");
    private final static QName _ConsultarDocumentosDigitalizarMeCreditos_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCreditos");
    private final static QName _ConsultarDocumentosDigitalizarResponseConsultarDocumentosDigitalizarResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDocumentosDigitalizarResult");
    private final static QName _ValidarDocumentosDigitalizadosResponseValidarDocumentosDigitalizadosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarDocumentosDigitalizadosResult");
    private final static QName _IniciarFlujoCreditoRapiditoResponseIniciarFlujoCreditoRapiditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "IniciarFlujoCreditoRapiditoResult");
    private final static QName _GuardarInformacionEvaluacionMeInformacionEvaluacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meInformacionEvaluacion");
    private final static QName _GuardarInformacionEvaluacionResponseGuardarInformacionEvaluacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarInformacionEvaluacionResult");
    private final static QName _CancelarProcesoRapiditoResponseCancelarProcesoRapiditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CancelarProcesoRapiditoResult");
    private final static QName _CrearCreditoEnLineaResponseCrearCreditoEnLineaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearCreditoEnLineaResult");
    private final static QName _GenerarDocumentosCreditoEnLineaResponseGenerarDocumentosCreditoEnLineaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarDocumentosCreditoEnLineaResult");
    private final static QName _ConsultarDocumentosPorCarpetaResponseConsultarDocumentosPorCarpetaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDocumentosPorCarpetaResult");
    private final static QName _GuardarDocumentoPorCarpetaResponseGuardarDocumentoPorCarpetaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarDocumentoPorCarpetaResult");
    private final static QName _ConsultarProcesoEcomicroResponseConsultarProcesoEcomicroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarProcesoEcomicroResult");
    private final static QName _ConsultarDocumentosDigitalizadosResponseConsultarDocumentosDigitalizadosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDocumentosDigitalizadosResult");
    private final static QName _GuardarDocumentoDigitalizadoMeDocumento_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDocumento");
    private final static QName _GuardarDocumentoDigitalizadoResponseGuardarDocumentoDigitalizadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarDocumentoDigitalizadoResult");
    private final static QName _CrearCreditoFlujoResponseCrearCreditoFlujoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearCreditoFlujoResult");
    private final static QName _AprobarFaseAprobacionSeguroMeAprobarFase_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meAprobarFase");
    private final static QName _AprobarFaseAprobacionSeguroResponseAprobarFaseAprobacionSeguroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AprobarFaseAprobacionSeguroResult");
    private final static QName _ValidarBloqueoAprobacionResponseValidarBloqueoAprobacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarBloqueoAprobacionResult");
    private final static QName _RecuperarRiesgoAmbientalResponseRecuperarRiesgoAmbientalResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecuperarRiesgoAmbientalResult");
    private final static QName _GuardarRiesgoAmbientalMeRiesgoAmbiental_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRiesgoAmbiental");
    private final static QName _GuardarRiesgoAmbientalResponseGuardarRiesgoAmbientalResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarRiesgoAmbientalResult");
    private final static QName _SimularPagoExtraordinarioCreditoMePagoCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mePagoCredito");
    private final static QName _SimularPagoExtraordinarioCreditoResponseSimularPagoExtraordinarioCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SimularPagoExtraordinarioCreditoResult");
    private final static QName _ProcesarPagoExtraordinarioCreditoResponseProcesarPagoExtraordinarioCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarPagoExtraordinarioCreditoResult");
    private final static QName _RecibirDocumentoFirmadoMeDocumentoFirmado_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDocumentoFirmado");
    private final static QName _RecibirDocumentoFirmadoResponseRecibirDocumentoFirmadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecibirDocumentoFirmadoResult");
    private final static QName _RegistrarFirmaElectronicaDocumentoMeFirmaElectronica_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meFirmaElectronica");
    private final static QName _RegistrarFirmaElectronicaDocumentoResponseRegistrarFirmaElectronicaDocumentoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarFirmaElectronicaDocumentoResult");
    private final static QName _RecibirRespuestaFirmaElectronicaResponseRecibirRespuestaFirmaElectronicaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecibirRespuestaFirmaElectronicaResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: externalservices.web.corebanking.denarius
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarClientesTramite }
     * 
     */
    public ConsultarClientesTramite createConsultarClientesTramite() {
        return new ConsultarClientesTramite();
    }

    /**
     * Create an instance of {@link ConsultarClientesTramiteResponse }
     * 
     */
    public ConsultarClientesTramiteResponse createConsultarClientesTramiteResponse() {
        return new ConsultarClientesTramiteResponse();
    }

    /**
     * Create an instance of {@link ConsultarCreditosCliente }
     * 
     */
    public ConsultarCreditosCliente createConsultarCreditosCliente() {
        return new ConsultarCreditosCliente();
    }

    /**
     * Create an instance of {@link ConsultarCreditosClienteResponse }
     * 
     */
    public ConsultarCreditosClienteResponse createConsultarCreditosClienteResponse() {
        return new ConsultarCreditosClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarCreditosIndirectosCliente }
     * 
     */
    public ConsultarCreditosIndirectosCliente createConsultarCreditosIndirectosCliente() {
        return new ConsultarCreditosIndirectosCliente();
    }

    /**
     * Create an instance of {@link ConsultarCreditosIndirectosClienteResponse }
     * 
     */
    public ConsultarCreditosIndirectosClienteResponse createConsultarCreditosIndirectosClienteResponse() {
        return new ConsultarCreditosIndirectosClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarMovimientosCredito }
     * 
     */
    public ConsultarMovimientosCredito createConsultarMovimientosCredito() {
        return new ConsultarMovimientosCredito();
    }

    /**
     * Create an instance of {@link ConsultarMovimientosCreditoResponse }
     * 
     */
    public ConsultarMovimientosCreditoResponse createConsultarMovimientosCreditoResponse() {
        return new ConsultarMovimientosCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarDetalleCredito }
     * 
     */
    public ConsultarDetalleCredito createConsultarDetalleCredito() {
        return new ConsultarDetalleCredito();
    }

    /**
     * Create an instance of {@link ConsultarDetalleCreditoResponse }
     * 
     */
    public ConsultarDetalleCreditoResponse createConsultarDetalleCreditoResponse() {
        return new ConsultarDetalleCreditoResponse();
    }

    /**
     * Create an instance of {@link RegistrarGarantiaCliente }
     * 
     */
    public RegistrarGarantiaCliente createRegistrarGarantiaCliente() {
        return new RegistrarGarantiaCliente();
    }

    /**
     * Create an instance of {@link RegistrarGarantiaClienteResponse }
     * 
     */
    public RegistrarGarantiaClienteResponse createRegistrarGarantiaClienteResponse() {
        return new RegistrarGarantiaClienteResponse();
    }

    /**
     * Create an instance of {@link ReasignarGarantia }
     * 
     */
    public ReasignarGarantia createReasignarGarantia() {
        return new ReasignarGarantia();
    }

    /**
     * Create an instance of {@link ReasignarGarantiaResponse }
     * 
     */
    public ReasignarGarantiaResponse createReasignarGarantiaResponse() {
        return new ReasignarGarantiaResponse();
    }

    /**
     * Create an instance of {@link ConsultarGarantias }
     * 
     */
    public ConsultarGarantias createConsultarGarantias() {
        return new ConsultarGarantias();
    }

    /**
     * Create an instance of {@link ConsultarGarantiasResponse }
     * 
     */
    public ConsultarGarantiasResponse createConsultarGarantiasResponse() {
        return new ConsultarGarantiasResponse();
    }

    /**
     * Create an instance of {@link ConsultarTipoCartera }
     * 
     */
    public ConsultarTipoCartera createConsultarTipoCartera() {
        return new ConsultarTipoCartera();
    }

    /**
     * Create an instance of {@link ConsultarTipoCarteraResponse }
     * 
     */
    public ConsultarTipoCarteraResponse createConsultarTipoCarteraResponse() {
        return new ConsultarTipoCarteraResponse();
    }

    /**
     * Create an instance of {@link ConsultarDestinoFinanciero }
     * 
     */
    public ConsultarDestinoFinanciero createConsultarDestinoFinanciero() {
        return new ConsultarDestinoFinanciero();
    }

    /**
     * Create an instance of {@link ConsultarDestinoFinancieroResponse }
     * 
     */
    public ConsultarDestinoFinancieroResponse createConsultarDestinoFinancieroResponse() {
        return new ConsultarDestinoFinancieroResponse();
    }

    /**
     * Create an instance of {@link ConsultarSegmentoCredito }
     * 
     */
    public ConsultarSegmentoCredito createConsultarSegmentoCredito() {
        return new ConsultarSegmentoCredito();
    }

    /**
     * Create an instance of {@link ConsultarSegmentoCreditoResponse }
     * 
     */
    public ConsultarSegmentoCreditoResponse createConsultarSegmentoCreditoResponse() {
        return new ConsultarSegmentoCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTipoOperacion }
     * 
     */
    public ConsultarTipoOperacion createConsultarTipoOperacion() {
        return new ConsultarTipoOperacion();
    }

    /**
     * Create an instance of {@link ConsultarTipoOperacionResponse }
     * 
     */
    public ConsultarTipoOperacionResponse createConsultarTipoOperacionResponse() {
        return new ConsultarTipoOperacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarTipoDividendo }
     * 
     */
    public ConsultarTipoDividendo createConsultarTipoDividendo() {
        return new ConsultarTipoDividendo();
    }

    /**
     * Create an instance of {@link ConsultarTipoDividendoResponse }
     * 
     */
    public ConsultarTipoDividendoResponse createConsultarTipoDividendoResponse() {
        return new ConsultarTipoDividendoResponse();
    }

    /**
     * Create an instance of {@link ConsultarOperacion }
     * 
     */
    public ConsultarOperacion createConsultarOperacion() {
        return new ConsultarOperacion();
    }

    /**
     * Create an instance of {@link ConsultarOperacionResponse }
     * 
     */
    public ConsultarOperacionResponse createConsultarOperacionResponse() {
        return new ConsultarOperacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldoOperacion }
     * 
     */
    public ConsultarSaldoOperacion createConsultarSaldoOperacion() {
        return new ConsultarSaldoOperacion();
    }

    /**
     * Create an instance of {@link ConsultarSaldoOperacionResponse }
     * 
     */
    public ConsultarSaldoOperacionResponse createConsultarSaldoOperacionResponse() {
        return new ConsultarSaldoOperacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldosVencidosOperaciones }
     * 
     */
    public ConsultarSaldosVencidosOperaciones createConsultarSaldosVencidosOperaciones() {
        return new ConsultarSaldosVencidosOperaciones();
    }

    /**
     * Create an instance of {@link ConsultarSaldosVencidosOperacionesResponse }
     * 
     */
    public ConsultarSaldosVencidosOperacionesResponse createConsultarSaldosVencidosOperacionesResponse() {
        return new ConsultarSaldosVencidosOperacionesResponse();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacion }
     * 
     */
    public ConsultarTablaAmortizacion createConsultarTablaAmortizacion() {
        return new ConsultarTablaAmortizacion();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacionResponse }
     * 
     */
    public ConsultarTablaAmortizacionResponse createConsultarTablaAmortizacionResponse() {
        return new ConsultarTablaAmortizacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacionCartera }
     * 
     */
    public ConsultarTablaAmortizacionCartera createConsultarTablaAmortizacionCartera() {
        return new ConsultarTablaAmortizacionCartera();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacionCarteraResponse }
     * 
     */
    public ConsultarTablaAmortizacionCarteraResponse createConsultarTablaAmortizacionCarteraResponse() {
        return new ConsultarTablaAmortizacionCarteraResponse();
    }

    /**
     * Create an instance of {@link ConsultarPagoOperacion }
     * 
     */
    public ConsultarPagoOperacion createConsultarPagoOperacion() {
        return new ConsultarPagoOperacion();
    }

    /**
     * Create an instance of {@link ConsultarPagoOperacionResponse }
     * 
     */
    public ConsultarPagoOperacionResponse createConsultarPagoOperacionResponse() {
        return new ConsultarPagoOperacionResponse();
    }

    /**
     * Create an instance of {@link ValidarActividadDestino }
     * 
     */
    public ValidarActividadDestino createValidarActividadDestino() {
        return new ValidarActividadDestino();
    }

    /**
     * Create an instance of {@link ValidarActividadDestinoResponse }
     * 
     */
    public ValidarActividadDestinoResponse createValidarActividadDestinoResponse() {
        return new ValidarActividadDestinoResponse();
    }

    /**
     * Create an instance of {@link ValidarSegmento }
     * 
     */
    public ValidarSegmento createValidarSegmento() {
        return new ValidarSegmento();
    }

    /**
     * Create an instance of {@link ValidarSegmentoResponse }
     * 
     */
    public ValidarSegmentoResponse createValidarSegmentoResponse() {
        return new ValidarSegmentoResponse();
    }

    /**
     * Create an instance of {@link ValidarRiesgoCliente }
     * 
     */
    public ValidarRiesgoCliente createValidarRiesgoCliente() {
        return new ValidarRiesgoCliente();
    }

    /**
     * Create an instance of {@link ValidarRiesgoClienteResponse }
     * 
     */
    public ValidarRiesgoClienteResponse createValidarRiesgoClienteResponse() {
        return new ValidarRiesgoClienteResponse();
    }

    /**
     * Create an instance of {@link CrearActualizarOperacion }
     * 
     */
    public CrearActualizarOperacion createCrearActualizarOperacion() {
        return new CrearActualizarOperacion();
    }

    /**
     * Create an instance of {@link CrearActualizarOperacionResponse }
     * 
     */
    public CrearActualizarOperacionResponse createCrearActualizarOperacionResponse() {
        return new CrearActualizarOperacionResponse();
    }

    /**
     * Create an instance of {@link IniciarFlujo }
     * 
     */
    public IniciarFlujo createIniciarFlujo() {
        return new IniciarFlujo();
    }

    /**
     * Create an instance of {@link IniciarFlujoResponse }
     * 
     */
    public IniciarFlujoResponse createIniciarFlujoResponse() {
        return new IniciarFlujoResponse();
    }

    /**
     * Create an instance of {@link IniciarFlujoCreditoNormal }
     * 
     */
    public IniciarFlujoCreditoNormal createIniciarFlujoCreditoNormal() {
        return new IniciarFlujoCreditoNormal();
    }

    /**
     * Create an instance of {@link IniciarFlujoCreditoNormalResponse }
     * 
     */
    public IniciarFlujoCreditoNormalResponse createIniciarFlujoCreditoNormalResponse() {
        return new IniciarFlujoCreditoNormalResponse();
    }

    /**
     * Create an instance of {@link AnularOperacion }
     * 
     */
    public AnularOperacion createAnularOperacion() {
        return new AnularOperacion();
    }

    /**
     * Create an instance of {@link AnularOperacionResponse }
     * 
     */
    public AnularOperacionResponse createAnularOperacionResponse() {
        return new AnularOperacionResponse();
    }

    /**
     * Create an instance of {@link ActivarOperacion }
     * 
     */
    public ActivarOperacion createActivarOperacion() {
        return new ActivarOperacion();
    }

    /**
     * Create an instance of {@link ActivarOperacionResponse }
     * 
     */
    public ActivarOperacionResponse createActivarOperacionResponse() {
        return new ActivarOperacionResponse();
    }

    /**
     * Create an instance of {@link ValidarImpresiones }
     * 
     */
    public ValidarImpresiones createValidarImpresiones() {
        return new ValidarImpresiones();
    }

    /**
     * Create an instance of {@link ValidarImpresionesResponse }
     * 
     */
    public ValidarImpresionesResponse createValidarImpresionesResponse() {
        return new ValidarImpresionesResponse();
    }

    /**
     * Create an instance of {@link DesembolsarOperacion }
     * 
     */
    public DesembolsarOperacion createDesembolsarOperacion() {
        return new DesembolsarOperacion();
    }

    /**
     * Create an instance of {@link DesembolsarOperacionResponse }
     * 
     */
    public DesembolsarOperacionResponse createDesembolsarOperacionResponse() {
        return new DesembolsarOperacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarBuro }
     * 
     */
    public ConsultarBuro createConsultarBuro() {
        return new ConsultarBuro();
    }

    /**
     * Create an instance of {@link ConsultarBuroResponse }
     * 
     */
    public ConsultarBuroResponse createConsultarBuroResponse() {
        return new ConsultarBuroResponse();
    }

    /**
     * Create an instance of {@link ValidarGarantiasCruzadas }
     * 
     */
    public ValidarGarantiasCruzadas createValidarGarantiasCruzadas() {
        return new ValidarGarantiasCruzadas();
    }

    /**
     * Create an instance of {@link ValidarGarantiasCruzadasResponse }
     * 
     */
    public ValidarGarantiasCruzadasResponse createValidarGarantiasCruzadasResponse() {
        return new ValidarGarantiasCruzadasResponse();
    }

    /**
     * Create an instance of {@link GuardarPagosAcc }
     * 
     */
    public GuardarPagosAcc createGuardarPagosAcc() {
        return new GuardarPagosAcc();
    }

    /**
     * Create an instance of {@link GuardarPagosAccResponse }
     * 
     */
    public GuardarPagosAccResponse createGuardarPagosAccResponse() {
        return new GuardarPagosAccResponse();
    }

    /**
     * Create an instance of {@link CalcularSimulacion }
     * 
     */
    public CalcularSimulacion createCalcularSimulacion() {
        return new CalcularSimulacion();
    }

    /**
     * Create an instance of {@link CalcularSimulacionResponse }
     * 
     */
    public CalcularSimulacionResponse createCalcularSimulacionResponse() {
        return new CalcularSimulacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarResumenScore }
     * 
     */
    public ConsultarResumenScore createConsultarResumenScore() {
        return new ConsultarResumenScore();
    }

    /**
     * Create an instance of {@link ConsultarResumenScoreResponse }
     * 
     */
    public ConsultarResumenScoreResponse createConsultarResumenScoreResponse() {
        return new ConsultarResumenScoreResponse();
    }

    /**
     * Create an instance of {@link ConsultarSolicitudesDeudor }
     * 
     */
    public ConsultarSolicitudesDeudor createConsultarSolicitudesDeudor() {
        return new ConsultarSolicitudesDeudor();
    }

    /**
     * Create an instance of {@link ConsultarSolicitudesDeudorResponse }
     * 
     */
    public ConsultarSolicitudesDeudorResponse createConsultarSolicitudesDeudorResponse() {
        return new ConsultarSolicitudesDeudorResponse();
    }

    /**
     * Create an instance of {@link SimularCredito }
     * 
     */
    public SimularCredito createSimularCredito() {
        return new SimularCredito();
    }

    /**
     * Create an instance of {@link SimularCreditoResponse }
     * 
     */
    public SimularCreditoResponse createSimularCreditoResponse() {
        return new SimularCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacionDetallada }
     * 
     */
    public ConsultarTablaAmortizacionDetallada createConsultarTablaAmortizacionDetallada() {
        return new ConsultarTablaAmortizacionDetallada();
    }

    /**
     * Create an instance of {@link ConsultarTablaAmortizacionDetalladaResponse }
     * 
     */
    public ConsultarTablaAmortizacionDetalladaResponse createConsultarTablaAmortizacionDetalladaResponse() {
        return new ConsultarTablaAmortizacionDetalladaResponse();
    }

    /**
     * Create an instance of {@link ConsultarClienteParaCredito }
     * 
     */
    public ConsultarClienteParaCredito createConsultarClienteParaCredito() {
        return new ConsultarClienteParaCredito();
    }

    /**
     * Create an instance of {@link ConsultarClienteParaCreditoResponse }
     * 
     */
    public ConsultarClienteParaCreditoResponse createConsultarClienteParaCreditoResponse() {
        return new ConsultarClienteParaCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarValidarScoreCliente }
     * 
     */
    public ConsultarValidarScoreCliente createConsultarValidarScoreCliente() {
        return new ConsultarValidarScoreCliente();
    }

    /**
     * Create an instance of {@link ConsultarValidarScoreClienteResponse }
     * 
     */
    public ConsultarValidarScoreClienteResponse createConsultarValidarScoreClienteResponse() {
        return new ConsultarValidarScoreClienteResponse();
    }

    /**
     * Create an instance of {@link CrearSolicitudCanales }
     * 
     */
    public CrearSolicitudCanales createCrearSolicitudCanales() {
        return new CrearSolicitudCanales();
    }

    /**
     * Create an instance of {@link CrearSolicitudCanalesResponse }
     * 
     */
    public CrearSolicitudCanalesResponse createCrearSolicitudCanalesResponse() {
        return new CrearSolicitudCanalesResponse();
    }

    /**
     * Create an instance of {@link ActualizarSolicitudCanales }
     * 
     */
    public ActualizarSolicitudCanales createActualizarSolicitudCanales() {
        return new ActualizarSolicitudCanales();
    }

    /**
     * Create an instance of {@link ActualizarSolicitudCanalesResponse }
     * 
     */
    public ActualizarSolicitudCanalesResponse createActualizarSolicitudCanalesResponse() {
        return new ActualizarSolicitudCanalesResponse();
    }

    /**
     * Create an instance of {@link GuardarDocumentoCanales }
     * 
     */
    public GuardarDocumentoCanales createGuardarDocumentoCanales() {
        return new GuardarDocumentoCanales();
    }

    /**
     * Create an instance of {@link GuardarDocumentoCanalesResponse }
     * 
     */
    public GuardarDocumentoCanalesResponse createGuardarDocumentoCanalesResponse() {
        return new GuardarDocumentoCanalesResponse();
    }

    /**
     * Create an instance of {@link ValidarCondicionesProcesoRapido }
     * 
     */
    public ValidarCondicionesProcesoRapido createValidarCondicionesProcesoRapido() {
        return new ValidarCondicionesProcesoRapido();
    }

    /**
     * Create an instance of {@link ValidarCondicionesProcesoRapidoResponse }
     * 
     */
    public ValidarCondicionesProcesoRapidoResponse createValidarCondicionesProcesoRapidoResponse() {
        return new ValidarCondicionesProcesoRapidoResponse();
    }

    /**
     * Create an instance of {@link LiquidarOperacionesFechaFutura }
     * 
     */
    public LiquidarOperacionesFechaFutura createLiquidarOperacionesFechaFutura() {
        return new LiquidarOperacionesFechaFutura();
    }

    /**
     * Create an instance of {@link LiquidarOperacionesFechaFuturaResponse }
     * 
     */
    public LiquidarOperacionesFechaFuturaResponse createLiquidarOperacionesFechaFuturaResponse() {
        return new LiquidarOperacionesFechaFuturaResponse();
    }

    /**
     * Create an instance of {@link CrearCreditoConsolidado }
     * 
     */
    public CrearCreditoConsolidado createCrearCreditoConsolidado() {
        return new CrearCreditoConsolidado();
    }

    /**
     * Create an instance of {@link CrearCreditoConsolidadoResponse }
     * 
     */
    public CrearCreditoConsolidadoResponse createCrearCreditoConsolidadoResponse() {
        return new CrearCreditoConsolidadoResponse();
    }

    /**
     * Create an instance of {@link DevolverPendientesRegularizacionDocumentos }
     * 
     */
    public DevolverPendientesRegularizacionDocumentos createDevolverPendientesRegularizacionDocumentos() {
        return new DevolverPendientesRegularizacionDocumentos();
    }

    /**
     * Create an instance of {@link DevolverPendientesRegularizacionDocumentosResponse }
     * 
     */
    public DevolverPendientesRegularizacionDocumentosResponse createDevolverPendientesRegularizacionDocumentosResponse() {
        return new DevolverPendientesRegularizacionDocumentosResponse();
    }

    /**
     * Create an instance of {@link CotizarCreditoAutomotriz }
     * 
     */
    public CotizarCreditoAutomotriz createCotizarCreditoAutomotriz() {
        return new CotizarCreditoAutomotriz();
    }

    /**
     * Create an instance of {@link CotizarCreditoAutomotrizResponse }
     * 
     */
    public CotizarCreditoAutomotrizResponse createCotizarCreditoAutomotrizResponse() {
        return new CotizarCreditoAutomotrizResponse();
    }

    /**
     * Create an instance of {@link GenerarSolicitudCreditoAutomotriz }
     * 
     */
    public GenerarSolicitudCreditoAutomotriz createGenerarSolicitudCreditoAutomotriz() {
        return new GenerarSolicitudCreditoAutomotriz();
    }

    /**
     * Create an instance of {@link GenerarSolicitudCreditoAutomotrizResponse }
     * 
     */
    public GenerarSolicitudCreditoAutomotrizResponse createGenerarSolicitudCreditoAutomotrizResponse() {
        return new GenerarSolicitudCreditoAutomotrizResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstadoSolicitudAutomotriz }
     * 
     */
    public ConsultarEstadoSolicitudAutomotriz createConsultarEstadoSolicitudAutomotriz() {
        return new ConsultarEstadoSolicitudAutomotriz();
    }

    /**
     * Create an instance of {@link ConsultarEstadoSolicitudAutomotrizResponse }
     * 
     */
    public ConsultarEstadoSolicitudAutomotrizResponse createConsultarEstadoSolicitudAutomotrizResponse() {
        return new ConsultarEstadoSolicitudAutomotrizResponse();
    }

    /**
     * Create an instance of {@link RenovarCredito }
     * 
     */
    public RenovarCredito createRenovarCredito() {
        return new RenovarCredito();
    }

    /**
     * Create an instance of {@link RenovarCreditoResponse }
     * 
     */
    public RenovarCreditoResponse createRenovarCreditoResponse() {
        return new RenovarCreditoResponse();
    }

    /**
     * Create an instance of {@link BuscarDatosRenovacion }
     * 
     */
    public BuscarDatosRenovacion createBuscarDatosRenovacion() {
        return new BuscarDatosRenovacion();
    }

    /**
     * Create an instance of {@link BuscarDatosRenovacionResponse }
     * 
     */
    public BuscarDatosRenovacionResponse createBuscarDatosRenovacionResponse() {
        return new BuscarDatosRenovacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarClienteElite }
     * 
     */
    public ConsultarClienteElite createConsultarClienteElite() {
        return new ConsultarClienteElite();
    }

    /**
     * Create an instance of {@link ConsultarClienteEliteResponse }
     * 
     */
    public ConsultarClienteEliteResponse createConsultarClienteEliteResponse() {
        return new ConsultarClienteEliteResponse();
    }

    /**
     * Create an instance of {@link CrearCreditoElite }
     * 
     */
    public CrearCreditoElite createCrearCreditoElite() {
        return new CrearCreditoElite();
    }

    /**
     * Create an instance of {@link CrearCreditoEliteResponse }
     * 
     */
    public CrearCreditoEliteResponse createCrearCreditoEliteResponse() {
        return new CrearCreditoEliteResponse();
    }

    /**
     * Create an instance of {@link GenerarDocumentosCredito }
     * 
     */
    public GenerarDocumentosCredito createGenerarDocumentosCredito() {
        return new GenerarDocumentosCredito();
    }

    /**
     * Create an instance of {@link GenerarDocumentosCreditoResponse }
     * 
     */
    public GenerarDocumentosCreditoResponse createGenerarDocumentosCreditoResponse() {
        return new GenerarDocumentosCreditoResponse();
    }

    /**
     * Create an instance of {@link ValidarAprobarCreditoCanales }
     * 
     */
    public ValidarAprobarCreditoCanales createValidarAprobarCreditoCanales() {
        return new ValidarAprobarCreditoCanales();
    }

    /**
     * Create an instance of {@link ValidarAprobarCreditoCanalesResponse }
     * 
     */
    public ValidarAprobarCreditoCanalesResponse createValidarAprobarCreditoCanalesResponse() {
        return new ValidarAprobarCreditoCanalesResponse();
    }

    /**
     * Create an instance of {@link EnviarDocumentosCredito }
     * 
     */
    public EnviarDocumentosCredito createEnviarDocumentosCredito() {
        return new EnviarDocumentosCredito();
    }

    /**
     * Create an instance of {@link EnviarDocumentosCreditoResponse }
     * 
     */
    public EnviarDocumentosCreditoResponse createEnviarDocumentosCreditoResponse() {
        return new EnviarDocumentosCreditoResponse();
    }

    /**
     * Create an instance of {@link GenerarEstadoCuentaLineaCredito }
     * 
     */
    public GenerarEstadoCuentaLineaCredito createGenerarEstadoCuentaLineaCredito() {
        return new GenerarEstadoCuentaLineaCredito();
    }

    /**
     * Create an instance of {@link GenerarEstadoCuentaLineaCreditoResponse }
     * 
     */
    public GenerarEstadoCuentaLineaCreditoResponse createGenerarEstadoCuentaLineaCreditoResponse() {
        return new GenerarEstadoCuentaLineaCreditoResponse();
    }

    /**
     * Create an instance of {@link RevisarCupoLineaCredito }
     * 
     */
    public RevisarCupoLineaCredito createRevisarCupoLineaCredito() {
        return new RevisarCupoLineaCredito();
    }

    /**
     * Create an instance of {@link RevisarCupoLineaCreditoResponse }
     * 
     */
    public RevisarCupoLineaCreditoResponse createRevisarCupoLineaCreditoResponse() {
        return new RevisarCupoLineaCreditoResponse();
    }

    /**
     * Create an instance of {@link RegularizarLiquidacionesLineaCredito }
     * 
     */
    public RegularizarLiquidacionesLineaCredito createRegularizarLiquidacionesLineaCredito() {
        return new RegularizarLiquidacionesLineaCredito();
    }

    /**
     * Create an instance of {@link RegularizarLiquidacionesLineaCreditoResponse }
     * 
     */
    public RegularizarLiquidacionesLineaCreditoResponse createRegularizarLiquidacionesLineaCreditoResponse() {
        return new RegularizarLiquidacionesLineaCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTipoCredito }
     * 
     */
    public ConsultarTipoCredito createConsultarTipoCredito() {
        return new ConsultarTipoCredito();
    }

    /**
     * Create an instance of {@link ConsultarTipoCreditoResponse }
     * 
     */
    public ConsultarTipoCreditoResponse createConsultarTipoCreditoResponse() {
        return new ConsultarTipoCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarValidarScoreClienteRapidito }
     * 
     */
    public ConsultarValidarScoreClienteRapidito createConsultarValidarScoreClienteRapidito() {
        return new ConsultarValidarScoreClienteRapidito();
    }

    /**
     * Create an instance of {@link ConsultarValidarScoreClienteRapiditoResponse }
     * 
     */
    public ConsultarValidarScoreClienteRapiditoResponse createConsultarValidarScoreClienteRapiditoResponse() {
        return new ConsultarValidarScoreClienteRapiditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarTipoProcesoCredito }
     * 
     */
    public ConsultarTipoProcesoCredito createConsultarTipoProcesoCredito() {
        return new ConsultarTipoProcesoCredito();
    }

    /**
     * Create an instance of {@link ConsultarTipoProcesoCreditoResponse }
     * 
     */
    public ConsultarTipoProcesoCreditoResponse createConsultarTipoProcesoCreditoResponse() {
        return new ConsultarTipoProcesoCreditoResponse();
    }

    /**
     * Create an instance of {@link RecuperarInformacionEvaluacion }
     * 
     */
    public RecuperarInformacionEvaluacion createRecuperarInformacionEvaluacion() {
        return new RecuperarInformacionEvaluacion();
    }

    /**
     * Create an instance of {@link RecuperarInformacionEvaluacionResponse }
     * 
     */
    public RecuperarInformacionEvaluacionResponse createRecuperarInformacionEvaluacionResponse() {
        return new RecuperarInformacionEvaluacionResponse();
    }

    /**
     * Create an instance of {@link CalcularCredito }
     * 
     */
    public CalcularCredito createCalcularCredito() {
        return new CalcularCredito();
    }

    /**
     * Create an instance of {@link CalcularCreditoResponse }
     * 
     */
    public CalcularCreditoResponse createCalcularCreditoResponse() {
        return new CalcularCreditoResponse();
    }

    /**
     * Create an instance of {@link GuardarCredito }
     * 
     */
    public GuardarCredito createGuardarCredito() {
        return new GuardarCredito();
    }

    /**
     * Create an instance of {@link GuardarCreditoResponse }
     * 
     */
    public GuardarCreditoResponse createGuardarCreditoResponse() {
        return new GuardarCreditoResponse();
    }

    /**
     * Create an instance of {@link ValidarExcepcionesProceso }
     * 
     */
    public ValidarExcepcionesProceso createValidarExcepcionesProceso() {
        return new ValidarExcepcionesProceso();
    }

    /**
     * Create an instance of {@link ValidarExcepcionesProcesoResponse }
     * 
     */
    public ValidarExcepcionesProcesoResponse createValidarExcepcionesProcesoResponse() {
        return new ValidarExcepcionesProcesoResponse();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosDigitalizar }
     * 
     */
    public ConsultarDocumentosDigitalizar createConsultarDocumentosDigitalizar() {
        return new ConsultarDocumentosDigitalizar();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosDigitalizarResponse }
     * 
     */
    public ConsultarDocumentosDigitalizarResponse createConsultarDocumentosDigitalizarResponse() {
        return new ConsultarDocumentosDigitalizarResponse();
    }

    /**
     * Create an instance of {@link ValidarDocumentosDigitalizados }
     * 
     */
    public ValidarDocumentosDigitalizados createValidarDocumentosDigitalizados() {
        return new ValidarDocumentosDigitalizados();
    }

    /**
     * Create an instance of {@link ValidarDocumentosDigitalizadosResponse }
     * 
     */
    public ValidarDocumentosDigitalizadosResponse createValidarDocumentosDigitalizadosResponse() {
        return new ValidarDocumentosDigitalizadosResponse();
    }

    /**
     * Create an instance of {@link IniciarFlujoCreditoRapidito }
     * 
     */
    public IniciarFlujoCreditoRapidito createIniciarFlujoCreditoRapidito() {
        return new IniciarFlujoCreditoRapidito();
    }

    /**
     * Create an instance of {@link IniciarFlujoCreditoRapiditoResponse }
     * 
     */
    public IniciarFlujoCreditoRapiditoResponse createIniciarFlujoCreditoRapiditoResponse() {
        return new IniciarFlujoCreditoRapiditoResponse();
    }

    /**
     * Create an instance of {@link GuardarInformacionEvaluacion }
     * 
     */
    public GuardarInformacionEvaluacion createGuardarInformacionEvaluacion() {
        return new GuardarInformacionEvaluacion();
    }

    /**
     * Create an instance of {@link GuardarInformacionEvaluacionResponse }
     * 
     */
    public GuardarInformacionEvaluacionResponse createGuardarInformacionEvaluacionResponse() {
        return new GuardarInformacionEvaluacionResponse();
    }

    /**
     * Create an instance of {@link CancelarProcesoRapidito }
     * 
     */
    public CancelarProcesoRapidito createCancelarProcesoRapidito() {
        return new CancelarProcesoRapidito();
    }

    /**
     * Create an instance of {@link CancelarProcesoRapiditoResponse }
     * 
     */
    public CancelarProcesoRapiditoResponse createCancelarProcesoRapiditoResponse() {
        return new CancelarProcesoRapiditoResponse();
    }

    /**
     * Create an instance of {@link CrearCreditoEnLinea }
     * 
     */
    public CrearCreditoEnLinea createCrearCreditoEnLinea() {
        return new CrearCreditoEnLinea();
    }

    /**
     * Create an instance of {@link CrearCreditoEnLineaResponse }
     * 
     */
    public CrearCreditoEnLineaResponse createCrearCreditoEnLineaResponse() {
        return new CrearCreditoEnLineaResponse();
    }

    /**
     * Create an instance of {@link GenerarDocumentosCreditoEnLinea }
     * 
     */
    public GenerarDocumentosCreditoEnLinea createGenerarDocumentosCreditoEnLinea() {
        return new GenerarDocumentosCreditoEnLinea();
    }

    /**
     * Create an instance of {@link GenerarDocumentosCreditoEnLineaResponse }
     * 
     */
    public GenerarDocumentosCreditoEnLineaResponse createGenerarDocumentosCreditoEnLineaResponse() {
        return new GenerarDocumentosCreditoEnLineaResponse();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosPorCarpeta }
     * 
     */
    public ConsultarDocumentosPorCarpeta createConsultarDocumentosPorCarpeta() {
        return new ConsultarDocumentosPorCarpeta();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosPorCarpetaResponse }
     * 
     */
    public ConsultarDocumentosPorCarpetaResponse createConsultarDocumentosPorCarpetaResponse() {
        return new ConsultarDocumentosPorCarpetaResponse();
    }

    /**
     * Create an instance of {@link GuardarDocumentoPorCarpeta }
     * 
     */
    public GuardarDocumentoPorCarpeta createGuardarDocumentoPorCarpeta() {
        return new GuardarDocumentoPorCarpeta();
    }

    /**
     * Create an instance of {@link GuardarDocumentoPorCarpetaResponse }
     * 
     */
    public GuardarDocumentoPorCarpetaResponse createGuardarDocumentoPorCarpetaResponse() {
        return new GuardarDocumentoPorCarpetaResponse();
    }

    /**
     * Create an instance of {@link ConsultarProcesoEcomicro }
     * 
     */
    public ConsultarProcesoEcomicro createConsultarProcesoEcomicro() {
        return new ConsultarProcesoEcomicro();
    }

    /**
     * Create an instance of {@link ConsultarProcesoEcomicroResponse }
     * 
     */
    public ConsultarProcesoEcomicroResponse createConsultarProcesoEcomicroResponse() {
        return new ConsultarProcesoEcomicroResponse();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosDigitalizados }
     * 
     */
    public ConsultarDocumentosDigitalizados createConsultarDocumentosDigitalizados() {
        return new ConsultarDocumentosDigitalizados();
    }

    /**
     * Create an instance of {@link ConsultarDocumentosDigitalizadosResponse }
     * 
     */
    public ConsultarDocumentosDigitalizadosResponse createConsultarDocumentosDigitalizadosResponse() {
        return new ConsultarDocumentosDigitalizadosResponse();
    }

    /**
     * Create an instance of {@link GuardarDocumentoDigitalizado }
     * 
     */
    public GuardarDocumentoDigitalizado createGuardarDocumentoDigitalizado() {
        return new GuardarDocumentoDigitalizado();
    }

    /**
     * Create an instance of {@link GuardarDocumentoDigitalizadoResponse }
     * 
     */
    public GuardarDocumentoDigitalizadoResponse createGuardarDocumentoDigitalizadoResponse() {
        return new GuardarDocumentoDigitalizadoResponse();
    }

    /**
     * Create an instance of {@link CrearCreditoFlujo }
     * 
     */
    public CrearCreditoFlujo createCrearCreditoFlujo() {
        return new CrearCreditoFlujo();
    }

    /**
     * Create an instance of {@link CrearCreditoFlujoResponse }
     * 
     */
    public CrearCreditoFlujoResponse createCrearCreditoFlujoResponse() {
        return new CrearCreditoFlujoResponse();
    }

    /**
     * Create an instance of {@link AprobarFaseAprobacionSeguro }
     * 
     */
    public AprobarFaseAprobacionSeguro createAprobarFaseAprobacionSeguro() {
        return new AprobarFaseAprobacionSeguro();
    }

    /**
     * Create an instance of {@link AprobarFaseAprobacionSeguroResponse }
     * 
     */
    public AprobarFaseAprobacionSeguroResponse createAprobarFaseAprobacionSeguroResponse() {
        return new AprobarFaseAprobacionSeguroResponse();
    }

    /**
     * Create an instance of {@link ValidarBloqueoAprobacion }
     * 
     */
    public ValidarBloqueoAprobacion createValidarBloqueoAprobacion() {
        return new ValidarBloqueoAprobacion();
    }

    /**
     * Create an instance of {@link ValidarBloqueoAprobacionResponse }
     * 
     */
    public ValidarBloqueoAprobacionResponse createValidarBloqueoAprobacionResponse() {
        return new ValidarBloqueoAprobacionResponse();
    }

    /**
     * Create an instance of {@link RecuperarRiesgoAmbiental }
     * 
     */
    public RecuperarRiesgoAmbiental createRecuperarRiesgoAmbiental() {
        return new RecuperarRiesgoAmbiental();
    }

    /**
     * Create an instance of {@link RecuperarRiesgoAmbientalResponse }
     * 
     */
    public RecuperarRiesgoAmbientalResponse createRecuperarRiesgoAmbientalResponse() {
        return new RecuperarRiesgoAmbientalResponse();
    }

    /**
     * Create an instance of {@link GuardarRiesgoAmbiental }
     * 
     */
    public GuardarRiesgoAmbiental createGuardarRiesgoAmbiental() {
        return new GuardarRiesgoAmbiental();
    }

    /**
     * Create an instance of {@link GuardarRiesgoAmbientalResponse }
     * 
     */
    public GuardarRiesgoAmbientalResponse createGuardarRiesgoAmbientalResponse() {
        return new GuardarRiesgoAmbientalResponse();
    }

    /**
     * Create an instance of {@link SimularPagoExtraordinarioCredito }
     * 
     */
    public SimularPagoExtraordinarioCredito createSimularPagoExtraordinarioCredito() {
        return new SimularPagoExtraordinarioCredito();
    }

    /**
     * Create an instance of {@link SimularPagoExtraordinarioCreditoResponse }
     * 
     */
    public SimularPagoExtraordinarioCreditoResponse createSimularPagoExtraordinarioCreditoResponse() {
        return new SimularPagoExtraordinarioCreditoResponse();
    }

    /**
     * Create an instance of {@link ProcesarPagoExtraordinarioCredito }
     * 
     */
    public ProcesarPagoExtraordinarioCredito createProcesarPagoExtraordinarioCredito() {
        return new ProcesarPagoExtraordinarioCredito();
    }

    /**
     * Create an instance of {@link ProcesarPagoExtraordinarioCreditoResponse }
     * 
     */
    public ProcesarPagoExtraordinarioCreditoResponse createProcesarPagoExtraordinarioCreditoResponse() {
        return new ProcesarPagoExtraordinarioCreditoResponse();
    }

    /**
     * Create an instance of {@link RecibirDocumentoFirmado }
     * 
     */
    public RecibirDocumentoFirmado createRecibirDocumentoFirmado() {
        return new RecibirDocumentoFirmado();
    }

    /**
     * Create an instance of {@link RecibirDocumentoFirmadoResponse }
     * 
     */
    public RecibirDocumentoFirmadoResponse createRecibirDocumentoFirmadoResponse() {
        return new RecibirDocumentoFirmadoResponse();
    }

    /**
     * Create an instance of {@link RegistrarFirmaElectronicaDocumento }
     * 
     */
    public RegistrarFirmaElectronicaDocumento createRegistrarFirmaElectronicaDocumento() {
        return new RegistrarFirmaElectronicaDocumento();
    }

    /**
     * Create an instance of {@link RegistrarFirmaElectronicaDocumentoResponse }
     * 
     */
    public RegistrarFirmaElectronicaDocumentoResponse createRegistrarFirmaElectronicaDocumentoResponse() {
        return new RegistrarFirmaElectronicaDocumentoResponse();
    }

    /**
     * Create an instance of {@link RecibirRespuestaFirmaElectronica }
     * 
     */
    public RecibirRespuestaFirmaElectronica createRecibirRespuestaFirmaElectronica() {
        return new RecibirRespuestaFirmaElectronica();
    }

    /**
     * Create an instance of {@link RecibirRespuestaFirmaElectronicaResponse }
     * 
     */
    public RecibirRespuestaFirmaElectronicaResponse createRecibirRespuestaFirmaElectronicaResponse() {
        return new RecibirRespuestaFirmaElectronicaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCreditos", scope = ConsultarClientesTramite.class)
    public JAXBElement<MECreditos> createConsultarClientesTramiteMeConsultasCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarClientesTramiteMeConsultasCreditos_QNAME, MECreditos.class, ConsultarClientesTramite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClientesTramiteResult", scope = ConsultarClientesTramiteResponse.class)
    public JAXBElement<MSCreditos> createConsultarClientesTramiteResponseConsultarClientesTramiteResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarClientesTramiteResponseConsultarClientesTramiteResult_QNAME, MSCreditos.class, ConsultarClientesTramiteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCreditos", scope = ConsultarCreditosCliente.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarCreditosClienteMeConsultasCreditos(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarClientesTramiteMeConsultasCreditos_QNAME, MEIdentificacionCliente.class, ConsultarCreditosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCreditosClienteResult", scope = ConsultarCreditosClienteResponse.class)
    public JAXBElement<MSConsultasCredito> createConsultarCreditosClienteResponseConsultarCreditosClienteResult(MSConsultasCredito value) {
        return new JAXBElement<MSConsultasCredito>(_ConsultarCreditosClienteResponseConsultarCreditosClienteResult_QNAME, MSConsultasCredito.class, ConsultarCreditosClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCreditos", scope = ConsultarCreditosIndirectosCliente.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarCreditosIndirectosClienteMeConsultasCreditos(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarClientesTramiteMeConsultasCreditos_QNAME, MEIdentificacionCliente.class, ConsultarCreditosIndirectosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCreditosIndirectosClienteResult", scope = ConsultarCreditosIndirectosClienteResponse.class)
    public JAXBElement<MSConsultasCredito> createConsultarCreditosIndirectosClienteResponseConsultarCreditosIndirectosClienteResult(MSConsultasCredito value) {
        return new JAXBElement<MSConsultasCredito>(_ConsultarCreditosIndirectosClienteResponseConsultarCreditosIndirectosClienteResult_QNAME, MSConsultasCredito.class, ConsultarCreditosIndirectosClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarMovimientosCredito.class)
    public JAXBElement<MEConsultasCredito> createConsultarMovimientosCreditoMeConsultasCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEConsultasCredito.class, ConsultarMovimientosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarMovimientosCreditoResult", scope = ConsultarMovimientosCreditoResponse.class)
    public JAXBElement<MSConsultasCredito> createConsultarMovimientosCreditoResponseConsultarMovimientosCreditoResult(MSConsultasCredito value) {
        return new JAXBElement<MSConsultasCredito>(_ConsultarMovimientosCreditoResponseConsultarMovimientosCreditoResult_QNAME, MSConsultasCredito.class, ConsultarMovimientosCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarDetalleCredito.class)
    public JAXBElement<MEConsultasCredito> createConsultarDetalleCreditoMeConsultasCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEConsultasCredito.class, ConsultarDetalleCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDetalleCreditoResult", scope = ConsultarDetalleCreditoResponse.class)
    public JAXBElement<MSConsultasCredito> createConsultarDetalleCreditoResponseConsultarDetalleCreditoResult(MSConsultasCredito value) {
        return new JAXBElement<MSConsultasCredito>(_ConsultarDetalleCreditoResponseConsultarDetalleCreditoResult_QNAME, MSConsultasCredito.class, ConsultarDetalleCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meGarantia", scope = RegistrarGarantiaCliente.class)
    public JAXBElement<MECreacionGarantia> createRegistrarGarantiaClienteMeGarantia(MECreacionGarantia value) {
        return new JAXBElement<MECreacionGarantia>(_RegistrarGarantiaClienteMeGarantia_QNAME, MECreacionGarantia.class, RegistrarGarantiaCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarGarantiaClienteResult", scope = RegistrarGarantiaClienteResponse.class)
    public JAXBElement<MSCreacionGarantia> createRegistrarGarantiaClienteResponseRegistrarGarantiaClienteResult(MSCreacionGarantia value) {
        return new JAXBElement<MSCreacionGarantia>(_RegistrarGarantiaClienteResponseRegistrarGarantiaClienteResult_QNAME, MSCreacionGarantia.class, RegistrarGarantiaClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReasignacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReasignacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meReasignacion", scope = ReasignarGarantia.class)
    public JAXBElement<MEReasignacionGarantia> createReasignarGarantiaMeReasignacion(MEReasignacionGarantia value) {
        return new JAXBElement<MEReasignacionGarantia>(_ReasignarGarantiaMeReasignacion_QNAME, MEReasignacionGarantia.class, ReasignarGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ReasignarGarantiaResult", scope = ReasignarGarantiaResponse.class)
    public JAXBElement<MensajeSalidaBase> createReasignarGarantiaResponseReasignarGarantiaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ReasignarGarantiaResponseReasignarGarantiaResult_QNAME, MensajeSalidaBase.class, ReasignarGarantiaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarGarantias.class)
    public JAXBElement<MEConsultasGarantia> createConsultarGarantiasMeConsulta(MEConsultasGarantia value) {
        return new JAXBElement<MEConsultasGarantia>(_ConsultarGarantiasMeConsulta_QNAME, MEConsultasGarantia.class, ConsultarGarantias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasGarantias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasGarantias }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarGarantiasResult", scope = ConsultarGarantiasResponse.class)
    public JAXBElement<MSConsultasGarantias> createConsultarGarantiasResponseConsultarGarantiasResult(MSConsultasGarantias value) {
        return new JAXBElement<MSConsultasGarantias>(_ConsultarGarantiasResponseConsultarGarantiasResult_QNAME, MSConsultasGarantias.class, ConsultarGarantiasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarTipoCartera.class)
    public JAXBElement<METipoCartera> createConsultarTipoCarteraMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarTipoCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTipoCarteraResult", scope = ConsultarTipoCarteraResponse.class)
    public JAXBElement<MSCatalogos> createConsultarTipoCarteraResponseConsultarTipoCarteraResult(MSCatalogos value) {
        return new JAXBElement<MSCatalogos>(_ConsultarTipoCarteraResponseConsultarTipoCarteraResult_QNAME, MSCatalogos.class, ConsultarTipoCarteraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarDestinoFinanciero.class)
    public JAXBElement<METipoCartera> createConsultarDestinoFinancieroMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarDestinoFinanciero.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDestinoFinancieroResult", scope = ConsultarDestinoFinancieroResponse.class)
    public JAXBElement<MSCatalogos> createConsultarDestinoFinancieroResponseConsultarDestinoFinancieroResult(MSCatalogos value) {
        return new JAXBElement<MSCatalogos>(_ConsultarDestinoFinancieroResponseConsultarDestinoFinancieroResult_QNAME, MSCatalogos.class, ConsultarDestinoFinancieroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarSegmentoCredito.class)
    public JAXBElement<METipoCartera> createConsultarSegmentoCreditoMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarSegmentoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSegmentoCreditoResult", scope = ConsultarSegmentoCreditoResponse.class)
    public JAXBElement<MSCatalogos> createConsultarSegmentoCreditoResponseConsultarSegmentoCreditoResult(MSCatalogos value) {
        return new JAXBElement<MSCatalogos>(_ConsultarSegmentoCreditoResponseConsultarSegmentoCreditoResult_QNAME, MSCatalogos.class, ConsultarSegmentoCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarTipoOperacion.class)
    public JAXBElement<METipoCartera> createConsultarTipoOperacionMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarTipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTipoOperacionResult", scope = ConsultarTipoOperacionResponse.class)
    public JAXBElement<MSTipoOperacion> createConsultarTipoOperacionResponseConsultarTipoOperacionResult(MSTipoOperacion value) {
        return new JAXBElement<MSTipoOperacion>(_ConsultarTipoOperacionResponseConsultarTipoOperacionResult_QNAME, MSTipoOperacion.class, ConsultarTipoOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarTipoDividendo.class)
    public JAXBElement<METipoCartera> createConsultarTipoDividendoMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarTipoDividendo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTipoDividendoResult", scope = ConsultarTipoDividendoResponse.class)
    public JAXBElement<MSCatalogos> createConsultarTipoDividendoResponseConsultarTipoDividendoResult(MSCatalogos value) {
        return new JAXBElement<MSCatalogos>(_ConsultarTipoDividendoResponseConsultarTipoDividendoResult_QNAME, MSCatalogos.class, ConsultarTipoDividendoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarOperacion.class)
    public JAXBElement<METipoCartera> createConsultarOperacionMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarOperacionResult", scope = ConsultarOperacionResponse.class)
    public JAXBElement<MSCreditos> createConsultarOperacionResponseConsultarOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarOperacionResponseConsultarOperacionResult_QNAME, MSCreditos.class, ConsultarOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarSaldoOperacion.class)
    public JAXBElement<METipoCartera> createConsultarSaldoOperacionMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarSaldoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldoOperacionResult", scope = ConsultarSaldoOperacionResponse.class)
    public JAXBElement<MSCreditos> createConsultarSaldoOperacionResponseConsultarSaldoOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarSaldoOperacionResponseConsultarSaldoOperacionResult_QNAME, MSCreditos.class, ConsultarSaldoOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarSaldosVencidosOperaciones.class)
    public JAXBElement<MensajeEntradaBase> createConsultarSaldosVencidosOperacionesMeConsulta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ConsultarGarantiasMeConsulta_QNAME, MensajeEntradaBase.class, ConsultarSaldosVencidosOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldosVencidos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldosVencidos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosVencidosOperacionesResult", scope = ConsultarSaldosVencidosOperacionesResponse.class)
    public JAXBElement<MSConsultaSaldosVencidos> createConsultarSaldosVencidosOperacionesResponseConsultarSaldosVencidosOperacionesResult(MSConsultaSaldosVencidos value) {
        return new JAXBElement<MSConsultaSaldosVencidos>(_ConsultarSaldosVencidosOperacionesResponseConsultarSaldosVencidosOperacionesResult_QNAME, MSConsultaSaldosVencidos.class, ConsultarSaldosVencidosOperacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarTablaAmortizacion.class)
    public JAXBElement<METipoCartera> createConsultarTablaAmortizacionMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarTablaAmortizacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTablaAmortizacionResult", scope = ConsultarTablaAmortizacionResponse.class)
    public JAXBElement<MSCreditos> createConsultarTablaAmortizacionResponseConsultarTablaAmortizacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarTablaAmortizacionResponseConsultarTablaAmortizacionResult_QNAME, MSCreditos.class, ConsultarTablaAmortizacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarTablaAmortizacionCartera.class)
    public JAXBElement<MEConsultasCredito> createConsultarTablaAmortizacionCarteraMeConsultasCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEConsultasCredito.class, ConsultarTablaAmortizacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTablaAmortizacionCarteraResult", scope = ConsultarTablaAmortizacionCarteraResponse.class)
    public JAXBElement<MSCreditos> createConsultarTablaAmortizacionCarteraResponseConsultarTablaAmortizacionCarteraResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarTablaAmortizacionCarteraResponseConsultarTablaAmortizacionCarteraResult_QNAME, MSCreditos.class, ConsultarTablaAmortizacionCarteraResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCartera", scope = ConsultarPagoOperacion.class)
    public JAXBElement<METipoCartera> createConsultarPagoOperacionMeTipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_ConsultarTipoCarteraMeTipoCartera_QNAME, METipoCartera.class, ConsultarPagoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarPagoOperacionResult", scope = ConsultarPagoOperacionResponse.class)
    public JAXBElement<MSCreditos> createConsultarPagoOperacionResponseConsultarPagoOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarPagoOperacionResponseConsultarPagoOperacionResult_QNAME, MSCreditos.class, ConsultarPagoOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarActividadDestino.class)
    public JAXBElement<MECreditos> createValidarActividadDestinoMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ValidarActividadDestino.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarActividadDestinoResult", scope = ValidarActividadDestinoResponse.class)
    public JAXBElement<MSCreditos> createValidarActividadDestinoResponseValidarActividadDestinoResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ValidarActividadDestinoResponseValidarActividadDestinoResult_QNAME, MSCreditos.class, ValidarActividadDestinoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarSegmento.class)
    public JAXBElement<MECreditos> createValidarSegmentoMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ValidarSegmento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarSegmentoResult", scope = ValidarSegmentoResponse.class)
    public JAXBElement<MSCreditos> createValidarSegmentoResponseValidarSegmentoResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ValidarSegmentoResponseValidarSegmentoResult_QNAME, MSCreditos.class, ValidarSegmentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarRiesgoCliente.class)
    public JAXBElement<MECreditos> createValidarRiesgoClienteMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ValidarRiesgoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarRiesgoClienteResult", scope = ValidarRiesgoClienteResponse.class)
    public JAXBElement<MSCreditos> createValidarRiesgoClienteResponseValidarRiesgoClienteResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ValidarRiesgoClienteResponseValidarRiesgoClienteResult_QNAME, MSCreditos.class, ValidarRiesgoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CrearActualizarOperacion.class)
    public JAXBElement<MECreditos> createCrearActualizarOperacionMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, CrearActualizarOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearActualizarOperacionResult", scope = CrearActualizarOperacionResponse.class)
    public JAXBElement<MSCreditos> createCrearActualizarOperacionResponseCrearActualizarOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_CrearActualizarOperacionResponseCrearActualizarOperacionResult_QNAME, MSCreditos.class, CrearActualizarOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = IniciarFlujo.class)
    public JAXBElement<MECreditos> createIniciarFlujoMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, IniciarFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "IniciarFlujoResult", scope = IniciarFlujoResponse.class)
    public JAXBElement<MSCreditos> createIniciarFlujoResponseIniciarFlujoResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_IniciarFlujoResponseIniciarFlujoResult_QNAME, MSCreditos.class, IniciarFlujoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = IniciarFlujoCreditoNormal.class)
    public JAXBElement<MECreditos> createIniciarFlujoCreditoNormalMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, IniciarFlujoCreditoNormal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "IniciarFlujoCreditoNormalResult", scope = IniciarFlujoCreditoNormalResponse.class)
    public JAXBElement<MSCreditos> createIniciarFlujoCreditoNormalResponseIniciarFlujoCreditoNormalResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_IniciarFlujoCreditoNormalResponseIniciarFlujoCreditoNormalResult_QNAME, MSCreditos.class, IniciarFlujoCreditoNormalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = AnularOperacion.class)
    public JAXBElement<MECreditos> createAnularOperacionMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, AnularOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AnularOperacionResult", scope = AnularOperacionResponse.class)
    public JAXBElement<MSCreditos> createAnularOperacionResponseAnularOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_AnularOperacionResponseAnularOperacionResult_QNAME, MSCreditos.class, AnularOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ActivarOperacion.class)
    public JAXBElement<MECreditos> createActivarOperacionMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ActivarOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActivarOperacionResult", scope = ActivarOperacionResponse.class)
    public JAXBElement<MSCreditos> createActivarOperacionResponseActivarOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ActivarOperacionResponseActivarOperacionResult_QNAME, MSCreditos.class, ActivarOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarImpresiones.class)
    public JAXBElement<MECreditos> createValidarImpresionesMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ValidarImpresiones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarImpresionesResult", scope = ValidarImpresionesResponse.class)
    public JAXBElement<MSCreditos> createValidarImpresionesResponseValidarImpresionesResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ValidarImpresionesResponseValidarImpresionesResult_QNAME, MSCreditos.class, ValidarImpresionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = DesembolsarOperacion.class)
    public JAXBElement<MECreditos> createDesembolsarOperacionMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, DesembolsarOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "DesembolsarOperacionResult", scope = DesembolsarOperacionResponse.class)
    public JAXBElement<MSCreditos> createDesembolsarOperacionResponseDesembolsarOperacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_DesembolsarOperacionResponseDesembolsarOperacionResult_QNAME, MSCreditos.class, DesembolsarOperacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ConsultarBuro.class)
    public JAXBElement<MECreditos> createConsultarBuroMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ConsultarBuro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarBuroResult", scope = ConsultarBuroResponse.class)
    public JAXBElement<MSCreditos> createConsultarBuroResponseConsultarBuroResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarBuroResponseConsultarBuroResult_QNAME, MSCreditos.class, ConsultarBuroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarGarantiasCruzadas.class)
    public JAXBElement<MECreditos> createValidarGarantiasCruzadasMeCredito(MECreditos value) {
        return new JAXBElement<MECreditos>(_ValidarActividadDestinoMeCredito_QNAME, MECreditos.class, ValidarGarantiasCruzadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarGarantiasCruzadasResult", scope = ValidarGarantiasCruzadasResponse.class)
    public JAXBElement<MSCreditos> createValidarGarantiasCruzadasResponseValidarGarantiasCruzadasResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ValidarGarantiasCruzadasResponseValidarGarantiasCruzadasResult_QNAME, MSCreditos.class, ValidarGarantiasCruzadasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERegistroPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERegistroPago }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRegistro", scope = GuardarPagosAcc.class)
    public JAXBElement<MERegistroPago> createGuardarPagosAccMeRegistro(MERegistroPago value) {
        return new JAXBElement<MERegistroPago>(_GuardarPagosAccMeRegistro_QNAME, MERegistroPago.class, GuardarPagosAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarPagosAccResult", scope = GuardarPagosAccResponse.class)
    public JAXBElement<MSRegistroPago> createGuardarPagosAccResponseGuardarPagosAccResult(MSRegistroPago value) {
        return new JAXBElement<MSRegistroPago>(_GuardarPagosAccResponseGuardarPagosAccResult_QNAME, MSRegistroPago.class, GuardarPagosAccResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meSimulacion", scope = CalcularSimulacion.class)
    public JAXBElement<MESimulacion> createCalcularSimulacionMeSimulacion(MESimulacion value) {
        return new JAXBElement<MESimulacion>(_CalcularSimulacionMeSimulacion_QNAME, MESimulacion.class, CalcularSimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CalcularSimulacionResult", scope = CalcularSimulacionResponse.class)
    public JAXBElement<MSCreditos> createCalcularSimulacionResponseCalcularSimulacionResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_CalcularSimulacionResponseCalcularSimulacionResult_QNAME, MSCreditos.class, CalcularSimulacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaScore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaScore }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaScore", scope = ConsultarResumenScore.class)
    public JAXBElement<MEConsultaScore> createConsultarResumenScoreMeConsultaScore(MEConsultaScore value) {
        return new JAXBElement<MEConsultaScore>(_ConsultarResumenScoreMeConsultaScore_QNAME, MEConsultaScore.class, ConsultarResumenScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarResumenScoreResult", scope = ConsultarResumenScoreResponse.class)
    public JAXBElement<MSCreditos> createConsultarResumenScoreResponseConsultarResumenScoreResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarResumenScoreResponseConsultarResumenScoreResult_QNAME, MSCreditos.class, ConsultarResumenScoreResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meIdentificacion", scope = ConsultarSolicitudesDeudor.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarSolicitudesDeudorMeIdentificacion(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarSolicitudesDeudorMeIdentificacion_QNAME, MEIdentificacionCliente.class, ConsultarSolicitudesDeudor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSolicitudesDeudorResult", scope = ConsultarSolicitudesDeudorResponse.class)
    public JAXBElement<MSCreditos> createConsultarSolicitudesDeudorResponseConsultarSolicitudesDeudorResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarSolicitudesDeudorResponseConsultarSolicitudesDeudorResult_QNAME, MSCreditos.class, ConsultarSolicitudesDeudorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meSimulacion", scope = SimularCredito.class)
    public JAXBElement<MESimulacion> createSimularCreditoMeSimulacion(MESimulacion value) {
        return new JAXBElement<MESimulacion>(_CalcularSimulacionMeSimulacion_QNAME, MESimulacion.class, SimularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SimularCreditoResult", scope = SimularCreditoResponse.class)
    public JAXBElement<MSCreditos> createSimularCreditoResponseSimularCreditoResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_SimularCreditoResponseSimularCreditoResult_QNAME, MSCreditos.class, SimularCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarTablaAmortizacionDetallada.class)
    public JAXBElement<MEConsultasCredito> createConsultarTablaAmortizacionDetalladaMeConsultasCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEConsultasCredito.class, ConsultarTablaAmortizacionDetallada.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTablaAmortizacionDetalladaResult", scope = ConsultarTablaAmortizacionDetalladaResponse.class)
    public JAXBElement<MSCreditos> createConsultarTablaAmortizacionDetalladaResponseConsultarTablaAmortizacionDetalladaResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_ConsultarTablaAmortizacionDetalladaResponseConsultarTablaAmortizacionDetalladaResult_QNAME, MSCreditos.class, ConsultarTablaAmortizacionDetalladaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarClienteParaCredito.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarClienteParaCreditoMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarClienteParaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClienteParaCreditoResult", scope = ConsultarClienteParaCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarClienteParaCreditoResponseConsultarClienteParaCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarClienteParaCreditoResponseConsultarClienteParaCreditoResult_QNAME, MensajeSalidaBase.class, ConsultarClienteParaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarValidarScoreCliente.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarValidarScoreClienteMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarValidarScoreCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarValidarScoreClienteResult", scope = ConsultarValidarScoreClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarValidarScoreClienteResponseConsultarValidarScoreClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarValidarScoreClienteResponseConsultarValidarScoreClienteResult_QNAME, MensajeSalidaBase.class, ConsultarValidarScoreClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = CrearSolicitudCanales.class)
    public JAXBElement<MECreditoCanales> createCrearSolicitudCanalesEntrada(MECreditoCanales value) {
        return new JAXBElement<MECreditoCanales>(_CrearSolicitudCanalesEntrada_QNAME, MECreditoCanales.class, CrearSolicitudCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearSolicitudCanalesResult", scope = CrearSolicitudCanalesResponse.class)
    public JAXBElement<MSCreditoCanales> createCrearSolicitudCanalesResponseCrearSolicitudCanalesResult(MSCreditoCanales value) {
        return new JAXBElement<MSCreditoCanales>(_CrearSolicitudCanalesResponseCrearSolicitudCanalesResult_QNAME, MSCreditoCanales.class, CrearSolicitudCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = ActualizarSolicitudCanales.class)
    public JAXBElement<MECreditoCanales> createActualizarSolicitudCanalesEntrada(MECreditoCanales value) {
        return new JAXBElement<MECreditoCanales>(_CrearSolicitudCanalesEntrada_QNAME, MECreditoCanales.class, ActualizarSolicitudCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarSolicitudCanalesResult", scope = ActualizarSolicitudCanalesResponse.class)
    public JAXBElement<MSCreditoCanales> createActualizarSolicitudCanalesResponseActualizarSolicitudCanalesResult(MSCreditoCanales value) {
        return new JAXBElement<MSCreditoCanales>(_ActualizarSolicitudCanalesResponseActualizarSolicitudCanalesResult_QNAME, MSCreditoCanales.class, ActualizarSolicitudCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = GuardarDocumentoCanales.class)
    public JAXBElement<MEDocumentoCredito> createGuardarDocumentoCanalesEntrada(MEDocumentoCredito value) {
        return new JAXBElement<MEDocumentoCredito>(_CrearSolicitudCanalesEntrada_QNAME, MEDocumentoCredito.class, GuardarDocumentoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarDocumentoCanalesResult", scope = GuardarDocumentoCanalesResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarDocumentoCanalesResponseGuardarDocumentoCanalesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarDocumentoCanalesResponseGuardarDocumentoCanalesResult_QNAME, MensajeSalidaBase.class, GuardarDocumentoCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = ValidarCondicionesProcesoRapido.class)
    public JAXBElement<MEIdentificacionCliente> createValidarCondicionesProcesoRapidoEntrada(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_CrearSolicitudCanalesEntrada_QNAME, MEIdentificacionCliente.class, ValidarCondicionesProcesoRapido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarCondicionesProcesoRapidoResult", scope = ValidarCondicionesProcesoRapidoResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarCondicionesProcesoRapidoResponseValidarCondicionesProcesoRapidoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarCondicionesProcesoRapidoResponseValidarCondicionesProcesoRapidoResult_QNAME, MensajeSalidaBase.class, ValidarCondicionesProcesoRapidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meLiquidacion", scope = LiquidarOperacionesFechaFutura.class)
    public JAXBElement<MensajeEntradaBase> createLiquidarOperacionesFechaFuturaMeLiquidacion(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_LiquidarOperacionesFechaFuturaMeLiquidacion_QNAME, MensajeEntradaBase.class, LiquidarOperacionesFechaFutura.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "LiquidarOperacionesFechaFuturaResult", scope = LiquidarOperacionesFechaFuturaResponse.class)
    public JAXBElement<MensajeSalidaBase> createLiquidarOperacionesFechaFuturaResponseLiquidarOperacionesFechaFuturaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_LiquidarOperacionesFechaFuturaResponseLiquidarOperacionesFechaFuturaResult_QNAME, MensajeSalidaBase.class, LiquidarOperacionesFechaFuturaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CrearCreditoConsolidado.class)
    public JAXBElement<MECreditoConsolidado> createCrearCreditoConsolidadoMeCredito(MECreditoConsolidado value) {
        return new JAXBElement<MECreditoConsolidado>(_ValidarActividadDestinoMeCredito_QNAME, MECreditoConsolidado.class, CrearCreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearCreditoConsolidadoResult", scope = CrearCreditoConsolidadoResponse.class)
    public JAXBElement<MSCreditoConsolidado> createCrearCreditoConsolidadoResponseCrearCreditoConsolidadoResult(MSCreditoConsolidado value) {
        return new JAXBElement<MSCreditoConsolidado>(_CrearCreditoConsolidadoResponseCrearCreditoConsolidadoResult_QNAME, MSCreditoConsolidado.class, CrearCreditoConsolidadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRegularizacion", scope = DevolverPendientesRegularizacionDocumentos.class)
    public JAXBElement<MensajeEntradaBase> createDevolverPendientesRegularizacionDocumentosMeRegularizacion(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_DevolverPendientesRegularizacionDocumentosMeRegularizacion_QNAME, MensajeEntradaBase.class, DevolverPendientesRegularizacionDocumentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "DevolverPendientesRegularizacionDocumentosResult", scope = DevolverPendientesRegularizacionDocumentosResponse.class)
    public JAXBElement<MensajeSalidaBase> createDevolverPendientesRegularizacionDocumentosResponseDevolverPendientesRegularizacionDocumentosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_DevolverPendientesRegularizacionDocumentosResponseDevolverPendientesRegularizacionDocumentosResult_QNAME, MensajeSalidaBase.class, DevolverPendientesRegularizacionDocumentosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAutomotriz", scope = CotizarCreditoAutomotriz.class)
    public JAXBElement<MECreditoAutomotriz> createCotizarCreditoAutomotrizMeAutomotriz(MECreditoAutomotriz value) {
        return new JAXBElement<MECreditoAutomotriz>(_CotizarCreditoAutomotrizMeAutomotriz_QNAME, MECreditoAutomotriz.class, CotizarCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CotizarCreditoAutomotrizResult", scope = CotizarCreditoAutomotrizResponse.class)
    public JAXBElement<MSCreditoAutomotriz> createCotizarCreditoAutomotrizResponseCotizarCreditoAutomotrizResult(MSCreditoAutomotriz value) {
        return new JAXBElement<MSCreditoAutomotriz>(_CotizarCreditoAutomotrizResponseCotizarCreditoAutomotrizResult_QNAME, MSCreditoAutomotriz.class, CotizarCreditoAutomotrizResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAutomotriz", scope = GenerarSolicitudCreditoAutomotriz.class)
    public JAXBElement<MECreditoAutomotriz> createGenerarSolicitudCreditoAutomotrizMeAutomotriz(MECreditoAutomotriz value) {
        return new JAXBElement<MECreditoAutomotriz>(_CotizarCreditoAutomotrizMeAutomotriz_QNAME, MECreditoAutomotriz.class, GenerarSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSolicitudCreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSolicitudCreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarSolicitudCreditoAutomotrizResult", scope = GenerarSolicitudCreditoAutomotrizResponse.class)
    public JAXBElement<MSSolicitudCreditoAutomotriz> createGenerarSolicitudCreditoAutomotrizResponseGenerarSolicitudCreditoAutomotrizResult(MSSolicitudCreditoAutomotriz value) {
        return new JAXBElement<MSSolicitudCreditoAutomotriz>(_GenerarSolicitudCreditoAutomotrizResponseGenerarSolicitudCreditoAutomotrizResult_QNAME, MSSolicitudCreditoAutomotriz.class, GenerarSolicitudCreditoAutomotrizResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSolicitudAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSolicitudAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarEstadoSolicitudAutomotriz.class)
    public JAXBElement<MEConsultaSolicitudAutomotriz> createConsultarEstadoSolicitudAutomotrizMeConsulta(MEConsultaSolicitudAutomotriz value) {
        return new JAXBElement<MEConsultaSolicitudAutomotriz>(_ConsultarGarantiasMeConsulta_QNAME, MEConsultaSolicitudAutomotriz.class, ConsultarEstadoSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSolicitudAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSolicitudAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarEstadoSolicitudAutomotrizResult", scope = ConsultarEstadoSolicitudAutomotrizResponse.class)
    public JAXBElement<MSConsultaSolicitudAutomotriz> createConsultarEstadoSolicitudAutomotrizResponseConsultarEstadoSolicitudAutomotrizResult(MSConsultaSolicitudAutomotriz value) {
        return new JAXBElement<MSConsultaSolicitudAutomotriz>(_ConsultarEstadoSolicitudAutomotrizResponseConsultarEstadoSolicitudAutomotrizResult_QNAME, MSConsultaSolicitudAutomotriz.class, ConsultarEstadoSolicitudAutomotrizResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERenovacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERenovacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = RenovarCredito.class)
    public JAXBElement<MERenovacionCredito> createRenovarCreditoMeCredito(MERenovacionCredito value) {
        return new JAXBElement<MERenovacionCredito>(_ValidarActividadDestinoMeCredito_QNAME, MERenovacionCredito.class, RenovarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRenovacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRenovacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RenovarCreditoResult", scope = RenovarCreditoResponse.class)
    public JAXBElement<MSRenovacionCredito> createRenovarCreditoResponseRenovarCreditoResult(MSRenovacionCredito value) {
        return new JAXBElement<MSRenovacionCredito>(_RenovarCreditoResponseRenovarCreditoResult_QNAME, MSRenovacionCredito.class, RenovarCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = BuscarDatosRenovacion.class)
    public JAXBElement<MEIdentificacionCliente> createBuscarDatosRenovacionMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, BuscarDatosRenovacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "BuscarDatosRenovacionResult", scope = BuscarDatosRenovacionResponse.class)
    public JAXBElement<MSDatosRenovacion> createBuscarDatosRenovacionResponseBuscarDatosRenovacionResult(MSDatosRenovacion value) {
        return new JAXBElement<MSDatosRenovacion>(_BuscarDatosRenovacionResponseBuscarDatosRenovacionResult_QNAME, MSDatosRenovacion.class, BuscarDatosRenovacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarClienteElite.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarClienteEliteMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarClienteElite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaCreditoPreferencial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaCreditoPreferencial }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClienteEliteResult", scope = ConsultarClienteEliteResponse.class)
    public JAXBElement<MSConsultaCreditoPreferencial> createConsultarClienteEliteResponseConsultarClienteEliteResult(MSConsultaCreditoPreferencial value) {
        return new JAXBElement<MSConsultaCreditoPreferencial>(_ConsultarClienteEliteResponseConsultarClienteEliteResult_QNAME, MSConsultaCreditoPreferencial.class, ConsultarClienteEliteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CrearCreditoElite.class)
    public JAXBElement<MECreditoConsolidado> createCrearCreditoEliteMeCredito(MECreditoConsolidado value) {
        return new JAXBElement<MECreditoConsolidado>(_ValidarActividadDestinoMeCredito_QNAME, MECreditoConsolidado.class, CrearCreditoElite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearCreditoEliteResult", scope = CrearCreditoEliteResponse.class)
    public JAXBElement<MSCreditos> createCrearCreditoEliteResponseCrearCreditoEliteResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_CrearCreditoEliteResponseCrearCreditoEliteResult_QNAME, MSCreditos.class, CrearCreditoEliteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = GenerarDocumentosCredito.class)
    public JAXBElement<MEConsultasCredito> createGenerarDocumentosCreditoMeCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ValidarActividadDestinoMeCredito_QNAME, MEConsultasCredito.class, GenerarDocumentosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarDocumentosCreditoResult", scope = GenerarDocumentosCreditoResponse.class)
    public JAXBElement<MSCreditoConsolidado> createGenerarDocumentosCreditoResponseGenerarDocumentosCreditoResult(MSCreditoConsolidado value) {
        return new JAXBElement<MSCreditoConsolidado>(_GenerarDocumentosCreditoResponseGenerarDocumentosCreditoResult_QNAME, MSCreditoConsolidado.class, GenerarDocumentosCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = ValidarAprobarCreditoCanales.class)
    public JAXBElement<MECreditos> createValidarAprobarCreditoCanalesEntrada(MECreditos value) {
        return new JAXBElement<MECreditos>(_CrearSolicitudCanalesEntrada_QNAME, MECreditos.class, ValidarAprobarCreditoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarAprobarCreditoCanalesResult", scope = ValidarAprobarCreditoCanalesResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarAprobarCreditoCanalesResponseValidarAprobarCreditoCanalesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarAprobarCreditoCanalesResponseValidarAprobarCreditoCanalesResult_QNAME, MensajeSalidaBase.class, ValidarAprobarCreditoCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = EnviarDocumentosCredito.class)
    public JAXBElement<MEConsultasCredito> createEnviarDocumentosCreditoMeCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ValidarActividadDestinoMeCredito_QNAME, MEConsultasCredito.class, EnviarDocumentosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EnviarDocumentosCreditoResult", scope = EnviarDocumentosCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createEnviarDocumentosCreditoResponseEnviarDocumentosCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EnviarDocumentosCreditoResponseEnviarDocumentosCreditoResult_QNAME, MensajeSalidaBase.class, EnviarDocumentosCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = GenerarEstadoCuentaLineaCredito.class)
    public JAXBElement<MensajeEntradaBase> createGenerarEstadoCuentaLineaCreditoMeEntrada(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarEstadoCuentaLineaCreditoMeEntrada_QNAME, MensajeEntradaBase.class, GenerarEstadoCuentaLineaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarEstadoCuentaLineaCreditoResult", scope = GenerarEstadoCuentaLineaCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarEstadoCuentaLineaCreditoResponseGenerarEstadoCuentaLineaCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarEstadoCuentaLineaCreditoResponseGenerarEstadoCuentaLineaCreditoResult_QNAME, MensajeSalidaBase.class, GenerarEstadoCuentaLineaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = RevisarCupoLineaCredito.class)
    public JAXBElement<MensajeEntradaBase> createRevisarCupoLineaCreditoMeEntrada(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarEstadoCuentaLineaCreditoMeEntrada_QNAME, MensajeEntradaBase.class, RevisarCupoLineaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RevisarCupoLineaCreditoResult", scope = RevisarCupoLineaCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRevisarCupoLineaCreditoResponseRevisarCupoLineaCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RevisarCupoLineaCreditoResponseRevisarCupoLineaCreditoResult_QNAME, MensajeSalidaBase.class, RevisarCupoLineaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = RegularizarLiquidacionesLineaCredito.class)
    public JAXBElement<MensajeEntradaBase> createRegularizarLiquidacionesLineaCreditoMeEntrada(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarEstadoCuentaLineaCreditoMeEntrada_QNAME, MensajeEntradaBase.class, RegularizarLiquidacionesLineaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegularizarLiquidacionesLineaCreditoResult", scope = RegularizarLiquidacionesLineaCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegularizarLiquidacionesLineaCreditoResponseRegularizarLiquidacionesLineaCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegularizarLiquidacionesLineaCreditoResponseRegularizarLiquidacionesLineaCreditoResult_QNAME, MensajeSalidaBase.class, RegularizarLiquidacionesLineaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoCredito", scope = ConsultarTipoCredito.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarTipoCreditoMeTipoCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarTipoCreditoMeTipoCredito_QNAME, MEIdentificacionCliente.class, ConsultarTipoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTipoCreditoResult", scope = ConsultarTipoCreditoResponse.class)
    public JAXBElement<MSTipoCredito> createConsultarTipoCreditoResponseConsultarTipoCreditoResult(MSTipoCredito value) {
        return new JAXBElement<MSTipoCredito>(_ConsultarTipoCreditoResponseConsultarTipoCreditoResult_QNAME, MSTipoCredito.class, ConsultarTipoCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarValidarScoreClienteRapidito.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarValidarScoreClienteRapiditoMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarValidarScoreClienteRapidito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarValidarScoreClienteRapiditoResult", scope = ConsultarValidarScoreClienteRapiditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarValidarScoreClienteRapiditoResponseConsultarValidarScoreClienteRapiditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarValidarScoreClienteRapiditoResponseConsultarValidarScoreClienteRapiditoResult_QNAME, MensajeSalidaBase.class, ConsultarValidarScoreClienteRapiditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoProcesoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoProcesoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTipoProceso", scope = ConsultarTipoProcesoCredito.class)
    public JAXBElement<METipoProcesoCredito> createConsultarTipoProcesoCreditoMeTipoProceso(METipoProcesoCredito value) {
        return new JAXBElement<METipoProcesoCredito>(_ConsultarTipoProcesoCreditoMeTipoProceso_QNAME, METipoProcesoCredito.class, ConsultarTipoProcesoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoProcesoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoProcesoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTipoProcesoCreditoResult", scope = ConsultarTipoProcesoCreditoResponse.class)
    public JAXBElement<MSTipoProcesoCredito> createConsultarTipoProcesoCreditoResponseConsultarTipoProcesoCreditoResult(MSTipoProcesoCredito value) {
        return new JAXBElement<MSTipoProcesoCredito>(_ConsultarTipoProcesoCreditoResponseConsultarTipoProcesoCreditoResult_QNAME, MSTipoProcesoCredito.class, ConsultarTipoProcesoCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = RecuperarInformacionEvaluacion.class)
    public JAXBElement<MEIdentificacionCliente> createRecuperarInformacionEvaluacionMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, RecuperarInformacionEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecuperarInformacionEvaluacionResult", scope = RecuperarInformacionEvaluacionResponse.class)
    public JAXBElement<MSEvaluacionEconomica> createRecuperarInformacionEvaluacionResponseRecuperarInformacionEvaluacionResult(MSEvaluacionEconomica value) {
        return new JAXBElement<MSEvaluacionEconomica>(_RecuperarInformacionEvaluacionResponseRecuperarInformacionEvaluacionResult_QNAME, MSEvaluacionEconomica.class, RecuperarInformacionEvaluacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECalcularCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECalcularCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCalcularCredito", scope = CalcularCredito.class)
    public JAXBElement<MECalcularCredito> createCalcularCreditoMeCalcularCredito(MECalcularCredito value) {
        return new JAXBElement<MECalcularCredito>(_CalcularCreditoMeCalcularCredito_QNAME, MECalcularCredito.class, CalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCalcularCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCalcularCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CalcularCreditoResult", scope = CalcularCreditoResponse.class)
    public JAXBElement<MSCalcularCredito> createCalcularCreditoResponseCalcularCreditoResult(MSCalcularCredito value) {
        return new JAXBElement<MSCalcularCredito>(_CalcularCreditoResponseCalcularCreditoResult_QNAME, MSCalcularCredito.class, CalcularCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEGuardarCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEGuardarCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meGuardarCredito", scope = GuardarCredito.class)
    public JAXBElement<MEGuardarCredito> createGuardarCreditoMeGuardarCredito(MEGuardarCredito value) {
        return new JAXBElement<MEGuardarCredito>(_GuardarCreditoMeGuardarCredito_QNAME, MEGuardarCredito.class, GuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGuardarCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSGuardarCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarCreditoResult", scope = GuardarCreditoResponse.class)
    public JAXBElement<MSGuardarCredito> createGuardarCreditoResponseGuardarCreditoResult(MSGuardarCredito value) {
        return new JAXBElement<MSGuardarCredito>(_GuardarCreditoResponseGuardarCreditoResult_QNAME, MSGuardarCredito.class, GuardarCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCreditos", scope = ValidarExcepcionesProceso.class)
    public JAXBElement<MEIdentificacionCliente> createValidarExcepcionesProcesoMeConsultasCreditos(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarClientesTramiteMeConsultasCreditos_QNAME, MEIdentificacionCliente.class, ValidarExcepcionesProceso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarExcepcionesProcesoResult", scope = ValidarExcepcionesProcesoResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarExcepcionesProcesoResponseValidarExcepcionesProcesoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarExcepcionesProcesoResponseValidarExcepcionesProcesoResult_QNAME, MensajeSalidaBase.class, ValidarExcepcionesProcesoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = ConsultarDocumentosDigitalizar.class)
    public JAXBElement<MECreditos> createConsultarDocumentosDigitalizarMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, ConsultarDocumentosDigitalizar.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDocumentosDigitalizarResult", scope = ConsultarDocumentosDigitalizarResponse.class)
    public JAXBElement<MSDocumentosCredito> createConsultarDocumentosDigitalizarResponseConsultarDocumentosDigitalizarResult(MSDocumentosCredito value) {
        return new JAXBElement<MSDocumentosCredito>(_ConsultarDocumentosDigitalizarResponseConsultarDocumentosDigitalizarResult_QNAME, MSDocumentosCredito.class, ConsultarDocumentosDigitalizarResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = ValidarDocumentosDigitalizados.class)
    public JAXBElement<MECreditos> createValidarDocumentosDigitalizadosMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, ValidarDocumentosDigitalizados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarDocumentosDigitalizadosResult", scope = ValidarDocumentosDigitalizadosResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarDocumentosDigitalizadosResponseValidarDocumentosDigitalizadosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarDocumentosDigitalizadosResponseValidarDocumentosDigitalizadosResult_QNAME, MensajeSalidaBase.class, ValidarDocumentosDigitalizadosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = IniciarFlujoCreditoRapidito.class)
    public JAXBElement<MECreditos> createIniciarFlujoCreditoRapiditoMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, IniciarFlujoCreditoRapidito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "IniciarFlujoCreditoRapiditoResult", scope = IniciarFlujoCreditoRapiditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createIniciarFlujoCreditoRapiditoResponseIniciarFlujoCreditoRapiditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_IniciarFlujoCreditoRapiditoResponseIniciarFlujoCreditoRapiditoResult_QNAME, MensajeSalidaBase.class, IniciarFlujoCreditoRapiditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionEvaluacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionEvaluacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meInformacionEvaluacion", scope = GuardarInformacionEvaluacion.class)
    public JAXBElement<MEInformacionEvaluacion> createGuardarInformacionEvaluacionMeInformacionEvaluacion(MEInformacionEvaluacion value) {
        return new JAXBElement<MEInformacionEvaluacion>(_GuardarInformacionEvaluacionMeInformacionEvaluacion_QNAME, MEInformacionEvaluacion.class, GuardarInformacionEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarInformacionEvaluacionResult", scope = GuardarInformacionEvaluacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarInformacionEvaluacionResponseGuardarInformacionEvaluacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarInformacionEvaluacionResponseGuardarInformacionEvaluacionResult_QNAME, MensajeSalidaBase.class, GuardarInformacionEvaluacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meIdentificacion", scope = CancelarProcesoRapidito.class)
    public JAXBElement<MEIdentificacionCliente> createCancelarProcesoRapiditoMeIdentificacion(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarSolicitudesDeudorMeIdentificacion_QNAME, MEIdentificacionCliente.class, CancelarProcesoRapidito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CancelarProcesoRapiditoResult", scope = CancelarProcesoRapiditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createCancelarProcesoRapiditoResponseCancelarProcesoRapiditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CancelarProcesoRapiditoResponseCancelarProcesoRapiditoResult_QNAME, MensajeSalidaBase.class, CancelarProcesoRapiditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CrearCreditoEnLinea.class)
    public JAXBElement<MECreacionCredito> createCrearCreditoEnLineaMeCredito(MECreacionCredito value) {
        return new JAXBElement<MECreacionCredito>(_ValidarActividadDestinoMeCredito_QNAME, MECreacionCredito.class, CrearCreditoEnLinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearCreditoEnLineaResult", scope = CrearCreditoEnLineaResponse.class)
    public JAXBElement<MSCreditos> createCrearCreditoEnLineaResponseCrearCreditoEnLineaResult(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_CrearCreditoEnLineaResponseCrearCreditoEnLineaResult_QNAME, MSCreditos.class, CrearCreditoEnLineaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = GenerarDocumentosCreditoEnLinea.class)
    public JAXBElement<MEConsultasCredito> createGenerarDocumentosCreditoEnLineaMeCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_ValidarActividadDestinoMeCredito_QNAME, MEConsultasCredito.class, GenerarDocumentosCreditoEnLinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarDocumentosCreditoEnLineaResult", scope = GenerarDocumentosCreditoEnLineaResponse.class)
    public JAXBElement<MSDocumentosCredito> createGenerarDocumentosCreditoEnLineaResponseGenerarDocumentosCreditoEnLineaResult(MSDocumentosCredito value) {
        return new JAXBElement<MSDocumentosCredito>(_GenerarDocumentosCreditoEnLineaResponseGenerarDocumentosCreditoEnLineaResult_QNAME, MSDocumentosCredito.class, GenerarDocumentosCreditoEnLineaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = ConsultarDocumentosPorCarpeta.class)
    public JAXBElement<MECreditos> createConsultarDocumentosPorCarpetaMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, ConsultarDocumentosPorCarpeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDocumentosPorCarpetaResult", scope = ConsultarDocumentosPorCarpetaResponse.class)
    public JAXBElement<MSDocumentosCredito> createConsultarDocumentosPorCarpetaResponseConsultarDocumentosPorCarpetaResult(MSDocumentosCredito value) {
        return new JAXBElement<MSDocumentosCredito>(_ConsultarDocumentosPorCarpetaResponseConsultarDocumentosPorCarpetaResult_QNAME, MSDocumentosCredito.class, ConsultarDocumentosPorCarpetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECarpetaDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECarpetaDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = GuardarDocumentoPorCarpeta.class)
    public JAXBElement<MECarpetaDocumentosCredito> createGuardarDocumentoPorCarpetaEntrada(MECarpetaDocumentosCredito value) {
        return new JAXBElement<MECarpetaDocumentosCredito>(_CrearSolicitudCanalesEntrada_QNAME, MECarpetaDocumentosCredito.class, GuardarDocumentoPorCarpeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarDocumentoPorCarpetaResult", scope = GuardarDocumentoPorCarpetaResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarDocumentoPorCarpetaResponseGuardarDocumentoPorCarpetaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarDocumentoPorCarpetaResponseGuardarDocumentoPorCarpetaResult_QNAME, MensajeSalidaBase.class, GuardarDocumentoPorCarpetaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarProcesoEcomicro.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarProcesoEcomicroMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarMovimientosCreditoMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarProcesoEcomicro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarProcesoEcomicroResult", scope = ConsultarProcesoEcomicroResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarProcesoEcomicroResponseConsultarProcesoEcomicroResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarProcesoEcomicroResponseConsultarProcesoEcomicroResult_QNAME, MensajeSalidaBase.class, ConsultarProcesoEcomicroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = ConsultarDocumentosDigitalizados.class)
    public JAXBElement<MECreditos> createConsultarDocumentosDigitalizadosMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, ConsultarDocumentosDigitalizados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDocumentosDigitalizadosResult", scope = ConsultarDocumentosDigitalizadosResponse.class)
    public JAXBElement<MSDocumentosCredito> createConsultarDocumentosDigitalizadosResponseConsultarDocumentosDigitalizadosResult(MSDocumentosCredito value) {
        return new JAXBElement<MSDocumentosCredito>(_ConsultarDocumentosDigitalizadosResponseConsultarDocumentosDigitalizadosResult_QNAME, MSDocumentosCredito.class, ConsultarDocumentosDigitalizadosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDocumento", scope = GuardarDocumentoDigitalizado.class)
    public JAXBElement<MEDocumentoCredito> createGuardarDocumentoDigitalizadoMeDocumento(MEDocumentoCredito value) {
        return new JAXBElement<MEDocumentoCredito>(_GuardarDocumentoDigitalizadoMeDocumento_QNAME, MEDocumentoCredito.class, GuardarDocumentoDigitalizado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarDocumentoDigitalizadoResult", scope = GuardarDocumentoDigitalizadoResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarDocumentoDigitalizadoResponseGuardarDocumentoDigitalizadoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarDocumentoDigitalizadoResponseGuardarDocumentoDigitalizadoResult_QNAME, MensajeSalidaBase.class, GuardarDocumentoDigitalizadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CrearCreditoFlujo.class)
    public JAXBElement<MECreditoConsolidado> createCrearCreditoFlujoMeCredito(MECreditoConsolidado value) {
        return new JAXBElement<MECreditoConsolidado>(_ValidarActividadDestinoMeCredito_QNAME, MECreditoConsolidado.class, CrearCreditoFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearCreditoFlujoResult", scope = CrearCreditoFlujoResponse.class)
    public JAXBElement<MSCreditoConsolidado> createCrearCreditoFlujoResponseCrearCreditoFlujoResult(MSCreditoConsolidado value) {
        return new JAXBElement<MSCreditoConsolidado>(_CrearCreditoFlujoResponseCrearCreditoFlujoResult_QNAME, MSCreditoConsolidado.class, CrearCreditoFlujoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAprobarFase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAprobarFase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAprobarFase", scope = AprobarFaseAprobacionSeguro.class)
    public JAXBElement<MEAprobarFase> createAprobarFaseAprobacionSeguroMeAprobarFase(MEAprobarFase value) {
        return new JAXBElement<MEAprobarFase>(_AprobarFaseAprobacionSeguroMeAprobarFase_QNAME, MEAprobarFase.class, AprobarFaseAprobacionSeguro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AprobarFaseAprobacionSeguroResult", scope = AprobarFaseAprobacionSeguroResponse.class)
    public JAXBElement<MensajeSalidaBase> createAprobarFaseAprobacionSeguroResponseAprobarFaseAprobacionSeguroResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_AprobarFaseAprobacionSeguroResponseAprobarFaseAprobacionSeguroResult_QNAME, MensajeSalidaBase.class, AprobarFaseAprobacionSeguroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = ValidarBloqueoAprobacion.class)
    public JAXBElement<MECreditos> createValidarBloqueoAprobacionMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, ValidarBloqueoAprobacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarBloqueoAprobacionResult", scope = ValidarBloqueoAprobacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarBloqueoAprobacionResponseValidarBloqueoAprobacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarBloqueoAprobacionResponseValidarBloqueoAprobacionResult_QNAME, MensajeSalidaBase.class, ValidarBloqueoAprobacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreditos", scope = RecuperarRiesgoAmbiental.class)
    public JAXBElement<MECreditos> createRecuperarRiesgoAmbientalMeCreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_ConsultarDocumentosDigitalizarMeCreditos_QNAME, MECreditos.class, RecuperarRiesgoAmbiental.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecuperarRiesgoAmbientalResult", scope = RecuperarRiesgoAmbientalResponse.class)
    public JAXBElement<MSRiesgoAmbiental> createRecuperarRiesgoAmbientalResponseRecuperarRiesgoAmbientalResult(MSRiesgoAmbiental value) {
        return new JAXBElement<MSRiesgoAmbiental>(_RecuperarRiesgoAmbientalResponseRecuperarRiesgoAmbientalResult_QNAME, MSRiesgoAmbiental.class, RecuperarRiesgoAmbientalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERiesgoAmbiental }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERiesgoAmbiental }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRiesgoAmbiental", scope = GuardarRiesgoAmbiental.class)
    public JAXBElement<MERiesgoAmbiental> createGuardarRiesgoAmbientalMeRiesgoAmbiental(MERiesgoAmbiental value) {
        return new JAXBElement<MERiesgoAmbiental>(_GuardarRiesgoAmbientalMeRiesgoAmbiental_QNAME, MERiesgoAmbiental.class, GuardarRiesgoAmbiental.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarRiesgoAmbientalResult", scope = GuardarRiesgoAmbientalResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarRiesgoAmbientalResponseGuardarRiesgoAmbientalResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarRiesgoAmbientalResponseGuardarRiesgoAmbientalResult_QNAME, MensajeSalidaBase.class, GuardarRiesgoAmbientalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePagoCredito", scope = SimularPagoExtraordinarioCredito.class)
    public JAXBElement<MEPagoExtraordinarioCredito> createSimularPagoExtraordinarioCreditoMePagoCredito(MEPagoExtraordinarioCredito value) {
        return new JAXBElement<MEPagoExtraordinarioCredito>(_SimularPagoExtraordinarioCreditoMePagoCredito_QNAME, MEPagoExtraordinarioCredito.class, SimularPagoExtraordinarioCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimulacionPagoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimulacionPagoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SimularPagoExtraordinarioCreditoResult", scope = SimularPagoExtraordinarioCreditoResponse.class)
    public JAXBElement<MSSimulacionPagoCredito> createSimularPagoExtraordinarioCreditoResponseSimularPagoExtraordinarioCreditoResult(MSSimulacionPagoCredito value) {
        return new JAXBElement<MSSimulacionPagoCredito>(_SimularPagoExtraordinarioCreditoResponseSimularPagoExtraordinarioCreditoResult_QNAME, MSSimulacionPagoCredito.class, SimularPagoExtraordinarioCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePagoCredito", scope = ProcesarPagoExtraordinarioCredito.class)
    public JAXBElement<MEPagoExtraordinarioCredito> createProcesarPagoExtraordinarioCreditoMePagoCredito(MEPagoExtraordinarioCredito value) {
        return new JAXBElement<MEPagoExtraordinarioCredito>(_SimularPagoExtraordinarioCreditoMePagoCredito_QNAME, MEPagoExtraordinarioCredito.class, ProcesarPagoExtraordinarioCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarPagoExtraordinarioCreditoResult", scope = ProcesarPagoExtraordinarioCreditoResponse.class)
    public JAXBElement<MSResultadoPagoCredito> createProcesarPagoExtraordinarioCreditoResponseProcesarPagoExtraordinarioCreditoResult(MSResultadoPagoCredito value) {
        return new JAXBElement<MSResultadoPagoCredito>(_ProcesarPagoExtraordinarioCreditoResponseProcesarPagoExtraordinarioCreditoResult_QNAME, MSResultadoPagoCredito.class, ProcesarPagoExtraordinarioCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentoFirmaElectronica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentoFirmaElectronica }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDocumentoFirmado", scope = RecibirDocumentoFirmado.class)
    public JAXBElement<MEDocumentoFirmaElectronica> createRecibirDocumentoFirmadoMeDocumentoFirmado(MEDocumentoFirmaElectronica value) {
        return new JAXBElement<MEDocumentoFirmaElectronica>(_RecibirDocumentoFirmadoMeDocumentoFirmado_QNAME, MEDocumentoFirmaElectronica.class, RecibirDocumentoFirmado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecibirDocumentoFirmadoResult", scope = RecibirDocumentoFirmadoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRecibirDocumentoFirmadoResponseRecibirDocumentoFirmadoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RecibirDocumentoFirmadoResponseRecibirDocumentoFirmadoResult_QNAME, MensajeSalidaBase.class, RecibirDocumentoFirmadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFirmaElectronicaPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFirmaElectronicaPersona }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meFirmaElectronica", scope = RegistrarFirmaElectronicaDocumento.class)
    public JAXBElement<MEFirmaElectronicaPersona> createRegistrarFirmaElectronicaDocumentoMeFirmaElectronica(MEFirmaElectronicaPersona value) {
        return new JAXBElement<MEFirmaElectronicaPersona>(_RegistrarFirmaElectronicaDocumentoMeFirmaElectronica_QNAME, MEFirmaElectronicaPersona.class, RegistrarFirmaElectronicaDocumento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarFirmaElectronicaDocumentoResult", scope = RegistrarFirmaElectronicaDocumentoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarFirmaElectronicaDocumentoResponseRegistrarFirmaElectronicaDocumentoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarFirmaElectronicaDocumentoResponseRegistrarFirmaElectronicaDocumentoResult_QNAME, MensajeSalidaBase.class, RegistrarFirmaElectronicaDocumentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERespuestaFirmaElectronica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERespuestaFirmaElectronica }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meFirmaElectronica", scope = RecibirRespuestaFirmaElectronica.class)
    public JAXBElement<MERespuestaFirmaElectronica> createRecibirRespuestaFirmaElectronicaMeFirmaElectronica(MERespuestaFirmaElectronica value) {
        return new JAXBElement<MERespuestaFirmaElectronica>(_RegistrarFirmaElectronicaDocumentoMeFirmaElectronica_QNAME, MERespuestaFirmaElectronica.class, RecibirRespuestaFirmaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecibirRespuestaFirmaElectronicaResult", scope = RecibirRespuestaFirmaElectronicaResponse.class)
    public JAXBElement<MensajeSalidaBase> createRecibirRespuestaFirmaElectronicaResponseRecibirRespuestaFirmaElectronicaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RecibirRespuestaFirmaElectronicaResponseRecibirRespuestaFirmaElectronicaResult_QNAME, MensajeSalidaBase.class, RecibirRespuestaFirmaElectronicaResponse.class, value);
    }

}
