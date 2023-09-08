
package serviciocuentas.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import serviciocuentas.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import serviciocuentas.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import serviciocuentas.org.datacontract.schemas._2004._07.system_collections.ArrayOfKeyValuePairOfstringstring;


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

    private final static QName _CatalogoItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CatalogoItem");
    private final static QName _CuentaLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaLibreta");
    private final static QName _Cuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Cuenta");
    private final static QName _Interviniente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Interviniente");
    private final static QName _ClienteCondicion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ClienteCondicion");
    private final static QName _DatosSaldos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosSaldos");
    private final static QName _ArrayOfInterviniente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfInterviniente");
    private final static QName _ArrayOfCuentaLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfCuentaLibreta");
    private final static QName _ArrayOfTotalDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfTotalDeposito");
    private final static QName _TotalDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TotalDeposito");
    private final static QName _ArrayOfDatosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfDatosUsuario");
    private final static QName _DatosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosUsuario");
    private final static QName _Cheque_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Cheque");
    private final static QName _MEConsultasCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultasCuenta");
    private final static QName _MSConsultasSaldosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasSaldosCuenta");
    private final static QName _MSConsultasSaldosCuentas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasSaldosCuentas");
    private final static QName _MENdNc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MENdNc");
    private final static QName _NotaDebitoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NotaDebitoCredito");
    private final static QName _MSNotaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSNotaDebito");
    private final static QName _DatosGeneralesCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosGeneralesCuenta");
    private final static QName _ResultadoNdNc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ResultadoNdNc");
    private final static QName _MEReversoNdNc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEReversoNdNc");
    private final static QName _MENdNcAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MENdNcAtm");
    private final static QName _NotaDebitoCreditoAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NotaDebitoCreditoAtm");
    private final static QName _MSNotaDebitoAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSNotaDebitoAtm");
    private final static QName _MSNotaCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSNotaCredito");
    private final static QName _MSConsultasDatosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasDatosCuenta");
    private final static QName _MEConsultasLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultasLibreta");
    private final static QName _MSConsultasLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasLibreta");
    private final static QName _ArrayOfLineaPendienteLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfLineaPendienteLibreta");
    private final static QName _LineaPendienteLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "LineaPendienteLibreta");
    private final static QName _MSPersonalizacionLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSPersonalizacionLibreta");
    private final static QName _MECanjeLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MECanjeLibreta");
    private final static QName _MSCanjeLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSCanjeLibreta");
    private final static QName _MSConsultasCtaAhorros_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasCtaAhorros");
    private final static QName _MSConsultasDatosAdmTarjetas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasDatosAdmTarjetas");
    private final static QName _ArrayOfCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfCuenta");
    private final static QName _MEConsultasMovimientos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultasMovimientos");
    private final static QName _MSConsultasMovimientosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasMovimientosCuenta");
    private final static QName _ArrayOfDatosCuotasAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfDatosCuotasAhorroProgramado");
    private final static QName _DatosCuotasAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosCuotasAhorroProgramado");
    private final static QName _ArrayOfDetalleInteresDiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfDetalleInteresDiario");
    private final static QName _DetalleInteresDiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DetalleInteresDiario");
    private final static QName _ArrayOfMovimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfMovimiento");
    private final static QName _Movimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Movimiento");
    private final static QName _MSConsultasCertificados_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasCertificados");
    private final static QName _ArrayOfCertificadoAportacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfCertificadoAportacion");
    private final static QName _CertificadoAportacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CertificadoAportacion");
    private final static QName _MEConsultaSaldoAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaSaldoAtm");
    private final static QName _MSConsultaSaldoAtm_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultaSaldoAtm");
    private final static QName _METransferenciaSpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransferenciaSpi");
    private final static QName _MSTransferenciaSpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransferenciaSpi");
    private final static QName _ArrayOfBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfBanco");
    private final static QName _Banco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Banco");
    private final static QName _MSDepositos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSDepositos");
    private final static QName _MENotaDC_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MENotaDC");
    private final static QName _MEDatosChequeDevolver_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEDatosChequeDevolver");
    private final static QName _ArrayOfChequeDevuelto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfChequeDevuelto");
    private final static QName _ChequeDevuelto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ChequeDevuelto");
    private final static QName _MEDatosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEDatosUsuario");
    private final static QName _MSDatosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSDatosUsuario");
    private final static QName _MEDatosCheques_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEDatosCheques");
    private final static QName _ArrayOfCheque_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfCheque");
    private final static QName _METransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransferencia");
    private final static QName _METransferenciaPagoDirecto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransferenciaPagoDirecto");
    private final static QName _MSTransferenciaPagoDirecto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransferenciaPagoDirecto");
    private final static QName _MEMonederoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEMonederoElectronico");
    private final static QName _MonederoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MonederoElectronico");
    private final static QName _MSMonederoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSMonederoElectronico");
    private final static QName _METransferenciaMonederoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransferenciaMonederoElectronico");
    private final static QName _MSTransferenciaMonederoElectronico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransferenciaMonederoElectronico");
    private final static QName _METransaccionTarjetaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransaccionTarjetaDebito");
    private final static QName _MSTransaccionTarjetaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionTarjetaDebito");
    private final static QName _MEConsultaTarjetaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaTarjetaDebito");
    private final static QName _MSConsultaTarjetaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultaTarjetaDebito");
    private final static QName _MECompensacionTarjetaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MECompensacionTarjetaDebito");
    private final static QName _METransaccionCanales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransaccionCanales");
    private final static QName _TransaccionCanales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TransaccionCanales");
    private final static QName _MSTransaccionCanales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionCanales");
    private final static QName _MECrearCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MECrearCuenta");
    private final static QName _MSNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSNumeroCuenta");
    private final static QName _MESimularAhorro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MESimularAhorro");
    private final static QName _MSSimularAhorro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSSimularAhorro");
    private final static QName _ArrayOfRespuestaSimulacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfRespuestaSimulacion");
    private final static QName _RespuestaSimulacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "RespuestaSimulacion");
    private final static QName _MEAperturaAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEAperturaAhorroProgramado");
    private final static QName _MSAperturaAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSAperturaAhorroProgramado");
    private final static QName _MERenovacionAhorro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MERenovacionAhorro");
    private final static QName _MEPagoSpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEPagoSpi");
    private final static QName _MEAperturaCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEAperturaCuenta");
    private final static QName _MSAperturaCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSAperturaCuenta");
    private final static QName _METransaccionPagoServicios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransaccionPagoServicios");
    private final static QName _PagoServicios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "PagoServicios");
    private final static QName _MSTransaccionPagoServicios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionPagoServicios");
    private final static QName _MEConsultaSaldosTarjetasCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaSaldosTarjetasCliente");
    private final static QName _MSConsultasSaldosTarjetas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultasSaldosTarjetas");
    private final static QName _ArrayOfTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfTarjeta");
    private final static QName _Tarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Tarjeta");
    private final static QName _MEPagoTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEPagoTarjeta");
    private final static QName _MSPagoTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSPagoTarjeta");
    private final static QName _MEConsultaDatosTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaDatosTarjeta");
    private final static QName _MSConsultaDatosTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultaDatosTarjeta");
    private final static QName _METransaccionCorresponsales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransaccionCorresponsales");
    private final static QName _TransaccionCorresponsales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TransaccionCorresponsales");
    private final static QName _MSTransaccionCorresponsales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionCorresponsales");
    private final static QName _MSConsultaMovimientosCorresponsales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultaMovimientosCorresponsales");
    private final static QName _MEDocumentosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEDocumentosCuenta");
    private final static QName _MEConsultaCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaCuenta");
    private final static QName _MSTransaccionRecibida_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionRecibida");
    private final static QName _METransaccionKisko_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "METransaccionKisko");
    private final static QName _MSTransaccionKiosko_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSTransaccionKiosko");
    private final static QName _MSDocumentoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSDocumentoCuenta");
    private final static QName _MEConsultaTransferenciasSPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEConsultaTransferenciasSPI");
    private final static QName _MSConsultaTransferenciasSPI_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MSConsultaTransferenciasSPI");
    private final static QName _ArrayOfDetalleSpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArrayOfDetalleSpi");
    private final static QName _DetalleSpi_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DetalleSpi");
    private final static QName _MEContratoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEContratoCuenta");
    private final static QName _MEEstadoCuentaDigital_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MEEstadoCuentaDigital");
    private final static QName _DatosGeneralesCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosGeneralesCliente");
    private final static QName _MEConsultasCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEConsultasCliente");
    private final static QName _METelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "METelefono");
    private final static QName _MECreacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MECreacionCliente");
    private final static QName _ArrayOfRedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRedSocial");
    private final static QName _RedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RedSocial");
    private final static QName _ResidenciaFiscal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ResidenciaFiscal");
    private final static QName _ResidenciaFiscalCalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Calle");
    private final static QName _ResidenciaFiscalCiudadResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadResidencia");
    private final static QName _ResidenciaFiscalCodigoCiudadNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoCiudadNacimiento");
    private final static QName _ResidenciaFiscalCodigoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoPais");
    private final static QName _ResidenciaFiscalCodigoPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoPostal");
    private final static QName _ResidenciaFiscalCodigoTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoTipoIdentificacion");
    private final static QName _ResidenciaFiscalDireccionAdicionalReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionAdicionalReferencia");
    private final static QName _ResidenciaFiscalNumeroDomicilio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDomicilio");
    private final static QName _ResidenciaFiscalNumeroIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroIdentificacion");
    private final static QName _ResidenciaFiscalTipoPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoPersona");
    private final static QName _RedSocialCodigoRedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoRedSocial");
    private final static QName _RedSocialObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Observaciones");
    private final static QName _RedSocialUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Usuario");
    private final static QName _DatosGeneralesClienteActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Actividad");
    private final static QName _DatosGeneralesClienteCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Ciudad");
    private final static QName _DatosGeneralesClienteDescripcionEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DescripcionEstadoCivil");
    private final static QName _DatosGeneralesClienteDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Direccion");
    private final static QName _DatosGeneralesClienteEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Email");
    private final static QName _DatosGeneralesClienteEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Estado");
    private final static QName _DatosGeneralesClienteFechaNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaNacimiento");
    private final static QName _DatosGeneralesClienteGenero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Genero");
    private final static QName _DatosGeneralesClienteIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Identificacion");
    private final static QName _DatosGeneralesClienteIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionConyuge");
    private final static QName _DatosGeneralesClienteNombreConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreConyuge");
    private final static QName _DatosGeneralesClienteNombres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nombres");
    private final static QName _DatosGeneralesClienteNumeroCargas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroCargas");
    private final static QName _DatosGeneralesClienteOficinaCreacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OficinaCreacion");
    private final static QName _DatosGeneralesClienteProfesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Profesion");
    private final static QName _DatosGeneralesClienteTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Telefono");
    private final static QName _DatosGeneralesClienteTipoEducacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoEducacion");
    private final static QName _DatosGeneralesClienteTipoEducacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoEducacionConyuge");
    private final static QName _DatosGeneralesClienteTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoIdentificacion");
    private final static QName _DatosGeneralesClienteTipoRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoRelacion");
    private final static QName _DatosGeneralesClienteTipoVivienda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoVivienda");
    private final static QName _DetalleSpiDescripcionEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionEstado");
    private final static QName _DetalleSpiEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Estado");
    private final static QName _DetalleSpiFechaProceso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaProceso");
    private final static QName _DetalleSpiFechaProcesoBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaProcesoBce");
    private final static QName _DetalleSpiFechaTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaTransferencia");
    private final static QName _DetalleSpiNumeroCuentaOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaOrdenante");
    private final static QName _DetalleSpiNumeroCuentaReceptora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaReceptora");
    private final static QName _DetalleSpiNumeroReferenciaBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroReferenciaBce");
    private final static QName _DetalleSpiNumeroReferenciaOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroReferenciaOrdenante");
    private final static QName _DetalleSpiNumeroSecuencialBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroSecuencialBce");
    private final static QName _DetalleSpiResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Resultado");
    private final static QName _TransaccionCorresponsalesCuentaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaCliente");
    private final static QName _TransaccionCorresponsalesCuentaCorresponsal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaCorresponsal");
    private final static QName _TransaccionCorresponsalesCuentaProveedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaProveedor");
    private final static QName _TransaccionCorresponsalesIdLogCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdLogCredito");
    private final static QName _TransaccionCorresponsalesIdLogDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdLogDebito");
    private final static QName _TransaccionCorresponsalesIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionCliente");
    private final static QName _TransaccionCorresponsalesIdentificacionCorresponsal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionCorresponsal");
    private final static QName _TransaccionCorresponsalesNumeroOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroOperacion");
    private final static QName _TransaccionCorresponsalesReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Referencia");
    private final static QName _TransaccionCorresponsalesSecuencialTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "SecuencialTransaccion");
    private final static QName _TransaccionCorresponsalesTipoCuentaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCuentaCliente");
    private final static QName _TransaccionCorresponsalesTipoCuentaCorresponsal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCuentaCorresponsal");
    private final static QName _TransaccionCorresponsalesTipoTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoTransaccion");
    private final static QName _TarjetaIdentificador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Identificador");
    private final static QName _PagoServiciosConceptoTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ConceptoTransaccion");
    private final static QName _TransaccionCanalesCausal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Causal");
    private final static QName _TransaccionCanalesCodigoAdquiriente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoAdquiriente");
    private final static QName _TransaccionCanalesCodigoAutorizador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoAutorizador");
    private final static QName _TransaccionCanalesCodigoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoError");
    private final static QName _TransaccionCanalesCodigoMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoMoneda");
    private final static QName _TransaccionCanalesCodigoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoPais");
    private final static QName _TransaccionCanalesCodigoRedAdq_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoRedAdq");
    private final static QName _TransaccionCanalesCodigoSucursal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoSucursal");
    private final static QName _TransaccionCanalesCodigoTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoTransaccion");
    private final static QName _TransaccionCanalesCuentaCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaCredito");
    private final static QName _TransaccionCanalesCuentaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaDebito");
    private final static QName _TransaccionCanalesDatosTansaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosTansaccion");
    private final static QName _TransaccionCanalesErrorProcesamiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ErrorProcesamiento");
    private final static QName _TransaccionCanalesFechaCaptura_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaCaptura");
    private final static QName _TransaccionCanalesFechaCompensacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaCompensacion");
    private final static QName _TransaccionCanalesFechaContable_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaContable");
    private final static QName _TransaccionCanalesFechaHoraLocal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaHoraLocal");
    private final static QName _TransaccionCanalesFechaHoraTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaHoraTransaccion");
    private final static QName _TransaccionCanalesFechaProcesamiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaProcesamiento");
    private final static QName _TransaccionCanalesIdLogCompensacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdLogCompensacion");
    private final static QName _TransaccionCanalesIdLogTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdLogTransaccion");
    private final static QName _TransaccionCanalesLocalizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Localizacion");
    private final static QName _TransaccionCanalesLoginCompensacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "LoginCompensacion");
    private final static QName _TransaccionCanalesLoginRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "LoginRegistro");
    private final static QName _TransaccionCanalesNombreCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreCliente");
    private final static QName _TransaccionCanalesNumeroTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroTarjeta");
    private final static QName _TransaccionCanalesNumeroTerminal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroTerminal");
    private final static QName _TransaccionCanalesRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Respuesta");
    private final static QName _TransaccionCanalesTipoMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoMensaje");
    private final static QName _MonederoElectronicoEmailCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "EmailCliente");
    private final static QName _MonederoElectronicoIdCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdCuenta");
    private final static QName _MonederoElectronicoIdOperadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdOperadora");
    private final static QName _MonederoElectronicoIdTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdTelefono");
    private final static QName _MonederoElectronicoNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuenta");
    private final static QName _MonederoElectronicoNumeroTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroTelefono");
    private final static QName _MonederoElectronicoOperadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Operadora");
    private final static QName _MonederoElectronicoOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Otp");
    private final static QName _MonederoElectronicoTipoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCuenta");
    private final static QName _ChequeDevueltoCuentaCheque_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaCheque");
    private final static QName _ChequeDevueltoNumeroPapeleta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroPapeleta");
    private final static QName _CatalogoItemCodigoNegocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigoNegocio");
    private final static QName _CatalogoItemCodigoNegocioPadre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigoNegocioPadre");
    private final static QName _CatalogoItemCodigosNegocioNiveles_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigosNegocioNiveles");
    private final static QName _CatalogoItemDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Descripcion");
    private final static QName _CatalogoItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Id");
    private final static QName _CatalogoItemIdCodigoPadre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdCodigoPadre");
    private final static QName _CatalogoItemNivelSeleccionado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NivelSeleccionado");
    private final static QName _CatalogoItemParametro1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro1");
    private final static QName _CatalogoItemParametro4_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro4");
    private final static QName _CatalogoItemParametro5_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro5");
    private final static QName _CatalogoItemUltimoNivel_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "UltimoNivel");
    private final static QName _CatalogoItemVigente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Vigente");
    private final static QName _BancoCodigoBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoBce");
    private final static QName _CertificadoAportacionNumero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Numero");
    private final static QName _CertificadoAportacionTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Tipo");
    private final static QName _MovimientoComprobante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Comprobante");
    private final static QName _MovimientoFechaRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaRegistro");
    private final static QName _MovimientoHoraRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "HoraRegistro");
    private final static QName _MovimientoNombreCausal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreCausal");
    private final static QName _MovimientoNombreOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreOficina");
    private final static QName _MovimientoNombreTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreTransaccion");
    private final static QName _MovimientoOficinaOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "OficinaOrigen");
    private final static QName _MovimientoReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Referencia2");
    private final static QName _MovimientoReversada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Reversada");
    private final static QName _MovimientoReverso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Reverso");
    private final static QName _MovimientoSucursal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Sucursal");
    private final static QName _MovimientoSufijoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "SufijoCuenta");
    private final static QName _MovimientoTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Transaccion");
    private final static QName _MovimientoUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Usuario");
    private final static QName _DetalleInteresDiarioFechaDesde_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaDesde");
    private final static QName _DetalleInteresDiarioFechaHasta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaHasta");
    private final static QName _DetalleInteresDiarioIdPadre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdPadre");
    private final static QName _DatosCuotasAhorroProgramadoEstadoCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "EstadoCuota");
    private final static QName _DatosCuotasAhorroProgramadoFechaPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaPago");
    private final static QName _LineaPendienteLibretaFecha_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Fecha");
    private final static QName _LineaPendienteLibretaNemonico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Nemonico");
    private final static QName _ResultadoNdNcOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Oficina");
    private final static QName _DatosGeneralesCuentaDescripcionSubProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionSubProducto");
    private final static QName _DatosGeneralesCuentaNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Nombre");
    private final static QName _DatosGeneralesCuentaNumeroLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroLibreta");
    private final static QName _DatosGeneralesCuentaOficinaCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "OficinaCuenta");
    private final static QName _DatosGeneralesCuentaTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoIdentificacion");
    private final static QName _NotaDebitoCreditoIdCausalRetencion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdCausalRetencion");
    private final static QName _ChequeCuentaDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaDeposito");
    private final static QName _ChequeDescripcionBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionBanco");
    private final static QName _ChequePapeleta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Papeleta");
    private final static QName _ChequePin_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Pin");
    private final static QName _DatosUsuarioApellidos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Apellidos");
    private final static QName _DatosUsuarioNombreFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreFuncionario");
    private final static QName _DatosUsuarioNombres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Nombres");
    private final static QName _TotalDepositoIdTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdTransaccion");
    private final static QName _TotalDepositoSecuencial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Secuencial");
    private final static QName _TotalDepositoTotalCheques_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TotalCheques");
    private final static QName _TotalDepositoTotalEfectivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TotalEfectivo");
    private final static QName _DatosSaldosFechaRetencion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaRetencion");
    private final static QName _DatosSaldosNombrePromedio1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio1");
    private final static QName _DatosSaldosNombrePromedio2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio2");
    private final static QName _DatosSaldosNombrePromedio3_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio3");
    private final static QName _DatosSaldosNombrePromedio4_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio4");
    private final static QName _DatosSaldosNombrePromedio5_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio5");
    private final static QName _DatosSaldosNombrePromedio6_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedio6");
    private final static QName _DatosSaldosNombrePromedioSemestral_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePromedioSemestral");
    private final static QName _ClienteCondicionCodigoRolCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoRolCliente");
    private final static QName _ClienteCondicionIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Identificacion");
    private final static QName _ClienteCondicionRolCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "RolCliente");
    private final static QName _ClienteCondicionTelefonoSMSCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TelefonoSMSCliente");
    private final static QName _IntervinienteCodigoRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoRol");
    private final static QName _IntervinienteCondicionGiroCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CondicionGiroCliente");
    private final static QName _IntervinienteEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Email");
    private final static QName _IntervinienteNombreRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreRol");
    private final static QName _IntervinienteTelefonoSMS_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TelefonoSMS");
    private final static QName _CuentaAnexoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "AnexoNombre");
    private final static QName _CuentaCampoSib_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CampoSib");
    private final static QName _CuentaCodigoIso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoIso");
    private final static QName _CuentaCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoProducto");
    private final static QName _CuentaCodigoSubproducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoSubproducto");
    private final static QName _CuentaComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Comentario");
    private final static QName _CuentaDescripcionMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionMoneda");
    private final static QName _CuentaFechaApertura_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaApertura");
    private final static QName _CuentaFechaFinAsociacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaFinAsociacion");
    private final static QName _CuentaFechaFinContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaFinContrato");
    private final static QName _CuentaFechaInicioContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaInicioContrato");
    private final static QName _CuentaHistorico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Historico");
    private final static QName _CuentaIdAreaOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdAreaOficial");
    private final static QName _CuentaIdBanca_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdBanca");
    private final static QName _CuentaIdCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdCliente");
    private final static QName _CuentaIdClientePrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdClientePrincipal");
    private final static QName _CuentaIdFilial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdFilial");
    private final static QName _CuentaIdMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdMoneda");
    private final static QName _CuentaIdOficialAdministrador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdOficialAdministrador");
    private final static QName _CuentaIdOficinaOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdOficinaOficial");
    private final static QName _CuentaIdProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdProducto");
    private final static QName _CuentaIdSectorBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdSectorBce");
    private final static QName _CuentaIdSubproducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdSubproducto");
    private final static QName _CuentaIdSucursal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdSucursal");
    private final static QName _CuentaMensajeAdvertencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MensajeAdvertencia");
    private final static QName _CuentaMensajeRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MensajeRespuesta");
    private final static QName _CuentaNombreEstadoCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreEstadoCuenta");
    private final static QName _CuentaNombreOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreOficial");
    private final static QName _CuentaNombreProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreProducto");
    private final static QName _CuentaPersonalizada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Personalizada");
    private final static QName _CuentaPrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Principal");
    private final static QName _CuentaRestringida_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Restringida");
    private final static QName _CuentaUsuarioAsociacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "UsuarioAsociacion");
    private final static QName _CuentaUsuarioFinAsociacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "UsuarioFinAsociacion");
    private final static QName _CuentaZonaOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ZonaOficial");
    private final static QName _CuentaLibretaApellidTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ApellidTitular");
    private final static QName _CuentaLibretaAprobacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Aprobacion");
    private final static QName _CuentaLibretaAprobador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Aprobador");
    private final static QName _CuentaLibretaBloqueada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Bloqueada");
    private final static QName _CuentaLibretaBloqueo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Bloqueo");
    private final static QName _CuentaLibretaBloqueoEjecutivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "BloqueoEjecutivo");
    private final static QName _CuentaLibretaClienteCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ClienteCuenta");
    private final static QName _CuentaLibretaCodigoNegocioAsesor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoNegocioAsesor");
    private final static QName _CuentaLibretaCodigoNegocioRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoNegocioRol");
    private final static QName _CuentaLibretaCodigoTipoCondicionGiro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoTipoCondicionGiro");
    private final static QName _CuentaLibretaCuentaAsociada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaAsociada");
    private final static QName _CuentaLibretaDatosSaldosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosSaldosCuenta");
    private final static QName _CuentaLibretaDescripcionSucursal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionSucursal");
    private final static QName _CuentaLibretaDescripcionTipoBloqueo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionTipoBloqueo");
    private final static QName _CuentaLibretaEstadoContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "EstadoContrato");
    private final static QName _CuentaLibretaEstadoLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "EstadoLibreta");
    private final static QName _CuentaLibretaFechaUltimoMovimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaUltimoMovimiento");
    private final static QName _CuentaLibretaIdCuentaAsociada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdCuentaAsociada");
    private final static QName _CuentaLibretaIntervinientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Intervinientes");
    private final static QName _CuentaLibretaMontoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MontoMensual");
    private final static QName _CuentaLibretaNombreMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreMoneda");
    private final static QName _CuentaLibretaNombreTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreTitular");
    private final static QName _CuentaLibretaPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Plazo");
    private final static QName _CuentaLibretaRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Rol");
    private final static QName _CuentaLibretaSimbolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Simbolo");
    private final static QName _CuentaLibretaTextoManejaLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TextoManejaLibreta");
    private final static QName _CuentaLibretaTipoAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoAhorroProgramado");
    private final static QName _CuentaLibretaTipoBloqueo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoBloqueo");
    private final static QName _CuentaLibretaTipoCondicionGiro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCondicionGiro");
    private final static QName _MEContratoCuentaArchivoFormatoPdfBase64_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ArchivoFormatoPdfBase64");
    private final static QName _MSConsultaTransferenciasSPIResultadoTransferencias_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ResultadoTransferencias");
    private final static QName _MSDocumentoCuentaArchivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Archivo");
    private final static QName _METransaccionKiskoFormaValidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FormaValidacion");
    private final static QName _METransaccionKiskoIdentificacionPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionPersona");
    private final static QName _METransaccionKiskoNombrePersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombrePersona");
    private final static QName _MSTransaccionRecibidaCuentaOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuentaOrdenante");
    private final static QName _MSTransaccionRecibidaIdentificacionOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionOrdenante");
    private final static QName _MSTransaccionRecibidaInstitucionOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "InstitucionOrdenante");
    private final static QName _MSTransaccionRecibidaNombreOrdenante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreOrdenante");
    private final static QName _MSTransaccionRecibidaNumeroReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroReferencia");
    private final static QName _MSTransaccionRecibidaSecuencialReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "SecuencialReferencia");
    private final static QName _MEDocumentosCuentaCodigoQr_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoQr");
    private final static QName _MEDocumentosCuentaFirmaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FirmaCliente");
    private final static QName _MEDocumentosCuentaTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoDocumento");
    private final static QName _MSConsultaMovimientosCorresponsalesMovimientos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Movimientos");
    private final static QName _MSConsultaMovimientosCorresponsalesSaldos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Saldos");
    private final static QName _MSPagoTarjetaNumeroTarjetaId_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroTarjetaId");
    private final static QName _MSConsultasSaldosTarjetasTarjetas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Tarjetas");
    private final static QName _MSAperturaCuentaCuentas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Cuentas");
    private final static QName _MSAperturaCuentaDocumentosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DocumentosCuenta");
    private final static QName _MEAperturaCuentaFoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Foto");
    private final static QName _MEPagoSpiCodigoBceBancoBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoBceBancoBeneficiario");
    private final static QName _MEPagoSpiIdentificacionBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionBeneficiario");
    private final static QName _MEPagoSpiNombreBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreBeneficiario");
    private final static QName _MEPagoSpiNumeroCuentaBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaBeneficiario");
    private final static QName _MEPagoSpiTipoCuentaBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCuentaBeneficiario");
    private final static QName _MEPagoSpiTipoIdentificacionBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoIdentificacionBeneficiario");
    private final static QName _MECreacionClienteActividadEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomica");
    private final static QName _MECreacionClienteActividadEconomicaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomicaEmpresa");
    private final static QName _MECreacionClienteCallePrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CallePrincipal");
    private final static QName _MECreacionClienteCallePrincipalTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CallePrincipalTrabajo");
    private final static QName _MECreacionClienteCalleTransversal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CalleTransversal");
    private final static QName _MECreacionClienteCalleTransversalTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CalleTransversalTrabajo");
    private final static QName _MECreacionClienteCantonDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CantonDireccion");
    private final static QName _MECreacionClienteCantonDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CantonDireccionTrabajo");
    private final static QName _MECreacionClienteCargoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CargoEmpresa");
    private final static QName _MECreacionClienteCiudadDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadDireccion");
    private final static QName _MECreacionClienteCiudadDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadDireccionTrabajo");
    private final static QName _MECreacionClienteCodigoEtnia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoEtnia");
    private final static QName _MECreacionClienteCodigoOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoOficial");
    private final static QName _MECreacionClienteDireccionReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionReferencia");
    private final static QName _MECreacionClienteDireccionReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionReferencia2");
    private final static QName _MECreacionClienteEgresoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EgresoMensual");
    private final static QName _MECreacionClienteEstudios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Estudios");
    private final static QName _MECreacionClienteIdentificacionPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionPareja");
    private final static QName _MECreacionClienteIngresoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IngresoMensual");
    private final static QName _MECreacionClienteNacionalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nacionalidad");
    private final static QName _MECreacionClienteNombreEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreEmpresa");
    private final static QName _MECreacionClienteNombreReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreReferencia");
    private final static QName _MECreacionClienteNombreReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreReferencia2");
    private final static QName _MECreacionClienteNombresPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombresPareja");
    private final static QName _MECreacionClienteNumeroDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDireccion");
    private final static QName _MECreacionClienteNumeroDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDireccionTrabajo");
    private final static QName _MECreacionClientePais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Pais");
    private final static QName _MECreacionClienteParentescoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParentescoReferencia");
    private final static QName _MECreacionClienteParentescoReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParentescoReferencia2");
    private final static QName _MECreacionClienteParroquiaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParroquiaDireccion");
    private final static QName _MECreacionClienteParroquiaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParroquiaDireccionTrabajo");
    private final static QName _MECreacionClientePatromonioInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PatromonioInicial");
    private final static QName _MECreacionClientePrimerApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PrimerApellido");
    private final static QName _MECreacionClientePrimerApellidoPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PrimerApellidoPareja");
    private final static QName _MECreacionClienteProductoInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProductoInicial");
    private final static QName _MECreacionClienteProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Provincia");
    private final static QName _MECreacionClienteProvinciaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProvinciaDireccion");
    private final static QName _MECreacionClienteProvinciaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProvinciaDireccionTrabajo");
    private final static QName _MECreacionClienteRedesSociales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RedesSociales");
    private final static QName _MECreacionClienteReferenciaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciaDireccion");
    private final static QName _MECreacionClienteReferenciaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciaDireccionTrabajo");
    private final static QName _MECreacionClienteSegundoApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "SegundoApellido");
    private final static QName _MECreacionClienteSegundoApellidoPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "SegundoApellidoPareja");
    private final static QName _MECreacionClienteTelefonoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoReferencia");
    private final static QName _MECreacionClienteTelefonoReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoReferencia2");
    private final static QName _MECreacionClienteTelefonoSms_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoSms");
    private final static QName _MECreacionClienteTelefonoTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoTrabajo");
    private final static QName _MECreacionClienteTipoActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoActividad");
    private final static QName _MERenovacionAhorroCodigoVerificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoVerificacion");
    private final static QName _MEAperturaAhorroProgramadoIdCuentaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdCuentaDebito");
    private final static QName _MEAperturaAhorroProgramadoIdSubProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdSubProducto");
    private final static QName _MEAperturaAhorroProgramadoMontoReserva_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MontoReserva");
    private final static QName _MSSimularAhorroResultados_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Resultados");
    private final static QName _MESimularAhorroFechaInicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "FechaInicio");
    private final static QName _MECrearCuentaCodigoOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoOficial");
    private final static QName _METelefonoCodigoArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoArea");
    private final static QName _METelefonoCodigoRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoRegion");
    private final static QName _METelefonoExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Extension");
    private final static QName _METelefonoIdTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTelefono");
    private final static QName _METelefonoNumeroTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroTelefono");
    private final static QName _METelefonoTipoTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoTelefono");
    private final static QName _MECompensacionTarjetaDebitoIdentificadorAdquiriente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificadorAdquiriente");
    private final static QName _MECompensacionTarjetaDebitoIdentificadorEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificadorEmisor");
    private final static QName _MECompensacionTarjetaDebitoOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Origen");
    private final static QName _MEConsultaTarjetaDebitoIdentificadorCuentaEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificadorCuentaEmisor");
    private final static QName _MEConsultaTarjetaDebitoReferenciaCuentaEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ReferenciaCuentaEmisor");
    private final static QName _MSTransaccionTarjetaDebitoValorDebitoParcial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ValorDebitoParcial");
    private final static QName _METransaccionTarjetaDebitoAdquirente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Adquirente");
    private final static QName _METransaccionTarjetaDebitoCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Ciudad");
    private final static QName _METransaccionTarjetaDebitoCodigoComercio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoComercio");
    private final static QName _METransaccionTarjetaDebitoComercioAceptaParciales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ComercioAceptaParciales");
    private final static QName _METransaccionTarjetaDebitoLugarTran_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "LugarTran");
    private final static QName _METransaccionTarjetaDebitoNorRev_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NorRev");
    private final static QName _METransaccionTarjetaDebitoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Pais");
    private final static QName _METransaccionTarjetaDebitoProvisionEfectivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ProvisionEfectivo");
    private final static QName _METransaccionTarjetaDebitoTerminal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Terminal");
    private final static QName _METransferenciaMonederoElectronicoTipoTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoTransferencia");
    private final static QName _MSMonederoElectronicoMonedero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Monedero");
    private final static QName _METransferenciaPagoDirectoCantonOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CantonOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoCodigoInstitucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CodigoInstitucion");
    private final static QName _METransferenciaPagoDirectoDireccionOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DireccionOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoIdentificacionOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdentificacionOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoMotivoTransferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "MotivoTransferencia");
    private final static QName _METransferenciaPagoDirectoNombreInstitucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreInstitucion");
    private final static QName _METransferenciaPagoDirectoNombreOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoNumeroCuentaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaCliente");
    private final static QName _METransferenciaPagoDirectoNumeroCuentaOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoProvinciaOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ProvinciaOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoTelefonoOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TelefonoOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoTipoCuentaOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoCuentaOrdenanteBeneficiario");
    private final static QName _METransferenciaPagoDirectoTipoIdentificacionOrdenanteBeneficiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoIdentificacionOrdenanteBeneficiario");
    private final static QName _MEConsultasClienteIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionCliente");
    private final static QName _MEConsultasClientePlanServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PlanServicio");
    private final static QName _METransferenciaNumeroCuentaCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaCredito");
    private final static QName _METransferenciaNumeroCuentaDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCuentaDebito");
    private final static QName _MEDatosChequesCheques_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Cheques");
    private final static QName _MEDatosUsuarioLogin_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Login");
    private final static QName _MEDatosChequeDevolverChequesDevueltos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ChequesDevueltos");
    private final static QName _MENotaDCTipoAjuste_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoAjuste");
    private final static QName _MSDepositosDatosDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosDeposito");
    private final static QName _MSTransferenciaSpiBancos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Bancos");
    private final static QName _METransferenciaSpiInstrucciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Instrucciones");
    private final static QName _METransferenciaSpiNumeroCausal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroCausal");
    private final static QName _MSConsultasCertificadosCertificados_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Certificados");
    private final static QName _MSConsultasMovimientosCuentaCuotasAhorroProgramado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CuotasAhorroProgramado");
    private final static QName _MSConsultasMovimientosCuentaDetallesInteresDiario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DetallesInteresDiario");
    private final static QName _MEConsultasMovimientosReferenciaBCE_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ReferenciaBCE");
    private final static QName _MEConsultasMovimientosReferenciaDeposito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ReferenciaDeposito");
    private final static QName _MEConsultasMovimientosSecuencialBCE_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "SecuencialBCE");
    private final static QName _MEConsultasMovimientosSecuencialOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "SecuencialOrigen");
    private final static QName _MEConsultasMovimientosTipoTransaccionRecibida_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoTransaccionRecibida");
    private final static QName _MSConsultasDatosAdmTarjetasDatosClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosClientes");
    private final static QName _MSConsultasDatosAdmTarjetasTelefonoAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TelefonoAdicional");
    private final static QName _MSConsultasCtaAhorrosApellido1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Apellido1");
    private final static QName _MSConsultasCtaAhorrosApellido2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Apellido2");
    private final static QName _MSConsultasCtaAhorrosNombre1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Nombre1");
    private final static QName _MSConsultasCtaAhorrosNombre2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Nombre2");
    private final static QName _MSCanjeLibretaCausaCanje_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CausaCanje");
    private final static QName _MSCanjeLibretaCausalDebito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "CausalDebito");
    private final static QName _MSCanjeLibretaDesProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DesProducto");
    private final static QName _MSCanjeLibretaNumerolibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Numerolibreta");
    private final static QName _MECanjeLibretaCausa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "Causa");
    private final static QName _MECanjeLibretaNumeroNuevaLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroNuevaLibreta");
    private final static QName _MECanjeLibretaTipoLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "TipoLibreta");
    private final static QName _MECanjeLibretaUsuarioStockLibreta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "UsuarioStockLibreta");
    private final static QName _MSConsultasLibretaDatosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosCliente");
    private final static QName _MSConsultasLibretaDescripcionProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DescripcionProducto");
    private final static QName _MSConsultasLibretaLineasPendientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "LineasPendientes");
    private final static QName _MSConsultasDatosCuentaDatosCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "DatosCuenta");
    private final static QName _MSConsultasDatosCuentaNombreAgencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NombreAgencia");
    private final static QName _MSNotaDebitoAtmNumeroTransaccionConsulta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NumeroTransaccionConsulta");
    private final static QName _MENdNcAtmNdNc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "NdNc");
    private final static QName _MEConsultasCuentaIdsClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "IdsClientes");
    private final static QName _MEConsultasCuentaListaNumeroCuentas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", "ListaNumeroCuentas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MEConsultasCuenta }
     * 
     */
    public MEConsultasCuenta createMEConsultasCuenta() {
        return new MEConsultasCuenta();
    }

    /**
     * Create an instance of {@link MSConsultasSaldosCuenta }
     * 
     */
    public MSConsultasSaldosCuenta createMSConsultasSaldosCuenta() {
        return new MSConsultasSaldosCuenta();
    }

    /**
     * Create an instance of {@link MSConsultasSaldosCuentas }
     * 
     */
    public MSConsultasSaldosCuentas createMSConsultasSaldosCuentas() {
        return new MSConsultasSaldosCuentas();
    }

    /**
     * Create an instance of {@link MENdNc }
     * 
     */
    public MENdNc createMENdNc() {
        return new MENdNc();
    }

    /**
     * Create an instance of {@link MSNotaDebito }
     * 
     */
    public MSNotaDebito createMSNotaDebito() {
        return new MSNotaDebito();
    }

    /**
     * Create an instance of {@link MEReversoNdNc }
     * 
     */
    public MEReversoNdNc createMEReversoNdNc() {
        return new MEReversoNdNc();
    }

    /**
     * Create an instance of {@link MENdNcAtm }
     * 
     */
    public MENdNcAtm createMENdNcAtm() {
        return new MENdNcAtm();
    }

    /**
     * Create an instance of {@link MSNotaDebitoAtm }
     * 
     */
    public MSNotaDebitoAtm createMSNotaDebitoAtm() {
        return new MSNotaDebitoAtm();
    }

    /**
     * Create an instance of {@link MSNotaCredito }
     * 
     */
    public MSNotaCredito createMSNotaCredito() {
        return new MSNotaCredito();
    }

    /**
     * Create an instance of {@link MSConsultasDatosCuenta }
     * 
     */
    public MSConsultasDatosCuenta createMSConsultasDatosCuenta() {
        return new MSConsultasDatosCuenta();
    }

    /**
     * Create an instance of {@link MEConsultasLibreta }
     * 
     */
    public MEConsultasLibreta createMEConsultasLibreta() {
        return new MEConsultasLibreta();
    }

    /**
     * Create an instance of {@link MSConsultasLibreta }
     * 
     */
    public MSConsultasLibreta createMSConsultasLibreta() {
        return new MSConsultasLibreta();
    }

    /**
     * Create an instance of {@link MSPersonalizacionLibreta }
     * 
     */
    public MSPersonalizacionLibreta createMSPersonalizacionLibreta() {
        return new MSPersonalizacionLibreta();
    }

    /**
     * Create an instance of {@link MECanjeLibreta }
     * 
     */
    public MECanjeLibreta createMECanjeLibreta() {
        return new MECanjeLibreta();
    }

    /**
     * Create an instance of {@link MSCanjeLibreta }
     * 
     */
    public MSCanjeLibreta createMSCanjeLibreta() {
        return new MSCanjeLibreta();
    }

    /**
     * Create an instance of {@link MSConsultasCtaAhorros }
     * 
     */
    public MSConsultasCtaAhorros createMSConsultasCtaAhorros() {
        return new MSConsultasCtaAhorros();
    }

    /**
     * Create an instance of {@link MSConsultasDatosAdmTarjetas }
     * 
     */
    public MSConsultasDatosAdmTarjetas createMSConsultasDatosAdmTarjetas() {
        return new MSConsultasDatosAdmTarjetas();
    }

    /**
     * Create an instance of {@link MEConsultasMovimientos }
     * 
     */
    public MEConsultasMovimientos createMEConsultasMovimientos() {
        return new MEConsultasMovimientos();
    }

    /**
     * Create an instance of {@link MSConsultasMovimientosCuenta }
     * 
     */
    public MSConsultasMovimientosCuenta createMSConsultasMovimientosCuenta() {
        return new MSConsultasMovimientosCuenta();
    }

    /**
     * Create an instance of {@link MSConsultasCertificados }
     * 
     */
    public MSConsultasCertificados createMSConsultasCertificados() {
        return new MSConsultasCertificados();
    }

    /**
     * Create an instance of {@link MEConsultaSaldoAtm }
     * 
     */
    public MEConsultaSaldoAtm createMEConsultaSaldoAtm() {
        return new MEConsultaSaldoAtm();
    }

    /**
     * Create an instance of {@link MSConsultaSaldoAtm }
     * 
     */
    public MSConsultaSaldoAtm createMSConsultaSaldoAtm() {
        return new MSConsultaSaldoAtm();
    }

    /**
     * Create an instance of {@link METransferenciaSpi }
     * 
     */
    public METransferenciaSpi createMETransferenciaSpi() {
        return new METransferenciaSpi();
    }

    /**
     * Create an instance of {@link MSTransferenciaSpi }
     * 
     */
    public MSTransferenciaSpi createMSTransferenciaSpi() {
        return new MSTransferenciaSpi();
    }

    /**
     * Create an instance of {@link MSDepositos }
     * 
     */
    public MSDepositos createMSDepositos() {
        return new MSDepositos();
    }

    /**
     * Create an instance of {@link MENotaDC }
     * 
     */
    public MENotaDC createMENotaDC() {
        return new MENotaDC();
    }

    /**
     * Create an instance of {@link MEDatosChequeDevolver }
     * 
     */
    public MEDatosChequeDevolver createMEDatosChequeDevolver() {
        return new MEDatosChequeDevolver();
    }

    /**
     * Create an instance of {@link MEDatosUsuario }
     * 
     */
    public MEDatosUsuario createMEDatosUsuario() {
        return new MEDatosUsuario();
    }

    /**
     * Create an instance of {@link MSDatosUsuario }
     * 
     */
    public MSDatosUsuario createMSDatosUsuario() {
        return new MSDatosUsuario();
    }

    /**
     * Create an instance of {@link MEDatosCheques }
     * 
     */
    public MEDatosCheques createMEDatosCheques() {
        return new MEDatosCheques();
    }

    /**
     * Create an instance of {@link METransferencia }
     * 
     */
    public METransferencia createMETransferencia() {
        return new METransferencia();
    }

    /**
     * Create an instance of {@link MEConsultasCliente }
     * 
     */
    public MEConsultasCliente createMEConsultasCliente() {
        return new MEConsultasCliente();
    }

    /**
     * Create an instance of {@link METransferenciaPagoDirecto }
     * 
     */
    public METransferenciaPagoDirecto createMETransferenciaPagoDirecto() {
        return new METransferenciaPagoDirecto();
    }

    /**
     * Create an instance of {@link MSTransferenciaPagoDirecto }
     * 
     */
    public MSTransferenciaPagoDirecto createMSTransferenciaPagoDirecto() {
        return new MSTransferenciaPagoDirecto();
    }

    /**
     * Create an instance of {@link MEMonederoElectronico }
     * 
     */
    public MEMonederoElectronico createMEMonederoElectronico() {
        return new MEMonederoElectronico();
    }

    /**
     * Create an instance of {@link MSMonederoElectronico }
     * 
     */
    public MSMonederoElectronico createMSMonederoElectronico() {
        return new MSMonederoElectronico();
    }

    /**
     * Create an instance of {@link METransferenciaMonederoElectronico }
     * 
     */
    public METransferenciaMonederoElectronico createMETransferenciaMonederoElectronico() {
        return new METransferenciaMonederoElectronico();
    }

    /**
     * Create an instance of {@link MSTransferenciaMonederoElectronico }
     * 
     */
    public MSTransferenciaMonederoElectronico createMSTransferenciaMonederoElectronico() {
        return new MSTransferenciaMonederoElectronico();
    }

    /**
     * Create an instance of {@link METransaccionTarjetaDebito }
     * 
     */
    public METransaccionTarjetaDebito createMETransaccionTarjetaDebito() {
        return new METransaccionTarjetaDebito();
    }

    /**
     * Create an instance of {@link MSTransaccionTarjetaDebito }
     * 
     */
    public MSTransaccionTarjetaDebito createMSTransaccionTarjetaDebito() {
        return new MSTransaccionTarjetaDebito();
    }

    /**
     * Create an instance of {@link MEConsultaTarjetaDebito }
     * 
     */
    public MEConsultaTarjetaDebito createMEConsultaTarjetaDebito() {
        return new MEConsultaTarjetaDebito();
    }

    /**
     * Create an instance of {@link MSConsultaTarjetaDebito }
     * 
     */
    public MSConsultaTarjetaDebito createMSConsultaTarjetaDebito() {
        return new MSConsultaTarjetaDebito();
    }

    /**
     * Create an instance of {@link MECompensacionTarjetaDebito }
     * 
     */
    public MECompensacionTarjetaDebito createMECompensacionTarjetaDebito() {
        return new MECompensacionTarjetaDebito();
    }

    /**
     * Create an instance of {@link METelefono }
     * 
     */
    public METelefono createMETelefono() {
        return new METelefono();
    }

    /**
     * Create an instance of {@link METransaccionCanales }
     * 
     */
    public METransaccionCanales createMETransaccionCanales() {
        return new METransaccionCanales();
    }

    /**
     * Create an instance of {@link MSTransaccionCanales }
     * 
     */
    public MSTransaccionCanales createMSTransaccionCanales() {
        return new MSTransaccionCanales();
    }

    /**
     * Create an instance of {@link MECrearCuenta }
     * 
     */
    public MECrearCuenta createMECrearCuenta() {
        return new MECrearCuenta();
    }

    /**
     * Create an instance of {@link MSNumeroCuenta }
     * 
     */
    public MSNumeroCuenta createMSNumeroCuenta() {
        return new MSNumeroCuenta();
    }

    /**
     * Create an instance of {@link MESimularAhorro }
     * 
     */
    public MESimularAhorro createMESimularAhorro() {
        return new MESimularAhorro();
    }

    /**
     * Create an instance of {@link MSSimularAhorro }
     * 
     */
    public MSSimularAhorro createMSSimularAhorro() {
        return new MSSimularAhorro();
    }

    /**
     * Create an instance of {@link MEAperturaAhorroProgramado }
     * 
     */
    public MEAperturaAhorroProgramado createMEAperturaAhorroProgramado() {
        return new MEAperturaAhorroProgramado();
    }

    /**
     * Create an instance of {@link MSAperturaAhorroProgramado }
     * 
     */
    public MSAperturaAhorroProgramado createMSAperturaAhorroProgramado() {
        return new MSAperturaAhorroProgramado();
    }

    /**
     * Create an instance of {@link MERenovacionAhorro }
     * 
     */
    public MERenovacionAhorro createMERenovacionAhorro() {
        return new MERenovacionAhorro();
    }

    /**
     * Create an instance of {@link MECreacionCliente }
     * 
     */
    public MECreacionCliente createMECreacionCliente() {
        return new MECreacionCliente();
    }

    /**
     * Create an instance of {@link MEPagoSpi }
     * 
     */
    public MEPagoSpi createMEPagoSpi() {
        return new MEPagoSpi();
    }

    /**
     * Create an instance of {@link MEAperturaCuenta }
     * 
     */
    public MEAperturaCuenta createMEAperturaCuenta() {
        return new MEAperturaCuenta();
    }

    /**
     * Create an instance of {@link MSAperturaCuenta }
     * 
     */
    public MSAperturaCuenta createMSAperturaCuenta() {
        return new MSAperturaCuenta();
    }

    /**
     * Create an instance of {@link METransaccionPagoServicios }
     * 
     */
    public METransaccionPagoServicios createMETransaccionPagoServicios() {
        return new METransaccionPagoServicios();
    }

    /**
     * Create an instance of {@link MSTransaccionPagoServicios }
     * 
     */
    public MSTransaccionPagoServicios createMSTransaccionPagoServicios() {
        return new MSTransaccionPagoServicios();
    }

    /**
     * Create an instance of {@link MEConsultaSaldosTarjetasCliente }
     * 
     */
    public MEConsultaSaldosTarjetasCliente createMEConsultaSaldosTarjetasCliente() {
        return new MEConsultaSaldosTarjetasCliente();
    }

    /**
     * Create an instance of {@link MSConsultasSaldosTarjetas }
     * 
     */
    public MSConsultasSaldosTarjetas createMSConsultasSaldosTarjetas() {
        return new MSConsultasSaldosTarjetas();
    }

    /**
     * Create an instance of {@link MEPagoTarjeta }
     * 
     */
    public MEPagoTarjeta createMEPagoTarjeta() {
        return new MEPagoTarjeta();
    }

    /**
     * Create an instance of {@link MSPagoTarjeta }
     * 
     */
    public MSPagoTarjeta createMSPagoTarjeta() {
        return new MSPagoTarjeta();
    }

    /**
     * Create an instance of {@link MEConsultaDatosTarjeta }
     * 
     */
    public MEConsultaDatosTarjeta createMEConsultaDatosTarjeta() {
        return new MEConsultaDatosTarjeta();
    }

    /**
     * Create an instance of {@link MSConsultaDatosTarjeta }
     * 
     */
    public MSConsultaDatosTarjeta createMSConsultaDatosTarjeta() {
        return new MSConsultaDatosTarjeta();
    }

    /**
     * Create an instance of {@link METransaccionCorresponsales }
     * 
     */
    public METransaccionCorresponsales createMETransaccionCorresponsales() {
        return new METransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link MSTransaccionCorresponsales }
     * 
     */
    public MSTransaccionCorresponsales createMSTransaccionCorresponsales() {
        return new MSTransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link MSConsultaMovimientosCorresponsales }
     * 
     */
    public MSConsultaMovimientosCorresponsales createMSConsultaMovimientosCorresponsales() {
        return new MSConsultaMovimientosCorresponsales();
    }

    /**
     * Create an instance of {@link MEDocumentosCuenta }
     * 
     */
    public MEDocumentosCuenta createMEDocumentosCuenta() {
        return new MEDocumentosCuenta();
    }

    /**
     * Create an instance of {@link MEConsultaCuenta }
     * 
     */
    public MEConsultaCuenta createMEConsultaCuenta() {
        return new MEConsultaCuenta();
    }

    /**
     * Create an instance of {@link MSTransaccionRecibida }
     * 
     */
    public MSTransaccionRecibida createMSTransaccionRecibida() {
        return new MSTransaccionRecibida();
    }

    /**
     * Create an instance of {@link METransaccionKisko }
     * 
     */
    public METransaccionKisko createMETransaccionKisko() {
        return new METransaccionKisko();
    }

    /**
     * Create an instance of {@link MSTransaccionKiosko }
     * 
     */
    public MSTransaccionKiosko createMSTransaccionKiosko() {
        return new MSTransaccionKiosko();
    }

    /**
     * Create an instance of {@link MSDocumentoCuenta }
     * 
     */
    public MSDocumentoCuenta createMSDocumentoCuenta() {
        return new MSDocumentoCuenta();
    }

    /**
     * Create an instance of {@link MEConsultaTransferenciasSPI }
     * 
     */
    public MEConsultaTransferenciasSPI createMEConsultaTransferenciasSPI() {
        return new MEConsultaTransferenciasSPI();
    }

    /**
     * Create an instance of {@link MSConsultaTransferenciasSPI }
     * 
     */
    public MSConsultaTransferenciasSPI createMSConsultaTransferenciasSPI() {
        return new MSConsultaTransferenciasSPI();
    }

    /**
     * Create an instance of {@link MEContratoCuenta }
     * 
     */
    public MEContratoCuenta createMEContratoCuenta() {
        return new MEContratoCuenta();
    }

    /**
     * Create an instance of {@link MEEstadoCuentaDigital }
     * 
     */
    public MEEstadoCuentaDigital createMEEstadoCuentaDigital() {
        return new MEEstadoCuentaDigital();
    }

    /**
     * Create an instance of {@link CatalogoItem }
     * 
     */
    public CatalogoItem createCatalogoItem() {
        return new CatalogoItem();
    }

    /**
     * Create an instance of {@link CuentaLibreta }
     * 
     */
    public CuentaLibreta createCuentaLibreta() {
        return new CuentaLibreta();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link Interviniente }
     * 
     */
    public Interviniente createInterviniente() {
        return new Interviniente();
    }

    /**
     * Create an instance of {@link ClienteCondicion }
     * 
     */
    public ClienteCondicion createClienteCondicion() {
        return new ClienteCondicion();
    }

    /**
     * Create an instance of {@link DatosSaldos }
     * 
     */
    public DatosSaldos createDatosSaldos() {
        return new DatosSaldos();
    }

    /**
     * Create an instance of {@link ArrayOfInterviniente }
     * 
     */
    public ArrayOfInterviniente createArrayOfInterviniente() {
        return new ArrayOfInterviniente();
    }

    /**
     * Create an instance of {@link ArrayOfCuentaLibreta }
     * 
     */
    public ArrayOfCuentaLibreta createArrayOfCuentaLibreta() {
        return new ArrayOfCuentaLibreta();
    }

    /**
     * Create an instance of {@link ArrayOfTotalDeposito }
     * 
     */
    public ArrayOfTotalDeposito createArrayOfTotalDeposito() {
        return new ArrayOfTotalDeposito();
    }

    /**
     * Create an instance of {@link TotalDeposito }
     * 
     */
    public TotalDeposito createTotalDeposito() {
        return new TotalDeposito();
    }

    /**
     * Create an instance of {@link ArrayOfDatosUsuario }
     * 
     */
    public ArrayOfDatosUsuario createArrayOfDatosUsuario() {
        return new ArrayOfDatosUsuario();
    }

    /**
     * Create an instance of {@link DatosUsuario }
     * 
     */
    public DatosUsuario createDatosUsuario() {
        return new DatosUsuario();
    }

    /**
     * Create an instance of {@link Cheque }
     * 
     */
    public Cheque createCheque() {
        return new Cheque();
    }

    /**
     * Create an instance of {@link NotaDebitoCredito }
     * 
     */
    public NotaDebitoCredito createNotaDebitoCredito() {
        return new NotaDebitoCredito();
    }

    /**
     * Create an instance of {@link DatosGeneralesCuenta }
     * 
     */
    public DatosGeneralesCuenta createDatosGeneralesCuenta() {
        return new DatosGeneralesCuenta();
    }

    /**
     * Create an instance of {@link ResultadoNdNc }
     * 
     */
    public ResultadoNdNc createResultadoNdNc() {
        return new ResultadoNdNc();
    }

    /**
     * Create an instance of {@link NotaDebitoCreditoAtm }
     * 
     */
    public NotaDebitoCreditoAtm createNotaDebitoCreditoAtm() {
        return new NotaDebitoCreditoAtm();
    }

    /**
     * Create an instance of {@link ArrayOfLineaPendienteLibreta }
     * 
     */
    public ArrayOfLineaPendienteLibreta createArrayOfLineaPendienteLibreta() {
        return new ArrayOfLineaPendienteLibreta();
    }

    /**
     * Create an instance of {@link LineaPendienteLibreta }
     * 
     */
    public LineaPendienteLibreta createLineaPendienteLibreta() {
        return new LineaPendienteLibreta();
    }

    /**
     * Create an instance of {@link ArrayOfCuenta }
     * 
     */
    public ArrayOfCuenta createArrayOfCuenta() {
        return new ArrayOfCuenta();
    }

    /**
     * Create an instance of {@link ArrayOfDatosCuotasAhorroProgramado }
     * 
     */
    public ArrayOfDatosCuotasAhorroProgramado createArrayOfDatosCuotasAhorroProgramado() {
        return new ArrayOfDatosCuotasAhorroProgramado();
    }

    /**
     * Create an instance of {@link DatosCuotasAhorroProgramado }
     * 
     */
    public DatosCuotasAhorroProgramado createDatosCuotasAhorroProgramado() {
        return new DatosCuotasAhorroProgramado();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleInteresDiario }
     * 
     */
    public ArrayOfDetalleInteresDiario createArrayOfDetalleInteresDiario() {
        return new ArrayOfDetalleInteresDiario();
    }

    /**
     * Create an instance of {@link DetalleInteresDiario }
     * 
     */
    public DetalleInteresDiario createDetalleInteresDiario() {
        return new DetalleInteresDiario();
    }

    /**
     * Create an instance of {@link ArrayOfMovimiento }
     * 
     */
    public ArrayOfMovimiento createArrayOfMovimiento() {
        return new ArrayOfMovimiento();
    }

    /**
     * Create an instance of {@link Movimiento }
     * 
     */
    public Movimiento createMovimiento() {
        return new Movimiento();
    }

    /**
     * Create an instance of {@link ArrayOfCertificadoAportacion }
     * 
     */
    public ArrayOfCertificadoAportacion createArrayOfCertificadoAportacion() {
        return new ArrayOfCertificadoAportacion();
    }

    /**
     * Create an instance of {@link CertificadoAportacion }
     * 
     */
    public CertificadoAportacion createCertificadoAportacion() {
        return new CertificadoAportacion();
    }

    /**
     * Create an instance of {@link ArrayOfBanco }
     * 
     */
    public ArrayOfBanco createArrayOfBanco() {
        return new ArrayOfBanco();
    }

    /**
     * Create an instance of {@link Banco }
     * 
     */
    public Banco createBanco() {
        return new Banco();
    }

    /**
     * Create an instance of {@link ArrayOfChequeDevuelto }
     * 
     */
    public ArrayOfChequeDevuelto createArrayOfChequeDevuelto() {
        return new ArrayOfChequeDevuelto();
    }

    /**
     * Create an instance of {@link ChequeDevuelto }
     * 
     */
    public ChequeDevuelto createChequeDevuelto() {
        return new ChequeDevuelto();
    }

    /**
     * Create an instance of {@link ArrayOfCheque }
     * 
     */
    public ArrayOfCheque createArrayOfCheque() {
        return new ArrayOfCheque();
    }

    /**
     * Create an instance of {@link MonederoElectronico }
     * 
     */
    public MonederoElectronico createMonederoElectronico() {
        return new MonederoElectronico();
    }

    /**
     * Create an instance of {@link TransaccionCanales }
     * 
     */
    public TransaccionCanales createTransaccionCanales() {
        return new TransaccionCanales();
    }

    /**
     * Create an instance of {@link ArrayOfRespuestaSimulacion }
     * 
     */
    public ArrayOfRespuestaSimulacion createArrayOfRespuestaSimulacion() {
        return new ArrayOfRespuestaSimulacion();
    }

    /**
     * Create an instance of {@link RespuestaSimulacion }
     * 
     */
    public RespuestaSimulacion createRespuestaSimulacion() {
        return new RespuestaSimulacion();
    }

    /**
     * Create an instance of {@link PagoServicios }
     * 
     */
    public PagoServicios createPagoServicios() {
        return new PagoServicios();
    }

    /**
     * Create an instance of {@link ArrayOfTarjeta }
     * 
     */
    public ArrayOfTarjeta createArrayOfTarjeta() {
        return new ArrayOfTarjeta();
    }

    /**
     * Create an instance of {@link Tarjeta }
     * 
     */
    public Tarjeta createTarjeta() {
        return new Tarjeta();
    }

    /**
     * Create an instance of {@link TransaccionCorresponsales }
     * 
     */
    public TransaccionCorresponsales createTransaccionCorresponsales() {
        return new TransaccionCorresponsales();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleSpi }
     * 
     */
    public ArrayOfDetalleSpi createArrayOfDetalleSpi() {
        return new ArrayOfDetalleSpi();
    }

    /**
     * Create an instance of {@link DetalleSpi }
     * 
     */
    public DetalleSpi createDetalleSpi() {
        return new DetalleSpi();
    }

    /**
     * Create an instance of {@link DatosGeneralesCliente }
     * 
     */
    public DatosGeneralesCliente createDatosGeneralesCliente() {
        return new DatosGeneralesCliente();
    }

    /**
     * Create an instance of {@link ArrayOfRedSocial }
     * 
     */
    public ArrayOfRedSocial createArrayOfRedSocial() {
        return new ArrayOfRedSocial();
    }

    /**
     * Create an instance of {@link RedSocial }
     * 
     */
    public RedSocial createRedSocial() {
        return new RedSocial();
    }

    /**
     * Create an instance of {@link ResidenciaFiscal }
     * 
     */
    public ResidenciaFiscal createResidenciaFiscal() {
        return new ResidenciaFiscal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogoItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CatalogoItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CatalogoItem")
    public JAXBElement<CatalogoItem> createCatalogoItem(CatalogoItem value) {
        return new JAXBElement<CatalogoItem>(_CatalogoItem_QNAME, CatalogoItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaLibreta")
    public JAXBElement<CuentaLibreta> createCuentaLibreta(CuentaLibreta value) {
        return new JAXBElement<CuentaLibreta>(_CuentaLibreta_QNAME, CuentaLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuenta")
    public JAXBElement<Cuenta> createCuenta(Cuenta value) {
        return new JAXBElement<Cuenta>(_Cuenta_QNAME, Cuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Interviniente")
    public JAXBElement<Interviniente> createInterviniente(Interviniente value) {
        return new JAXBElement<Interviniente>(_Interviniente_QNAME, Interviniente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteCondicion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClienteCondicion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ClienteCondicion")
    public JAXBElement<ClienteCondicion> createClienteCondicion(ClienteCondicion value) {
        return new JAXBElement<ClienteCondicion>(_ClienteCondicion_QNAME, ClienteCondicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosSaldos")
    public JAXBElement<DatosSaldos> createDatosSaldos(DatosSaldos value) {
        return new JAXBElement<DatosSaldos>(_DatosSaldos_QNAME, DatosSaldos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfInterviniente")
    public JAXBElement<ArrayOfInterviniente> createArrayOfInterviniente(ArrayOfInterviniente value) {
        return new JAXBElement<ArrayOfInterviniente>(_ArrayOfInterviniente_QNAME, ArrayOfInterviniente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfCuentaLibreta")
    public JAXBElement<ArrayOfCuentaLibreta> createArrayOfCuentaLibreta(ArrayOfCuentaLibreta value) {
        return new JAXBElement<ArrayOfCuentaLibreta>(_ArrayOfCuentaLibreta_QNAME, ArrayOfCuentaLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTotalDeposito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTotalDeposito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfTotalDeposito")
    public JAXBElement<ArrayOfTotalDeposito> createArrayOfTotalDeposito(ArrayOfTotalDeposito value) {
        return new JAXBElement<ArrayOfTotalDeposito>(_ArrayOfTotalDeposito_QNAME, ArrayOfTotalDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalDeposito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotalDeposito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TotalDeposito")
    public JAXBElement<TotalDeposito> createTotalDeposito(TotalDeposito value) {
        return new JAXBElement<TotalDeposito>(_TotalDeposito_QNAME, TotalDeposito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfDatosUsuario")
    public JAXBElement<ArrayOfDatosUsuario> createArrayOfDatosUsuario(ArrayOfDatosUsuario value) {
        return new JAXBElement<ArrayOfDatosUsuario>(_ArrayOfDatosUsuario_QNAME, ArrayOfDatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosUsuario")
    public JAXBElement<DatosUsuario> createDatosUsuario(DatosUsuario value) {
        return new JAXBElement<DatosUsuario>(_DatosUsuario_QNAME, DatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cheque }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cheque }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cheque")
    public JAXBElement<Cheque> createCheque(Cheque value) {
        return new JAXBElement<Cheque>(_Cheque_QNAME, Cheque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultasCuenta")
    public JAXBElement<MEConsultasCuenta> createMEConsultasCuenta(MEConsultasCuenta value) {
        return new JAXBElement<MEConsultasCuenta>(_MEConsultasCuenta_QNAME, MEConsultasCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasSaldosCuenta")
    public JAXBElement<MSConsultasSaldosCuenta> createMSConsultasSaldosCuenta(MSConsultasSaldosCuenta value) {
        return new JAXBElement<MSConsultasSaldosCuenta>(_MSConsultasSaldosCuenta_QNAME, MSConsultasSaldosCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuentas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosCuentas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasSaldosCuentas")
    public JAXBElement<MSConsultasSaldosCuentas> createMSConsultasSaldosCuentas(MSConsultasSaldosCuentas value) {
        return new JAXBElement<MSConsultasSaldosCuentas>(_MSConsultasSaldosCuentas_QNAME, MSConsultasSaldosCuentas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MENdNc")
    public JAXBElement<MENdNc> createMENdNc(MENdNc value) {
        return new JAXBElement<MENdNc>(_MENdNc_QNAME, MENdNc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NotaDebitoCredito")
    public JAXBElement<NotaDebitoCredito> createNotaDebitoCredito(NotaDebitoCredito value) {
        return new JAXBElement<NotaDebitoCredito>(_NotaDebitoCredito_QNAME, NotaDebitoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSNotaDebito")
    public JAXBElement<MSNotaDebito> createMSNotaDebito(MSNotaDebito value) {
        return new JAXBElement<MSNotaDebito>(_MSNotaDebito_QNAME, MSNotaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosGeneralesCuenta")
    public JAXBElement<DatosGeneralesCuenta> createDatosGeneralesCuenta(DatosGeneralesCuenta value) {
        return new JAXBElement<DatosGeneralesCuenta>(_DatosGeneralesCuenta_QNAME, DatosGeneralesCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ResultadoNdNc")
    public JAXBElement<ResultadoNdNc> createResultadoNdNc(ResultadoNdNc value) {
        return new JAXBElement<ResultadoNdNc>(_ResultadoNdNc_QNAME, ResultadoNdNc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReversoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEReversoNdNc")
    public JAXBElement<MEReversoNdNc> createMEReversoNdNc(MEReversoNdNc value) {
        return new JAXBElement<MEReversoNdNc>(_MEReversoNdNc_QNAME, MEReversoNdNc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENdNcAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENdNcAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MENdNcAtm")
    public JAXBElement<MENdNcAtm> createMENdNcAtm(MENdNcAtm value) {
        return new JAXBElement<MENdNcAtm>(_MENdNcAtm_QNAME, MENdNcAtm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaDebitoCreditoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotaDebitoCreditoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NotaDebitoCreditoAtm")
    public JAXBElement<NotaDebitoCreditoAtm> createNotaDebitoCreditoAtm(NotaDebitoCreditoAtm value) {
        return new JAXBElement<NotaDebitoCreditoAtm>(_NotaDebitoCreditoAtm_QNAME, NotaDebitoCreditoAtm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaDebitoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSNotaDebitoAtm")
    public JAXBElement<MSNotaDebitoAtm> createMSNotaDebitoAtm(MSNotaDebitoAtm value) {
        return new JAXBElement<MSNotaDebitoAtm>(_MSNotaDebitoAtm_QNAME, MSNotaDebitoAtm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNotaCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSNotaCredito")
    public JAXBElement<MSNotaCredito> createMSNotaCredito(MSNotaCredito value) {
        return new JAXBElement<MSNotaCredito>(_MSNotaCredito_QNAME, MSNotaCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasDatosCuenta")
    public JAXBElement<MSConsultasDatosCuenta> createMSConsultasDatosCuenta(MSConsultasDatosCuenta value) {
        return new JAXBElement<MSConsultasDatosCuenta>(_MSConsultasDatosCuenta_QNAME, MSConsultasDatosCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultasLibreta")
    public JAXBElement<MEConsultasLibreta> createMEConsultasLibreta(MEConsultasLibreta value) {
        return new JAXBElement<MEConsultasLibreta>(_MEConsultasLibreta_QNAME, MEConsultasLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasLibreta")
    public JAXBElement<MSConsultasLibreta> createMSConsultasLibreta(MSConsultasLibreta value) {
        return new JAXBElement<MSConsultasLibreta>(_MSConsultasLibreta_QNAME, MSConsultasLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfLineaPendienteLibreta")
    public JAXBElement<ArrayOfLineaPendienteLibreta> createArrayOfLineaPendienteLibreta(ArrayOfLineaPendienteLibreta value) {
        return new JAXBElement<ArrayOfLineaPendienteLibreta>(_ArrayOfLineaPendienteLibreta_QNAME, ArrayOfLineaPendienteLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineaPendienteLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LineaPendienteLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "LineaPendienteLibreta")
    public JAXBElement<LineaPendienteLibreta> createLineaPendienteLibreta(LineaPendienteLibreta value) {
        return new JAXBElement<LineaPendienteLibreta>(_LineaPendienteLibreta_QNAME, LineaPendienteLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSPersonalizacionLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSPersonalizacionLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSPersonalizacionLibreta")
    public JAXBElement<MSPersonalizacionLibreta> createMSPersonalizacionLibreta(MSPersonalizacionLibreta value) {
        return new JAXBElement<MSPersonalizacionLibreta>(_MSPersonalizacionLibreta_QNAME, MSPersonalizacionLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECanjeLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECanjeLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MECanjeLibreta")
    public JAXBElement<MECanjeLibreta> createMECanjeLibreta(MECanjeLibreta value) {
        return new JAXBElement<MECanjeLibreta>(_MECanjeLibreta_QNAME, MECanjeLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCanjeLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCanjeLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSCanjeLibreta")
    public JAXBElement<MSCanjeLibreta> createMSCanjeLibreta(MSCanjeLibreta value) {
        return new JAXBElement<MSCanjeLibreta>(_MSCanjeLibreta_QNAME, MSCanjeLibreta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCtaAhorros }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasCtaAhorros")
    public JAXBElement<MSConsultasCtaAhorros> createMSConsultasCtaAhorros(MSConsultasCtaAhorros value) {
        return new JAXBElement<MSConsultasCtaAhorros>(_MSConsultasCtaAhorros_QNAME, MSConsultasCtaAhorros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosAdmTarjetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasDatosAdmTarjetas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasDatosAdmTarjetas")
    public JAXBElement<MSConsultasDatosAdmTarjetas> createMSConsultasDatosAdmTarjetas(MSConsultasDatosAdmTarjetas value) {
        return new JAXBElement<MSConsultasDatosAdmTarjetas>(_MSConsultasDatosAdmTarjetas_QNAME, MSConsultasDatosAdmTarjetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfCuenta")
    public JAXBElement<ArrayOfCuenta> createArrayOfCuenta(ArrayOfCuenta value) {
        return new JAXBElement<ArrayOfCuenta>(_ArrayOfCuenta_QNAME, ArrayOfCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasMovimientos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultasMovimientos")
    public JAXBElement<MEConsultasMovimientos> createMEConsultasMovimientos(MEConsultasMovimientos value) {
        return new JAXBElement<MEConsultasMovimientos>(_MEConsultasMovimientos_QNAME, MEConsultasMovimientos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasMovimientosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasMovimientosCuenta")
    public JAXBElement<MSConsultasMovimientosCuenta> createMSConsultasMovimientosCuenta(MSConsultasMovimientosCuenta value) {
        return new JAXBElement<MSConsultasMovimientosCuenta>(_MSConsultasMovimientosCuenta_QNAME, MSConsultasMovimientosCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfDatosCuotasAhorroProgramado")
    public JAXBElement<ArrayOfDatosCuotasAhorroProgramado> createArrayOfDatosCuotasAhorroProgramado(ArrayOfDatosCuotasAhorroProgramado value) {
        return new JAXBElement<ArrayOfDatosCuotasAhorroProgramado>(_ArrayOfDatosCuotasAhorroProgramado_QNAME, ArrayOfDatosCuotasAhorroProgramado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCuotasAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosCuotasAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCuotasAhorroProgramado")
    public JAXBElement<DatosCuotasAhorroProgramado> createDatosCuotasAhorroProgramado(DatosCuotasAhorroProgramado value) {
        return new JAXBElement<DatosCuotasAhorroProgramado>(_DatosCuotasAhorroProgramado_QNAME, DatosCuotasAhorroProgramado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfDetalleInteresDiario")
    public JAXBElement<ArrayOfDetalleInteresDiario> createArrayOfDetalleInteresDiario(ArrayOfDetalleInteresDiario value) {
        return new JAXBElement<ArrayOfDetalleInteresDiario>(_ArrayOfDetalleInteresDiario_QNAME, ArrayOfDetalleInteresDiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleInteresDiario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleInteresDiario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DetalleInteresDiario")
    public JAXBElement<DetalleInteresDiario> createDetalleInteresDiario(DetalleInteresDiario value) {
        return new JAXBElement<DetalleInteresDiario>(_DetalleInteresDiario_QNAME, DetalleInteresDiario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfMovimiento")
    public JAXBElement<ArrayOfMovimiento> createArrayOfMovimiento(ArrayOfMovimiento value) {
        return new JAXBElement<ArrayOfMovimiento>(_ArrayOfMovimiento_QNAME, ArrayOfMovimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Movimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Movimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Movimiento")
    public JAXBElement<Movimiento> createMovimiento(Movimiento value) {
        return new JAXBElement<Movimiento>(_Movimiento_QNAME, Movimiento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCertificados }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasCertificados")
    public JAXBElement<MSConsultasCertificados> createMSConsultasCertificados(MSConsultasCertificados value) {
        return new JAXBElement<MSConsultasCertificados>(_MSConsultasCertificados_QNAME, MSConsultasCertificados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificadoAportacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificadoAportacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfCertificadoAportacion")
    public JAXBElement<ArrayOfCertificadoAportacion> createArrayOfCertificadoAportacion(ArrayOfCertificadoAportacion value) {
        return new JAXBElement<ArrayOfCertificadoAportacion>(_ArrayOfCertificadoAportacion_QNAME, ArrayOfCertificadoAportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificadoAportacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificadoAportacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CertificadoAportacion")
    public JAXBElement<CertificadoAportacion> createCertificadoAportacion(CertificadoAportacion value) {
        return new JAXBElement<CertificadoAportacion>(_CertificadoAportacion_QNAME, CertificadoAportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaSaldoAtm")
    public JAXBElement<MEConsultaSaldoAtm> createMEConsultaSaldoAtm(MEConsultaSaldoAtm value) {
        return new JAXBElement<MEConsultaSaldoAtm>(_MEConsultaSaldoAtm_QNAME, MEConsultaSaldoAtm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultaSaldoAtm")
    public JAXBElement<MSConsultaSaldoAtm> createMSConsultaSaldoAtm(MSConsultaSaldoAtm value) {
        return new JAXBElement<MSConsultaSaldoAtm>(_MSConsultaSaldoAtm_QNAME, MSConsultaSaldoAtm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransferenciaSpi")
    public JAXBElement<METransferenciaSpi> createMETransferenciaSpi(METransferenciaSpi value) {
        return new JAXBElement<METransferenciaSpi>(_METransferenciaSpi_QNAME, METransferenciaSpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransferenciaSpi")
    public JAXBElement<MSTransferenciaSpi> createMSTransferenciaSpi(MSTransferenciaSpi value) {
        return new JAXBElement<MSTransferenciaSpi>(_MSTransferenciaSpi_QNAME, MSTransferenciaSpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfBanco")
    public JAXBElement<ArrayOfBanco> createArrayOfBanco(ArrayOfBanco value) {
        return new JAXBElement<ArrayOfBanco>(_ArrayOfBanco_QNAME, ArrayOfBanco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Banco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Banco }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Banco")
    public JAXBElement<Banco> createBanco(Banco value) {
        return new JAXBElement<Banco>(_Banco_QNAME, Banco.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDepositos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDepositos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSDepositos")
    public JAXBElement<MSDepositos> createMSDepositos(MSDepositos value) {
        return new JAXBElement<MSDepositos>(_MSDepositos_QNAME, MSDepositos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MENotaDC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MENotaDC }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MENotaDC")
    public JAXBElement<MENotaDC> createMENotaDC(MENotaDC value) {
        return new JAXBElement<MENotaDC>(_MENotaDC_QNAME, MENotaDC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosChequeDevolver }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosChequeDevolver }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEDatosChequeDevolver")
    public JAXBElement<MEDatosChequeDevolver> createMEDatosChequeDevolver(MEDatosChequeDevolver value) {
        return new JAXBElement<MEDatosChequeDevolver>(_MEDatosChequeDevolver_QNAME, MEDatosChequeDevolver.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfChequeDevuelto")
    public JAXBElement<ArrayOfChequeDevuelto> createArrayOfChequeDevuelto(ArrayOfChequeDevuelto value) {
        return new JAXBElement<ArrayOfChequeDevuelto>(_ArrayOfChequeDevuelto_QNAME, ArrayOfChequeDevuelto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChequeDevuelto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChequeDevuelto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ChequeDevuelto")
    public JAXBElement<ChequeDevuelto> createChequeDevuelto(ChequeDevuelto value) {
        return new JAXBElement<ChequeDevuelto>(_ChequeDevuelto_QNAME, ChequeDevuelto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEDatosUsuario")
    public JAXBElement<MEDatosUsuario> createMEDatosUsuario(MEDatosUsuario value) {
        return new JAXBElement<MEDatosUsuario>(_MEDatosUsuario_QNAME, MEDatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSDatosUsuario")
    public JAXBElement<MSDatosUsuario> createMSDatosUsuario(MSDatosUsuario value) {
        return new JAXBElement<MSDatosUsuario>(_MSDatosUsuario_QNAME, MSDatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosCheques }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosCheques }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEDatosCheques")
    public JAXBElement<MEDatosCheques> createMEDatosCheques(MEDatosCheques value) {
        return new JAXBElement<MEDatosCheques>(_MEDatosCheques_QNAME, MEDatosCheques.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheque }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheque }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfCheque")
    public JAXBElement<ArrayOfCheque> createArrayOfCheque(ArrayOfCheque value) {
        return new JAXBElement<ArrayOfCheque>(_ArrayOfCheque_QNAME, ArrayOfCheque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferencia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransferencia")
    public JAXBElement<METransferencia> createMETransferencia(METransferencia value) {
        return new JAXBElement<METransferencia>(_METransferencia_QNAME, METransferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransferenciaPagoDirecto")
    public JAXBElement<METransferenciaPagoDirecto> createMETransferenciaPagoDirecto(METransferenciaPagoDirecto value) {
        return new JAXBElement<METransferenciaPagoDirecto>(_METransferenciaPagoDirecto_QNAME, METransferenciaPagoDirecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaPagoDirecto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransferenciaPagoDirecto")
    public JAXBElement<MSTransferenciaPagoDirecto> createMSTransferenciaPagoDirecto(MSTransferenciaPagoDirecto value) {
        return new JAXBElement<MSTransferenciaPagoDirecto>(_MSTransferenciaPagoDirecto_QNAME, MSTransferenciaPagoDirecto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEMonederoElectronico")
    public JAXBElement<MEMonederoElectronico> createMEMonederoElectronico(MEMonederoElectronico value) {
        return new JAXBElement<MEMonederoElectronico>(_MEMonederoElectronico_QNAME, MEMonederoElectronico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MonederoElectronico")
    public JAXBElement<MonederoElectronico> createMonederoElectronico(MonederoElectronico value) {
        return new JAXBElement<MonederoElectronico>(_MonederoElectronico_QNAME, MonederoElectronico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSMonederoElectronico")
    public JAXBElement<MSMonederoElectronico> createMSMonederoElectronico(MSMonederoElectronico value) {
        return new JAXBElement<MSMonederoElectronico>(_MSMonederoElectronico_QNAME, MSMonederoElectronico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransferenciaMonederoElectronico")
    public JAXBElement<METransferenciaMonederoElectronico> createMETransferenciaMonederoElectronico(METransferenciaMonederoElectronico value) {
        return new JAXBElement<METransferenciaMonederoElectronico>(_METransferenciaMonederoElectronico_QNAME, METransferenciaMonederoElectronico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransferenciaMonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransferenciaMonederoElectronico")
    public JAXBElement<MSTransferenciaMonederoElectronico> createMSTransferenciaMonederoElectronico(MSTransferenciaMonederoElectronico value) {
        return new JAXBElement<MSTransferenciaMonederoElectronico>(_MSTransferenciaMonederoElectronico_QNAME, MSTransferenciaMonederoElectronico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransaccionTarjetaDebito")
    public JAXBElement<METransaccionTarjetaDebito> createMETransaccionTarjetaDebito(METransaccionTarjetaDebito value) {
        return new JAXBElement<METransaccionTarjetaDebito>(_METransaccionTarjetaDebito_QNAME, METransaccionTarjetaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionTarjetaDebito")
    public JAXBElement<MSTransaccionTarjetaDebito> createMSTransaccionTarjetaDebito(MSTransaccionTarjetaDebito value) {
        return new JAXBElement<MSTransaccionTarjetaDebito>(_MSTransaccionTarjetaDebito_QNAME, MSTransaccionTarjetaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaTarjetaDebito")
    public JAXBElement<MEConsultaTarjetaDebito> createMEConsultaTarjetaDebito(MEConsultaTarjetaDebito value) {
        return new JAXBElement<MEConsultaTarjetaDebito>(_MEConsultaTarjetaDebito_QNAME, MEConsultaTarjetaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultaTarjetaDebito")
    public JAXBElement<MSConsultaTarjetaDebito> createMSConsultaTarjetaDebito(MSConsultaTarjetaDebito value) {
        return new JAXBElement<MSConsultaTarjetaDebito>(_MSConsultaTarjetaDebito_QNAME, MSConsultaTarjetaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECompensacionTarjetaDebito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECompensacionTarjetaDebito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MECompensacionTarjetaDebito")
    public JAXBElement<MECompensacionTarjetaDebito> createMECompensacionTarjetaDebito(MECompensacionTarjetaDebito value) {
        return new JAXBElement<MECompensacionTarjetaDebito>(_MECompensacionTarjetaDebito_QNAME, MECompensacionTarjetaDebito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransaccionCanales")
    public JAXBElement<METransaccionCanales> createMETransaccionCanales(METransaccionCanales value) {
        return new JAXBElement<METransaccionCanales>(_METransaccionCanales_QNAME, METransaccionCanales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TransaccionCanales")
    public JAXBElement<TransaccionCanales> createTransaccionCanales(TransaccionCanales value) {
        return new JAXBElement<TransaccionCanales>(_TransaccionCanales_QNAME, TransaccionCanales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionCanales")
    public JAXBElement<MSTransaccionCanales> createMSTransaccionCanales(MSTransaccionCanales value) {
        return new JAXBElement<MSTransaccionCanales>(_MSTransaccionCanales_QNAME, MSTransaccionCanales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECrearCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MECrearCuenta")
    public JAXBElement<MECrearCuenta> createMECrearCuenta(MECrearCuenta value) {
        return new JAXBElement<MECrearCuenta>(_MECrearCuenta_QNAME, MECrearCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSNumeroCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSNumeroCuenta")
    public JAXBElement<MSNumeroCuenta> createMSNumeroCuenta(MSNumeroCuenta value) {
        return new JAXBElement<MSNumeroCuenta>(_MSNumeroCuenta_QNAME, MSNumeroCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimularAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimularAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MESimularAhorro")
    public JAXBElement<MESimularAhorro> createMESimularAhorro(MESimularAhorro value) {
        return new JAXBElement<MESimularAhorro>(_MESimularAhorro_QNAME, MESimularAhorro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimularAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimularAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSSimularAhorro")
    public JAXBElement<MSSimularAhorro> createMSSimularAhorro(MSSimularAhorro value) {
        return new JAXBElement<MSSimularAhorro>(_MSSimularAhorro_QNAME, MSSimularAhorro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfRespuestaSimulacion")
    public JAXBElement<ArrayOfRespuestaSimulacion> createArrayOfRespuestaSimulacion(ArrayOfRespuestaSimulacion value) {
        return new JAXBElement<ArrayOfRespuestaSimulacion>(_ArrayOfRespuestaSimulacion_QNAME, ArrayOfRespuestaSimulacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RespuestaSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "RespuestaSimulacion")
    public JAXBElement<RespuestaSimulacion> createRespuestaSimulacion(RespuestaSimulacion value) {
        return new JAXBElement<RespuestaSimulacion>(_RespuestaSimulacion_QNAME, RespuestaSimulacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEAperturaAhorroProgramado")
    public JAXBElement<MEAperturaAhorroProgramado> createMEAperturaAhorroProgramado(MEAperturaAhorroProgramado value) {
        return new JAXBElement<MEAperturaAhorroProgramado>(_MEAperturaAhorroProgramado_QNAME, MEAperturaAhorroProgramado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSAperturaAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSAperturaAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSAperturaAhorroProgramado")
    public JAXBElement<MSAperturaAhorroProgramado> createMSAperturaAhorroProgramado(MSAperturaAhorroProgramado value) {
        return new JAXBElement<MSAperturaAhorroProgramado>(_MSAperturaAhorroProgramado_QNAME, MSAperturaAhorroProgramado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERenovacionAhorro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MERenovacionAhorro")
    public JAXBElement<MERenovacionAhorro> createMERenovacionAhorro(MERenovacionAhorro value) {
        return new JAXBElement<MERenovacionAhorro>(_MERenovacionAhorro_QNAME, MERenovacionAhorro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEPagoSpi")
    public JAXBElement<MEPagoSpi> createMEPagoSpi(MEPagoSpi value) {
        return new JAXBElement<MEPagoSpi>(_MEPagoSpi_QNAME, MEPagoSpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAperturaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAperturaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEAperturaCuenta")
    public JAXBElement<MEAperturaCuenta> createMEAperturaCuenta(MEAperturaCuenta value) {
        return new JAXBElement<MEAperturaCuenta>(_MEAperturaCuenta_QNAME, MEAperturaCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSAperturaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSAperturaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSAperturaCuenta")
    public JAXBElement<MSAperturaCuenta> createMSAperturaCuenta(MSAperturaCuenta value) {
        return new JAXBElement<MSAperturaCuenta>(_MSAperturaCuenta_QNAME, MSAperturaCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionPagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionPagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransaccionPagoServicios")
    public JAXBElement<METransaccionPagoServicios> createMETransaccionPagoServicios(METransaccionPagoServicios value) {
        return new JAXBElement<METransaccionPagoServicios>(_METransaccionPagoServicios_QNAME, METransaccionPagoServicios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "PagoServicios")
    public JAXBElement<PagoServicios> createPagoServicios(PagoServicios value) {
        return new JAXBElement<PagoServicios>(_PagoServicios_QNAME, PagoServicios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionPagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionPagoServicios")
    public JAXBElement<MSTransaccionPagoServicios> createMSTransaccionPagoServicios(MSTransaccionPagoServicios value) {
        return new JAXBElement<MSTransaccionPagoServicios>(_MSTransaccionPagoServicios_QNAME, MSTransaccionPagoServicios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldosTarjetasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSaldosTarjetasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaSaldosTarjetasCliente")
    public JAXBElement<MEConsultaSaldosTarjetasCliente> createMEConsultaSaldosTarjetasCliente(MEConsultaSaldosTarjetasCliente value) {
        return new JAXBElement<MEConsultaSaldosTarjetasCliente>(_MEConsultaSaldosTarjetasCliente_QNAME, MEConsultaSaldosTarjetasCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosTarjetas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasSaldosTarjetas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultasSaldosTarjetas")
    public JAXBElement<MSConsultasSaldosTarjetas> createMSConsultasSaldosTarjetas(MSConsultasSaldosTarjetas value) {
        return new JAXBElement<MSConsultasSaldosTarjetas>(_MSConsultasSaldosTarjetas_QNAME, MSConsultasSaldosTarjetas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfTarjeta")
    public JAXBElement<ArrayOfTarjeta> createArrayOfTarjeta(ArrayOfTarjeta value) {
        return new JAXBElement<ArrayOfTarjeta>(_ArrayOfTarjeta_QNAME, ArrayOfTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Tarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tarjeta")
    public JAXBElement<Tarjeta> createTarjeta(Tarjeta value) {
        return new JAXBElement<Tarjeta>(_Tarjeta_QNAME, Tarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEPagoTarjeta")
    public JAXBElement<MEPagoTarjeta> createMEPagoTarjeta(MEPagoTarjeta value) {
        return new JAXBElement<MEPagoTarjeta>(_MEPagoTarjeta_QNAME, MEPagoTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSPagoTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSPagoTarjeta")
    public JAXBElement<MSPagoTarjeta> createMSPagoTarjeta(MSPagoTarjeta value) {
        return new JAXBElement<MSPagoTarjeta>(_MSPagoTarjeta_QNAME, MSPagoTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaDatosTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaDatosTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaDatosTarjeta")
    public JAXBElement<MEConsultaDatosTarjeta> createMEConsultaDatosTarjeta(MEConsultaDatosTarjeta value) {
        return new JAXBElement<MEConsultaDatosTarjeta>(_MEConsultaDatosTarjeta_QNAME, MEConsultaDatosTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaDatosTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaDatosTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultaDatosTarjeta")
    public JAXBElement<MSConsultaDatosTarjeta> createMSConsultaDatosTarjeta(MSConsultaDatosTarjeta value) {
        return new JAXBElement<MSConsultaDatosTarjeta>(_MSConsultaDatosTarjeta_QNAME, MSConsultaDatosTarjeta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransaccionCorresponsales")
    public JAXBElement<METransaccionCorresponsales> createMETransaccionCorresponsales(METransaccionCorresponsales value) {
        return new JAXBElement<METransaccionCorresponsales>(_METransaccionCorresponsales_QNAME, METransaccionCorresponsales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TransaccionCorresponsales")
    public JAXBElement<TransaccionCorresponsales> createTransaccionCorresponsales(TransaccionCorresponsales value) {
        return new JAXBElement<TransaccionCorresponsales>(_TransaccionCorresponsales_QNAME, TransaccionCorresponsales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionCorresponsales")
    public JAXBElement<MSTransaccionCorresponsales> createMSTransaccionCorresponsales(MSTransaccionCorresponsales value) {
        return new JAXBElement<MSTransaccionCorresponsales>(_MSTransaccionCorresponsales_QNAME, MSTransaccionCorresponsales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaMovimientosCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaMovimientosCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultaMovimientosCorresponsales")
    public JAXBElement<MSConsultaMovimientosCorresponsales> createMSConsultaMovimientosCorresponsales(MSConsultaMovimientosCorresponsales value) {
        return new JAXBElement<MSConsultaMovimientosCorresponsales>(_MSConsultaMovimientosCorresponsales_QNAME, MSConsultaMovimientosCorresponsales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentosCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEDocumentosCuenta")
    public JAXBElement<MEDocumentosCuenta> createMEDocumentosCuenta(MEDocumentosCuenta value) {
        return new JAXBElement<MEDocumentosCuenta>(_MEDocumentosCuenta_QNAME, MEDocumentosCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaCuenta")
    public JAXBElement<MEConsultaCuenta> createMEConsultaCuenta(MEConsultaCuenta value) {
        return new JAXBElement<MEConsultaCuenta>(_MEConsultaCuenta_QNAME, MEConsultaCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionRecibida }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionRecibida }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionRecibida")
    public JAXBElement<MSTransaccionRecibida> createMSTransaccionRecibida(MSTransaccionRecibida value) {
        return new JAXBElement<MSTransaccionRecibida>(_MSTransaccionRecibida_QNAME, MSTransaccionRecibida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METransaccionKisko }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "METransaccionKisko")
    public JAXBElement<METransaccionKisko> createMETransaccionKisko(METransaccionKisko value) {
        return new JAXBElement<METransaccionKisko>(_METransaccionKisko_QNAME, METransaccionKisko.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTransaccionKiosko }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSTransaccionKiosko")
    public JAXBElement<MSTransaccionKiosko> createMSTransaccionKiosko(MSTransaccionKiosko value) {
        return new JAXBElement<MSTransaccionKiosko>(_MSTransaccionKiosko_QNAME, MSTransaccionKiosko.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSDocumentoCuenta")
    public JAXBElement<MSDocumentoCuenta> createMSDocumentoCuenta(MSDocumentoCuenta value) {
        return new JAXBElement<MSDocumentoCuenta>(_MSDocumentoCuenta_QNAME, MSDocumentoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaTransferenciasSPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEConsultaTransferenciasSPI")
    public JAXBElement<MEConsultaTransferenciasSPI> createMEConsultaTransferenciasSPI(MEConsultaTransferenciasSPI value) {
        return new JAXBElement<MEConsultaTransferenciasSPI>(_MEConsultaTransferenciasSPI_QNAME, MEConsultaTransferenciasSPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaTransferenciasSPI }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaTransferenciasSPI }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MSConsultaTransferenciasSPI")
    public JAXBElement<MSConsultaTransferenciasSPI> createMSConsultaTransferenciasSPI(MSConsultaTransferenciasSPI value) {
        return new JAXBElement<MSConsultaTransferenciasSPI>(_MSConsultaTransferenciasSPI_QNAME, MSConsultaTransferenciasSPI.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArrayOfDetalleSpi")
    public JAXBElement<ArrayOfDetalleSpi> createArrayOfDetalleSpi(ArrayOfDetalleSpi value) {
        return new JAXBElement<ArrayOfDetalleSpi>(_ArrayOfDetalleSpi_QNAME, ArrayOfDetalleSpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DetalleSpi")
    public JAXBElement<DetalleSpi> createDetalleSpi(DetalleSpi value) {
        return new JAXBElement<DetalleSpi>(_DetalleSpi_QNAME, DetalleSpi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEContratoCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEContratoCuenta")
    public JAXBElement<MEContratoCuenta> createMEContratoCuenta(MEContratoCuenta value) {
        return new JAXBElement<MEContratoCuenta>(_MEContratoCuenta_QNAME, MEContratoCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEstadoCuentaDigital }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEstadoCuentaDigital }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MEEstadoCuentaDigital")
    public JAXBElement<MEEstadoCuentaDigital> createMEEstadoCuentaDigital(MEEstadoCuentaDigital value) {
        return new JAXBElement<MEEstadoCuentaDigital>(_MEEstadoCuentaDigital_QNAME, MEEstadoCuentaDigital.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosGeneralesCliente")
    public JAXBElement<DatosGeneralesCliente> createDatosGeneralesCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_DatosGeneralesCliente_QNAME, DatosGeneralesCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEConsultasCliente")
    public JAXBElement<MEConsultasCliente> createMEConsultasCliente(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_MEConsultasCliente_QNAME, MEConsultasCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "METelefono")
    public JAXBElement<METelefono> createMETelefono(METelefono value) {
        return new JAXBElement<METelefono>(_METelefono_QNAME, METelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MECreacionCliente")
    public JAXBElement<MECreacionCliente> createMECreacionCliente(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_MECreacionCliente_QNAME, MECreacionCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfRedSocial")
    public JAXBElement<ArrayOfRedSocial> createArrayOfRedSocial(ArrayOfRedSocial value) {
        return new JAXBElement<ArrayOfRedSocial>(_ArrayOfRedSocial_QNAME, ArrayOfRedSocial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedSocial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RedSocial }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RedSocial")
    public JAXBElement<RedSocial> createRedSocial(RedSocial value) {
        return new JAXBElement<RedSocial>(_RedSocial_QNAME, RedSocial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ResidenciaFiscal")
    public JAXBElement<ResidenciaFiscal> createResidenciaFiscal(ResidenciaFiscal value) {
        return new JAXBElement<ResidenciaFiscal>(_ResidenciaFiscal_QNAME, ResidenciaFiscal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Calle", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCalle(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCalle_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadResidencia", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCiudadResidencia(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCiudadResidencia_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoCiudadNacimiento", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCodigoCiudadNacimiento(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCodigoCiudadNacimiento_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoPais", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCodigoPais(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCodigoPais_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoPostal", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCodigoPostal(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCodigoPostal_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoTipoIdentificacion", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalCodigoTipoIdentificacion(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalCodigoTipoIdentificacion_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DireccionAdicionalReferencia", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalDireccionAdicionalReferencia(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalDireccionAdicionalReferencia_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroDomicilio", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalNumeroDomicilio(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalNumeroDomicilio_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroIdentificacion", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalNumeroIdentificacion_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoPersona", scope = ResidenciaFiscal.class)
    public JAXBElement<String> createResidenciaFiscalTipoPersona(String value) {
        return new JAXBElement<String>(_ResidenciaFiscalTipoPersona_QNAME, String.class, ResidenciaFiscal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoRedSocial", scope = RedSocial.class)
    public JAXBElement<String> createRedSocialCodigoRedSocial(String value) {
        return new JAXBElement<String>(_RedSocialCodigoRedSocial_QNAME, String.class, RedSocial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = RedSocial.class)
    public JAXBElement<String> createRedSocialObservaciones(String value) {
        return new JAXBElement<String>(_RedSocialObservaciones_QNAME, String.class, RedSocial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Usuario", scope = RedSocial.class)
    public JAXBElement<String> createRedSocialUsuario(String value) {
        return new JAXBElement<String>(_RedSocialUsuario_QNAME, String.class, RedSocial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Actividad", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteActividad(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteActividad_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ciudad", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteCiudad(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteCiudad_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DescripcionEstadoCivil", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteDescripcionEstadoCivil(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteDescripcionEstadoCivil_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Direccion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteDireccion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteDireccion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteEmail(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteEmail_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Estado", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteEstado(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteEstado_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaNacimiento", scope = DatosGeneralesCliente.class)
    public JAXBElement<XMLGregorianCalendar> createDatosGeneralesClienteFechaNacimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosGeneralesClienteFechaNacimiento_QNAME, XMLGregorianCalendar.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Genero", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteGenero(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteGenero_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteIdentificacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteIdentificacion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionConyuge", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteIdentificacionConyuge_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreConyuge", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteNombreConyuge(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteNombreConyuge_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteNombres(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteNombres_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroCargas", scope = DatosGeneralesCliente.class)
    public JAXBElement<Integer> createDatosGeneralesClienteNumeroCargas(Integer value) {
        return new JAXBElement<Integer>(_DatosGeneralesClienteNumeroCargas_QNAME, Integer.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OficinaCreacion", scope = DatosGeneralesCliente.class)
    public JAXBElement<Integer> createDatosGeneralesClienteOficinaCreacion(Integer value) {
        return new JAXBElement<Integer>(_DatosGeneralesClienteOficinaCreacion_QNAME, Integer.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Profesion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteProfesion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteProfesion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Telefono", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTelefono(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTelefono_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoEducacion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTipoEducacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoEducacion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoEducacionConyuge", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTipoEducacionConyuge(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoEducacionConyuge_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoIdentificacion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTipoIdentificacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoIdentificacion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoRelacion", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTipoRelacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoRelacion_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoVivienda", scope = DatosGeneralesCliente.class)
    public JAXBElement<String> createDatosGeneralesClienteTipoVivienda(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoVivienda_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionEstado", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiDescripcionEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiDescripcionEstado_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Estado", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiEstado_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProceso", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiFechaProceso(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaProceso_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProcesoBce", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiFechaProcesoBce(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaProcesoBce_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaTransferencia", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiFechaTransferencia(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaTransferencia_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaOrdenante", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiNumeroCuentaOrdenante(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroCuentaOrdenante_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaReceptora", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiNumeroCuentaReceptora(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroCuentaReceptora_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroReferenciaBce", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiNumeroReferenciaBce(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroReferenciaBce_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroReferenciaOrdenante", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiNumeroReferenciaOrdenante(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroReferenciaOrdenante_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroSecuencialBce", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiNumeroSecuencialBce(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroSecuencialBce_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Resultado", scope = DetalleSpi.class)
    public JAXBElement<String> createDetalleSpiResultado(String value) {
        return new JAXBElement<String>(_DetalleSpiResultado_QNAME, String.class, DetalleSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCliente", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesCuentaCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesCuentaCliente_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCorresponsal", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesCuentaCorresponsal(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesCuentaCorresponsal_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaProveedor", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesCuentaProveedor(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesCuentaProveedor_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogCredito", scope = TransaccionCorresponsales.class)
    public JAXBElement<Integer> createTransaccionCorresponsalesIdLogCredito(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCorresponsalesIdLogCredito_QNAME, Integer.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogDebito", scope = TransaccionCorresponsales.class)
    public JAXBElement<Integer> createTransaccionCorresponsalesIdLogDebito(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCorresponsalesIdLogDebito_QNAME, Integer.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCliente", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesIdentificacionCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCliente_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCorresponsal", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesIdentificacionCorresponsal(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCorresponsal_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroOperacion", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesNumeroOperacion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesNumeroOperacion_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialTransaccion", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesSecuencialTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesSecuencialTransaccion_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuentaCliente", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesTipoCuentaCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesTipoCuentaCliente_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuentaCorresponsal", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesTipoCuentaCorresponsal(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesTipoCuentaCorresponsal_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoTransaccion", scope = TransaccionCorresponsales.class)
    public JAXBElement<String> createTransaccionCorresponsalesTipoTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesTipoTransaccion_QNAME, String.class, TransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = Tarjeta.class)
    public JAXBElement<String> createTarjetaIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, Tarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ConceptoTransaccion", scope = PagoServicios.class)
    public JAXBElement<String> createPagoServiciosConceptoTransaccion(String value) {
        return new JAXBElement<String>(_PagoServiciosConceptoTransaccion_QNAME, String.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCliente", scope = PagoServicios.class)
    public JAXBElement<String> createPagoServiciosCuentaCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesCuentaCliente_QNAME, String.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogCredito", scope = PagoServicios.class)
    public JAXBElement<Integer> createPagoServiciosIdLogCredito(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCorresponsalesIdLogCredito_QNAME, Integer.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogDebito", scope = PagoServicios.class)
    public JAXBElement<Integer> createPagoServiciosIdLogDebito(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCorresponsalesIdLogDebito_QNAME, Integer.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialTransaccion", scope = PagoServicios.class)
    public JAXBElement<String> createPagoServiciosSecuencialTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesSecuencialTransaccion_QNAME, String.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoTransaccion", scope = PagoServicios.class)
    public JAXBElement<String> createPagoServiciosTipoTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesTipoTransaccion_QNAME, String.class, PagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Causal", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCausal(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCausal_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoAdquiriente", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoAdquiriente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoAdquiriente_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoAutorizador", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoAutorizador(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoAutorizador_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoError", scope = TransaccionCanales.class)
    public JAXBElement<Integer> createTransaccionCanalesCodigoError(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCanalesCodigoError_QNAME, Integer.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoMoneda", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoMoneda(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoMoneda_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoPais", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoPais(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoPais_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoRedAdq", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoRedAdq(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoRedAdq_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoSucursal", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoSucursal(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoSucursal_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoTransaccion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCodigoTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCodigoTransaccion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCredito", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCuentaCredito(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCuentaCredito_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaDebito", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesCuentaDebito(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCuentaDebito_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosTansaccion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesDatosTansaccion(String value) {
        return new JAXBElement<String>(_TransaccionCanalesDatosTansaccion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ErrorProcesamiento", scope = TransaccionCanales.class)
    public JAXBElement<Integer> createTransaccionCanalesErrorProcesamiento(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCanalesErrorProcesamiento_QNAME, Integer.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaCaptura", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesFechaCaptura(String value) {
        return new JAXBElement<String>(_TransaccionCanalesFechaCaptura_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaCompensacion", scope = TransaccionCanales.class)
    public JAXBElement<XMLGregorianCalendar> createTransaccionCanalesFechaCompensacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransaccionCanalesFechaCompensacion_QNAME, XMLGregorianCalendar.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaContable", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesFechaContable(String value) {
        return new JAXBElement<String>(_TransaccionCanalesFechaContable_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaHoraLocal", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesFechaHoraLocal(String value) {
        return new JAXBElement<String>(_TransaccionCanalesFechaHoraLocal_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaHoraTransaccion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesFechaHoraTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCanalesFechaHoraTransaccion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProcesamiento", scope = TransaccionCanales.class)
    public JAXBElement<XMLGregorianCalendar> createTransaccionCanalesFechaProcesamiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransaccionCanalesFechaProcesamiento_QNAME, XMLGregorianCalendar.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProceso", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesFechaProceso(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaProceso_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogCompensacion", scope = TransaccionCanales.class)
    public JAXBElement<Integer> createTransaccionCanalesIdLogCompensacion(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCanalesIdLogCompensacion_QNAME, Integer.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdLogTransaccion", scope = TransaccionCanales.class)
    public JAXBElement<Integer> createTransaccionCanalesIdLogTransaccion(Integer value) {
        return new JAXBElement<Integer>(_TransaccionCanalesIdLogTransaccion_QNAME, Integer.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Localizacion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesLocalizacion(String value) {
        return new JAXBElement<String>(_TransaccionCanalesLocalizacion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "LoginCompensacion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesLoginCompensacion(String value) {
        return new JAXBElement<String>(_TransaccionCanalesLoginCompensacion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "LoginRegistro", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesLoginRegistro(String value) {
        return new JAXBElement<String>(_TransaccionCanalesLoginRegistro_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTarjeta", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesNumeroTarjeta(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNumeroTarjeta_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTerminal", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesNumeroTerminal(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNumeroTerminal_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Respuesta", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesRespuesta(String value) {
        return new JAXBElement<String>(_TransaccionCanalesRespuesta_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialTransaccion", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesSecuencialTransaccion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesSecuencialTransaccion_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoMensaje", scope = TransaccionCanales.class)
    public JAXBElement<String> createTransaccionCanalesTipoMensaje(String value) {
        return new JAXBElement<String>(_TransaccionCanalesTipoMensaje_QNAME, String.class, TransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "EmailCliente", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoEmailCliente(String value) {
        return new JAXBElement<String>(_MonederoElectronicoEmailCliente_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCuenta", scope = MonederoElectronico.class)
    public JAXBElement<Integer> createMonederoElectronicoIdCuenta(Integer value) {
        return new JAXBElement<Integer>(_MonederoElectronicoIdCuenta_QNAME, Integer.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdOperadora", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoIdOperadora(String value) {
        return new JAXBElement<String>(_MonederoElectronicoIdOperadora_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdTelefono", scope = MonederoElectronico.class)
    public JAXBElement<Integer> createMonederoElectronicoIdTelefono(Integer value) {
        return new JAXBElement<Integer>(_MonederoElectronicoIdTelefono_QNAME, Integer.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCliente", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoIdentificacionCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCliente_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTelefono", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoNumeroTelefono(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroTelefono_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Operadora", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoOperadora(String value) {
        return new JAXBElement<String>(_MonederoElectronicoOperadora_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Otp", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoOtp(String value) {
        return new JAXBElement<String>(_MonederoElectronicoOtp_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuenta", scope = MonederoElectronico.class)
    public JAXBElement<String> createMonederoElectronicoTipoCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoTipoCuenta_QNAME, String.class, MonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuenta", scope = ChequeDevuelto.class)
    public JAXBElement<String> createChequeDevueltoCuenta(String value) {
        return new JAXBElement<String>(_Cuenta_QNAME, String.class, ChequeDevuelto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCheque", scope = ChequeDevuelto.class)
    public JAXBElement<String> createChequeDevueltoCuentaCheque(String value) {
        return new JAXBElement<String>(_ChequeDevueltoCuentaCheque_QNAME, String.class, ChequeDevuelto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroPapeleta", scope = ChequeDevuelto.class)
    public JAXBElement<String> createChequeDevueltoNumeroPapeleta(String value) {
        return new JAXBElement<String>(_ChequeDevueltoNumeroPapeleta_QNAME, String.class, ChequeDevuelto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CodigoNegocio", scope = CatalogoItem.class)
    public JAXBElement<String> createCatalogoItemCodigoNegocio(String value) {
        return new JAXBElement<String>(_CatalogoItemCodigoNegocio_QNAME, String.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CodigoNegocioPadre", scope = CatalogoItem.class)
    public JAXBElement<String> createCatalogoItemCodigoNegocioPadre(String value) {
        return new JAXBElement<String>(_CatalogoItemCodigoNegocioPadre_QNAME, String.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CodigosNegocioNiveles", scope = CatalogoItem.class)
    public JAXBElement<String> createCatalogoItemCodigosNegocioNiveles(String value) {
        return new JAXBElement<String>(_CatalogoItemCodigosNegocioNiveles_QNAME, String.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Descripcion", scope = CatalogoItem.class)
    public JAXBElement<String> createCatalogoItemDescripcion(String value) {
        return new JAXBElement<String>(_CatalogoItemDescripcion_QNAME, String.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Id", scope = CatalogoItem.class)
    public JAXBElement<Integer> createCatalogoItemId(Integer value) {
        return new JAXBElement<Integer>(_CatalogoItemId_QNAME, Integer.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdCodigoPadre", scope = CatalogoItem.class)
    public JAXBElement<Integer> createCatalogoItemIdCodigoPadre(Integer value) {
        return new JAXBElement<Integer>(_CatalogoItemIdCodigoPadre_QNAME, Integer.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "NivelSeleccionado", scope = CatalogoItem.class)
    public JAXBElement<Short> createCatalogoItemNivelSeleccionado(Short value) {
        return new JAXBElement<Short>(_CatalogoItemNivelSeleccionado_QNAME, Short.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Parametro1", scope = CatalogoItem.class)
    public JAXBElement<Integer> createCatalogoItemParametro1(Integer value) {
        return new JAXBElement<Integer>(_CatalogoItemParametro1_QNAME, Integer.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Parametro4", scope = CatalogoItem.class)
    public JAXBElement<Integer> createCatalogoItemParametro4(Integer value) {
        return new JAXBElement<Integer>(_CatalogoItemParametro4_QNAME, Integer.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Parametro5", scope = CatalogoItem.class)
    public JAXBElement<String> createCatalogoItemParametro5(String value) {
        return new JAXBElement<String>(_CatalogoItemParametro5_QNAME, String.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "UltimoNivel", scope = CatalogoItem.class)
    public JAXBElement<Boolean> createCatalogoItemUltimoNivel(Boolean value) {
        return new JAXBElement<Boolean>(_CatalogoItemUltimoNivel_QNAME, Boolean.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Vigente", scope = CatalogoItem.class)
    public JAXBElement<Boolean> createCatalogoItemVigente(Boolean value) {
        return new JAXBElement<Boolean>(_CatalogoItemVigente_QNAME, Boolean.class, CatalogoItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoBce", scope = Banco.class)
    public JAXBElement<String> createBancoCodigoBce(String value) {
        return new JAXBElement<String>(_BancoCodigoBce_QNAME, String.class, Banco.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionEstado", scope = CertificadoAportacion.class)
    public JAXBElement<String> createCertificadoAportacionDescripcionEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiDescripcionEstado_QNAME, String.class, CertificadoAportacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Numero", scope = CertificadoAportacion.class)
    public JAXBElement<String> createCertificadoAportacionNumero(String value) {
        return new JAXBElement<String>(_CertificadoAportacionNumero_QNAME, String.class, CertificadoAportacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tipo", scope = CertificadoAportacion.class)
    public JAXBElement<String> createCertificadoAportacionTipo(String value) {
        return new JAXBElement<String>(_CertificadoAportacionTipo_QNAME, String.class, CertificadoAportacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Causal", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoCausal(String value) {
        return new JAXBElement<String>(_TransaccionCanalesCausal_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Comprobante", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoComprobante(String value) {
        return new JAXBElement<String>(_MovimientoComprobante_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProceso", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoFechaProceso(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaProceso_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaRegistro", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoFechaRegistro(String value) {
        return new JAXBElement<String>(_MovimientoFechaRegistro_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "HoraRegistro", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoHoraRegistro(String value) {
        return new JAXBElement<String>(_MovimientoHoraRegistro_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCausal", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoNombreCausal(String value) {
        return new JAXBElement<String>(_MovimientoNombreCausal_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreOficina", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoNombreOficina(String value) {
        return new JAXBElement<String>(_MovimientoNombreOficina_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreTransaccion", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoNombreTransaccion(String value) {
        return new JAXBElement<String>(_MovimientoNombreTransaccion_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "OficinaOrigen", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoOficinaOrigen(String value) {
        return new JAXBElement<String>(_MovimientoOficinaOrigen_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Reversada", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoReversada(String value) {
        return new JAXBElement<String>(_MovimientoReversada_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Reverso", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoReverso(String value) {
        return new JAXBElement<String>(_MovimientoReverso_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Sucursal", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoSucursal(String value) {
        return new JAXBElement<String>(_MovimientoSucursal_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SufijoCuenta", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoSufijoCuenta(String value) {
        return new JAXBElement<String>(_MovimientoSufijoCuenta_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoTransaccion(String value) {
        return new JAXBElement<String>(_MovimientoTransaccion_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Usuario", scope = Movimiento.class)
    public JAXBElement<String> createMovimientoUsuario(String value) {
        return new JAXBElement<String>(_MovimientoUsuario_QNAME, String.class, Movimiento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaDesde", scope = DetalleInteresDiario.class)
    public JAXBElement<String> createDetalleInteresDiarioFechaDesde(String value) {
        return new JAXBElement<String>(_DetalleInteresDiarioFechaDesde_QNAME, String.class, DetalleInteresDiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaHasta", scope = DetalleInteresDiario.class)
    public JAXBElement<String> createDetalleInteresDiarioFechaHasta(String value) {
        return new JAXBElement<String>(_DetalleInteresDiarioFechaHasta_QNAME, String.class, DetalleInteresDiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdPadre", scope = DetalleInteresDiario.class)
    public JAXBElement<String> createDetalleInteresDiarioIdPadre(String value) {
        return new JAXBElement<String>(_DetalleInteresDiarioIdPadre_QNAME, String.class, DetalleInteresDiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = DetalleInteresDiario.class)
    public JAXBElement<String> createDetalleInteresDiarioNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, DetalleInteresDiario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "EstadoCuota", scope = DatosCuotasAhorroProgramado.class)
    public JAXBElement<String> createDatosCuotasAhorroProgramadoEstadoCuota(String value) {
        return new JAXBElement<String>(_DatosCuotasAhorroProgramadoEstadoCuota_QNAME, String.class, DatosCuotasAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaPago", scope = DatosCuotasAhorroProgramado.class)
    public JAXBElement<XMLGregorianCalendar> createDatosCuotasAhorroProgramadoFechaPago(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosCuotasAhorroProgramadoFechaPago_QNAME, XMLGregorianCalendar.class, DatosCuotasAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Fecha", scope = LineaPendienteLibreta.class)
    public JAXBElement<String> createLineaPendienteLibretaFecha(String value) {
        return new JAXBElement<String>(_LineaPendienteLibretaFecha_QNAME, String.class, LineaPendienteLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nemonico", scope = LineaPendienteLibreta.class)
    public JAXBElement<String> createLineaPendienteLibretaNemonico(String value) {
        return new JAXBElement<String>(_LineaPendienteLibretaNemonico_QNAME, String.class, LineaPendienteLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = NotaDebitoCreditoAtm.class)
    public JAXBElement<String> createNotaDebitoCreditoAtmNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, NotaDebitoCreditoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = NotaDebitoCreditoAtm.class)
    public JAXBElement<String> createNotaDebitoCreditoAtmReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, NotaDebitoCreditoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = NotaDebitoCreditoAtm.class)
    public JAXBElement<String> createNotaDebitoCreditoAtmReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, NotaDebitoCreditoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Oficina", scope = ResultadoNdNc.class)
    public JAXBElement<String> createResultadoNdNcOficina(String value) {
        return new JAXBElement<String>(_ResultadoNdNcOficina_QNAME, String.class, ResultadoNdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionEstado", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaDescripcionEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiDescripcionEstado_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionSubProducto", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaDescripcionSubProducto(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaDescripcionSubProducto_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombre", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaNombre(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNombre_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Numero", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaNumero(String value) {
        return new JAXBElement<String>(_CertificadoAportacionNumero_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroLibreta", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaNumeroLibreta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNumeroLibreta_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "OficinaCuenta", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaOficinaCuenta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaOficinaCuenta_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoIdentificacion", scope = DatosGeneralesCuenta.class)
    public JAXBElement<String> createDatosGeneralesCuentaTipoIdentificacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaTipoIdentificacion_QNAME, String.class, DatosGeneralesCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCausalRetencion", scope = NotaDebitoCredito.class)
    public JAXBElement<Short> createNotaDebitoCreditoIdCausalRetencion(Short value) {
        return new JAXBElement<Short>(_NotaDebitoCreditoIdCausalRetencion_QNAME, Short.class, NotaDebitoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = NotaDebitoCredito.class)
    public JAXBElement<String> createNotaDebitoCreditoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, NotaDebitoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = NotaDebitoCredito.class)
    public JAXBElement<String> createNotaDebitoCreditoReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, NotaDebitoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = NotaDebitoCredito.class)
    public JAXBElement<String> createNotaDebitoCreditoReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, NotaDebitoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaCheque", scope = Cheque.class)
    public JAXBElement<String> createChequeCuentaCheque(String value) {
        return new JAXBElement<String>(_ChequeDevueltoCuentaCheque_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaDeposito", scope = Cheque.class)
    public JAXBElement<String> createChequeCuentaDeposito(String value) {
        return new JAXBElement<String>(_ChequeCuentaDeposito_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionBanco", scope = Cheque.class)
    public JAXBElement<String> createChequeDescripcionBanco(String value) {
        return new JAXBElement<String>(_ChequeDescripcionBanco_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaProceso", scope = Cheque.class)
    public JAXBElement<String> createChequeFechaProceso(String value) {
        return new JAXBElement<String>(_DetalleSpiFechaProceso_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Papeleta", scope = Cheque.class)
    public JAXBElement<String> createChequePapeleta(String value) {
        return new JAXBElement<String>(_ChequePapeleta_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Pin", scope = Cheque.class)
    public JAXBElement<String> createChequePin(String value) {
        return new JAXBElement<String>(_ChequePin_QNAME, String.class, Cheque.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Apellidos", scope = DatosUsuario.class)
    public JAXBElement<String> createDatosUsuarioApellidos(String value) {
        return new JAXBElement<String>(_DatosUsuarioApellidos_QNAME, String.class, DatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreFuncionario", scope = DatosUsuario.class)
    public JAXBElement<String> createDatosUsuarioNombreFuncionario(String value) {
        return new JAXBElement<String>(_DatosUsuarioNombreFuncionario_QNAME, String.class, DatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombres", scope = DatosUsuario.class)
    public JAXBElement<String> createDatosUsuarioNombres(String value) {
        return new JAXBElement<String>(_DatosUsuarioNombres_QNAME, String.class, DatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdTransaccion", scope = TotalDeposito.class)
    public JAXBElement<String> createTotalDepositoIdTransaccion(String value) {
        return new JAXBElement<String>(_TotalDepositoIdTransaccion_QNAME, String.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = TotalDeposito.class)
    public JAXBElement<String> createTotalDepositoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = TotalDeposito.class)
    public JAXBElement<String> createTotalDepositoReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Secuencial", scope = TotalDeposito.class)
    public JAXBElement<String> createTotalDepositoSecuencial(String value) {
        return new JAXBElement<String>(_TotalDepositoSecuencial_QNAME, String.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TotalCheques", scope = TotalDeposito.class)
    public JAXBElement<BigDecimal> createTotalDepositoTotalCheques(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalDepositoTotalCheques_QNAME, BigDecimal.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TotalEfectivo", scope = TotalDeposito.class)
    public JAXBElement<BigDecimal> createTotalDepositoTotalEfectivo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalDepositoTotalEfectivo_QNAME, BigDecimal.class, TotalDeposito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaRetencion", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosFechaRetencion(String value) {
        return new JAXBElement<String>(_DatosSaldosFechaRetencion_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio1", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio1(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio1_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio2", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio2(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio2_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio3", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio3(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio3_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio4", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio4(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio4_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio5", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio5(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio5_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedio6", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedio6(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedio6_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePromedioSemestral", scope = DatosSaldos.class)
    public JAXBElement<String> createDatosSaldosNombrePromedioSemestral(String value) {
        return new JAXBElement<String>(_DatosSaldosNombrePromedioSemestral_QNAME, String.class, DatosSaldos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoRolCliente", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionCodigoRolCliente(String value) {
        return new JAXBElement<String>(_ClienteCondicionCodigoRolCliente_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "EmailCliente", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionEmailCliente(String value) {
        return new JAXBElement<String>(_MonederoElectronicoEmailCliente_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "RolCliente", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionRolCliente(String value) {
        return new JAXBElement<String>(_ClienteCondicionRolCliente_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TelefonoSMSCliente", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionTelefonoSMSCliente(String value) {
        return new JAXBElement<String>(_ClienteCondicionTelefonoSMSCliente_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tipo", scope = ClienteCondicion.class)
    public JAXBElement<String> createClienteCondicionTipo(String value) {
        return new JAXBElement<String>(_CertificadoAportacionTipo_QNAME, String.class, ClienteCondicion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoRol", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteCodigoRol(String value) {
        return new JAXBElement<String>(_IntervinienteCodigoRol_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteCondicion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClienteCondicion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CondicionGiroCliente", scope = Interviniente.class)
    public JAXBElement<ClienteCondicion> createIntervinienteCondicionGiroCliente(ClienteCondicion value) {
        return new JAXBElement<ClienteCondicion>(_IntervinienteCondicionGiroCliente_QNAME, ClienteCondicion.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Email", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteEmail(String value) {
        return new JAXBElement<String>(_IntervinienteEmail_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreRol", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteNombreRol(String value) {
        return new JAXBElement<String>(_IntervinienteNombreRol_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TelefonoSMS", scope = Interviniente.class)
    public JAXBElement<String> createIntervinienteTelefonoSMS(String value) {
        return new JAXBElement<String>(_IntervinienteTelefonoSMS_QNAME, String.class, Interviniente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "AnexoNombre", scope = Cuenta.class)
    public JAXBElement<String> createCuentaAnexoNombre(String value) {
        return new JAXBElement<String>(_CuentaAnexoNombre_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CampoSib", scope = Cuenta.class)
    public JAXBElement<String> createCuentaCampoSib(String value) {
        return new JAXBElement<String>(_CuentaCampoSib_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoIso", scope = Cuenta.class)
    public JAXBElement<String> createCuentaCodigoIso(String value) {
        return new JAXBElement<String>(_CuentaCodigoIso_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoProducto", scope = Cuenta.class)
    public JAXBElement<String> createCuentaCodigoProducto(String value) {
        return new JAXBElement<String>(_CuentaCodigoProducto_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoSubproducto", scope = Cuenta.class)
    public JAXBElement<String> createCuentaCodigoSubproducto(String value) {
        return new JAXBElement<String>(_CuentaCodigoSubproducto_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Comentario", scope = Cuenta.class)
    public JAXBElement<String> createCuentaComentario(String value) {
        return new JAXBElement<String>(_CuentaComentario_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionMoneda", scope = Cuenta.class)
    public JAXBElement<String> createCuentaDescripcionMoneda(String value) {
        return new JAXBElement<String>(_CuentaDescripcionMoneda_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionSubProducto", scope = Cuenta.class)
    public JAXBElement<String> createCuentaDescripcionSubProducto(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaDescripcionSubProducto_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Estado", scope = Cuenta.class)
    public JAXBElement<String> createCuentaEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiEstado_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaApertura", scope = Cuenta.class)
    public JAXBElement<String> createCuentaFechaApertura(String value) {
        return new JAXBElement<String>(_CuentaFechaApertura_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaFinAsociacion", scope = Cuenta.class)
    public JAXBElement<XMLGregorianCalendar> createCuentaFechaFinAsociacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CuentaFechaFinAsociacion_QNAME, XMLGregorianCalendar.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaFinContrato", scope = Cuenta.class)
    public JAXBElement<XMLGregorianCalendar> createCuentaFechaFinContrato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CuentaFechaFinContrato_QNAME, XMLGregorianCalendar.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaInicioContrato", scope = Cuenta.class)
    public JAXBElement<XMLGregorianCalendar> createCuentaFechaInicioContrato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CuentaFechaInicioContrato_QNAME, XMLGregorianCalendar.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Historico", scope = Cuenta.class)
    public JAXBElement<Boolean> createCuentaHistorico(Boolean value) {
        return new JAXBElement<Boolean>(_CuentaHistorico_QNAME, Boolean.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdAreaOficial", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdAreaOficial(Short value) {
        return new JAXBElement<Short>(_CuentaIdAreaOficial_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdBanca", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdBanca(Short value) {
        return new JAXBElement<Short>(_CuentaIdBanca_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCliente", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaIdCliente(Integer value) {
        return new JAXBElement<Integer>(_CuentaIdCliente_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdClientePrincipal", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaIdClientePrincipal(Integer value) {
        return new JAXBElement<Integer>(_CuentaIdClientePrincipal_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdFilial", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdFilial(Short value) {
        return new JAXBElement<Short>(_CuentaIdFilial_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdMoneda", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdMoneda(Short value) {
        return new JAXBElement<Short>(_CuentaIdMoneda_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdOficialAdministrador", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaIdOficialAdministrador(Integer value) {
        return new JAXBElement<Integer>(_CuentaIdOficialAdministrador_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdOficinaOficial", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdOficinaOficial(Short value) {
        return new JAXBElement<Short>(_CuentaIdOficinaOficial_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdProducto", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdProducto(Short value) {
        return new JAXBElement<Short>(_CuentaIdProducto_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdSectorBce", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaIdSectorBce(Integer value) {
        return new JAXBElement<Integer>(_CuentaIdSectorBce_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdSubproducto", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdSubproducto(Short value) {
        return new JAXBElement<Short>(_CuentaIdSubproducto_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdSucursal", scope = Cuenta.class)
    public JAXBElement<Short> createCuentaIdSucursal(Short value) {
        return new JAXBElement<Short>(_CuentaIdSucursal_QNAME, Short.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MensajeAdvertencia", scope = Cuenta.class)
    public JAXBElement<String> createCuentaMensajeAdvertencia(String value) {
        return new JAXBElement<String>(_CuentaMensajeAdvertencia_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MensajeRespuesta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaMensajeRespuesta(String value) {
        return new JAXBElement<String>(_CuentaMensajeRespuesta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombre", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNombre(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNombre_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreEstadoCuenta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNombreEstadoCuenta(String value) {
        return new JAXBElement<String>(_CuentaNombreEstadoCuenta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreOficial", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNombreOficial(String value) {
        return new JAXBElement<String>(_CuentaNombreOficial_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreProducto", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNombreProducto(String value) {
        return new JAXBElement<String>(_CuentaNombreProducto_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Numero", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNumero(String value) {
        return new JAXBElement<String>(_CertificadoAportacionNumero_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroLibreta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaNumeroLibreta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNumeroLibreta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Personalizada", scope = Cuenta.class)
    public JAXBElement<Boolean> createCuentaPersonalizada(Boolean value) {
        return new JAXBElement<Boolean>(_CuentaPersonalizada_QNAME, Boolean.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Principal", scope = Cuenta.class)
    public JAXBElement<Boolean> createCuentaPrincipal(Boolean value) {
        return new JAXBElement<Boolean>(_CuentaPrincipal_QNAME, Boolean.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Restringida", scope = Cuenta.class)
    public JAXBElement<Boolean> createCuentaRestringida(Boolean value) {
        return new JAXBElement<Boolean>(_CuentaRestringida_QNAME, Boolean.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tipo", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaTipo(Integer value) {
        return new JAXBElement<Integer>(_CertificadoAportacionTipo_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuenta", scope = Cuenta.class)
    public JAXBElement<String> createCuentaTipoCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoTipoCuenta_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "UsuarioAsociacion", scope = Cuenta.class)
    public JAXBElement<String> createCuentaUsuarioAsociacion(String value) {
        return new JAXBElement<String>(_CuentaUsuarioAsociacion_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "UsuarioFinAsociacion", scope = Cuenta.class)
    public JAXBElement<String> createCuentaUsuarioFinAsociacion(String value) {
        return new JAXBElement<String>(_CuentaUsuarioFinAsociacion_QNAME, String.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ZonaOficial", scope = Cuenta.class)
    public JAXBElement<Integer> createCuentaZonaOficial(Integer value) {
        return new JAXBElement<Integer>(_CuentaZonaOficial_QNAME, Integer.class, Cuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ApellidTitular", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaApellidTitular(String value) {
        return new JAXBElement<String>(_CuentaLibretaApellidTitular_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Aprobacion", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaAprobacion(String value) {
        return new JAXBElement<String>(_CuentaLibretaAprobacion_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Aprobador", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaAprobador(String value) {
        return new JAXBElement<String>(_CuentaLibretaAprobador_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Bloqueada", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaBloqueada(String value) {
        return new JAXBElement<String>(_CuentaLibretaBloqueada_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Bloqueo", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaBloqueo(String value) {
        return new JAXBElement<String>(_CuentaLibretaBloqueo_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "BloqueoEjecutivo", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaBloqueoEjecutivo(String value) {
        return new JAXBElement<String>(_CuentaLibretaBloqueoEjecutivo_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Interviniente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ClienteCuenta", scope = CuentaLibreta.class)
    public JAXBElement<Interviniente> createCuentaLibretaClienteCuenta(Interviniente value) {
        return new JAXBElement<Interviniente>(_CuentaLibretaClienteCuenta_QNAME, Interviniente.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoNegocioAsesor", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaCodigoNegocioAsesor(String value) {
        return new JAXBElement<String>(_CuentaLibretaCodigoNegocioAsesor_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoNegocioRol", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaCodigoNegocioRol(String value) {
        return new JAXBElement<String>(_CuentaLibretaCodigoNegocioRol_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoTipoCondicionGiro", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaCodigoTipoCondicionGiro(String value) {
        return new JAXBElement<String>(_CuentaLibretaCodigoTipoCondicionGiro_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaAsociada", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaCuentaAsociada(String value) {
        return new JAXBElement<String>(_CuentaLibretaCuentaAsociada_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosSaldosCuenta", scope = CuentaLibreta.class)
    public JAXBElement<DatosSaldos> createCuentaLibretaDatosSaldosCuenta(DatosSaldos value) {
        return new JAXBElement<DatosSaldos>(_CuentaLibretaDatosSaldosCuenta_QNAME, DatosSaldos.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionEstado", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaDescripcionEstado(String value) {
        return new JAXBElement<String>(_DetalleSpiDescripcionEstado_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionSucursal", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaDescripcionSucursal(String value) {
        return new JAXBElement<String>(_CuentaLibretaDescripcionSucursal_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionTipoBloqueo", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaDescripcionTipoBloqueo(String value) {
        return new JAXBElement<String>(_CuentaLibretaDescripcionTipoBloqueo_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "EstadoContrato", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaEstadoContrato(String value) {
        return new JAXBElement<String>(_CuentaLibretaEstadoContrato_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "EstadoLibreta", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaEstadoLibreta(String value) {
        return new JAXBElement<String>(_CuentaLibretaEstadoLibreta_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaUltimoMovimiento", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaFechaUltimoMovimiento(String value) {
        return new JAXBElement<String>(_CuentaLibretaFechaUltimoMovimiento_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCuentaAsociada", scope = CuentaLibreta.class)
    public JAXBElement<Integer> createCuentaLibretaIdCuentaAsociada(Integer value) {
        return new JAXBElement<Integer>(_CuentaLibretaIdCuentaAsociada_QNAME, Integer.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCliente", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaIdentificacionCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCliente_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Intervinientes", scope = CuentaLibreta.class)
    public JAXBElement<ArrayOfInterviniente> createCuentaLibretaIntervinientes(ArrayOfInterviniente value) {
        return new JAXBElement<ArrayOfInterviniente>(_CuentaLibretaIntervinientes_QNAME, ArrayOfInterviniente.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MontoMensual", scope = CuentaLibreta.class)
    public JAXBElement<BigDecimal> createCuentaLibretaMontoMensual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CuentaLibretaMontoMensual_QNAME, BigDecimal.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreMoneda", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaNombreMoneda(String value) {
        return new JAXBElement<String>(_CuentaLibretaNombreMoneda_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreTitular", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaNombreTitular(String value) {
        return new JAXBElement<String>(_CuentaLibretaNombreTitular_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Plazo", scope = CuentaLibreta.class)
    public JAXBElement<Short> createCuentaLibretaPlazo(Short value) {
        return new JAXBElement<Short>(_CuentaLibretaPlazo_QNAME, Short.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Rol", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaRol(String value) {
        return new JAXBElement<String>(_CuentaLibretaRol_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Simbolo", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaSimbolo(String value) {
        return new JAXBElement<String>(_CuentaLibretaSimbolo_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TextoManejaLibreta", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaTextoManejaLibreta(String value) {
        return new JAXBElement<String>(_CuentaLibretaTextoManejaLibreta_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoAhorroProgramado", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaTipoAhorroProgramado(String value) {
        return new JAXBElement<String>(_CuentaLibretaTipoAhorroProgramado_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoBloqueo", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaTipoBloqueo(String value) {
        return new JAXBElement<String>(_CuentaLibretaTipoBloqueo_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCondicionGiro", scope = CuentaLibreta.class)
    public JAXBElement<String> createCuentaLibretaTipoCondicionGiro(String value) {
        return new JAXBElement<String>(_CuentaLibretaTipoCondicionGiro_QNAME, String.class, CuentaLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEEstadoCuentaDigital.class)
    public JAXBElement<String> createMEEstadoCuentaDigitalNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEEstadoCuentaDigital.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ArchivoFormatoPdfBase64", scope = MEContratoCuenta.class)
    public JAXBElement<String> createMEContratoCuentaArchivoFormatoPdfBase64(String value) {
        return new JAXBElement<String>(_MEContratoCuentaArchivoFormatoPdfBase64_QNAME, String.class, MEContratoCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCliente", scope = MEContratoCuenta.class)
    public JAXBElement<String> createMEContratoCuentaIdentificacionCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCliente_QNAME, String.class, MEContratoCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEContratoCuenta.class)
    public JAXBElement<String> createMEContratoCuentaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEContratoCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleSpi }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ResultadoTransferencias", scope = MSConsultaTransferenciasSPI.class)
    public JAXBElement<ArrayOfDetalleSpi> createMSConsultaTransferenciasSPIResultadoTransferencias(ArrayOfDetalleSpi value) {
        return new JAXBElement<ArrayOfDetalleSpi>(_MSConsultaTransferenciasSPIResultadoTransferencias_QNAME, ArrayOfDetalleSpi.class, MSConsultaTransferenciasSPI.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Archivo", scope = MSDocumentoCuenta.class)
    public JAXBElement<byte[]> createMSDocumentoCuentaArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MSDocumentoCuentaArchivo_QNAME, byte[].class, MSDocumentoCuenta.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FormaValidacion", scope = METransaccionKisko.class)
    public JAXBElement<Integer> createMETransaccionKiskoFormaValidacion(Integer value) {
        return new JAXBElement<Integer>(_METransaccionKiskoFormaValidacion_QNAME, Integer.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionPersona", scope = METransaccionKisko.class)
    public JAXBElement<String> createMETransaccionKiskoIdentificacionPersona(String value) {
        return new JAXBElement<String>(_METransaccionKiskoIdentificacionPersona_QNAME, String.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombrePersona", scope = METransaccionKisko.class)
    public JAXBElement<String> createMETransaccionKiskoNombrePersona(String value) {
        return new JAXBElement<String>(_METransaccionKiskoNombrePersona_QNAME, String.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = METransaccionKisko.class)
    public JAXBElement<String> createMETransaccionKiskoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = METransaccionKisko.class)
    public JAXBElement<String> createMETransaccionKiskoReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = METransaccionKisko.class)
    public JAXBElement<String> createMETransaccionKiskoReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, METransaccionKisko.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Comentario", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaComentario(String value) {
        return new JAXBElement<String>(_CuentaComentario_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaOrdenante", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaCuentaOrdenante(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaCuentaOrdenante_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionOrdenante", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaIdentificacionOrdenante(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaIdentificacionOrdenante_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "InstitucionOrdenante", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaInstitucionOrdenante(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaInstitucionOrdenante_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreOrdenante", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaNombreOrdenante(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaNombreOrdenante_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroReferencia", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaNumeroReferencia(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaNumeroReferencia_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialReferencia", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaSecuencialReferencia(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaSecuencialReferencia_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SufijoCuenta", scope = MSTransaccionRecibida.class)
    public JAXBElement<String> createMSTransaccionRecibidaSufijoCuenta(String value) {
        return new JAXBElement<String>(_MovimientoSufijoCuenta_QNAME, String.class, MSTransaccionRecibida.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Archivo", scope = MEDocumentosCuenta.class)
    public JAXBElement<byte[]> createMEDocumentosCuentaArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MSDocumentoCuentaArchivo_QNAME, byte[].class, MEDocumentosCuenta.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoQr", scope = MEDocumentosCuenta.class)
    public JAXBElement<String> createMEDocumentosCuentaCodigoQr(String value) {
        return new JAXBElement<String>(_MEDocumentosCuentaCodigoQr_QNAME, String.class, MEDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FirmaCliente", scope = MEDocumentosCuenta.class)
    public JAXBElement<byte[]> createMEDocumentosCuentaFirmaCliente(byte[] value) {
        return new JAXBElement<byte[]>(_MEDocumentosCuentaFirmaCliente_QNAME, byte[].class, MEDocumentosCuenta.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionCliente", scope = MEDocumentosCuenta.class)
    public JAXBElement<String> createMEDocumentosCuentaIdentificacionCliente(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesIdentificacionCliente_QNAME, String.class, MEDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEDocumentosCuenta.class)
    public JAXBElement<String> createMEDocumentosCuentaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoDocumento", scope = MEDocumentosCuenta.class)
    public JAXBElement<String> createMEDocumentosCuentaTipoDocumento(String value) {
        return new JAXBElement<String>(_MEDocumentosCuentaTipoDocumento_QNAME, String.class, MEDocumentosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Movimientos", scope = MSConsultaMovimientosCorresponsales.class)
    public JAXBElement<ArrayOfMovimiento> createMSConsultaMovimientosCorresponsalesMovimientos(ArrayOfMovimiento value) {
        return new JAXBElement<ArrayOfMovimiento>(_MSConsultaMovimientosCorresponsalesMovimientos_QNAME, ArrayOfMovimiento.class, MSConsultaMovimientosCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosSaldos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Saldos", scope = MSConsultaMovimientosCorresponsales.class)
    public JAXBElement<DatosSaldos> createMSConsultaMovimientosCorresponsalesSaldos(DatosSaldos value) {
        return new JAXBElement<DatosSaldos>(_MSConsultaMovimientosCorresponsalesSaldos_QNAME, DatosSaldos.class, MSConsultaMovimientosCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = MSTransaccionCorresponsales.class)
    public JAXBElement<TransaccionCorresponsales> createMSTransaccionCorresponsalesTransaccion(TransaccionCorresponsales value) {
        return new JAXBElement<TransaccionCorresponsales>(_MovimientoTransaccion_QNAME, TransaccionCorresponsales.class, MSTransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCorresponsales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = METransaccionCorresponsales.class)
    public JAXBElement<TransaccionCorresponsales> createMETransaccionCorresponsalesTransaccion(TransaccionCorresponsales value) {
        return new JAXBElement<TransaccionCorresponsales>(_MovimientoTransaccion_QNAME, TransaccionCorresponsales.class, METransaccionCorresponsales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MSConsultaDatosTarjeta.class)
    public JAXBElement<String> createMSConsultaDatosTarjetaIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MSConsultaDatosTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTarjeta", scope = MEConsultaDatosTarjeta.class)
    public JAXBElement<String> createMEConsultaDatosTarjetaNumeroTarjeta(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNumeroTarjeta_QNAME, String.class, MEConsultaDatosTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MSPagoTarjeta.class)
    public JAXBElement<String> createMSPagoTarjetaIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MSPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSPagoTarjeta.class)
    public JAXBElement<String> createMSPagoTarjetaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTarjetaId", scope = MSPagoTarjeta.class)
    public JAXBElement<String> createMSPagoTarjetaNumeroTarjetaId(String value) {
        return new JAXBElement<String>(_MSPagoTarjetaNumeroTarjetaId_QNAME, String.class, MSPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = MSPagoTarjeta.class)
    public JAXBElement<String> createMSPagoTarjetaReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, MSPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MEPagoTarjeta.class)
    public JAXBElement<String> createMEPagoTarjetaIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MEPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEPagoTarjeta.class)
    public JAXBElement<String> createMEPagoTarjetaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTarjetaId", scope = MEPagoTarjeta.class)
    public JAXBElement<String> createMEPagoTarjetaNumeroTarjetaId(String value) {
        return new JAXBElement<String>(_MSPagoTarjetaNumeroTarjetaId_QNAME, String.class, MEPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = MEPagoTarjeta.class)
    public JAXBElement<String> createMEPagoTarjetaReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, MEPagoTarjeta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTarjeta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTarjeta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tarjetas", scope = MSConsultasSaldosTarjetas.class)
    public JAXBElement<ArrayOfTarjeta> createMSConsultasSaldosTarjetasTarjetas(ArrayOfTarjeta value) {
        return new JAXBElement<ArrayOfTarjeta>(_MSConsultasSaldosTarjetasTarjetas_QNAME, ArrayOfTarjeta.class, MSConsultasSaldosTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MEConsultaSaldosTarjetasCliente.class)
    public JAXBElement<String> createMEConsultaSaldosTarjetasClienteIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MEConsultaSaldosTarjetasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = MSTransaccionPagoServicios.class)
    public JAXBElement<PagoServicios> createMSTransaccionPagoServiciosTransaccion(PagoServicios value) {
        return new JAXBElement<PagoServicios>(_MovimientoTransaccion_QNAME, PagoServicios.class, MSTransaccionPagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoServicios }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = METransaccionPagoServicios.class)
    public JAXBElement<PagoServicios> createMETransaccionPagoServiciosTransaccion(PagoServicios value) {
        return new JAXBElement<PagoServicios>(_MovimientoTransaccion_QNAME, PagoServicios.class, METransaccionPagoServicios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValuePairOfstringstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuentas", scope = MSAperturaCuenta.class)
    public JAXBElement<ArrayOfKeyValuePairOfstringstring> createMSAperturaCuentaCuentas(ArrayOfKeyValuePairOfstringstring value) {
        return new JAXBElement<ArrayOfKeyValuePairOfstringstring>(_MSAperturaCuentaCuentas_QNAME, ArrayOfKeyValuePairOfstringstring.class, MSAperturaCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DocumentosCuenta", scope = MSAperturaCuenta.class)
    public JAXBElement<String> createMSAperturaCuentaDocumentosCuenta(String value) {
        return new JAXBElement<String>(_MSAperturaCuentaDocumentosCuenta_QNAME, String.class, MSAperturaCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Foto", scope = MEAperturaCuenta.class)
    public JAXBElement<String> createMEAperturaCuentaFoto(String value) {
        return new JAXBElement<String>(_MEAperturaCuentaFoto_QNAME, String.class, MEAperturaCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MEAperturaCuenta.class)
    public JAXBElement<String> createMEAperturaCuentaIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MEAperturaCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoBceBancoBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiCodigoBceBancoBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiCodigoBceBancoBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiIdentificacionBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiIdentificacionBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiNombreBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiNombreBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreOrdenante", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiNombreOrdenante(String value) {
        return new JAXBElement<String>(_MSTransaccionRecibidaNombreOrdenante_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiNumeroCuentaBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiNumeroCuentaBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroOperacion", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiNumeroOperacion(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesNumeroOperacion_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuentaBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiTipoCuentaBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiTipoCuentaBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoIdentificacionBeneficiario", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiTipoIdentificacionBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiTipoIdentificacionBeneficiario_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = MEPagoSpi.class)
    public JAXBElement<String> createMEPagoSpiTransaccion(String value) {
        return new JAXBElement<String>(_MovimientoTransaccion_QNAME, String.class, MEPagoSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomica", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionClienteActividadEconomica_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomicaEmpresa", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteActividadEconomicaEmpresa(String value) {
        return new JAXBElement<String>(_MECreacionClienteActividadEconomicaEmpresa_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipal", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreacionClienteCallePrincipal_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipalTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCallePrincipalTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteCallePrincipalTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleTransversal", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCalleTransversal(String value) {
        return new JAXBElement<String>(_MECreacionClienteCalleTransversal_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleTransversalTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCalleTransversalTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteCalleTransversalTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CantonDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCantonDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteCantonDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CantonDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCantonDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteCantonDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CargoEmpresa", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCargoEmpresa(String value) {
        return new JAXBElement<String>(_MECreacionClienteCargoEmpresa_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCiudadDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteCiudadDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCiudadDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteCiudadDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoEtnia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCodigoEtnia(String value) {
        return new JAXBElement<String>(_MECreacionClienteCodigoEtnia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoOficial", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteCodigoOficial(String value) {
        return new JAXBElement<String>(_MECreacionClienteCodigoOficial_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DireccionReferencia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteDireccionReferencia(String value) {
        return new JAXBElement<String>(_MECreacionClienteDireccionReferencia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DireccionReferencia2", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteDireccionReferencia2(String value) {
        return new JAXBElement<String>(_MECreacionClienteDireccionReferencia2_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EgresoMensual", scope = MECreacionCliente.class)
    public JAXBElement<BigDecimal> createMECreacionClienteEgresoMensual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MECreacionClienteEgresoMensual_QNAME, BigDecimal.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteEmail(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteEmail_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Estudios", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteEstudios(String value) {
        return new JAXBElement<String>(_MECreacionClienteEstudios_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteIdentificacion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteIdentificacion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionPareja", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteIdentificacionPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteIdentificacionPareja_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IngresoMensual", scope = MECreacionCliente.class)
    public JAXBElement<BigDecimal> createMECreacionClienteIngresoMensual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MECreacionClienteIngresoMensual_QNAME, BigDecimal.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nacionalidad", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNacionalidad(String value) {
        return new JAXBElement<String>(_MECreacionClienteNacionalidad_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreEmpresa", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNombreEmpresa(String value) {
        return new JAXBElement<String>(_MECreacionClienteNombreEmpresa_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreReferencia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNombreReferencia(String value) {
        return new JAXBElement<String>(_MECreacionClienteNombreReferencia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreReferencia2", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNombreReferencia2(String value) {
        return new JAXBElement<String>(_MECreacionClienteNombreReferencia2_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNombres(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteNombres_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresPareja", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNombresPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteNombresPareja_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNumeroDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteNumeroDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteNumeroDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteNumeroDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pais", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClientePais(String value) {
        return new JAXBElement<String>(_MECreacionClientePais_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParentescoReferencia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteParentescoReferencia(String value) {
        return new JAXBElement<String>(_MECreacionClienteParentescoReferencia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParentescoReferencia2", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteParentescoReferencia2(String value) {
        return new JAXBElement<String>(_MECreacionClienteParentescoReferencia2_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParroquiaDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteParroquiaDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteParroquiaDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParroquiaDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteParroquiaDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteParroquiaDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PatromonioInicial", scope = MECreacionCliente.class)
    public JAXBElement<BigDecimal> createMECreacionClientePatromonioInicial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MECreacionClientePatromonioInicial_QNAME, BigDecimal.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrimerApellido", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClientePrimerApellido(String value) {
        return new JAXBElement<String>(_MECreacionClientePrimerApellido_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrimerApellidoPareja", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClientePrimerApellidoPareja(String value) {
        return new JAXBElement<String>(_MECreacionClientePrimerApellidoPareja_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProductoInicial", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteProductoInicial(String value) {
        return new JAXBElement<String>(_MECreacionClienteProductoInicial_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Profesion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteProfesion(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteProfesion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Provincia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteProvincia(String value) {
        return new JAXBElement<String>(_MECreacionClienteProvincia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProvinciaDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteProvinciaDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteProvinciaDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProvinciaDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteProvinciaDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteProvinciaDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRedSocial }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RedesSociales", scope = MECreacionCliente.class)
    public JAXBElement<ArrayOfRedSocial> createMECreacionClienteRedesSociales(ArrayOfRedSocial value) {
        return new JAXBElement<ArrayOfRedSocial>(_MECreacionClienteRedesSociales_QNAME, ArrayOfRedSocial.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ReferenciaDireccion", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteReferenciaDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteReferenciaDireccion_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ReferenciaDireccionTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteReferenciaDireccionTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteReferenciaDireccionTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResidenciaFiscal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ResidenciaFiscal", scope = MECreacionCliente.class)
    public JAXBElement<ResidenciaFiscal> createMECreacionClienteResidenciaFiscal(ResidenciaFiscal value) {
        return new JAXBElement<ResidenciaFiscal>(_ResidenciaFiscal_QNAME, ResidenciaFiscal.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "SegundoApellido", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteSegundoApellido(String value) {
        return new JAXBElement<String>(_MECreacionClienteSegundoApellido_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "SegundoApellidoPareja", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteSegundoApellidoPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteSegundoApellidoPareja_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Telefono", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTelefono(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTelefono_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoReferencia", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTelefonoReferencia(String value) {
        return new JAXBElement<String>(_MECreacionClienteTelefonoReferencia_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoReferencia2", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTelefonoReferencia2(String value) {
        return new JAXBElement<String>(_MECreacionClienteTelefonoReferencia2_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoSms", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTelefonoSms(String value) {
        return new JAXBElement<String>(_MECreacionClienteTelefonoSms_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoTrabajo", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTelefonoTrabajo(String value) {
        return new JAXBElement<String>(_MECreacionClienteTelefonoTrabajo_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoActividad", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTipoActividad(String value) {
        return new JAXBElement<String>(_MECreacionClienteTipoActividad_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoVivienda", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteTipoVivienda(String value) {
        return new JAXBElement<String>(_DatosGeneralesClienteTipoVivienda_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoVerificacion", scope = MERenovacionAhorro.class)
    public JAXBElement<String> createMERenovacionAhorroCodigoVerificacion(String value) {
        return new JAXBElement<String>(_MERenovacionAhorroCodigoVerificacion_QNAME, String.class, MERenovacionAhorro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuentaAsociada", scope = MERenovacionAhorro.class)
    public JAXBElement<String> createMERenovacionAhorroCuentaAsociada(String value) {
        return new JAXBElement<String>(_CuentaLibretaCuentaAsociada_QNAME, String.class, MERenovacionAhorro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MERenovacionAhorro.class)
    public JAXBElement<String> createMERenovacionAhorroNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MERenovacionAhorro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSAperturaAhorroProgramado.class)
    public JAXBElement<String> createMSAperturaAhorroProgramadoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoVerificacion", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<String> createMEAperturaAhorroProgramadoCodigoVerificacion(String value) {
        return new JAXBElement<String>(_MERenovacionAhorroCodigoVerificacion_QNAME, String.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCuentaDebito", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<Integer> createMEAperturaAhorroProgramadoIdCuentaDebito(Integer value) {
        return new JAXBElement<Integer>(_MEAperturaAhorroProgramadoIdCuentaDebito_QNAME, Integer.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdSubProducto", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<Integer> createMEAperturaAhorroProgramadoIdSubProducto(Integer value) {
        return new JAXBElement<Integer>(_MEAperturaAhorroProgramadoIdSubProducto_QNAME, Integer.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<String> createMEAperturaAhorroProgramadoIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfInterviniente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Intervinientes", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<ArrayOfInterviniente> createMEAperturaAhorroProgramadoIntervinientes(ArrayOfInterviniente value) {
        return new JAXBElement<ArrayOfInterviniente>(_CuentaLibretaIntervinientes_QNAME, ArrayOfInterviniente.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MontoReserva", scope = MEAperturaAhorroProgramado.class)
    public JAXBElement<BigDecimal> createMEAperturaAhorroProgramadoMontoReserva(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MEAperturaAhorroProgramadoMontoReserva_QNAME, BigDecimal.class, MEAperturaAhorroProgramado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRespuestaSimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Resultados", scope = MSSimularAhorro.class)
    public JAXBElement<ArrayOfRespuestaSimulacion> createMSSimularAhorroResultados(ArrayOfRespuestaSimulacion value) {
        return new JAXBElement<ArrayOfRespuestaSimulacion>(_MSSimularAhorroResultados_QNAME, ArrayOfRespuestaSimulacion.class, MSSimularAhorro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaInicio", scope = MESimularAhorro.class)
    public JAXBElement<XMLGregorianCalendar> createMESimularAhorroFechaInicio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MESimularAhorroFechaInicio_QNAME, XMLGregorianCalendar.class, MESimularAhorro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreTitular", scope = MSNumeroCuenta.class)
    public JAXBElement<String> createMSNumeroCuentaNombreTitular(String value) {
        return new JAXBElement<String>(_CuentaLibretaNombreTitular_QNAME, String.class, MSNumeroCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSNumeroCuenta.class)
    public JAXBElement<String> createMSNumeroCuentaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSNumeroCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoOficial", scope = MECrearCuenta.class)
    public JAXBElement<String> createMECrearCuentaCodigoOficial(String value) {
        return new JAXBElement<String>(_MECrearCuentaCodigoOficial_QNAME, String.class, MECrearCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Foto", scope = MECrearCuenta.class)
    public JAXBElement<String> createMECrearCuentaFoto(String value) {
        return new JAXBElement<String>(_MEAperturaCuentaFoto_QNAME, String.class, MECrearCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCuentaDebito", scope = MECrearCuenta.class)
    public JAXBElement<Integer> createMECrearCuentaIdCuentaDebito(Integer value) {
        return new JAXBElement<Integer>(_MEAperturaAhorroProgramadoIdCuentaDebito_QNAME, Integer.class, MECrearCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MontoMensual", scope = MECrearCuenta.class)
    public JAXBElement<BigDecimal> createMECrearCuentaMontoMensual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CuentaLibretaMontoMensual_QNAME, BigDecimal.class, MECrearCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Plazo", scope = MECrearCuenta.class)
    public JAXBElement<Short> createMECrearCuentaPlazo(Short value) {
        return new JAXBElement<Short>(_CuentaLibretaPlazo_QNAME, Short.class, MECrearCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TransaccionCanales", scope = MSTransaccionCanales.class)
    public JAXBElement<TransaccionCanales> createMSTransaccionCanalesTransaccionCanales(TransaccionCanales value) {
        return new JAXBElement<TransaccionCanales>(_TransaccionCanales_QNAME, TransaccionCanales.class, MSTransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransaccionCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TransaccionCanales", scope = METransaccionCanales.class)
    public JAXBElement<TransaccionCanales> createMETransaccionCanalesTransaccionCanales(TransaccionCanales value) {
        return new JAXBElement<TransaccionCanales>(_TransaccionCanales_QNAME, TransaccionCanales.class, METransaccionCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoArea", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoCodigoArea(String value) {
        return new JAXBElement<String>(_METelefonoCodigoArea_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoRegion", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoCodigoRegion(String value) {
        return new JAXBElement<String>(_METelefonoCodigoRegion_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Extension", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoExtension(String value) {
        return new JAXBElement<String>(_METelefonoExtension_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTelefono", scope = METelefono.class)
    public JAXBElement<Integer> createMETelefonoIdTelefono(Integer value) {
        return new JAXBElement<Integer>(_METelefonoIdTelefono_QNAME, Integer.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroTelefono", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoNumeroTelefono(String value) {
        return new JAXBElement<String>(_METelefonoNumeroTelefono_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoObservaciones(String value) {
        return new JAXBElement<String>(_RedSocialObservaciones_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pais", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoPais(String value) {
        return new JAXBElement<String>(_MECreacionClientePais_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoTelefono", scope = METelefono.class)
    public JAXBElement<String> createMETelefonoTipoTelefono(String value) {
        return new JAXBElement<String>(_METelefonoTipoTelefono_QNAME, String.class, METelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MECompensacionTarjetaDebito.class)
    public JAXBElement<String> createMECompensacionTarjetaDebitoIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MECompensacionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorAdquiriente", scope = MECompensacionTarjetaDebito.class)
    public JAXBElement<String> createMECompensacionTarjetaDebitoIdentificadorAdquiriente(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoIdentificadorAdquiriente_QNAME, String.class, MECompensacionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorEmisor", scope = MECompensacionTarjetaDebito.class)
    public JAXBElement<String> createMECompensacionTarjetaDebitoIdentificadorEmisor(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoIdentificadorEmisor_QNAME, String.class, MECompensacionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Origen", scope = MECompensacionTarjetaDebito.class)
    public JAXBElement<String> createMECompensacionTarjetaDebitoOrigen(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoOrigen_QNAME, String.class, MECompensacionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MSConsultaTarjetaDebito.class)
    public JAXBElement<String> createMSConsultaTarjetaDebitoIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MSConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MensajeRespuesta", scope = MSConsultaTarjetaDebito.class)
    public JAXBElement<String> createMSConsultaTarjetaDebitoMensajeRespuesta(String value) {
        return new JAXBElement<String>(_CuentaMensajeRespuesta_QNAME, String.class, MSConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MEConsultaTarjetaDebito.class)
    public JAXBElement<String> createMEConsultaTarjetaDebitoIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MEConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorAdquiriente", scope = MEConsultaTarjetaDebito.class)
    public JAXBElement<String> createMEConsultaTarjetaDebitoIdentificadorAdquiriente(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoIdentificadorAdquiriente_QNAME, String.class, MEConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorCuentaEmisor", scope = MEConsultaTarjetaDebito.class)
    public JAXBElement<String> createMEConsultaTarjetaDebitoIdentificadorCuentaEmisor(String value) {
        return new JAXBElement<String>(_MEConsultaTarjetaDebitoIdentificadorCuentaEmisor_QNAME, String.class, MEConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Origen", scope = MEConsultaTarjetaDebito.class)
    public JAXBElement<String> createMEConsultaTarjetaDebitoOrigen(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoOrigen_QNAME, String.class, MEConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ReferenciaCuentaEmisor", scope = MEConsultaTarjetaDebito.class)
    public JAXBElement<String> createMEConsultaTarjetaDebitoReferenciaCuentaEmisor(String value) {
        return new JAXBElement<String>(_MEConsultaTarjetaDebitoReferenciaCuentaEmisor_QNAME, String.class, MEConsultaTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = MSTransaccionTarjetaDebito.class)
    public JAXBElement<String> createMSTransaccionTarjetaDebitoIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, MSTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorEmisor", scope = MSTransaccionTarjetaDebito.class)
    public JAXBElement<String> createMSTransaccionTarjetaDebitoIdentificadorEmisor(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoIdentificadorEmisor_QNAME, String.class, MSTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MensajeRespuesta", scope = MSTransaccionTarjetaDebito.class)
    public JAXBElement<String> createMSTransaccionTarjetaDebitoMensajeRespuesta(String value) {
        return new JAXBElement<String>(_CuentaMensajeRespuesta_QNAME, String.class, MSTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ValorDebitoParcial", scope = MSTransaccionTarjetaDebito.class)
    public JAXBElement<BigDecimal> createMSTransaccionTarjetaDebitoValorDebitoParcial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MSTransaccionTarjetaDebitoValorDebitoParcial_QNAME, BigDecimal.class, MSTransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Adquirente", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoAdquirente(String value) {
        return new JAXBElement<String>(_METransaccionTarjetaDebitoAdquirente_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Ciudad", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoCiudad(String value) {
        return new JAXBElement<String>(_METransaccionTarjetaDebitoCiudad_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoComercio", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<Integer> createMETransaccionTarjetaDebitoCodigoComercio(Integer value) {
        return new JAXBElement<Integer>(_METransaccionTarjetaDebitoCodigoComercio_QNAME, Integer.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ComercioAceptaParciales", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<Boolean> createMETransaccionTarjetaDebitoComercioAceptaParciales(Boolean value) {
        return new JAXBElement<Boolean>(_METransaccionTarjetaDebitoComercioAceptaParciales_QNAME, Boolean.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificador", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoIdentificador(String value) {
        return new JAXBElement<String>(_TarjetaIdentificador_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorAdquiriente", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoIdentificadorAdquiriente(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoIdentificadorAdquiriente_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificadorCuentaEmisor", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoIdentificadorCuentaEmisor(String value) {
        return new JAXBElement<String>(_MEConsultaTarjetaDebitoIdentificadorCuentaEmisor_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "LugarTran", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoLugarTran(String value) {
        return new JAXBElement<String>(_METransaccionTarjetaDebitoLugarTran_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NorRev", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<Integer> createMETransaccionTarjetaDebitoNorRev(Integer value) {
        return new JAXBElement<Integer>(_METransaccionTarjetaDebitoNorRev_QNAME, Integer.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Origen", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoOrigen(String value) {
        return new JAXBElement<String>(_MECompensacionTarjetaDebitoOrigen_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Pais", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<Integer> createMETransaccionTarjetaDebitoPais(Integer value) {
        return new JAXBElement<Integer>(_METransaccionTarjetaDebitoPais_QNAME, Integer.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ProvisionEfectivo", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<BigDecimal> createMETransaccionTarjetaDebitoProvisionEfectivo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_METransaccionTarjetaDebitoProvisionEfectivo_QNAME, BigDecimal.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ReferenciaCuentaEmisor", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoReferenciaCuentaEmisor(String value) {
        return new JAXBElement<String>(_MEConsultaTarjetaDebitoReferenciaCuentaEmisor_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Tarjeta", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoTarjeta(String value) {
        return new JAXBElement<String>(_Tarjeta_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Terminal", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoTerminal(String value) {
        return new JAXBElement<String>(_METransaccionTarjetaDebitoTerminal_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Transaccion", scope = METransaccionTarjetaDebito.class)
    public JAXBElement<String> createMETransaccionTarjetaDebitoTransaccion(String value) {
        return new JAXBElement<String>(_MovimientoTransaccion_QNAME, String.class, METransaccionTarjetaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = METransferenciaMonederoElectronico.class)
    public JAXBElement<String> createMETransferenciaMonederoElectronicoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, METransferenciaMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoTransferencia", scope = METransferenciaMonederoElectronico.class)
    public JAXBElement<String> createMETransferenciaMonederoElectronicoTipoTransferencia(String value) {
        return new JAXBElement<String>(_METransferenciaMonederoElectronicoTipoTransferencia_QNAME, String.class, METransferenciaMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Monedero", scope = MSMonederoElectronico.class)
    public JAXBElement<MonederoElectronico> createMSMonederoElectronicoMonedero(MonederoElectronico value) {
        return new JAXBElement<MonederoElectronico>(_MSMonederoElectronicoMonedero_QNAME, MonederoElectronico.class, MSMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonederoElectronico }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Monedero", scope = MEMonederoElectronico.class)
    public JAXBElement<MonederoElectronico> createMEMonederoElectronicoMonedero(MonederoElectronico value) {
        return new JAXBElement<MonederoElectronico>(_MSMonederoElectronicoMonedero_QNAME, MonederoElectronico.class, MEMonederoElectronico.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CantonOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoCantonOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoCantonOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoInstitucion", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoCodigoInstitucion(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoCodigoInstitucion_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DireccionOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoDireccionOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoDireccionOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoIdentificacionOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoIdentificacionOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "MotivoTransferencia", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoMotivoTransferencia(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoMotivoTransferencia_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreInstitucion", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoNombreInstitucion(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoNombreInstitucion_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoNombreOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoNombreOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaCliente", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoNumeroCuentaCliente(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoNumeroCuentaCliente_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoNumeroCuentaOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoNumeroCuentaOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ProvinciaOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoProvinciaOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoProvinciaOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TelefonoOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoTelefonoOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoTelefonoOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuentaOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoTipoCuentaOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoTipoCuentaOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoIdentificacionOrdenanteBeneficiario", scope = METransferenciaPagoDirecto.class)
    public JAXBElement<String> createMETransferenciaPagoDirectoTipoIdentificacionOrdenanteBeneficiario(String value) {
        return new JAXBElement<String>(_METransferenciaPagoDirectoTipoIdentificacionOrdenanteBeneficiario_QNAME, String.class, METransferenciaPagoDirecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionCliente", scope = MEConsultasCliente.class)
    public JAXBElement<String> createMEConsultasClienteIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEConsultasClienteIdentificacionCliente_QNAME, String.class, MEConsultasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PlanServicio", scope = MEConsultasCliente.class)
    public JAXBElement<String> createMEConsultasClientePlanServicio(String value) {
        return new JAXBElement<String>(_MEConsultasClientePlanServicio_QNAME, String.class, MEConsultasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Comentario", scope = METransferencia.class)
    public JAXBElement<String> createMETransferenciaComentario(String value) {
        return new JAXBElement<String>(_CuentaComentario_QNAME, String.class, METransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaCredito", scope = METransferencia.class)
    public JAXBElement<String> createMETransferenciaNumeroCuentaCredito(String value) {
        return new JAXBElement<String>(_METransferenciaNumeroCuentaCredito_QNAME, String.class, METransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaDebito", scope = METransferencia.class)
    public JAXBElement<String> createMETransferenciaNumeroCuentaDebito(String value) {
        return new JAXBElement<String>(_METransferenciaNumeroCuentaDebito_QNAME, String.class, METransferencia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheque }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheque }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cheques", scope = MEDatosCheques.class)
    public JAXBElement<ArrayOfCheque> createMEDatosChequesCheques(ArrayOfCheque value) {
        return new JAXBElement<ArrayOfCheque>(_MEDatosChequesCheques_QNAME, ArrayOfCheque.class, MEDatosCheques.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosUsuario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosUsuario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosUsuario", scope = MSDatosUsuario.class)
    public JAXBElement<ArrayOfDatosUsuario> createMSDatosUsuarioDatosUsuario(ArrayOfDatosUsuario value) {
        return new JAXBElement<ArrayOfDatosUsuario>(_DatosUsuario_QNAME, ArrayOfDatosUsuario.class, MSDatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Login", scope = MEDatosUsuario.class)
    public JAXBElement<String> createMEDatosUsuarioLogin(String value) {
        return new JAXBElement<String>(_MEDatosUsuarioLogin_QNAME, String.class, MEDatosUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfChequeDevuelto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ChequesDevueltos", scope = MEDatosChequeDevolver.class)
    public JAXBElement<ArrayOfChequeDevuelto> createMEDatosChequeDevolverChequesDevueltos(ArrayOfChequeDevuelto value) {
        return new JAXBElement<ArrayOfChequeDevuelto>(_MEDatosChequeDevolverChequesDevueltos_QNAME, ArrayOfChequeDevuelto.class, MEDatosChequeDevolver.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MENotaDC.class)
    public JAXBElement<String> createMENotaDCNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MENotaDC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = MENotaDC.class)
    public JAXBElement<String> createMENotaDCReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, MENotaDC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = MENotaDC.class)
    public JAXBElement<String> createMENotaDCReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, MENotaDC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoAjuste", scope = MENotaDC.class)
    public JAXBElement<String> createMENotaDCTipoAjuste(String value) {
        return new JAXBElement<String>(_MENotaDCTipoAjuste_QNAME, String.class, MENotaDC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTotalDeposito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTotalDeposito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosDeposito", scope = MSDepositos.class)
    public JAXBElement<ArrayOfTotalDeposito> createMSDepositosDatosDeposito(ArrayOfTotalDeposito value) {
        return new JAXBElement<ArrayOfTotalDeposito>(_MSDepositosDatosDeposito_QNAME, ArrayOfTotalDeposito.class, MSDepositos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBanco }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Bancos", scope = MSTransferenciaSpi.class)
    public JAXBElement<ArrayOfBanco> createMSTransferenciaSpiBancos(ArrayOfBanco value) {
        return new JAXBElement<ArrayOfBanco>(_MSTransferenciaSpiBancos_QNAME, ArrayOfBanco.class, MSTransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CodigoBceBancoBeneficiario", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiCodigoBceBancoBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiCodigoBceBancoBeneficiario_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdentificacionBeneficiario", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiIdentificacionBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiIdentificacionBeneficiario_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Instrucciones", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiInstrucciones(String value) {
        return new JAXBElement<String>(_METransferenciaSpiInstrucciones_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreBeneficiario", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiNombreBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiNombreBeneficiario_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCausal", scope = METransferenciaSpi.class)
    public JAXBElement<Integer> createMETransferenciaSpiNumeroCausal(Integer value) {
        return new JAXBElement<Integer>(_METransferenciaSpiNumeroCausal_QNAME, Integer.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaBeneficiario", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiNumeroCuentaBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiNumeroCuentaBeneficiario_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuentaOrdenante", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiNumeroCuentaOrdenante(String value) {
        return new JAXBElement<String>(_DetalleSpiNumeroCuentaOrdenante_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoCuentaBeneficiario", scope = METransferenciaSpi.class)
    public JAXBElement<String> createMETransferenciaSpiTipoCuentaBeneficiario(String value) {
        return new JAXBElement<String>(_MEPagoSpiTipoCuentaBeneficiario_QNAME, String.class, METransferenciaSpi.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Oficina", scope = MSConsultaSaldoAtm.class)
    public JAXBElement<String> createMSConsultaSaldoAtmOficina(String value) {
        return new JAXBElement<String>(_ResultadoNdNcOficina_QNAME, String.class, MSConsultaSaldoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEConsultaSaldoAtm.class)
    public JAXBElement<String> createMEConsultaSaldoAtmNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEConsultaSaldoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = MEConsultaSaldoAtm.class)
    public JAXBElement<String> createMEConsultaSaldoAtmReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, MEConsultaSaldoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Apellidos", scope = MSConsultasCertificados.class)
    public JAXBElement<String> createMSConsultasCertificadosApellidos(String value) {
        return new JAXBElement<String>(_DatosUsuarioApellidos_QNAME, String.class, MSConsultasCertificados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificadoAportacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCertificadoAportacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Certificados", scope = MSConsultasCertificados.class)
    public JAXBElement<ArrayOfCertificadoAportacion> createMSConsultasCertificadosCertificados(ArrayOfCertificadoAportacion value) {
        return new JAXBElement<ArrayOfCertificadoAportacion>(_MSConsultasCertificadosCertificados_QNAME, ArrayOfCertificadoAportacion.class, MSConsultasCertificados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombres", scope = MSConsultasCertificados.class)
    public JAXBElement<String> createMSConsultasCertificadosNombres(String value) {
        return new JAXBElement<String>(_DatosUsuarioNombres_QNAME, String.class, MSConsultasCertificados.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuenta", scope = MSConsultasMovimientosCuenta.class)
    public JAXBElement<CuentaLibreta> createMSConsultasMovimientosCuentaCuenta(CuentaLibreta value) {
        return new JAXBElement<CuentaLibreta>(_Cuenta_QNAME, CuentaLibreta.class, MSConsultasMovimientosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCuotasAhorroProgramado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CuotasAhorroProgramado", scope = MSConsultasMovimientosCuenta.class)
    public JAXBElement<ArrayOfDatosCuotasAhorroProgramado> createMSConsultasMovimientosCuentaCuotasAhorroProgramado(ArrayOfDatosCuotasAhorroProgramado value) {
        return new JAXBElement<ArrayOfDatosCuotasAhorroProgramado>(_MSConsultasMovimientosCuentaCuotasAhorroProgramado_QNAME, ArrayOfDatosCuotasAhorroProgramado.class, MSConsultasMovimientosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleInteresDiario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DetallesInteresDiario", scope = MSConsultasMovimientosCuenta.class)
    public JAXBElement<ArrayOfDetalleInteresDiario> createMSConsultasMovimientosCuentaDetallesInteresDiario(ArrayOfDetalleInteresDiario value) {
        return new JAXBElement<ArrayOfDetalleInteresDiario>(_MSConsultasMovimientosCuentaDetallesInteresDiario_QNAME, ArrayOfDetalleInteresDiario.class, MSConsultasMovimientosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimiento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Movimientos", scope = MSConsultasMovimientosCuenta.class)
    public JAXBElement<ArrayOfMovimiento> createMSConsultasMovimientosCuentaMovimientos(ArrayOfMovimiento value) {
        return new JAXBElement<ArrayOfMovimiento>(_MSConsultaMovimientosCorresponsalesMovimientos_QNAME, ArrayOfMovimiento.class, MSConsultasMovimientosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ReferenciaBCE", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosReferenciaBCE(String value) {
        return new JAXBElement<String>(_MEConsultasMovimientosReferenciaBCE_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ReferenciaDeposito", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosReferenciaDeposito(String value) {
        return new JAXBElement<String>(_MEConsultasMovimientosReferenciaDeposito_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialBCE", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosSecuencialBCE(String value) {
        return new JAXBElement<String>(_MEConsultasMovimientosSecuencialBCE_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "SecuencialOrigen", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosSecuencialOrigen(String value) {
        return new JAXBElement<String>(_MEConsultasMovimientosSecuencialOrigen_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoTransaccionRecibida", scope = MEConsultasMovimientos.class)
    public JAXBElement<String> createMEConsultasMovimientosTipoTransaccionRecibida(String value) {
        return new JAXBElement<String>(_MEConsultasMovimientosTipoTransaccionRecibida_QNAME, String.class, MEConsultasMovimientos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Apellidos", scope = MSConsultasDatosAdmTarjetas.class)
    public JAXBElement<String> createMSConsultasDatosAdmTarjetasApellidos(String value) {
        return new JAXBElement<String>(_DatosUsuarioApellidos_QNAME, String.class, MSConsultasDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuentas", scope = MSConsultasDatosAdmTarjetas.class)
    public JAXBElement<ArrayOfCuenta> createMSConsultasDatosAdmTarjetasCuentas(ArrayOfCuenta value) {
        return new JAXBElement<ArrayOfCuenta>(_MSAperturaCuentaCuentas_QNAME, ArrayOfCuenta.class, MSConsultasDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosClientes", scope = MSConsultasDatosAdmTarjetas.class)
    public JAXBElement<DatosGeneralesCliente> createMSConsultasDatosAdmTarjetasDatosClientes(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasDatosAdmTarjetasDatosClientes_QNAME, DatosGeneralesCliente.class, MSConsultasDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombres", scope = MSConsultasDatosAdmTarjetas.class)
    public JAXBElement<String> createMSConsultasDatosAdmTarjetasNombres(String value) {
        return new JAXBElement<String>(_DatosUsuarioNombres_QNAME, String.class, MSConsultasDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TelefonoAdicional", scope = MSConsultasDatosAdmTarjetas.class)
    public JAXBElement<String> createMSConsultasDatosAdmTarjetasTelefonoAdicional(String value) {
        return new JAXBElement<String>(_MSConsultasDatosAdmTarjetasTelefonoAdicional_QNAME, String.class, MSConsultasDatosAdmTarjetas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Apellido1", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<String> createMSConsultasCtaAhorrosApellido1(String value) {
        return new JAXBElement<String>(_MSConsultasCtaAhorrosApellido1_QNAME, String.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Apellido2", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<String> createMSConsultasCtaAhorrosApellido2(String value) {
        return new JAXBElement<String>(_MSConsultasCtaAhorrosApellido2_QNAME, String.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuenta", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<CuentaLibreta> createMSConsultasCtaAhorrosCuenta(CuentaLibreta value) {
        return new JAXBElement<CuentaLibreta>(_Cuenta_QNAME, CuentaLibreta.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuentas", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<ArrayOfCuentaLibreta> createMSConsultasCtaAhorrosCuentas(ArrayOfCuentaLibreta value) {
        return new JAXBElement<ArrayOfCuentaLibreta>(_MSAperturaCuentaCuentas_QNAME, ArrayOfCuentaLibreta.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCliente", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<Integer> createMSConsultasCtaAhorrosIdCliente(Integer value) {
        return new JAXBElement<Integer>(_CuentaIdCliente_QNAME, Integer.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombre1", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<String> createMSConsultasCtaAhorrosNombre1(String value) {
        return new JAXBElement<String>(_MSConsultasCtaAhorrosNombre1_QNAME, String.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombre2", scope = MSConsultasCtaAhorros.class)
    public JAXBElement<String> createMSConsultasCtaAhorrosNombre2(String value) {
        return new JAXBElement<String>(_MSConsultasCtaAhorrosNombre2_QNAME, String.class, MSConsultasCtaAhorros.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CausaCanje", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaCausaCanje(String value) {
        return new JAXBElement<String>(_MSCanjeLibretaCausaCanje_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "CausalDebito", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaCausalDebito(String value) {
        return new JAXBElement<String>(_MSCanjeLibretaCausalDebito_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DesProducto", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaDesProducto(String value) {
        return new JAXBElement<String>(_MSCanjeLibretaDesProducto_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaApertura", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaFechaApertura(String value) {
        return new JAXBElement<String>(_CuentaFechaApertura_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreCliente", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaNombreCliente(String value) {
        return new JAXBElement<String>(_TransaccionCanalesNombreCliente_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Numerolibreta", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaNumerolibreta(String value) {
        return new JAXBElement<String>(_MSCanjeLibretaNumerolibreta_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "OficinaCuenta", scope = MSCanjeLibreta.class)
    public JAXBElement<String> createMSCanjeLibretaOficinaCuenta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaOficinaCuenta_QNAME, String.class, MSCanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Causa", scope = MECanjeLibreta.class)
    public JAXBElement<String> createMECanjeLibretaCausa(String value) {
        return new JAXBElement<String>(_MECanjeLibretaCausa_QNAME, String.class, MECanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MECanjeLibreta.class)
    public JAXBElement<String> createMECanjeLibretaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MECanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroNuevaLibreta", scope = MECanjeLibreta.class)
    public JAXBElement<String> createMECanjeLibretaNumeroNuevaLibreta(String value) {
        return new JAXBElement<String>(_MECanjeLibretaNumeroNuevaLibreta_QNAME, String.class, MECanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "TipoLibreta", scope = MECanjeLibreta.class)
    public JAXBElement<String> createMECanjeLibretaTipoLibreta(String value) {
        return new JAXBElement<String>(_MECanjeLibretaTipoLibreta_QNAME, String.class, MECanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "UsuarioStockLibreta", scope = MECanjeLibreta.class)
    public JAXBElement<String> createMECanjeLibretaUsuarioStockLibreta(String value) {
        return new JAXBElement<String>(_MECanjeLibretaUsuarioStockLibreta_QNAME, String.class, MECanjeLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "FechaApertura", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaFechaApertura(String value) {
        return new JAXBElement<String>(_CuentaFechaApertura_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Identificacion", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaIdentificacion(String value) {
        return new JAXBElement<String>(_ClienteCondicionIdentificacion_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Nombres", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaNombres(String value) {
        return new JAXBElement<String>(_DatosUsuarioNombres_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroLibreta", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaNumeroLibreta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNumeroLibreta_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "OficinaCuenta", scope = MSPersonalizacionLibreta.class)
    public JAXBElement<String> createMSPersonalizacionLibretaOficinaCuenta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaOficinaCuenta_QNAME, String.class, MSPersonalizacionLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCliente", scope = MSConsultasLibreta.class)
    public JAXBElement<DatosGeneralesCliente> createMSConsultasLibretaDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasLibretaDatosCliente_QNAME, DatosGeneralesCliente.class, MSConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DescripcionProducto", scope = MSConsultasLibreta.class)
    public JAXBElement<String> createMSConsultasLibretaDescripcionProducto(String value) {
        return new JAXBElement<String>(_MSConsultasLibretaDescripcionProducto_QNAME, String.class, MSConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfLineaPendienteLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "LineasPendientes", scope = MSConsultasLibreta.class)
    public JAXBElement<ArrayOfLineaPendienteLibreta> createMSConsultasLibretaLineasPendientes(ArrayOfLineaPendienteLibreta value) {
        return new JAXBElement<ArrayOfLineaPendienteLibreta>(_MSConsultasLibretaLineasPendientes_QNAME, ArrayOfLineaPendienteLibreta.class, MSConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "OficinaCuenta", scope = MSConsultasLibreta.class)
    public JAXBElement<String> createMSConsultasLibretaOficinaCuenta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaOficinaCuenta_QNAME, String.class, MSConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEConsultasLibreta.class)
    public JAXBElement<String> createMEConsultasLibretaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroLibreta", scope = MEConsultasLibreta.class)
    public JAXBElement<String> createMEConsultasLibretaNumeroLibreta(String value) {
        return new JAXBElement<String>(_DatosGeneralesCuentaNumeroLibreta_QNAME, String.class, MEConsultasLibreta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCliente", scope = MSConsultasDatosCuenta.class)
    public JAXBElement<DatosGeneralesCliente> createMSConsultasDatosCuentaDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasLibretaDatosCliente_QNAME, DatosGeneralesCliente.class, MSConsultasDatosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCuenta", scope = MSConsultasDatosCuenta.class)
    public JAXBElement<DatosGeneralesCuenta> createMSConsultasDatosCuentaDatosCuenta(DatosGeneralesCuenta value) {
        return new JAXBElement<DatosGeneralesCuenta>(_MSConsultasDatosCuentaDatosCuenta_QNAME, DatosGeneralesCuenta.class, MSConsultasDatosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NombreAgencia", scope = MSConsultasDatosCuenta.class)
    public JAXBElement<String> createMSConsultasDatosCuentaNombreAgencia(String value) {
        return new JAXBElement<String>(_MSConsultasDatosCuentaNombreAgencia_QNAME, String.class, MSConsultasDatosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCliente", scope = MSNotaCredito.class)
    public JAXBElement<DatosGeneralesCliente> createMSNotaCreditoDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasLibretaDatosCliente_QNAME, DatosGeneralesCliente.class, MSNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCuenta", scope = MSNotaCredito.class)
    public JAXBElement<DatosGeneralesCuenta> createMSNotaCreditoDatosCuenta(DatosGeneralesCuenta value) {
        return new JAXBElement<DatosGeneralesCuenta>(_MSConsultasDatosCuentaDatosCuenta_QNAME, DatosGeneralesCuenta.class, MSNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Resultado", scope = MSNotaCredito.class)
    public JAXBElement<ResultadoNdNc> createMSNotaCreditoResultado(ResultadoNdNc value) {
        return new JAXBElement<ResultadoNdNc>(_DetalleSpiResultado_QNAME, ResultadoNdNc.class, MSNotaCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCliente", scope = MSNotaDebitoAtm.class)
    public JAXBElement<DatosGeneralesCliente> createMSNotaDebitoAtmDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasLibretaDatosCliente_QNAME, DatosGeneralesCliente.class, MSNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCuenta", scope = MSNotaDebitoAtm.class)
    public JAXBElement<DatosGeneralesCuenta> createMSNotaDebitoAtmDatosCuenta(DatosGeneralesCuenta value) {
        return new JAXBElement<DatosGeneralesCuenta>(_MSConsultasDatosCuentaDatosCuenta_QNAME, DatosGeneralesCuenta.class, MSNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroTransaccionConsulta", scope = MSNotaDebitoAtm.class)
    public JAXBElement<String> createMSNotaDebitoAtmNumeroTransaccionConsulta(String value) {
        return new JAXBElement<String>(_MSNotaDebitoAtmNumeroTransaccionConsulta_QNAME, String.class, MSNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Oficina", scope = MSNotaDebitoAtm.class)
    public JAXBElement<String> createMSNotaDebitoAtmOficina(String value) {
        return new JAXBElement<String>(_ResultadoNdNcOficina_QNAME, String.class, MSNotaDebitoAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaDebitoCreditoAtm }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotaDebitoCreditoAtm }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NdNc", scope = MENdNcAtm.class)
    public JAXBElement<NotaDebitoCreditoAtm> createMENdNcAtmNdNc(NotaDebitoCreditoAtm value) {
        return new JAXBElement<NotaDebitoCreditoAtm>(_MENdNcAtmNdNc_QNAME, NotaDebitoCreditoAtm.class, MENdNcAtm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdCausalRetencion", scope = MEReversoNdNc.class)
    public JAXBElement<Short> createMEReversoNdNcIdCausalRetencion(Short value) {
        return new JAXBElement<Short>(_NotaDebitoCreditoIdCausalRetencion_QNAME, Short.class, MEReversoNdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEReversoNdNc.class)
    public JAXBElement<String> createMEReversoNdNcNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEReversoNdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia", scope = MEReversoNdNc.class)
    public JAXBElement<String> createMEReversoNdNcReferencia(String value) {
        return new JAXBElement<String>(_TransaccionCorresponsalesReferencia_QNAME, String.class, MEReversoNdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Referencia2", scope = MEReversoNdNc.class)
    public JAXBElement<String> createMEReversoNdNcReferencia2(String value) {
        return new JAXBElement<String>(_MovimientoReferencia2_QNAME, String.class, MEReversoNdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCliente", scope = MSNotaDebito.class)
    public JAXBElement<DatosGeneralesCliente> createMSNotaDebitoDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_MSConsultasLibretaDatosCliente_QNAME, DatosGeneralesCliente.class, MSNotaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "DatosCuenta", scope = MSNotaDebito.class)
    public JAXBElement<DatosGeneralesCuenta> createMSNotaDebitoDatosCuenta(DatosGeneralesCuenta value) {
        return new JAXBElement<DatosGeneralesCuenta>(_MSConsultasDatosCuentaDatosCuenta_QNAME, DatosGeneralesCuenta.class, MSNotaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResultadoNdNc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Resultado", scope = MSNotaDebito.class)
    public JAXBElement<ResultadoNdNc> createMSNotaDebitoResultado(ResultadoNdNc value) {
        return new JAXBElement<ResultadoNdNc>(_DetalleSpiResultado_QNAME, ResultadoNdNc.class, MSNotaDebito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotaDebitoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NdNc", scope = MENdNc.class)
    public JAXBElement<NotaDebitoCredito> createMENdNcNdNc(NotaDebitoCredito value) {
        return new JAXBElement<NotaDebitoCredito>(_MENdNcAtmNdNc_QNAME, NotaDebitoCredito.class, MENdNc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuentas", scope = MSConsultasSaldosCuentas.class)
    public JAXBElement<ArrayOfCuentaLibreta> createMSConsultasSaldosCuentasCuentas(ArrayOfCuentaLibreta value) {
        return new JAXBElement<ArrayOfCuentaLibreta>(_MSAperturaCuentaCuentas_QNAME, ArrayOfCuentaLibreta.class, MSConsultasSaldosCuentas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CuentaLibreta }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "Cuenta", scope = MSConsultasSaldosCuenta.class)
    public JAXBElement<CuentaLibreta> createMSConsultasSaldosCuentaCuenta(CuentaLibreta value) {
        return new JAXBElement<CuentaLibreta>(_Cuenta_QNAME, CuentaLibreta.class, MSConsultasSaldosCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "IdsClientes", scope = MEConsultasCuenta.class)
    public JAXBElement<ArrayOfint> createMEConsultasCuentaIdsClientes(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_MEConsultasCuentaIdsClientes_QNAME, ArrayOfint.class, MEConsultasCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "ListaNumeroCuentas", scope = MEConsultasCuenta.class)
    public JAXBElement<ArrayOfstring> createMEConsultasCuentaListaNumeroCuentas(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MEConsultasCuentaListaNumeroCuentas_QNAME, ArrayOfstring.class, MEConsultasCuenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Cuentas", name = "NumeroCuenta", scope = MEConsultasCuenta.class)
    public JAXBElement<String> createMEConsultasCuentaNumeroCuenta(String value) {
        return new JAXBElement<String>(_MonederoElectronicoNumeroCuenta_QNAME, String.class, MEConsultasCuenta.class, value);
    }

}
