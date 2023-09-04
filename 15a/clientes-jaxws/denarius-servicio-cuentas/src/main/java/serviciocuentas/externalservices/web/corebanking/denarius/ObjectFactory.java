
package serviciocuentas.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
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
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSAperturaAhorroProgramado;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSAperturaCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCanjeLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaDatosTarjeta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaMovimientosCorresponsales;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaSaldoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaTarjetaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaTransferenciasSPI;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCertificados;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCtaAhorros;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasDatosAdmTarjetas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasDatosCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasMovimientosCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasSaldosCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasSaldosCuentas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasSaldosTarjetas;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosUsuario;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDepositos;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDocumentoCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSMonederoElectronico;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaCredito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNotaDebitoAtm;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSNumeroCuenta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSPagoTarjeta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSPersonalizacionLibreta;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSSimularAhorro;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionCanales;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionCorresponsales;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionKiosko;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionPagoServicios;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionRecibida;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransaccionTarjetaDebito;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransferenciaMonederoElectronico;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransferenciaPagoDirecto;
import serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSTransferenciaSpi;


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

    private final static QName _ConsultarSaldosCuentasMeConsultar_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultar");
    private final static QName _ConsultarSaldosCuentasResponseConsultarSaldosCuentasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosCuentasResult");
    private final static QName _ConsultarSaldosVariasCuentasResponseConsultarSaldosVariasCuentasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosVariasCuentasResult");
    private final static QName _ConsultarSaldosOrganizacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "organizacion");
    private final static QName _ConsultarSaldosNumeroCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "numeroCuenta");
    private final static QName _ConsultarSaldosResponseConsultarSaldosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosResult");
    private final static QName _GenerarNotaDebitoMeDebito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDebito");
    private final static QName _GenerarNotaDebitoResponseGenerarNotaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarNotaDebitoResult");
    private final static QName _CompensarNotaDebitoResponseCompensarNotaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarNotaDebitoResult");
    private final static QName _GenerarNotaDebitoAtmResponseGenerarNotaDebitoAtmResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarNotaDebitoAtmResult");
    private final static QName _GenerarNotaCreditoMeCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCredito");
    private final static QName _GenerarNotaCreditoResponseGenerarNotaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarNotaCreditoResult");
    private final static QName _CompensarNotaCreditoResponseCompensarNotaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarNotaCreditoResult");
    private final static QName _ConsultarInformacionClienteMeCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCuenta");
    private final static QName _ConsultarInformacionClienteResponseConsultarInformacionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarInformacionClienteResult");
    private final static QName _ActualizarLibretaResponseActualizarLibretaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarLibretaResult");
    private final static QName _ConsultarDatosLibretaPerLibreta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "perLibreta");
    private final static QName _ConsultarDatosLibretaResponseConsultarDatosLibretaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDatosLibretaResult");
    private final static QName _CanjearLibretaResponseCanjearLibretaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CanjearLibretaResult");
    private final static QName _ConsultarCuentaAhorrosMeCliente_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCliente");
    private final static QName _ConsultarCuentaAhorrosResponseConsultarCuentaAhorrosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCuentaAhorrosResult");
    private final static QName _ConsultarDatosAdmTarjetasResponseConsultarDatosAdmTarjetasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDatosAdmTarjetasResult");
    private final static QName _ConsultarMovimientosResponseConsultarMovimientosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarMovimientosResult");
    private final static QName _ConsultarCuentaResponseConsultarCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCuentaResult");
    private final static QName _ConsultarCuentaCondicionesResponseConsultarCuentaCondicionesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCuentaCondicionesResult");
    private final static QName _ConsultarCertificadosAportacionMeConsulta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsulta");
    private final static QName _ConsultarCertificadosAportacionResponseConsultarCertificadosAportacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCertificadosAportacionResult");
    private final static QName _ConsultarSaldoCuentaAtmResponseConsultarSaldoCuentaAtmResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldoCuentaAtmResult");
    private final static QName _RegistrarTransferenciaSpiMeTransferencia_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTransferencia");
    private final static QName _RegistrarTransferenciaSpiResponseRegistrarTransferenciaSpiResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarTransferenciaSpiResult");
    private final static QName _ConsultarBancosSpiMeBancos_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meBancos");
    private final static QName _ConsultarBancosSpiResponseConsultarBancosSpiResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarBancosSpiResult");
    private final static QName _RecuperarDepositosResponseRecuperarDepositosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecuperarDepositosResult");
    private final static QName _ConsultarCuentaProductoResponseConsultarCuentaProductoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCuentaProductoResult");
    private final static QName _AjusteContableMensaje_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mensaje");
    private final static QName _AjusteContableResponseAjusteContableResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AjusteContableResult");
    private final static QName _DevolucionChequeResponseDevolucionChequeResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "DevolucionChequeResult");
    private final static QName _ConsultarUsuarioResponseConsultarUsuarioResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarUsuarioResult");
    private final static QName _RecibirDetalleChequesResponseRecibirDetalleChequesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RecibirDetalleChequesResult");
    private final static QName _RegistrarTransferenciaPropiaResponseRegistrarTransferenciaPropiaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarTransferenciaPropiaResult");
    private final static QName _RegistrarTransferenciaInternaResponseRegistrarTransferenciaInternaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarTransferenciaInternaResult");
    private final static QName _ActualizarPlanServicioMePlanServicio_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mePlanServicio");
    private final static QName _ActualizarPlanServicioResponseActualizarPlanServicioResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarPlanServicioResult");
    private final static QName _AnularPlanServicioResponseAnularPlanServicioResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AnularPlanServicioResult");
    private final static QName _CompensarNotaDebitoAtmResponseCompensarNotaDebitoAtmResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarNotaDebitoAtmResult");
    private final static QName _BloquearCuentasClienteResponseBloquearCuentasClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "BloquearCuentasClienteResult");
    private final static QName _RegistrarTransferenciaPagoDirectoResponseRegistrarTransferenciaPagoDirectoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarTransferenciaPagoDirectoResult");
    private final static QName _CompensarTransferenciaPagoDirectoResponseCompensarTransferenciaPagoDirectoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarTransferenciaPagoDirectoResult");
    private final static QName _RegistrarMonederoElectronicoMeMonedero_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meMonedero");
    private final static QName _RegistrarMonederoElectronicoResponseRegistrarMonederoElectronicoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarMonederoElectronicoResult");
    private final static QName _ConfirmarRegistroMonederoElectronicoResponseConfirmarRegistroMonederoElectronicoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConfirmarRegistroMonederoElectronicoResult");
    private final static QName _AnularRegistroMonederoElectronicoResponseAnularRegistroMonederoElectronicoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AnularRegistroMonederoElectronicoResult");
    private final static QName _RegistrarTransferenciaMonederoElectronicoResponseRegistrarTransferenciaMonederoElectronicoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarTransferenciaMonederoElectronicoResult");
    private final static QName _CompensarTransferenciaMonederoElectronicoResponseCompensarTransferenciaMonederoElectronicoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarTransferenciaMonederoElectronicoResult");
    private final static QName _EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTransaccion");
    private final static QName _EjecutarTransaccionTarjetaDebitoResponseEjecutarTransaccionTarjetaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EjecutarTransaccionTarjetaDebitoResult");
    private final static QName _ReprocesarTransaccionTarjetaDebitoMeCabecera_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCabecera");
    private final static QName _ReprocesarTransaccionTarjetaDebitoResponseReprocesarTransaccionTarjetaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ReprocesarTransaccionTarjetaDebitoResult");
    private final static QName _ConsultarSaldoTarjetaDebitoResponseConsultarSaldoTarjetaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldoTarjetaDebitoResult");
    private final static QName _CompensarTransaccionTarjetaDebitoResponseCompensarTransaccionTarjetaDebitoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarTransaccionTarjetaDebitoResult");
    private final static QName _ConsultarCondicionesCuentasAhorrosPorIdentificacionResponseConsultarCondicionesCuentasAhorrosPorIdentificacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCondicionesCuentasAhorrosPorIdentificacionResult");
    private final static QName _ConsultarCondicionesCuentasAhorrosPorTelefonoMeTelefono_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meTelefono");
    private final static QName _ConsultarCondicionesCuentasAhorrosPorTelefonoResponseConsultarCondicionesCuentasAhorrosPorTelefonoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCondicionesCuentasAhorrosPorTelefonoResult");
    private final static QName _ConsultarCondicionesCuentaAhorrosResponseConsultarCondicionesCuentaAhorrosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCondicionesCuentaAhorrosResult");
    private final static QName _ConsultarUltimosMovimientosResponseConsultarUltimosMovimientosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarUltimosMovimientosResult");
    private final static QName _EjecutarTransaccionCanalesResponseEjecutarTransaccionCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EjecutarTransaccionCanalesResult");
    private final static QName _ConsultarClienteParaCuentaMeConsultasCredito_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultasCredito");
    private final static QName _ConsultarClienteParaCuentaResponseConsultarClienteParaCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClienteParaCuentaResult");
    private final static QName _CrearCuentaCanalesMeCrearCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCrearCuenta");
    private final static QName _CrearCuentaCanalesResponseCrearCuentaCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearCuentaCanalesResult");
    private final static QName _SimularAhorroProgramadoMeSimular_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meSimular");
    private final static QName _SimularAhorroProgramadoResponseSimularAhorroProgramadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SimularAhorroProgramadoResult");
    private final static QName _AperturaAhorroProgramadoMeAperturaAhorro_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meAperturaAhorro");
    private final static QName _AperturaAhorroProgramadoResponseAperturaAhorroProgramadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AperturaAhorroProgramadoResult");
    private final static QName _RenovarAhorroProgramadoMeDatosRenovacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDatosRenovacion");
    private final static QName _RenovarAhorroProgramadoResponseRenovarAhorroProgramadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RenovarAhorroProgramadoResult");
    private final static QName _ActualizarAhorroProgramadoResponseActualizarAhorroProgramadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarAhorroProgramadoResult");
    private final static QName _ConsultarCrearCuentaClienteMeDatosCliente_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDatosCliente");
    private final static QName _ConsultarCrearCuentaClienteResponseConsultarCrearCuentaClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarCrearCuentaClienteResult");
    private final static QName _RegistrarPagoSpiMePago_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mePago");
    private final static QName _RegistrarPagoSpiResponseRegistrarPagoSpiResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarPagoSpiResult");
    private final static QName _EjecutarTransaccionCanalesXmlXmlstring_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "xmlstring");
    private final static QName _EjecutarTransaccionCanalesXmlResponseEjecutarTransaccionCanalesXmlResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EjecutarTransaccionCanalesXmlResult");
    private final static QName _ConsultarOCrearCuentasMeAperturaCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meAperturaCuenta");
    private final static QName _ConsultarOCrearCuentasResponseConsultarOCrearCuentasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarOCrearCuentasResult");
    private final static QName _GenerarContratosAhorroRentabilidadRenovadosMeLiquidacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meLiquidacion");
    private final static QName _GenerarContratosAhorroRentabilidadRenovadosResponseGenerarContratosAhorroRentabilidadRenovadosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarContratosAhorroRentabilidadRenovadosResult");
    private final static QName _EjecutarTransaccionPagoServiciosResponseEjecutarTransaccionPagoServiciosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EjecutarTransaccionPagoServiciosResult");
    private final static QName _GenerarArchivoPagoServiciosResponseGenerarArchivoPagoServiciosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarArchivoPagoServiciosResult");
    private final static QName _ConsultarSaldosTarjetasCreditoClienteResponseConsultarSaldosTarjetasCreditoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarSaldosTarjetasCreditoClienteResult");
    private final static QName _ProcesarPagoTarjetaCreditoResponseProcesarPagoTarjetaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarPagoTarjetaCreditoResult");
    private final static QName _ConsultarDatosTarjetaCreditoResponseConsultarDatosTarjetaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDatosTarjetaCreditoResult");
    private final static QName _ProcesarPagoTarjetaCreditoTerceroResponseProcesarPagoTarjetaCreditoTerceroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarPagoTarjetaCreditoTerceroResult");
    private final static QName _ProcesarPagosCobranzasTarjetasMeCobranzas_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCobranzas");
    private final static QName _ProcesarPagosCobranzasTarjetasResponseProcesarPagosCobranzasTarjetasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarPagosCobranzasTarjetasResult");
    private final static QName _EjecutarTransaccionCorresponsalesResponseEjecutarTransaccionCorresponsalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EjecutarTransaccionCorresponsalesResult");
    private final static QName _ConsultarMovimientosCorresponsalesResponseConsultarMovimientosCorresponsalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarMovimientosCorresponsalesResult");
    private final static QName _ValidarCuentaTransaccionCorresponsalesResponseValidarCuentaTransaccionCorresponsalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarCuentaTransaccionCorresponsalesResult");
    private final static QName _CompensarTransaccionCorresponsalesResponseCompensarTransaccionCorresponsalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CompensarTransaccionCorresponsalesResult");
    private final static QName _GenerarArchivoCorresponsalesTrxPropiasResponseGenerarArchivoCorresponsalesTrxPropiasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarArchivoCorresponsalesTrxPropiasResult");
    private final static QName _GenerarArchivoCorresponsalesTrxTercerosResponseGenerarArchivoCorresponsalesTrxTercerosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarArchivoCorresponsalesTrxTercerosResult");
    private final static QName _GuardarDocumentoCanalesEntrada_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "entrada");
    private final static QName _GuardarDocumentoCanalesResponseGuardarDocumentoCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarDocumentoCanalesResult");
    private final static QName _ValidarAprobarCuentaCanalesMeValidacionCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meValidacionCuenta");
    private final static QName _ValidarAprobarCuentaCanalesResponseValidarAprobarCuentaCanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarAprobarCuentaCanalesResult");
    private final static QName _EnviarDocumentosCuentaResponseEnviarDocumentosCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EnviarDocumentosCuentaResult");
    private final static QName _RegistrarControlImpuestoTarjetaCreditoResponseRegistrarControlImpuestoTarjetaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarControlImpuestoTarjetaCreditoResult");
    private final static QName _AperturarCuentaAhorrosResponseAperturarCuentaAhorrosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "AperturarCuentaAhorrosResult");
    private final static QName _RegistrarRestriccionClienteResponseRegistrarRestriccionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarRestriccionClienteResult");
    private final static QName _ConsultarRestriccionClienteResponseConsultarRestriccionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarRestriccionClienteResult");
    private final static QName _ValidarCuentaNotaCreditoResponseValidarCuentaNotaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarCuentaNotaCreditoResult");
    private final static QName _ConsultarDetalleTransaccionRecibidaResponseConsultarDetalleTransaccionRecibidaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDetalleTransaccionRecibidaResult");
    private final static QName _ProcesarDepositoResponseProcesarDepositoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarDepositoResult");
    private final static QName _ProcesarRetiroResponseProcesarRetiroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ProcesarRetiroResult");
    private final static QName _ReimprimirContratoClienteResponseReimprimirContratoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ReimprimirContratoClienteResult");
    private final static QName _ConsultarTransferenciasSPICanalesMeConsultaTransferencias_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaTransferencias");
    private final static QName _ConsultarTransferenciasSPICanalesResponseConsultarTransferenciasSPICanalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarTransferenciasSPICanalesResult");
    private final static QName _GenerarEstadosCuentaMeEstadosCuenta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meEstadosCuenta");
    private final static QName _GenerarEstadosCuentaResponseGenerarEstadosCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarEstadosCuentaResult");
    private final static QName _DevolverCuentaParaCreditoResponseDevolverCuentaParaCreditoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "DevolverCuentaParaCreditoResult");
    private final static QName _CargarDocumentosCuentaResponseCargarDocumentosCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CargarDocumentosCuentaResult");
    private final static QName _ReimprimirContratoCuentaResponseReimprimirContratoCuentaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ReimprimirContratoCuentaResult");
    private final static QName _HabilitarEstadoDeCuentaDigitalResponseHabilitarEstadoDeCuentaDigitalResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "HabilitarEstadoDeCuentaDigitalResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: externalservices.web.corebanking.denarius
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanalesXml }
     * 
     */
    public EjecutarTransaccionCanalesXml createEjecutarTransaccionCanalesXml() {
        return new EjecutarTransaccionCanalesXml();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanalesXmlResponse }
     * 
     */
    public EjecutarTransaccionCanalesXmlResponse createEjecutarTransaccionCanalesXmlResponse() {
        return new EjecutarTransaccionCanalesXmlResponse();
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
     * Create an instance of {@link ConsultarSaldosVariasCuentas }
     * 
     */
    public ConsultarSaldosVariasCuentas createConsultarSaldosVariasCuentas() {
        return new ConsultarSaldosVariasCuentas();
    }

    /**
     * Create an instance of {@link ConsultarSaldosVariasCuentasResponse }
     * 
     */
    public ConsultarSaldosVariasCuentasResponse createConsultarSaldosVariasCuentasResponse() {
        return new ConsultarSaldosVariasCuentasResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldos }
     * 
     */
    public ConsultarSaldos createConsultarSaldos() {
        return new ConsultarSaldos();
    }

    /**
     * Create an instance of {@link ConsultarSaldosResponse }
     * 
     */
    public ConsultarSaldosResponse createConsultarSaldosResponse() {
        return new ConsultarSaldosResponse();
    }

    /**
     * Create an instance of {@link GenerarNotaDebito }
     * 
     */
    public GenerarNotaDebito createGenerarNotaDebito() {
        return new GenerarNotaDebito();
    }

    /**
     * Create an instance of {@link GenerarNotaDebitoResponse }
     * 
     */
    public GenerarNotaDebitoResponse createGenerarNotaDebitoResponse() {
        return new GenerarNotaDebitoResponse();
    }

    /**
     * Create an instance of {@link CompensarNotaDebito }
     * 
     */
    public CompensarNotaDebito createCompensarNotaDebito() {
        return new CompensarNotaDebito();
    }

    /**
     * Create an instance of {@link CompensarNotaDebitoResponse }
     * 
     */
    public CompensarNotaDebitoResponse createCompensarNotaDebitoResponse() {
        return new CompensarNotaDebitoResponse();
    }

    /**
     * Create an instance of {@link GenerarNotaDebitoAtm }
     * 
     */
    public GenerarNotaDebitoAtm createGenerarNotaDebitoAtm() {
        return new GenerarNotaDebitoAtm();
    }

    /**
     * Create an instance of {@link GenerarNotaDebitoAtmResponse }
     * 
     */
    public GenerarNotaDebitoAtmResponse createGenerarNotaDebitoAtmResponse() {
        return new GenerarNotaDebitoAtmResponse();
    }

    /**
     * Create an instance of {@link GenerarNotaCredito }
     * 
     */
    public GenerarNotaCredito createGenerarNotaCredito() {
        return new GenerarNotaCredito();
    }

    /**
     * Create an instance of {@link GenerarNotaCreditoResponse }
     * 
     */
    public GenerarNotaCreditoResponse createGenerarNotaCreditoResponse() {
        return new GenerarNotaCreditoResponse();
    }

    /**
     * Create an instance of {@link CompensarNotaCredito }
     * 
     */
    public CompensarNotaCredito createCompensarNotaCredito() {
        return new CompensarNotaCredito();
    }

    /**
     * Create an instance of {@link CompensarNotaCreditoResponse }
     * 
     */
    public CompensarNotaCreditoResponse createCompensarNotaCreditoResponse() {
        return new CompensarNotaCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarInformacionCliente }
     * 
     */
    public ConsultarInformacionCliente createConsultarInformacionCliente() {
        return new ConsultarInformacionCliente();
    }

    /**
     * Create an instance of {@link ConsultarInformacionClienteResponse }
     * 
     */
    public ConsultarInformacionClienteResponse createConsultarInformacionClienteResponse() {
        return new ConsultarInformacionClienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarLibreta }
     * 
     */
    public ActualizarLibreta createActualizarLibreta() {
        return new ActualizarLibreta();
    }

    /**
     * Create an instance of {@link ActualizarLibretaResponse }
     * 
     */
    public ActualizarLibretaResponse createActualizarLibretaResponse() {
        return new ActualizarLibretaResponse();
    }

    /**
     * Create an instance of {@link ConsultarDatosLibreta }
     * 
     */
    public ConsultarDatosLibreta createConsultarDatosLibreta() {
        return new ConsultarDatosLibreta();
    }

    /**
     * Create an instance of {@link ConsultarDatosLibretaResponse }
     * 
     */
    public ConsultarDatosLibretaResponse createConsultarDatosLibretaResponse() {
        return new ConsultarDatosLibretaResponse();
    }

    /**
     * Create an instance of {@link CanjearLibreta }
     * 
     */
    public CanjearLibreta createCanjearLibreta() {
        return new CanjearLibreta();
    }

    /**
     * Create an instance of {@link CanjearLibretaResponse }
     * 
     */
    public CanjearLibretaResponse createCanjearLibretaResponse() {
        return new CanjearLibretaResponse();
    }

    /**
     * Create an instance of {@link ConsultarCuentaAhorros }
     * 
     */
    public ConsultarCuentaAhorros createConsultarCuentaAhorros() {
        return new ConsultarCuentaAhorros();
    }

    /**
     * Create an instance of {@link ConsultarCuentaAhorrosResponse }
     * 
     */
    public ConsultarCuentaAhorrosResponse createConsultarCuentaAhorrosResponse() {
        return new ConsultarCuentaAhorrosResponse();
    }

    /**
     * Create an instance of {@link ConsultarDatosAdmTarjetas }
     * 
     */
    public ConsultarDatosAdmTarjetas createConsultarDatosAdmTarjetas() {
        return new ConsultarDatosAdmTarjetas();
    }

    /**
     * Create an instance of {@link ConsultarDatosAdmTarjetasResponse }
     * 
     */
    public ConsultarDatosAdmTarjetasResponse createConsultarDatosAdmTarjetasResponse() {
        return new ConsultarDatosAdmTarjetasResponse();
    }

    /**
     * Create an instance of {@link ConsultarMovimientos }
     * 
     */
    public ConsultarMovimientos createConsultarMovimientos() {
        return new ConsultarMovimientos();
    }

    /**
     * Create an instance of {@link ConsultarMovimientosResponse }
     * 
     */
    public ConsultarMovimientosResponse createConsultarMovimientosResponse() {
        return new ConsultarMovimientosResponse();
    }

    /**
     * Create an instance of {@link ConsultarCuenta }
     * 
     */
    public ConsultarCuenta createConsultarCuenta() {
        return new ConsultarCuenta();
    }

    /**
     * Create an instance of {@link ConsultarCuentaResponse }
     * 
     */
    public ConsultarCuentaResponse createConsultarCuentaResponse() {
        return new ConsultarCuentaResponse();
    }

    /**
     * Create an instance of {@link ConsultarCuentaCondiciones }
     * 
     */
    public ConsultarCuentaCondiciones createConsultarCuentaCondiciones() {
        return new ConsultarCuentaCondiciones();
    }

    /**
     * Create an instance of {@link ConsultarCuentaCondicionesResponse }
     * 
     */
    public ConsultarCuentaCondicionesResponse createConsultarCuentaCondicionesResponse() {
        return new ConsultarCuentaCondicionesResponse();
    }

    /**
     * Create an instance of {@link ConsultarCertificadosAportacion }
     * 
     */
    public ConsultarCertificadosAportacion createConsultarCertificadosAportacion() {
        return new ConsultarCertificadosAportacion();
    }

    /**
     * Create an instance of {@link ConsultarCertificadosAportacionResponse }
     * 
     */
    public ConsultarCertificadosAportacionResponse createConsultarCertificadosAportacionResponse() {
        return new ConsultarCertificadosAportacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldoCuentaAtm }
     * 
     */
    public ConsultarSaldoCuentaAtm createConsultarSaldoCuentaAtm() {
        return new ConsultarSaldoCuentaAtm();
    }

    /**
     * Create an instance of {@link ConsultarSaldoCuentaAtmResponse }
     * 
     */
    public ConsultarSaldoCuentaAtmResponse createConsultarSaldoCuentaAtmResponse() {
        return new ConsultarSaldoCuentaAtmResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaSpi }
     * 
     */
    public RegistrarTransferenciaSpi createRegistrarTransferenciaSpi() {
        return new RegistrarTransferenciaSpi();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaSpiResponse }
     * 
     */
    public RegistrarTransferenciaSpiResponse createRegistrarTransferenciaSpiResponse() {
        return new RegistrarTransferenciaSpiResponse();
    }

    /**
     * Create an instance of {@link ConsultarBancosSpi }
     * 
     */
    public ConsultarBancosSpi createConsultarBancosSpi() {
        return new ConsultarBancosSpi();
    }

    /**
     * Create an instance of {@link ConsultarBancosSpiResponse }
     * 
     */
    public ConsultarBancosSpiResponse createConsultarBancosSpiResponse() {
        return new ConsultarBancosSpiResponse();
    }

    /**
     * Create an instance of {@link RecuperarDepositos }
     * 
     */
    public RecuperarDepositos createRecuperarDepositos() {
        return new RecuperarDepositos();
    }

    /**
     * Create an instance of {@link RecuperarDepositosResponse }
     * 
     */
    public RecuperarDepositosResponse createRecuperarDepositosResponse() {
        return new RecuperarDepositosResponse();
    }

    /**
     * Create an instance of {@link ConsultarCuentaProducto }
     * 
     */
    public ConsultarCuentaProducto createConsultarCuentaProducto() {
        return new ConsultarCuentaProducto();
    }

    /**
     * Create an instance of {@link ConsultarCuentaProductoResponse }
     * 
     */
    public ConsultarCuentaProductoResponse createConsultarCuentaProductoResponse() {
        return new ConsultarCuentaProductoResponse();
    }

    /**
     * Create an instance of {@link AjusteContable }
     * 
     */
    public AjusteContable createAjusteContable() {
        return new AjusteContable();
    }

    /**
     * Create an instance of {@link AjusteContableResponse }
     * 
     */
    public AjusteContableResponse createAjusteContableResponse() {
        return new AjusteContableResponse();
    }

    /**
     * Create an instance of {@link DevolucionCheque }
     * 
     */
    public DevolucionCheque createDevolucionCheque() {
        return new DevolucionCheque();
    }

    /**
     * Create an instance of {@link DevolucionChequeResponse }
     * 
     */
    public DevolucionChequeResponse createDevolucionChequeResponse() {
        return new DevolucionChequeResponse();
    }

    /**
     * Create an instance of {@link ConsultarUsuario }
     * 
     */
    public ConsultarUsuario createConsultarUsuario() {
        return new ConsultarUsuario();
    }

    /**
     * Create an instance of {@link ConsultarUsuarioResponse }
     * 
     */
    public ConsultarUsuarioResponse createConsultarUsuarioResponse() {
        return new ConsultarUsuarioResponse();
    }

    /**
     * Create an instance of {@link RecibirDetalleCheques }
     * 
     */
    public RecibirDetalleCheques createRecibirDetalleCheques() {
        return new RecibirDetalleCheques();
    }

    /**
     * Create an instance of {@link RecibirDetalleChequesResponse }
     * 
     */
    public RecibirDetalleChequesResponse createRecibirDetalleChequesResponse() {
        return new RecibirDetalleChequesResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaPropia }
     * 
     */
    public RegistrarTransferenciaPropia createRegistrarTransferenciaPropia() {
        return new RegistrarTransferenciaPropia();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaPropiaResponse }
     * 
     */
    public RegistrarTransferenciaPropiaResponse createRegistrarTransferenciaPropiaResponse() {
        return new RegistrarTransferenciaPropiaResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaInterna }
     * 
     */
    public RegistrarTransferenciaInterna createRegistrarTransferenciaInterna() {
        return new RegistrarTransferenciaInterna();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaInternaResponse }
     * 
     */
    public RegistrarTransferenciaInternaResponse createRegistrarTransferenciaInternaResponse() {
        return new RegistrarTransferenciaInternaResponse();
    }

    /**
     * Create an instance of {@link ActualizarPlanServicio }
     * 
     */
    public ActualizarPlanServicio createActualizarPlanServicio() {
        return new ActualizarPlanServicio();
    }

    /**
     * Create an instance of {@link ActualizarPlanServicioResponse }
     * 
     */
    public ActualizarPlanServicioResponse createActualizarPlanServicioResponse() {
        return new ActualizarPlanServicioResponse();
    }

    /**
     * Create an instance of {@link AnularPlanServicio }
     * 
     */
    public AnularPlanServicio createAnularPlanServicio() {
        return new AnularPlanServicio();
    }

    /**
     * Create an instance of {@link AnularPlanServicioResponse }
     * 
     */
    public AnularPlanServicioResponse createAnularPlanServicioResponse() {
        return new AnularPlanServicioResponse();
    }

    /**
     * Create an instance of {@link CompensarNotaDebitoAtm }
     * 
     */
    public CompensarNotaDebitoAtm createCompensarNotaDebitoAtm() {
        return new CompensarNotaDebitoAtm();
    }

    /**
     * Create an instance of {@link CompensarNotaDebitoAtmResponse }
     * 
     */
    public CompensarNotaDebitoAtmResponse createCompensarNotaDebitoAtmResponse() {
        return new CompensarNotaDebitoAtmResponse();
    }

    /**
     * Create an instance of {@link BloquearCuentasCliente }
     * 
     */
    public BloquearCuentasCliente createBloquearCuentasCliente() {
        return new BloquearCuentasCliente();
    }

    /**
     * Create an instance of {@link BloquearCuentasClienteResponse }
     * 
     */
    public BloquearCuentasClienteResponse createBloquearCuentasClienteResponse() {
        return new BloquearCuentasClienteResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaPagoDirecto }
     * 
     */
    public RegistrarTransferenciaPagoDirecto createRegistrarTransferenciaPagoDirecto() {
        return new RegistrarTransferenciaPagoDirecto();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaPagoDirectoResponse }
     * 
     */
    public RegistrarTransferenciaPagoDirectoResponse createRegistrarTransferenciaPagoDirectoResponse() {
        return new RegistrarTransferenciaPagoDirectoResponse();
    }

    /**
     * Create an instance of {@link CompensarTransferenciaPagoDirecto }
     * 
     */
    public CompensarTransferenciaPagoDirecto createCompensarTransferenciaPagoDirecto() {
        return new CompensarTransferenciaPagoDirecto();
    }

    /**
     * Create an instance of {@link CompensarTransferenciaPagoDirectoResponse }
     * 
     */
    public CompensarTransferenciaPagoDirectoResponse createCompensarTransferenciaPagoDirectoResponse() {
        return new CompensarTransferenciaPagoDirectoResponse();
    }

    /**
     * Create an instance of {@link RegistrarMonederoElectronico }
     * 
     */
    public RegistrarMonederoElectronico createRegistrarMonederoElectronico() {
        return new RegistrarMonederoElectronico();
    }

    /**
     * Create an instance of {@link RegistrarMonederoElectronicoResponse }
     * 
     */
    public RegistrarMonederoElectronicoResponse createRegistrarMonederoElectronicoResponse() {
        return new RegistrarMonederoElectronicoResponse();
    }

    /**
     * Create an instance of {@link ConfirmarRegistroMonederoElectronico }
     * 
     */
    public ConfirmarRegistroMonederoElectronico createConfirmarRegistroMonederoElectronico() {
        return new ConfirmarRegistroMonederoElectronico();
    }

    /**
     * Create an instance of {@link ConfirmarRegistroMonederoElectronicoResponse }
     * 
     */
    public ConfirmarRegistroMonederoElectronicoResponse createConfirmarRegistroMonederoElectronicoResponse() {
        return new ConfirmarRegistroMonederoElectronicoResponse();
    }

    /**
     * Create an instance of {@link AnularRegistroMonederoElectronico }
     * 
     */
    public AnularRegistroMonederoElectronico createAnularRegistroMonederoElectronico() {
        return new AnularRegistroMonederoElectronico();
    }

    /**
     * Create an instance of {@link AnularRegistroMonederoElectronicoResponse }
     * 
     */
    public AnularRegistroMonederoElectronicoResponse createAnularRegistroMonederoElectronicoResponse() {
        return new AnularRegistroMonederoElectronicoResponse();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaMonederoElectronico }
     * 
     */
    public RegistrarTransferenciaMonederoElectronico createRegistrarTransferenciaMonederoElectronico() {
        return new RegistrarTransferenciaMonederoElectronico();
    }

    /**
     * Create an instance of {@link RegistrarTransferenciaMonederoElectronicoResponse }
     * 
     */
    public RegistrarTransferenciaMonederoElectronicoResponse createRegistrarTransferenciaMonederoElectronicoResponse() {
        return new RegistrarTransferenciaMonederoElectronicoResponse();
    }

    /**
     * Create an instance of {@link CompensarTransferenciaMonederoElectronico }
     * 
     */
    public CompensarTransferenciaMonederoElectronico createCompensarTransferenciaMonederoElectronico() {
        return new CompensarTransferenciaMonederoElectronico();
    }

    /**
     * Create an instance of {@link CompensarTransferenciaMonederoElectronicoResponse }
     * 
     */
    public CompensarTransferenciaMonederoElectronicoResponse createCompensarTransferenciaMonederoElectronicoResponse() {
        return new CompensarTransferenciaMonederoElectronicoResponse();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionTarjetaDebito }
     * 
     */
    public EjecutarTransaccionTarjetaDebito createEjecutarTransaccionTarjetaDebito() {
        return new EjecutarTransaccionTarjetaDebito();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionTarjetaDebitoResponse }
     * 
     */
    public EjecutarTransaccionTarjetaDebitoResponse createEjecutarTransaccionTarjetaDebitoResponse() {
        return new EjecutarTransaccionTarjetaDebitoResponse();
    }

    /**
     * Create an instance of {@link ReprocesarTransaccionTarjetaDebito }
     * 
     */
    public ReprocesarTransaccionTarjetaDebito createReprocesarTransaccionTarjetaDebito() {
        return new ReprocesarTransaccionTarjetaDebito();
    }

    /**
     * Create an instance of {@link ReprocesarTransaccionTarjetaDebitoResponse }
     * 
     */
    public ReprocesarTransaccionTarjetaDebitoResponse createReprocesarTransaccionTarjetaDebitoResponse() {
        return new ReprocesarTransaccionTarjetaDebitoResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldoTarjetaDebito }
     * 
     */
    public ConsultarSaldoTarjetaDebito createConsultarSaldoTarjetaDebito() {
        return new ConsultarSaldoTarjetaDebito();
    }

    /**
     * Create an instance of {@link ConsultarSaldoTarjetaDebitoResponse }
     * 
     */
    public ConsultarSaldoTarjetaDebitoResponse createConsultarSaldoTarjetaDebitoResponse() {
        return new ConsultarSaldoTarjetaDebitoResponse();
    }

    /**
     * Create an instance of {@link CompensarTransaccionTarjetaDebito }
     * 
     */
    public CompensarTransaccionTarjetaDebito createCompensarTransaccionTarjetaDebito() {
        return new CompensarTransaccionTarjetaDebito();
    }

    /**
     * Create an instance of {@link CompensarTransaccionTarjetaDebitoResponse }
     * 
     */
    public CompensarTransaccionTarjetaDebitoResponse createCompensarTransaccionTarjetaDebitoResponse() {
        return new CompensarTransaccionTarjetaDebitoResponse();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentasAhorrosPorIdentificacion }
     * 
     */
    public ConsultarCondicionesCuentasAhorrosPorIdentificacion createConsultarCondicionesCuentasAhorrosPorIdentificacion() {
        return new ConsultarCondicionesCuentasAhorrosPorIdentificacion();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentasAhorrosPorIdentificacionResponse }
     * 
     */
    public ConsultarCondicionesCuentasAhorrosPorIdentificacionResponse createConsultarCondicionesCuentasAhorrosPorIdentificacionResponse() {
        return new ConsultarCondicionesCuentasAhorrosPorIdentificacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentasAhorrosPorTelefono }
     * 
     */
    public ConsultarCondicionesCuentasAhorrosPorTelefono createConsultarCondicionesCuentasAhorrosPorTelefono() {
        return new ConsultarCondicionesCuentasAhorrosPorTelefono();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentasAhorrosPorTelefonoResponse }
     * 
     */
    public ConsultarCondicionesCuentasAhorrosPorTelefonoResponse createConsultarCondicionesCuentasAhorrosPorTelefonoResponse() {
        return new ConsultarCondicionesCuentasAhorrosPorTelefonoResponse();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentaAhorros }
     * 
     */
    public ConsultarCondicionesCuentaAhorros createConsultarCondicionesCuentaAhorros() {
        return new ConsultarCondicionesCuentaAhorros();
    }

    /**
     * Create an instance of {@link ConsultarCondicionesCuentaAhorrosResponse }
     * 
     */
    public ConsultarCondicionesCuentaAhorrosResponse createConsultarCondicionesCuentaAhorrosResponse() {
        return new ConsultarCondicionesCuentaAhorrosResponse();
    }

    /**
     * Create an instance of {@link ConsultarUltimosMovimientos }
     * 
     */
    public ConsultarUltimosMovimientos createConsultarUltimosMovimientos() {
        return new ConsultarUltimosMovimientos();
    }

    /**
     * Create an instance of {@link ConsultarUltimosMovimientosResponse }
     * 
     */
    public ConsultarUltimosMovimientosResponse createConsultarUltimosMovimientosResponse() {
        return new ConsultarUltimosMovimientosResponse();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanales }
     * 
     */
    public EjecutarTransaccionCanales createEjecutarTransaccionCanales() {
        return new EjecutarTransaccionCanales();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanalesResponse }
     * 
     */
    public EjecutarTransaccionCanalesResponse createEjecutarTransaccionCanalesResponse() {
        return new EjecutarTransaccionCanalesResponse();
    }

    /**
     * Create an instance of {@link ConsultarClienteParaCuenta }
     * 
     */
    public ConsultarClienteParaCuenta createConsultarClienteParaCuenta() {
        return new ConsultarClienteParaCuenta();
    }

    /**
     * Create an instance of {@link ConsultarClienteParaCuentaResponse }
     * 
     */
    public ConsultarClienteParaCuentaResponse createConsultarClienteParaCuentaResponse() {
        return new ConsultarClienteParaCuentaResponse();
    }

    /**
     * Create an instance of {@link CrearCuentaCanales }
     * 
     */
    public CrearCuentaCanales createCrearCuentaCanales() {
        return new CrearCuentaCanales();
    }

    /**
     * Create an instance of {@link CrearCuentaCanalesResponse }
     * 
     */
    public CrearCuentaCanalesResponse createCrearCuentaCanalesResponse() {
        return new CrearCuentaCanalesResponse();
    }

    /**
     * Create an instance of {@link SimularAhorroProgramado }
     * 
     */
    public SimularAhorroProgramado createSimularAhorroProgramado() {
        return new SimularAhorroProgramado();
    }

    /**
     * Create an instance of {@link SimularAhorroProgramadoResponse }
     * 
     */
    public SimularAhorroProgramadoResponse createSimularAhorroProgramadoResponse() {
        return new SimularAhorroProgramadoResponse();
    }

    /**
     * Create an instance of {@link AperturaAhorroProgramado }
     * 
     */
    public AperturaAhorroProgramado createAperturaAhorroProgramado() {
        return new AperturaAhorroProgramado();
    }

    /**
     * Create an instance of {@link AperturaAhorroProgramadoResponse }
     * 
     */
    public AperturaAhorroProgramadoResponse createAperturaAhorroProgramadoResponse() {
        return new AperturaAhorroProgramadoResponse();
    }

    /**
     * Create an instance of {@link RenovarAhorroProgramado }
     * 
     */
    public RenovarAhorroProgramado createRenovarAhorroProgramado() {
        return new RenovarAhorroProgramado();
    }

    /**
     * Create an instance of {@link RenovarAhorroProgramadoResponse }
     * 
     */
    public RenovarAhorroProgramadoResponse createRenovarAhorroProgramadoResponse() {
        return new RenovarAhorroProgramadoResponse();
    }

    /**
     * Create an instance of {@link ActualizarAhorroProgramado }
     * 
     */
    public ActualizarAhorroProgramado createActualizarAhorroProgramado() {
        return new ActualizarAhorroProgramado();
    }

    /**
     * Create an instance of {@link ActualizarAhorroProgramadoResponse }
     * 
     */
    public ActualizarAhorroProgramadoResponse createActualizarAhorroProgramadoResponse() {
        return new ActualizarAhorroProgramadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarCrearCuentaCliente }
     * 
     */
    public ConsultarCrearCuentaCliente createConsultarCrearCuentaCliente() {
        return new ConsultarCrearCuentaCliente();
    }

    /**
     * Create an instance of {@link ConsultarCrearCuentaClienteResponse }
     * 
     */
    public ConsultarCrearCuentaClienteResponse createConsultarCrearCuentaClienteResponse() {
        return new ConsultarCrearCuentaClienteResponse();
    }

    /**
     * Create an instance of {@link RegistrarPagoSpi }
     * 
     */
    public RegistrarPagoSpi createRegistrarPagoSpi() {
        return new RegistrarPagoSpi();
    }

    /**
     * Create an instance of {@link RegistrarPagoSpiResponse }
     * 
     */
    public RegistrarPagoSpiResponse createRegistrarPagoSpiResponse() {
        return new RegistrarPagoSpiResponse();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanalesXml.Xmlstring }
     * 
     */
    public EjecutarTransaccionCanalesXml.Xmlstring createEjecutarTransaccionCanalesXmlXmlstring() {
        return new EjecutarTransaccionCanalesXml.Xmlstring();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult }
     * 
     */
    public EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult createEjecutarTransaccionCanalesXmlResponseEjecutarTransaccionCanalesXmlResult() {
        return new EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult();
    }

    /**
     * Create an instance of {@link ConsultarOCrearCuentas }
     * 
     */
    public ConsultarOCrearCuentas createConsultarOCrearCuentas() {
        return new ConsultarOCrearCuentas();
    }

    /**
     * Create an instance of {@link ConsultarOCrearCuentasResponse }
     * 
     */
    public ConsultarOCrearCuentasResponse createConsultarOCrearCuentasResponse() {
        return new ConsultarOCrearCuentasResponse();
    }

    /**
     * Create an instance of {@link GenerarContratosAhorroRentabilidadRenovados }
     * 
     */
    public GenerarContratosAhorroRentabilidadRenovados createGenerarContratosAhorroRentabilidadRenovados() {
        return new GenerarContratosAhorroRentabilidadRenovados();
    }

    /**
     * Create an instance of {@link GenerarContratosAhorroRentabilidadRenovadosResponse }
     * 
     */
    public GenerarContratosAhorroRentabilidadRenovadosResponse createGenerarContratosAhorroRentabilidadRenovadosResponse() {
        return new GenerarContratosAhorroRentabilidadRenovadosResponse();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionPagoServicios }
     * 
     */
    public EjecutarTransaccionPagoServicios createEjecutarTransaccionPagoServicios() {
        return new EjecutarTransaccionPagoServicios();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionPagoServiciosResponse }
     * 
     */
    public EjecutarTransaccionPagoServiciosResponse createEjecutarTransaccionPagoServiciosResponse() {
        return new EjecutarTransaccionPagoServiciosResponse();
    }

    /**
     * Create an instance of {@link GenerarArchivoPagoServicios }
     * 
     */
    public GenerarArchivoPagoServicios createGenerarArchivoPagoServicios() {
        return new GenerarArchivoPagoServicios();
    }

    /**
     * Create an instance of {@link GenerarArchivoPagoServiciosResponse }
     * 
     */
    public GenerarArchivoPagoServiciosResponse createGenerarArchivoPagoServiciosResponse() {
        return new GenerarArchivoPagoServiciosResponse();
    }

    /**
     * Create an instance of {@link ConsultarSaldosTarjetasCreditoCliente }
     * 
     */
    public ConsultarSaldosTarjetasCreditoCliente createConsultarSaldosTarjetasCreditoCliente() {
        return new ConsultarSaldosTarjetasCreditoCliente();
    }

    /**
     * Create an instance of {@link ConsultarSaldosTarjetasCreditoClienteResponse }
     * 
     */
    public ConsultarSaldosTarjetasCreditoClienteResponse createConsultarSaldosTarjetasCreditoClienteResponse() {
        return new ConsultarSaldosTarjetasCreditoClienteResponse();
    }

    /**
     * Create an instance of {@link ProcesarPagoTarjetaCredito }
     * 
     */
    public ProcesarPagoTarjetaCredito createProcesarPagoTarjetaCredito() {
        return new ProcesarPagoTarjetaCredito();
    }

    /**
     * Create an instance of {@link ProcesarPagoTarjetaCreditoResponse }
     * 
     */
    public ProcesarPagoTarjetaCreditoResponse createProcesarPagoTarjetaCreditoResponse() {
        return new ProcesarPagoTarjetaCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarDatosTarjetaCredito }
     * 
     */
    public ConsultarDatosTarjetaCredito createConsultarDatosTarjetaCredito() {
        return new ConsultarDatosTarjetaCredito();
    }

    /**
     * Create an instance of {@link ConsultarDatosTarjetaCreditoResponse }
     * 
     */
    public ConsultarDatosTarjetaCreditoResponse createConsultarDatosTarjetaCreditoResponse() {
        return new ConsultarDatosTarjetaCreditoResponse();
    }

    /**
     * Create an instance of {@link ProcesarPagoTarjetaCreditoTercero }
     * 
     */
    public ProcesarPagoTarjetaCreditoTercero createProcesarPagoTarjetaCreditoTercero() {
        return new ProcesarPagoTarjetaCreditoTercero();
    }

    /**
     * Create an instance of {@link ProcesarPagoTarjetaCreditoTerceroResponse }
     * 
     */
    public ProcesarPagoTarjetaCreditoTerceroResponse createProcesarPagoTarjetaCreditoTerceroResponse() {
        return new ProcesarPagoTarjetaCreditoTerceroResponse();
    }

    /**
     * Create an instance of {@link ProcesarPagosCobranzasTarjetas }
     * 
     */
    public ProcesarPagosCobranzasTarjetas createProcesarPagosCobranzasTarjetas() {
        return new ProcesarPagosCobranzasTarjetas();
    }

    /**
     * Create an instance of {@link ProcesarPagosCobranzasTarjetasResponse }
     * 
     */
    public ProcesarPagosCobranzasTarjetasResponse createProcesarPagosCobranzasTarjetasResponse() {
        return new ProcesarPagosCobranzasTarjetasResponse();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCorresponsales }
     * 
     */
    public EjecutarTransaccionCorresponsales createEjecutarTransaccionCorresponsales() {
        return new EjecutarTransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link EjecutarTransaccionCorresponsalesResponse }
     * 
     */
    public EjecutarTransaccionCorresponsalesResponse createEjecutarTransaccionCorresponsalesResponse() {
        return new EjecutarTransaccionCorresponsalesResponse();
    }

    /**
     * Create an instance of {@link ConsultarMovimientosCorresponsales }
     * 
     */
    public ConsultarMovimientosCorresponsales createConsultarMovimientosCorresponsales() {
        return new ConsultarMovimientosCorresponsales();
    }

    /**
     * Create an instance of {@link ConsultarMovimientosCorresponsalesResponse }
     * 
     */
    public ConsultarMovimientosCorresponsalesResponse createConsultarMovimientosCorresponsalesResponse() {
        return new ConsultarMovimientosCorresponsalesResponse();
    }

    /**
     * Create an instance of {@link ValidarCuentaTransaccionCorresponsales }
     * 
     */
    public ValidarCuentaTransaccionCorresponsales createValidarCuentaTransaccionCorresponsales() {
        return new ValidarCuentaTransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link ValidarCuentaTransaccionCorresponsalesResponse }
     * 
     */
    public ValidarCuentaTransaccionCorresponsalesResponse createValidarCuentaTransaccionCorresponsalesResponse() {
        return new ValidarCuentaTransaccionCorresponsalesResponse();
    }

    /**
     * Create an instance of {@link CompensarTransaccionCorresponsales }
     * 
     */
    public CompensarTransaccionCorresponsales createCompensarTransaccionCorresponsales() {
        return new CompensarTransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link CompensarTransaccionCorresponsalesResponse }
     * 
     */
    public CompensarTransaccionCorresponsalesResponse createCompensarTransaccionCorresponsalesResponse() {
        return new CompensarTransaccionCorresponsalesResponse();
    }

    /**
     * Create an instance of {@link GenerarArchivoCorresponsalesTrxPropias }
     * 
     */
    public GenerarArchivoCorresponsalesTrxPropias createGenerarArchivoCorresponsalesTrxPropias() {
        return new GenerarArchivoCorresponsalesTrxPropias();
    }

    /**
     * Create an instance of {@link GenerarArchivoCorresponsalesTrxPropiasResponse }
     * 
     */
    public GenerarArchivoCorresponsalesTrxPropiasResponse createGenerarArchivoCorresponsalesTrxPropiasResponse() {
        return new GenerarArchivoCorresponsalesTrxPropiasResponse();
    }

    /**
     * Create an instance of {@link GenerarArchivoCorresponsalesTrxTerceros }
     * 
     */
    public GenerarArchivoCorresponsalesTrxTerceros createGenerarArchivoCorresponsalesTrxTerceros() {
        return new GenerarArchivoCorresponsalesTrxTerceros();
    }

    /**
     * Create an instance of {@link GenerarArchivoCorresponsalesTrxTercerosResponse }
     * 
     */
    public GenerarArchivoCorresponsalesTrxTercerosResponse createGenerarArchivoCorresponsalesTrxTercerosResponse() {
        return new GenerarArchivoCorresponsalesTrxTercerosResponse();
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
     * Create an instance of {@link ValidarAprobarCuentaCanales }
     * 
     */
    public ValidarAprobarCuentaCanales createValidarAprobarCuentaCanales() {
        return new ValidarAprobarCuentaCanales();
    }

    /**
     * Create an instance of {@link ValidarAprobarCuentaCanalesResponse }
     * 
     */
    public ValidarAprobarCuentaCanalesResponse createValidarAprobarCuentaCanalesResponse() {
        return new ValidarAprobarCuentaCanalesResponse();
    }

    /**
     * Create an instance of {@link EnviarDocumentosCuenta }
     * 
     */
    public EnviarDocumentosCuenta createEnviarDocumentosCuenta() {
        return new EnviarDocumentosCuenta();
    }

    /**
     * Create an instance of {@link EnviarDocumentosCuentaResponse }
     * 
     */
    public EnviarDocumentosCuentaResponse createEnviarDocumentosCuentaResponse() {
        return new EnviarDocumentosCuentaResponse();
    }

    /**
     * Create an instance of {@link RegistrarControlImpuestoTarjetaCredito }
     * 
     */
    public RegistrarControlImpuestoTarjetaCredito createRegistrarControlImpuestoTarjetaCredito() {
        return new RegistrarControlImpuestoTarjetaCredito();
    }

    /**
     * Create an instance of {@link RegistrarControlImpuestoTarjetaCreditoResponse }
     * 
     */
    public RegistrarControlImpuestoTarjetaCreditoResponse createRegistrarControlImpuestoTarjetaCreditoResponse() {
        return new RegistrarControlImpuestoTarjetaCreditoResponse();
    }

    /**
     * Create an instance of {@link AperturarCuentaAhorros }
     * 
     */
    public AperturarCuentaAhorros createAperturarCuentaAhorros() {
        return new AperturarCuentaAhorros();
    }

    /**
     * Create an instance of {@link AperturarCuentaAhorrosResponse }
     * 
     */
    public AperturarCuentaAhorrosResponse createAperturarCuentaAhorrosResponse() {
        return new AperturarCuentaAhorrosResponse();
    }

    /**
     * Create an instance of {@link RegistrarRestriccionCliente }
     * 
     */
    public RegistrarRestriccionCliente createRegistrarRestriccionCliente() {
        return new RegistrarRestriccionCliente();
    }

    /**
     * Create an instance of {@link RegistrarRestriccionClienteResponse }
     * 
     */
    public RegistrarRestriccionClienteResponse createRegistrarRestriccionClienteResponse() {
        return new RegistrarRestriccionClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarRestriccionCliente }
     * 
     */
    public ConsultarRestriccionCliente createConsultarRestriccionCliente() {
        return new ConsultarRestriccionCliente();
    }

    /**
     * Create an instance of {@link ConsultarRestriccionClienteResponse }
     * 
     */
    public ConsultarRestriccionClienteResponse createConsultarRestriccionClienteResponse() {
        return new ConsultarRestriccionClienteResponse();
    }

    /**
     * Create an instance of {@link ValidarCuentaNotaCredito }
     * 
     */
    public ValidarCuentaNotaCredito createValidarCuentaNotaCredito() {
        return new ValidarCuentaNotaCredito();
    }

    /**
     * Create an instance of {@link ValidarCuentaNotaCreditoResponse }
     * 
     */
    public ValidarCuentaNotaCreditoResponse createValidarCuentaNotaCreditoResponse() {
        return new ValidarCuentaNotaCreditoResponse();
    }

    /**
     * Create an instance of {@link ConsultarDetalleTransaccionRecibida }
     * 
     */
    public ConsultarDetalleTransaccionRecibida createConsultarDetalleTransaccionRecibida() {
        return new ConsultarDetalleTransaccionRecibida();
    }

    /**
     * Create an instance of {@link ConsultarDetalleTransaccionRecibidaResponse }
     * 
     */
    public ConsultarDetalleTransaccionRecibidaResponse createConsultarDetalleTransaccionRecibidaResponse() {
        return new ConsultarDetalleTransaccionRecibidaResponse();
    }

    /**
     * Create an instance of {@link ProcesarDeposito }
     * 
     */
    public ProcesarDeposito createProcesarDeposito() {
        return new ProcesarDeposito();
    }

    /**
     * Create an instance of {@link ProcesarDepositoResponse }
     * 
     */
    public ProcesarDepositoResponse createProcesarDepositoResponse() {
        return new ProcesarDepositoResponse();
    }

    /**
     * Create an instance of {@link ProcesarRetiro }
     * 
     */
    public ProcesarRetiro createProcesarRetiro() {
        return new ProcesarRetiro();
    }

    /**
     * Create an instance of {@link ProcesarRetiroResponse }
     * 
     */
    public ProcesarRetiroResponse createProcesarRetiroResponse() {
        return new ProcesarRetiroResponse();
    }

    /**
     * Create an instance of {@link ReimprimirContratoCliente }
     * 
     */
    public ReimprimirContratoCliente createReimprimirContratoCliente() {
        return new ReimprimirContratoCliente();
    }

    /**
     * Create an instance of {@link ReimprimirContratoClienteResponse }
     * 
     */
    public ReimprimirContratoClienteResponse createReimprimirContratoClienteResponse() {
        return new ReimprimirContratoClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarTransferenciasSPICanales }
     * 
     */
    public ConsultarTransferenciasSPICanales createConsultarTransferenciasSPICanales() {
        return new ConsultarTransferenciasSPICanales();
    }

    /**
     * Create an instance of {@link ConsultarTransferenciasSPICanalesResponse }
     * 
     */
    public ConsultarTransferenciasSPICanalesResponse createConsultarTransferenciasSPICanalesResponse() {
        return new ConsultarTransferenciasSPICanalesResponse();
    }

    /**
     * Create an instance of {@link GenerarEstadosCuenta }
     * 
     */
    public GenerarEstadosCuenta createGenerarEstadosCuenta() {
        return new GenerarEstadosCuenta();
    }

    /**
     * Create an instance of {@link GenerarEstadosCuentaResponse }
     * 
     */
    public GenerarEstadosCuentaResponse createGenerarEstadosCuentaResponse() {
        return new GenerarEstadosCuentaResponse();
    }

    /**
     * Create an instance of {@link DevolverCuentaParaCredito }
     * 
     */
    public DevolverCuentaParaCredito createDevolverCuentaParaCredito() {
        return new DevolverCuentaParaCredito();
    }

    /**
     * Create an instance of {@link DevolverCuentaParaCreditoResponse }
     * 
     */
    public DevolverCuentaParaCreditoResponse createDevolverCuentaParaCreditoResponse() {
        return new DevolverCuentaParaCreditoResponse();
    }

    /**
     * Create an instance of {@link CargarDocumentosCuenta }
     * 
     */
    public CargarDocumentosCuenta createCargarDocumentosCuenta() {
        return new CargarDocumentosCuenta();
    }

    /**
     * Create an instance of {@link CargarDocumentosCuentaResponse }
     * 
     */
    public CargarDocumentosCuentaResponse createCargarDocumentosCuentaResponse() {
        return new CargarDocumentosCuentaResponse();
    }

    /**
     * Create an instance of {@link ReimprimirContratoCuenta }
     * 
     */
    public ReimprimirContratoCuenta createReimprimirContratoCuenta() {
        return new ReimprimirContratoCuenta();
    }

    /**
     * Create an instance of {@link ReimprimirContratoCuentaResponse }
     * 
     */
    public ReimprimirContratoCuentaResponse createReimprimirContratoCuentaResponse() {
        return new ReimprimirContratoCuentaResponse();
    }

    /**
     * Create an instance of {@link HabilitarEstadoDeCuentaDigital }
     * 
     */
    public HabilitarEstadoDeCuentaDigital createHabilitarEstadoDeCuentaDigital() {
        return new HabilitarEstadoDeCuentaDigital();
    }

    /**
     * Create an instance of {@link HabilitarEstadoDeCuentaDigitalResponse }
     * 
     */
    public HabilitarEstadoDeCuentaDigitalResponse createHabilitarEstadoDeCuentaDigitalResponse() {
        return new HabilitarEstadoDeCuentaDigitalResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultar", scope = ConsultarSaldosCuentas.class)
    public JAXBElement<MEConsultasCuenta> createConsultarSaldosCuentasMeConsultar(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarSaldosCuentasMeConsultar_QNAME, MEConsultasCuenta.class, ConsultarSaldosCuentas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosCuentasResult", scope = ConsultarSaldosCuentasResponse.class)
    public JAXBElement<MSConsultasSaldosCuenta> createConsultarSaldosCuentasResponseConsultarSaldosCuentasResult(MSConsultasSaldosCuenta value) {
        return new JAXBElement<MSConsultasSaldosCuenta>(_ConsultarSaldosCuentasResponseConsultarSaldosCuentasResult_QNAME, MSConsultasSaldosCuenta.class, ConsultarSaldosCuentasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultar", scope = ConsultarSaldosVariasCuentas.class)
    public JAXBElement<MEConsultasCuenta> createConsultarSaldosVariasCuentasMeConsultar(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarSaldosCuentasMeConsultar_QNAME, MEConsultasCuenta.class, ConsultarSaldosVariasCuentas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuentas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuentas }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosVariasCuentasResult", scope = ConsultarSaldosVariasCuentasResponse.class)
    public JAXBElement<MSConsultasSaldosCuentas> createConsultarSaldosVariasCuentasResponseConsultarSaldosVariasCuentasResult(MSConsultasSaldosCuentas value) {
        return new JAXBElement<MSConsultasSaldosCuentas>(_ConsultarSaldosVariasCuentasResponseConsultarSaldosVariasCuentasResult_QNAME, MSConsultasSaldosCuentas.class, ConsultarSaldosVariasCuentasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "organizacion", scope = ConsultarSaldos.class)
    public JAXBElement<String> createConsultarSaldosOrganizacion(String value) {
        return new JAXBElement<String>(_ConsultarSaldosOrganizacion_QNAME, String.class, ConsultarSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "numeroCuenta", scope = ConsultarSaldos.class)
    public JAXBElement<String> createConsultarSaldosNumeroCuenta(String value) {
        return new JAXBElement<String>(_ConsultarSaldosNumeroCuenta_QNAME, String.class, ConsultarSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosResult", scope = ConsultarSaldosResponse.class)
    public JAXBElement<MSConsultasSaldosCuenta> createConsultarSaldosResponseConsultarSaldosResult(MSConsultasSaldosCuenta value) {
        return new JAXBElement<MSConsultasSaldosCuenta>(_ConsultarSaldosResponseConsultarSaldosResult_QNAME, MSConsultasSaldosCuenta.class, ConsultarSaldosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDebito", scope = GenerarNotaDebito.class)
    public JAXBElement<MENdNc> createGenerarNotaDebitoMeDebito(MENdNc value) {
        return new JAXBElement<MENdNc>(_GenerarNotaDebitoMeDebito_QNAME, MENdNc.class, GenerarNotaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarNotaDebitoResult", scope = GenerarNotaDebitoResponse.class)
    public JAXBElement<MSNotaDebito> createGenerarNotaDebitoResponseGenerarNotaDebitoResult(MSNotaDebito value) {
        return new JAXBElement<MSNotaDebito>(_GenerarNotaDebitoResponseGenerarNotaDebitoResult_QNAME, MSNotaDebito.class, GenerarNotaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDebito", scope = CompensarNotaDebito.class)
    public JAXBElement<MEReversoNdNc> createCompensarNotaDebitoMeDebito(MEReversoNdNc value) {
        return new JAXBElement<MEReversoNdNc>(_GenerarNotaDebitoMeDebito_QNAME, MEReversoNdNc.class, CompensarNotaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarNotaDebitoResult", scope = CompensarNotaDebitoResponse.class)
    public JAXBElement<MSNotaDebito> createCompensarNotaDebitoResponseCompensarNotaDebitoResult(MSNotaDebito value) {
        return new JAXBElement<MSNotaDebito>(_CompensarNotaDebitoResponseCompensarNotaDebitoResult_QNAME, MSNotaDebito.class, CompensarNotaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNcAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNcAtm }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDebito", scope = GenerarNotaDebitoAtm.class)
    public JAXBElement<MENdNcAtm> createGenerarNotaDebitoAtmMeDebito(MENdNcAtm value) {
        return new JAXBElement<MENdNcAtm>(_GenerarNotaDebitoMeDebito_QNAME, MENdNcAtm.class, GenerarNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarNotaDebitoAtmResult", scope = GenerarNotaDebitoAtmResponse.class)
    public JAXBElement<MSNotaDebitoAtm> createGenerarNotaDebitoAtmResponseGenerarNotaDebitoAtmResult(MSNotaDebitoAtm value) {
        return new JAXBElement<MSNotaDebitoAtm>(_GenerarNotaDebitoAtmResponseGenerarNotaDebitoAtmResult_QNAME, MSNotaDebitoAtm.class, GenerarNotaDebitoAtmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = GenerarNotaCredito.class)
    public JAXBElement<MENdNc> createGenerarNotaCreditoMeCredito(MENdNc value) {
        return new JAXBElement<MENdNc>(_GenerarNotaCreditoMeCredito_QNAME, MENdNc.class, GenerarNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarNotaCreditoResult", scope = GenerarNotaCreditoResponse.class)
    public JAXBElement<MSNotaCredito> createGenerarNotaCreditoResponseGenerarNotaCreditoResult(MSNotaCredito value) {
        return new JAXBElement<MSNotaCredito>(_GenerarNotaCreditoResponseGenerarNotaCreditoResult_QNAME, MSNotaCredito.class, GenerarNotaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = CompensarNotaCredito.class)
    public JAXBElement<MEReversoNdNc> createCompensarNotaCreditoMeCredito(MEReversoNdNc value) {
        return new JAXBElement<MEReversoNdNc>(_GenerarNotaCreditoMeCredito_QNAME, MEReversoNdNc.class, CompensarNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarNotaCreditoResult", scope = CompensarNotaCreditoResponse.class)
    public JAXBElement<MSNotaCredito> createCompensarNotaCreditoResponseCompensarNotaCreditoResult(MSNotaCredito value) {
        return new JAXBElement<MSNotaCredito>(_CompensarNotaCreditoResponseCompensarNotaCreditoResult_QNAME, MSNotaCredito.class, CompensarNotaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarInformacionCliente.class)
    public JAXBElement<MEConsultasCuenta> createConsultarInformacionClienteMeCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasCuenta.class, ConsultarInformacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarInformacionClienteResult", scope = ConsultarInformacionClienteResponse.class)
    public JAXBElement<MSConsultasDatosCuenta> createConsultarInformacionClienteResponseConsultarInformacionClienteResult(MSConsultasDatosCuenta value) {
        return new JAXBElement<MSConsultasDatosCuenta>(_ConsultarInformacionClienteResponseConsultarInformacionClienteResult_QNAME, MSConsultasDatosCuenta.class, ConsultarInformacionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ActualizarLibreta.class)
    public JAXBElement<MEConsultasLibreta> createActualizarLibretaMeCuenta(MEConsultasLibreta value) {
        return new JAXBElement<MEConsultasLibreta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasLibreta.class, ActualizarLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarLibretaResult", scope = ActualizarLibretaResponse.class)
    public JAXBElement<MSConsultasLibreta> createActualizarLibretaResponseActualizarLibretaResult(MSConsultasLibreta value) {
        return new JAXBElement<MSConsultasLibreta>(_ActualizarLibretaResponseActualizarLibretaResult_QNAME, MSConsultasLibreta.class, ActualizarLibretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "perLibreta", scope = ConsultarDatosLibreta.class)
    public JAXBElement<MEConsultasCuenta> createConsultarDatosLibretaPerLibreta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarDatosLibretaPerLibreta_QNAME, MEConsultasCuenta.class, ConsultarDatosLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSPersonalizacionLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSPersonalizacionLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDatosLibretaResult", scope = ConsultarDatosLibretaResponse.class)
    public JAXBElement<MSPersonalizacionLibreta> createConsultarDatosLibretaResponseConsultarDatosLibretaResult(MSPersonalizacionLibreta value) {
        return new JAXBElement<MSPersonalizacionLibreta>(_ConsultarDatosLibretaResponseConsultarDatosLibretaResult_QNAME, MSPersonalizacionLibreta.class, ConsultarDatosLibretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECanjeLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECanjeLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = CanjearLibreta.class)
    public JAXBElement<MECanjeLibreta> createCanjearLibretaMeCuenta(MECanjeLibreta value) {
        return new JAXBElement<MECanjeLibreta>(_ConsultarInformacionClienteMeCuenta_QNAME, MECanjeLibreta.class, CanjearLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCanjeLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCanjeLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CanjearLibretaResult", scope = CanjearLibretaResponse.class)
    public JAXBElement<MSCanjeLibreta> createCanjearLibretaResponseCanjearLibretaResult(MSCanjeLibreta value) {
        return new JAXBElement<MSCanjeLibreta>(_CanjearLibretaResponseCanjearLibretaResult_QNAME, MSCanjeLibreta.class, CanjearLibretaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = ConsultarCuentaAhorros.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarCuentaAhorrosMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, ConsultarCuentaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCuentaAhorrosResult", scope = ConsultarCuentaAhorrosResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCuentaAhorrosResponseConsultarCuentaAhorrosResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCuentaAhorrosResponseConsultarCuentaAhorrosResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCuentaAhorrosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = ConsultarDatosAdmTarjetas.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarDatosAdmTarjetasMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, ConsultarDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosAdmTarjetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosAdmTarjetas }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDatosAdmTarjetasResult", scope = ConsultarDatosAdmTarjetasResponse.class)
    public JAXBElement<MSConsultasDatosAdmTarjetas> createConsultarDatosAdmTarjetasResponseConsultarDatosAdmTarjetasResult(MSConsultasDatosAdmTarjetas value) {
        return new JAXBElement<MSConsultasDatosAdmTarjetas>(_ConsultarDatosAdmTarjetasResponseConsultarDatosAdmTarjetasResult_QNAME, MSConsultasDatosAdmTarjetas.class, ConsultarDatosAdmTarjetasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarMovimientos.class)
    public JAXBElement<MEConsultasMovimientos> createConsultarMovimientosMeCuenta(MEConsultasMovimientos value) {
        return new JAXBElement<MEConsultasMovimientos>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasMovimientos.class, ConsultarMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarMovimientosResult", scope = ConsultarMovimientosResponse.class)
    public JAXBElement<MSConsultasMovimientosCuenta> createConsultarMovimientosResponseConsultarMovimientosResult(MSConsultasMovimientosCuenta value) {
        return new JAXBElement<MSConsultasMovimientosCuenta>(_ConsultarMovimientosResponseConsultarMovimientosResult_QNAME, MSConsultasMovimientosCuenta.class, ConsultarMovimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarCuenta.class)
    public JAXBElement<MEConsultasCuenta> createConsultarCuentaMeCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasCuenta.class, ConsultarCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCuentaResult", scope = ConsultarCuentaResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCuentaResponseConsultarCuentaResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCuentaResponseConsultarCuentaResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarCuentaCondiciones.class)
    public JAXBElement<MEConsultasCuenta> createConsultarCuentaCondicionesMeCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasCuenta.class, ConsultarCuentaCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCuentaCondicionesResult", scope = ConsultarCuentaCondicionesResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCuentaCondicionesResponseConsultarCuentaCondicionesResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCuentaCondicionesResponseConsultarCuentaCondicionesResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCuentaCondicionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarCertificadosAportacion.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarCertificadosAportacionMeConsulta(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEIdentificacionCliente.class, ConsultarCertificadosAportacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCertificadosAportacionResult", scope = ConsultarCertificadosAportacionResponse.class)
    public JAXBElement<MSConsultasCertificados> createConsultarCertificadosAportacionResponseConsultarCertificadosAportacionResult(MSConsultasCertificados value) {
        return new JAXBElement<MSConsultasCertificados>(_ConsultarCertificadosAportacionResponseConsultarCertificadosAportacionResult_QNAME, MSConsultasCertificados.class, ConsultarCertificadosAportacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarSaldoCuentaAtm.class)
    public JAXBElement<MEConsultaSaldoAtm> createConsultarSaldoCuentaAtmMeConsulta(MEConsultaSaldoAtm value) {
        return new JAXBElement<MEConsultaSaldoAtm>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEConsultaSaldoAtm.class, ConsultarSaldoCuentaAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldoCuentaAtmResult", scope = ConsultarSaldoCuentaAtmResponse.class)
    public JAXBElement<MSConsultaSaldoAtm> createConsultarSaldoCuentaAtmResponseConsultarSaldoCuentaAtmResult(MSConsultaSaldoAtm value) {
        return new JAXBElement<MSConsultaSaldoAtm>(_ConsultarSaldoCuentaAtmResponseConsultarSaldoCuentaAtmResult_QNAME, MSConsultaSaldoAtm.class, ConsultarSaldoCuentaAtmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = RegistrarTransferenciaSpi.class)
    public JAXBElement<METransferenciaSpi> createRegistrarTransferenciaSpiMeTransferencia(METransferenciaSpi value) {
        return new JAXBElement<METransferenciaSpi>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferenciaSpi.class, RegistrarTransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarTransferenciaSpiResult", scope = RegistrarTransferenciaSpiResponse.class)
    public JAXBElement<MSTransferenciaSpi> createRegistrarTransferenciaSpiResponseRegistrarTransferenciaSpiResult(MSTransferenciaSpi value) {
        return new JAXBElement<MSTransferenciaSpi>(_RegistrarTransferenciaSpiResponseRegistrarTransferenciaSpiResult_QNAME, MSTransferenciaSpi.class, RegistrarTransferenciaSpiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meBancos", scope = ConsultarBancosSpi.class)
    public JAXBElement<METransferenciaSpi> createConsultarBancosSpiMeBancos(METransferenciaSpi value) {
        return new JAXBElement<METransferenciaSpi>(_ConsultarBancosSpiMeBancos_QNAME, METransferenciaSpi.class, ConsultarBancosSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarBancosSpiResult", scope = ConsultarBancosSpiResponse.class)
    public JAXBElement<MSTransferenciaSpi> createConsultarBancosSpiResponseConsultarBancosSpiResult(MSTransferenciaSpi value) {
        return new JAXBElement<MSTransferenciaSpi>(_ConsultarBancosSpiResponseConsultarBancosSpiResult_QNAME, MSTransferenciaSpi.class, ConsultarBancosSpiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = RecuperarDepositos.class)
    public JAXBElement<MEConsultasCuenta> createRecuperarDepositosMeCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasCuenta.class, RecuperarDepositos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDepositos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDepositos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecuperarDepositosResult", scope = RecuperarDepositosResponse.class)
    public JAXBElement<MSDepositos> createRecuperarDepositosResponseRecuperarDepositosResult(MSDepositos value) {
        return new JAXBElement<MSDepositos>(_RecuperarDepositosResponseRecuperarDepositosResult_QNAME, MSDepositos.class, RecuperarDepositosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarCuentaProducto.class)
    public JAXBElement<MEConsultasCuenta> createConsultarCuentaProductoMeCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasCuenta.class, ConsultarCuentaProducto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCuentaProductoResult", scope = ConsultarCuentaProductoResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarCuentaProductoResponseConsultarCuentaProductoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarCuentaProductoResponseConsultarCuentaProductoResult_QNAME, MensajeSalidaBase.class, ConsultarCuentaProductoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENotaDC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENotaDC }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mensaje", scope = AjusteContable.class)
    public JAXBElement<MENotaDC> createAjusteContableMensaje(MENotaDC value) {
        return new JAXBElement<MENotaDC>(_AjusteContableMensaje_QNAME, MENotaDC.class, AjusteContable.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AjusteContableResult", scope = AjusteContableResponse.class)
    public JAXBElement<MSNotaDebito> createAjusteContableResponseAjusteContableResult(MSNotaDebito value) {
        return new JAXBElement<MSNotaDebito>(_AjusteContableResponseAjusteContableResult_QNAME, MSNotaDebito.class, AjusteContableResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosChequeDevolver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosChequeDevolver }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mensaje", scope = DevolucionCheque.class)
    public JAXBElement<MEDatosChequeDevolver> createDevolucionChequeMensaje(MEDatosChequeDevolver value) {
        return new JAXBElement<MEDatosChequeDevolver>(_AjusteContableMensaje_QNAME, MEDatosChequeDevolver.class, DevolucionCheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "DevolucionChequeResult", scope = DevolucionChequeResponse.class)
    public JAXBElement<MensajeSalidaBase> createDevolucionChequeResponseDevolucionChequeResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_DevolucionChequeResponseDevolucionChequeResult_QNAME, MensajeSalidaBase.class, DevolucionChequeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mensaje", scope = ConsultarUsuario.class)
    public JAXBElement<MEDatosUsuario> createConsultarUsuarioMensaje(MEDatosUsuario value) {
        return new JAXBElement<MEDatosUsuario>(_AjusteContableMensaje_QNAME, MEDatosUsuario.class, ConsultarUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarUsuarioResult", scope = ConsultarUsuarioResponse.class)
    public JAXBElement<MSDatosUsuario> createConsultarUsuarioResponseConsultarUsuarioResult(MSDatosUsuario value) {
        return new JAXBElement<MSDatosUsuario>(_ConsultarUsuarioResponseConsultarUsuarioResult_QNAME, MSDatosUsuario.class, ConsultarUsuarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosCheques }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosCheques }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mensaje", scope = RecibirDetalleCheques.class)
    public JAXBElement<MEDatosCheques> createRecibirDetalleChequesMensaje(MEDatosCheques value) {
        return new JAXBElement<MEDatosCheques>(_AjusteContableMensaje_QNAME, MEDatosCheques.class, RecibirDetalleCheques.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RecibirDetalleChequesResult", scope = RecibirDetalleChequesResponse.class)
    public JAXBElement<MensajeSalidaBase> createRecibirDetalleChequesResponseRecibirDetalleChequesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RecibirDetalleChequesResponseRecibirDetalleChequesResult_QNAME, MensajeSalidaBase.class, RecibirDetalleChequesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = RegistrarTransferenciaPropia.class)
    public JAXBElement<METransferencia> createRegistrarTransferenciaPropiaMeTransferencia(METransferencia value) {
        return new JAXBElement<METransferencia>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferencia.class, RegistrarTransferenciaPropia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarTransferenciaPropiaResult", scope = RegistrarTransferenciaPropiaResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarTransferenciaPropiaResponseRegistrarTransferenciaPropiaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarTransferenciaPropiaResponseRegistrarTransferenciaPropiaResult_QNAME, MensajeSalidaBase.class, RegistrarTransferenciaPropiaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = RegistrarTransferenciaInterna.class)
    public JAXBElement<METransferencia> createRegistrarTransferenciaInternaMeTransferencia(METransferencia value) {
        return new JAXBElement<METransferencia>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferencia.class, RegistrarTransferenciaInterna.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarTransferenciaInternaResult", scope = RegistrarTransferenciaInternaResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarTransferenciaInternaResponseRegistrarTransferenciaInternaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarTransferenciaInternaResponseRegistrarTransferenciaInternaResult_QNAME, MensajeSalidaBase.class, RegistrarTransferenciaInternaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePlanServicio", scope = ActualizarPlanServicio.class)
    public JAXBElement<MEConsultasCliente> createActualizarPlanServicioMePlanServicio(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ActualizarPlanServicioMePlanServicio_QNAME, MEConsultasCliente.class, ActualizarPlanServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarPlanServicioResult", scope = ActualizarPlanServicioResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarPlanServicioResponseActualizarPlanServicioResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarPlanServicioResponseActualizarPlanServicioResult_QNAME, MensajeSalidaBase.class, ActualizarPlanServicioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePlanServicio", scope = AnularPlanServicio.class)
    public JAXBElement<MEConsultasCliente> createAnularPlanServicioMePlanServicio(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ActualizarPlanServicioMePlanServicio_QNAME, MEConsultasCliente.class, AnularPlanServicio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AnularPlanServicioResult", scope = AnularPlanServicioResponse.class)
    public JAXBElement<MensajeSalidaBase> createAnularPlanServicioResponseAnularPlanServicioResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_AnularPlanServicioResponseAnularPlanServicioResult_QNAME, MensajeSalidaBase.class, AnularPlanServicioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDebito", scope = CompensarNotaDebitoAtm.class)
    public JAXBElement<MEReversoNdNc> createCompensarNotaDebitoAtmMeDebito(MEReversoNdNc value) {
        return new JAXBElement<MEReversoNdNc>(_GenerarNotaDebitoMeDebito_QNAME, MEReversoNdNc.class, CompensarNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarNotaDebitoAtmResult", scope = CompensarNotaDebitoAtmResponse.class)
    public JAXBElement<MSNotaDebitoAtm> createCompensarNotaDebitoAtmResponseCompensarNotaDebitoAtmResult(MSNotaDebitoAtm value) {
        return new JAXBElement<MSNotaDebitoAtm>(_CompensarNotaDebitoAtmResponseCompensarNotaDebitoAtmResult_QNAME, MSNotaDebitoAtm.class, CompensarNotaDebitoAtmResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = BloquearCuentasCliente.class)
    public JAXBElement<MEIdentificacionCliente> createBloquearCuentasClienteMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, BloquearCuentasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "BloquearCuentasClienteResult", scope = BloquearCuentasClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createBloquearCuentasClienteResponseBloquearCuentasClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_BloquearCuentasClienteResponseBloquearCuentasClienteResult_QNAME, MensajeSalidaBase.class, BloquearCuentasClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = RegistrarTransferenciaPagoDirecto.class)
    public JAXBElement<METransferenciaPagoDirecto> createRegistrarTransferenciaPagoDirectoMeTransferencia(METransferenciaPagoDirecto value) {
        return new JAXBElement<METransferenciaPagoDirecto>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferenciaPagoDirecto.class, RegistrarTransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarTransferenciaPagoDirectoResult", scope = RegistrarTransferenciaPagoDirectoResponse.class)
    public JAXBElement<MSTransferenciaPagoDirecto> createRegistrarTransferenciaPagoDirectoResponseRegistrarTransferenciaPagoDirectoResult(MSTransferenciaPagoDirecto value) {
        return new JAXBElement<MSTransferenciaPagoDirecto>(_RegistrarTransferenciaPagoDirectoResponseRegistrarTransferenciaPagoDirectoResult_QNAME, MSTransferenciaPagoDirecto.class, RegistrarTransferenciaPagoDirectoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = CompensarTransferenciaPagoDirecto.class)
    public JAXBElement<METransferenciaPagoDirecto> createCompensarTransferenciaPagoDirectoMeTransferencia(METransferenciaPagoDirecto value) {
        return new JAXBElement<METransferenciaPagoDirecto>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferenciaPagoDirecto.class, CompensarTransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarTransferenciaPagoDirectoResult", scope = CompensarTransferenciaPagoDirectoResponse.class)
    public JAXBElement<MSTransferenciaPagoDirecto> createCompensarTransferenciaPagoDirectoResponseCompensarTransferenciaPagoDirectoResult(MSTransferenciaPagoDirecto value) {
        return new JAXBElement<MSTransferenciaPagoDirecto>(_CompensarTransferenciaPagoDirectoResponseCompensarTransferenciaPagoDirectoResult_QNAME, MSTransferenciaPagoDirecto.class, CompensarTransferenciaPagoDirectoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meMonedero", scope = RegistrarMonederoElectronico.class)
    public JAXBElement<MEMonederoElectronico> createRegistrarMonederoElectronicoMeMonedero(MEMonederoElectronico value) {
        return new JAXBElement<MEMonederoElectronico>(_RegistrarMonederoElectronicoMeMonedero_QNAME, MEMonederoElectronico.class, RegistrarMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarMonederoElectronicoResult", scope = RegistrarMonederoElectronicoResponse.class)
    public JAXBElement<MSMonederoElectronico> createRegistrarMonederoElectronicoResponseRegistrarMonederoElectronicoResult(MSMonederoElectronico value) {
        return new JAXBElement<MSMonederoElectronico>(_RegistrarMonederoElectronicoResponseRegistrarMonederoElectronicoResult_QNAME, MSMonederoElectronico.class, RegistrarMonederoElectronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meMonedero", scope = ConfirmarRegistroMonederoElectronico.class)
    public JAXBElement<MEMonederoElectronico> createConfirmarRegistroMonederoElectronicoMeMonedero(MEMonederoElectronico value) {
        return new JAXBElement<MEMonederoElectronico>(_RegistrarMonederoElectronicoMeMonedero_QNAME, MEMonederoElectronico.class, ConfirmarRegistroMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConfirmarRegistroMonederoElectronicoResult", scope = ConfirmarRegistroMonederoElectronicoResponse.class)
    public JAXBElement<MensajeSalidaBase> createConfirmarRegistroMonederoElectronicoResponseConfirmarRegistroMonederoElectronicoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConfirmarRegistroMonederoElectronicoResponseConfirmarRegistroMonederoElectronicoResult_QNAME, MensajeSalidaBase.class, ConfirmarRegistroMonederoElectronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meMonedero", scope = AnularRegistroMonederoElectronico.class)
    public JAXBElement<MEMonederoElectronico> createAnularRegistroMonederoElectronicoMeMonedero(MEMonederoElectronico value) {
        return new JAXBElement<MEMonederoElectronico>(_RegistrarMonederoElectronicoMeMonedero_QNAME, MEMonederoElectronico.class, AnularRegistroMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AnularRegistroMonederoElectronicoResult", scope = AnularRegistroMonederoElectronicoResponse.class)
    public JAXBElement<MensajeSalidaBase> createAnularRegistroMonederoElectronicoResponseAnularRegistroMonederoElectronicoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_AnularRegistroMonederoElectronicoResponseAnularRegistroMonederoElectronicoResult_QNAME, MensajeSalidaBase.class, AnularRegistroMonederoElectronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = RegistrarTransferenciaMonederoElectronico.class)
    public JAXBElement<METransferenciaMonederoElectronico> createRegistrarTransferenciaMonederoElectronicoMeTransferencia(METransferenciaMonederoElectronico value) {
        return new JAXBElement<METransferenciaMonederoElectronico>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferenciaMonederoElectronico.class, RegistrarTransferenciaMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarTransferenciaMonederoElectronicoResult", scope = RegistrarTransferenciaMonederoElectronicoResponse.class)
    public JAXBElement<MSTransferenciaMonederoElectronico> createRegistrarTransferenciaMonederoElectronicoResponseRegistrarTransferenciaMonederoElectronicoResult(MSTransferenciaMonederoElectronico value) {
        return new JAXBElement<MSTransferenciaMonederoElectronico>(_RegistrarTransferenciaMonederoElectronicoResponseRegistrarTransferenciaMonederoElectronicoResult_QNAME, MSTransferenciaMonederoElectronico.class, RegistrarTransferenciaMonederoElectronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransferencia", scope = CompensarTransferenciaMonederoElectronico.class)
    public JAXBElement<METransferenciaMonederoElectronico> createCompensarTransferenciaMonederoElectronicoMeTransferencia(METransferenciaMonederoElectronico value) {
        return new JAXBElement<METransferenciaMonederoElectronico>(_RegistrarTransferenciaSpiMeTransferencia_QNAME, METransferenciaMonederoElectronico.class, CompensarTransferenciaMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarTransferenciaMonederoElectronicoResult", scope = CompensarTransferenciaMonederoElectronicoResponse.class)
    public JAXBElement<MSTransferenciaMonederoElectronico> createCompensarTransferenciaMonederoElectronicoResponseCompensarTransferenciaMonederoElectronicoResult(MSTransferenciaMonederoElectronico value) {
        return new JAXBElement<MSTransferenciaMonederoElectronico>(_CompensarTransferenciaMonederoElectronicoResponseCompensarTransferenciaMonederoElectronicoResult_QNAME, MSTransferenciaMonederoElectronico.class, CompensarTransferenciaMonederoElectronicoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = EjecutarTransaccionTarjetaDebito.class)
    public JAXBElement<METransaccionTarjetaDebito> createEjecutarTransaccionTarjetaDebitoMeTransaccion(METransaccionTarjetaDebito value) {
        return new JAXBElement<METransaccionTarjetaDebito>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionTarjetaDebito.class, EjecutarTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EjecutarTransaccionTarjetaDebitoResult", scope = EjecutarTransaccionTarjetaDebitoResponse.class)
    public JAXBElement<MSTransaccionTarjetaDebito> createEjecutarTransaccionTarjetaDebitoResponseEjecutarTransaccionTarjetaDebitoResult(MSTransaccionTarjetaDebito value) {
        return new JAXBElement<MSTransaccionTarjetaDebito>(_EjecutarTransaccionTarjetaDebitoResponseEjecutarTransaccionTarjetaDebitoResult_QNAME, MSTransaccionTarjetaDebito.class, EjecutarTransaccionTarjetaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCabecera", scope = ReprocesarTransaccionTarjetaDebito.class)
    public JAXBElement<MensajeEntradaBase> createReprocesarTransaccionTarjetaDebitoMeCabecera(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ReprocesarTransaccionTarjetaDebitoMeCabecera_QNAME, MensajeEntradaBase.class, ReprocesarTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ReprocesarTransaccionTarjetaDebitoResult", scope = ReprocesarTransaccionTarjetaDebitoResponse.class)
    public JAXBElement<MensajeSalidaBase> createReprocesarTransaccionTarjetaDebitoResponseReprocesarTransaccionTarjetaDebitoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ReprocesarTransaccionTarjetaDebitoResponseReprocesarTransaccionTarjetaDebitoResult_QNAME, MensajeSalidaBase.class, ReprocesarTransaccionTarjetaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarSaldoTarjetaDebito.class)
    public JAXBElement<MEConsultaTarjetaDebito> createConsultarSaldoTarjetaDebitoMeConsulta(MEConsultaTarjetaDebito value) {
        return new JAXBElement<MEConsultaTarjetaDebito>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEConsultaTarjetaDebito.class, ConsultarSaldoTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldoTarjetaDebitoResult", scope = ConsultarSaldoTarjetaDebitoResponse.class)
    public JAXBElement<MSConsultaTarjetaDebito> createConsultarSaldoTarjetaDebitoResponseConsultarSaldoTarjetaDebitoResult(MSConsultaTarjetaDebito value) {
        return new JAXBElement<MSConsultaTarjetaDebito>(_ConsultarSaldoTarjetaDebitoResponseConsultarSaldoTarjetaDebitoResult_QNAME, MSConsultaTarjetaDebito.class, ConsultarSaldoTarjetaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECompensacionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECompensacionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = CompensarTransaccionTarjetaDebito.class)
    public JAXBElement<MECompensacionTarjetaDebito> createCompensarTransaccionTarjetaDebitoMeTransaccion(MECompensacionTarjetaDebito value) {
        return new JAXBElement<MECompensacionTarjetaDebito>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, MECompensacionTarjetaDebito.class, CompensarTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarTransaccionTarjetaDebitoResult", scope = CompensarTransaccionTarjetaDebitoResponse.class)
    public JAXBElement<MSTransaccionTarjetaDebito> createCompensarTransaccionTarjetaDebitoResponseCompensarTransaccionTarjetaDebitoResult(MSTransaccionTarjetaDebito value) {
        return new JAXBElement<MSTransaccionTarjetaDebito>(_CompensarTransaccionTarjetaDebitoResponseCompensarTransaccionTarjetaDebitoResult_QNAME, MSTransaccionTarjetaDebito.class, CompensarTransaccionTarjetaDebitoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = ConsultarCondicionesCuentasAhorrosPorIdentificacion.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarCondicionesCuentasAhorrosPorIdentificacionMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, ConsultarCondicionesCuentasAhorrosPorIdentificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCondicionesCuentasAhorrosPorIdentificacionResult", scope = ConsultarCondicionesCuentasAhorrosPorIdentificacionResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCondicionesCuentasAhorrosPorIdentificacionResponseConsultarCondicionesCuentasAhorrosPorIdentificacionResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCondicionesCuentasAhorrosPorIdentificacionResponseConsultarCondicionesCuentasAhorrosPorIdentificacionResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCondicionesCuentasAhorrosPorIdentificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTelefono", scope = ConsultarCondicionesCuentasAhorrosPorTelefono.class)
    public JAXBElement<METelefono> createConsultarCondicionesCuentasAhorrosPorTelefonoMeTelefono(METelefono value) {
        return new JAXBElement<METelefono>(_ConsultarCondicionesCuentasAhorrosPorTelefonoMeTelefono_QNAME, METelefono.class, ConsultarCondicionesCuentasAhorrosPorTelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCondicionesCuentasAhorrosPorTelefonoResult", scope = ConsultarCondicionesCuentasAhorrosPorTelefonoResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCondicionesCuentasAhorrosPorTelefonoResponseConsultarCondicionesCuentasAhorrosPorTelefonoResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCondicionesCuentasAhorrosPorTelefonoResponseConsultarCondicionesCuentasAhorrosPorTelefonoResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCondicionesCuentasAhorrosPorTelefonoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarCondicionesCuentaAhorros.class)
    public JAXBElement<MEConsultasCuenta> createConsultarCondicionesCuentaAhorrosMeConsulta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEConsultasCuenta.class, ConsultarCondicionesCuentaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCondicionesCuentaAhorrosResult", scope = ConsultarCondicionesCuentaAhorrosResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCondicionesCuentaAhorrosResponseConsultarCondicionesCuentaAhorrosResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCondicionesCuentaAhorrosResponseConsultarCondicionesCuentaAhorrosResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCondicionesCuentaAhorrosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarUltimosMovimientos.class)
    public JAXBElement<MEConsultasMovimientos> createConsultarUltimosMovimientosMeCuenta(MEConsultasMovimientos value) {
        return new JAXBElement<MEConsultasMovimientos>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasMovimientos.class, ConsultarUltimosMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarUltimosMovimientosResult", scope = ConsultarUltimosMovimientosResponse.class)
    public JAXBElement<MSConsultasMovimientosCuenta> createConsultarUltimosMovimientosResponseConsultarUltimosMovimientosResult(MSConsultasMovimientosCuenta value) {
        return new JAXBElement<MSConsultasMovimientosCuenta>(_ConsultarUltimosMovimientosResponseConsultarUltimosMovimientosResult_QNAME, MSConsultasMovimientosCuenta.class, ConsultarUltimosMovimientosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = EjecutarTransaccionCanales.class)
    public JAXBElement<METransaccionCanales> createEjecutarTransaccionCanalesMeTransaccion(METransaccionCanales value) {
        return new JAXBElement<METransaccionCanales>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionCanales.class, EjecutarTransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EjecutarTransaccionCanalesResult", scope = EjecutarTransaccionCanalesResponse.class)
    public JAXBElement<MSTransaccionCanales> createEjecutarTransaccionCanalesResponseEjecutarTransaccionCanalesResult(MSTransaccionCanales value) {
        return new JAXBElement<MSTransaccionCanales>(_EjecutarTransaccionCanalesResponseEjecutarTransaccionCanalesResult_QNAME, MSTransaccionCanales.class, EjecutarTransaccionCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasCredito", scope = ConsultarClienteParaCuenta.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarClienteParaCuentaMeConsultasCredito(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarClienteParaCuentaMeConsultasCredito_QNAME, MEIdentificacionCliente.class, ConsultarClienteParaCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClienteParaCuentaResult", scope = ConsultarClienteParaCuentaResponse.class)
    public JAXBElement<MSConsultasCertificados> createConsultarClienteParaCuentaResponseConsultarClienteParaCuentaResult(MSConsultasCertificados value) {
        return new JAXBElement<MSConsultasCertificados>(_ConsultarClienteParaCuentaResponseConsultarClienteParaCuentaResult_QNAME, MSConsultasCertificados.class, ConsultarClienteParaCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCrearCuenta", scope = CrearCuentaCanales.class)
    public JAXBElement<MECrearCuenta> createCrearCuentaCanalesMeCrearCuenta(MECrearCuenta value) {
        return new JAXBElement<MECrearCuenta>(_CrearCuentaCanalesMeCrearCuenta_QNAME, MECrearCuenta.class, CrearCuentaCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearCuentaCanalesResult", scope = CrearCuentaCanalesResponse.class)
    public JAXBElement<MSNumeroCuenta> createCrearCuentaCanalesResponseCrearCuentaCanalesResult(MSNumeroCuenta value) {
        return new JAXBElement<MSNumeroCuenta>(_CrearCuentaCanalesResponseCrearCuentaCanalesResult_QNAME, MSNumeroCuenta.class, CrearCuentaCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimularAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimularAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meSimular", scope = SimularAhorroProgramado.class)
    public JAXBElement<MESimularAhorro> createSimularAhorroProgramadoMeSimular(MESimularAhorro value) {
        return new JAXBElement<MESimularAhorro>(_SimularAhorroProgramadoMeSimular_QNAME, MESimularAhorro.class, SimularAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimularAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimularAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SimularAhorroProgramadoResult", scope = SimularAhorroProgramadoResponse.class)
    public JAXBElement<MSSimularAhorro> createSimularAhorroProgramadoResponseSimularAhorroProgramadoResult(MSSimularAhorro value) {
        return new JAXBElement<MSSimularAhorro>(_SimularAhorroProgramadoResponseSimularAhorroProgramadoResult_QNAME, MSSimularAhorro.class, SimularAhorroProgramadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAperturaAhorro", scope = AperturaAhorroProgramado.class)
    public JAXBElement<MEAperturaAhorroProgramado> createAperturaAhorroProgramadoMeAperturaAhorro(MEAperturaAhorroProgramado value) {
        return new JAXBElement<MEAperturaAhorroProgramado>(_AperturaAhorroProgramadoMeAperturaAhorro_QNAME, MEAperturaAhorroProgramado.class, AperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSAperturaAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSAperturaAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AperturaAhorroProgramadoResult", scope = AperturaAhorroProgramadoResponse.class)
    public JAXBElement<MSAperturaAhorroProgramado> createAperturaAhorroProgramadoResponseAperturaAhorroProgramadoResult(MSAperturaAhorroProgramado value) {
        return new JAXBElement<MSAperturaAhorroProgramado>(_AperturaAhorroProgramadoResponseAperturaAhorroProgramadoResult_QNAME, MSAperturaAhorroProgramado.class, AperturaAhorroProgramadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosRenovacion", scope = RenovarAhorroProgramado.class)
    public JAXBElement<MERenovacionAhorro> createRenovarAhorroProgramadoMeDatosRenovacion(MERenovacionAhorro value) {
        return new JAXBElement<MERenovacionAhorro>(_RenovarAhorroProgramadoMeDatosRenovacion_QNAME, MERenovacionAhorro.class, RenovarAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RenovarAhorroProgramadoResult", scope = RenovarAhorroProgramadoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRenovarAhorroProgramadoResponseRenovarAhorroProgramadoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RenovarAhorroProgramadoResponseRenovarAhorroProgramadoResult_QNAME, MensajeSalidaBase.class, RenovarAhorroProgramadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosRenovacion", scope = ActualizarAhorroProgramado.class)
    public JAXBElement<MERenovacionAhorro> createActualizarAhorroProgramadoMeDatosRenovacion(MERenovacionAhorro value) {
        return new JAXBElement<MERenovacionAhorro>(_RenovarAhorroProgramadoMeDatosRenovacion_QNAME, MERenovacionAhorro.class, ActualizarAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarAhorroProgramadoResult", scope = ActualizarAhorroProgramadoResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarAhorroProgramadoResponseActualizarAhorroProgramadoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarAhorroProgramadoResponseActualizarAhorroProgramadoResult_QNAME, MensajeSalidaBase.class, ActualizarAhorroProgramadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosCliente", scope = ConsultarCrearCuentaCliente.class)
    public JAXBElement<MECreacionCliente> createConsultarCrearCuentaClienteMeDatosCliente(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_ConsultarCrearCuentaClienteMeDatosCliente_QNAME, MECreacionCliente.class, ConsultarCrearCuentaCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarCrearCuentaClienteResult", scope = ConsultarCrearCuentaClienteResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createConsultarCrearCuentaClienteResponseConsultarCrearCuentaClienteResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_ConsultarCrearCuentaClienteResponseConsultarCrearCuentaClienteResult_QNAME, MSConsultasCtaAhorros.class, ConsultarCrearCuentaClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoSpi }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePago", scope = RegistrarPagoSpi.class)
    public JAXBElement<MEPagoSpi> createRegistrarPagoSpiMePago(MEPagoSpi value) {
        return new JAXBElement<MEPagoSpi>(_RegistrarPagoSpiMePago_QNAME, MEPagoSpi.class, RegistrarPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarPagoSpiResult", scope = RegistrarPagoSpiResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarPagoSpiResponseRegistrarPagoSpiResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarPagoSpiResponseRegistrarPagoSpiResult_QNAME, MensajeSalidaBase.class, RegistrarPagoSpiResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXml.Xmlstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXml.Xmlstring }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "xmlstring", scope = EjecutarTransaccionCanalesXml.class)
    public JAXBElement<EjecutarTransaccionCanalesXml.Xmlstring> createEjecutarTransaccionCanalesXmlXmlstring(EjecutarTransaccionCanalesXml.Xmlstring value) {
        return new JAXBElement<EjecutarTransaccionCanalesXml.Xmlstring>(_EjecutarTransaccionCanalesXmlXmlstring_QNAME, EjecutarTransaccionCanalesXml.Xmlstring.class, EjecutarTransaccionCanalesXml.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EjecutarTransaccionCanalesXmlResult", scope = EjecutarTransaccionCanalesXmlResponse.class)
    public JAXBElement<EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult> createEjecutarTransaccionCanalesXmlResponseEjecutarTransaccionCanalesXmlResult(EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult value) {
        return new JAXBElement<EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult>(_EjecutarTransaccionCanalesXmlResponseEjecutarTransaccionCanalesXmlResult_QNAME, EjecutarTransaccionCanalesXmlResponse.EjecutarTransaccionCanalesXmlResult.class, EjecutarTransaccionCanalesXmlResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAperturaCuenta", scope = ConsultarOCrearCuentas.class)
    public JAXBElement<MEAperturaCuenta> createConsultarOCrearCuentasMeAperturaCuenta(MEAperturaCuenta value) {
        return new JAXBElement<MEAperturaCuenta>(_ConsultarOCrearCuentasMeAperturaCuenta_QNAME, MEAperturaCuenta.class, ConsultarOCrearCuentas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSAperturaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSAperturaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarOCrearCuentasResult", scope = ConsultarOCrearCuentasResponse.class)
    public JAXBElement<MSAperturaCuenta> createConsultarOCrearCuentasResponseConsultarOCrearCuentasResult(MSAperturaCuenta value) {
        return new JAXBElement<MSAperturaCuenta>(_ConsultarOCrearCuentasResponseConsultarOCrearCuentasResult_QNAME, MSAperturaCuenta.class, ConsultarOCrearCuentasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meLiquidacion", scope = GenerarContratosAhorroRentabilidadRenovados.class)
    public JAXBElement<MensajeEntradaBase> createGenerarContratosAhorroRentabilidadRenovadosMeLiquidacion(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarContratosAhorroRentabilidadRenovadosMeLiquidacion_QNAME, MensajeEntradaBase.class, GenerarContratosAhorroRentabilidadRenovados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarContratosAhorroRentabilidadRenovadosResult", scope = GenerarContratosAhorroRentabilidadRenovadosResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarContratosAhorroRentabilidadRenovadosResponseGenerarContratosAhorroRentabilidadRenovadosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarContratosAhorroRentabilidadRenovadosResponseGenerarContratosAhorroRentabilidadRenovadosResult_QNAME, MensajeSalidaBase.class, GenerarContratosAhorroRentabilidadRenovadosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionPagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionPagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = EjecutarTransaccionPagoServicios.class)
    public JAXBElement<METransaccionPagoServicios> createEjecutarTransaccionPagoServiciosMeTransaccion(METransaccionPagoServicios value) {
        return new JAXBElement<METransaccionPagoServicios>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionPagoServicios.class, EjecutarTransaccionPagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EjecutarTransaccionPagoServiciosResult", scope = EjecutarTransaccionPagoServiciosResponse.class)
    public JAXBElement<MSTransaccionPagoServicios> createEjecutarTransaccionPagoServiciosResponseEjecutarTransaccionPagoServiciosResult(MSTransaccionPagoServicios value) {
        return new JAXBElement<MSTransaccionPagoServicios>(_EjecutarTransaccionPagoServiciosResponseEjecutarTransaccionPagoServiciosResult_QNAME, MSTransaccionPagoServicios.class, EjecutarTransaccionPagoServiciosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = GenerarArchivoPagoServicios.class)
    public JAXBElement<MensajeEntradaBase> createGenerarArchivoPagoServiciosMeConsulta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MensajeEntradaBase.class, GenerarArchivoPagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarArchivoPagoServiciosResult", scope = GenerarArchivoPagoServiciosResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarArchivoPagoServiciosResponseGenerarArchivoPagoServiciosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarArchivoPagoServiciosResponseGenerarArchivoPagoServiciosResult_QNAME, MensajeSalidaBase.class, GenerarArchivoPagoServiciosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldosTarjetasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldosTarjetasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarSaldosTarjetasCreditoCliente.class)
    public JAXBElement<MEConsultaSaldosTarjetasCliente> createConsultarSaldosTarjetasCreditoClienteMeConsulta(MEConsultaSaldosTarjetasCliente value) {
        return new JAXBElement<MEConsultaSaldosTarjetasCliente>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEConsultaSaldosTarjetasCliente.class, ConsultarSaldosTarjetasCreditoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosTarjetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosTarjetas }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarSaldosTarjetasCreditoClienteResult", scope = ConsultarSaldosTarjetasCreditoClienteResponse.class)
    public JAXBElement<MSConsultasSaldosTarjetas> createConsultarSaldosTarjetasCreditoClienteResponseConsultarSaldosTarjetasCreditoClienteResult(MSConsultasSaldosTarjetas value) {
        return new JAXBElement<MSConsultasSaldosTarjetas>(_ConsultarSaldosTarjetasCreditoClienteResponseConsultarSaldosTarjetasCreditoClienteResult_QNAME, MSConsultasSaldosTarjetas.class, ConsultarSaldosTarjetasCreditoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePago", scope = ProcesarPagoTarjetaCredito.class)
    public JAXBElement<MEPagoTarjeta> createProcesarPagoTarjetaCreditoMePago(MEPagoTarjeta value) {
        return new JAXBElement<MEPagoTarjeta>(_RegistrarPagoSpiMePago_QNAME, MEPagoTarjeta.class, ProcesarPagoTarjetaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarPagoTarjetaCreditoResult", scope = ProcesarPagoTarjetaCreditoResponse.class)
    public JAXBElement<MSPagoTarjeta> createProcesarPagoTarjetaCreditoResponseProcesarPagoTarjetaCreditoResult(MSPagoTarjeta value) {
        return new JAXBElement<MSPagoTarjeta>(_ProcesarPagoTarjetaCreditoResponseProcesarPagoTarjetaCreditoResult_QNAME, MSPagoTarjeta.class, ProcesarPagoTarjetaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaDatosTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaDatosTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarDatosTarjetaCredito.class)
    public JAXBElement<MEConsultaDatosTarjeta> createConsultarDatosTarjetaCreditoMeConsulta(MEConsultaDatosTarjeta value) {
        return new JAXBElement<MEConsultaDatosTarjeta>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MEConsultaDatosTarjeta.class, ConsultarDatosTarjetaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaDatosTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaDatosTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDatosTarjetaCreditoResult", scope = ConsultarDatosTarjetaCreditoResponse.class)
    public JAXBElement<MSConsultaDatosTarjeta> createConsultarDatosTarjetaCreditoResponseConsultarDatosTarjetaCreditoResult(MSConsultaDatosTarjeta value) {
        return new JAXBElement<MSConsultaDatosTarjeta>(_ConsultarDatosTarjetaCreditoResponseConsultarDatosTarjetaCreditoResult_QNAME, MSConsultaDatosTarjeta.class, ConsultarDatosTarjetaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePago", scope = ProcesarPagoTarjetaCreditoTercero.class)
    public JAXBElement<MEPagoTarjeta> createProcesarPagoTarjetaCreditoTerceroMePago(MEPagoTarjeta value) {
        return new JAXBElement<MEPagoTarjeta>(_RegistrarPagoSpiMePago_QNAME, MEPagoTarjeta.class, ProcesarPagoTarjetaCreditoTercero.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarPagoTarjetaCreditoTerceroResult", scope = ProcesarPagoTarjetaCreditoTerceroResponse.class)
    public JAXBElement<MSPagoTarjeta> createProcesarPagoTarjetaCreditoTerceroResponseProcesarPagoTarjetaCreditoTerceroResult(MSPagoTarjeta value) {
        return new JAXBElement<MSPagoTarjeta>(_ProcesarPagoTarjetaCreditoTerceroResponseProcesarPagoTarjetaCreditoTerceroResult_QNAME, MSPagoTarjeta.class, ProcesarPagoTarjetaCreditoTerceroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCobranzas", scope = ProcesarPagosCobranzasTarjetas.class)
    public JAXBElement<MensajeEntradaBase> createProcesarPagosCobranzasTarjetasMeCobranzas(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ProcesarPagosCobranzasTarjetasMeCobranzas_QNAME, MensajeEntradaBase.class, ProcesarPagosCobranzasTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarPagosCobranzasTarjetasResult", scope = ProcesarPagosCobranzasTarjetasResponse.class)
    public JAXBElement<MensajeSalidaBase> createProcesarPagosCobranzasTarjetasResponseProcesarPagosCobranzasTarjetasResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ProcesarPagosCobranzasTarjetasResponseProcesarPagosCobranzasTarjetasResult_QNAME, MensajeSalidaBase.class, ProcesarPagosCobranzasTarjetasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = EjecutarTransaccionCorresponsales.class)
    public JAXBElement<METransaccionCorresponsales> createEjecutarTransaccionCorresponsalesMeTransaccion(METransaccionCorresponsales value) {
        return new JAXBElement<METransaccionCorresponsales>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionCorresponsales.class, EjecutarTransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EjecutarTransaccionCorresponsalesResult", scope = EjecutarTransaccionCorresponsalesResponse.class)
    public JAXBElement<MSTransaccionCorresponsales> createEjecutarTransaccionCorresponsalesResponseEjecutarTransaccionCorresponsalesResult(MSTransaccionCorresponsales value) {
        return new JAXBElement<MSTransaccionCorresponsales>(_EjecutarTransaccionCorresponsalesResponseEjecutarTransaccionCorresponsalesResult_QNAME, MSTransaccionCorresponsales.class, EjecutarTransaccionCorresponsalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarMovimientosCorresponsales.class)
    public JAXBElement<METransaccionCorresponsales> createConsultarMovimientosCorresponsalesMeConsulta(METransaccionCorresponsales value) {
        return new JAXBElement<METransaccionCorresponsales>(_ConsultarCertificadosAportacionMeConsulta_QNAME, METransaccionCorresponsales.class, ConsultarMovimientosCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaMovimientosCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaMovimientosCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarMovimientosCorresponsalesResult", scope = ConsultarMovimientosCorresponsalesResponse.class)
    public JAXBElement<MSConsultaMovimientosCorresponsales> createConsultarMovimientosCorresponsalesResponseConsultarMovimientosCorresponsalesResult(MSConsultaMovimientosCorresponsales value) {
        return new JAXBElement<MSConsultaMovimientosCorresponsales>(_ConsultarMovimientosCorresponsalesResponseConsultarMovimientosCorresponsalesResult_QNAME, MSConsultaMovimientosCorresponsales.class, ConsultarMovimientosCorresponsalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ValidarCuentaTransaccionCorresponsales.class)
    public JAXBElement<METransaccionCorresponsales> createValidarCuentaTransaccionCorresponsalesMeConsulta(METransaccionCorresponsales value) {
        return new JAXBElement<METransaccionCorresponsales>(_ConsultarCertificadosAportacionMeConsulta_QNAME, METransaccionCorresponsales.class, ValidarCuentaTransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarCuentaTransaccionCorresponsalesResult", scope = ValidarCuentaTransaccionCorresponsalesResponse.class)
    public JAXBElement<MSConsultasDatosCuenta> createValidarCuentaTransaccionCorresponsalesResponseValidarCuentaTransaccionCorresponsalesResult(MSConsultasDatosCuenta value) {
        return new JAXBElement<MSConsultasDatosCuenta>(_ValidarCuentaTransaccionCorresponsalesResponseValidarCuentaTransaccionCorresponsalesResult_QNAME, MSConsultasDatosCuenta.class, ValidarCuentaTransaccionCorresponsalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = CompensarTransaccionCorresponsales.class)
    public JAXBElement<METransaccionCorresponsales> createCompensarTransaccionCorresponsalesMeTransaccion(METransaccionCorresponsales value) {
        return new JAXBElement<METransaccionCorresponsales>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionCorresponsales.class, CompensarTransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CompensarTransaccionCorresponsalesResult", scope = CompensarTransaccionCorresponsalesResponse.class)
    public JAXBElement<MSTransaccionCorresponsales> createCompensarTransaccionCorresponsalesResponseCompensarTransaccionCorresponsalesResult(MSTransaccionCorresponsales value) {
        return new JAXBElement<MSTransaccionCorresponsales>(_CompensarTransaccionCorresponsalesResponseCompensarTransaccionCorresponsalesResult_QNAME, MSTransaccionCorresponsales.class, CompensarTransaccionCorresponsalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = GenerarArchivoCorresponsalesTrxPropias.class)
    public JAXBElement<MensajeEntradaBase> createGenerarArchivoCorresponsalesTrxPropiasMeConsulta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MensajeEntradaBase.class, GenerarArchivoCorresponsalesTrxPropias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarArchivoCorresponsalesTrxPropiasResult", scope = GenerarArchivoCorresponsalesTrxPropiasResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarArchivoCorresponsalesTrxPropiasResponseGenerarArchivoCorresponsalesTrxPropiasResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarArchivoCorresponsalesTrxPropiasResponseGenerarArchivoCorresponsalesTrxPropiasResult_QNAME, MensajeSalidaBase.class, GenerarArchivoCorresponsalesTrxPropiasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = GenerarArchivoCorresponsalesTrxTerceros.class)
    public JAXBElement<MensajeEntradaBase> createGenerarArchivoCorresponsalesTrxTercerosMeConsulta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MensajeEntradaBase.class, GenerarArchivoCorresponsalesTrxTerceros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarArchivoCorresponsalesTrxTercerosResult", scope = GenerarArchivoCorresponsalesTrxTercerosResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarArchivoCorresponsalesTrxTercerosResponseGenerarArchivoCorresponsalesTrxTercerosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarArchivoCorresponsalesTrxTercerosResponseGenerarArchivoCorresponsalesTrxTercerosResult_QNAME, MensajeSalidaBase.class, GenerarArchivoCorresponsalesTrxTercerosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "entrada", scope = GuardarDocumentoCanales.class)
    public JAXBElement<MEDocumentosCuenta> createGuardarDocumentoCanalesEntrada(MEDocumentosCuenta value) {
        return new JAXBElement<MEDocumentosCuenta>(_GuardarDocumentoCanalesEntrada_QNAME, MEDocumentosCuenta.class, GuardarDocumentoCanales.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meValidacionCuenta", scope = ValidarAprobarCuentaCanales.class)
    public JAXBElement<MEConsultaCuenta> createValidarAprobarCuentaCanalesMeValidacionCuenta(MEConsultaCuenta value) {
        return new JAXBElement<MEConsultaCuenta>(_ValidarAprobarCuentaCanalesMeValidacionCuenta_QNAME, MEConsultaCuenta.class, ValidarAprobarCuentaCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarAprobarCuentaCanalesResult", scope = ValidarAprobarCuentaCanalesResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarAprobarCuentaCanalesResponseValidarAprobarCuentaCanalesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarAprobarCuentaCanalesResponseValidarAprobarCuentaCanalesResult_QNAME, MensajeSalidaBase.class, ValidarAprobarCuentaCanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = EnviarDocumentosCuenta.class)
    public JAXBElement<MEDocumentosCuenta> createEnviarDocumentosCuentaMeCuenta(MEDocumentosCuenta value) {
        return new JAXBElement<MEDocumentosCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEDocumentosCuenta.class, EnviarDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EnviarDocumentosCuentaResult", scope = EnviarDocumentosCuentaResponse.class)
    public JAXBElement<MensajeSalidaBase> createEnviarDocumentosCuentaResponseEnviarDocumentosCuentaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EnviarDocumentosCuentaResponseEnviarDocumentosCuentaResult_QNAME, MensajeSalidaBase.class, EnviarDocumentosCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = RegistrarControlImpuestoTarjetaCredito.class)
    public JAXBElement<MensajeEntradaBase> createRegistrarControlImpuestoTarjetaCreditoMeConsulta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_ConsultarCertificadosAportacionMeConsulta_QNAME, MensajeEntradaBase.class, RegistrarControlImpuestoTarjetaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarControlImpuestoTarjetaCreditoResult", scope = RegistrarControlImpuestoTarjetaCreditoResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarControlImpuestoTarjetaCreditoResponseRegistrarControlImpuestoTarjetaCreditoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarControlImpuestoTarjetaCreditoResponseRegistrarControlImpuestoTarjetaCreditoResult_QNAME, MensajeSalidaBase.class, RegistrarControlImpuestoTarjetaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCrearCuenta", scope = AperturarCuentaAhorros.class)
    public JAXBElement<MECrearCuenta> createAperturarCuentaAhorrosMeCrearCuenta(MECrearCuenta value) {
        return new JAXBElement<MECrearCuenta>(_CrearCuentaCanalesMeCrearCuenta_QNAME, MECrearCuenta.class, AperturarCuentaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "AperturarCuentaAhorrosResult", scope = AperturarCuentaAhorrosResponse.class)
    public JAXBElement<MSNumeroCuenta> createAperturarCuentaAhorrosResponseAperturarCuentaAhorrosResult(MSNumeroCuenta value) {
        return new JAXBElement<MSNumeroCuenta>(_AperturarCuentaAhorrosResponseAperturarCuentaAhorrosResult_QNAME, MSNumeroCuenta.class, AperturarCuentaAhorrosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = RegistrarRestriccionCliente.class)
    public JAXBElement<MEIdentificacionCliente> createRegistrarRestriccionClienteMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, RegistrarRestriccionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarRestriccionClienteResult", scope = RegistrarRestriccionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarRestriccionClienteResponseRegistrarRestriccionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarRestriccionClienteResponseRegistrarRestriccionClienteResult_QNAME, MensajeSalidaBase.class, RegistrarRestriccionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = ConsultarRestriccionCliente.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarRestriccionClienteMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, ConsultarRestriccionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarRestriccionClienteResult", scope = ConsultarRestriccionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createConsultarRestriccionClienteResponseConsultarRestriccionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ConsultarRestriccionClienteResponseConsultarRestriccionClienteResult_QNAME, MensajeSalidaBase.class, ConsultarRestriccionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCredito", scope = ValidarCuentaNotaCredito.class)
    public JAXBElement<MENdNc> createValidarCuentaNotaCreditoMeCredito(MENdNc value) {
        return new JAXBElement<MENdNc>(_GenerarNotaCreditoMeCredito_QNAME, MENdNc.class, ValidarCuentaNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarCuentaNotaCreditoResult", scope = ValidarCuentaNotaCreditoResponse.class)
    public JAXBElement<MSNumeroCuenta> createValidarCuentaNotaCreditoResponseValidarCuentaNotaCreditoResult(MSNumeroCuenta value) {
        return new JAXBElement<MSNumeroCuenta>(_ValidarCuentaNotaCreditoResponseValidarCuentaNotaCreditoResult_QNAME, MSNumeroCuenta.class, ValidarCuentaNotaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ConsultarDetalleTransaccionRecibida.class)
    public JAXBElement<MEConsultasMovimientos> createConsultarDetalleTransaccionRecibidaMeCuenta(MEConsultasMovimientos value) {
        return new JAXBElement<MEConsultasMovimientos>(_ConsultarInformacionClienteMeCuenta_QNAME, MEConsultasMovimientos.class, ConsultarDetalleTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionRecibida }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionRecibida }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDetalleTransaccionRecibidaResult", scope = ConsultarDetalleTransaccionRecibidaResponse.class)
    public JAXBElement<MSTransaccionRecibida> createConsultarDetalleTransaccionRecibidaResponseConsultarDetalleTransaccionRecibidaResult(MSTransaccionRecibida value) {
        return new JAXBElement<MSTransaccionRecibida>(_ConsultarDetalleTransaccionRecibidaResponseConsultarDetalleTransaccionRecibidaResult_QNAME, MSTransaccionRecibida.class, ConsultarDetalleTransaccionRecibidaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = ProcesarDeposito.class)
    public JAXBElement<METransaccionKisko> createProcesarDepositoMeTransaccion(METransaccionKisko value) {
        return new JAXBElement<METransaccionKisko>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionKisko.class, ProcesarDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarDepositoResult", scope = ProcesarDepositoResponse.class)
    public JAXBElement<MSTransaccionKiosko> createProcesarDepositoResponseProcesarDepositoResult(MSTransaccionKiosko value) {
        return new JAXBElement<MSTransaccionKiosko>(_ProcesarDepositoResponseProcesarDepositoResult_QNAME, MSTransaccionKiosko.class, ProcesarDepositoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meTransaccion", scope = ProcesarRetiro.class)
    public JAXBElement<METransaccionKisko> createProcesarRetiroMeTransaccion(METransaccionKisko value) {
        return new JAXBElement<METransaccionKisko>(_EjecutarTransaccionTarjetaDebitoMeTransaccion_QNAME, METransaccionKisko.class, ProcesarRetiro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ProcesarRetiroResult", scope = ProcesarRetiroResponse.class)
    public JAXBElement<MSTransaccionKiosko> createProcesarRetiroResponseProcesarRetiroResult(MSTransaccionKiosko value) {
        return new JAXBElement<MSTransaccionKiosko>(_ProcesarRetiroResponseProcesarRetiroResult_QNAME, MSTransaccionKiosko.class, ProcesarRetiroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = ReimprimirContratoCliente.class)
    public JAXBElement<MEIdentificacionCliente> createReimprimirContratoClienteMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, ReimprimirContratoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ReimprimirContratoClienteResult", scope = ReimprimirContratoClienteResponse.class)
    public JAXBElement<MSDocumentoCuenta> createReimprimirContratoClienteResponseReimprimirContratoClienteResult(MSDocumentoCuenta value) {
        return new JAXBElement<MSDocumentoCuenta>(_ReimprimirContratoClienteResponseReimprimirContratoClienteResult_QNAME, MSDocumentoCuenta.class, ReimprimirContratoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaTransferencias", scope = ConsultarTransferenciasSPICanales.class)
    public JAXBElement<MEConsultaTransferenciasSPI> createConsultarTransferenciasSPICanalesMeConsultaTransferencias(MEConsultaTransferenciasSPI value) {
        return new JAXBElement<MEConsultaTransferenciasSPI>(_ConsultarTransferenciasSPICanalesMeConsultaTransferencias_QNAME, MEConsultaTransferenciasSPI.class, ConsultarTransferenciasSPICanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaTransferenciasSPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaTransferenciasSPI }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarTransferenciasSPICanalesResult", scope = ConsultarTransferenciasSPICanalesResponse.class)
    public JAXBElement<MSConsultaTransferenciasSPI> createConsultarTransferenciasSPICanalesResponseConsultarTransferenciasSPICanalesResult(MSConsultaTransferenciasSPI value) {
        return new JAXBElement<MSConsultaTransferenciasSPI>(_ConsultarTransferenciasSPICanalesResponseConsultarTransferenciasSPICanalesResult_QNAME, MSConsultaTransferenciasSPI.class, ConsultarTransferenciasSPICanalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEstadosCuenta", scope = GenerarEstadosCuenta.class)
    public JAXBElement<MensajeEntradaBase> createGenerarEstadosCuentaMeEstadosCuenta(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_GenerarEstadosCuentaMeEstadosCuenta_QNAME, MensajeEntradaBase.class, GenerarEstadosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarEstadosCuentaResult", scope = GenerarEstadosCuentaResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarEstadosCuentaResponseGenerarEstadosCuentaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarEstadosCuentaResponseGenerarEstadosCuentaResult_QNAME, MensajeSalidaBase.class, GenerarEstadosCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCliente", scope = DevolverCuentaParaCredito.class)
    public JAXBElement<MEIdentificacionCliente> createDevolverCuentaParaCreditoMeCliente(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarCuentaAhorrosMeCliente_QNAME, MEIdentificacionCliente.class, DevolverCuentaParaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "DevolverCuentaParaCreditoResult", scope = DevolverCuentaParaCreditoResponse.class)
    public JAXBElement<MSConsultasCtaAhorros> createDevolverCuentaParaCreditoResponseDevolverCuentaParaCreditoResult(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_DevolverCuentaParaCreditoResponseDevolverCuentaParaCreditoResult_QNAME, MSConsultasCtaAhorros.class, DevolverCuentaParaCreditoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = CargarDocumentosCuenta.class)
    public JAXBElement<MEContratoCuenta> createCargarDocumentosCuentaMeCuenta(MEContratoCuenta value) {
        return new JAXBElement<MEContratoCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEContratoCuenta.class, CargarDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CargarDocumentosCuentaResult", scope = CargarDocumentosCuentaResponse.class)
    public JAXBElement<MensajeSalidaBase> createCargarDocumentosCuentaResponseCargarDocumentosCuentaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CargarDocumentosCuentaResponseCargarDocumentosCuentaResult_QNAME, MensajeSalidaBase.class, CargarDocumentosCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = ReimprimirContratoCuenta.class)
    public JAXBElement<MEContratoCuenta> createReimprimirContratoCuentaMeCuenta(MEContratoCuenta value) {
        return new JAXBElement<MEContratoCuenta>(_ConsultarInformacionClienteMeCuenta_QNAME, MEContratoCuenta.class, ReimprimirContratoCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ReimprimirContratoCuentaResult", scope = ReimprimirContratoCuentaResponse.class)
    public JAXBElement<MSDocumentoCuenta> createReimprimirContratoCuentaResponseReimprimirContratoCuentaResult(MSDocumentoCuenta value) {
        return new JAXBElement<MSDocumentoCuenta>(_ReimprimirContratoCuentaResponseReimprimirContratoCuentaResult_QNAME, MSDocumentoCuenta.class, ReimprimirContratoCuentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEstadoCuentaDigital }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEstadoCuentaDigital }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCuenta", scope = HabilitarEstadoDeCuentaDigital.class)
    public JAXBElement<MEEstadoCuentaDigital> createHabilitarEstadoDeCuentaDigitalMeCuenta(MEEstadoCuentaDigital value) {
        return new JAXBElement<MEEstadoCuentaDigital>(_ConsultarInformacionClienteMeCuenta_QNAME, MEEstadoCuentaDigital.class, HabilitarEstadoDeCuentaDigital.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "HabilitarEstadoDeCuentaDigitalResult", scope = HabilitarEstadoDeCuentaDigitalResponse.class)
    public JAXBElement<MensajeSalidaBase> createHabilitarEstadoDeCuentaDigitalResponseHabilitarEstadoDeCuentaDigitalResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_HabilitarEstadoDeCuentaDigitalResponseHabilitarEstadoDeCuentaDigitalResult_QNAME, MensajeSalidaBase.class, HabilitarEstadoDeCuentaDigitalResponse.class, value);
    }

}
