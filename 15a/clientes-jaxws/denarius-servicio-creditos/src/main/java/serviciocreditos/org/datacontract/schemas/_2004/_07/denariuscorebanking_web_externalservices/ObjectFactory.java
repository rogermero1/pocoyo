
package serviciocreditos.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import serviciocreditos.com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


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

    private final static QName _ClienteTramite_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ClienteTramite");
    private final static QName _ArrayOfClienteTramite_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfClienteTramite");
    private final static QName _MECreditos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreditos");
    private final static QName _OperacionCartera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "OperacionCartera");
    private final static QName _MSCreditos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCreditos");
    private final static QName _ArrayOfCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfCuota");
    private final static QName _Cuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Cuota");
    private final static QName _ArrayOfDetalleCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfDetalleCuota");
    private final static QName _DetalleCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DetalleCuota");
    private final static QName _ArrayOfOperacionCartera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfOperacionCartera");
    private final static QName _ArrayOfPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfPago");
    private final static QName _Pago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Pago");
    private final static QName _ArrayOfRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfRubro");
    private final static QName _Rubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Rubro");
    private final static QName _ArrayOfSaldosOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfSaldosOperacion");
    private final static QName _SaldosOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SaldosOperacion");
    private final static QName _MSConsultasCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSConsultasCredito");
    private final static QName _TramiteCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TramiteCredito");
    private final static QName _ArrayOfTramiteCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfTramiteCredito");
    private final static QName _ArrayOfMovimientoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfMovimientoCredito");
    private final static QName _MovimientoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MovimientoCredito");
    private final static QName _MEConsultasCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEConsultasCredito");
    private final static QName _MECreacionGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreacionGarantia");
    private final static QName _MSCreacionGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCreacionGarantia");
    private final static QName _MEReasignacionGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEReasignacionGarantia");
    private final static QName _MEConsultasGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEConsultasGarantia");
    private final static QName _MSConsultasGarantias_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSConsultasGarantias");
    private final static QName _ArrayOfGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfGarantia");
    private final static QName _Garantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Garantia");
    private final static QName _ArrayOfClienteGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfClienteGarantia");
    private final static QName _ClienteGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ClienteGarantia");
    private final static QName _METipoCartera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "METipoCartera");
    private final static QName _MSTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSTipoOperacion");
    private final static QName _ArrayOfTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfTipoOperacion");
    private final static QName _TipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoOperacion");
    private final static QName _MSConsultaSaldosVencidos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSConsultaSaldosVencidos");
    private final static QName _ArrayOfSaldosVencidosOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfSaldosVencidosOperacion");
    private final static QName _SaldosVencidosOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SaldosVencidosOperacion");
    private final static QName _MERegistroPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MERegistroPago");
    private final static QName _ArrayOfPagoDiarioAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfPagoDiarioAcc");
    private final static QName _PagoDiarioAcc_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "PagoDiarioAcc");
    private final static QName _MSRegistroPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSRegistroPago");
    private final static QName _MESimulacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MESimulacion");
    private final static QName _MEConsultaScore_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEConsultaScore");
    private final static QName _MECreditoCanales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreditoCanales");
    private final static QName _MSCreditoCanales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCreditoCanales");
    private final static QName _MEDocumentoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEDocumentoCredito");
    private final static QName _MECreditoConsolidado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreditoConsolidado");
    private final static QName _MSCreditoConsolidado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCreditoConsolidado");
    private final static QName _MECreditoAutomotriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreditoAutomotriz");
    private final static QName _MSCreditoAutomotriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCreditoAutomotriz");
    private final static QName _MSSolicitudCreditoAutomotriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSSolicitudCreditoAutomotriz");
    private final static QName _MEConsultaSolicitudAutomotriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEConsultaSolicitudAutomotriz");
    private final static QName _MSConsultaSolicitudAutomotriz_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSConsultaSolicitudAutomotriz");
    private final static QName _MERenovacionCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MERenovacionCredito");
    private final static QName _MSRenovacionCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSRenovacionCredito");
    private final static QName _MSDatosRenovacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSDatosRenovacion");
    private final static QName _ArrayOfOperacionCarteraRenovacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ArrayOfOperacionCarteraRenovacion");
    private final static QName _OperacionCarteraRenovacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "OperacionCarteraRenovacion");
    private final static QName _MSConsultaCreditoPreferencial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSConsultaCreditoPreferencial");
    private final static QName _MSTipoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSTipoCredito");
    private final static QName _ParametroProspeccionCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ParametroProspeccionCredito");
    private final static QName _METipoProcesoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "METipoProcesoCredito");
    private final static QName _MSTipoProcesoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSTipoProcesoCredito");
    private final static QName _MSEvaluacionEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSEvaluacionEconomica");
    private final static QName _EvaluacionEconomicaConsumo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EvaluacionEconomicaConsumo");
    private final static QName _EvaluacionEconomicaMicro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EvaluacionEconomicaMicro");
    private final static QName _MECalcularCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECalcularCredito");
    private final static QName _MSCalcularCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSCalcularCredito");
    private final static QName _MEGuardarCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEGuardarCredito");
    private final static QName _MSGuardarCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSGuardarCredito");
    private final static QName _MSDocumentosCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSDocumentosCredito");
    private final static QName _MEInformacionEvaluacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEInformacionEvaluacion");
    private final static QName _MECreacionCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECreacionCredito");
    private final static QName _MECarpetaDocumentosCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MECarpetaDocumentosCredito");
    private final static QName _MEAprobarFase_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEAprobarFase");
    private final static QName _MSRiesgoAmbiental_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSRiesgoAmbiental");
    private final static QName _MERiesgoAmbiental_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MERiesgoAmbiental");
    private final static QName _MEPagoExtraordinarioCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEPagoExtraordinarioCredito");
    private final static QName _MSSimulacionPagoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSSimulacionPagoCredito");
    private final static QName _MSResultadoPagoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MSResultadoPagoCredito");
    private final static QName _MEDocumentoFirmaElectronica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEDocumentoFirmaElectronica");
    private final static QName _MEFirmaElectronicaPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MEFirmaElectronicaPersona");
    private final static QName _MERespuestaFirmaElectronica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MERespuestaFirmaElectronica");
    private final static QName _ArrayOfDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ArrayOfDireccion");
    private final static QName _Direccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Direccion");
    private final static QName _MSCatalogos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "MSCatalogos");
    private final static QName _ArrayOfCatalogoItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ArrayOfCatalogoItem");
    private final static QName _CatalogoItem_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CatalogoItem");
    private final static QName _ArrayOfCheckListFlujo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ArrayOfCheckListFlujo");
    private final static QName _CheckListFlujo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CheckListFlujo");
    private final static QName _ArrayOfDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ArrayOfDocumento");
    private final static QName _Documento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Documento");
    private final static QName _ArrayOfEmpleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfEmpleo");
    private final static QName _Empleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Empleo");
    private final static QName _ArrayOfClaseRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfClaseRubro");
    private final static QName _ClaseRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ClaseRubro");
    private final static QName _ArrayOfDetalleActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetalleActivo");
    private final static QName _DetalleActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleActivo");
    private final static QName _ArrayOfDetalleProductoMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetalleProductoMicroempresa");
    private final static QName _DetalleProductoMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleProductoMicroempresa");
    private final static QName _ArrayOfManoObraMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfManoObraMicroempresa");
    private final static QName _ManoObraMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ManoObraMicroempresa");
    private final static QName _ArrayOfDetallePasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetallePasivo");
    private final static QName _DetallePasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetallePasivo");
    private final static QName _ArrayOfRubroIngresoEgreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRubroIngresoEgreso");
    private final static QName _RubroIngresoEgreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RubroIngresoEgreso");
    private final static QName _RubroIngresoEgresoIdOcupacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdOcupacion");
    private final static QName _RubroIngresoEgresoRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Rubro");
    private final static QName _RubroIngresoEgresoValor1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor1");
    private final static QName _RubroIngresoEgresoValor2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor2");
    private final static QName _RubroIngresoEgresoValor3_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor3");
    private final static QName _RubroIngresoEgresoValor4_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor4");
    private final static QName _RubroIngresoEgresoValor5_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor5");
    private final static QName _RubroIngresoEgresoValor6_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor6");
    private final static QName _RubroIngresoEgresoValor7_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor7");
    private final static QName _DetallePasivoCodDestinoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodDestinoCredito");
    private final static QName _DetallePasivoCodEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodEmisor");
    private final static QName _DetallePasivoCodInstitucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodInstitucion");
    private final static QName _DetallePasivoCodPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodPlazo");
    private final static QName _DetallePasivoDividendoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DividendoMensual");
    private final static QName _DetallePasivoInstitucion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Institucion");
    private final static QName _DetallePasivoMontoActual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MontoActual");
    private final static QName _DetallePasivoMontoOrigen_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MontoOrigen");
    private final static QName _DetallePasivoNombreFuenteExterna_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreFuenteExterna");
    private final static QName _DetallePasivoObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Observaciones");
    private final static QName _DetallePasivoObservacionesVerificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ObservacionesVerificacion");
    private final static QName _DetallePasivoSecuencial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Secuencial");
    private final static QName _DetallePasivoTipoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoCredito");
    private final static QName _DetallePasivoVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Vencimiento");
    private final static QName _DetalleProductoMicroempresaNombreProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreProducto");
    private final static QName _DetalleActivoAnio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Anio");
    private final static QName _DetalleActivoAreaBien_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "AreaBien");
    private final static QName _DetalleActivoAvaluoComercial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "AvaluoComercial");
    private final static QName _DetalleActivoEmisor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Emisor");
    private final static QName _DetalleActivoEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Estado");
    private final static QName _DetalleActivoFechaIngresoVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaIngresoVencimiento");
    private final static QName _DetalleActivoIdEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdEstado");
    private final static QName _DetalleActivoIdMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdMoneda");
    private final static QName _DetalleActivoIdTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTipo");
    private final static QName _DetalleActivoIdTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTipoDocumento");
    private final static QName _DetalleActivoIdTipoInmueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTipoInmueble");
    private final static QName _DetalleActivoIdTipoMueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTipoMueble");
    private final static QName _DetalleActivoMarca_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Marca");
    private final static QName _DetalleActivoMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Moneda");
    private final static QName _DetalleActivoMontoValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MontoValor");
    private final static QName _DetalleActivoPrendado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Prendado");
    private final static QName _DetalleActivoTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Tipo");
    private final static QName _DetalleActivoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoDocumento");
    private final static QName _DetalleActivoTipoInmueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoInmueble");
    private final static QName _DetalleActivoTipoMueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoMueble");
    private final static QName _DetalleActivoTipoPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoPropiedad");
    private final static QName _DetalleActivoUbicacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Ubicacion");
    private final static QName _ClaseRubroNombreClaseRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreClaseRubro");
    private final static QName _EmpleoActividadCreada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadCreada");
    private final static QName _EmpleoActividadEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEmpresa");
    private final static QName _EmpleoEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Email");
    private final static QName _EmpleoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Empresa");
    private final static QName _EmpleoFechaInicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaInicio");
    private final static QName _EmpleoFechaSalida_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaSalida");
    private final static QName _EmpleoIdCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdCargo");
    private final static QName _EmpleoMotivoFinalizacionCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MotivoFinalizacionCargo");
    private final static QName _EmpleoPrincipalSecundaria_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PrincipalSecundaria");
    private final static QName _EmpleoSueldo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Sueldo");
    private final static QName _EmpleoTipoActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoActividad");
    private final static QName _EmpleoTipoContrato_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoContrato");
    private final static QName _EmpleoTipoRelacionLaboral_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoRelacionLaboral");
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
    private final static QName _CheckListFlujoDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Descripcion");
    private final static QName _CheckListFlujoExcepcionRequerida_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ExcepcionRequerida");
    private final static QName _CheckListFlujoMandatorio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Mandatorio");
    private final static QName _CheckListFlujoNombreCheckList_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NombreCheckList");
    private final static QName _CheckListFlujoValor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Valor");
    private final static QName _CatalogoItemCodigoNegocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigoNegocio");
    private final static QName _CatalogoItemCodigoNegocioPadre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigoNegocioPadre");
    private final static QName _CatalogoItemCodigosNegocioNiveles_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CodigosNegocioNiveles");
    private final static QName _CatalogoItemId_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Id");
    private final static QName _CatalogoItemIdCodigoPadre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdCodigoPadre");
    private final static QName _CatalogoItemNivelSeleccionado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NivelSeleccionado");
    private final static QName _CatalogoItemParametro1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro1");
    private final static QName _CatalogoItemParametro4_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro4");
    private final static QName _CatalogoItemParametro5_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Parametro5");
    private final static QName _CatalogoItemUltimoNivel_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "UltimoNivel");
    private final static QName _CatalogoItemVigente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Vigente");
    private final static QName _DireccionActual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Actual");
    private final static QName _DireccionBarrio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Barrio");
    private final static QName _DireccionBloque_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Bloque");
    private final static QName _DireccionCallePrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CallePrincipal");
    private final static QName _DireccionCalleTransversal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "CalleTransversal");
    private final static QName _DireccionCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Ciudad");
    private final static QName _DireccionClase_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Clase");
    private final static QName _DireccionCroquis_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Croquis");
    private final static QName _DireccionDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Departamento");
    private final static QName _DireccionDescripcionTipoDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "DescripcionTipoDireccion");
    private final static QName _DireccionEdificioConjunto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "EdificioConjunto");
    private final static QName _DireccionExtranjera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Extranjera");
    private final static QName _DireccionFechaModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "FechaModificacion");
    private final static QName _DireccionFechaVerificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "FechaVerificacion");
    private final static QName _DireccionIdCanton_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdCanton");
    private final static QName _DireccionIdCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdCiudad");
    private final static QName _DireccionIdDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdDireccion");
    private final static QName _DireccionIdPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdPais");
    private final static QName _DireccionIdParroquia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdParroquia");
    private final static QName _DireccionIdProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdProvincia");
    private final static QName _DireccionIdSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "IdSector");
    private final static QName _DireccionLoginModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "LoginModificacion");
    private final static QName _DireccionNombrePropietario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "NombrePropietario");
    private final static QName _DireccionNumeracion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Numeracion");
    private final static QName _DireccionNumero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Numero");
    private final static QName _DireccionOficinaModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "OficinaModificacion");
    private final static QName _DireccionPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Pais");
    private final static QName _DireccionPiso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Piso");
    private final static QName _DireccionProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Provincia");
    private final static QName _DireccionSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Sector");
    private final static QName _DireccionTelefonoPropietario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "TelefonoPropietario");
    private final static QName _DireccionTiempoResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "TiempoResidencia");
    private final static QName _DireccionTipoDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "TipoDireccion");
    private final static QName _DireccionValorVivienda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "ValorVivienda");
    private final static QName _DireccionVerificadoPor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "VerificadoPor");
    private final static QName _MSCatalogosCatalogo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", "Catalogo");
    private final static QName _MERespuestaFirmaElectronicaDocumentofBase64_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DocumentofBase64");
    private final static QName _MEFirmaElectronicaPersonaCapturaFirmante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CapturaFirmante");
    private final static QName _MEFirmaElectronicaPersonaCedulaFrontal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CedulaFrontal");
    private final static QName _MEFirmaElectronicaPersonaCedulaPosterior_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CedulaPosterior");
    private final static QName _MEFirmaElectronicaPersonaConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Conyuge");
    private final static QName _MEFirmaElectronicaPersonaDireccionIP_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DireccionIP");
    private final static QName _MEFirmaElectronicaPersonaDispositivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Dispositivo");
    private final static QName _MEFirmaElectronicaPersonaEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EstadoCivil");
    private final static QName _MEFirmaElectronicaPersonaFechaExpedicion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaExpedicion");
    private final static QName _MEFirmaElectronicaPersonaFechaNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaNacimiento");
    private final static QName _MEFirmaElectronicaPersonaFotoCiudadano_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FotoCiudadano");
    private final static QName _MEFirmaElectronicaPersonaHuella_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Huella");
    private final static QName _MEFirmaElectronicaPersonaLocalizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Localizacion");
    private final static QName _MEFirmaElectronicaPersonaLugarNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "LugarNacimiento");
    private final static QName _MEFirmaElectronicaPersonaNacionalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Nacionalidad");
    private final static QName _MEFirmaElectronicaPersonaNavegador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Navegador");
    private final static QName _MEFirmaElectronicaPersonaProfesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Profesion");
    private final static QName _MEFirmaElectronicaPersonaRekognition_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Rekognition");
    private final static QName _MEFirmaElectronicaPersonaSistemaOperativo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SistemaOperativo");
    private final static QName _MEDocumentoFirmaElectronicaEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Estado");
    private final static QName _MEDocumentoFirmaElectronicaLinkDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "LinkDocumento");
    private final static QName _MSSimulacionPagoCreditoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Credito");
    private final static QName _MSSimulacionPagoCreditoCuotas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Cuotas");
    private final static QName _MEPagoExtraordinarioCreditoCodigoVerificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoVerificacion");
    private final static QName _MEPagoExtraordinarioCreditoNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroCuenta");
    private final static QName _MEPagoExtraordinarioCreditoNumeroOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroOperacion");
    private final static QName _MERiesgoAmbientalArchivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Archivo");
    private final static QName _MERiesgoAmbientalListaPreguntas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaPreguntas");
    private final static QName _MSRiesgoAmbientalDocumentoSaras_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DocumentoSaras");
    private final static QName _MEAprobarFaseComentario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Comentario");
    private final static QName _MECarpetaDocumentosCreditoDocumentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Documentos");
    private final static QName _MECarpetaDocumentosCreditoIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdentificacionCliente");
    private final static QName _MECreacionCreditoCodigoActividadEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoActividadEconomica");
    private final static QName _MECreacionCreditoCodigoDestinoEspecifico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoDestinoEspecifico");
    private final static QName _MECreacionCreditoCodigoDestinoFinanciero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoDestinoFinanciero");
    private final static QName _MECreacionCreditoCodigoOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoOficial");
    private final static QName _MECreacionCreditoCodigoTipoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoTipoCredito");
    private final static QName _MECreacionCreditoCodigoTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoTipoOperacion");
    private final static QName _MECreacionCreditoCodigoTipoTabla_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoTipoTabla");
    private final static QName _MECreacionCreditoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Identificacion");
    private final static QName _MEInformacionEvaluacionEvaluacionConsumo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EvaluacionConsumo");
    private final static QName _MEInformacionEvaluacionEvaluacionMicro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EvaluacionMicro");
    private final static QName _MSDocumentosCreditoDocumentosCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DocumentosCredito");
    private final static QName _MSGuardarCreditoListaPoliticas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaPoliticas");
    private final static QName _MSGuardarCreditoTipoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoCredito");
    private final static QName _MEGuardarCreditoCodigoActividadBce_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoActividadBce");
    private final static QName _MEGuardarCreditoCodigoAgencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoAgencia");
    private final static QName _MEGuardarCreditoCodigoDestinoVerde_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoDestinoVerde");
    private final static QName _MEGuardarCreditoComentariosCualitativos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ComentariosCualitativos");
    private final static QName _MEGuardarCreditoComentariosCuantitativos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ComentariosCuantitativos");
    private final static QName _MEGuardarCreditoNombreImpreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NombreImpreso");
    private final static QName _MSCalcularCreditoTieneTarjeta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TieneTarjeta");
    private final static QName _EvaluacionEconomicaConsumoFechaEvaluacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaEvaluacion");
    private final static QName _EvaluacionEconomicaConsumoIdOcupacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdOcupacion");
    private final static QName _EvaluacionEconomicaConsumoIdOcupacionPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdOcupacionPareja");
    private final static QName _EvaluacionEconomicaConsumoMensajeCumpleCapacidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MensajeCumpleCapacidad");
    private final static QName _EvaluacionEconomicaConsumoMensajeCumplePatrimonio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MensajeCumplePatrimonio");
    private final static QName _EvaluacionEconomicaConsumoMensajeCumpleRelacionCuotaIngreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "MensajeCumpleRelacionCuotaIngreso");
    private final static QName _MSEvaluacionEconomicaClasesRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ClasesRubro");
    private final static QName _MSEvaluacionEconomicaClasesRubroPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ClasesRubroPareja");
    private final static QName _MSEvaluacionEconomicaListaActivos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaActivos");
    private final static QName _MSEvaluacionEconomicaListaDetalleProductos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaDetalleProductos");
    private final static QName _MSEvaluacionEconomicaListaManoObra_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaManoObra");
    private final static QName _MSEvaluacionEconomicaListaPasivos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ListaPasivos");
    private final static QName _MSEvaluacionEconomicaRubros_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Rubros");
    private final static QName _MSEvaluacionEconomicaRubrosPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RubrosPareja");
    private final static QName _MSTipoCreditoEmpleosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EmpleosCliente");
    private final static QName _MSTipoCreditoEmpleosClienteConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EmpleosClienteConyuge");
    private final static QName _MSTipoCreditoIdEmpleoPrincipalConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdEmpleoPrincipalConyuge");
    private final static QName _MSConsultaCreditoPreferencialProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Producto");
    private final static QName _OperacionCarteraRenovacionDescripcionProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionProducto");
    private final static QName _OperacionCarteraRenovacionNroOpBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NroOpBanco");
    private final static QName _MSDatosRenovacionOperaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Operaciones");
    private final static QName _MERenovacionCreditoNumeroOperacionesRenovar_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroOperacionesRenovar");
    private final static QName _MSConsultaSolicitudAutomotrizCodigoEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoEstado");
    private final static QName _MSConsultaSolicitudAutomotrizDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Descripcion");
    private final static QName _MSConsultaSolicitudAutomotrizDescripcionAseguradora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionAseguradora");
    private final static QName _MSConsultaSolicitudAutomotrizDescripcionEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionEstado");
    private final static QName _MSConsultaSolicitudAutomotrizDescripcionFinanciera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionFinanciera");
    private final static QName _MSConsultaSolicitudAutomotrizRucAseguradora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RucAseguradora");
    private final static QName _MSConsultaSolicitudAutomotrizRucDispositivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RucDispositivo");
    private final static QName _MSConsultaSolicitudAutomotrizRucFinanciera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RucFinanciera");
    private final static QName _MEConsultaSolicitudAutomotrizNumeroSolicitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroSolicitud");
    private final static QName _MSCreditoAutomotrizIdPresolicitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdPresolicitud");
    private final static QName _MECreditoAutomotrizAseguradora_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Aseguradora");
    private final static QName _MECreditoAutomotrizCallePrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CallePrincipal");
    private final static QName _MECreditoAutomotrizCalleSecundaria_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CalleSecundaria");
    private final static QName _MECreditoAutomotrizCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Celular");
    private final static QName _MECreditoAutomotrizCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Ciudad");
    private final static QName _MECreditoAutomotrizCodigoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoProducto");
    private final static QName _MECreditoAutomotrizColor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Color");
    private final static QName _MECreditoAutomotrizCorreo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Correo");
    private final static QName _MECreditoAutomotrizDescripcionPeriodoGracia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionPeriodoGracia");
    private final static QName _MECreditoAutomotrizDescripcionPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionPlazo");
    private final static QName _MECreditoAutomotrizEmpresaLineaCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EmpresaLineaCredito");
    private final static QName _MECreditoAutomotrizFrecuenciaPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FrecuenciaPago");
    private final static QName _MECreditoAutomotrizFuentePago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FuentePago");
    private final static QName _MECreditoAutomotrizHojaNegocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "HojaNegocio");
    private final static QName _MECreditoAutomotrizIdentificacionAsesor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdentificacionAsesor");
    private final static QName _MECreditoAutomotrizModelo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Modelo");
    private final static QName _MECreditoAutomotrizNumero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Numero");
    private final static QName _MECreditoAutomotrizPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Pais");
    private final static QName _MECreditoAutomotrizParroquia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Parroquia");
    private final static QName _MECreditoAutomotrizPasaporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Pasaporte");
    private final static QName _MECreditoAutomotrizPrimerApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "PrimerApellido");
    private final static QName _MECreditoAutomotrizPrimerNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "PrimerNombre");
    private final static QName _MECreditoAutomotrizProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Provincia");
    private final static QName _MECreditoAutomotrizRazonSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RazonSocial");
    private final static QName _MECreditoAutomotrizSegundoApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SegundoApellido");
    private final static QName _MECreditoAutomotrizSegundoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SegundoNombre");
    private final static QName _MECreditoAutomotrizTelefonoFijo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TelefonoFijo");
    private final static QName _MECreditoAutomotrizTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoIdentificacion");
    private final static QName _MECreditoAutomotrizTipoTercero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoTercero");
    private final static QName _MECreditoConsolidadoIdValidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdValidacion");
    private final static QName _MECreditoConsolidadoNumeroOperacionRenovar_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroOperacionRenovar");
    private final static QName _MECreditoConsolidadoSegmentacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Segmentacion");
    private final static QName _MECreditoConsolidadoVentasAnuales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "VentasAnuales");
    private final static QName _MEDocumentoCreditoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoDocumento");
    private final static QName _MECreditoCanalesServicioAsistencias_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ServicioAsistencias");
    private final static QName _MECreditoCanalesTerminalAutoservicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TerminalAutoservicio");
    private final static QName _MEConsultaScoreFechaIngresoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaIngresoCliente");
    private final static QName _MEConsultaScoreGeneroCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "GeneroCliente");
    private final static QName _MEConsultaScoreIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdentificacionConyuge");
    private final static QName _MEConsultaScoreSegmentoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SegmentoCliente");
    private final static QName _MEConsultaScoreTipoIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoIdentificacionConyuge");
    private final static QName _MESimulacionTipoPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoPlazo");
    private final static QName _MESimulacionTipoTabla_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoTabla");
    private final static QName _MSRegistroPagoDatosPagos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DatosPagos");
    private final static QName _PagoDiarioAccNumeroCuentaGrupal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroCuentaGrupal");
    private final static QName _PagoDiarioAccObservacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Observacion");
    private final static QName _PagoDiarioAccResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Resultado");
    private final static QName _MSConsultaSaldosVencidosSaldosOperaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "SaldosOperaciones");
    private final static QName _TipoOperacionDesTipoCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DesTipoCuota");
    private final static QName _TipoOperacionDescripcionMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionMoneda");
    private final static QName _TipoOperacionDescripcionTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionTipoOperacion");
    private final static QName _TipoOperacionReduccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Reduccion");
    private final static QName _TipoOperacionTipoAmortizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoAmortizacion");
    private final static QName _TipoOperacionTipoCobroIntereses_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoCobroIntereses");
    private final static QName _TipoOperacionTipoCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoCuota");
    private final static QName _MSTipoOperacionTiposOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TiposOperacion");
    private final static QName _METipoCarteraCodigo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Codigo");
    private final static QName _METipoCarteraTipoCartera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoCartera");
    private final static QName _ClienteGarantiaCodigoRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoRol");
    private final static QName _ClienteGarantiaDescripcionRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionRol");
    private final static QName _ClienteGarantiaNombres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Nombres");
    private final static QName _GarantiaClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Clientes");
    private final static QName _GarantiaCodigoGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoGarantia");
    private final static QName _GarantiaCodigoMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoMoneda");
    private final static QName _GarantiaNroOperacionRelacionada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NroOperacionRelacionada");
    private final static QName _GarantiaTipoGarantia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoGarantia");
    private final static QName _MSConsultasGarantiasGarantias_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Garantias");
    private final static QName _MECreacionGarantiaIdGarante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdGarante");
    private final static QName _MECreacionGarantiaMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Moneda");
    private final static QName _MECreacionGarantiaSucursal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Sucursal");
    private final static QName _MECreacionGarantiaTipoBien_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoBien");
    private final static QName _MEConsultasCreditoCodigoQr_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoQr");
    private final static QName _MEConsultasCreditoFirmaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FirmaCliente");
    private final static QName _TramiteCreditoEstadoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EstadoOperacion");
    private final static QName _TramiteCreditoNombreDeudor_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NombreDeudor");
    private final static QName _TramiteCreditoNombreOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NombreOficial");
    private final static QName _TramiteCreditoOperacionBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "OperacionBanco");
    private final static QName _TramiteCreditoTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Tipo");
    private final static QName _MSConsultasCreditoCreditos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Creditos");
    private final static QName _MSConsultasCreditoCreditosPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CreditosPareja");
    private final static QName _MSConsultasCreditoMovimientos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Movimientos");
    private final static QName _MSConsultasCreditoNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Nombre");
    private final static QName _SaldosOperacionSegmento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Segmento");
    private final static QName _RubroPrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Principal");
    private final static QName _RubroTipoRecepcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoRecepcion");
    private final static QName _RubroTipoRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TipoRubro");
    private final static QName _PagoCuentaPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CuentaPago");
    private final static QName _PagoFormaPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FormaPago");
    private final static QName _PagoLoginAplico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "LoginAplico");
    private final static QName _PagoTerminalPago_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TerminalPago");
    private final static QName _DetalleCuotaEstadoRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EstadoRubro");
    private final static QName _MSCreditosCuotasPendientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CuotasPendientes");
    private final static QName _MSCreditosPagosOperaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "PagosOperaciones");
    private final static QName _MSCreditosRubrosDesembolso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "RubrosDesembolso");
    private final static QName _MSCreditosTablaAmortizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "TablaAmortizacion");
    private final static QName _OperacionCarteraActividadEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "ActividadEconomica");
    private final static QName _OperacionCarteraCodOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodOficina");
    private final static QName _OperacionCarteraCodigoCantonDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoCantonDestino");
    private final static QName _OperacionCarteraCodigoCiudadDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoCiudadDestino");
    private final static QName _OperacionCarteraCodigoDesEspecifico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoDesEspecifico");
    private final static QName _OperacionCarteraCodigoOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoOficina");
    private final static QName _OperacionCarteraCodigoOrigenRecursos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoOrigenRecursos");
    private final static QName _OperacionCarteraCodigoParroquiaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoParroquiaDestino");
    private final static QName _OperacionCarteraCodigoProvinciaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoProvinciaDestino");
    private final static QName _OperacionCarteraCodigoSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoSector");
    private final static QName _OperacionCarteraCodigoSegmento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoSegmento");
    private final static QName _OperacionCarteraCodigoTipoOp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CodigoTipoOp");
    private final static QName _OperacionCarteraCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Cuenta");
    private final static QName _OperacionCarteraDesMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DesMoneda");
    private final static QName _OperacionCarteraDesSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DesSector");
    private final static QName _OperacionCarteraDesTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DesTipoOperacion");
    private final static QName _OperacionCarteraDescFormaRecepcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescFormaRecepcion");
    private final static QName _OperacionCarteraDescTipoCuota_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescTipoCuota");
    private final static QName _OperacionCarteraDescTipoPlazo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescTipoPlazo");
    private final static QName _OperacionCarteraDescripcionCantonDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionCantonDestino");
    private final static QName _OperacionCarteraDescripcionCiudadDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionCiudadDestino");
    private final static QName _OperacionCarteraDescripcionDesEspecifico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionDesEspecifico");
    private final static QName _OperacionCarteraDescripcionOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionOficina");
    private final static QName _OperacionCarteraDescripcionOrigenRecursos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionOrigenRecursos");
    private final static QName _OperacionCarteraDescripcionParroquiaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionParroquiaDestino");
    private final static QName _OperacionCarteraDescripcionProvinciaDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionProvinciaDestino");
    private final static QName _OperacionCarteraDescripcionSegmento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "DescripcionSegmento");
    private final static QName _OperacionCarteraEstadoSolicitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "EstadoSolicitud");
    private final static QName _OperacionCarteraFechaDeEmision_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaDeEmision");
    private final static QName _OperacionCarteraFechaDeVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaDeVencimiento");
    private final static QName _OperacionCarteraFechaLiquidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "FechaLiquidacion");
    private final static QName _OperacionCarteraIdTipoCredito_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "IdTipoCredito");
    private final static QName _OperacionCarteraNombreCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NombreCliente");
    private final static QName _OperacionCarteraNumeroOperacionCartera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NumeroOperacionCartera");
    private final static QName _MECreditosCuentaGrupal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "CuentaGrupal");
    private final static QName _MECreditosDeudores_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Deudores");
    private final static QName _MECreditosOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Operacion");
    private final static QName _ClienteTramiteDirecciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Direcciones");
    private final static QName _ClienteTramiteNombresCompletos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "NombresCompletos");
    private final static QName _ClienteTramiteRol_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", "Rol");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteTramite }
     * 
     */
    public ClienteTramite createClienteTramite() {
        return new ClienteTramite();
    }

    /**
     * Create an instance of {@link ArrayOfClienteTramite }
     * 
     */
    public ArrayOfClienteTramite createArrayOfClienteTramite() {
        return new ArrayOfClienteTramite();
    }

    /**
     * Create an instance of {@link MECreditos }
     * 
     */
    public MECreditos createMECreditos() {
        return new MECreditos();
    }

    /**
     * Create an instance of {@link OperacionCartera }
     * 
     */
    public OperacionCartera createOperacionCartera() {
        return new OperacionCartera();
    }

    /**
     * Create an instance of {@link MSCreditos }
     * 
     */
    public MSCreditos createMSCreditos() {
        return new MSCreditos();
    }

    /**
     * Create an instance of {@link ArrayOfCuota }
     * 
     */
    public ArrayOfCuota createArrayOfCuota() {
        return new ArrayOfCuota();
    }

    /**
     * Create an instance of {@link Cuota }
     * 
     */
    public Cuota createCuota() {
        return new Cuota();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleCuota }
     * 
     */
    public ArrayOfDetalleCuota createArrayOfDetalleCuota() {
        return new ArrayOfDetalleCuota();
    }

    /**
     * Create an instance of {@link DetalleCuota }
     * 
     */
    public DetalleCuota createDetalleCuota() {
        return new DetalleCuota();
    }

    /**
     * Create an instance of {@link ArrayOfOperacionCartera }
     * 
     */
    public ArrayOfOperacionCartera createArrayOfOperacionCartera() {
        return new ArrayOfOperacionCartera();
    }

    /**
     * Create an instance of {@link ArrayOfPago }
     * 
     */
    public ArrayOfPago createArrayOfPago() {
        return new ArrayOfPago();
    }

    /**
     * Create an instance of {@link Pago }
     * 
     */
    public Pago createPago() {
        return new Pago();
    }

    /**
     * Create an instance of {@link ArrayOfRubro }
     * 
     */
    public ArrayOfRubro createArrayOfRubro() {
        return new ArrayOfRubro();
    }

    /**
     * Create an instance of {@link Rubro }
     * 
     */
    public Rubro createRubro() {
        return new Rubro();
    }

    /**
     * Create an instance of {@link ArrayOfSaldosOperacion }
     * 
     */
    public ArrayOfSaldosOperacion createArrayOfSaldosOperacion() {
        return new ArrayOfSaldosOperacion();
    }

    /**
     * Create an instance of {@link SaldosOperacion }
     * 
     */
    public SaldosOperacion createSaldosOperacion() {
        return new SaldosOperacion();
    }

    /**
     * Create an instance of {@link MSConsultasCredito }
     * 
     */
    public MSConsultasCredito createMSConsultasCredito() {
        return new MSConsultasCredito();
    }

    /**
     * Create an instance of {@link TramiteCredito }
     * 
     */
    public TramiteCredito createTramiteCredito() {
        return new TramiteCredito();
    }

    /**
     * Create an instance of {@link ArrayOfTramiteCredito }
     * 
     */
    public ArrayOfTramiteCredito createArrayOfTramiteCredito() {
        return new ArrayOfTramiteCredito();
    }

    /**
     * Create an instance of {@link ArrayOfMovimientoCredito }
     * 
     */
    public ArrayOfMovimientoCredito createArrayOfMovimientoCredito() {
        return new ArrayOfMovimientoCredito();
    }

    /**
     * Create an instance of {@link MovimientoCredito }
     * 
     */
    public MovimientoCredito createMovimientoCredito() {
        return new MovimientoCredito();
    }

    /**
     * Create an instance of {@link MEConsultasCredito }
     * 
     */
    public MEConsultasCredito createMEConsultasCredito() {
        return new MEConsultasCredito();
    }

    /**
     * Create an instance of {@link MECreacionGarantia }
     * 
     */
    public MECreacionGarantia createMECreacionGarantia() {
        return new MECreacionGarantia();
    }

    /**
     * Create an instance of {@link MSCreacionGarantia }
     * 
     */
    public MSCreacionGarantia createMSCreacionGarantia() {
        return new MSCreacionGarantia();
    }

    /**
     * Create an instance of {@link MEReasignacionGarantia }
     * 
     */
    public MEReasignacionGarantia createMEReasignacionGarantia() {
        return new MEReasignacionGarantia();
    }

    /**
     * Create an instance of {@link MEConsultasGarantia }
     * 
     */
    public MEConsultasGarantia createMEConsultasGarantia() {
        return new MEConsultasGarantia();
    }

    /**
     * Create an instance of {@link MSConsultasGarantias }
     * 
     */
    public MSConsultasGarantias createMSConsultasGarantias() {
        return new MSConsultasGarantias();
    }

    /**
     * Create an instance of {@link ArrayOfGarantia }
     * 
     */
    public ArrayOfGarantia createArrayOfGarantia() {
        return new ArrayOfGarantia();
    }

    /**
     * Create an instance of {@link Garantia }
     * 
     */
    public Garantia createGarantia() {
        return new Garantia();
    }

    /**
     * Create an instance of {@link ArrayOfClienteGarantia }
     * 
     */
    public ArrayOfClienteGarantia createArrayOfClienteGarantia() {
        return new ArrayOfClienteGarantia();
    }

    /**
     * Create an instance of {@link ClienteGarantia }
     * 
     */
    public ClienteGarantia createClienteGarantia() {
        return new ClienteGarantia();
    }

    /**
     * Create an instance of {@link METipoCartera }
     * 
     */
    public METipoCartera createMETipoCartera() {
        return new METipoCartera();
    }

    /**
     * Create an instance of {@link MSTipoOperacion }
     * 
     */
    public MSTipoOperacion createMSTipoOperacion() {
        return new MSTipoOperacion();
    }

    /**
     * Create an instance of {@link ArrayOfTipoOperacion }
     * 
     */
    public ArrayOfTipoOperacion createArrayOfTipoOperacion() {
        return new ArrayOfTipoOperacion();
    }

    /**
     * Create an instance of {@link TipoOperacion }
     * 
     */
    public TipoOperacion createTipoOperacion() {
        return new TipoOperacion();
    }

    /**
     * Create an instance of {@link MSConsultaSaldosVencidos }
     * 
     */
    public MSConsultaSaldosVencidos createMSConsultaSaldosVencidos() {
        return new MSConsultaSaldosVencidos();
    }

    /**
     * Create an instance of {@link ArrayOfSaldosVencidosOperacion }
     * 
     */
    public ArrayOfSaldosVencidosOperacion createArrayOfSaldosVencidosOperacion() {
        return new ArrayOfSaldosVencidosOperacion();
    }

    /**
     * Create an instance of {@link SaldosVencidosOperacion }
     * 
     */
    public SaldosVencidosOperacion createSaldosVencidosOperacion() {
        return new SaldosVencidosOperacion();
    }

    /**
     * Create an instance of {@link MERegistroPago }
     * 
     */
    public MERegistroPago createMERegistroPago() {
        return new MERegistroPago();
    }

    /**
     * Create an instance of {@link ArrayOfPagoDiarioAcc }
     * 
     */
    public ArrayOfPagoDiarioAcc createArrayOfPagoDiarioAcc() {
        return new ArrayOfPagoDiarioAcc();
    }

    /**
     * Create an instance of {@link PagoDiarioAcc }
     * 
     */
    public PagoDiarioAcc createPagoDiarioAcc() {
        return new PagoDiarioAcc();
    }

    /**
     * Create an instance of {@link MSRegistroPago }
     * 
     */
    public MSRegistroPago createMSRegistroPago() {
        return new MSRegistroPago();
    }

    /**
     * Create an instance of {@link MESimulacion }
     * 
     */
    public MESimulacion createMESimulacion() {
        return new MESimulacion();
    }

    /**
     * Create an instance of {@link MEConsultaScore }
     * 
     */
    public MEConsultaScore createMEConsultaScore() {
        return new MEConsultaScore();
    }

    /**
     * Create an instance of {@link MECreditoCanales }
     * 
     */
    public MECreditoCanales createMECreditoCanales() {
        return new MECreditoCanales();
    }

    /**
     * Create an instance of {@link MSCreditoCanales }
     * 
     */
    public MSCreditoCanales createMSCreditoCanales() {
        return new MSCreditoCanales();
    }

    /**
     * Create an instance of {@link MEDocumentoCredito }
     * 
     */
    public MEDocumentoCredito createMEDocumentoCredito() {
        return new MEDocumentoCredito();
    }

    /**
     * Create an instance of {@link MECreditoConsolidado }
     * 
     */
    public MECreditoConsolidado createMECreditoConsolidado() {
        return new MECreditoConsolidado();
    }

    /**
     * Create an instance of {@link MSCreditoConsolidado }
     * 
     */
    public MSCreditoConsolidado createMSCreditoConsolidado() {
        return new MSCreditoConsolidado();
    }

    /**
     * Create an instance of {@link MECreditoAutomotriz }
     * 
     */
    public MECreditoAutomotriz createMECreditoAutomotriz() {
        return new MECreditoAutomotriz();
    }

    /**
     * Create an instance of {@link MSCreditoAutomotriz }
     * 
     */
    public MSCreditoAutomotriz createMSCreditoAutomotriz() {
        return new MSCreditoAutomotriz();
    }

    /**
     * Create an instance of {@link MSSolicitudCreditoAutomotriz }
     * 
     */
    public MSSolicitudCreditoAutomotriz createMSSolicitudCreditoAutomotriz() {
        return new MSSolicitudCreditoAutomotriz();
    }

    /**
     * Create an instance of {@link MEConsultaSolicitudAutomotriz }
     * 
     */
    public MEConsultaSolicitudAutomotriz createMEConsultaSolicitudAutomotriz() {
        return new MEConsultaSolicitudAutomotriz();
    }

    /**
     * Create an instance of {@link MSConsultaSolicitudAutomotriz }
     * 
     */
    public MSConsultaSolicitudAutomotriz createMSConsultaSolicitudAutomotriz() {
        return new MSConsultaSolicitudAutomotriz();
    }

    /**
     * Create an instance of {@link MERenovacionCredito }
     * 
     */
    public MERenovacionCredito createMERenovacionCredito() {
        return new MERenovacionCredito();
    }

    /**
     * Create an instance of {@link MSRenovacionCredito }
     * 
     */
    public MSRenovacionCredito createMSRenovacionCredito() {
        return new MSRenovacionCredito();
    }

    /**
     * Create an instance of {@link MSDatosRenovacion }
     * 
     */
    public MSDatosRenovacion createMSDatosRenovacion() {
        return new MSDatosRenovacion();
    }

    /**
     * Create an instance of {@link ArrayOfOperacionCarteraRenovacion }
     * 
     */
    public ArrayOfOperacionCarteraRenovacion createArrayOfOperacionCarteraRenovacion() {
        return new ArrayOfOperacionCarteraRenovacion();
    }

    /**
     * Create an instance of {@link OperacionCarteraRenovacion }
     * 
     */
    public OperacionCarteraRenovacion createOperacionCarteraRenovacion() {
        return new OperacionCarteraRenovacion();
    }

    /**
     * Create an instance of {@link MSConsultaCreditoPreferencial }
     * 
     */
    public MSConsultaCreditoPreferencial createMSConsultaCreditoPreferencial() {
        return new MSConsultaCreditoPreferencial();
    }

    /**
     * Create an instance of {@link MSTipoCredito }
     * 
     */
    public MSTipoCredito createMSTipoCredito() {
        return new MSTipoCredito();
    }

    /**
     * Create an instance of {@link ParametroProspeccionCredito }
     * 
     */
    public ParametroProspeccionCredito createParametroProspeccionCredito() {
        return new ParametroProspeccionCredito();
    }

    /**
     * Create an instance of {@link METipoProcesoCredito }
     * 
     */
    public METipoProcesoCredito createMETipoProcesoCredito() {
        return new METipoProcesoCredito();
    }

    /**
     * Create an instance of {@link MSTipoProcesoCredito }
     * 
     */
    public MSTipoProcesoCredito createMSTipoProcesoCredito() {
        return new MSTipoProcesoCredito();
    }

    /**
     * Create an instance of {@link MSEvaluacionEconomica }
     * 
     */
    public MSEvaluacionEconomica createMSEvaluacionEconomica() {
        return new MSEvaluacionEconomica();
    }

    /**
     * Create an instance of {@link EvaluacionEconomicaConsumo }
     * 
     */
    public EvaluacionEconomicaConsumo createEvaluacionEconomicaConsumo() {
        return new EvaluacionEconomicaConsumo();
    }

    /**
     * Create an instance of {@link EvaluacionEconomicaMicro }
     * 
     */
    public EvaluacionEconomicaMicro createEvaluacionEconomicaMicro() {
        return new EvaluacionEconomicaMicro();
    }

    /**
     * Create an instance of {@link MECalcularCredito }
     * 
     */
    public MECalcularCredito createMECalcularCredito() {
        return new MECalcularCredito();
    }

    /**
     * Create an instance of {@link MSCalcularCredito }
     * 
     */
    public MSCalcularCredito createMSCalcularCredito() {
        return new MSCalcularCredito();
    }

    /**
     * Create an instance of {@link MEGuardarCredito }
     * 
     */
    public MEGuardarCredito createMEGuardarCredito() {
        return new MEGuardarCredito();
    }

    /**
     * Create an instance of {@link MSGuardarCredito }
     * 
     */
    public MSGuardarCredito createMSGuardarCredito() {
        return new MSGuardarCredito();
    }

    /**
     * Create an instance of {@link MSDocumentosCredito }
     * 
     */
    public MSDocumentosCredito createMSDocumentosCredito() {
        return new MSDocumentosCredito();
    }

    /**
     * Create an instance of {@link MEInformacionEvaluacion }
     * 
     */
    public MEInformacionEvaluacion createMEInformacionEvaluacion() {
        return new MEInformacionEvaluacion();
    }

    /**
     * Create an instance of {@link MECreacionCredito }
     * 
     */
    public MECreacionCredito createMECreacionCredito() {
        return new MECreacionCredito();
    }

    /**
     * Create an instance of {@link MECarpetaDocumentosCredito }
     * 
     */
    public MECarpetaDocumentosCredito createMECarpetaDocumentosCredito() {
        return new MECarpetaDocumentosCredito();
    }

    /**
     * Create an instance of {@link MEAprobarFase }
     * 
     */
    public MEAprobarFase createMEAprobarFase() {
        return new MEAprobarFase();
    }

    /**
     * Create an instance of {@link MSRiesgoAmbiental }
     * 
     */
    public MSRiesgoAmbiental createMSRiesgoAmbiental() {
        return new MSRiesgoAmbiental();
    }

    /**
     * Create an instance of {@link MERiesgoAmbiental }
     * 
     */
    public MERiesgoAmbiental createMERiesgoAmbiental() {
        return new MERiesgoAmbiental();
    }

    /**
     * Create an instance of {@link MEPagoExtraordinarioCredito }
     * 
     */
    public MEPagoExtraordinarioCredito createMEPagoExtraordinarioCredito() {
        return new MEPagoExtraordinarioCredito();
    }

    /**
     * Create an instance of {@link MSSimulacionPagoCredito }
     * 
     */
    public MSSimulacionPagoCredito createMSSimulacionPagoCredito() {
        return new MSSimulacionPagoCredito();
    }

    /**
     * Create an instance of {@link MSResultadoPagoCredito }
     * 
     */
    public MSResultadoPagoCredito createMSResultadoPagoCredito() {
        return new MSResultadoPagoCredito();
    }

    /**
     * Create an instance of {@link MEDocumentoFirmaElectronica }
     * 
     */
    public MEDocumentoFirmaElectronica createMEDocumentoFirmaElectronica() {
        return new MEDocumentoFirmaElectronica();
    }

    /**
     * Create an instance of {@link MEFirmaElectronicaPersona }
     * 
     */
    public MEFirmaElectronicaPersona createMEFirmaElectronicaPersona() {
        return new MEFirmaElectronicaPersona();
    }

    /**
     * Create an instance of {@link MERespuestaFirmaElectronica }
     * 
     */
    public MERespuestaFirmaElectronica createMERespuestaFirmaElectronica() {
        return new MERespuestaFirmaElectronica();
    }

    /**
     * Create an instance of {@link MSCatalogos }
     * 
     */
    public MSCatalogos createMSCatalogos() {
        return new MSCatalogos();
    }

    /**
     * Create an instance of {@link ArrayOfDireccion }
     * 
     */
    public ArrayOfDireccion createArrayOfDireccion() {
        return new ArrayOfDireccion();
    }

    /**
     * Create an instance of {@link Direccion }
     * 
     */
    public Direccion createDireccion() {
        return new Direccion();
    }

    /**
     * Create an instance of {@link ArrayOfCatalogoItem }
     * 
     */
    public ArrayOfCatalogoItem createArrayOfCatalogoItem() {
        return new ArrayOfCatalogoItem();
    }

    /**
     * Create an instance of {@link CatalogoItem }
     * 
     */
    public CatalogoItem createCatalogoItem() {
        return new CatalogoItem();
    }

    /**
     * Create an instance of {@link ArrayOfCheckListFlujo }
     * 
     */
    public ArrayOfCheckListFlujo createArrayOfCheckListFlujo() {
        return new ArrayOfCheckListFlujo();
    }

    /**
     * Create an instance of {@link CheckListFlujo }
     * 
     */
    public CheckListFlujo createCheckListFlujo() {
        return new CheckListFlujo();
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
     * Create an instance of {@link ArrayOfEmpleo }
     * 
     */
    public ArrayOfEmpleo createArrayOfEmpleo() {
        return new ArrayOfEmpleo();
    }

    /**
     * Create an instance of {@link Empleo }
     * 
     */
    public Empleo createEmpleo() {
        return new Empleo();
    }

    /**
     * Create an instance of {@link ArrayOfClaseRubro }
     * 
     */
    public ArrayOfClaseRubro createArrayOfClaseRubro() {
        return new ArrayOfClaseRubro();
    }

    /**
     * Create an instance of {@link ClaseRubro }
     * 
     */
    public ClaseRubro createClaseRubro() {
        return new ClaseRubro();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleActivo }
     * 
     */
    public ArrayOfDetalleActivo createArrayOfDetalleActivo() {
        return new ArrayOfDetalleActivo();
    }

    /**
     * Create an instance of {@link DetalleActivo }
     * 
     */
    public DetalleActivo createDetalleActivo() {
        return new DetalleActivo();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleProductoMicroempresa }
     * 
     */
    public ArrayOfDetalleProductoMicroempresa createArrayOfDetalleProductoMicroempresa() {
        return new ArrayOfDetalleProductoMicroempresa();
    }

    /**
     * Create an instance of {@link DetalleProductoMicroempresa }
     * 
     */
    public DetalleProductoMicroempresa createDetalleProductoMicroempresa() {
        return new DetalleProductoMicroempresa();
    }

    /**
     * Create an instance of {@link ArrayOfManoObraMicroempresa }
     * 
     */
    public ArrayOfManoObraMicroempresa createArrayOfManoObraMicroempresa() {
        return new ArrayOfManoObraMicroempresa();
    }

    /**
     * Create an instance of {@link ManoObraMicroempresa }
     * 
     */
    public ManoObraMicroempresa createManoObraMicroempresa() {
        return new ManoObraMicroempresa();
    }

    /**
     * Create an instance of {@link ArrayOfDetallePasivo }
     * 
     */
    public ArrayOfDetallePasivo createArrayOfDetallePasivo() {
        return new ArrayOfDetallePasivo();
    }

    /**
     * Create an instance of {@link DetallePasivo }
     * 
     */
    public DetallePasivo createDetallePasivo() {
        return new DetallePasivo();
    }

    /**
     * Create an instance of {@link ArrayOfRubroIngresoEgreso }
     * 
     */
    public ArrayOfRubroIngresoEgreso createArrayOfRubroIngresoEgreso() {
        return new ArrayOfRubroIngresoEgreso();
    }

    /**
     * Create an instance of {@link RubroIngresoEgreso }
     * 
     */
    public RubroIngresoEgreso createRubroIngresoEgreso() {
        return new RubroIngresoEgreso();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteTramite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClienteTramite }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ClienteTramite")
    public JAXBElement<ClienteTramite> createClienteTramite(ClienteTramite value) {
        return new JAXBElement<ClienteTramite>(_ClienteTramite_QNAME, ClienteTramite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfClienteTramite")
    public JAXBElement<ArrayOfClienteTramite> createArrayOfClienteTramite(ArrayOfClienteTramite value) {
        return new JAXBElement<ArrayOfClienteTramite>(_ArrayOfClienteTramite_QNAME, ArrayOfClienteTramite.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreditos")
    public JAXBElement<MECreditos> createMECreditos(MECreditos value) {
        return new JAXBElement<MECreditos>(_MECreditos_QNAME, MECreditos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "OperacionCartera")
    public JAXBElement<OperacionCartera> createOperacionCartera(OperacionCartera value) {
        return new JAXBElement<OperacionCartera>(_OperacionCartera_QNAME, OperacionCartera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCreditos")
    public JAXBElement<MSCreditos> createMSCreditos(MSCreditos value) {
        return new JAXBElement<MSCreditos>(_MSCreditos_QNAME, MSCreditos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfCuota")
    public JAXBElement<ArrayOfCuota> createArrayOfCuota(ArrayOfCuota value) {
        return new JAXBElement<ArrayOfCuota>(_ArrayOfCuota_QNAME, ArrayOfCuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Cuota")
    public JAXBElement<Cuota> createCuota(Cuota value) {
        return new JAXBElement<Cuota>(_Cuota_QNAME, Cuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfDetalleCuota")
    public JAXBElement<ArrayOfDetalleCuota> createArrayOfDetalleCuota(ArrayOfDetalleCuota value) {
        return new JAXBElement<ArrayOfDetalleCuota>(_ArrayOfDetalleCuota_QNAME, ArrayOfDetalleCuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DetalleCuota")
    public JAXBElement<DetalleCuota> createDetalleCuota(DetalleCuota value) {
        return new JAXBElement<DetalleCuota>(_DetalleCuota_QNAME, DetalleCuota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfOperacionCartera")
    public JAXBElement<ArrayOfOperacionCartera> createArrayOfOperacionCartera(ArrayOfOperacionCartera value) {
        return new JAXBElement<ArrayOfOperacionCartera>(_ArrayOfOperacionCartera_QNAME, ArrayOfOperacionCartera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfPago")
    public JAXBElement<ArrayOfPago> createArrayOfPago(ArrayOfPago value) {
        return new JAXBElement<ArrayOfPago>(_ArrayOfPago_QNAME, ArrayOfPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Pago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Pago")
    public JAXBElement<Pago> createPago(Pago value) {
        return new JAXBElement<Pago>(_Pago_QNAME, Pago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfRubro")
    public JAXBElement<ArrayOfRubro> createArrayOfRubro(ArrayOfRubro value) {
        return new JAXBElement<ArrayOfRubro>(_ArrayOfRubro_QNAME, ArrayOfRubro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rubro")
    public JAXBElement<Rubro> createRubro(Rubro value) {
        return new JAXBElement<Rubro>(_Rubro_QNAME, Rubro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfSaldosOperacion")
    public JAXBElement<ArrayOfSaldosOperacion> createArrayOfSaldosOperacion(ArrayOfSaldosOperacion value) {
        return new JAXBElement<ArrayOfSaldosOperacion>(_ArrayOfSaldosOperacion_QNAME, ArrayOfSaldosOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaldosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SaldosOperacion")
    public JAXBElement<SaldosOperacion> createSaldosOperacion(SaldosOperacion value) {
        return new JAXBElement<SaldosOperacion>(_SaldosOperacion_QNAME, SaldosOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSConsultasCredito")
    public JAXBElement<MSConsultasCredito> createMSConsultasCredito(MSConsultasCredito value) {
        return new JAXBElement<MSConsultasCredito>(_MSConsultasCredito_QNAME, MSConsultasCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TramiteCredito")
    public JAXBElement<TramiteCredito> createTramiteCredito(TramiteCredito value) {
        return new JAXBElement<TramiteCredito>(_TramiteCredito_QNAME, TramiteCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfTramiteCredito")
    public JAXBElement<ArrayOfTramiteCredito> createArrayOfTramiteCredito(ArrayOfTramiteCredito value) {
        return new JAXBElement<ArrayOfTramiteCredito>(_ArrayOfTramiteCredito_QNAME, ArrayOfTramiteCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfMovimientoCredito")
    public JAXBElement<ArrayOfMovimientoCredito> createArrayOfMovimientoCredito(ArrayOfMovimientoCredito value) {
        return new JAXBElement<ArrayOfMovimientoCredito>(_ArrayOfMovimientoCredito_QNAME, ArrayOfMovimientoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovimientoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MovimientoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MovimientoCredito")
    public JAXBElement<MovimientoCredito> createMovimientoCredito(MovimientoCredito value) {
        return new JAXBElement<MovimientoCredito>(_MovimientoCredito_QNAME, MovimientoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEConsultasCredito")
    public JAXBElement<MEConsultasCredito> createMEConsultasCredito(MEConsultasCredito value) {
        return new JAXBElement<MEConsultasCredito>(_MEConsultasCredito_QNAME, MEConsultasCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreacionGarantia")
    public JAXBElement<MECreacionGarantia> createMECreacionGarantia(MECreacionGarantia value) {
        return new JAXBElement<MECreacionGarantia>(_MECreacionGarantia_QNAME, MECreacionGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCreacionGarantia")
    public JAXBElement<MSCreacionGarantia> createMSCreacionGarantia(MSCreacionGarantia value) {
        return new JAXBElement<MSCreacionGarantia>(_MSCreacionGarantia_QNAME, MSCreacionGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReasignacionGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReasignacionGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEReasignacionGarantia")
    public JAXBElement<MEReasignacionGarantia> createMEReasignacionGarantia(MEReasignacionGarantia value) {
        return new JAXBElement<MEReasignacionGarantia>(_MEReasignacionGarantia_QNAME, MEReasignacionGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEConsultasGarantia")
    public JAXBElement<MEConsultasGarantia> createMEConsultasGarantia(MEConsultasGarantia value) {
        return new JAXBElement<MEConsultasGarantia>(_MEConsultasGarantia_QNAME, MEConsultasGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasGarantias }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasGarantias }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSConsultasGarantias")
    public JAXBElement<MSConsultasGarantias> createMSConsultasGarantias(MSConsultasGarantias value) {
        return new JAXBElement<MSConsultasGarantias>(_MSConsultasGarantias_QNAME, MSConsultasGarantias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfGarantia")
    public JAXBElement<ArrayOfGarantia> createArrayOfGarantia(ArrayOfGarantia value) {
        return new JAXBElement<ArrayOfGarantia>(_ArrayOfGarantia_QNAME, ArrayOfGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Garantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Garantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Garantia")
    public JAXBElement<Garantia> createGarantia(Garantia value) {
        return new JAXBElement<Garantia>(_Garantia_QNAME, Garantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfClienteGarantia")
    public JAXBElement<ArrayOfClienteGarantia> createArrayOfClienteGarantia(ArrayOfClienteGarantia value) {
        return new JAXBElement<ArrayOfClienteGarantia>(_ArrayOfClienteGarantia_QNAME, ArrayOfClienteGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClienteGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ClienteGarantia")
    public JAXBElement<ClienteGarantia> createClienteGarantia(ClienteGarantia value) {
        return new JAXBElement<ClienteGarantia>(_ClienteGarantia_QNAME, ClienteGarantia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoCartera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "METipoCartera")
    public JAXBElement<METipoCartera> createMETipoCartera(METipoCartera value) {
        return new JAXBElement<METipoCartera>(_METipoCartera_QNAME, METipoCartera.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSTipoOperacion")
    public JAXBElement<MSTipoOperacion> createMSTipoOperacion(MSTipoOperacion value) {
        return new JAXBElement<MSTipoOperacion>(_MSTipoOperacion_QNAME, MSTipoOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfTipoOperacion")
    public JAXBElement<ArrayOfTipoOperacion> createArrayOfTipoOperacion(ArrayOfTipoOperacion value) {
        return new JAXBElement<ArrayOfTipoOperacion>(_ArrayOfTipoOperacion_QNAME, ArrayOfTipoOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TipoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoOperacion")
    public JAXBElement<TipoOperacion> createTipoOperacion(TipoOperacion value) {
        return new JAXBElement<TipoOperacion>(_TipoOperacion_QNAME, TipoOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldosVencidos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSaldosVencidos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSConsultaSaldosVencidos")
    public JAXBElement<MSConsultaSaldosVencidos> createMSConsultaSaldosVencidos(MSConsultaSaldosVencidos value) {
        return new JAXBElement<MSConsultaSaldosVencidos>(_MSConsultaSaldosVencidos_QNAME, MSConsultaSaldosVencidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfSaldosVencidosOperacion")
    public JAXBElement<ArrayOfSaldosVencidosOperacion> createArrayOfSaldosVencidosOperacion(ArrayOfSaldosVencidosOperacion value) {
        return new JAXBElement<ArrayOfSaldosVencidosOperacion>(_ArrayOfSaldosVencidosOperacion_QNAME, ArrayOfSaldosVencidosOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaldosVencidosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SaldosVencidosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SaldosVencidosOperacion")
    public JAXBElement<SaldosVencidosOperacion> createSaldosVencidosOperacion(SaldosVencidosOperacion value) {
        return new JAXBElement<SaldosVencidosOperacion>(_SaldosVencidosOperacion_QNAME, SaldosVencidosOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERegistroPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERegistroPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MERegistroPago")
    public JAXBElement<MERegistroPago> createMERegistroPago(MERegistroPago value) {
        return new JAXBElement<MERegistroPago>(_MERegistroPago_QNAME, MERegistroPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfPagoDiarioAcc")
    public JAXBElement<ArrayOfPagoDiarioAcc> createArrayOfPagoDiarioAcc(ArrayOfPagoDiarioAcc value) {
        return new JAXBElement<ArrayOfPagoDiarioAcc>(_ArrayOfPagoDiarioAcc_QNAME, ArrayOfPagoDiarioAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PagoDiarioAcc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PagoDiarioAcc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "PagoDiarioAcc")
    public JAXBElement<PagoDiarioAcc> createPagoDiarioAcc(PagoDiarioAcc value) {
        return new JAXBElement<PagoDiarioAcc>(_PagoDiarioAcc_QNAME, PagoDiarioAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRegistroPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSRegistroPago")
    public JAXBElement<MSRegistroPago> createMSRegistroPago(MSRegistroPago value) {
        return new JAXBElement<MSRegistroPago>(_MSRegistroPago_QNAME, MSRegistroPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MESimulacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MESimulacion")
    public JAXBElement<MESimulacion> createMESimulacion(MESimulacion value) {
        return new JAXBElement<MESimulacion>(_MESimulacion_QNAME, MESimulacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaScore }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaScore }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEConsultaScore")
    public JAXBElement<MEConsultaScore> createMEConsultaScore(MEConsultaScore value) {
        return new JAXBElement<MEConsultaScore>(_MEConsultaScore_QNAME, MEConsultaScore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreditoCanales")
    public JAXBElement<MECreditoCanales> createMECreditoCanales(MECreditoCanales value) {
        return new JAXBElement<MECreditoCanales>(_MECreditoCanales_QNAME, MECreditoCanales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoCanales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCreditoCanales")
    public JAXBElement<MSCreditoCanales> createMSCreditoCanales(MSCreditoCanales value) {
        return new JAXBElement<MSCreditoCanales>(_MSCreditoCanales_QNAME, MSCreditoCanales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEDocumentoCredito")
    public JAXBElement<MEDocumentoCredito> createMEDocumentoCredito(MEDocumentoCredito value) {
        return new JAXBElement<MEDocumentoCredito>(_MEDocumentoCredito_QNAME, MEDocumentoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreditoConsolidado")
    public JAXBElement<MECreditoConsolidado> createMECreditoConsolidado(MECreditoConsolidado value) {
        return new JAXBElement<MECreditoConsolidado>(_MECreditoConsolidado_QNAME, MECreditoConsolidado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoConsolidado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCreditoConsolidado")
    public JAXBElement<MSCreditoConsolidado> createMSCreditoConsolidado(MSCreditoConsolidado value) {
        return new JAXBElement<MSCreditoConsolidado>(_MSCreditoConsolidado_QNAME, MSCreditoConsolidado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreditoAutomotriz")
    public JAXBElement<MECreditoAutomotriz> createMECreditoAutomotriz(MECreditoAutomotriz value) {
        return new JAXBElement<MECreditoAutomotriz>(_MECreditoAutomotriz_QNAME, MECreditoAutomotriz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCreditoAutomotriz")
    public JAXBElement<MSCreditoAutomotriz> createMSCreditoAutomotriz(MSCreditoAutomotriz value) {
        return new JAXBElement<MSCreditoAutomotriz>(_MSCreditoAutomotriz_QNAME, MSCreditoAutomotriz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSolicitudCreditoAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSolicitudCreditoAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSSolicitudCreditoAutomotriz")
    public JAXBElement<MSSolicitudCreditoAutomotriz> createMSSolicitudCreditoAutomotriz(MSSolicitudCreditoAutomotriz value) {
        return new JAXBElement<MSSolicitudCreditoAutomotriz>(_MSSolicitudCreditoAutomotriz_QNAME, MSSolicitudCreditoAutomotriz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaSolicitudAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaSolicitudAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEConsultaSolicitudAutomotriz")
    public JAXBElement<MEConsultaSolicitudAutomotriz> createMEConsultaSolicitudAutomotriz(MEConsultaSolicitudAutomotriz value) {
        return new JAXBElement<MEConsultaSolicitudAutomotriz>(_MEConsultaSolicitudAutomotriz_QNAME, MEConsultaSolicitudAutomotriz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaSolicitudAutomotriz }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaSolicitudAutomotriz }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSConsultaSolicitudAutomotriz")
    public JAXBElement<MSConsultaSolicitudAutomotriz> createMSConsultaSolicitudAutomotriz(MSConsultaSolicitudAutomotriz value) {
        return new JAXBElement<MSConsultaSolicitudAutomotriz>(_MSConsultaSolicitudAutomotriz_QNAME, MSConsultaSolicitudAutomotriz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERenovacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERenovacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MERenovacionCredito")
    public JAXBElement<MERenovacionCredito> createMERenovacionCredito(MERenovacionCredito value) {
        return new JAXBElement<MERenovacionCredito>(_MERenovacionCredito_QNAME, MERenovacionCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRenovacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRenovacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSRenovacionCredito")
    public JAXBElement<MSRenovacionCredito> createMSRenovacionCredito(MSRenovacionCredito value) {
        return new JAXBElement<MSRenovacionCredito>(_MSRenovacionCredito_QNAME, MSRenovacionCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosRenovacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSDatosRenovacion")
    public JAXBElement<MSDatosRenovacion> createMSDatosRenovacion(MSDatosRenovacion value) {
        return new JAXBElement<MSDatosRenovacion>(_MSDatosRenovacion_QNAME, MSDatosRenovacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ArrayOfOperacionCarteraRenovacion")
    public JAXBElement<ArrayOfOperacionCarteraRenovacion> createArrayOfOperacionCarteraRenovacion(ArrayOfOperacionCarteraRenovacion value) {
        return new JAXBElement<ArrayOfOperacionCarteraRenovacion>(_ArrayOfOperacionCarteraRenovacion_QNAME, ArrayOfOperacionCarteraRenovacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionCarteraRenovacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionCarteraRenovacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "OperacionCarteraRenovacion")
    public JAXBElement<OperacionCarteraRenovacion> createOperacionCarteraRenovacion(OperacionCarteraRenovacion value) {
        return new JAXBElement<OperacionCarteraRenovacion>(_OperacionCarteraRenovacion_QNAME, OperacionCarteraRenovacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaCreditoPreferencial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaCreditoPreferencial }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSConsultaCreditoPreferencial")
    public JAXBElement<MSConsultaCreditoPreferencial> createMSConsultaCreditoPreferencial(MSConsultaCreditoPreferencial value) {
        return new JAXBElement<MSConsultaCreditoPreferencial>(_MSConsultaCreditoPreferencial_QNAME, MSConsultaCreditoPreferencial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSTipoCredito")
    public JAXBElement<MSTipoCredito> createMSTipoCredito(MSTipoCredito value) {
        return new JAXBElement<MSTipoCredito>(_MSTipoCredito_QNAME, MSTipoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ParametroProspeccionCredito")
    public JAXBElement<ParametroProspeccionCredito> createParametroProspeccionCredito(ParametroProspeccionCredito value) {
        return new JAXBElement<ParametroProspeccionCredito>(_ParametroProspeccionCredito_QNAME, ParametroProspeccionCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METipoProcesoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METipoProcesoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "METipoProcesoCredito")
    public JAXBElement<METipoProcesoCredito> createMETipoProcesoCredito(METipoProcesoCredito value) {
        return new JAXBElement<METipoProcesoCredito>(_METipoProcesoCredito_QNAME, METipoProcesoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSTipoProcesoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSTipoProcesoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSTipoProcesoCredito")
    public JAXBElement<MSTipoProcesoCredito> createMSTipoProcesoCredito(MSTipoProcesoCredito value) {
        return new JAXBElement<MSTipoProcesoCredito>(_MSTipoProcesoCredito_QNAME, MSTipoProcesoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSEvaluacionEconomica }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSEvaluacionEconomica")
    public JAXBElement<MSEvaluacionEconomica> createMSEvaluacionEconomica(MSEvaluacionEconomica value) {
        return new JAXBElement<MSEvaluacionEconomica>(_MSEvaluacionEconomica_QNAME, MSEvaluacionEconomica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionEconomicaConsumo")
    public JAXBElement<EvaluacionEconomicaConsumo> createEvaluacionEconomicaConsumo(EvaluacionEconomicaConsumo value) {
        return new JAXBElement<EvaluacionEconomicaConsumo>(_EvaluacionEconomicaConsumo_QNAME, EvaluacionEconomicaConsumo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionEconomicaMicro")
    public JAXBElement<EvaluacionEconomicaMicro> createEvaluacionEconomicaMicro(EvaluacionEconomicaMicro value) {
        return new JAXBElement<EvaluacionEconomicaMicro>(_EvaluacionEconomicaMicro_QNAME, EvaluacionEconomicaMicro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECalcularCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECalcularCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECalcularCredito")
    public JAXBElement<MECalcularCredito> createMECalcularCredito(MECalcularCredito value) {
        return new JAXBElement<MECalcularCredito>(_MECalcularCredito_QNAME, MECalcularCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCalcularCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCalcularCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSCalcularCredito")
    public JAXBElement<MSCalcularCredito> createMSCalcularCredito(MSCalcularCredito value) {
        return new JAXBElement<MSCalcularCredito>(_MSCalcularCredito_QNAME, MSCalcularCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEGuardarCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEGuardarCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEGuardarCredito")
    public JAXBElement<MEGuardarCredito> createMEGuardarCredito(MEGuardarCredito value) {
        return new JAXBElement<MEGuardarCredito>(_MEGuardarCredito_QNAME, MEGuardarCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSGuardarCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSGuardarCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSGuardarCredito")
    public JAXBElement<MSGuardarCredito> createMSGuardarCredito(MSGuardarCredito value) {
        return new JAXBElement<MSGuardarCredito>(_MSGuardarCredito_QNAME, MSGuardarCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSDocumentosCredito")
    public JAXBElement<MSDocumentosCredito> createMSDocumentosCredito(MSDocumentosCredito value) {
        return new JAXBElement<MSDocumentosCredito>(_MSDocumentosCredito_QNAME, MSDocumentosCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionEvaluacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionEvaluacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEInformacionEvaluacion")
    public JAXBElement<MEInformacionEvaluacion> createMEInformacionEvaluacion(MEInformacionEvaluacion value) {
        return new JAXBElement<MEInformacionEvaluacion>(_MEInformacionEvaluacion_QNAME, MEInformacionEvaluacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECreacionCredito")
    public JAXBElement<MECreacionCredito> createMECreacionCredito(MECreacionCredito value) {
        return new JAXBElement<MECreacionCredito>(_MECreacionCredito_QNAME, MECreacionCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECarpetaDocumentosCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECarpetaDocumentosCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MECarpetaDocumentosCredito")
    public JAXBElement<MECarpetaDocumentosCredito> createMECarpetaDocumentosCredito(MECarpetaDocumentosCredito value) {
        return new JAXBElement<MECarpetaDocumentosCredito>(_MECarpetaDocumentosCredito_QNAME, MECarpetaDocumentosCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAprobarFase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAprobarFase }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEAprobarFase")
    public JAXBElement<MEAprobarFase> createMEAprobarFase(MEAprobarFase value) {
        return new JAXBElement<MEAprobarFase>(_MEAprobarFase_QNAME, MEAprobarFase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSRiesgoAmbiental }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSRiesgoAmbiental")
    public JAXBElement<MSRiesgoAmbiental> createMSRiesgoAmbiental(MSRiesgoAmbiental value) {
        return new JAXBElement<MSRiesgoAmbiental>(_MSRiesgoAmbiental_QNAME, MSRiesgoAmbiental.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERiesgoAmbiental }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERiesgoAmbiental }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MERiesgoAmbiental")
    public JAXBElement<MERiesgoAmbiental> createMERiesgoAmbiental(MERiesgoAmbiental value) {
        return new JAXBElement<MERiesgoAmbiental>(_MERiesgoAmbiental_QNAME, MERiesgoAmbiental.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPagoExtraordinarioCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEPagoExtraordinarioCredito")
    public JAXBElement<MEPagoExtraordinarioCredito> createMEPagoExtraordinarioCredito(MEPagoExtraordinarioCredito value) {
        return new JAXBElement<MEPagoExtraordinarioCredito>(_MEPagoExtraordinarioCredito_QNAME, MEPagoExtraordinarioCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSSimulacionPagoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSSimulacionPagoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSSimulacionPagoCredito")
    public JAXBElement<MSSimulacionPagoCredito> createMSSimulacionPagoCredito(MSSimulacionPagoCredito value) {
        return new JAXBElement<MSSimulacionPagoCredito>(_MSSimulacionPagoCredito_QNAME, MSSimulacionPagoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSResultadoPagoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MSResultadoPagoCredito")
    public JAXBElement<MSResultadoPagoCredito> createMSResultadoPagoCredito(MSResultadoPagoCredito value) {
        return new JAXBElement<MSResultadoPagoCredito>(_MSResultadoPagoCredito_QNAME, MSResultadoPagoCredito.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDocumentoFirmaElectronica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDocumentoFirmaElectronica }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEDocumentoFirmaElectronica")
    public JAXBElement<MEDocumentoFirmaElectronica> createMEDocumentoFirmaElectronica(MEDocumentoFirmaElectronica value) {
        return new JAXBElement<MEDocumentoFirmaElectronica>(_MEDocumentoFirmaElectronica_QNAME, MEDocumentoFirmaElectronica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFirmaElectronicaPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFirmaElectronicaPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MEFirmaElectronicaPersona")
    public JAXBElement<MEFirmaElectronicaPersona> createMEFirmaElectronicaPersona(MEFirmaElectronicaPersona value) {
        return new JAXBElement<MEFirmaElectronicaPersona>(_MEFirmaElectronicaPersona_QNAME, MEFirmaElectronicaPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERespuestaFirmaElectronica }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERespuestaFirmaElectronica }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MERespuestaFirmaElectronica")
    public JAXBElement<MERespuestaFirmaElectronica> createMERespuestaFirmaElectronica(MERespuestaFirmaElectronica value) {
        return new JAXBElement<MERespuestaFirmaElectronica>(_MERespuestaFirmaElectronica_QNAME, MERespuestaFirmaElectronica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ArrayOfDireccion")
    public JAXBElement<ArrayOfDireccion> createArrayOfDireccion(ArrayOfDireccion value) {
        return new JAXBElement<ArrayOfDireccion>(_ArrayOfDireccion_QNAME, ArrayOfDireccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Direccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Direccion")
    public JAXBElement<Direccion> createDireccion(Direccion value) {
        return new JAXBElement<Direccion>(_Direccion_QNAME, Direccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCatalogos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "MSCatalogos")
    public JAXBElement<MSCatalogos> createMSCatalogos(MSCatalogos value) {
        return new JAXBElement<MSCatalogos>(_MSCatalogos_QNAME, MSCatalogos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ArrayOfCatalogoItem")
    public JAXBElement<ArrayOfCatalogoItem> createArrayOfCatalogoItem(ArrayOfCatalogoItem value) {
        return new JAXBElement<ArrayOfCatalogoItem>(_ArrayOfCatalogoItem_QNAME, ArrayOfCatalogoItem.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ArrayOfCheckListFlujo")
    public JAXBElement<ArrayOfCheckListFlujo> createArrayOfCheckListFlujo(ArrayOfCheckListFlujo value) {
        return new JAXBElement<ArrayOfCheckListFlujo>(_ArrayOfCheckListFlujo_QNAME, ArrayOfCheckListFlujo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CheckListFlujo")
    public JAXBElement<CheckListFlujo> createCheckListFlujo(CheckListFlujo value) {
        return new JAXBElement<CheckListFlujo>(_CheckListFlujo_QNAME, CheckListFlujo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfEmpleo")
    public JAXBElement<ArrayOfEmpleo> createArrayOfEmpleo(ArrayOfEmpleo value) {
        return new JAXBElement<ArrayOfEmpleo>(_ArrayOfEmpleo_QNAME, ArrayOfEmpleo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Empleo")
    public JAXBElement<Empleo> createEmpleo(Empleo value) {
        return new JAXBElement<Empleo>(_Empleo_QNAME, Empleo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfClaseRubro")
    public JAXBElement<ArrayOfClaseRubro> createArrayOfClaseRubro(ArrayOfClaseRubro value) {
        return new JAXBElement<ArrayOfClaseRubro>(_ArrayOfClaseRubro_QNAME, ArrayOfClaseRubro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaseRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClaseRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ClaseRubro")
    public JAXBElement<ClaseRubro> createClaseRubro(ClaseRubro value) {
        return new JAXBElement<ClaseRubro>(_ClaseRubro_QNAME, ClaseRubro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDetalleActivo")
    public JAXBElement<ArrayOfDetalleActivo> createArrayOfDetalleActivo(ArrayOfDetalleActivo value) {
        return new JAXBElement<ArrayOfDetalleActivo>(_ArrayOfDetalleActivo_QNAME, ArrayOfDetalleActivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetalleActivo")
    public JAXBElement<DetalleActivo> createDetalleActivo(DetalleActivo value) {
        return new JAXBElement<DetalleActivo>(_DetalleActivo_QNAME, DetalleActivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDetalleProductoMicroempresa")
    public JAXBElement<ArrayOfDetalleProductoMicroempresa> createArrayOfDetalleProductoMicroempresa(ArrayOfDetalleProductoMicroempresa value) {
        return new JAXBElement<ArrayOfDetalleProductoMicroempresa>(_ArrayOfDetalleProductoMicroempresa_QNAME, ArrayOfDetalleProductoMicroempresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleProductoMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleProductoMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetalleProductoMicroempresa")
    public JAXBElement<DetalleProductoMicroempresa> createDetalleProductoMicroempresa(DetalleProductoMicroempresa value) {
        return new JAXBElement<DetalleProductoMicroempresa>(_DetalleProductoMicroempresa_QNAME, DetalleProductoMicroempresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfManoObraMicroempresa")
    public JAXBElement<ArrayOfManoObraMicroempresa> createArrayOfManoObraMicroempresa(ArrayOfManoObraMicroempresa value) {
        return new JAXBElement<ArrayOfManoObraMicroempresa>(_ArrayOfManoObraMicroempresa_QNAME, ArrayOfManoObraMicroempresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManoObraMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ManoObraMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ManoObraMicroempresa")
    public JAXBElement<ManoObraMicroempresa> createManoObraMicroempresa(ManoObraMicroempresa value) {
        return new JAXBElement<ManoObraMicroempresa>(_ManoObraMicroempresa_QNAME, ManoObraMicroempresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDetallePasivo")
    public JAXBElement<ArrayOfDetallePasivo> createArrayOfDetallePasivo(ArrayOfDetallePasivo value) {
        return new JAXBElement<ArrayOfDetallePasivo>(_ArrayOfDetallePasivo_QNAME, ArrayOfDetallePasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetallePasivo")
    public JAXBElement<DetallePasivo> createDetallePasivo(DetallePasivo value) {
        return new JAXBElement<DetallePasivo>(_DetallePasivo_QNAME, DetallePasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfRubroIngresoEgreso")
    public JAXBElement<ArrayOfRubroIngresoEgreso> createArrayOfRubroIngresoEgreso(ArrayOfRubroIngresoEgreso value) {
        return new JAXBElement<ArrayOfRubroIngresoEgreso>(_ArrayOfRubroIngresoEgreso_QNAME, ArrayOfRubroIngresoEgreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RubroIngresoEgreso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RubroIngresoEgreso }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RubroIngresoEgreso")
    public JAXBElement<RubroIngresoEgreso> createRubroIngresoEgreso(RubroIngresoEgreso value) {
        return new JAXBElement<RubroIngresoEgreso>(_RubroIngresoEgreso_QNAME, RubroIngresoEgreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdOcupacion", scope = RubroIngresoEgreso.class)
    public JAXBElement<Integer> createRubroIngresoEgresoIdOcupacion(Integer value) {
        return new JAXBElement<Integer>(_RubroIngresoEgresoIdOcupacion_QNAME, Integer.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Rubro", scope = RubroIngresoEgreso.class)
    public JAXBElement<String> createRubroIngresoEgresoRubro(String value) {
        return new JAXBElement<String>(_RubroIngresoEgresoRubro_QNAME, String.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor1", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor1(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor1_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor2", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor2(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor2_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor3", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor3(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor3_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor4", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor4(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor4_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor5", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor5(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor5_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor6", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor6(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor6_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Valor7", scope = RubroIngresoEgreso.class)
    public JAXBElement<BigDecimal> createRubroIngresoEgresoValor7(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RubroIngresoEgresoValor7_QNAME, BigDecimal.class, RubroIngresoEgreso.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodDestinoCredito", scope = DetallePasivo.class)
    public JAXBElement<Integer> createDetallePasivoCodDestinoCredito(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoCodDestinoCredito_QNAME, Integer.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodEmisor", scope = DetallePasivo.class)
    public JAXBElement<Integer> createDetallePasivoCodEmisor(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoCodEmisor_QNAME, Integer.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodInstitucion", scope = DetallePasivo.class)
    public JAXBElement<Integer> createDetallePasivoCodInstitucion(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoCodInstitucion_QNAME, Integer.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodPlazo", scope = DetallePasivo.class)
    public JAXBElement<Integer> createDetallePasivoCodPlazo(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoCodPlazo_QNAME, Integer.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DividendoMensual", scope = DetallePasivo.class)
    public JAXBElement<BigDecimal> createDetallePasivoDividendoMensual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DetallePasivoDividendoMensual_QNAME, BigDecimal.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Institucion", scope = DetallePasivo.class)
    public JAXBElement<String> createDetallePasivoInstitucion(String value) {
        return new JAXBElement<String>(_DetallePasivoInstitucion_QNAME, String.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MontoActual", scope = DetallePasivo.class)
    public JAXBElement<BigDecimal> createDetallePasivoMontoActual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DetallePasivoMontoActual_QNAME, BigDecimal.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MontoOrigen", scope = DetallePasivo.class)
    public JAXBElement<BigDecimal> createDetallePasivoMontoOrigen(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DetallePasivoMontoOrigen_QNAME, BigDecimal.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreFuenteExterna", scope = DetallePasivo.class)
    public JAXBElement<String> createDetallePasivoNombreFuenteExterna(String value) {
        return new JAXBElement<String>(_DetallePasivoNombreFuenteExterna_QNAME, String.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = DetallePasivo.class)
    public JAXBElement<String> createDetallePasivoObservaciones(String value) {
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ObservacionesVerificacion", scope = DetallePasivo.class)
    public JAXBElement<String> createDetallePasivoObservacionesVerificacion(String value) {
        return new JAXBElement<String>(_DetallePasivoObservacionesVerificacion_QNAME, String.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Secuencial", scope = DetallePasivo.class)
    public JAXBElement<Integer> createDetallePasivoSecuencial(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoSecuencial_QNAME, Integer.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoCredito", scope = DetallePasivo.class)
    public JAXBElement<String> createDetallePasivoTipoCredito(String value) {
        return new JAXBElement<String>(_DetallePasivoTipoCredito_QNAME, String.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Vencimiento", scope = DetallePasivo.class)
    public JAXBElement<XMLGregorianCalendar> createDetallePasivoVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetallePasivoVencimiento_QNAME, XMLGregorianCalendar.class, DetallePasivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreProducto", scope = DetalleProductoMicroempresa.class)
    public JAXBElement<String> createDetalleProductoMicroempresaNombreProducto(String value) {
        return new JAXBElement<String>(_DetalleProductoMicroempresaNombreProducto_QNAME, String.class, DetalleProductoMicroempresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Anio", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoAnio(String value) {
        return new JAXBElement<String>(_DetalleActivoAnio_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "AreaBien", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoAreaBien(String value) {
        return new JAXBElement<String>(_DetalleActivoAreaBien_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "AvaluoComercial", scope = DetalleActivo.class)
    public JAXBElement<BigDecimal> createDetalleActivoAvaluoComercial(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DetalleActivoAvaluoComercial_QNAME, BigDecimal.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Emisor", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoEmisor(String value) {
        return new JAXBElement<String>(_DetalleActivoEmisor_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Estado", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoEstado(String value) {
        return new JAXBElement<String>(_DetalleActivoEstado_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaIngresoVencimiento", scope = DetalleActivo.class)
    public JAXBElement<XMLGregorianCalendar> createDetalleActivoFechaIngresoVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DetalleActivoFechaIngresoVencimiento_QNAME, XMLGregorianCalendar.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdEstado", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdEstado(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdEstado_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdMoneda", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdMoneda(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdMoneda_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTipo", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdTipo(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdTipo_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTipoDocumento", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdTipoDocumento(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdTipoDocumento_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTipoInmueble", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdTipoInmueble(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdTipoInmueble_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTipoMueble", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoIdTipoMueble(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoIdTipoMueble_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Institucion", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoInstitucion(String value) {
        return new JAXBElement<String>(_DetallePasivoInstitucion_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Marca", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoMarca(String value) {
        return new JAXBElement<String>(_DetalleActivoMarca_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Moneda", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoMoneda(String value) {
        return new JAXBElement<String>(_DetalleActivoMoneda_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MontoValor", scope = DetalleActivo.class)
    public JAXBElement<BigDecimal> createDetalleActivoMontoValor(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DetalleActivoMontoValor_QNAME, BigDecimal.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoObservaciones(String value) {
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ObservacionesVerificacion", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoObservacionesVerificacion(String value) {
        return new JAXBElement<String>(_DetallePasivoObservacionesVerificacion_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Prendado", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoPrendado(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoPrendado_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Secuencial", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoSecuencial(Integer value) {
        return new JAXBElement<Integer>(_DetallePasivoSecuencial_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Tipo", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoTipo(String value) {
        return new JAXBElement<String>(_DetalleActivoTipo_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoDocumento", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoTipoDocumento(String value) {
        return new JAXBElement<String>(_DetalleActivoTipoDocumento_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoInmueble", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoTipoInmueble(String value) {
        return new JAXBElement<String>(_DetalleActivoTipoInmueble_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoMueble", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoTipoMueble(String value) {
        return new JAXBElement<String>(_DetalleActivoTipoMueble_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoPropiedad", scope = DetalleActivo.class)
    public JAXBElement<Integer> createDetalleActivoTipoPropiedad(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoTipoPropiedad_QNAME, Integer.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ubicacion", scope = DetalleActivo.class)
    public JAXBElement<String> createDetalleActivoUbicacion(String value) {
        return new JAXBElement<String>(_DetalleActivoUbicacion_QNAME, String.class, DetalleActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdOcupacion", scope = ClaseRubro.class)
    public JAXBElement<Integer> createClaseRubroIdOcupacion(Integer value) {
        return new JAXBElement<Integer>(_RubroIngresoEgresoIdOcupacion_QNAME, Integer.class, ClaseRubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreClaseRubro", scope = ClaseRubro.class)
    public JAXBElement<String> createClaseRubroNombreClaseRubro(String value) {
        return new JAXBElement<String>(_ClaseRubroNombreClaseRubro_QNAME, String.class, ClaseRubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadCreada", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoActividadCreada(Integer value) {
        return new JAXBElement<Integer>(_EmpleoActividadCreada_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEmpresa", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoActividadEmpresa(Integer value) {
        return new JAXBElement<Integer>(_EmpleoActividadEmpresa_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = Empleo.class)
    public JAXBElement<String> createEmpleoEmail(String value) {
        return new JAXBElement<String>(_EmpleoEmail_QNAME, String.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Empresa", scope = Empleo.class)
    public JAXBElement<String> createEmpleoEmpresa(String value) {
        return new JAXBElement<String>(_EmpleoEmpresa_QNAME, String.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Estado", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoEstado(Integer value) {
        return new JAXBElement<Integer>(_DetalleActivoEstado_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaInicio", scope = Empleo.class)
    public JAXBElement<XMLGregorianCalendar> createEmpleoFechaInicio(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpleoFechaInicio_QNAME, XMLGregorianCalendar.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaSalida", scope = Empleo.class)
    public JAXBElement<XMLGregorianCalendar> createEmpleoFechaSalida(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmpleoFechaSalida_QNAME, XMLGregorianCalendar.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdCargo", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoIdCargo(Integer value) {
        return new JAXBElement<Integer>(_EmpleoIdCargo_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MotivoFinalizacionCargo", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoMotivoFinalizacionCargo(Integer value) {
        return new JAXBElement<Integer>(_EmpleoMotivoFinalizacionCargo_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = Empleo.class)
    public JAXBElement<String> createEmpleoObservaciones(String value) {
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrincipalSecundaria", scope = Empleo.class)
    public JAXBElement<Short> createEmpleoPrincipalSecundaria(Short value) {
        return new JAXBElement<Short>(_EmpleoPrincipalSecundaria_QNAME, Short.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Sueldo", scope = Empleo.class)
    public JAXBElement<BigDecimal> createEmpleoSueldo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmpleoSueldo_QNAME, BigDecimal.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoActividad", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoTipoActividad(Integer value) {
        return new JAXBElement<Integer>(_EmpleoTipoActividad_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoContrato", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoTipoContrato(Integer value) {
        return new JAXBElement<Integer>(_EmpleoTipoContrato_QNAME, Integer.class, Empleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoRelacionLaboral", scope = Empleo.class)
    public JAXBElement<Integer> createEmpleoTipoRelacionLaboral(Integer value) {
        return new JAXBElement<Integer>(_EmpleoTipoRelacionLaboral_QNAME, Integer.class, Empleo.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Descripcion", scope = CheckListFlujo.class)
    public JAXBElement<String> createCheckListFlujoDescripcion(String value) {
        return new JAXBElement<String>(_CheckListFlujoDescripcion_QNAME, String.class, CheckListFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ExcepcionRequerida", scope = CheckListFlujo.class)
    public JAXBElement<Boolean> createCheckListFlujoExcepcionRequerida(Boolean value) {
        return new JAXBElement<Boolean>(_CheckListFlujoExcepcionRequerida_QNAME, Boolean.class, CheckListFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Mandatorio", scope = CheckListFlujo.class)
    public JAXBElement<Boolean> createCheckListFlujoMandatorio(Boolean value) {
        return new JAXBElement<Boolean>(_CheckListFlujoMandatorio_QNAME, Boolean.class, CheckListFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "NombreCheckList", scope = CheckListFlujo.class)
    public JAXBElement<String> createCheckListFlujoNombreCheckList(String value) {
        return new JAXBElement<String>(_CheckListFlujoNombreCheckList_QNAME, String.class, CheckListFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Observaciones", scope = CheckListFlujo.class)
    public JAXBElement<String> createCheckListFlujoObservaciones(String value) {
        return new JAXBElement<String>(_DocumentoObservaciones_QNAME, String.class, CheckListFlujo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Valor", scope = CheckListFlujo.class)
    public JAXBElement<Boolean> createCheckListFlujoValor(Boolean value) {
        return new JAXBElement<Boolean>(_CheckListFlujoValor_QNAME, Boolean.class, CheckListFlujo.class, value);
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
        return new JAXBElement<String>(_CheckListFlujoDescripcion_QNAME, String.class, CatalogoItem.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Actual", scope = Direccion.class)
    public JAXBElement<String> createDireccionActual(String value) {
        return new JAXBElement<String>(_DireccionActual_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Barrio", scope = Direccion.class)
    public JAXBElement<String> createDireccionBarrio(String value) {
        return new JAXBElement<String>(_DireccionBarrio_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Bloque", scope = Direccion.class)
    public JAXBElement<String> createDireccionBloque(String value) {
        return new JAXBElement<String>(_DireccionBloque_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CallePrincipal", scope = Direccion.class)
    public JAXBElement<String> createDireccionCallePrincipal(String value) {
        return new JAXBElement<String>(_DireccionCallePrincipal_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "CalleTransversal", scope = Direccion.class)
    public JAXBElement<String> createDireccionCalleTransversal(String value) {
        return new JAXBElement<String>(_DireccionCalleTransversal_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Ciudad", scope = Direccion.class)
    public JAXBElement<String> createDireccionCiudad(String value) {
        return new JAXBElement<String>(_DireccionCiudad_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Clase", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionClase(Integer value) {
        return new JAXBElement<Integer>(_DireccionClase_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Croquis", scope = Direccion.class)
    public JAXBElement<byte[]> createDireccionCroquis(byte[] value) {
        return new JAXBElement<byte[]>(_DireccionCroquis_QNAME, byte[].class, Direccion.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Departamento", scope = Direccion.class)
    public JAXBElement<String> createDireccionDepartamento(String value) {
        return new JAXBElement<String>(_DireccionDepartamento_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "DescripcionTipoDireccion", scope = Direccion.class)
    public JAXBElement<String> createDireccionDescripcionTipoDireccion(String value) {
        return new JAXBElement<String>(_DireccionDescripcionTipoDireccion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "EdificioConjunto", scope = Direccion.class)
    public JAXBElement<String> createDireccionEdificioConjunto(String value) {
        return new JAXBElement<String>(_DireccionEdificioConjunto_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Extranjera", scope = Direccion.class)
    public JAXBElement<String> createDireccionExtranjera(String value) {
        return new JAXBElement<String>(_DireccionExtranjera_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "FechaModificacion", scope = Direccion.class)
    public JAXBElement<XMLGregorianCalendar> createDireccionFechaModificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DireccionFechaModificacion_QNAME, XMLGregorianCalendar.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "FechaVerificacion", scope = Direccion.class)
    public JAXBElement<XMLGregorianCalendar> createDireccionFechaVerificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DireccionFechaVerificacion_QNAME, XMLGregorianCalendar.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdCanton", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdCanton(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdCanton_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdCiudad", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdCiudad(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdCiudad_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdDireccion", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdDireccion(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdDireccion_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdPais", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdPais(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdPais_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdParroquia", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdParroquia(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdParroquia_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdProvincia", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdProvincia(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdProvincia_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "IdSector", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionIdSector(Integer value) {
        return new JAXBElement<Integer>(_DireccionIdSector_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "LoginModificacion", scope = Direccion.class)
    public JAXBElement<String> createDireccionLoginModificacion(String value) {
        return new JAXBElement<String>(_DireccionLoginModificacion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "NombrePropietario", scope = Direccion.class)
    public JAXBElement<String> createDireccionNombrePropietario(String value) {
        return new JAXBElement<String>(_DireccionNombrePropietario_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Numeracion", scope = Direccion.class)
    public JAXBElement<String> createDireccionNumeracion(String value) {
        return new JAXBElement<String>(_DireccionNumeracion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Numero", scope = Direccion.class)
    public JAXBElement<String> createDireccionNumero(String value) {
        return new JAXBElement<String>(_DireccionNumero_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Observaciones", scope = Direccion.class)
    public JAXBElement<String> createDireccionObservaciones(String value) {
        return new JAXBElement<String>(_DocumentoObservaciones_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "OficinaModificacion", scope = Direccion.class)
    public JAXBElement<String> createDireccionOficinaModificacion(String value) {
        return new JAXBElement<String>(_DireccionOficinaModificacion_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Pais", scope = Direccion.class)
    public JAXBElement<String> createDireccionPais(String value) {
        return new JAXBElement<String>(_DireccionPais_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Piso", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionPiso(Integer value) {
        return new JAXBElement<Integer>(_DireccionPiso_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Provincia", scope = Direccion.class)
    public JAXBElement<String> createDireccionProvincia(String value) {
        return new JAXBElement<String>(_DireccionProvincia_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Sector", scope = Direccion.class)
    public JAXBElement<String> createDireccionSector(String value) {
        return new JAXBElement<String>(_DireccionSector_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "TelefonoPropietario", scope = Direccion.class)
    public JAXBElement<String> createDireccionTelefonoPropietario(String value) {
        return new JAXBElement<String>(_DireccionTelefonoPropietario_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "TiempoResidencia", scope = Direccion.class)
    public JAXBElement<Short> createDireccionTiempoResidencia(Short value) {
        return new JAXBElement<Short>(_DireccionTiempoResidencia_QNAME, Short.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "TipoDireccion", scope = Direccion.class)
    public JAXBElement<Integer> createDireccionTipoDireccion(Integer value) {
        return new JAXBElement<Integer>(_DireccionTipoDireccion_QNAME, Integer.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "ValorVivienda", scope = Direccion.class)
    public JAXBElement<BigDecimal> createDireccionValorVivienda(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DireccionValorVivienda_QNAME, BigDecimal.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "VerificadoPor", scope = Direccion.class)
    public JAXBElement<String> createDireccionVerificadoPor(String value) {
        return new JAXBElement<String>(_DireccionVerificadoPor_QNAME, String.class, Direccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Comunes", name = "Catalogo", scope = MSCatalogos.class)
    public JAXBElement<ArrayOfCatalogoItem> createMSCatalogosCatalogo(ArrayOfCatalogoItem value) {
        return new JAXBElement<ArrayOfCatalogoItem>(_MSCatalogosCatalogo_QNAME, ArrayOfCatalogoItem.class, MSCatalogos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DocumentofBase64", scope = MERespuestaFirmaElectronica.class)
    public JAXBElement<String> createMERespuestaFirmaElectronicaDocumentofBase64(String value) {
        return new JAXBElement<String>(_MERespuestaFirmaElectronicaDocumentofBase64_QNAME, String.class, MERespuestaFirmaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CapturaFirmante", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaCapturaFirmante(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaCapturaFirmante_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CedulaFrontal", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaCedulaFrontal(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaCedulaFrontal_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CedulaPosterior", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaCedulaPosterior(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaCedulaPosterior_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Conyuge", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaConyuge(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaConyuge_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DireccionIP", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaDireccionIP(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaDireccionIP_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Dispositivo", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaDispositivo(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaDispositivo_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoCivil", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaEstadoCivil(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaEstadoCivil_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaExpedicion", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaFechaExpedicion(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaFechaExpedicion_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaNacimiento", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaFechaNacimiento(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaFechaNacimiento_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FotoCiudadano", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaFotoCiudadano(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaFotoCiudadano_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Huella", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaHuella(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaHuella_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Localizacion", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaLocalizacion(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaLocalizacion_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "LugarNacimiento", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaLugarNacimiento(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaLugarNacimiento_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Nacionalidad", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaNacionalidad(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaNacionalidad_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Navegador", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaNavegador(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaNavegador_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Profesion", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaProfesion(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaProfesion_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rekognition", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaRekognition(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaRekognition_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SistemaOperativo", scope = MEFirmaElectronicaPersona.class)
    public JAXBElement<String> createMEFirmaElectronicaPersonaSistemaOperativo(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaSistemaOperativo_QNAME, String.class, MEFirmaElectronicaPersona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = MEDocumentoFirmaElectronica.class)
    public JAXBElement<String> createMEDocumentoFirmaElectronicaEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, MEDocumentoFirmaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "LinkDocumento", scope = MEDocumentoFirmaElectronica.class)
    public JAXBElement<String> createMEDocumentoFirmaElectronicaLinkDocumento(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaLinkDocumento_QNAME, String.class, MEDocumentoFirmaElectronica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Credito", scope = MSSimulacionPagoCredito.class)
    public JAXBElement<TramiteCredito> createMSSimulacionPagoCreditoCredito(TramiteCredito value) {
        return new JAXBElement<TramiteCredito>(_MSSimulacionPagoCreditoCredito_QNAME, TramiteCredito.class, MSSimulacionPagoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Cuotas", scope = MSSimulacionPagoCredito.class)
    public JAXBElement<ArrayOfCuota> createMSSimulacionPagoCreditoCuotas(ArrayOfCuota value) {
        return new JAXBElement<ArrayOfCuota>(_MSSimulacionPagoCreditoCuotas_QNAME, ArrayOfCuota.class, MSSimulacionPagoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoVerificacion", scope = MEPagoExtraordinarioCredito.class)
    public JAXBElement<String> createMEPagoExtraordinarioCreditoCodigoVerificacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoCodigoVerificacion_QNAME, String.class, MEPagoExtraordinarioCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroCuenta", scope = MEPagoExtraordinarioCredito.class)
    public JAXBElement<String> createMEPagoExtraordinarioCreditoNumeroCuenta(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroCuenta_QNAME, String.class, MEPagoExtraordinarioCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = MEPagoExtraordinarioCredito.class)
    public JAXBElement<String> createMEPagoExtraordinarioCreditoNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, MEPagoExtraordinarioCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Archivo", scope = MERiesgoAmbiental.class)
    public JAXBElement<byte[]> createMERiesgoAmbientalArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MERiesgoAmbientalArchivo_QNAME, byte[].class, MERiesgoAmbiental.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPreguntas", scope = MERiesgoAmbiental.class)
    public JAXBElement<ArrayOfCatalogoItem> createMERiesgoAmbientalListaPreguntas(ArrayOfCatalogoItem value) {
        return new JAXBElement<ArrayOfCatalogoItem>(_MERiesgoAmbientalListaPreguntas_QNAME, ArrayOfCatalogoItem.class, MERiesgoAmbiental.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DocumentoSaras", scope = MSRiesgoAmbiental.class)
    public JAXBElement<Documento> createMSRiesgoAmbientalDocumentoSaras(Documento value) {
        return new JAXBElement<Documento>(_MSRiesgoAmbientalDocumentoSaras_QNAME, Documento.class, MSRiesgoAmbiental.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCatalogoItem }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPreguntas", scope = MSRiesgoAmbiental.class)
    public JAXBElement<ArrayOfCatalogoItem> createMSRiesgoAmbientalListaPreguntas(ArrayOfCatalogoItem value) {
        return new JAXBElement<ArrayOfCatalogoItem>(_MERiesgoAmbientalListaPreguntas_QNAME, ArrayOfCatalogoItem.class, MSRiesgoAmbiental.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Comentario", scope = MEAprobarFase.class)
    public JAXBElement<String> createMEAprobarFaseComentario(String value) {
        return new JAXBElement<String>(_MEAprobarFaseComentario_QNAME, String.class, MEAprobarFase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Archivo", scope = MECarpetaDocumentosCredito.class)
    public JAXBElement<byte[]> createMECarpetaDocumentosCreditoArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MERiesgoAmbientalArchivo_QNAME, byte[].class, MECarpetaDocumentosCredito.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Documentos", scope = MECarpetaDocumentosCredito.class)
    public JAXBElement<ArrayOfDocumento> createMECarpetaDocumentosCreditoDocumentos(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_MECarpetaDocumentosCreditoDocumentos_QNAME, ArrayOfDocumento.class, MECarpetaDocumentosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = MECarpetaDocumentosCredito.class)
    public JAXBElement<String> createMECarpetaDocumentosCreditoIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, MECarpetaDocumentosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoActividadEconomica", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoActividadEconomica_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDestinoEspecifico", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoDestinoEspecifico(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoDestinoEspecifico_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDestinoFinanciero", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoDestinoFinanciero(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoDestinoFinanciero_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoOficial", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoOficial(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoOficial_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOperacion", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoTipoOperacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoOperacion_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoTabla", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoCodigoTipoTabla(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoTabla_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MECreacionCredito.class)
    public JAXBElement<String> createMECreacionCreditoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MECreacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionConsumo", scope = MEInformacionEvaluacion.class)
    public JAXBElement<EvaluacionEconomicaConsumo> createMEInformacionEvaluacionEvaluacionConsumo(EvaluacionEconomicaConsumo value) {
        return new JAXBElement<EvaluacionEconomicaConsumo>(_MEInformacionEvaluacionEvaluacionConsumo_QNAME, EvaluacionEconomicaConsumo.class, MEInformacionEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionMicro", scope = MEInformacionEvaluacion.class)
    public JAXBElement<EvaluacionEconomicaMicro> createMEInformacionEvaluacionEvaluacionMicro(EvaluacionEconomicaMicro value) {
        return new JAXBElement<EvaluacionEconomicaMicro>(_MEInformacionEvaluacionEvaluacionMicro_QNAME, EvaluacionEconomicaMicro.class, MEInformacionEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MEInformacionEvaluacion.class)
    public JAXBElement<String> createMEInformacionEvaluacionIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MEInformacionEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DocumentosCredito", scope = MSDocumentosCredito.class)
    public JAXBElement<ArrayOfDocumento> createMSDocumentosCreditoDocumentosCredito(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_MSDocumentosCreditoDocumentosCredito_QNAME, ArrayOfDocumento.class, MSDocumentosCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPoliticas", scope = MSGuardarCredito.class)
    public JAXBElement<ArrayOfCheckListFlujo> createMSGuardarCreditoListaPoliticas(ArrayOfCheckListFlujo value) {
        return new JAXBElement<ArrayOfCheckListFlujo>(_MSGuardarCreditoListaPoliticas_QNAME, ArrayOfCheckListFlujo.class, MSGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = MSGuardarCredito.class)
    public JAXBElement<String> createMSGuardarCreditoTipoCredito(String value) {
        return new JAXBElement<String>(_MSGuardarCreditoTipoCredito_QNAME, String.class, MSGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoOperacion", scope = MSGuardarCredito.class)
    public JAXBElement<String> createMSGuardarCreditoTipoOperacion(String value) {
        return new JAXBElement<String>(_TipoOperacion_QNAME, String.class, MSGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoActividadBce", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoCodigoActividadBce(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoCodigoActividadBce_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoAgencia", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoCodigoAgencia(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoCodigoAgencia_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDestinoVerde", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoCodigoDestinoVerde(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoCodigoDestinoVerde_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ComentariosCualitativos", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoComentariosCualitativos(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoComentariosCualitativos_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ComentariosCuantitativos", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoComentariosCuantitativos(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoComentariosCuantitativos_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPoliticas", scope = MEGuardarCredito.class)
    public JAXBElement<ArrayOfCheckListFlujo> createMEGuardarCreditoListaPoliticas(ArrayOfCheckListFlujo value) {
        return new JAXBElement<ArrayOfCheckListFlujo>(_MSGuardarCreditoListaPoliticas_QNAME, ArrayOfCheckListFlujo.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreImpreso", scope = MEGuardarCredito.class)
    public JAXBElement<String> createMEGuardarCreditoNombreImpreso(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoNombreImpreso_QNAME, String.class, MEGuardarCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPoliticas", scope = MSCalcularCredito.class)
    public JAXBElement<ArrayOfCheckListFlujo> createMSCalcularCreditoListaPoliticas(ArrayOfCheckListFlujo value) {
        return new JAXBElement<ArrayOfCheckListFlujo>(_MSGuardarCreditoListaPoliticas_QNAME, ArrayOfCheckListFlujo.class, MSCalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TieneTarjeta", scope = MSCalcularCredito.class)
    public JAXBElement<Boolean> createMSCalcularCreditoTieneTarjeta(Boolean value) {
        return new JAXBElement<Boolean>(_MSCalcularCreditoTieneTarjeta_QNAME, Boolean.class, MSCalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = MSCalcularCredito.class)
    public JAXBElement<String> createMSCalcularCreditoTipoCredito(String value) {
        return new JAXBElement<String>(_MSGuardarCreditoTipoCredito_QNAME, String.class, MSCalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoOperacion", scope = MSCalcularCredito.class)
    public JAXBElement<String> createMSCalcularCreditoTipoOperacion(String value) {
        return new JAXBElement<String>(_TipoOperacion_QNAME, String.class, MSCalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoActividadBce", scope = MECalcularCredito.class)
    public JAXBElement<String> createMECalcularCreditoCodigoActividadBce(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoCodigoActividadBce_QNAME, String.class, MECalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MECalcularCredito.class)
    public JAXBElement<String> createMECalcularCreditoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MECalcularCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaEvaluacion", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<XMLGregorianCalendar> createEvaluacionEconomicaConsumoFechaEvaluacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EvaluacionEconomicaConsumoFechaEvaluacion_QNAME, XMLGregorianCalendar.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdOcupacion", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<Integer> createEvaluacionEconomicaConsumoIdOcupacion(Integer value) {
        return new JAXBElement<Integer>(_EvaluacionEconomicaConsumoIdOcupacion_QNAME, Integer.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdOcupacionPareja", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<Integer> createEvaluacionEconomicaConsumoIdOcupacionPareja(Integer value) {
        return new JAXBElement<Integer>(_EvaluacionEconomicaConsumoIdOcupacionPareja_QNAME, Integer.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MensajeCumpleCapacidad", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<String> createEvaluacionEconomicaConsumoMensajeCumpleCapacidad(String value) {
        return new JAXBElement<String>(_EvaluacionEconomicaConsumoMensajeCumpleCapacidad_QNAME, String.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MensajeCumplePatrimonio", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<String> createEvaluacionEconomicaConsumoMensajeCumplePatrimonio(String value) {
        return new JAXBElement<String>(_EvaluacionEconomicaConsumoMensajeCumplePatrimonio_QNAME, String.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "MensajeCumpleRelacionCuotaIngreso", scope = EvaluacionEconomicaConsumo.class)
    public JAXBElement<String> createEvaluacionEconomicaConsumoMensajeCumpleRelacionCuotaIngreso(String value) {
        return new JAXBElement<String>(_EvaluacionEconomicaConsumoMensajeCumpleRelacionCuotaIngreso_QNAME, String.class, EvaluacionEconomicaConsumo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ClasesRubro", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfClaseRubro> createMSEvaluacionEconomicaClasesRubro(ArrayOfClaseRubro value) {
        return new JAXBElement<ArrayOfClaseRubro>(_MSEvaluacionEconomicaClasesRubro_QNAME, ArrayOfClaseRubro.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClaseRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ClasesRubroPareja", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfClaseRubro> createMSEvaluacionEconomicaClasesRubroPareja(ArrayOfClaseRubro value) {
        return new JAXBElement<ArrayOfClaseRubro>(_MSEvaluacionEconomicaClasesRubroPareja_QNAME, ArrayOfClaseRubro.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaConsumo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionConsumo", scope = MSEvaluacionEconomica.class)
    public JAXBElement<EvaluacionEconomicaConsumo> createMSEvaluacionEconomicaEvaluacionConsumo(EvaluacionEconomicaConsumo value) {
        return new JAXBElement<EvaluacionEconomicaConsumo>(_MEInformacionEvaluacionEvaluacionConsumo_QNAME, EvaluacionEconomicaConsumo.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EvaluacionEconomicaMicro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EvaluacionMicro", scope = MSEvaluacionEconomica.class)
    public JAXBElement<EvaluacionEconomicaMicro> createMSEvaluacionEconomicaEvaluacionMicro(EvaluacionEconomicaMicro value) {
        return new JAXBElement<EvaluacionEconomicaMicro>(_MEInformacionEvaluacionEvaluacionMicro_QNAME, EvaluacionEconomicaMicro.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaActivos", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfDetalleActivo> createMSEvaluacionEconomicaListaActivos(ArrayOfDetalleActivo value) {
        return new JAXBElement<ArrayOfDetalleActivo>(_MSEvaluacionEconomicaListaActivos_QNAME, ArrayOfDetalleActivo.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaDetalleProductos", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfDetalleProductoMicroempresa> createMSEvaluacionEconomicaListaDetalleProductos(ArrayOfDetalleProductoMicroempresa value) {
        return new JAXBElement<ArrayOfDetalleProductoMicroempresa>(_MSEvaluacionEconomicaListaDetalleProductos_QNAME, ArrayOfDetalleProductoMicroempresa.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaManoObra", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfManoObraMicroempresa> createMSEvaluacionEconomicaListaManoObra(ArrayOfManoObraMicroempresa value) {
        return new JAXBElement<ArrayOfManoObraMicroempresa>(_MSEvaluacionEconomicaListaManoObra_QNAME, ArrayOfManoObraMicroempresa.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPasivos", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfDetallePasivo> createMSEvaluacionEconomicaListaPasivos(ArrayOfDetallePasivo value) {
        return new JAXBElement<ArrayOfDetallePasivo>(_MSEvaluacionEconomicaListaPasivos_QNAME, ArrayOfDetallePasivo.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rubros", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfRubroIngresoEgreso> createMSEvaluacionEconomicaRubros(ArrayOfRubroIngresoEgreso value) {
        return new JAXBElement<ArrayOfRubroIngresoEgreso>(_MSEvaluacionEconomicaRubros_QNAME, ArrayOfRubroIngresoEgreso.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RubrosPareja", scope = MSEvaluacionEconomica.class)
    public JAXBElement<ArrayOfRubroIngresoEgreso> createMSEvaluacionEconomicaRubrosPareja(ArrayOfRubroIngresoEgreso value) {
        return new JAXBElement<ArrayOfRubroIngresoEgreso>(_MSEvaluacionEconomicaRubrosPareja_QNAME, ArrayOfRubroIngresoEgreso.class, MSEvaluacionEconomica.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCheckListFlujo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ListaPoliticas", scope = MSTipoProcesoCredito.class)
    public JAXBElement<ArrayOfCheckListFlujo> createMSTipoProcesoCreditoListaPoliticas(ArrayOfCheckListFlujo value) {
        return new JAXBElement<ArrayOfCheckListFlujo>(_MSGuardarCreditoListaPoliticas_QNAME, ArrayOfCheckListFlujo.class, MSTipoProcesoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = METipoProcesoCredito.class)
    public JAXBElement<String> createMETipoProcesoCreditoIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, METipoProcesoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = ParametroProspeccionCredito.class)
    public JAXBElement<String> createParametroProspeccionCreditoCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, ParametroProspeccionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOperacion", scope = ParametroProspeccionCredito.class)
    public JAXBElement<String> createParametroProspeccionCreditoCodigoTipoOperacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoOperacion_QNAME, String.class, ParametroProspeccionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EmpleosCliente", scope = MSTipoCredito.class)
    public JAXBElement<ArrayOfEmpleo> createMSTipoCreditoEmpleosCliente(ArrayOfEmpleo value) {
        return new JAXBElement<ArrayOfEmpleo>(_MSTipoCreditoEmpleosCliente_QNAME, ArrayOfEmpleo.class, MSTipoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EmpleosClienteConyuge", scope = MSTipoCredito.class)
    public JAXBElement<ArrayOfEmpleo> createMSTipoCreditoEmpleosClienteConyuge(ArrayOfEmpleo value) {
        return new JAXBElement<ArrayOfEmpleo>(_MSTipoCreditoEmpleosClienteConyuge_QNAME, ArrayOfEmpleo.class, MSTipoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdEmpleoPrincipalConyuge", scope = MSTipoCredito.class)
    public JAXBElement<Integer> createMSTipoCreditoIdEmpleoPrincipalConyuge(Integer value) {
        return new JAXBElement<Integer>(_MSTipoCreditoIdEmpleoPrincipalConyuge_QNAME, Integer.class, MSTipoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParametroProspeccionCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = MSTipoCredito.class)
    public JAXBElement<ParametroProspeccionCredito> createMSTipoCreditoTipoCredito(ParametroProspeccionCredito value) {
        return new JAXBElement<ParametroProspeccionCredito>(_MSGuardarCreditoTipoCredito_QNAME, ParametroProspeccionCredito.class, MSTipoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Producto", scope = MSConsultaCreditoPreferencial.class)
    public JAXBElement<String> createMSConsultaCreditoPreferencialProducto(String value) {
        return new JAXBElement<String>(_MSConsultaCreditoPreferencialProducto_QNAME, String.class, MSConsultaCreditoPreferencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = MSConsultaCreditoPreferencial.class)
    public JAXBElement<String> createMSConsultaCreditoPreferencialTipoCredito(String value) {
        return new JAXBElement<String>(_MSGuardarCreditoTipoCredito_QNAME, String.class, MSConsultaCreditoPreferencial.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionProducto", scope = OperacionCarteraRenovacion.class)
    public JAXBElement<String> createOperacionCarteraRenovacionDescripcionProducto(String value) {
        return new JAXBElement<String>(_OperacionCarteraRenovacionDescripcionProducto_QNAME, String.class, OperacionCarteraRenovacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NroOpBanco", scope = OperacionCarteraRenovacion.class)
    public JAXBElement<String> createOperacionCarteraRenovacionNroOpBanco(String value) {
        return new JAXBElement<String>(_OperacionCarteraRenovacionNroOpBanco_QNAME, String.class, OperacionCarteraRenovacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCarteraRenovacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Operaciones", scope = MSDatosRenovacion.class)
    public JAXBElement<ArrayOfOperacionCarteraRenovacion> createMSDatosRenovacionOperaciones(ArrayOfOperacionCarteraRenovacion value) {
        return new JAXBElement<ArrayOfOperacionCarteraRenovacion>(_MSDatosRenovacionOperaciones_QNAME, ArrayOfOperacionCarteraRenovacion.class, MSDatosRenovacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = MSRenovacionCredito.class)
    public JAXBElement<String> createMSRenovacionCreditoNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, MSRenovacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MERenovacionCredito.class)
    public JAXBElement<String> createMERenovacionCreditoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MERenovacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacionesRenovar", scope = MERenovacionCredito.class)
    public JAXBElement<ArrayOfstring> createMERenovacionCreditoNumeroOperacionesRenovar(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_MERenovacionCreditoNumeroOperacionesRenovar_QNAME, ArrayOfstring.class, MERenovacionCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoEstado", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizCodigoEstado(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizCodigoEstado_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Descripcion", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizDescripcion(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcion_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionAseguradora", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizDescripcionAseguradora(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionAseguradora_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionEstado", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizDescripcionEstado(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionEstado_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionFinanciera", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizDescripcionFinanciera(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionFinanciera_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Dispositivo", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizDispositivo(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaDispositivo_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucAseguradora", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizRucAseguradora(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucAseguradora_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucDispositivo", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizRucDispositivo(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucDispositivo_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucFinanciera", scope = MSConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMSConsultaSolicitudAutomotrizRucFinanciera(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucFinanciera_QNAME, String.class, MSConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroSolicitud", scope = MEConsultaSolicitudAutomotriz.class)
    public JAXBElement<String> createMEConsultaSolicitudAutomotrizNumeroSolicitud(String value) {
        return new JAXBElement<String>(_MEConsultaSolicitudAutomotrizNumeroSolicitud_QNAME, String.class, MEConsultaSolicitudAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Descripcion", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizDescripcion(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcion_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionAseguradora", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizDescripcionAseguradora(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionAseguradora_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionFinanciera", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizDescripcionFinanciera(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionFinanciera_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Dispositivo", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizDispositivo(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaDispositivo_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucAseguradora", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizRucAseguradora(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucAseguradora_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucDispositivo", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizRucDispositivo(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucDispositivo_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RucFinanciera", scope = MSSolicitudCreditoAutomotriz.class)
    public JAXBElement<String> createMSSolicitudCreditoAutomotrizRucFinanciera(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizRucFinanciera_QNAME, String.class, MSSolicitudCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdPresolicitud", scope = MSCreditoAutomotriz.class)
    public JAXBElement<String> createMSCreditoAutomotrizIdPresolicitud(String value) {
        return new JAXBElement<String>(_MSCreditoAutomotrizIdPresolicitud_QNAME, String.class, MSCreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Aseguradora", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizAseguradora(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizAseguradora_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CallePrincipal", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCallePrincipal_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CalleSecundaria", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCalleSecundaria(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCalleSecundaria_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Celular", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCelular(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCelular_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Ciudad", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCiudad(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCiudad_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoProducto", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCodigoProducto(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCodigoProducto_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Color", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizColor(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizColor_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Correo", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizCorreo(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCorreo_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Descripcion", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizDescripcion(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcion_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionPeriodoGracia", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizDescripcionPeriodoGracia(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizDescripcionPeriodoGracia_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionPlazo", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizDescripcionPlazo(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizDescripcionPlazo_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EmpresaLineaCredito", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizEmpresaLineaCredito(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizEmpresaLineaCredito_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoCivil", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizEstadoCivil(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaEstadoCivil_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FrecuenciaPago", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizFrecuenciaPago(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizFrecuenciaPago_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FuentePago", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizFuentePago(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizFuentePago_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "HojaNegocio", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizHojaNegocio(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizHojaNegocio_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionAsesor", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizIdentificacionAsesor(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizIdentificacionAsesor_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Modelo", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizModelo(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizModelo_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Numero", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizNumero(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizNumero_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Pais", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizPais(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizPais_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Parroquia", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizParroquia(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizParroquia_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Pasaporte", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizPasaporte(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizPasaporte_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "PrimerApellido", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizPrimerApellido(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizPrimerApellido_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "PrimerNombre", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizPrimerNombre(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizPrimerNombre_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Provincia", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizProvincia(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizProvincia_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RazonSocial", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizRazonSocial(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizRazonSocial_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SegundoApellido", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizSegundoApellido(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizSegundoApellido_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SegundoNombre", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizSegundoNombre(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizSegundoNombre_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TelefonoFijo", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizTelefonoFijo(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizTelefonoFijo_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoIdentificacion", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizTipoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizTipoIdentificacion_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoTercero", scope = MECreditoAutomotriz.class)
    public JAXBElement<String> createMECreditoAutomotrizTipoTercero(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizTipoTercero_QNAME, String.class, MECreditoAutomotriz.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Archivo", scope = MSCreditoConsolidado.class)
    public JAXBElement<byte[]> createMSCreditoConsolidadoArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MERiesgoAmbientalArchivo_QNAME, byte[].class, MSCreditoConsolidado.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = MSCreditoConsolidado.class)
    public JAXBElement<String> createMSCreditoConsolidadoNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, MSCreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoActividadEconomica", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoActividadEconomica_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDestinoEspecifico", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoDestinoEspecifico(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoDestinoEspecifico_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDestinoFinanciero", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoDestinoFinanciero(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoDestinoFinanciero_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoOficial", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoOficial(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoOficial_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOperacion", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoTipoOperacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoOperacion_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoTabla", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoCodigoTipoTabla(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoTabla_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdValidacion", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoIdValidacion(String value) {
        return new JAXBElement<String>(_MECreditoConsolidadoIdValidacion_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacionRenovar", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoNumeroOperacionRenovar(String value) {
        return new JAXBElement<String>(_MECreditoConsolidadoNumeroOperacionRenovar_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Segmentacion", scope = MECreditoConsolidado.class)
    public JAXBElement<String> createMECreditoConsolidadoSegmentacion(String value) {
        return new JAXBElement<String>(_MECreditoConsolidadoSegmentacion_QNAME, String.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "VentasAnuales", scope = MECreditoConsolidado.class)
    public JAXBElement<BigDecimal> createMECreditoConsolidadoVentasAnuales(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MECreditoConsolidadoVentasAnuales_QNAME, BigDecimal.class, MECreditoConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Archivo", scope = MEDocumentoCredito.class)
    public JAXBElement<byte[]> createMEDocumentoCreditoArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MERiesgoAmbientalArchivo_QNAME, byte[].class, MEDocumentoCredito.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = MEDocumentoCredito.class)
    public JAXBElement<String> createMEDocumentoCreditoIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, MEDocumentoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoDocumento", scope = MEDocumentoCredito.class)
    public JAXBElement<String> createMEDocumentoCreditoTipoDocumento(String value) {
        return new JAXBElement<String>(_MEDocumentoCreditoTipoDocumento_QNAME, String.class, MEDocumentoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOperacion", scope = MECreditoCanales.class)
    public JAXBElement<String> createMECreditoCanalesCodigoTipoOperacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoOperacion_QNAME, String.class, MECreditoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = MECreditoCanales.class)
    public JAXBElement<String> createMECreditoCanalesIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, MECreditoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ServicioAsistencias", scope = MECreditoCanales.class)
    public JAXBElement<Boolean> createMECreditoCanalesServicioAsistencias(Boolean value) {
        return new JAXBElement<Boolean>(_MECreditoCanalesServicioAsistencias_QNAME, Boolean.class, MECreditoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TerminalAutoservicio", scope = MECreditoCanales.class)
    public JAXBElement<String> createMECreditoCanalesTerminalAutoservicio(String value) {
        return new JAXBElement<String>(_MECreditoCanalesTerminalAutoservicio_QNAME, String.class, MECreditoCanales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoCivil", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreEstadoCivil(String value) {
        return new JAXBElement<String>(_MEFirmaElectronicaPersonaEstadoCivil_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaIngresoCliente", scope = MEConsultaScore.class)
    public JAXBElement<XMLGregorianCalendar> createMEConsultaScoreFechaIngresoCliente(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MEConsultaScoreFechaIngresoCliente_QNAME, XMLGregorianCalendar.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "GeneroCliente", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreGeneroCliente(String value) {
        return new JAXBElement<String>(_MEConsultaScoreGeneroCliente_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionConyuge", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_MEConsultaScoreIdentificacionConyuge_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SegmentoCliente", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreSegmentoCliente(String value) {
        return new JAXBElement<String>(_MEConsultaScoreSegmentoCliente_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoIdentificacion", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreTipoIdentificacion(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizTipoIdentificacion_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoIdentificacionConyuge", scope = MEConsultaScore.class)
    public JAXBElement<String> createMEConsultaScoreTipoIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_MEConsultaScoreTipoIdentificacionConyuge_QNAME, String.class, MEConsultaScore.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Producto", scope = MESimulacion.class)
    public JAXBElement<String> createMESimulacionProducto(String value) {
        return new JAXBElement<String>(_MSConsultaCreditoPreferencialProducto_QNAME, String.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Segmentacion", scope = MESimulacion.class)
    public JAXBElement<String> createMESimulacionSegmentacion(String value) {
        return new JAXBElement<String>(_MECreditoConsolidadoSegmentacion_QNAME, String.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = MESimulacion.class)
    public JAXBElement<String> createMESimulacionTipoCredito(String value) {
        return new JAXBElement<String>(_MSGuardarCreditoTipoCredito_QNAME, String.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoPlazo", scope = MESimulacion.class)
    public JAXBElement<String> createMESimulacionTipoPlazo(String value) {
        return new JAXBElement<String>(_MESimulacionTipoPlazo_QNAME, String.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoTabla", scope = MESimulacion.class)
    public JAXBElement<String> createMESimulacionTipoTabla(String value) {
        return new JAXBElement<String>(_MESimulacionTipoTabla_QNAME, String.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "VentasAnuales", scope = MESimulacion.class)
    public JAXBElement<BigDecimal> createMESimulacionVentasAnuales(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MECreditoConsolidadoVentasAnuales_QNAME, BigDecimal.class, MESimulacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DatosPagos", scope = MSRegistroPago.class)
    public JAXBElement<ArrayOfPagoDiarioAcc> createMSRegistroPagoDatosPagos(ArrayOfPagoDiarioAcc value) {
        return new JAXBElement<ArrayOfPagoDiarioAcc>(_MSRegistroPagoDatosPagos_QNAME, ArrayOfPagoDiarioAcc.class, MSRegistroPago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroCuentaGrupal", scope = PagoDiarioAcc.class)
    public JAXBElement<String> createPagoDiarioAccNumeroCuentaGrupal(String value) {
        return new JAXBElement<String>(_PagoDiarioAccNumeroCuentaGrupal_QNAME, String.class, PagoDiarioAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = PagoDiarioAcc.class)
    public JAXBElement<String> createPagoDiarioAccNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, PagoDiarioAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Observacion", scope = PagoDiarioAcc.class)
    public JAXBElement<String> createPagoDiarioAccObservacion(String value) {
        return new JAXBElement<String>(_PagoDiarioAccObservacion_QNAME, String.class, PagoDiarioAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Resultado", scope = PagoDiarioAcc.class)
    public JAXBElement<String> createPagoDiarioAccResultado(String value) {
        return new JAXBElement<String>(_PagoDiarioAccResultado_QNAME, String.class, PagoDiarioAcc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPagoDiarioAcc }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DatosPagos", scope = MERegistroPago.class)
    public JAXBElement<ArrayOfPagoDiarioAcc> createMERegistroPagoDatosPagos(ArrayOfPagoDiarioAcc value) {
        return new JAXBElement<ArrayOfPagoDiarioAcc>(_MSRegistroPagoDatosPagos_QNAME, ArrayOfPagoDiarioAcc.class, MERegistroPago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = SaldosVencidosOperacion.class)
    public JAXBElement<String> createSaldosVencidosOperacionIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, SaldosVencidosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroCuenta", scope = SaldosVencidosOperacion.class)
    public JAXBElement<String> createSaldosVencidosOperacionNumeroCuenta(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroCuenta_QNAME, String.class, SaldosVencidosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = SaldosVencidosOperacion.class)
    public JAXBElement<String> createSaldosVencidosOperacionNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, SaldosVencidosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosVencidosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SaldosOperaciones", scope = MSConsultaSaldosVencidos.class)
    public JAXBElement<ArrayOfSaldosVencidosOperacion> createMSConsultaSaldosVencidosSaldosOperaciones(ArrayOfSaldosVencidosOperacion value) {
        return new JAXBElement<ArrayOfSaldosVencidosOperacion>(_MSConsultaSaldosVencidosSaldosOperaciones_QNAME, ArrayOfSaldosVencidosOperacion.class, MSConsultaSaldosVencidos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOperacion", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionCodigoTipoOperacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoOperacion_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DesTipoCuota", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionDesTipoCuota(String value) {
        return new JAXBElement<String>(_TipoOperacionDesTipoCuota_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionMoneda", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionDescripcionMoneda(String value) {
        return new JAXBElement<String>(_TipoOperacionDescripcionMoneda_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionTipoOperacion", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionDescripcionTipoOperacion(String value) {
        return new JAXBElement<String>(_TipoOperacionDescripcionTipoOperacion_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Reduccion", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionReduccion(String value) {
        return new JAXBElement<String>(_TipoOperacionReduccion_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoAmortizacion", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionTipoAmortizacion(String value) {
        return new JAXBElement<String>(_TipoOperacionTipoAmortizacion_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCobroIntereses", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionTipoCobroIntereses(String value) {
        return new JAXBElement<String>(_TipoOperacionTipoCobroIntereses_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCuota", scope = TipoOperacion.class)
    public JAXBElement<String> createTipoOperacionTipoCuota(String value) {
        return new JAXBElement<String>(_TipoOperacionTipoCuota_QNAME, String.class, TipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TiposOperacion", scope = MSTipoOperacion.class)
    public JAXBElement<ArrayOfTipoOperacion> createMSTipoOperacionTiposOperacion(ArrayOfTipoOperacion value) {
        return new JAXBElement<ArrayOfTipoOperacion>(_MSTipoOperacionTiposOperacion_QNAME, ArrayOfTipoOperacion.class, MSTipoOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Codigo", scope = METipoCartera.class)
    public JAXBElement<String> createMETipoCarteraCodigo(String value) {
        return new JAXBElement<String>(_METipoCarteraCodigo_QNAME, String.class, METipoCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCartera", scope = METipoCartera.class)
    public JAXBElement<String> createMETipoCarteraTipoCartera(String value) {
        return new JAXBElement<String>(_METipoCarteraTipoCartera_QNAME, String.class, METipoCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoRol", scope = ClienteGarantia.class)
    public JAXBElement<String> createClienteGarantiaCodigoRol(String value) {
        return new JAXBElement<String>(_ClienteGarantiaCodigoRol_QNAME, String.class, ClienteGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionRol", scope = ClienteGarantia.class)
    public JAXBElement<String> createClienteGarantiaDescripcionRol(String value) {
        return new JAXBElement<String>(_ClienteGarantiaDescripcionRol_QNAME, String.class, ClienteGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Identificacion", scope = ClienteGarantia.class)
    public JAXBElement<String> createClienteGarantiaIdentificacion(String value) {
        return new JAXBElement<String>(_MECreacionCreditoIdentificacion_QNAME, String.class, ClienteGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Nombres", scope = ClienteGarantia.class)
    public JAXBElement<String> createClienteGarantiaNombres(String value) {
        return new JAXBElement<String>(_ClienteGarantiaNombres_QNAME, String.class, ClienteGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Clientes", scope = Garantia.class)
    public JAXBElement<ArrayOfClienteGarantia> createGarantiaClientes(ArrayOfClienteGarantia value) {
        return new JAXBElement<ArrayOfClienteGarantia>(_GarantiaClientes_QNAME, ArrayOfClienteGarantia.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoGarantia", scope = Garantia.class)
    public JAXBElement<String> createGarantiaCodigoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaCodigoGarantia_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoMoneda", scope = Garantia.class)
    public JAXBElement<String> createGarantiaCodigoMoneda(String value) {
        return new JAXBElement<String>(_GarantiaCodigoMoneda_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionEstado", scope = Garantia.class)
    public JAXBElement<String> createGarantiaDescripcionEstado(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionEstado_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = Garantia.class)
    public JAXBElement<String> createGarantiaEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NroOperacionRelacionada", scope = Garantia.class)
    public JAXBElement<String> createGarantiaNroOperacionRelacionada(String value) {
        return new JAXBElement<String>(_GarantiaNroOperacionRelacionada_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoGarantia", scope = Garantia.class)
    public JAXBElement<String> createGarantiaTipoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaTipoGarantia_QNAME, String.class, Garantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGarantia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfGarantia }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Garantias", scope = MSConsultasGarantias.class)
    public JAXBElement<ArrayOfGarantia> createMSConsultasGarantiasGarantias(ArrayOfGarantia value) {
        return new JAXBElement<ArrayOfGarantia>(_MSConsultasGarantiasGarantias_QNAME, ArrayOfGarantia.class, MSConsultasGarantias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoGarantia", scope = MEConsultasGarantia.class)
    public JAXBElement<String> createMEConsultasGarantiaCodigoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaCodigoGarantia_QNAME, String.class, MEConsultasGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoGarantia", scope = MEReasignacionGarantia.class)
    public JAXBElement<String> createMEReasignacionGarantiaCodigoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaCodigoGarantia_QNAME, String.class, MEReasignacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoGarantia", scope = MSCreacionGarantia.class)
    public JAXBElement<String> createMSCreacionGarantiaCodigoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaCodigoGarantia_QNAME, String.class, MSCreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdGarante", scope = MECreacionGarantia.class)
    public JAXBElement<Integer> createMECreacionGarantiaIdGarante(Integer value) {
        return new JAXBElement<Integer>(_MECreacionGarantiaIdGarante_QNAME, Integer.class, MECreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Moneda", scope = MECreacionGarantia.class)
    public JAXBElement<String> createMECreacionGarantiaMoneda(String value) {
        return new JAXBElement<String>(_MECreacionGarantiaMoneda_QNAME, String.class, MECreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Sucursal", scope = MECreacionGarantia.class)
    public JAXBElement<String> createMECreacionGarantiaSucursal(String value) {
        return new JAXBElement<String>(_MECreacionGarantiaSucursal_QNAME, String.class, MECreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoBien", scope = MECreacionGarantia.class)
    public JAXBElement<String> createMECreacionGarantiaTipoBien(String value) {
        return new JAXBElement<String>(_MECreacionGarantiaTipoBien_QNAME, String.class, MECreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoGarantia", scope = MECreacionGarantia.class)
    public JAXBElement<String> createMECreacionGarantiaTipoGarantia(String value) {
        return new JAXBElement<String>(_GarantiaTipoGarantia_QNAME, String.class, MECreacionGarantia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoQr", scope = MEConsultasCredito.class)
    public JAXBElement<String> createMEConsultasCreditoCodigoQr(String value) {
        return new JAXBElement<String>(_MEConsultasCreditoCodigoQr_QNAME, String.class, MEConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FirmaCliente", scope = MEConsultasCredito.class)
    public JAXBElement<byte[]> createMEConsultasCreditoFirmaCliente(byte[] value) {
        return new JAXBElement<byte[]>(_MEConsultasCreditoFirmaCliente_QNAME, byte[].class, MEConsultasCredito.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdValidacion", scope = MEConsultasCredito.class)
    public JAXBElement<String> createMEConsultasCreditoIdValidacion(String value) {
        return new JAXBElement<String>(_MECreditoConsolidadoIdValidacion_QNAME, String.class, MEConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = MEConsultasCredito.class)
    public JAXBElement<String> createMEConsultasCreditoNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, MEConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = MovimientoCredito.class)
    public JAXBElement<String> createMovimientoCreditoEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, MovimientoCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoProducto", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoCodigoProducto(String value) {
        return new JAXBElement<String>(_MECreditoAutomotrizCodigoProducto_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoOperacion", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoEstadoOperacion(String value) {
        return new JAXBElement<String>(_TramiteCreditoEstadoOperacion_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreDeudor", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoNombreDeudor(String value) {
        return new JAXBElement<String>(_TramiteCreditoNombreDeudor_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreOficial", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoNombreOficial(String value) {
        return new JAXBElement<String>(_TramiteCreditoNombreOficial_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "OperacionBanco", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoOperacionBanco(String value) {
        return new JAXBElement<String>(_TramiteCreditoOperacionBanco_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Tipo", scope = TramiteCredito.class)
    public JAXBElement<String> createTramiteCreditoTipo(String value) {
        return new JAXBElement<String>(_TramiteCreditoTipo_QNAME, String.class, TramiteCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Credito", scope = MSConsultasCredito.class)
    public JAXBElement<TramiteCredito> createMSConsultasCreditoCredito(TramiteCredito value) {
        return new JAXBElement<TramiteCredito>(_MSSimulacionPagoCreditoCredito_QNAME, TramiteCredito.class, MSConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Creditos", scope = MSConsultasCredito.class)
    public JAXBElement<ArrayOfTramiteCredito> createMSConsultasCreditoCreditos(ArrayOfTramiteCredito value) {
        return new JAXBElement<ArrayOfTramiteCredito>(_MSConsultasCreditoCreditos_QNAME, ArrayOfTramiteCredito.class, MSConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfTramiteCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CreditosPareja", scope = MSConsultasCredito.class)
    public JAXBElement<ArrayOfTramiteCredito> createMSConsultasCreditoCreditosPareja(ArrayOfTramiteCredito value) {
        return new JAXBElement<ArrayOfTramiteCredito>(_MSConsultasCreditoCreditosPareja_QNAME, ArrayOfTramiteCredito.class, MSConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfMovimientoCredito }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Movimientos", scope = MSConsultasCredito.class)
    public JAXBElement<ArrayOfMovimientoCredito> createMSConsultasCreditoMovimientos(ArrayOfMovimientoCredito value) {
        return new JAXBElement<ArrayOfMovimientoCredito>(_MSConsultasCreditoMovimientos_QNAME, ArrayOfMovimientoCredito.class, MSConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Nombre", scope = MSConsultasCredito.class)
    public JAXBElement<String> createMSConsultasCreditoNombre(String value) {
        return new JAXBElement<String>(_MSConsultasCreditoNombre_QNAME, String.class, MSConsultasCredito.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = SaldosOperacion.class)
    public JAXBElement<String> createSaldosOperacionNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, SaldosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Segmento", scope = SaldosOperacion.class)
    public JAXBElement<String> createSaldosOperacionSegmento(String value) {
        return new JAXBElement<String>(_SaldosOperacionSegmento_QNAME, String.class, SaldosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCartera", scope = SaldosOperacion.class)
    public JAXBElement<String> createSaldosOperacionTipoCartera(String value) {
        return new JAXBElement<String>(_METipoCarteraTipoCartera_QNAME, String.class, SaldosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoOperacion", scope = SaldosOperacion.class)
    public JAXBElement<String> createSaldosOperacionTipoOperacion(String value) {
        return new JAXBElement<String>(_TipoOperacion_QNAME, String.class, SaldosOperacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Codigo", scope = Rubro.class)
    public JAXBElement<String> createRubroCodigo(String value) {
        return new JAXBElement<String>(_METipoCarteraCodigo_QNAME, String.class, Rubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Descripcion", scope = Rubro.class)
    public JAXBElement<String> createRubroDescripcion(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcion_QNAME, String.class, Rubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Principal", scope = Rubro.class)
    public JAXBElement<String> createRubroPrincipal(String value) {
        return new JAXBElement<String>(_RubroPrincipal_QNAME, String.class, Rubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoRecepcion", scope = Rubro.class)
    public JAXBElement<String> createRubroTipoRecepcion(String value) {
        return new JAXBElement<String>(_RubroTipoRecepcion_QNAME, String.class, Rubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoRubro", scope = Rubro.class)
    public JAXBElement<String> createRubroTipoRubro(String value) {
        return new JAXBElement<String>(_RubroTipoRubro_QNAME, String.class, Rubro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CuentaPago", scope = Pago.class)
    public JAXBElement<String> createPagoCuentaPago(String value) {
        return new JAXBElement<String>(_PagoCuentaPago_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionEstado", scope = Pago.class)
    public JAXBElement<String> createPagoDescripcionEstado(String value) {
        return new JAXBElement<String>(_MSConsultaSolicitudAutomotrizDescripcionEstado_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FormaPago", scope = Pago.class)
    public JAXBElement<String> createPagoFormaPago(String value) {
        return new JAXBElement<String>(_PagoFormaPago_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "LoginAplico", scope = Pago.class)
    public JAXBElement<String> createPagoLoginAplico(String value) {
        return new JAXBElement<String>(_PagoLoginAplico_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = Pago.class)
    public JAXBElement<String> createPagoNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Observacion", scope = Pago.class)
    public JAXBElement<String> createPagoObservacion(String value) {
        return new JAXBElement<String>(_PagoDiarioAccObservacion_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TerminalPago", scope = Pago.class)
    public JAXBElement<String> createPagoTerminalPago(String value) {
        return new JAXBElement<String>(_PagoTerminalPago_QNAME, String.class, Pago.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoRubro", scope = DetalleCuota.class)
    public JAXBElement<String> createDetalleCuotaEstadoRubro(String value) {
        return new JAXBElement<String>(_DetalleCuotaEstadoRubro_QNAME, String.class, DetalleCuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rubro", scope = DetalleCuota.class)
    public JAXBElement<String> createDetalleCuotaRubro(String value) {
        return new JAXBElement<String>(_Rubro_QNAME, String.class, DetalleCuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoRubro", scope = DetalleCuota.class)
    public JAXBElement<String> createDetalleCuotaTipoRubro(String value) {
        return new JAXBElement<String>(_RubroTipoRubro_QNAME, String.class, DetalleCuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = Cuota.class)
    public JAXBElement<String> createCuotaEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, Cuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = Cuota.class)
    public JAXBElement<String> createCuotaNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, Cuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rubros", scope = Cuota.class)
    public JAXBElement<ArrayOfDetalleCuota> createCuotaRubros(ArrayOfDetalleCuota value) {
        return new JAXBElement<ArrayOfDetalleCuota>(_MSEvaluacionEconomicaRubros_QNAME, ArrayOfDetalleCuota.class, Cuota.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Archivo", scope = MSCreditos.class)
    public JAXBElement<byte[]> createMSCreditosArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MERiesgoAmbientalArchivo_QNAME, byte[].class, MSCreditos.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Clientes", scope = MSCreditos.class)
    public JAXBElement<ArrayOfClienteTramite> createMSCreditosClientes(ArrayOfClienteTramite value) {
        return new JAXBElement<ArrayOfClienteTramite>(_GarantiaClientes_QNAME, ArrayOfClienteTramite.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CuotasPendientes", scope = MSCreditos.class)
    public JAXBElement<ArrayOfCuota> createMSCreditosCuotasPendientes(ArrayOfCuota value) {
        return new JAXBElement<ArrayOfCuota>(_MSCreditosCuotasPendientes_QNAME, ArrayOfCuota.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroCuenta", scope = MSCreditos.class)
    public JAXBElement<String> createMSCreditosNumeroCuenta(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroCuenta_QNAME, String.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacion", scope = MSCreditos.class)
    public JAXBElement<String> createMSCreditosNumeroOperacion(String value) {
        return new JAXBElement<String>(_MEPagoExtraordinarioCreditoNumeroOperacion_QNAME, String.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfOperacionCartera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Operaciones", scope = MSCreditos.class)
    public JAXBElement<ArrayOfOperacionCartera> createMSCreditosOperaciones(ArrayOfOperacionCartera value) {
        return new JAXBElement<ArrayOfOperacionCartera>(_MSDatosRenovacionOperaciones_QNAME, ArrayOfOperacionCartera.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "PagosOperaciones", scope = MSCreditos.class)
    public JAXBElement<ArrayOfPago> createMSCreditosPagosOperaciones(ArrayOfPago value) {
        return new JAXBElement<ArrayOfPago>(_MSCreditosPagosOperaciones_QNAME, ArrayOfPago.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubro }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "RubrosDesembolso", scope = MSCreditos.class)
    public JAXBElement<ArrayOfRubro> createMSCreditosRubrosDesembolso(ArrayOfRubro value) {
        return new JAXBElement<ArrayOfRubro>(_MSCreditosRubrosDesembolso_QNAME, ArrayOfRubro.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfSaldosOperacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "SaldosOperaciones", scope = MSCreditos.class)
    public JAXBElement<ArrayOfSaldosOperacion> createMSCreditosSaldosOperaciones(ArrayOfSaldosOperacion value) {
        return new JAXBElement<ArrayOfSaldosOperacion>(_MSConsultaSaldosVencidosSaldosOperaciones_QNAME, ArrayOfSaldosOperacion.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfCuota }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TablaAmortizacion", scope = MSCreditos.class)
    public JAXBElement<ArrayOfCuota> createMSCreditosTablaAmortizacion(ArrayOfCuota value) {
        return new JAXBElement<ArrayOfCuota>(_MSCreditosTablaAmortizacion_QNAME, ArrayOfCuota.class, MSCreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "ActividadEconomica", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraActividadEconomica(String value) {
        return new JAXBElement<String>(_OperacionCarteraActividadEconomica_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodOficina", scope = OperacionCartera.class)
    public JAXBElement<Short> createOperacionCarteraCodOficina(Short value) {
        return new JAXBElement<Short>(_OperacionCarteraCodOficina_QNAME, Short.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoActividadEconomica", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoActividadEconomica_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoCantonDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoCantonDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoCantonDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoCiudadDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoCiudadDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoCiudadDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoDesEspecifico", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoDesEspecifico(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoDesEspecifico_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoMoneda", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoMoneda(String value) {
        return new JAXBElement<String>(_GarantiaCodigoMoneda_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoOficina", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoOficina(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoOficina_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoOrigenRecursos", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoOrigenRecursos(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoOrigenRecursos_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoParroquiaDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoParroquiaDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoParroquiaDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoProvinciaDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoProvinciaDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoProvinciaDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoSector", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoSector(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoSector_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoSegmento", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoSegmento(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoSegmento_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoCredito", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoTipoCredito(String value) {
        return new JAXBElement<String>(_MECreacionCreditoCodigoTipoCredito_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoTipoOp", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCodigoTipoOp(String value) {
        return new JAXBElement<String>(_OperacionCarteraCodigoTipoOp_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Cuenta", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraCuenta(String value) {
        return new JAXBElement<String>(_OperacionCarteraCuenta_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DesMoneda", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDesMoneda(String value) {
        return new JAXBElement<String>(_OperacionCarteraDesMoneda_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DesSector", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDesSector(String value) {
        return new JAXBElement<String>(_OperacionCarteraDesSector_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DesTipoOperacion", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDesTipoOperacion(String value) {
        return new JAXBElement<String>(_OperacionCarteraDesTipoOperacion_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescFormaRecepcion", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescFormaRecepcion(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescFormaRecepcion_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescTipoCuota", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescTipoCuota(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescTipoCuota_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescTipoPlazo", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescTipoPlazo(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescTipoPlazo_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionCantonDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionCantonDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionCantonDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionCiudadDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionCiudadDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionCiudadDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionDesEspecifico", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionDesEspecifico(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionDesEspecifico_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionOficina", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionOficina(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionOficina_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionOrigenRecursos", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionOrigenRecursos(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionOrigenRecursos_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionParroquiaDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionParroquiaDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionParroquiaDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionProvinciaDestino", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionProvinciaDestino(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionProvinciaDestino_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "DescripcionSegmento", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraDescripcionSegmento(String value) {
        return new JAXBElement<String>(_OperacionCarteraDescripcionSegmento_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Estado", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraEstado(String value) {
        return new JAXBElement<String>(_MEDocumentoFirmaElectronicaEstado_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "EstadoSolicitud", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraEstadoSolicitud(String value) {
        return new JAXBElement<String>(_OperacionCarteraEstadoSolicitud_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaDeEmision", scope = OperacionCartera.class)
    public JAXBElement<XMLGregorianCalendar> createOperacionCarteraFechaDeEmision(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperacionCarteraFechaDeEmision_QNAME, XMLGregorianCalendar.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaDeVencimiento", scope = OperacionCartera.class)
    public JAXBElement<XMLGregorianCalendar> createOperacionCarteraFechaDeVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperacionCarteraFechaDeVencimiento_QNAME, XMLGregorianCalendar.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "FechaLiquidacion", scope = OperacionCartera.class)
    public JAXBElement<XMLGregorianCalendar> createOperacionCarteraFechaLiquidacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperacionCarteraFechaLiquidacion_QNAME, XMLGregorianCalendar.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdTipoCredito", scope = OperacionCartera.class)
    public JAXBElement<Integer> createOperacionCarteraIdTipoCredito(Integer value) {
        return new JAXBElement<Integer>(_OperacionCarteraIdTipoCredito_QNAME, Integer.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "IdentificacionCliente", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MECarpetaDocumentosCreditoIdentificacionCliente_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreCliente", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraNombreCliente(String value) {
        return new JAXBElement<String>(_OperacionCarteraNombreCliente_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreOficial", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraNombreOficial(String value) {
        return new JAXBElement<String>(_TramiteCreditoNombreOficial_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NumeroOperacionCartera", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraNumeroOperacionCartera(String value) {
        return new JAXBElement<String>(_OperacionCarteraNumeroOperacionCartera_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Segmento", scope = OperacionCartera.class)
    public JAXBElement<Integer> createOperacionCarteraSegmento(Integer value) {
        return new JAXBElement<Integer>(_SaldosOperacionSegmento_QNAME, Integer.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCredito", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraTipoCredito(String value) {
        return new JAXBElement<String>(_MSGuardarCreditoTipoCredito_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoCuota", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraTipoCuota(String value) {
        return new JAXBElement<String>(_TipoOperacionTipoCuota_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "TipoPlazo", scope = OperacionCartera.class)
    public JAXBElement<String> createOperacionCarteraTipoPlazo(String value) {
        return new JAXBElement<String>(_MESimulacionTipoPlazo_QNAME, String.class, OperacionCartera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CuentaGrupal", scope = MECreditos.class)
    public JAXBElement<String> createMECreditosCuentaGrupal(String value) {
        return new JAXBElement<String>(_MECreditosCuentaGrupal_QNAME, String.class, MECreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteTramite }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Deudores", scope = MECreditos.class)
    public JAXBElement<ArrayOfClienteTramite> createMECreditosDeudores(ArrayOfClienteTramite value) {
        return new JAXBElement<ArrayOfClienteTramite>(_MECreditosDeudores_QNAME, ArrayOfClienteTramite.class, MECreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombreImpreso", scope = MECreditos.class)
    public JAXBElement<String> createMECreditosNombreImpreso(String value) {
        return new JAXBElement<String>(_MEGuardarCreditoNombreImpreso_QNAME, String.class, MECreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperacionCartera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Operacion", scope = MECreditos.class)
    public JAXBElement<OperacionCartera> createMECreditosOperacion(OperacionCartera value) {
        return new JAXBElement<OperacionCartera>(_MECreditosOperacion_QNAME, OperacionCartera.class, MECreditos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "CodigoRol", scope = ClienteTramite.class)
    public JAXBElement<String> createClienteTramiteCodigoRol(String value) {
        return new JAXBElement<String>(_ClienteGarantiaCodigoRol_QNAME, String.class, ClienteTramite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Direcciones", scope = ClienteTramite.class)
    public JAXBElement<ArrayOfDireccion> createClienteTramiteDirecciones(ArrayOfDireccion value) {
        return new JAXBElement<ArrayOfDireccion>(_ClienteTramiteDirecciones_QNAME, ArrayOfDireccion.class, ClienteTramite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "NombresCompletos", scope = ClienteTramite.class)
    public JAXBElement<String> createClienteTramiteNombresCompletos(String value) {
        return new JAXBElement<String>(_ClienteTramiteNombresCompletos_QNAME, String.class, ClienteTramite.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Creditos", name = "Rol", scope = ClienteTramite.class)
    public JAXBElement<String> createClienteTramiteRol(String value) {
        return new JAXBElement<String>(_ClienteTramiteRol_QNAME, String.class, ClienteTramite.class, value);
    }

}
