
package servicioclientes.externalservices.web.corebanking.denarius;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MEIdentificacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeEntradaBase;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web.MensajeSalidaBase;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEAccionistaAdministrador;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEActivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECertificadoRelacionesComerciales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaCelular;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultaClientesCondiciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MECreacionClienteResumido;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosCodigoSeguridad;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosContacto;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDatosEspecificosCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEDireccion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFormularioOrigenFondos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEFuncionario;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEIdentificacion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionFinancieraCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEInformacionMicroempresa;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPasivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEPasivos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEReferenciasPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERelacion;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERelacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MERubroEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.METelefono;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEUsoDatosPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MEVinculado;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSArchivo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaCelular;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaClientes;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaClientesCondiciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaDireccionesCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaEmpleo;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaOrigenFondos;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaParticipacionAccionaria;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaReferenciasPersonales;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaRelaciones;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultaRepresentanteLegal;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSConsultasCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSCreacionCliente;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSDatosContacto;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSFuncionario;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSInformacionFinanciera;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MSVinculado;
import servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices.MeDatosCliente;


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

    private final static QName _ConsultarClientePorIdentificacionMeConsultasClientes_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultasClientes");
    private final static QName _ConsultarClientePorIdentificacionResponseConsultarClientePorIdentificacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClientePorIdentificacionResult");
    private final static QName _CrearClienteMeCreacionClientes_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCreacionClientes");
    private final static QName _CrearClienteResponseCrearClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearClienteResult");
    private final static QName _ConsultarDatosClienteMeConsulta_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsulta");
    private final static QName _ConsultarDatosClienteResponseConsultarDatosClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDatosClienteResult");
    private final static QName _ConsultarDireccionesClienteResponseConsultarDireccionesClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarDireccionesClienteResult");
    private final static QName _ConsultarRepresentanteLegalResponseConsultarRepresentanteLegalResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarRepresentanteLegalResult");
    private final static QName _CrearDireccionClienteMeCreacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCreacion");
    private final static QName _CrearDireccionClienteResponseCrearDireccionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearDireccionClienteResult");
    private final static QName _ActualizarDireccionClienteMeActualizacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meActualizacion");
    private final static QName _ActualizarDireccionClienteResponseActualizarDireccionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarDireccionClienteResult");
    private final static QName _CrearTelefonoClienteResponseCrearTelefonoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearTelefonoClienteResult");
    private final static QName _ActualizarTelefonoClienteResponseActualizarTelefonoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarTelefonoClienteResult");
    private final static QName _ConsultaDatosCelularResponseConsultaDatosCelularResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultaDatosCelularResult");
    private final static QName _ConsultarClientesCondicionesResponseConsultarClientesCondicionesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarClientesCondicionesResult");
    private final static QName _ActualizarFechaNacimientoClienteMeDatosCliente_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meDatosCliente");
    private final static QName _ActualizarFechaNacimientoClienteResponseActualizarFechaNacimientoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarFechaNacimientoClienteResult");
    private final static QName _ActualizarEmailClienteResponseActualizarEmailClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarEmailClienteResult");
    private final static QName _ActualizarInformacionClienteResponseActualizarInformacionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarInformacionClienteResult");
    private final static QName _EnviarNotificacionCodigoSeguridadResponseEnviarNotificacionCodigoSeguridadResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EnviarNotificacionCodigoSeguridadResult");
    private final static QName _ConsultarEmpleosResponseConsultarEmpleosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarEmpleosResult");
    private final static QName _CrearEmpleoMeEmpleo_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meEmpleo");
    private final static QName _CrearEmpleoResponseCrearEmpleoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearEmpleoResult");
    private final static QName _ActualizarEmpleoResponseActualizarEmpleoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarEmpleoResult");
    private final static QName _EliminarEmpleoResponseEliminarEmpleoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EliminarEmpleoResult");
    private final static QName _ConsultarRefenciasPersonalesResponseConsultarRefenciasPersonalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarRefenciasPersonalesResult");
    private final static QName _ActualizarRefenciasPersonalesMeReferenciaPersonal_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meReferenciaPersonal");
    private final static QName _ActualizarRefenciasPersonalesResponseActualizarRefenciasPersonalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarRefenciasPersonalesResult");
    private final static QName _CrearClienteConsolidadoResponseCrearClienteConsolidadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearClienteConsolidadoResult");
    private final static QName _SincronizarDatosContactabilidadMeBase_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meBase");
    private final static QName _SincronizarDatosContactabilidadResponseSincronizarDatosContactabilidadResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "SincronizarDatosContactabilidadResult");
    private final static QName _InformacionFinancieraClientesMeConsultaCliente_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaCliente");
    private final static QName _InformacionFinancieraClientesResponseInformacionFinancieraClientesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "InformacionFinancieraClientesResult");
    private final static QName _ActualizarDatosContactoMeEntrada_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meEntrada");
    private final static QName _ActualizarDatosContactoResponseActualizarDatosContactoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarDatosContactoResult");
    private final static QName _GuardarDatosEspecificosClienteResponseGuardarDatosEspecificosClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarDatosEspecificosClienteResult");
    private final static QName _CrearClienteResumidoMeCreacionClienteResumido_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCreacionClienteResumido");
    private final static QName _CrearClienteResumidoResponseCrearClienteResumidoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearClienteResumidoResult");
    private final static QName _RegistrarClienteBancaEnLineaMeRegistro_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRegistro");
    private final static QName _RegistrarClienteBancaEnLineaResponseRegistrarClienteBancaEnLineaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarClienteBancaEnLineaResult");
    private final static QName _ConsultarFormulariosOrigenFondosPendientesResponseConsultarFormulariosOrigenFondosPendientesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarFormulariosOrigenFondosPendientesResult");
    private final static QName _ActualizarFormularioOrigenFondosMeFormulario_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meFormulario");
    private final static QName _ActualizarFormularioOrigenFondosResponseActualizarFormularioOrigenFondosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarFormularioOrigenFondosResult");
    private final static QName _ConsultarEstadoSituacionResponseConsultarEstadoSituacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarEstadoSituacionResult");
    private final static QName _CrearActivoMeActivo_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meActivo");
    private final static QName _CrearActivoResponseCrearActivoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearActivoResult");
    private final static QName _ActualizarActivoResponseActualizarActivoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarActivoResult");
    private final static QName _EliminarActivoResponseEliminarActivoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EliminarActivoResult");
    private final static QName _GuardarRubrosEmpleoMeRubroEmpleo_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRubroEmpleo");
    private final static QName _GuardarRubrosEmpleoResponseGuardarRubrosEmpleoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarRubrosEmpleoResult");
    private final static QName _GuardarInformacionMicroempresaMeInformacionMicroempresa_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meInformacionMicroempresa");
    private final static QName _GuardarInformacionMicroempresaResponseGuardarInformacionMicroempresaResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarInformacionMicroempresaResult");
    private final static QName _GuardarPasivoEvaluacionMePasivo_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mePasivo");
    private final static QName _GuardarPasivoEvaluacionResponseGuardarPasivoEvaluacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GuardarPasivoEvaluacionResult");
    private final static QName _ActualizarPasivosDesdeBuroMePasivos_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "mePasivos");
    private final static QName _ActualizarPasivosDesdeBuroResponseActualizarPasivosDesdeBuroResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarPasivosDesdeBuroResult");
    private final static QName _CrearClienteProspectoResponseCrearClienteProspectoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearClienteProspectoResult");
    private final static QName _ValidarBaseImpedidosMeValidarBaseImpedidos_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meValidarBaseImpedidos");
    private final static QName _ValidarBaseImpedidosResponseValidarBaseImpedidosResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarBaseImpedidosResult");
    private final static QName _ActualizarClienteDefinitivoMeActualizacionCliente_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meActualizacionCliente");
    private final static QName _ActualizarClienteDefinitivoResponseActualizarClienteDefinitivoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarClienteDefinitivoResult");
    private final static QName _ActualizarRelacionClienteMeActualizacionRelacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meActualizacionRelacion");
    private final static QName _ActualizarRelacionClienteResponseActualizarRelacionClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarRelacionClienteResult");
    private final static QName _CrearNuevoClienteResponseCrearNuevoClienteResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "CrearNuevoClienteResult");
    private final static QName _GenerarCertificadoRelacionesComercialesMeCertificado_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meCertificado");
    private final static QName _GenerarCertificadoRelacionesComercialesResponseGenerarCertificadoRelacionesComercialesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarCertificadoRelacionesComercialesResult");
    private final static QName _ValidarCertificadoRelacionesComercialesResponseValidarCertificadoRelacionesComercialesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarCertificadoRelacionesComercialesResult");
    private final static QName _ConsultarFuncionarioMeConsultaFuncionario_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaFuncionario");
    private final static QName _ConsultarFuncionarioResponseConsultarFuncionarioResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarFuncionarioResult");
    private final static QName _ActualizarFuncionarioMeFuncionario_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meFuncionario");
    private final static QName _ActualizarFuncionarioResponseActualizarFuncionarioResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarFuncionarioResult");
    private final static QName _ConsultarInformaciónVinculadoMeConsultaVinculado_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaVinculado");
    private final static QName _ConsultarInformaciónVinculadoResponseConsultarInformaciónVinculadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarInformaci\u00f3nVinculadoResult");
    private final static QName _ActualizarInformaciónVinculadoMeVinculado_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meVinculado");
    private final static QName _ActualizarInformaciónVinculadoResponseActualizarInformaciónVinculadoResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarInformaci\u00f3nVinculadoResult");
    private final static QName _ConsultarRelacionesClientePepsMeConsultaPep_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaPep");
    private final static QName _ConsultarRelacionesClientePepsResponseConsultarRelacionesClientePepsResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarRelacionesClientePepsResult");
    private final static QName _RegistrarRelacionMeRelacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meRelacion");
    private final static QName _RegistrarRelacionResponseRegistrarRelacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarRelacionResult");
    private final static QName _ActualizarRelacionResponseActualizarRelacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarRelacionResult");
    private final static QName _EliminarRelacionResponseEliminarRelacionResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EliminarRelacionResult");
    private final static QName _ConsultarParticipacionAccionariaYAdministradoresPepsMeConsultaParticipacion_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meConsultaParticipacion");
    private final static QName _ConsultarParticipacionAccionariaYAdministradoresPepsResponseConsultarParticipacionAccionariaYAdministradoresPepsResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ConsultarParticipacionAccionariaYAdministradoresPepsResult");
    private final static QName _RegistrarAccionistaAdministradorMeAccionistaAdministrador_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meAccionistaAdministrador");
    private final static QName _RegistrarAccionistaAdministradorResponseRegistrarAccionistaAdministradorResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarAccionistaAdministradorResult");
    private final static QName _ActualizarAccionistaAdministradorResponseActualizarAccionistaAdministradorResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ActualizarAccionistaAdministradorResult");
    private final static QName _EliminarAccionistaAdministradorResponseEliminarAccionistaAdministradorResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "EliminarAccionistaAdministradorResult");
    private final static QName _GenerarFormularioRegistroRelacionadosPepMeClientePep_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meClientePep");
    private final static QName _GenerarFormularioRegistroRelacionadosPepResponseGenerarFormularioRegistroRelacionadosPepResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "GenerarFormularioRegistroRelacionadosPepResult");
    private final static QName _IniciarFlujoAprobacionRelacionadosPepResponseIniciarFlujoAprobacionRelacionadosPepResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "IniciarFlujoAprobacionRelacionadosPepResult");
    private final static QName _ValidarAprobacionFlujoRelacionadosPepResponseValidarAprobacionFlujoRelacionadosPepResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarAprobacionFlujoRelacionadosPepResult");
    private final static QName _ValidarAprobacionMalasReferenciasResponseValidarAprobacionMalasReferenciasResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "ValidarAprobacionMalasReferenciasResult");
    private final static QName _RegistrarAutorizacionUsoDatosPersonalesMeUsoDatosPersonales_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "meUsoDatosPersonales");
    private final static QName _RegistrarAutorizacionUsoDatosPersonalesResponseRegistrarAutorizacionUsoDatosPersonalesResult_QNAME = new QName("Denarius.CoreBanking.Web.ExternalServices", "RegistrarAutorizacionUsoDatosPersonalesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: externalservices.web.corebanking.denarius
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarClientePorIdentificacion }
     * 
     */
    public ConsultarClientePorIdentificacion createConsultarClientePorIdentificacion() {
        return new ConsultarClientePorIdentificacion();
    }

    /**
     * Create an instance of {@link ConsultarClientePorIdentificacionResponse }
     * 
     */
    public ConsultarClientePorIdentificacionResponse createConsultarClientePorIdentificacionResponse() {
        return new ConsultarClientePorIdentificacionResponse();
    }

    /**
     * Create an instance of {@link CrearCliente }
     * 
     */
    public CrearCliente createCrearCliente() {
        return new CrearCliente();
    }

    /**
     * Create an instance of {@link CrearClienteResponse }
     * 
     */
    public CrearClienteResponse createCrearClienteResponse() {
        return new CrearClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarDatosCliente }
     * 
     */
    public ConsultarDatosCliente createConsultarDatosCliente() {
        return new ConsultarDatosCliente();
    }

    /**
     * Create an instance of {@link ConsultarDatosClienteResponse }
     * 
     */
    public ConsultarDatosClienteResponse createConsultarDatosClienteResponse() {
        return new ConsultarDatosClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarDireccionesCliente }
     * 
     */
    public ConsultarDireccionesCliente createConsultarDireccionesCliente() {
        return new ConsultarDireccionesCliente();
    }

    /**
     * Create an instance of {@link ConsultarDireccionesClienteResponse }
     * 
     */
    public ConsultarDireccionesClienteResponse createConsultarDireccionesClienteResponse() {
        return new ConsultarDireccionesClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultarRepresentanteLegal }
     * 
     */
    public ConsultarRepresentanteLegal createConsultarRepresentanteLegal() {
        return new ConsultarRepresentanteLegal();
    }

    /**
     * Create an instance of {@link ConsultarRepresentanteLegalResponse }
     * 
     */
    public ConsultarRepresentanteLegalResponse createConsultarRepresentanteLegalResponse() {
        return new ConsultarRepresentanteLegalResponse();
    }

    /**
     * Create an instance of {@link CrearDireccionCliente }
     * 
     */
    public CrearDireccionCliente createCrearDireccionCliente() {
        return new CrearDireccionCliente();
    }

    /**
     * Create an instance of {@link CrearDireccionClienteResponse }
     * 
     */
    public CrearDireccionClienteResponse createCrearDireccionClienteResponse() {
        return new CrearDireccionClienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarDireccionCliente }
     * 
     */
    public ActualizarDireccionCliente createActualizarDireccionCliente() {
        return new ActualizarDireccionCliente();
    }

    /**
     * Create an instance of {@link ActualizarDireccionClienteResponse }
     * 
     */
    public ActualizarDireccionClienteResponse createActualizarDireccionClienteResponse() {
        return new ActualizarDireccionClienteResponse();
    }

    /**
     * Create an instance of {@link CrearTelefonoCliente }
     * 
     */
    public CrearTelefonoCliente createCrearTelefonoCliente() {
        return new CrearTelefonoCliente();
    }

    /**
     * Create an instance of {@link CrearTelefonoClienteResponse }
     * 
     */
    public CrearTelefonoClienteResponse createCrearTelefonoClienteResponse() {
        return new CrearTelefonoClienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarTelefonoCliente }
     * 
     */
    public ActualizarTelefonoCliente createActualizarTelefonoCliente() {
        return new ActualizarTelefonoCliente();
    }

    /**
     * Create an instance of {@link ActualizarTelefonoClienteResponse }
     * 
     */
    public ActualizarTelefonoClienteResponse createActualizarTelefonoClienteResponse() {
        return new ActualizarTelefonoClienteResponse();
    }

    /**
     * Create an instance of {@link ConsultaDatosCelular }
     * 
     */
    public ConsultaDatosCelular createConsultaDatosCelular() {
        return new ConsultaDatosCelular();
    }

    /**
     * Create an instance of {@link ConsultaDatosCelularResponse }
     * 
     */
    public ConsultaDatosCelularResponse createConsultaDatosCelularResponse() {
        return new ConsultaDatosCelularResponse();
    }

    /**
     * Create an instance of {@link ConsultarClientesCondiciones }
     * 
     */
    public ConsultarClientesCondiciones createConsultarClientesCondiciones() {
        return new ConsultarClientesCondiciones();
    }

    /**
     * Create an instance of {@link ConsultarClientesCondicionesResponse }
     * 
     */
    public ConsultarClientesCondicionesResponse createConsultarClientesCondicionesResponse() {
        return new ConsultarClientesCondicionesResponse();
    }

    /**
     * Create an instance of {@link ActualizarFechaNacimientoCliente }
     * 
     */
    public ActualizarFechaNacimientoCliente createActualizarFechaNacimientoCliente() {
        return new ActualizarFechaNacimientoCliente();
    }

    /**
     * Create an instance of {@link ActualizarFechaNacimientoClienteResponse }
     * 
     */
    public ActualizarFechaNacimientoClienteResponse createActualizarFechaNacimientoClienteResponse() {
        return new ActualizarFechaNacimientoClienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarEmailCliente }
     * 
     */
    public ActualizarEmailCliente createActualizarEmailCliente() {
        return new ActualizarEmailCliente();
    }

    /**
     * Create an instance of {@link ActualizarEmailClienteResponse }
     * 
     */
    public ActualizarEmailClienteResponse createActualizarEmailClienteResponse() {
        return new ActualizarEmailClienteResponse();
    }

    /**
     * Create an instance of {@link ActualizarInformacionCliente }
     * 
     */
    public ActualizarInformacionCliente createActualizarInformacionCliente() {
        return new ActualizarInformacionCliente();
    }

    /**
     * Create an instance of {@link ActualizarInformacionClienteResponse }
     * 
     */
    public ActualizarInformacionClienteResponse createActualizarInformacionClienteResponse() {
        return new ActualizarInformacionClienteResponse();
    }

    /**
     * Create an instance of {@link EnviarNotificacionCodigoSeguridad }
     * 
     */
    public EnviarNotificacionCodigoSeguridad createEnviarNotificacionCodigoSeguridad() {
        return new EnviarNotificacionCodigoSeguridad();
    }

    /**
     * Create an instance of {@link EnviarNotificacionCodigoSeguridadResponse }
     * 
     */
    public EnviarNotificacionCodigoSeguridadResponse createEnviarNotificacionCodigoSeguridadResponse() {
        return new EnviarNotificacionCodigoSeguridadResponse();
    }

    /**
     * Create an instance of {@link ConsultarEmpleos }
     * 
     */
    public ConsultarEmpleos createConsultarEmpleos() {
        return new ConsultarEmpleos();
    }

    /**
     * Create an instance of {@link ConsultarEmpleosResponse }
     * 
     */
    public ConsultarEmpleosResponse createConsultarEmpleosResponse() {
        return new ConsultarEmpleosResponse();
    }

    /**
     * Create an instance of {@link CrearEmpleo }
     * 
     */
    public CrearEmpleo createCrearEmpleo() {
        return new CrearEmpleo();
    }

    /**
     * Create an instance of {@link CrearEmpleoResponse }
     * 
     */
    public CrearEmpleoResponse createCrearEmpleoResponse() {
        return new CrearEmpleoResponse();
    }

    /**
     * Create an instance of {@link ActualizarEmpleo }
     * 
     */
    public ActualizarEmpleo createActualizarEmpleo() {
        return new ActualizarEmpleo();
    }

    /**
     * Create an instance of {@link ActualizarEmpleoResponse }
     * 
     */
    public ActualizarEmpleoResponse createActualizarEmpleoResponse() {
        return new ActualizarEmpleoResponse();
    }

    /**
     * Create an instance of {@link EliminarEmpleo }
     * 
     */
    public EliminarEmpleo createEliminarEmpleo() {
        return new EliminarEmpleo();
    }

    /**
     * Create an instance of {@link EliminarEmpleoResponse }
     * 
     */
    public EliminarEmpleoResponse createEliminarEmpleoResponse() {
        return new EliminarEmpleoResponse();
    }

    /**
     * Create an instance of {@link ConsultarRefenciasPersonales }
     * 
     */
    public ConsultarRefenciasPersonales createConsultarRefenciasPersonales() {
        return new ConsultarRefenciasPersonales();
    }

    /**
     * Create an instance of {@link ConsultarRefenciasPersonalesResponse }
     * 
     */
    public ConsultarRefenciasPersonalesResponse createConsultarRefenciasPersonalesResponse() {
        return new ConsultarRefenciasPersonalesResponse();
    }

    /**
     * Create an instance of {@link ActualizarRefenciasPersonales }
     * 
     */
    public ActualizarRefenciasPersonales createActualizarRefenciasPersonales() {
        return new ActualizarRefenciasPersonales();
    }

    /**
     * Create an instance of {@link ActualizarRefenciasPersonalesResponse }
     * 
     */
    public ActualizarRefenciasPersonalesResponse createActualizarRefenciasPersonalesResponse() {
        return new ActualizarRefenciasPersonalesResponse();
    }

    /**
     * Create an instance of {@link CrearClienteConsolidado }
     * 
     */
    public CrearClienteConsolidado createCrearClienteConsolidado() {
        return new CrearClienteConsolidado();
    }

    /**
     * Create an instance of {@link CrearClienteConsolidadoResponse }
     * 
     */
    public CrearClienteConsolidadoResponse createCrearClienteConsolidadoResponse() {
        return new CrearClienteConsolidadoResponse();
    }

    /**
     * Create an instance of {@link SincronizarDatosContactabilidad }
     * 
     */
    public SincronizarDatosContactabilidad createSincronizarDatosContactabilidad() {
        return new SincronizarDatosContactabilidad();
    }

    /**
     * Create an instance of {@link SincronizarDatosContactabilidadResponse }
     * 
     */
    public SincronizarDatosContactabilidadResponse createSincronizarDatosContactabilidadResponse() {
        return new SincronizarDatosContactabilidadResponse();
    }

    /**
     * Create an instance of {@link InformacionFinancieraClientes }
     * 
     */
    public InformacionFinancieraClientes createInformacionFinancieraClientes() {
        return new InformacionFinancieraClientes();
    }

    /**
     * Create an instance of {@link InformacionFinancieraClientesResponse }
     * 
     */
    public InformacionFinancieraClientesResponse createInformacionFinancieraClientesResponse() {
        return new InformacionFinancieraClientesResponse();
    }

    /**
     * Create an instance of {@link ActualizarDatosContacto }
     * 
     */
    public ActualizarDatosContacto createActualizarDatosContacto() {
        return new ActualizarDatosContacto();
    }

    /**
     * Create an instance of {@link ActualizarDatosContactoResponse }
     * 
     */
    public ActualizarDatosContactoResponse createActualizarDatosContactoResponse() {
        return new ActualizarDatosContactoResponse();
    }

    /**
     * Create an instance of {@link GuardarDatosEspecificosCliente }
     * 
     */
    public GuardarDatosEspecificosCliente createGuardarDatosEspecificosCliente() {
        return new GuardarDatosEspecificosCliente();
    }

    /**
     * Create an instance of {@link GuardarDatosEspecificosClienteResponse }
     * 
     */
    public GuardarDatosEspecificosClienteResponse createGuardarDatosEspecificosClienteResponse() {
        return new GuardarDatosEspecificosClienteResponse();
    }

    /**
     * Create an instance of {@link CrearClienteResumido }
     * 
     */
    public CrearClienteResumido createCrearClienteResumido() {
        return new CrearClienteResumido();
    }

    /**
     * Create an instance of {@link CrearClienteResumidoResponse }
     * 
     */
    public CrearClienteResumidoResponse createCrearClienteResumidoResponse() {
        return new CrearClienteResumidoResponse();
    }

    /**
     * Create an instance of {@link RegistrarClienteBancaEnLinea }
     * 
     */
    public RegistrarClienteBancaEnLinea createRegistrarClienteBancaEnLinea() {
        return new RegistrarClienteBancaEnLinea();
    }

    /**
     * Create an instance of {@link RegistrarClienteBancaEnLineaResponse }
     * 
     */
    public RegistrarClienteBancaEnLineaResponse createRegistrarClienteBancaEnLineaResponse() {
        return new RegistrarClienteBancaEnLineaResponse();
    }

    /**
     * Create an instance of {@link ConsultarFormulariosOrigenFondosPendientes }
     * 
     */
    public ConsultarFormulariosOrigenFondosPendientes createConsultarFormulariosOrigenFondosPendientes() {
        return new ConsultarFormulariosOrigenFondosPendientes();
    }

    /**
     * Create an instance of {@link ConsultarFormulariosOrigenFondosPendientesResponse }
     * 
     */
    public ConsultarFormulariosOrigenFondosPendientesResponse createConsultarFormulariosOrigenFondosPendientesResponse() {
        return new ConsultarFormulariosOrigenFondosPendientesResponse();
    }

    /**
     * Create an instance of {@link ActualizarFormularioOrigenFondos }
     * 
     */
    public ActualizarFormularioOrigenFondos createActualizarFormularioOrigenFondos() {
        return new ActualizarFormularioOrigenFondos();
    }

    /**
     * Create an instance of {@link ActualizarFormularioOrigenFondosResponse }
     * 
     */
    public ActualizarFormularioOrigenFondosResponse createActualizarFormularioOrigenFondosResponse() {
        return new ActualizarFormularioOrigenFondosResponse();
    }

    /**
     * Create an instance of {@link ConsultarEstadoSituacion }
     * 
     */
    public ConsultarEstadoSituacion createConsultarEstadoSituacion() {
        return new ConsultarEstadoSituacion();
    }

    /**
     * Create an instance of {@link ConsultarEstadoSituacionResponse }
     * 
     */
    public ConsultarEstadoSituacionResponse createConsultarEstadoSituacionResponse() {
        return new ConsultarEstadoSituacionResponse();
    }

    /**
     * Create an instance of {@link CrearActivo }
     * 
     */
    public CrearActivo createCrearActivo() {
        return new CrearActivo();
    }

    /**
     * Create an instance of {@link CrearActivoResponse }
     * 
     */
    public CrearActivoResponse createCrearActivoResponse() {
        return new CrearActivoResponse();
    }

    /**
     * Create an instance of {@link ActualizarActivo }
     * 
     */
    public ActualizarActivo createActualizarActivo() {
        return new ActualizarActivo();
    }

    /**
     * Create an instance of {@link ActualizarActivoResponse }
     * 
     */
    public ActualizarActivoResponse createActualizarActivoResponse() {
        return new ActualizarActivoResponse();
    }

    /**
     * Create an instance of {@link EliminarActivo }
     * 
     */
    public EliminarActivo createEliminarActivo() {
        return new EliminarActivo();
    }

    /**
     * Create an instance of {@link EliminarActivoResponse }
     * 
     */
    public EliminarActivoResponse createEliminarActivoResponse() {
        return new EliminarActivoResponse();
    }

    /**
     * Create an instance of {@link GuardarRubrosEmpleo }
     * 
     */
    public GuardarRubrosEmpleo createGuardarRubrosEmpleo() {
        return new GuardarRubrosEmpleo();
    }

    /**
     * Create an instance of {@link GuardarRubrosEmpleoResponse }
     * 
     */
    public GuardarRubrosEmpleoResponse createGuardarRubrosEmpleoResponse() {
        return new GuardarRubrosEmpleoResponse();
    }

    /**
     * Create an instance of {@link GuardarInformacionMicroempresa }
     * 
     */
    public GuardarInformacionMicroempresa createGuardarInformacionMicroempresa() {
        return new GuardarInformacionMicroempresa();
    }

    /**
     * Create an instance of {@link GuardarInformacionMicroempresaResponse }
     * 
     */
    public GuardarInformacionMicroempresaResponse createGuardarInformacionMicroempresaResponse() {
        return new GuardarInformacionMicroempresaResponse();
    }

    /**
     * Create an instance of {@link GuardarPasivoEvaluacion }
     * 
     */
    public GuardarPasivoEvaluacion createGuardarPasivoEvaluacion() {
        return new GuardarPasivoEvaluacion();
    }

    /**
     * Create an instance of {@link GuardarPasivoEvaluacionResponse }
     * 
     */
    public GuardarPasivoEvaluacionResponse createGuardarPasivoEvaluacionResponse() {
        return new GuardarPasivoEvaluacionResponse();
    }

    /**
     * Create an instance of {@link ActualizarPasivosDesdeBuro }
     * 
     */
    public ActualizarPasivosDesdeBuro createActualizarPasivosDesdeBuro() {
        return new ActualizarPasivosDesdeBuro();
    }

    /**
     * Create an instance of {@link ActualizarPasivosDesdeBuroResponse }
     * 
     */
    public ActualizarPasivosDesdeBuroResponse createActualizarPasivosDesdeBuroResponse() {
        return new ActualizarPasivosDesdeBuroResponse();
    }

    /**
     * Create an instance of {@link CrearClienteProspecto }
     * 
     */
    public CrearClienteProspecto createCrearClienteProspecto() {
        return new CrearClienteProspecto();
    }

    /**
     * Create an instance of {@link CrearClienteProspectoResponse }
     * 
     */
    public CrearClienteProspectoResponse createCrearClienteProspectoResponse() {
        return new CrearClienteProspectoResponse();
    }

    /**
     * Create an instance of {@link ValidarBaseImpedidos }
     * 
     */
    public ValidarBaseImpedidos createValidarBaseImpedidos() {
        return new ValidarBaseImpedidos();
    }

    /**
     * Create an instance of {@link ValidarBaseImpedidosResponse }
     * 
     */
    public ValidarBaseImpedidosResponse createValidarBaseImpedidosResponse() {
        return new ValidarBaseImpedidosResponse();
    }

    /**
     * Create an instance of {@link ActualizarClienteDefinitivo }
     * 
     */
    public ActualizarClienteDefinitivo createActualizarClienteDefinitivo() {
        return new ActualizarClienteDefinitivo();
    }

    /**
     * Create an instance of {@link ActualizarClienteDefinitivoResponse }
     * 
     */
    public ActualizarClienteDefinitivoResponse createActualizarClienteDefinitivoResponse() {
        return new ActualizarClienteDefinitivoResponse();
    }

    /**
     * Create an instance of {@link ActualizarRelacionCliente }
     * 
     */
    public ActualizarRelacionCliente createActualizarRelacionCliente() {
        return new ActualizarRelacionCliente();
    }

    /**
     * Create an instance of {@link ActualizarRelacionClienteResponse }
     * 
     */
    public ActualizarRelacionClienteResponse createActualizarRelacionClienteResponse() {
        return new ActualizarRelacionClienteResponse();
    }

    /**
     * Create an instance of {@link CrearNuevoCliente }
     * 
     */
    public CrearNuevoCliente createCrearNuevoCliente() {
        return new CrearNuevoCliente();
    }

    /**
     * Create an instance of {@link CrearNuevoClienteResponse }
     * 
     */
    public CrearNuevoClienteResponse createCrearNuevoClienteResponse() {
        return new CrearNuevoClienteResponse();
    }

    /**
     * Create an instance of {@link GenerarCertificadoRelacionesComerciales }
     * 
     */
    public GenerarCertificadoRelacionesComerciales createGenerarCertificadoRelacionesComerciales() {
        return new GenerarCertificadoRelacionesComerciales();
    }

    /**
     * Create an instance of {@link GenerarCertificadoRelacionesComercialesResponse }
     * 
     */
    public GenerarCertificadoRelacionesComercialesResponse createGenerarCertificadoRelacionesComercialesResponse() {
        return new GenerarCertificadoRelacionesComercialesResponse();
    }

    /**
     * Create an instance of {@link ValidarCertificadoRelacionesComerciales }
     * 
     */
    public ValidarCertificadoRelacionesComerciales createValidarCertificadoRelacionesComerciales() {
        return new ValidarCertificadoRelacionesComerciales();
    }

    /**
     * Create an instance of {@link ValidarCertificadoRelacionesComercialesResponse }
     * 
     */
    public ValidarCertificadoRelacionesComercialesResponse createValidarCertificadoRelacionesComercialesResponse() {
        return new ValidarCertificadoRelacionesComercialesResponse();
    }

    /**
     * Create an instance of {@link ConsultarFuncionario }
     * 
     */
    public ConsultarFuncionario createConsultarFuncionario() {
        return new ConsultarFuncionario();
    }

    /**
     * Create an instance of {@link ConsultarFuncionarioResponse }
     * 
     */
    public ConsultarFuncionarioResponse createConsultarFuncionarioResponse() {
        return new ConsultarFuncionarioResponse();
    }

    /**
     * Create an instance of {@link ActualizarFuncionario }
     * 
     */
    public ActualizarFuncionario createActualizarFuncionario() {
        return new ActualizarFuncionario();
    }

    /**
     * Create an instance of {@link ActualizarFuncionarioResponse }
     * 
     */
    public ActualizarFuncionarioResponse createActualizarFuncionarioResponse() {
        return new ActualizarFuncionarioResponse();
    }

    /**
     * Create an instance of {@link ConsultarInformaci�nVinculado }
     * 
     */
    public ConsultarInformaciónVinculado createConsultarInformaciónVinculado() {
        return new ConsultarInformaciónVinculado();
    }

    /**
     * Create an instance of {@link ConsultarInformaci�nVinculadoResponse }
     * 
     */
    public ConsultarInformaciónVinculadoResponse createConsultarInformaciónVinculadoResponse() {
        return new ConsultarInformaciónVinculadoResponse();
    }

    /**
     * Create an instance of {@link ActualizarInformaci�nVinculado }
     * 
     */
    public ActualizarInformaciónVinculado createActualizarInformaciónVinculado() {
        return new ActualizarInformaciónVinculado();
    }

    /**
     * Create an instance of {@link ActualizarInformaci�nVinculadoResponse }
     * 
     */
    public ActualizarInformaciónVinculadoResponse createActualizarInformaciónVinculadoResponse() {
        return new ActualizarInformaciónVinculadoResponse();
    }

    /**
     * Create an instance of {@link ConsultarRelacionesClientePeps }
     * 
     */
    public ConsultarRelacionesClientePeps createConsultarRelacionesClientePeps() {
        return new ConsultarRelacionesClientePeps();
    }

    /**
     * Create an instance of {@link ConsultarRelacionesClientePepsResponse }
     * 
     */
    public ConsultarRelacionesClientePepsResponse createConsultarRelacionesClientePepsResponse() {
        return new ConsultarRelacionesClientePepsResponse();
    }

    /**
     * Create an instance of {@link RegistrarRelacion }
     * 
     */
    public RegistrarRelacion createRegistrarRelacion() {
        return new RegistrarRelacion();
    }

    /**
     * Create an instance of {@link RegistrarRelacionResponse }
     * 
     */
    public RegistrarRelacionResponse createRegistrarRelacionResponse() {
        return new RegistrarRelacionResponse();
    }

    /**
     * Create an instance of {@link ActualizarRelacion }
     * 
     */
    public ActualizarRelacion createActualizarRelacion() {
        return new ActualizarRelacion();
    }

    /**
     * Create an instance of {@link ActualizarRelacionResponse }
     * 
     */
    public ActualizarRelacionResponse createActualizarRelacionResponse() {
        return new ActualizarRelacionResponse();
    }

    /**
     * Create an instance of {@link EliminarRelacion }
     * 
     */
    public EliminarRelacion createEliminarRelacion() {
        return new EliminarRelacion();
    }

    /**
     * Create an instance of {@link EliminarRelacionResponse }
     * 
     */
    public EliminarRelacionResponse createEliminarRelacionResponse() {
        return new EliminarRelacionResponse();
    }

    /**
     * Create an instance of {@link ConsultarParticipacionAccionariaYAdministradoresPeps }
     * 
     */
    public ConsultarParticipacionAccionariaYAdministradoresPeps createConsultarParticipacionAccionariaYAdministradoresPeps() {
        return new ConsultarParticipacionAccionariaYAdministradoresPeps();
    }

    /**
     * Create an instance of {@link ConsultarParticipacionAccionariaYAdministradoresPepsResponse }
     * 
     */
    public ConsultarParticipacionAccionariaYAdministradoresPepsResponse createConsultarParticipacionAccionariaYAdministradoresPepsResponse() {
        return new ConsultarParticipacionAccionariaYAdministradoresPepsResponse();
    }

    /**
     * Create an instance of {@link RegistrarAccionistaAdministrador }
     * 
     */
    public RegistrarAccionistaAdministrador createRegistrarAccionistaAdministrador() {
        return new RegistrarAccionistaAdministrador();
    }

    /**
     * Create an instance of {@link RegistrarAccionistaAdministradorResponse }
     * 
     */
    public RegistrarAccionistaAdministradorResponse createRegistrarAccionistaAdministradorResponse() {
        return new RegistrarAccionistaAdministradorResponse();
    }

    /**
     * Create an instance of {@link ActualizarAccionistaAdministrador }
     * 
     */
    public ActualizarAccionistaAdministrador createActualizarAccionistaAdministrador() {
        return new ActualizarAccionistaAdministrador();
    }

    /**
     * Create an instance of {@link ActualizarAccionistaAdministradorResponse }
     * 
     */
    public ActualizarAccionistaAdministradorResponse createActualizarAccionistaAdministradorResponse() {
        return new ActualizarAccionistaAdministradorResponse();
    }

    /**
     * Create an instance of {@link EliminarAccionistaAdministrador }
     * 
     */
    public EliminarAccionistaAdministrador createEliminarAccionistaAdministrador() {
        return new EliminarAccionistaAdministrador();
    }

    /**
     * Create an instance of {@link EliminarAccionistaAdministradorResponse }
     * 
     */
    public EliminarAccionistaAdministradorResponse createEliminarAccionistaAdministradorResponse() {
        return new EliminarAccionistaAdministradorResponse();
    }

    /**
     * Create an instance of {@link GenerarFormularioRegistroRelacionadosPep }
     * 
     */
    public GenerarFormularioRegistroRelacionadosPep createGenerarFormularioRegistroRelacionadosPep() {
        return new GenerarFormularioRegistroRelacionadosPep();
    }

    /**
     * Create an instance of {@link GenerarFormularioRegistroRelacionadosPepResponse }
     * 
     */
    public GenerarFormularioRegistroRelacionadosPepResponse createGenerarFormularioRegistroRelacionadosPepResponse() {
        return new GenerarFormularioRegistroRelacionadosPepResponse();
    }

    /**
     * Create an instance of {@link IniciarFlujoAprobacionRelacionadosPep }
     * 
     */
    public IniciarFlujoAprobacionRelacionadosPep createIniciarFlujoAprobacionRelacionadosPep() {
        return new IniciarFlujoAprobacionRelacionadosPep();
    }

    /**
     * Create an instance of {@link IniciarFlujoAprobacionRelacionadosPepResponse }
     * 
     */
    public IniciarFlujoAprobacionRelacionadosPepResponse createIniciarFlujoAprobacionRelacionadosPepResponse() {
        return new IniciarFlujoAprobacionRelacionadosPepResponse();
    }

    /**
     * Create an instance of {@link ValidarAprobacionFlujoRelacionadosPep }
     * 
     */
    public ValidarAprobacionFlujoRelacionadosPep createValidarAprobacionFlujoRelacionadosPep() {
        return new ValidarAprobacionFlujoRelacionadosPep();
    }

    /**
     * Create an instance of {@link ValidarAprobacionFlujoRelacionadosPepResponse }
     * 
     */
    public ValidarAprobacionFlujoRelacionadosPepResponse createValidarAprobacionFlujoRelacionadosPepResponse() {
        return new ValidarAprobacionFlujoRelacionadosPepResponse();
    }

    /**
     * Create an instance of {@link ValidarAprobacionMalasReferencias }
     * 
     */
    public ValidarAprobacionMalasReferencias createValidarAprobacionMalasReferencias() {
        return new ValidarAprobacionMalasReferencias();
    }

    /**
     * Create an instance of {@link ValidarAprobacionMalasReferenciasResponse }
     * 
     */
    public ValidarAprobacionMalasReferenciasResponse createValidarAprobacionMalasReferenciasResponse() {
        return new ValidarAprobacionMalasReferenciasResponse();
    }

    /**
     * Create an instance of {@link RegistrarAutorizacionUsoDatosPersonales }
     * 
     */
    public RegistrarAutorizacionUsoDatosPersonales createRegistrarAutorizacionUsoDatosPersonales() {
        return new RegistrarAutorizacionUsoDatosPersonales();
    }

    /**
     * Create an instance of {@link RegistrarAutorizacionUsoDatosPersonalesResponse }
     * 
     */
    public RegistrarAutorizacionUsoDatosPersonalesResponse createRegistrarAutorizacionUsoDatosPersonalesResponse() {
        return new RegistrarAutorizacionUsoDatosPersonalesResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultasClientes", scope = ConsultarClientePorIdentificacion.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarClientePorIdentificacionMeConsultasClientes(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarClientePorIdentificacionMeConsultasClientes_QNAME, MEIdentificacionCliente.class, ConsultarClientePorIdentificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSClientes }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClientePorIdentificacionResult", scope = ConsultarClientePorIdentificacionResponse.class)
    public JAXBElement<MSClientes> createConsultarClientePorIdentificacionResponseConsultarClientePorIdentificacionResult(MSClientes value) {
        return new JAXBElement<MSClientes>(_ConsultarClientePorIdentificacionResponseConsultarClientePorIdentificacionResult_QNAME, MSClientes.class, ConsultarClientePorIdentificacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacionClientes", scope = CrearCliente.class)
    public JAXBElement<MECreacionCliente> createCrearClienteMeCreacionClientes(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_CrearClienteMeCreacionClientes_QNAME, MECreacionCliente.class, CrearCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearClienteResult", scope = CrearClienteResponse.class)
    public JAXBElement<MSCreacionCliente> createCrearClienteResponseCrearClienteResult(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_CrearClienteResponseCrearClienteResult_QNAME, MSCreacionCliente.class, CrearClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarDatosCliente.class)
    public JAXBElement<MEConsultasCliente> createConsultarDatosClienteMeConsulta(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ConsultarDatosClienteMeConsulta_QNAME, MEConsultasCliente.class, ConsultarDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDatosClienteResult", scope = ConsultarDatosClienteResponse.class)
    public JAXBElement<MSConsultasCliente> createConsultarDatosClienteResponseConsultarDatosClienteResult(MSConsultasCliente value) {
        return new JAXBElement<MSConsultasCliente>(_ConsultarDatosClienteResponseConsultarDatosClienteResult_QNAME, MSConsultasCliente.class, ConsultarDatosClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarDireccionesCliente.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarDireccionesClienteMeConsulta(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacionCliente.class, ConsultarDireccionesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaDireccionesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaDireccionesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarDireccionesClienteResult", scope = ConsultarDireccionesClienteResponse.class)
    public JAXBElement<MSConsultaDireccionesCliente> createConsultarDireccionesClienteResponseConsultarDireccionesClienteResult(MSConsultaDireccionesCliente value) {
        return new JAXBElement<MSConsultaDireccionesCliente>(_ConsultarDireccionesClienteResponseConsultarDireccionesClienteResult_QNAME, MSConsultaDireccionesCliente.class, ConsultarDireccionesClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarRepresentanteLegal.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarRepresentanteLegalMeConsulta(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacionCliente.class, ConsultarRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaRepresentanteLegal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaRepresentanteLegal }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarRepresentanteLegalResult", scope = ConsultarRepresentanteLegalResponse.class)
    public JAXBElement<MSConsultaRepresentanteLegal> createConsultarRepresentanteLegalResponseConsultarRepresentanteLegalResult(MSConsultaRepresentanteLegal value) {
        return new JAXBElement<MSConsultaRepresentanteLegal>(_ConsultarRepresentanteLegalResponseConsultarRepresentanteLegalResult_QNAME, MSConsultaRepresentanteLegal.class, ConsultarRepresentanteLegalResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacion", scope = CrearDireccionCliente.class)
    public JAXBElement<MEDireccion> createCrearDireccionClienteMeCreacion(MEDireccion value) {
        return new JAXBElement<MEDireccion>(_CrearDireccionClienteMeCreacion_QNAME, MEDireccion.class, CrearDireccionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearDireccionClienteResult", scope = CrearDireccionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createCrearDireccionClienteResponseCrearDireccionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CrearDireccionClienteResponseCrearDireccionClienteResult_QNAME, MensajeSalidaBase.class, CrearDireccionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActualizacion", scope = ActualizarDireccionCliente.class)
    public JAXBElement<MEDireccion> createActualizarDireccionClienteMeActualizacion(MEDireccion value) {
        return new JAXBElement<MEDireccion>(_ActualizarDireccionClienteMeActualizacion_QNAME, MEDireccion.class, ActualizarDireccionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarDireccionClienteResult", scope = ActualizarDireccionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarDireccionClienteResponseActualizarDireccionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarDireccionClienteResponseActualizarDireccionClienteResult_QNAME, MensajeSalidaBase.class, ActualizarDireccionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacion", scope = CrearTelefonoCliente.class)
    public JAXBElement<METelefono> createCrearTelefonoClienteMeCreacion(METelefono value) {
        return new JAXBElement<METelefono>(_CrearDireccionClienteMeCreacion_QNAME, METelefono.class, CrearTelefonoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearTelefonoClienteResult", scope = CrearTelefonoClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createCrearTelefonoClienteResponseCrearTelefonoClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CrearTelefonoClienteResponseCrearTelefonoClienteResult_QNAME, MensajeSalidaBase.class, CrearTelefonoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link METelefono }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacion", scope = ActualizarTelefonoCliente.class)
    public JAXBElement<METelefono> createActualizarTelefonoClienteMeCreacion(METelefono value) {
        return new JAXBElement<METelefono>(_CrearDireccionClienteMeCreacion_QNAME, METelefono.class, ActualizarTelefonoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarTelefonoClienteResult", scope = ActualizarTelefonoClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarTelefonoClienteResponseActualizarTelefonoClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarTelefonoClienteResponseActualizarTelefonoClienteResult_QNAME, MensajeSalidaBase.class, ActualizarTelefonoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaCelular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaCelular }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultaDatosCelular.class)
    public JAXBElement<MEConsultaCelular> createConsultaDatosCelularMeConsulta(MEConsultaCelular value) {
        return new JAXBElement<MEConsultaCelular>(_ConsultarDatosClienteMeConsulta_QNAME, MEConsultaCelular.class, ConsultaDatosCelular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultaDatosCelularResult", scope = ConsultaDatosCelularResponse.class)
    public JAXBElement<MSConsultaCelular> createConsultaDatosCelularResponseConsultaDatosCelularResult(MSConsultaCelular value) {
        return new JAXBElement<MSConsultaCelular>(_ConsultaDatosCelularResponseConsultaDatosCelularResult_QNAME, MSConsultaCelular.class, ConsultaDatosCelularResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaClientesCondiciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaClientesCondiciones }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarClientesCondiciones.class)
    public JAXBElement<MEConsultaClientesCondiciones> createConsultarClientesCondicionesMeConsulta(MEConsultaClientesCondiciones value) {
        return new JAXBElement<MEConsultaClientesCondiciones>(_ConsultarDatosClienteMeConsulta_QNAME, MEConsultaClientesCondiciones.class, ConsultarClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaClientesCondiciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaClientesCondiciones }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarClientesCondicionesResult", scope = ConsultarClientesCondicionesResponse.class)
    public JAXBElement<MSConsultaClientesCondiciones> createConsultarClientesCondicionesResponseConsultarClientesCondicionesResult(MSConsultaClientesCondiciones value) {
        return new JAXBElement<MSConsultaClientesCondiciones>(_ConsultarClientesCondicionesResponseConsultarClientesCondicionesResult_QNAME, MSConsultaClientesCondiciones.class, ConsultarClientesCondicionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosCliente", scope = ActualizarFechaNacimientoCliente.class)
    public JAXBElement<MeDatosCliente> createActualizarFechaNacimientoClienteMeDatosCliente(MeDatosCliente value) {
        return new JAXBElement<MeDatosCliente>(_ActualizarFechaNacimientoClienteMeDatosCliente_QNAME, MeDatosCliente.class, ActualizarFechaNacimientoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarFechaNacimientoClienteResult", scope = ActualizarFechaNacimientoClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarFechaNacimientoClienteResponseActualizarFechaNacimientoClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarFechaNacimientoClienteResponseActualizarFechaNacimientoClienteResult_QNAME, MensajeSalidaBase.class, ActualizarFechaNacimientoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosCliente", scope = ActualizarEmailCliente.class)
    public JAXBElement<MeDatosCliente> createActualizarEmailClienteMeDatosCliente(MeDatosCliente value) {
        return new JAXBElement<MeDatosCliente>(_ActualizarFechaNacimientoClienteMeDatosCliente_QNAME, MeDatosCliente.class, ActualizarEmailCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarEmailClienteResult", scope = ActualizarEmailClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarEmailClienteResponseActualizarEmailClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarEmailClienteResponseActualizarEmailClienteResult_QNAME, MensajeSalidaBase.class, ActualizarEmailClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meDatosCliente", scope = ActualizarInformacionCliente.class)
    public JAXBElement<MeDatosCliente> createActualizarInformacionClienteMeDatosCliente(MeDatosCliente value) {
        return new JAXBElement<MeDatosCliente>(_ActualizarFechaNacimientoClienteMeDatosCliente_QNAME, MeDatosCliente.class, ActualizarInformacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarInformacionClienteResult", scope = ActualizarInformacionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarInformacionClienteResponseActualizarInformacionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarInformacionClienteResponseActualizarInformacionClienteResult_QNAME, MensajeSalidaBase.class, ActualizarInformacionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosCodigoSeguridad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosCodigoSeguridad }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = EnviarNotificacionCodigoSeguridad.class)
    public JAXBElement<MEDatosCodigoSeguridad> createEnviarNotificacionCodigoSeguridadMeConsulta(MEDatosCodigoSeguridad value) {
        return new JAXBElement<MEDatosCodigoSeguridad>(_ConsultarDatosClienteMeConsulta_QNAME, MEDatosCodigoSeguridad.class, EnviarNotificacionCodigoSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EnviarNotificacionCodigoSeguridadResult", scope = EnviarNotificacionCodigoSeguridadResponse.class)
    public JAXBElement<MensajeSalidaBase> createEnviarNotificacionCodigoSeguridadResponseEnviarNotificacionCodigoSeguridadResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EnviarNotificacionCodigoSeguridadResponseEnviarNotificacionCodigoSeguridadResult_QNAME, MensajeSalidaBase.class, EnviarNotificacionCodigoSeguridadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarEmpleos.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarEmpleosMeConsulta(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacionCliente.class, ConsultarEmpleos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarEmpleosResult", scope = ConsultarEmpleosResponse.class)
    public JAXBElement<MSConsultaEmpleo> createConsultarEmpleosResponseConsultarEmpleosResult(MSConsultaEmpleo value) {
        return new JAXBElement<MSConsultaEmpleo>(_ConsultarEmpleosResponseConsultarEmpleosResult_QNAME, MSConsultaEmpleo.class, ConsultarEmpleosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEmpleo", scope = CrearEmpleo.class)
    public JAXBElement<MEEmpleo> createCrearEmpleoMeEmpleo(MEEmpleo value) {
        return new JAXBElement<MEEmpleo>(_CrearEmpleoMeEmpleo_QNAME, MEEmpleo.class, CrearEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearEmpleoResult", scope = CrearEmpleoResponse.class)
    public JAXBElement<MensajeSalidaBase> createCrearEmpleoResponseCrearEmpleoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CrearEmpleoResponseCrearEmpleoResult_QNAME, MensajeSalidaBase.class, CrearEmpleoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEmpleo", scope = ActualizarEmpleo.class)
    public JAXBElement<MEEmpleo> createActualizarEmpleoMeEmpleo(MEEmpleo value) {
        return new JAXBElement<MEEmpleo>(_CrearEmpleoMeEmpleo_QNAME, MEEmpleo.class, ActualizarEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarEmpleoResult", scope = ActualizarEmpleoResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarEmpleoResponseActualizarEmpleoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarEmpleoResponseActualizarEmpleoResult_QNAME, MensajeSalidaBase.class, ActualizarEmpleoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEmpleo", scope = EliminarEmpleo.class)
    public JAXBElement<MEEmpleo> createEliminarEmpleoMeEmpleo(MEEmpleo value) {
        return new JAXBElement<MEEmpleo>(_CrearEmpleoMeEmpleo_QNAME, MEEmpleo.class, EliminarEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EliminarEmpleoResult", scope = EliminarEmpleoResponse.class)
    public JAXBElement<MensajeSalidaBase> createEliminarEmpleoResponseEliminarEmpleoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EliminarEmpleoResponseEliminarEmpleoResult_QNAME, MensajeSalidaBase.class, EliminarEmpleoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarRefenciasPersonales.class)
    public JAXBElement<MEIdentificacionCliente> createConsultarRefenciasPersonalesMeConsulta(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacionCliente.class, ConsultarRefenciasPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaReferenciasPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaReferenciasPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarRefenciasPersonalesResult", scope = ConsultarRefenciasPersonalesResponse.class)
    public JAXBElement<MSConsultaReferenciasPersonales> createConsultarRefenciasPersonalesResponseConsultarRefenciasPersonalesResult(MSConsultaReferenciasPersonales value) {
        return new JAXBElement<MSConsultaReferenciasPersonales>(_ConsultarRefenciasPersonalesResponseConsultarRefenciasPersonalesResult_QNAME, MSConsultaReferenciasPersonales.class, ConsultarRefenciasPersonalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReferenciasPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReferenciasPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meReferenciaPersonal", scope = ActualizarRefenciasPersonales.class)
    public JAXBElement<MEReferenciasPersonales> createActualizarRefenciasPersonalesMeReferenciaPersonal(MEReferenciasPersonales value) {
        return new JAXBElement<MEReferenciasPersonales>(_ActualizarRefenciasPersonalesMeReferenciaPersonal_QNAME, MEReferenciasPersonales.class, ActualizarRefenciasPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarRefenciasPersonalesResult", scope = ActualizarRefenciasPersonalesResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarRefenciasPersonalesResponseActualizarRefenciasPersonalesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarRefenciasPersonalesResponseActualizarRefenciasPersonalesResult_QNAME, MensajeSalidaBase.class, ActualizarRefenciasPersonalesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacionClientes", scope = CrearClienteConsolidado.class)
    public JAXBElement<MECreacionCliente> createCrearClienteConsolidadoMeCreacionClientes(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_CrearClienteMeCreacionClientes_QNAME, MECreacionCliente.class, CrearClienteConsolidado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearClienteConsolidadoResult", scope = CrearClienteConsolidadoResponse.class)
    public JAXBElement<MSCreacionCliente> createCrearClienteConsolidadoResponseCrearClienteConsolidadoResult(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_CrearClienteConsolidadoResponseCrearClienteConsolidadoResult_QNAME, MSCreacionCliente.class, CrearClienteConsolidadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeEntradaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meBase", scope = SincronizarDatosContactabilidad.class)
    public JAXBElement<MensajeEntradaBase> createSincronizarDatosContactabilidadMeBase(MensajeEntradaBase value) {
        return new JAXBElement<MensajeEntradaBase>(_SincronizarDatosContactabilidadMeBase_QNAME, MensajeEntradaBase.class, SincronizarDatosContactabilidad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "SincronizarDatosContactabilidadResult", scope = SincronizarDatosContactabilidadResponse.class)
    public JAXBElement<MensajeSalidaBase> createSincronizarDatosContactabilidadResponseSincronizarDatosContactabilidadResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_SincronizarDatosContactabilidadResponseSincronizarDatosContactabilidadResult_QNAME, MensajeSalidaBase.class, SincronizarDatosContactabilidadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaCliente", scope = InformacionFinancieraClientes.class)
    public JAXBElement<MEInformacionFinancieraCliente> createInformacionFinancieraClientesMeConsultaCliente(MEInformacionFinancieraCliente value) {
        return new JAXBElement<MEInformacionFinancieraCliente>(_InformacionFinancieraClientesMeConsultaCliente_QNAME, MEInformacionFinancieraCliente.class, InformacionFinancieraClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "InformacionFinancieraClientesResult", scope = InformacionFinancieraClientesResponse.class)
    public JAXBElement<MSConsultaClientes> createInformacionFinancieraClientesResponseInformacionFinancieraClientesResult(MSConsultaClientes value) {
        return new JAXBElement<MSConsultaClientes>(_InformacionFinancieraClientesResponseInformacionFinancieraClientesResult_QNAME, MSConsultaClientes.class, InformacionFinancieraClientesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosContacto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosContacto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = ActualizarDatosContacto.class)
    public JAXBElement<MEDatosContacto> createActualizarDatosContactoMeEntrada(MEDatosContacto value) {
        return new JAXBElement<MEDatosContacto>(_ActualizarDatosContactoMeEntrada_QNAME, MEDatosContacto.class, ActualizarDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarDatosContactoResult", scope = ActualizarDatosContactoResponse.class)
    public JAXBElement<MSDatosContacto> createActualizarDatosContactoResponseActualizarDatosContactoResult(MSDatosContacto value) {
        return new JAXBElement<MSDatosContacto>(_ActualizarDatosContactoResponseActualizarDatosContactoResult_QNAME, MSDatosContacto.class, ActualizarDatosContactoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosEspecificosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosEspecificosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = GuardarDatosEspecificosCliente.class)
    public JAXBElement<MEDatosEspecificosCliente> createGuardarDatosEspecificosClienteMeEntrada(MEDatosEspecificosCliente value) {
        return new JAXBElement<MEDatosEspecificosCliente>(_ActualizarDatosContactoMeEntrada_QNAME, MEDatosEspecificosCliente.class, GuardarDatosEspecificosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarDatosEspecificosClienteResult", scope = GuardarDatosEspecificosClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarDatosEspecificosClienteResponseGuardarDatosEspecificosClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarDatosEspecificosClienteResponseGuardarDatosEspecificosClienteResult_QNAME, MensajeSalidaBase.class, GuardarDatosEspecificosClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionClienteResumido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionClienteResumido }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacionClienteResumido", scope = CrearClienteResumido.class)
    public JAXBElement<MECreacionClienteResumido> createCrearClienteResumidoMeCreacionClienteResumido(MECreacionClienteResumido value) {
        return new JAXBElement<MECreacionClienteResumido>(_CrearClienteResumidoMeCreacionClienteResumido_QNAME, MECreacionClienteResumido.class, CrearClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearClienteResumidoResult", scope = CrearClienteResumidoResponse.class)
    public JAXBElement<MSCreacionCliente> createCrearClienteResumidoResponseCrearClienteResumidoResult(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_CrearClienteResumidoResponseCrearClienteResumidoResult_QNAME, MSCreacionCliente.class, CrearClienteResumidoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRegistro", scope = RegistrarClienteBancaEnLinea.class)
    public JAXBElement<MEIdentificacion> createRegistrarClienteBancaEnLineaMeRegistro(MEIdentificacion value) {
        return new JAXBElement<MEIdentificacion>(_RegistrarClienteBancaEnLineaMeRegistro_QNAME, MEIdentificacion.class, RegistrarClienteBancaEnLinea.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarClienteBancaEnLineaResult", scope = RegistrarClienteBancaEnLineaResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarClienteBancaEnLineaResponseRegistrarClienteBancaEnLineaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarClienteBancaEnLineaResponseRegistrarClienteBancaEnLineaResult_QNAME, MensajeSalidaBase.class, RegistrarClienteBancaEnLineaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarFormulariosOrigenFondosPendientes.class)
    public JAXBElement<MEIdentificacion> createConsultarFormulariosOrigenFondosPendientesMeConsulta(MEIdentificacion value) {
        return new JAXBElement<MEIdentificacion>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacion.class, ConsultarFormulariosOrigenFondosPendientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarFormulariosOrigenFondosPendientesResult", scope = ConsultarFormulariosOrigenFondosPendientesResponse.class)
    public JAXBElement<MSConsultaOrigenFondos> createConsultarFormulariosOrigenFondosPendientesResponseConsultarFormulariosOrigenFondosPendientesResult(MSConsultaOrigenFondos value) {
        return new JAXBElement<MSConsultaOrigenFondos>(_ConsultarFormulariosOrigenFondosPendientesResponseConsultarFormulariosOrigenFondosPendientesResult_QNAME, MSConsultaOrigenFondos.class, ConsultarFormulariosOrigenFondosPendientesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meFormulario", scope = ActualizarFormularioOrigenFondos.class)
    public JAXBElement<MEFormularioOrigenFondos> createActualizarFormularioOrigenFondosMeFormulario(MEFormularioOrigenFondos value) {
        return new JAXBElement<MEFormularioOrigenFondos>(_ActualizarFormularioOrigenFondosMeFormulario_QNAME, MEFormularioOrigenFondos.class, ActualizarFormularioOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarFormularioOrigenFondosResult", scope = ActualizarFormularioOrigenFondosResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarFormularioOrigenFondosResponseActualizarFormularioOrigenFondosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarFormularioOrigenFondosResponseActualizarFormularioOrigenFondosResult_QNAME, MensajeSalidaBase.class, ActualizarFormularioOrigenFondosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsulta", scope = ConsultarEstadoSituacion.class)
    public JAXBElement<MEIdentificacion> createConsultarEstadoSituacionMeConsulta(MEIdentificacion value) {
        return new JAXBElement<MEIdentificacion>(_ConsultarDatosClienteMeConsulta_QNAME, MEIdentificacion.class, ConsultarEstadoSituacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSInformacionFinanciera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSInformacionFinanciera }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarEstadoSituacionResult", scope = ConsultarEstadoSituacionResponse.class)
    public JAXBElement<MSInformacionFinanciera> createConsultarEstadoSituacionResponseConsultarEstadoSituacionResult(MSInformacionFinanciera value) {
        return new JAXBElement<MSInformacionFinanciera>(_ConsultarEstadoSituacionResponseConsultarEstadoSituacionResult_QNAME, MSInformacionFinanciera.class, ConsultarEstadoSituacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActivo", scope = CrearActivo.class)
    public JAXBElement<MEActivo> createCrearActivoMeActivo(MEActivo value) {
        return new JAXBElement<MEActivo>(_CrearActivoMeActivo_QNAME, MEActivo.class, CrearActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearActivoResult", scope = CrearActivoResponse.class)
    public JAXBElement<MensajeSalidaBase> createCrearActivoResponseCrearActivoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_CrearActivoResponseCrearActivoResult_QNAME, MensajeSalidaBase.class, CrearActivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActivo", scope = ActualizarActivo.class)
    public JAXBElement<MEActivo> createActualizarActivoMeActivo(MEActivo value) {
        return new JAXBElement<MEActivo>(_CrearActivoMeActivo_QNAME, MEActivo.class, ActualizarActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarActivoResult", scope = ActualizarActivoResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarActivoResponseActualizarActivoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarActivoResponseActualizarActivoResult_QNAME, MensajeSalidaBase.class, ActualizarActivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActivo", scope = EliminarActivo.class)
    public JAXBElement<MEActivo> createEliminarActivoMeActivo(MEActivo value) {
        return new JAXBElement<MEActivo>(_CrearActivoMeActivo_QNAME, MEActivo.class, EliminarActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EliminarActivoResult", scope = EliminarActivoResponse.class)
    public JAXBElement<MensajeSalidaBase> createEliminarActivoResponseEliminarActivoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EliminarActivoResponseEliminarActivoResult_QNAME, MensajeSalidaBase.class, EliminarActivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERubroEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERubroEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRubroEmpleo", scope = GuardarRubrosEmpleo.class)
    public JAXBElement<MERubroEmpleo> createGuardarRubrosEmpleoMeRubroEmpleo(MERubroEmpleo value) {
        return new JAXBElement<MERubroEmpleo>(_GuardarRubrosEmpleoMeRubroEmpleo_QNAME, MERubroEmpleo.class, GuardarRubrosEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarRubrosEmpleoResult", scope = GuardarRubrosEmpleoResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarRubrosEmpleoResponseGuardarRubrosEmpleoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarRubrosEmpleoResponseGuardarRubrosEmpleoResult_QNAME, MensajeSalidaBase.class, GuardarRubrosEmpleoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meInformacionMicroempresa", scope = GuardarInformacionMicroempresa.class)
    public JAXBElement<MEInformacionMicroempresa> createGuardarInformacionMicroempresaMeInformacionMicroempresa(MEInformacionMicroempresa value) {
        return new JAXBElement<MEInformacionMicroempresa>(_GuardarInformacionMicroempresaMeInformacionMicroempresa_QNAME, MEInformacionMicroempresa.class, GuardarInformacionMicroempresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarInformacionMicroempresaResult", scope = GuardarInformacionMicroempresaResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarInformacionMicroempresaResponseGuardarInformacionMicroempresaResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarInformacionMicroempresaResponseGuardarInformacionMicroempresaResult_QNAME, MensajeSalidaBase.class, GuardarInformacionMicroempresaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPasivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePasivo", scope = GuardarPasivoEvaluacion.class)
    public JAXBElement<MEPasivo> createGuardarPasivoEvaluacionMePasivo(MEPasivo value) {
        return new JAXBElement<MEPasivo>(_GuardarPasivoEvaluacionMePasivo_QNAME, MEPasivo.class, GuardarPasivoEvaluacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GuardarPasivoEvaluacionResult", scope = GuardarPasivoEvaluacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createGuardarPasivoEvaluacionResponseGuardarPasivoEvaluacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GuardarPasivoEvaluacionResponseGuardarPasivoEvaluacionResult_QNAME, MensajeSalidaBase.class, GuardarPasivoEvaluacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPasivos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPasivos }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "mePasivos", scope = ActualizarPasivosDesdeBuro.class)
    public JAXBElement<MEPasivos> createActualizarPasivosDesdeBuroMePasivos(MEPasivos value) {
        return new JAXBElement<MEPasivos>(_ActualizarPasivosDesdeBuroMePasivos_QNAME, MEPasivos.class, ActualizarPasivosDesdeBuro.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarPasivosDesdeBuroResult", scope = ActualizarPasivosDesdeBuroResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarPasivosDesdeBuroResponseActualizarPasivosDesdeBuroResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarPasivosDesdeBuroResponseActualizarPasivosDesdeBuroResult_QNAME, MensajeSalidaBase.class, ActualizarPasivosDesdeBuroResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacionClientes", scope = CrearClienteProspecto.class)
    public JAXBElement<MECreacionCliente> createCrearClienteProspectoMeCreacionClientes(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_CrearClienteMeCreacionClientes_QNAME, MECreacionCliente.class, CrearClienteProspecto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearClienteProspectoResult", scope = CrearClienteProspectoResponse.class)
    public JAXBElement<MSCreacionCliente> createCrearClienteProspectoResponseCrearClienteProspectoResult(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_CrearClienteProspectoResponseCrearClienteProspectoResult_QNAME, MSCreacionCliente.class, CrearClienteProspectoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meValidarBaseImpedidos", scope = ValidarBaseImpedidos.class)
    public JAXBElement<MEIdentificacionCliente> createValidarBaseImpedidosMeValidarBaseImpedidos(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ValidarBaseImpedidosMeValidarBaseImpedidos_QNAME, MEIdentificacionCliente.class, ValidarBaseImpedidos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarBaseImpedidosResult", scope = ValidarBaseImpedidosResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarBaseImpedidosResponseValidarBaseImpedidosResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarBaseImpedidosResponseValidarBaseImpedidosResult_QNAME, MensajeSalidaBase.class, ValidarBaseImpedidosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActualizacionCliente", scope = ActualizarClienteDefinitivo.class)
    public JAXBElement<MeDatosCliente> createActualizarClienteDefinitivoMeActualizacionCliente(MeDatosCliente value) {
        return new JAXBElement<MeDatosCliente>(_ActualizarClienteDefinitivoMeActualizacionCliente_QNAME, MeDatosCliente.class, ActualizarClienteDefinitivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarClienteDefinitivoResult", scope = ActualizarClienteDefinitivoResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarClienteDefinitivoResponseActualizarClienteDefinitivoResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarClienteDefinitivoResponseActualizarClienteDefinitivoResult_QNAME, MensajeSalidaBase.class, ActualizarClienteDefinitivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacion }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meActualizacionRelacion", scope = ActualizarRelacionCliente.class)
    public JAXBElement<MERelacion> createActualizarRelacionClienteMeActualizacionRelacion(MERelacion value) {
        return new JAXBElement<MERelacion>(_ActualizarRelacionClienteMeActualizacionRelacion_QNAME, MERelacion.class, ActualizarRelacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarRelacionClienteResult", scope = ActualizarRelacionClienteResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarRelacionClienteResponseActualizarRelacionClienteResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarRelacionClienteResponseActualizarRelacionClienteResult_QNAME, MensajeSalidaBase.class, ActualizarRelacionClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCreacionClientes", scope = CrearNuevoCliente.class)
    public JAXBElement<MECreacionCliente> createCrearNuevoClienteMeCreacionClientes(MECreacionCliente value) {
        return new JAXBElement<MECreacionCliente>(_CrearClienteMeCreacionClientes_QNAME, MECreacionCliente.class, CrearNuevoCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "CrearNuevoClienteResult", scope = CrearNuevoClienteResponse.class)
    public JAXBElement<MSCreacionCliente> createCrearNuevoClienteResponseCrearNuevoClienteResult(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_CrearNuevoClienteResponseCrearNuevoClienteResult_QNAME, MSCreacionCliente.class, CrearNuevoClienteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCertificado", scope = GenerarCertificadoRelacionesComerciales.class)
    public JAXBElement<MECertificadoRelacionesComerciales> createGenerarCertificadoRelacionesComercialesMeCertificado(MECertificadoRelacionesComerciales value) {
        return new JAXBElement<MECertificadoRelacionesComerciales>(_GenerarCertificadoRelacionesComercialesMeCertificado_QNAME, MECertificadoRelacionesComerciales.class, GenerarCertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarCertificadoRelacionesComercialesResult", scope = GenerarCertificadoRelacionesComercialesResponse.class)
    public JAXBElement<MensajeSalidaBase> createGenerarCertificadoRelacionesComercialesResponseGenerarCertificadoRelacionesComercialesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_GenerarCertificadoRelacionesComercialesResponseGenerarCertificadoRelacionesComercialesResult_QNAME, MensajeSalidaBase.class, GenerarCertificadoRelacionesComercialesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meCertificado", scope = ValidarCertificadoRelacionesComerciales.class)
    public JAXBElement<MECertificadoRelacionesComerciales> createValidarCertificadoRelacionesComercialesMeCertificado(MECertificadoRelacionesComerciales value) {
        return new JAXBElement<MECertificadoRelacionesComerciales>(_GenerarCertificadoRelacionesComercialesMeCertificado_QNAME, MECertificadoRelacionesComerciales.class, ValidarCertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarCertificadoRelacionesComercialesResult", scope = ValidarCertificadoRelacionesComercialesResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarCertificadoRelacionesComercialesResponseValidarCertificadoRelacionesComercialesResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarCertificadoRelacionesComercialesResponseValidarCertificadoRelacionesComercialesResult_QNAME, MensajeSalidaBase.class, ValidarCertificadoRelacionesComercialesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaFuncionario", scope = ConsultarFuncionario.class)
    public JAXBElement<MEConsultasCliente> createConsultarFuncionarioMeConsultaFuncionario(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ConsultarFuncionarioMeConsultaFuncionario_QNAME, MEConsultasCliente.class, ConsultarFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarFuncionarioResult", scope = ConsultarFuncionarioResponse.class)
    public JAXBElement<MSFuncionario> createConsultarFuncionarioResponseConsultarFuncionarioResult(MSFuncionario value) {
        return new JAXBElement<MSFuncionario>(_ConsultarFuncionarioResponseConsultarFuncionarioResult_QNAME, MSFuncionario.class, ConsultarFuncionarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meFuncionario", scope = ActualizarFuncionario.class)
    public JAXBElement<MEFuncionario> createActualizarFuncionarioMeFuncionario(MEFuncionario value) {
        return new JAXBElement<MEFuncionario>(_ActualizarFuncionarioMeFuncionario_QNAME, MEFuncionario.class, ActualizarFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarFuncionarioResult", scope = ActualizarFuncionarioResponse.class)
    public JAXBElement<MSFuncionario> createActualizarFuncionarioResponseActualizarFuncionarioResult(MSFuncionario value) {
        return new JAXBElement<MSFuncionario>(_ActualizarFuncionarioResponseActualizarFuncionarioResult_QNAME, MSFuncionario.class, ActualizarFuncionarioResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaVinculado", scope = ConsultarInformaciónVinculado.class)
    public JAXBElement<MEConsultasCliente> createConsultarInformaciónVinculadoMeConsultaVinculado(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ConsultarInformaciónVinculadoMeConsultaVinculado_QNAME, MEConsultasCliente.class, ConsultarInformaciónVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarInformaci\u00f3nVinculadoResult", scope = ConsultarInformaciónVinculadoResponse.class)
    public JAXBElement<MSVinculado> createConsultarInformaciónVinculadoResponseConsultarInformaciónVinculadoResult(MSVinculado value) {
        return new JAXBElement<MSVinculado>(_ConsultarInformaciónVinculadoResponseConsultarInformaciónVinculadoResult_QNAME, MSVinculado.class, ConsultarInformaciónVinculadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEVinculado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEVinculado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meVinculado", scope = ActualizarInformaciónVinculado.class)
    public JAXBElement<MEVinculado> createActualizarInformaciónVinculadoMeVinculado(MEVinculado value) {
        return new JAXBElement<MEVinculado>(_ActualizarInformaciónVinculadoMeVinculado_QNAME, MEVinculado.class, ActualizarInformaciónVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarInformaci\u00f3nVinculadoResult", scope = ActualizarInformaciónVinculadoResponse.class)
    public JAXBElement<MSVinculado> createActualizarInformaciónVinculadoResponseActualizarInformaciónVinculadoResult(MSVinculado value) {
        return new JAXBElement<MSVinculado>(_ActualizarInformaciónVinculadoResponseActualizarInformaciónVinculadoResult_QNAME, MSVinculado.class, ActualizarInformaciónVinculadoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaPep", scope = ConsultarRelacionesClientePeps.class)
    public JAXBElement<MEConsultasCliente> createConsultarRelacionesClientePepsMeConsultaPep(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ConsultarRelacionesClientePepsMeConsultaPep_QNAME, MEConsultasCliente.class, ConsultarRelacionesClientePeps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarRelacionesClientePepsResult", scope = ConsultarRelacionesClientePepsResponse.class)
    public JAXBElement<MSConsultaRelaciones> createConsultarRelacionesClientePepsResponseConsultarRelacionesClientePepsResult(MSConsultaRelaciones value) {
        return new JAXBElement<MSConsultaRelaciones>(_ConsultarRelacionesClientePepsResponseConsultarRelacionesClientePepsResult_QNAME, MSConsultaRelaciones.class, ConsultarRelacionesClientePepsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRelacion", scope = RegistrarRelacion.class)
    public JAXBElement<MERelacionCliente> createRegistrarRelacionMeRelacion(MERelacionCliente value) {
        return new JAXBElement<MERelacionCliente>(_RegistrarRelacionMeRelacion_QNAME, MERelacionCliente.class, RegistrarRelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarRelacionResult", scope = RegistrarRelacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarRelacionResponseRegistrarRelacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarRelacionResponseRegistrarRelacionResult_QNAME, MensajeSalidaBase.class, RegistrarRelacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRelacion", scope = ActualizarRelacion.class)
    public JAXBElement<MERelacionCliente> createActualizarRelacionMeRelacion(MERelacionCliente value) {
        return new JAXBElement<MERelacionCliente>(_RegistrarRelacionMeRelacion_QNAME, MERelacionCliente.class, ActualizarRelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarRelacionResult", scope = ActualizarRelacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarRelacionResponseActualizarRelacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarRelacionResponseActualizarRelacionResult_QNAME, MensajeSalidaBase.class, ActualizarRelacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meRelacion", scope = EliminarRelacion.class)
    public JAXBElement<MERelacionCliente> createEliminarRelacionMeRelacion(MERelacionCliente value) {
        return new JAXBElement<MERelacionCliente>(_RegistrarRelacionMeRelacion_QNAME, MERelacionCliente.class, EliminarRelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EliminarRelacionResult", scope = EliminarRelacionResponse.class)
    public JAXBElement<MensajeSalidaBase> createEliminarRelacionResponseEliminarRelacionResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EliminarRelacionResponseEliminarRelacionResult_QNAME, MensajeSalidaBase.class, EliminarRelacionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meConsultaParticipacion", scope = ConsultarParticipacionAccionariaYAdministradoresPeps.class)
    public JAXBElement<MEConsultasCliente> createConsultarParticipacionAccionariaYAdministradoresPepsMeConsultaParticipacion(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_ConsultarParticipacionAccionariaYAdministradoresPepsMeConsultaParticipacion_QNAME, MEConsultasCliente.class, ConsultarParticipacionAccionariaYAdministradoresPeps.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaParticipacionAccionaria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaParticipacionAccionaria }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ConsultarParticipacionAccionariaYAdministradoresPepsResult", scope = ConsultarParticipacionAccionariaYAdministradoresPepsResponse.class)
    public JAXBElement<MSConsultaParticipacionAccionaria> createConsultarParticipacionAccionariaYAdministradoresPepsResponseConsultarParticipacionAccionariaYAdministradoresPepsResult(MSConsultaParticipacionAccionaria value) {
        return new JAXBElement<MSConsultaParticipacionAccionaria>(_ConsultarParticipacionAccionariaYAdministradoresPepsResponseConsultarParticipacionAccionariaYAdministradoresPepsResult_QNAME, MSConsultaParticipacionAccionaria.class, ConsultarParticipacionAccionariaYAdministradoresPepsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAccionistaAdministrador", scope = RegistrarAccionistaAdministrador.class)
    public JAXBElement<MEAccionistaAdministrador> createRegistrarAccionistaAdministradorMeAccionistaAdministrador(MEAccionistaAdministrador value) {
        return new JAXBElement<MEAccionistaAdministrador>(_RegistrarAccionistaAdministradorMeAccionistaAdministrador_QNAME, MEAccionistaAdministrador.class, RegistrarAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarAccionistaAdministradorResult", scope = RegistrarAccionistaAdministradorResponse.class)
    public JAXBElement<MensajeSalidaBase> createRegistrarAccionistaAdministradorResponseRegistrarAccionistaAdministradorResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_RegistrarAccionistaAdministradorResponseRegistrarAccionistaAdministradorResult_QNAME, MensajeSalidaBase.class, RegistrarAccionistaAdministradorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAccionistaAdministrador", scope = ActualizarAccionistaAdministrador.class)
    public JAXBElement<MEAccionistaAdministrador> createActualizarAccionistaAdministradorMeAccionistaAdministrador(MEAccionistaAdministrador value) {
        return new JAXBElement<MEAccionistaAdministrador>(_RegistrarAccionistaAdministradorMeAccionistaAdministrador_QNAME, MEAccionistaAdministrador.class, ActualizarAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ActualizarAccionistaAdministradorResult", scope = ActualizarAccionistaAdministradorResponse.class)
    public JAXBElement<MensajeSalidaBase> createActualizarAccionistaAdministradorResponseActualizarAccionistaAdministradorResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ActualizarAccionistaAdministradorResponseActualizarAccionistaAdministradorResult_QNAME, MensajeSalidaBase.class, ActualizarAccionistaAdministradorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meAccionistaAdministrador", scope = EliminarAccionistaAdministrador.class)
    public JAXBElement<MEAccionistaAdministrador> createEliminarAccionistaAdministradorMeAccionistaAdministrador(MEAccionistaAdministrador value) {
        return new JAXBElement<MEAccionistaAdministrador>(_RegistrarAccionistaAdministradorMeAccionistaAdministrador_QNAME, MEAccionistaAdministrador.class, EliminarAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "EliminarAccionistaAdministradorResult", scope = EliminarAccionistaAdministradorResponse.class)
    public JAXBElement<MensajeSalidaBase> createEliminarAccionistaAdministradorResponseEliminarAccionistaAdministradorResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_EliminarAccionistaAdministradorResponseEliminarAccionistaAdministradorResult_QNAME, MensajeSalidaBase.class, EliminarAccionistaAdministradorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meClientePep", scope = GenerarFormularioRegistroRelacionadosPep.class)
    public JAXBElement<MEConsultasCliente> createGenerarFormularioRegistroRelacionadosPepMeClientePep(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_GenerarFormularioRegistroRelacionadosPepMeClientePep_QNAME, MEConsultasCliente.class, GenerarFormularioRegistroRelacionadosPep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "GenerarFormularioRegistroRelacionadosPepResult", scope = GenerarFormularioRegistroRelacionadosPepResponse.class)
    public JAXBElement<MSArchivo> createGenerarFormularioRegistroRelacionadosPepResponseGenerarFormularioRegistroRelacionadosPepResult(MSArchivo value) {
        return new JAXBElement<MSArchivo>(_GenerarFormularioRegistroRelacionadosPepResponseGenerarFormularioRegistroRelacionadosPepResult_QNAME, MSArchivo.class, GenerarFormularioRegistroRelacionadosPepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meClientePep", scope = IniciarFlujoAprobacionRelacionadosPep.class)
    public JAXBElement<MEConsultasCliente> createIniciarFlujoAprobacionRelacionadosPepMeClientePep(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_GenerarFormularioRegistroRelacionadosPepMeClientePep_QNAME, MEConsultasCliente.class, IniciarFlujoAprobacionRelacionadosPep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "IniciarFlujoAprobacionRelacionadosPepResult", scope = IniciarFlujoAprobacionRelacionadosPepResponse.class)
    public JAXBElement<MensajeSalidaBase> createIniciarFlujoAprobacionRelacionadosPepResponseIniciarFlujoAprobacionRelacionadosPepResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_IniciarFlujoAprobacionRelacionadosPepResponseIniciarFlujoAprobacionRelacionadosPepResult_QNAME, MensajeSalidaBase.class, IniciarFlujoAprobacionRelacionadosPepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meClientePep", scope = ValidarAprobacionFlujoRelacionadosPep.class)
    public JAXBElement<MEConsultasCliente> createValidarAprobacionFlujoRelacionadosPepMeClientePep(MEConsultasCliente value) {
        return new JAXBElement<MEConsultasCliente>(_GenerarFormularioRegistroRelacionadosPepMeClientePep_QNAME, MEConsultasCliente.class, ValidarAprobacionFlujoRelacionadosPep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarAprobacionFlujoRelacionadosPepResult", scope = ValidarAprobacionFlujoRelacionadosPepResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarAprobacionFlujoRelacionadosPepResponseValidarAprobacionFlujoRelacionadosPepResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarAprobacionFlujoRelacionadosPepResponseValidarAprobacionFlujoRelacionadosPepResult_QNAME, MensajeSalidaBase.class, ValidarAprobacionFlujoRelacionadosPepResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meEntrada", scope = ValidarAprobacionMalasReferencias.class)
    public JAXBElement<MEIdentificacionCliente> createValidarAprobacionMalasReferenciasMeEntrada(MEIdentificacionCliente value) {
        return new JAXBElement<MEIdentificacionCliente>(_ActualizarDatosContactoMeEntrada_QNAME, MEIdentificacionCliente.class, ValidarAprobacionMalasReferencias.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MensajeSalidaBase }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "ValidarAprobacionMalasReferenciasResult", scope = ValidarAprobacionMalasReferenciasResponse.class)
    public JAXBElement<MensajeSalidaBase> createValidarAprobacionMalasReferenciasResponseValidarAprobacionMalasReferenciasResult(MensajeSalidaBase value) {
        return new JAXBElement<MensajeSalidaBase>(_ValidarAprobacionMalasReferenciasResponseValidarAprobacionMalasReferenciasResult_QNAME, MensajeSalidaBase.class, ValidarAprobacionMalasReferenciasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEUsoDatosPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEUsoDatosPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "meUsoDatosPersonales", scope = RegistrarAutorizacionUsoDatosPersonales.class)
    public JAXBElement<MEUsoDatosPersonales> createRegistrarAutorizacionUsoDatosPersonalesMeUsoDatosPersonales(MEUsoDatosPersonales value) {
        return new JAXBElement<MEUsoDatosPersonales>(_RegistrarAutorizacionUsoDatosPersonalesMeUsoDatosPersonales_QNAME, MEUsoDatosPersonales.class, RegistrarAutorizacionUsoDatosPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     */
    @XmlElementDecl(namespace = "Denarius.CoreBanking.Web.ExternalServices", name = "RegistrarAutorizacionUsoDatosPersonalesResult", scope = RegistrarAutorizacionUsoDatosPersonalesResponse.class)
    public JAXBElement<MSArchivo> createRegistrarAutorizacionUsoDatosPersonalesResponseRegistrarAutorizacionUsoDatosPersonalesResult(MSArchivo value) {
        return new JAXBElement<MSArchivo>(_RegistrarAutorizacionUsoDatosPersonalesResponseRegistrarAutorizacionUsoDatosPersonalesResult_QNAME, MSArchivo.class, RegistrarAutorizacionUsoDatosPersonalesResponse.class, value);
    }

}
