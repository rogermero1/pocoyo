
package servicioclientes.org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices;

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

    private final static QName _Cliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Cliente");
    private final static QName _MSClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSClientes");
    private final static QName _MECreacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MECreacionCliente");
    private final static QName _ArrayOfRedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRedSocial");
    private final static QName _RedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RedSocial");
    private final static QName _ResidenciaFiscal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ResidenciaFiscal");
    private final static QName _MSCreacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSCreacionCliente");
    private final static QName _MEConsultasCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEConsultasCliente");
    private final static QName _MSConsultasCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultasCliente");
    private final static QName _DatosAdicionalesCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosAdicionalesCliente");
    private final static QName _DatosGeneralesCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosGeneralesCliente");
    private final static QName _MSConsultaDireccionesCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaDireccionesCliente");
    private final static QName _ArrayOfDatosDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDatosDireccion");
    private final static QName _DatosDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosDireccion");
    private final static QName _ArrayOfDatosTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDatosTelefono");
    private final static QName _DatosTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosTelefono");
    private final static QName _MSConsultaRepresentanteLegal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaRepresentanteLegal");
    private final static QName _MEDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEDireccion");
    private final static QName _METelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "METelefono");
    private final static QName _MEConsultaCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEConsultaCelular");
    private final static QName _MSConsultaCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaCelular");
    private final static QName _MEConsultaClientesCondiciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEConsultaClientesCondiciones");
    private final static QName _MSConsultaClientesCondiciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaClientesCondiciones");
    private final static QName _ArrayOfDatosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDatosCliente");
    private final static QName _DatosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosCliente");
    private final static QName _MeDatosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MeDatosCliente");
    private final static QName _MEDatosCodigoSeguridad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEDatosCodigoSeguridad");
    private final static QName _MSConsultaEmpleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaEmpleo");
    private final static QName _ArrayOfEmpleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfEmpleo");
    private final static QName _Empleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Empleo");
    private final static QName _MEEmpleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEEmpleo");
    private final static QName _MSConsultaReferenciasPersonales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaReferenciasPersonales");
    private final static QName _ArrayOfReferenciaPersonal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfReferenciaPersonal");
    private final static QName _ReferenciaPersonal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciaPersonal");
    private final static QName _MEReferenciasPersonales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEReferenciasPersonales");
    private final static QName _MEInformacionFinancieraCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEInformacionFinancieraCliente");
    private final static QName _MSConsultaClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaClientes");
    private final static QName _ArrayOfExtractoLegalSociosAccionistas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfExtractoLegalSociosAccionistas");
    private final static QName _ExtractoLegalSociosAccionistas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ExtractoLegalSociosAccionistas");
    private final static QName _MEDatosContacto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEDatosContacto");
    private final static QName _MSDatosContacto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSDatosContacto");
    private final static QName _MEDatosEspecificosCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEDatosEspecificosCliente");
    private final static QName _MECreacionClienteResumido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MECreacionClienteResumido");
    private final static QName _MEIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEIdentificacion");
    private final static QName _MSConsultaOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaOrigenFondos");
    private final static QName _ArrayOfDatosOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDatosOrigenFondos");
    private final static QName _DatosOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosOrigenFondos");
    private final static QName _ArrayOfDetalleOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetalleOrigenFondos");
    private final static QName _DetalleOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleOrigenFondos");
    private final static QName _MEFormularioOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEFormularioOrigenFondos");
    private final static QName _MSInformacionFinanciera_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSInformacionFinanciera");
    private final static QName _ArrayOfDetalleActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetalleActivo");
    private final static QName _DetalleActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleActivo");
    private final static QName _ArrayOfDetallePasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetallePasivo");
    private final static QName _DetallePasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetallePasivo");
    private final static QName _EstadoSituacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EstadoSituacion");
    private final static QName _MEActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEActivo");
    private final static QName _MERubroEmpleo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MERubroEmpleo");
    private final static QName _ArrayOfRubroIngresoEgreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRubroIngresoEgreso");
    private final static QName _RubroIngresoEgreso_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RubroIngresoEgreso");
    private final static QName _MEInformacionMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEInformacionMicroempresa");
    private final static QName _ArrayOfDetalleProductoMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfDetalleProductoMicroempresa");
    private final static QName _DetalleProductoMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleProductoMicroempresa");
    private final static QName _ArrayOfManoObraMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfManoObraMicroempresa");
    private final static QName _ManoObraMicroempresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ManoObraMicroempresa");
    private final static QName _MEPasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEPasivo");
    private final static QName _MEPasivos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEPasivos");
    private final static QName _MERelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MERelacion");
    private final static QName _MECertificadoRelacionesComerciales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MECertificadoRelacionesComerciales");
    private final static QName _MSFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSFuncionario");
    private final static QName _MEFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEFuncionario");
    private final static QName _MSVinculado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSVinculado");
    private final static QName _ArrayOfRelacionesAsignacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRelacionesAsignacion");
    private final static QName _RelacionesAsignacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RelacionesAsignacion");
    private final static QName _MEVinculado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEVinculado");
    private final static QName _ArrayOfRelacionesVinculacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRelacionesVinculacion");
    private final static QName _RelacionesVinculacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RelacionesVinculacion");
    private final static QName _ArrayOfRelacionesAtributo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfRelacionesAtributo");
    private final static QName _RelacionesAtributo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RelacionesAtributo");
    private final static QName _MSConsultaRelaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaRelaciones");
    private final static QName _MERelacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MERelacionCliente");
    private final static QName _MSConsultaParticipacionAccionaria_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSConsultaParticipacionAccionaria");
    private final static QName _ArrayOfAccionistaAdministrador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ArrayOfAccionistaAdministrador");
    private final static QName _AccionistaAdministrador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "AccionistaAdministrador");
    private final static QName _MEAccionistaAdministrador_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEAccionistaAdministrador");
    private final static QName _MSArchivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MSArchivo");
    private final static QName _MEUsoDatosPersonales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MEUsoDatosPersonales");
    private final static QName _MEUsoDatosPersonalesFormulario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Formulario");
    private final static QName _MEUsoDatosPersonalesIdentificacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionCliente");
    private final static QName _MSArchivoArchivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Archivo");
    private final static QName _MEAccionistaAdministradorCargo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Cargo");
    private final static QName _MEAccionistaAdministradorIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Identificacion");
    private final static QName _MEAccionistaAdministradorIdentificacionJuridico_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionJuridico");
    private final static QName _AccionistaAdministradorCargoAccionista_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CargoAccionista");
    private final static QName _AccionistaAdministradorNombreEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreEmpresa");
    private final static QName _AccionistaAdministradorRucEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RucEmpresa");
    private final static QName _AccionistaAdministradorTipo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Tipo");
    private final static QName _MSConsultaParticipacionAccionariaRelaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Relaciones");
    private final static QName _MERelacionClienteIdentificacionRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionRelacion");
    private final static QName _MERelacionClienteTipoRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoRelacion");
    private final static QName _RelacionesVinculacionAtributosRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "AtributosRelacion");
    private final static QName _MEVinculadoCausalVinculacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CausalVinculacion");
    private final static QName _MEVinculadoFechaVinculacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaVinculacion");
    private final static QName _RelacionesAsignacionCodigoVinculacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoVinculacion");
    private final static QName _RelacionesAsignacionIdInstancia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdInstancia");
    private final static QName _RelacionesAsignacionIdRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdRelacion");
    private final static QName _RelacionesAsignacionIdentificacionD_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionD");
    private final static QName _RelacionesAsignacionIdentificacionI_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionI");
    private final static QName _RelacionesAsignacionNombreD_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreD");
    private final static QName _RelacionesAsignacionNombreI_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreI");
    private final static QName _RelacionesAsignacionRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Relacion");
    private final static QName _RelacionesAsignacionValidacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Validacion");
    private final static QName _MSVinculadoCodigoVinculado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoVinculado");
    private final static QName _MSVinculadoDescripcionVinculado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DescripcionVinculado");
    private final static QName _MSVinculadoFechaFinFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaFinFuncionario");
    private final static QName _MSVinculadoFechaInicioFuncionario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaInicioFuncionario");
    private final static QName _MSVinculadoNombresCompletos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombresCompletos");
    private final static QName _MECertificadoRelacionesComercialesFechaGenerado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaGenerado");
    private final static QName _MECertificadoRelacionesComercialesGeneradoOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "GeneradoOficina");
    private final static QName _MECertificadoRelacionesComercialesIdNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdNumeroCuenta");
    private final static QName _MECertificadoRelacionesComercialesNumeroCuenta_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroCuenta");
    private final static QName _MERelacionAtributoRelacionCasado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "AtributoRelacionCasado");
    private final static QName _MERelacionIdentificacionPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionPareja");
    private final static QName _MEPasivosPasivos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Pasivos");
    private final static QName _MEPasivoPasivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Pasivo");
    private final static QName _DetalleProductoMicroempresaNombreProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreProducto");
    private final static QName _MEInformacionMicroempresaListaDetalleProductos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ListaDetalleProductos");
    private final static QName _MEInformacionMicroempresaListaManoObra_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ListaManoObra");
    private final static QName _RubroIngresoEgresoIdOcupacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdOcupacion");
    private final static QName _RubroIngresoEgresoRubro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Rubro");
    private final static QName _RubroIngresoEgresoValor1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor1");
    private final static QName _RubroIngresoEgresoValor2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor2");
    private final static QName _RubroIngresoEgresoValor3_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor3");
    private final static QName _RubroIngresoEgresoValor4_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor4");
    private final static QName _RubroIngresoEgresoValor5_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor5");
    private final static QName _RubroIngresoEgresoValor6_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor6");
    private final static QName _RubroIngresoEgresoValor7_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Valor7");
    private final static QName _MERubroEmpleoRubros_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Rubros");
    private final static QName _MEActivoActivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Activo");
    private final static QName _EstadoSituacionOrigenOtrosGastos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OrigenOtrosGastos");
    private final static QName _EstadoSituacionOrigenOtrosIngresos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OrigenOtrosIngresos");
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
    private final static QName _DetalleActivoTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoDocumento");
    private final static QName _DetalleActivoTipoInmueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoInmueble");
    private final static QName _DetalleActivoTipoMueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoMueble");
    private final static QName _DetalleActivoTipoPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoPropiedad");
    private final static QName _DetalleActivoUbicacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Ubicacion");
    private final static QName _MSInformacionFinancieraActivos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Activos");
    private final static QName _MSInformacionFinancieraResumenEstadoSituacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ResumenEstadoSituacion");
    private final static QName _DetalleOrigenFondosFormaRecepcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FormaRecepcion");
    private final static QName _DetalleOrigenFondosModulo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Modulo");
    private final static QName _DetalleOrigenFondosOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Oficina");
    private final static QName _DetalleOrigenFondosProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Producto");
    private final static QName _DetalleOrigenFondosUsuarioTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "UsuarioTransaccion");
    private final static QName _DatosOrigenFondosActividadEconomicaCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomicaCliente");
    private final static QName _DatosOrigenFondosActividadEconomicaClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomicaClienteTransaccion");
    private final static QName _DatosOrigenFondosCanton_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Canton");
    private final static QName _DatosOrigenFondosCiudadCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadCliente");
    private final static QName _DatosOrigenFondosCiudadClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadClienteTransaccion");
    private final static QName _DatosOrigenFondosDestinoFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DestinoFondos");
    private final static QName _DatosOrigenFondosDetallesFormulario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetallesFormulario");
    private final static QName _DatosOrigenFondosDomicilioCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DomicilioCliente");
    private final static QName _DatosOrigenFondosDomicilioClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DomicilioClienteTransaccion");
    private final static QName _DatosOrigenFondosFechaEnvioOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaEnvioOtp");
    private final static QName _DatosOrigenFondosFechaValidacionOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaValidacionOtp");
    private final static QName _DatosOrigenFondosIdClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdClienteTransaccion");
    private final static QName _DatosOrigenFondosIdControlFormulario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdControlFormulario");
    private final static QName _DatosOrigenFondosIdDatosOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdDatosOrigenFondos");
    private final static QName _DatosOrigenFondosIdGeneracionOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdGeneracionOtp");
    private final static QName _DatosOrigenFondosIdVerificacionBiometria_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdVerificacionBiometria");
    private final static QName _DatosOrigenFondosIdVerificacionOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdVerificacionOtp");
    private final static QName _DatosOrigenFondosIdentificacionClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionClienteTransaccion");
    private final static QName _DatosOrigenFondosInfoGeneracionOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "InfoGeneracionOtp");
    private final static QName _DatosOrigenFondosInfoVerificacionOtp_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "InfoVerificacionOtp");
    private final static QName _DatosOrigenFondosNombreCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreCliente");
    private final static QName _DatosOrigenFondosNombreClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreClienteTransaccion");
    private final static QName _DatosOrigenFondosNombreDepositante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreDepositante");
    private final static QName _DatosOrigenFondosNombreUsuarioTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreUsuarioTransaccion");
    private final static QName _DatosOrigenFondosNumeroFormulario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroFormulario");
    private final static QName _DatosOrigenFondosOcupacionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OcupacionCliente");
    private final static QName _DatosOrigenFondosOcupacionClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OcupacionClienteTransaccion");
    private final static QName _DatosOrigenFondosOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OrigenFondos");
    private final static QName _DatosOrigenFondosPaisResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PaisResidencia");
    private final static QName _DatosOrigenFondosParroquia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Parroquia");
    private final static QName _DatosOrigenFondosProfesionCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProfesionCliente");
    private final static QName _DatosOrigenFondosProfesionClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProfesionClienteTransaccion");
    private final static QName _DatosOrigenFondosProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Provincia");
    private final static QName _DatosOrigenFondosRepresentanteLegalCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RepresentanteLegalCliente");
    private final static QName _DatosOrigenFondosTelefonoCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoCliente");
    private final static QName _DatosOrigenFondosTelefonoClienteTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoClienteTransaccion");
    private final static QName _DatosOrigenFondosTelefonoConvencional_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoConvencional");
    private final static QName _DatosOrigenFondosTipoProducto_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoProducto");
    private final static QName _DatosOrigenFondosTipoTransaccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoTransaccion");
    private final static QName _MSConsultaOrigenFondosFormulariosOrigenFondos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FormulariosOrigenFondos");
    private final static QName _MECreacionClienteResumidoActividadEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomica");
    private final static QName _MECreacionClienteResumidoCallePrincipal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CallePrincipal");
    private final static QName _MECreacionClienteResumidoCalleTransversal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CalleTransversal");
    private final static QName _MECreacionClienteResumidoCantonDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CantonDireccion");
    private final static QName _MECreacionClienteResumidoCiudadDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadDireccion");
    private final static QName _MECreacionClienteResumidoCodigoOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoOficial");
    private final static QName _MECreacionClienteResumidoEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Email");
    private final static QName _MECreacionClienteResumidoEstudios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Estudios");
    private final static QName _MECreacionClienteResumidoNacionalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nacionalidad");
    private final static QName _MECreacionClienteResumidoNombres_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nombres");
    private final static QName _MECreacionClienteResumidoNombresPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombresPareja");
    private final static QName _MECreacionClienteResumidoNumeracionDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeracionDireccion");
    private final static QName _MECreacionClienteResumidoParroquiaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParroquiaDireccion");
    private final static QName _MECreacionClienteResumidoPrimerApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PrimerApellido");
    private final static QName _MECreacionClienteResumidoPrimerApellidoPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PrimerApellidoPareja");
    private final static QName _MECreacionClienteResumidoProvinciaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProvinciaDireccion");
    private final static QName _MECreacionClienteResumidoSegundoApellido_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "SegundoApellido");
    private final static QName _MECreacionClienteResumidoSegundoApellidoPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "SegundoApellidoPareja");
    private final static QName _MECreacionClienteResumidoTelefonoCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoCelular");
    private final static QName _MSDatosContactoIdentificacionOtro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionOtro");
    private final static QName _MEDatosContactoCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Celular");
    private final static QName _MEDatosContactoCodigoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoPais");
    private final static QName _ExtractoLegalSociosAccionistasFechaModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaModificacion");
    private final static QName _ExtractoLegalSociosAccionistasIdCliente_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdCliente");
    private final static QName _ExtractoLegalSociosAccionistasIdSocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdSocio");
    private final static QName _ExtractoLegalSociosAccionistasLoginModificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "LoginModificacion");
    private final static QName _ExtractoLegalSociosAccionistasMontoAporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MontoAporte");
    private final static QName _ExtractoLegalSociosAccionistasNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nombre");
    private final static QName _ExtractoLegalSociosAccionistasPorcentaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Porcentaje");
    private final static QName _ExtractoLegalSociosAccionistasTipoSocio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoSocio");
    private final static QName _ExtractoLegalSociosAccionistasVinculado_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Vinculado");
    private final static QName _MSConsultaClientesAccionistas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Accionistas");
    private final static QName _MSConsultaClientesApellidosPareja_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ApellidosPareja");
    private final static QName _MSConsultaClientesApellidosRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ApellidosRepresentante");
    private final static QName _MSConsultaClientesCallePrincipalEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CallePrincipalEmpresa");
    private final static QName _MSConsultaClientesCalleSecundariaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CalleSecundariaEmpresa");
    private final static QName _MSConsultaClientesCargoDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CargoDescripcion");
    private final static QName _MSConsultaClientesCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Ciudad");
    private final static QName _MSConsultaClientesCiudadEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadEmpresa");
    private final static QName _MSConsultaClientesDescripcionNacionalidad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DescripcionNacionalidad");
    private final static QName _MSConsultaClientesDetalleProductoServicios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DetalleProductoServicios");
    private final static QName _MSConsultaClientesDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Direccion");
    private final static QName _MSConsultaClientesEmailOficina_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EmailOficina");
    private final static QName _MSConsultaClientesEmailRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EmailRepresentante");
    private final static QName _MSConsultaClientesEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EstadoCivil");
    private final static QName _MSConsultaClientesEstadoRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EstadoRelacion");
    private final static QName _MSConsultaClientesIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionConyuge");
    private final static QName _MSConsultaClientesIdentificacionRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionRepresentante");
    private final static QName _MSConsultaClientesIdentificacionTercero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionTercero");
    private final static QName _MSConsultaClientesNacionalidadEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NacionalidadEmpresa");
    private final static QName _MSConsultaClientesNacionalidadRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NacionalidadRepresentante");
    private final static QName _MSConsultaClientesNombresRepresentante_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombresRepresentante");
    private final static QName _MSConsultaClientesNumeroDireccionEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDireccionEmpresa");
    private final static QName _MSConsultaClientesPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Pais");
    private final static QName _MSConsultaClientesPaisEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PaisEmpresa");
    private final static QName _MSConsultaClientesParentesco_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Parentesco");
    private final static QName _MSConsultaClientesParroquiaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParroquiaEmpresa");
    private final static QName _MSConsultaClientesProfesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Profesion");
    private final static QName _MSConsultaClientesProvinciaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProvinciaEmpresa");
    private final static QName _MSConsultaClientesSexo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Sexo");
    private final static QName _MSConsultaClientesTelefonoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoEmpresa");
    private final static QName _MSConsultaClientesTelefonoFijo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoFijo");
    private final static QName _MSConsultaClientesTelefonoRepresentate_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoRepresentate");
    private final static QName _MSConsultaClientesTipoIdentificacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoIdentificacionConyuge");
    private final static QName _MSConsultaClientesUbicacionGeografica_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "UbicacionGeografica");
    private final static QName _ReferenciaPersonalClienteReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ClienteReferencia");
    private final static QName _ReferenciaPersonalFechaRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaRegistro");
    private final static QName _ReferenciaPersonalIdTipoRelacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTipoRelacion");
    private final static QName _ReferenciaPersonalLugarTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "LugarTrabajo");
    private final static QName _ReferenciaPersonalNro_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nro");
    private final static QName _ReferenciaPersonalOcupacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Ocupacion");
    private final static QName _ReferenciaPersonalTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Telefono");
    private final static QName _ReferenciaPersonalTransversal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Transversal");
    private final static QName _MSConsultaReferenciasPersonalesReferenciasPersonales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciasPersonales");
    private final static QName _EmpleoActividadCreada_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadCreada");
    private final static QName _EmpleoActividadEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEmpresa");
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
    private final static QName _MSConsultaEmpleoEmpleos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Empleos");
    private final static QName _MEDatosCodigoSeguridadCodigoSeguridad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoSeguridad");
    private final static QName _MEDatosCodigoSeguridadOrganizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Organizacion");
    private final static QName _MeDatosClienteFechaNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaNacimiento");
    private final static QName _MeDatosClienteIdActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdActividad");
    private final static QName _MeDatosClienteIngresoAnual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IngresoAnual");
    private final static QName _DatosClienteCalificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Calificacion");
    private final static QName _DatosClienteTelefonoLocal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoLocal");
    private final static QName _MSConsultaClientesCondicionesClientes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Clientes");
    private final static QName _MEConsultaClientesCondicionesApellidoMaterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ApellidoMaterno");
    private final static QName _MEConsultaClientesCondicionesApellidoPaterno_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ApellidoPaterno");
    private final static QName _MEConsultaCelularCodigoCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoCelular");
    private final static QName _MEConsultaCelularNumeroCelular_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroCelular");
    private final static QName _METelefonoCodigoArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoArea");
    private final static QName _METelefonoCodigoRegion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoRegion");
    private final static QName _METelefonoExtension_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Extension");
    private final static QName _METelefonoIdTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdTelefono");
    private final static QName _METelefonoNumeroTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroTelefono");
    private final static QName _METelefonoTipoTelefono_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoTelefono");
    private final static QName _MEDireccionIdDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdDireccion");
    private final static QName _MEDireccionNumeracion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Numeracion");
    private final static QName _MEDireccionSector_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Sector");
    private final static QName _MEDireccionTipoDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoDireccion");
    private final static QName _DatosTelefonoNumero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Numero");
    private final static QName _DatosDireccionCodigoCiudad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoCiudad");
    private final static QName _DatosDireccionCodigoParroquia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoParroquia");
    private final static QName _DatosDireccionCodigoProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoProvincia");
    private final static QName _DatosDireccionCodigoTipoVivienda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoTipoVivienda");
    private final static QName _DatosDireccionTipoVivienda_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoVivienda");
    private final static QName _MSConsultaDireccionesClienteDirecciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Direcciones");
    private final static QName _MSConsultaDireccionesClienteTelefonos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Telefonos");
    private final static QName _DatosGeneralesClienteActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Actividad");
    private final static QName _DatosGeneralesClienteDescripcionEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DescripcionEstadoCivil");
    private final static QName _DatosGeneralesClienteGenero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Genero");
    private final static QName _DatosGeneralesClienteNombreConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreConyuge");
    private final static QName _DatosGeneralesClienteNumeroCargas_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroCargas");
    private final static QName _DatosGeneralesClienteOficinaCreacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "OficinaCreacion");
    private final static QName _DatosGeneralesClienteTipoEducacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoEducacion");
    private final static QName _DatosGeneralesClienteTipoEducacionConyuge_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoEducacionConyuge");
    private final static QName _DatosGeneralesClienteTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoIdentificacion");
    private final static QName _DatosAdicionalesClienteApellido1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Apellido1");
    private final static QName _DatosAdicionalesClienteApellido2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Apellido2");
    private final static QName _DatosAdicionalesClienteApellidos_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Apellidos");
    private final static QName _DatosAdicionalesClienteNombre1_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nombre1");
    private final static QName _DatosAdicionalesClienteNombre2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Nombre2");
    private final static QName _DatosAdicionalesClienteOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Oficial");
    private final static QName _DatosAdicionalesClienteTelefonoAdicional_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoAdicional");
    private final static QName _MSConsultasClienteAgencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Agencia");
    private final static QName _MSConsultasClienteDatosAdicionales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DatosAdicionales");
    private final static QName _MEConsultasClientePlanServicio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PlanServicio");
    private final static QName _ResidenciaFiscalCalle_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Calle");
    private final static QName _ResidenciaFiscalCiudadResidencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadResidencia");
    private final static QName _ResidenciaFiscalCodigoCiudadNacimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoCiudadNacimiento");
    private final static QName _ResidenciaFiscalCodigoPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoPostal");
    private final static QName _ResidenciaFiscalCodigoTipoIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoTipoIdentificacion");
    private final static QName _ResidenciaFiscalDireccionAdicionalReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionAdicionalReferencia");
    private final static QName _ResidenciaFiscalNumeroDomicilio_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDomicilio");
    private final static QName _ResidenciaFiscalNumeroIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroIdentificacion");
    private final static QName _ResidenciaFiscalTipoPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TipoPersona");
    private final static QName _RedSocialCodigoRedSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoRedSocial");
    private final static QName _RedSocialUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "Usuario");
    private final static QName _MECreacionClienteActividadEconomicaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ActividadEconomicaEmpresa");
    private final static QName _MECreacionClienteCallePrincipalTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CallePrincipalTrabajo");
    private final static QName _MECreacionClienteCalleTransversalTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CalleTransversalTrabajo");
    private final static QName _MECreacionClienteCantonDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CantonDireccionTrabajo");
    private final static QName _MECreacionClienteCargoEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CargoEmpresa");
    private final static QName _MECreacionClienteCiudadDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CiudadDireccionTrabajo");
    private final static QName _MECreacionClienteCodigoEtnia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoEtnia");
    private final static QName _MECreacionClienteDireccionReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionReferencia");
    private final static QName _MECreacionClienteDireccionReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DireccionReferencia2");
    private final static QName _MECreacionClienteEgresoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "EgresoMensual");
    private final static QName _MECreacionClienteIngresoMensual_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IngresoMensual");
    private final static QName _MECreacionClienteNombreReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreReferencia");
    private final static QName _MECreacionClienteNombreReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreReferencia2");
    private final static QName _MECreacionClienteNumeroDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDireccion");
    private final static QName _MECreacionClienteNumeroDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NumeroDireccionTrabajo");
    private final static QName _MECreacionClienteParentescoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParentescoReferencia");
    private final static QName _MECreacionClienteParentescoReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParentescoReferencia2");
    private final static QName _MECreacionClienteParroquiaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ParroquiaDireccionTrabajo");
    private final static QName _MECreacionClientePatromonioInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "PatromonioInicial");
    private final static QName _MECreacionClienteProductoInicial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProductoInicial");
    private final static QName _MECreacionClienteProvinciaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ProvinciaDireccionTrabajo");
    private final static QName _MECreacionClienteRedesSociales_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "RedesSociales");
    private final static QName _MECreacionClienteReferenciaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciaDireccion");
    private final static QName _MECreacionClienteReferenciaDireccionTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "ReferenciaDireccionTrabajo");
    private final static QName _MECreacionClienteTelefonoReferencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoReferencia");
    private final static QName _MECreacionClienteTelefonoReferencia2_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoReferencia2");
    private final static QName _MECreacionClienteTelefonoSms_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoSms");
    private final static QName _MECreacionClienteTelefonoTrabajo_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "TelefonoTrabajo");
    private final static QName _ClienteCodigoActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoActividad");
    private final static QName _ClienteCodigoNivelEstudios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "CodigoNivelEstudios");
    private final static QName _ClienteDescripcionActividad_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "DescripcionActividad");
    private final static QName _ClienteFechaCaducaPasaporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaCaducaPasaporte");
    private final static QName _ClienteFechaIngresoPais_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaIngresoPais");
    private final static QName _ClienteFechaIngresoPasaporte_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "FechaIngresoPasaporte");
    private final static QName _ClienteIdentificacionExtranjero_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "IdentificacionExtranjero");
    private final static QName _ClienteMensajeMalasReferencias_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "MensajeMalasReferencias");
    private final static QName _ClienteNivelEstudios_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NivelEstudios");
    private final static QName _ClienteNombreOficial_QNAME = new QName("http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", "NombreOficial");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.denariuscorebanking_web_externalservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link MSClientes }
     * 
     */
    public MSClientes createMSClientes() {
        return new MSClientes();
    }

    /**
     * Create an instance of {@link MECreacionCliente }
     * 
     */
    public MECreacionCliente createMECreacionCliente() {
        return new MECreacionCliente();
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
     * Create an instance of {@link MSCreacionCliente }
     * 
     */
    public MSCreacionCliente createMSCreacionCliente() {
        return new MSCreacionCliente();
    }

    /**
     * Create an instance of {@link MEConsultasCliente }
     * 
     */
    public MEConsultasCliente createMEConsultasCliente() {
        return new MEConsultasCliente();
    }

    /**
     * Create an instance of {@link MSConsultasCliente }
     * 
     */
    public MSConsultasCliente createMSConsultasCliente() {
        return new MSConsultasCliente();
    }

    /**
     * Create an instance of {@link DatosAdicionalesCliente }
     * 
     */
    public DatosAdicionalesCliente createDatosAdicionalesCliente() {
        return new DatosAdicionalesCliente();
    }

    /**
     * Create an instance of {@link DatosGeneralesCliente }
     * 
     */
    public DatosGeneralesCliente createDatosGeneralesCliente() {
        return new DatosGeneralesCliente();
    }

    /**
     * Create an instance of {@link MSConsultaDireccionesCliente }
     * 
     */
    public MSConsultaDireccionesCliente createMSConsultaDireccionesCliente() {
        return new MSConsultaDireccionesCliente();
    }

    /**
     * Create an instance of {@link ArrayOfDatosDireccion }
     * 
     */
    public ArrayOfDatosDireccion createArrayOfDatosDireccion() {
        return new ArrayOfDatosDireccion();
    }

    /**
     * Create an instance of {@link DatosDireccion }
     * 
     */
    public DatosDireccion createDatosDireccion() {
        return new DatosDireccion();
    }

    /**
     * Create an instance of {@link ArrayOfDatosTelefono }
     * 
     */
    public ArrayOfDatosTelefono createArrayOfDatosTelefono() {
        return new ArrayOfDatosTelefono();
    }

    /**
     * Create an instance of {@link DatosTelefono }
     * 
     */
    public DatosTelefono createDatosTelefono() {
        return new DatosTelefono();
    }

    /**
     * Create an instance of {@link MSConsultaRepresentanteLegal }
     * 
     */
    public MSConsultaRepresentanteLegal createMSConsultaRepresentanteLegal() {
        return new MSConsultaRepresentanteLegal();
    }

    /**
     * Create an instance of {@link MEDireccion }
     * 
     */
    public MEDireccion createMEDireccion() {
        return new MEDireccion();
    }

    /**
     * Create an instance of {@link METelefono }
     * 
     */
    public METelefono createMETelefono() {
        return new METelefono();
    }

    /**
     * Create an instance of {@link MEConsultaCelular }
     * 
     */
    public MEConsultaCelular createMEConsultaCelular() {
        return new MEConsultaCelular();
    }

    /**
     * Create an instance of {@link MSConsultaCelular }
     * 
     */
    public MSConsultaCelular createMSConsultaCelular() {
        return new MSConsultaCelular();
    }

    /**
     * Create an instance of {@link MEConsultaClientesCondiciones }
     * 
     */
    public MEConsultaClientesCondiciones createMEConsultaClientesCondiciones() {
        return new MEConsultaClientesCondiciones();
    }

    /**
     * Create an instance of {@link MSConsultaClientesCondiciones }
     * 
     */
    public MSConsultaClientesCondiciones createMSConsultaClientesCondiciones() {
        return new MSConsultaClientesCondiciones();
    }

    /**
     * Create an instance of {@link ArrayOfDatosCliente }
     * 
     */
    public ArrayOfDatosCliente createArrayOfDatosCliente() {
        return new ArrayOfDatosCliente();
    }

    /**
     * Create an instance of {@link DatosCliente }
     * 
     */
    public DatosCliente createDatosCliente() {
        return new DatosCliente();
    }

    /**
     * Create an instance of {@link MeDatosCliente }
     * 
     */
    public MeDatosCliente createMeDatosCliente() {
        return new MeDatosCliente();
    }

    /**
     * Create an instance of {@link MEDatosCodigoSeguridad }
     * 
     */
    public MEDatosCodigoSeguridad createMEDatosCodigoSeguridad() {
        return new MEDatosCodigoSeguridad();
    }

    /**
     * Create an instance of {@link MSConsultaEmpleo }
     * 
     */
    public MSConsultaEmpleo createMSConsultaEmpleo() {
        return new MSConsultaEmpleo();
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
     * Create an instance of {@link MEEmpleo }
     * 
     */
    public MEEmpleo createMEEmpleo() {
        return new MEEmpleo();
    }

    /**
     * Create an instance of {@link MSConsultaReferenciasPersonales }
     * 
     */
    public MSConsultaReferenciasPersonales createMSConsultaReferenciasPersonales() {
        return new MSConsultaReferenciasPersonales();
    }

    /**
     * Create an instance of {@link ArrayOfReferenciaPersonal }
     * 
     */
    public ArrayOfReferenciaPersonal createArrayOfReferenciaPersonal() {
        return new ArrayOfReferenciaPersonal();
    }

    /**
     * Create an instance of {@link ReferenciaPersonal }
     * 
     */
    public ReferenciaPersonal createReferenciaPersonal() {
        return new ReferenciaPersonal();
    }

    /**
     * Create an instance of {@link MEReferenciasPersonales }
     * 
     */
    public MEReferenciasPersonales createMEReferenciasPersonales() {
        return new MEReferenciasPersonales();
    }

    /**
     * Create an instance of {@link MEInformacionFinancieraCliente }
     * 
     */
    public MEInformacionFinancieraCliente createMEInformacionFinancieraCliente() {
        return new MEInformacionFinancieraCliente();
    }

    /**
     * Create an instance of {@link MSConsultaClientes }
     * 
     */
    public MSConsultaClientes createMSConsultaClientes() {
        return new MSConsultaClientes();
    }

    /**
     * Create an instance of {@link ArrayOfExtractoLegalSociosAccionistas }
     * 
     */
    public ArrayOfExtractoLegalSociosAccionistas createArrayOfExtractoLegalSociosAccionistas() {
        return new ArrayOfExtractoLegalSociosAccionistas();
    }

    /**
     * Create an instance of {@link ExtractoLegalSociosAccionistas }
     * 
     */
    public ExtractoLegalSociosAccionistas createExtractoLegalSociosAccionistas() {
        return new ExtractoLegalSociosAccionistas();
    }

    /**
     * Create an instance of {@link MEDatosContacto }
     * 
     */
    public MEDatosContacto createMEDatosContacto() {
        return new MEDatosContacto();
    }

    /**
     * Create an instance of {@link MSDatosContacto }
     * 
     */
    public MSDatosContacto createMSDatosContacto() {
        return new MSDatosContacto();
    }

    /**
     * Create an instance of {@link MEDatosEspecificosCliente }
     * 
     */
    public MEDatosEspecificosCliente createMEDatosEspecificosCliente() {
        return new MEDatosEspecificosCliente();
    }

    /**
     * Create an instance of {@link MECreacionClienteResumido }
     * 
     */
    public MECreacionClienteResumido createMECreacionClienteResumido() {
        return new MECreacionClienteResumido();
    }

    /**
     * Create an instance of {@link MEIdentificacion }
     * 
     */
    public MEIdentificacion createMEIdentificacion() {
        return new MEIdentificacion();
    }

    /**
     * Create an instance of {@link MSConsultaOrigenFondos }
     * 
     */
    public MSConsultaOrigenFondos createMSConsultaOrigenFondos() {
        return new MSConsultaOrigenFondos();
    }

    /**
     * Create an instance of {@link ArrayOfDatosOrigenFondos }
     * 
     */
    public ArrayOfDatosOrigenFondos createArrayOfDatosOrigenFondos() {
        return new ArrayOfDatosOrigenFondos();
    }

    /**
     * Create an instance of {@link DatosOrigenFondos }
     * 
     */
    public DatosOrigenFondos createDatosOrigenFondos() {
        return new DatosOrigenFondos();
    }

    /**
     * Create an instance of {@link ArrayOfDetalleOrigenFondos }
     * 
     */
    public ArrayOfDetalleOrigenFondos createArrayOfDetalleOrigenFondos() {
        return new ArrayOfDetalleOrigenFondos();
    }

    /**
     * Create an instance of {@link DetalleOrigenFondos }
     * 
     */
    public DetalleOrigenFondos createDetalleOrigenFondos() {
        return new DetalleOrigenFondos();
    }

    /**
     * Create an instance of {@link MEFormularioOrigenFondos }
     * 
     */
    public MEFormularioOrigenFondos createMEFormularioOrigenFondos() {
        return new MEFormularioOrigenFondos();
    }

    /**
     * Create an instance of {@link MSInformacionFinanciera }
     * 
     */
    public MSInformacionFinanciera createMSInformacionFinanciera() {
        return new MSInformacionFinanciera();
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
     * Create an instance of {@link EstadoSituacion }
     * 
     */
    public EstadoSituacion createEstadoSituacion() {
        return new EstadoSituacion();
    }

    /**
     * Create an instance of {@link MEActivo }
     * 
     */
    public MEActivo createMEActivo() {
        return new MEActivo();
    }

    /**
     * Create an instance of {@link MERubroEmpleo }
     * 
     */
    public MERubroEmpleo createMERubroEmpleo() {
        return new MERubroEmpleo();
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
     * Create an instance of {@link MEInformacionMicroempresa }
     * 
     */
    public MEInformacionMicroempresa createMEInformacionMicroempresa() {
        return new MEInformacionMicroempresa();
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
     * Create an instance of {@link MEPasivo }
     * 
     */
    public MEPasivo createMEPasivo() {
        return new MEPasivo();
    }

    /**
     * Create an instance of {@link MEPasivos }
     * 
     */
    public MEPasivos createMEPasivos() {
        return new MEPasivos();
    }

    /**
     * Create an instance of {@link MERelacion }
     * 
     */
    public MERelacion createMERelacion() {
        return new MERelacion();
    }

    /**
     * Create an instance of {@link MECertificadoRelacionesComerciales }
     * 
     */
    public MECertificadoRelacionesComerciales createMECertificadoRelacionesComerciales() {
        return new MECertificadoRelacionesComerciales();
    }

    /**
     * Create an instance of {@link MSFuncionario }
     * 
     */
    public MSFuncionario createMSFuncionario() {
        return new MSFuncionario();
    }

    /**
     * Create an instance of {@link MEFuncionario }
     * 
     */
    public MEFuncionario createMEFuncionario() {
        return new MEFuncionario();
    }

    /**
     * Create an instance of {@link MSVinculado }
     * 
     */
    public MSVinculado createMSVinculado() {
        return new MSVinculado();
    }

    /**
     * Create an instance of {@link ArrayOfRelacionesAsignacion }
     * 
     */
    public ArrayOfRelacionesAsignacion createArrayOfRelacionesAsignacion() {
        return new ArrayOfRelacionesAsignacion();
    }

    /**
     * Create an instance of {@link RelacionesAsignacion }
     * 
     */
    public RelacionesAsignacion createRelacionesAsignacion() {
        return new RelacionesAsignacion();
    }

    /**
     * Create an instance of {@link MEVinculado }
     * 
     */
    public MEVinculado createMEVinculado() {
        return new MEVinculado();
    }

    /**
     * Create an instance of {@link ArrayOfRelacionesVinculacion }
     * 
     */
    public ArrayOfRelacionesVinculacion createArrayOfRelacionesVinculacion() {
        return new ArrayOfRelacionesVinculacion();
    }

    /**
     * Create an instance of {@link RelacionesVinculacion }
     * 
     */
    public RelacionesVinculacion createRelacionesVinculacion() {
        return new RelacionesVinculacion();
    }

    /**
     * Create an instance of {@link ArrayOfRelacionesAtributo }
     * 
     */
    public ArrayOfRelacionesAtributo createArrayOfRelacionesAtributo() {
        return new ArrayOfRelacionesAtributo();
    }

    /**
     * Create an instance of {@link RelacionesAtributo }
     * 
     */
    public RelacionesAtributo createRelacionesAtributo() {
        return new RelacionesAtributo();
    }

    /**
     * Create an instance of {@link MSConsultaRelaciones }
     * 
     */
    public MSConsultaRelaciones createMSConsultaRelaciones() {
        return new MSConsultaRelaciones();
    }

    /**
     * Create an instance of {@link MERelacionCliente }
     * 
     */
    public MERelacionCliente createMERelacionCliente() {
        return new MERelacionCliente();
    }

    /**
     * Create an instance of {@link MSConsultaParticipacionAccionaria }
     * 
     */
    public MSConsultaParticipacionAccionaria createMSConsultaParticipacionAccionaria() {
        return new MSConsultaParticipacionAccionaria();
    }

    /**
     * Create an instance of {@link ArrayOfAccionistaAdministrador }
     * 
     */
    public ArrayOfAccionistaAdministrador createArrayOfAccionistaAdministrador() {
        return new ArrayOfAccionistaAdministrador();
    }

    /**
     * Create an instance of {@link AccionistaAdministrador }
     * 
     */
    public AccionistaAdministrador createAccionistaAdministrador() {
        return new AccionistaAdministrador();
    }

    /**
     * Create an instance of {@link MEAccionistaAdministrador }
     * 
     */
    public MEAccionistaAdministrador createMEAccionistaAdministrador() {
        return new MEAccionistaAdministrador();
    }

    /**
     * Create an instance of {@link MSArchivo }
     * 
     */
    public MSArchivo createMSArchivo() {
        return new MSArchivo();
    }

    /**
     * Create an instance of {@link MEUsoDatosPersonales }
     * 
     */
    public MEUsoDatosPersonales createMEUsoDatosPersonales() {
        return new MEUsoDatosPersonales();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Cliente")
    public JAXBElement<Cliente> createCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSClientes")
    public JAXBElement<MSClientes> createMSClientes(MSClientes value) {
        return new JAXBElement<MSClientes>(_MSClientes_QNAME, MSClientes.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSCreacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSCreacionCliente")
    public JAXBElement<MSCreacionCliente> createMSCreacionCliente(MSCreacionCliente value) {
        return new JAXBElement<MSCreacionCliente>(_MSCreacionCliente_QNAME, MSCreacionCliente.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultasCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultasCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultasCliente")
    public JAXBElement<MSConsultasCliente> createMSConsultasCliente(MSConsultasCliente value) {
        return new JAXBElement<MSConsultasCliente>(_MSConsultasCliente_QNAME, MSConsultasCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosAdicionalesCliente")
    public JAXBElement<DatosAdicionalesCliente> createDatosAdicionalesCliente(DatosAdicionalesCliente value) {
        return new JAXBElement<DatosAdicionalesCliente>(_DatosAdicionalesCliente_QNAME, DatosAdicionalesCliente.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaDireccionesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaDireccionesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaDireccionesCliente")
    public JAXBElement<MSConsultaDireccionesCliente> createMSConsultaDireccionesCliente(MSConsultaDireccionesCliente value) {
        return new JAXBElement<MSConsultaDireccionesCliente>(_MSConsultaDireccionesCliente_QNAME, MSConsultaDireccionesCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDatosDireccion")
    public JAXBElement<ArrayOfDatosDireccion> createArrayOfDatosDireccion(ArrayOfDatosDireccion value) {
        return new JAXBElement<ArrayOfDatosDireccion>(_ArrayOfDatosDireccion_QNAME, ArrayOfDatosDireccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosDireccion")
    public JAXBElement<DatosDireccion> createDatosDireccion(DatosDireccion value) {
        return new JAXBElement<DatosDireccion>(_DatosDireccion_QNAME, DatosDireccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDatosTelefono")
    public JAXBElement<ArrayOfDatosTelefono> createArrayOfDatosTelefono(ArrayOfDatosTelefono value) {
        return new JAXBElement<ArrayOfDatosTelefono>(_ArrayOfDatosTelefono_QNAME, ArrayOfDatosTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosTelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosTelefono }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosTelefono")
    public JAXBElement<DatosTelefono> createDatosTelefono(DatosTelefono value) {
        return new JAXBElement<DatosTelefono>(_DatosTelefono_QNAME, DatosTelefono.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaRepresentanteLegal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaRepresentanteLegal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaRepresentanteLegal")
    public JAXBElement<MSConsultaRepresentanteLegal> createMSConsultaRepresentanteLegal(MSConsultaRepresentanteLegal value) {
        return new JAXBElement<MSConsultaRepresentanteLegal>(_MSConsultaRepresentanteLegal_QNAME, MSConsultaRepresentanteLegal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEDireccion")
    public JAXBElement<MEDireccion> createMEDireccion(MEDireccion value) {
        return new JAXBElement<MEDireccion>(_MEDireccion_QNAME, MEDireccion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaCelular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaCelular }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEConsultaCelular")
    public JAXBElement<MEConsultaCelular> createMEConsultaCelular(MEConsultaCelular value) {
        return new JAXBElement<MEConsultaCelular>(_MEConsultaCelular_QNAME, MEConsultaCelular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaCelular }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaCelular")
    public JAXBElement<MSConsultaCelular> createMSConsultaCelular(MSConsultaCelular value) {
        return new JAXBElement<MSConsultaCelular>(_MSConsultaCelular_QNAME, MSConsultaCelular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEConsultaClientesCondiciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEConsultaClientesCondiciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEConsultaClientesCondiciones")
    public JAXBElement<MEConsultaClientesCondiciones> createMEConsultaClientesCondiciones(MEConsultaClientesCondiciones value) {
        return new JAXBElement<MEConsultaClientesCondiciones>(_MEConsultaClientesCondiciones_QNAME, MEConsultaClientesCondiciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaClientesCondiciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaClientesCondiciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaClientesCondiciones")
    public JAXBElement<MSConsultaClientesCondiciones> createMSConsultaClientesCondiciones(MSConsultaClientesCondiciones value) {
        return new JAXBElement<MSConsultaClientesCondiciones>(_MSConsultaClientesCondiciones_QNAME, MSConsultaClientesCondiciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDatosCliente")
    public JAXBElement<ArrayOfDatosCliente> createArrayOfDatosCliente(ArrayOfDatosCliente value) {
        return new JAXBElement<ArrayOfDatosCliente>(_ArrayOfDatosCliente_QNAME, ArrayOfDatosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosCliente")
    public JAXBElement<DatosCliente> createDatosCliente(DatosCliente value) {
        return new JAXBElement<DatosCliente>(_DatosCliente_QNAME, DatosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MeDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MeDatosCliente")
    public JAXBElement<MeDatosCliente> createMeDatosCliente(MeDatosCliente value) {
        return new JAXBElement<MeDatosCliente>(_MeDatosCliente_QNAME, MeDatosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosCodigoSeguridad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosCodigoSeguridad }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEDatosCodigoSeguridad")
    public JAXBElement<MEDatosCodigoSeguridad> createMEDatosCodigoSeguridad(MEDatosCodigoSeguridad value) {
        return new JAXBElement<MEDatosCodigoSeguridad>(_MEDatosCodigoSeguridad_QNAME, MEDatosCodigoSeguridad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaEmpleo")
    public JAXBElement<MSConsultaEmpleo> createMSConsultaEmpleo(MSConsultaEmpleo value) {
        return new JAXBElement<MSConsultaEmpleo>(_MSConsultaEmpleo_QNAME, MSConsultaEmpleo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEEmpleo")
    public JAXBElement<MEEmpleo> createMEEmpleo(MEEmpleo value) {
        return new JAXBElement<MEEmpleo>(_MEEmpleo_QNAME, MEEmpleo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaReferenciasPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaReferenciasPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaReferenciasPersonales")
    public JAXBElement<MSConsultaReferenciasPersonales> createMSConsultaReferenciasPersonales(MSConsultaReferenciasPersonales value) {
        return new JAXBElement<MSConsultaReferenciasPersonales>(_MSConsultaReferenciasPersonales_QNAME, MSConsultaReferenciasPersonales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfReferenciaPersonal")
    public JAXBElement<ArrayOfReferenciaPersonal> createArrayOfReferenciaPersonal(ArrayOfReferenciaPersonal value) {
        return new JAXBElement<ArrayOfReferenciaPersonal>(_ArrayOfReferenciaPersonal_QNAME, ArrayOfReferenciaPersonal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ReferenciaPersonal")
    public JAXBElement<ReferenciaPersonal> createReferenciaPersonal(ReferenciaPersonal value) {
        return new JAXBElement<ReferenciaPersonal>(_ReferenciaPersonal_QNAME, ReferenciaPersonal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEReferenciasPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEReferenciasPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEReferenciasPersonales")
    public JAXBElement<MEReferenciasPersonales> createMEReferenciasPersonales(MEReferenciasPersonales value) {
        return new JAXBElement<MEReferenciasPersonales>(_MEReferenciasPersonales_QNAME, MEReferenciasPersonales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionFinancieraCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEInformacionFinancieraCliente")
    public JAXBElement<MEInformacionFinancieraCliente> createMEInformacionFinancieraCliente(MEInformacionFinancieraCliente value) {
        return new JAXBElement<MEInformacionFinancieraCliente>(_MEInformacionFinancieraCliente_QNAME, MEInformacionFinancieraCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaClientes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaClientes")
    public JAXBElement<MSConsultaClientes> createMSConsultaClientes(MSConsultaClientes value) {
        return new JAXBElement<MSConsultaClientes>(_MSConsultaClientes_QNAME, MSConsultaClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfExtractoLegalSociosAccionistas")
    public JAXBElement<ArrayOfExtractoLegalSociosAccionistas> createArrayOfExtractoLegalSociosAccionistas(ArrayOfExtractoLegalSociosAccionistas value) {
        return new JAXBElement<ArrayOfExtractoLegalSociosAccionistas>(_ArrayOfExtractoLegalSociosAccionistas_QNAME, ArrayOfExtractoLegalSociosAccionistas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtractoLegalSociosAccionistas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtractoLegalSociosAccionistas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ExtractoLegalSociosAccionistas")
    public JAXBElement<ExtractoLegalSociosAccionistas> createExtractoLegalSociosAccionistas(ExtractoLegalSociosAccionistas value) {
        return new JAXBElement<ExtractoLegalSociosAccionistas>(_ExtractoLegalSociosAccionistas_QNAME, ExtractoLegalSociosAccionistas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosContacto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosContacto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEDatosContacto")
    public JAXBElement<MEDatosContacto> createMEDatosContacto(MEDatosContacto value) {
        return new JAXBElement<MEDatosContacto>(_MEDatosContacto_QNAME, MEDatosContacto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSDatosContacto }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSDatosContacto")
    public JAXBElement<MSDatosContacto> createMSDatosContacto(MSDatosContacto value) {
        return new JAXBElement<MSDatosContacto>(_MSDatosContacto_QNAME, MSDatosContacto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEDatosEspecificosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEDatosEspecificosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEDatosEspecificosCliente")
    public JAXBElement<MEDatosEspecificosCliente> createMEDatosEspecificosCliente(MEDatosEspecificosCliente value) {
        return new JAXBElement<MEDatosEspecificosCliente>(_MEDatosEspecificosCliente_QNAME, MEDatosEspecificosCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECreacionClienteResumido }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECreacionClienteResumido }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MECreacionClienteResumido")
    public JAXBElement<MECreacionClienteResumido> createMECreacionClienteResumido(MECreacionClienteResumido value) {
        return new JAXBElement<MECreacionClienteResumido>(_MECreacionClienteResumido_QNAME, MECreacionClienteResumido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEIdentificacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEIdentificacion")
    public JAXBElement<MEIdentificacion> createMEIdentificacion(MEIdentificacion value) {
        return new JAXBElement<MEIdentificacion>(_MEIdentificacion_QNAME, MEIdentificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaOrigenFondos")
    public JAXBElement<MSConsultaOrigenFondos> createMSConsultaOrigenFondos(MSConsultaOrigenFondos value) {
        return new JAXBElement<MSConsultaOrigenFondos>(_MSConsultaOrigenFondos_QNAME, MSConsultaOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDatosOrigenFondos")
    public JAXBElement<ArrayOfDatosOrigenFondos> createArrayOfDatosOrigenFondos(ArrayOfDatosOrigenFondos value) {
        return new JAXBElement<ArrayOfDatosOrigenFondos>(_ArrayOfDatosOrigenFondos_QNAME, ArrayOfDatosOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosOrigenFondos")
    public JAXBElement<DatosOrigenFondos> createDatosOrigenFondos(DatosOrigenFondos value) {
        return new JAXBElement<DatosOrigenFondos>(_DatosOrigenFondos_QNAME, DatosOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfDetalleOrigenFondos")
    public JAXBElement<ArrayOfDetalleOrigenFondos> createArrayOfDetalleOrigenFondos(ArrayOfDetalleOrigenFondos value) {
        return new JAXBElement<ArrayOfDetalleOrigenFondos>(_ArrayOfDetalleOrigenFondos_QNAME, ArrayOfDetalleOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetalleOrigenFondos")
    public JAXBElement<DetalleOrigenFondos> createDetalleOrigenFondos(DetalleOrigenFondos value) {
        return new JAXBElement<DetalleOrigenFondos>(_DetalleOrigenFondos_QNAME, DetalleOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFormularioOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEFormularioOrigenFondos")
    public JAXBElement<MEFormularioOrigenFondos> createMEFormularioOrigenFondos(MEFormularioOrigenFondos value) {
        return new JAXBElement<MEFormularioOrigenFondos>(_MEFormularioOrigenFondos_QNAME, MEFormularioOrigenFondos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSInformacionFinanciera }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSInformacionFinanciera }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSInformacionFinanciera")
    public JAXBElement<MSInformacionFinanciera> createMSInformacionFinanciera(MSInformacionFinanciera value) {
        return new JAXBElement<MSInformacionFinanciera>(_MSInformacionFinanciera_QNAME, MSInformacionFinanciera.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EstadoSituacion")
    public JAXBElement<EstadoSituacion> createEstadoSituacion(EstadoSituacion value) {
        return new JAXBElement<EstadoSituacion>(_EstadoSituacion_QNAME, EstadoSituacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEActivo")
    public JAXBElement<MEActivo> createMEActivo(MEActivo value) {
        return new JAXBElement<MEActivo>(_MEActivo_QNAME, MEActivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERubroEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERubroEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MERubroEmpleo")
    public JAXBElement<MERubroEmpleo> createMERubroEmpleo(MERubroEmpleo value) {
        return new JAXBElement<MERubroEmpleo>(_MERubroEmpleo_QNAME, MERubroEmpleo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEInformacionMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEInformacionMicroempresa")
    public JAXBElement<MEInformacionMicroempresa> createMEInformacionMicroempresa(MEInformacionMicroempresa value) {
        return new JAXBElement<MEInformacionMicroempresa>(_MEInformacionMicroempresa_QNAME, MEInformacionMicroempresa.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEPasivo")
    public JAXBElement<MEPasivo> createMEPasivo(MEPasivo value) {
        return new JAXBElement<MEPasivo>(_MEPasivo_QNAME, MEPasivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEPasivos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEPasivos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEPasivos")
    public JAXBElement<MEPasivos> createMEPasivos(MEPasivos value) {
        return new JAXBElement<MEPasivos>(_MEPasivos_QNAME, MEPasivos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MERelacion")
    public JAXBElement<MERelacion> createMERelacion(MERelacion value) {
        return new JAXBElement<MERelacion>(_MERelacion_QNAME, MERelacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MECertificadoRelacionesComerciales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MECertificadoRelacionesComerciales")
    public JAXBElement<MECertificadoRelacionesComerciales> createMECertificadoRelacionesComerciales(MECertificadoRelacionesComerciales value) {
        return new JAXBElement<MECertificadoRelacionesComerciales>(_MECertificadoRelacionesComerciales_QNAME, MECertificadoRelacionesComerciales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSFuncionario")
    public JAXBElement<MSFuncionario> createMSFuncionario(MSFuncionario value) {
        return new JAXBElement<MSFuncionario>(_MSFuncionario_QNAME, MSFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEFuncionario }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEFuncionario }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEFuncionario")
    public JAXBElement<MEFuncionario> createMEFuncionario(MEFuncionario value) {
        return new JAXBElement<MEFuncionario>(_MEFuncionario_QNAME, MEFuncionario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSVinculado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSVinculado")
    public JAXBElement<MSVinculado> createMSVinculado(MSVinculado value) {
        return new JAXBElement<MSVinculado>(_MSVinculado_QNAME, MSVinculado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfRelacionesAsignacion")
    public JAXBElement<ArrayOfRelacionesAsignacion> createArrayOfRelacionesAsignacion(ArrayOfRelacionesAsignacion value) {
        return new JAXBElement<ArrayOfRelacionesAsignacion>(_ArrayOfRelacionesAsignacion_QNAME, ArrayOfRelacionesAsignacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelacionesAsignacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelacionesAsignacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RelacionesAsignacion")
    public JAXBElement<RelacionesAsignacion> createRelacionesAsignacion(RelacionesAsignacion value) {
        return new JAXBElement<RelacionesAsignacion>(_RelacionesAsignacion_QNAME, RelacionesAsignacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEVinculado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEVinculado }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEVinculado")
    public JAXBElement<MEVinculado> createMEVinculado(MEVinculado value) {
        return new JAXBElement<MEVinculado>(_MEVinculado_QNAME, MEVinculado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesVinculacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesVinculacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfRelacionesVinculacion")
    public JAXBElement<ArrayOfRelacionesVinculacion> createArrayOfRelacionesVinculacion(ArrayOfRelacionesVinculacion value) {
        return new JAXBElement<ArrayOfRelacionesVinculacion>(_ArrayOfRelacionesVinculacion_QNAME, ArrayOfRelacionesVinculacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelacionesVinculacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelacionesVinculacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RelacionesVinculacion")
    public JAXBElement<RelacionesVinculacion> createRelacionesVinculacion(RelacionesVinculacion value) {
        return new JAXBElement<RelacionesVinculacion>(_RelacionesVinculacion_QNAME, RelacionesVinculacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAtributo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAtributo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfRelacionesAtributo")
    public JAXBElement<ArrayOfRelacionesAtributo> createArrayOfRelacionesAtributo(ArrayOfRelacionesAtributo value) {
        return new JAXBElement<ArrayOfRelacionesAtributo>(_ArrayOfRelacionesAtributo_QNAME, ArrayOfRelacionesAtributo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelacionesAtributo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelacionesAtributo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RelacionesAtributo")
    public JAXBElement<RelacionesAtributo> createRelacionesAtributo(RelacionesAtributo value) {
        return new JAXBElement<RelacionesAtributo>(_RelacionesAtributo_QNAME, RelacionesAtributo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaRelaciones }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaRelaciones")
    public JAXBElement<MSConsultaRelaciones> createMSConsultaRelaciones(MSConsultaRelaciones value) {
        return new JAXBElement<MSConsultaRelaciones>(_MSConsultaRelaciones_QNAME, MSConsultaRelaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MERelacionCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MERelacionCliente")
    public JAXBElement<MERelacionCliente> createMERelacionCliente(MERelacionCliente value) {
        return new JAXBElement<MERelacionCliente>(_MERelacionCliente_QNAME, MERelacionCliente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSConsultaParticipacionAccionaria }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSConsultaParticipacionAccionaria }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSConsultaParticipacionAccionaria")
    public JAXBElement<MSConsultaParticipacionAccionaria> createMSConsultaParticipacionAccionaria(MSConsultaParticipacionAccionaria value) {
        return new JAXBElement<MSConsultaParticipacionAccionaria>(_MSConsultaParticipacionAccionaria_QNAME, MSConsultaParticipacionAccionaria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ArrayOfAccionistaAdministrador")
    public JAXBElement<ArrayOfAccionistaAdministrador> createArrayOfAccionistaAdministrador(ArrayOfAccionistaAdministrador value) {
        return new JAXBElement<ArrayOfAccionistaAdministrador>(_ArrayOfAccionistaAdministrador_QNAME, ArrayOfAccionistaAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "AccionistaAdministrador")
    public JAXBElement<AccionistaAdministrador> createAccionistaAdministrador(AccionistaAdministrador value) {
        return new JAXBElement<AccionistaAdministrador>(_AccionistaAdministrador_QNAME, AccionistaAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEAccionistaAdministrador")
    public JAXBElement<MEAccionistaAdministrador> createMEAccionistaAdministrador(MEAccionistaAdministrador value) {
        return new JAXBElement<MEAccionistaAdministrador>(_MEAccionistaAdministrador_QNAME, MEAccionistaAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MSArchivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MSArchivo")
    public JAXBElement<MSArchivo> createMSArchivo(MSArchivo value) {
        return new JAXBElement<MSArchivo>(_MSArchivo_QNAME, MSArchivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MEUsoDatosPersonales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MEUsoDatosPersonales }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MEUsoDatosPersonales")
    public JAXBElement<MEUsoDatosPersonales> createMEUsoDatosPersonales(MEUsoDatosPersonales value) {
        return new JAXBElement<MEUsoDatosPersonales>(_MEUsoDatosPersonales_QNAME, MEUsoDatosPersonales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Formulario", scope = MEUsoDatosPersonales.class)
    public JAXBElement<String> createMEUsoDatosPersonalesFormulario(String value) {
        return new JAXBElement<String>(_MEUsoDatosPersonalesFormulario_QNAME, String.class, MEUsoDatosPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionCliente", scope = MEUsoDatosPersonales.class)
    public JAXBElement<String> createMEUsoDatosPersonalesIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEUsoDatosPersonalesIdentificacionCliente_QNAME, String.class, MEUsoDatosPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Archivo", scope = MSArchivo.class)
    public JAXBElement<byte[]> createMSArchivoArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_MSArchivoArchivo_QNAME, byte[].class, MSArchivo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Cargo", scope = MEAccionistaAdministrador.class)
    public JAXBElement<String> createMEAccionistaAdministradorCargo(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorCargo_QNAME, String.class, MEAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEAccionistaAdministrador.class)
    public JAXBElement<String> createMEAccionistaAdministradorIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionJuridico", scope = MEAccionistaAdministrador.class)
    public JAXBElement<String> createMEAccionistaAdministradorIdentificacionJuridico(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacionJuridico_QNAME, String.class, MEAccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CargoAccionista", scope = AccionistaAdministrador.class)
    public JAXBElement<String> createAccionistaAdministradorCargoAccionista(String value) {
        return new JAXBElement<String>(_AccionistaAdministradorCargoAccionista_QNAME, String.class, AccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreEmpresa", scope = AccionistaAdministrador.class)
    public JAXBElement<String> createAccionistaAdministradorNombreEmpresa(String value) {
        return new JAXBElement<String>(_AccionistaAdministradorNombreEmpresa_QNAME, String.class, AccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RucEmpresa", scope = AccionistaAdministrador.class)
    public JAXBElement<String> createAccionistaAdministradorRucEmpresa(String value) {
        return new JAXBElement<String>(_AccionistaAdministradorRucEmpresa_QNAME, String.class, AccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Tipo", scope = AccionistaAdministrador.class)
    public JAXBElement<String> createAccionistaAdministradorTipo(String value) {
        return new JAXBElement<String>(_AccionistaAdministradorTipo_QNAME, String.class, AccionistaAdministrador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAccionistaAdministrador }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfAccionistaAdministrador }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Relaciones", scope = MSConsultaParticipacionAccionaria.class)
    public JAXBElement<ArrayOfAccionistaAdministrador> createMSConsultaParticipacionAccionariaRelaciones(ArrayOfAccionistaAdministrador value) {
        return new JAXBElement<ArrayOfAccionistaAdministrador>(_MSConsultaParticipacionAccionariaRelaciones_QNAME, ArrayOfAccionistaAdministrador.class, MSConsultaParticipacionAccionaria.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MERelacionCliente.class)
    public JAXBElement<String> createMERelacionClienteIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MERelacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionRelacion", scope = MERelacionCliente.class)
    public JAXBElement<String> createMERelacionClienteIdentificacionRelacion(String value) {
        return new JAXBElement<String>(_MERelacionClienteIdentificacionRelacion_QNAME, String.class, MERelacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoRelacion", scope = MERelacionCliente.class)
    public JAXBElement<String> createMERelacionClienteTipoRelacion(String value) {
        return new JAXBElement<String>(_MERelacionClienteTipoRelacion_QNAME, String.class, MERelacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Relaciones", scope = MSConsultaRelaciones.class)
    public JAXBElement<ArrayOfRelacionesAsignacion> createMSConsultaRelacionesRelaciones(ArrayOfRelacionesAsignacion value) {
        return new JAXBElement<ArrayOfRelacionesAsignacion>(_MSConsultaParticipacionAccionariaRelaciones_QNAME, ArrayOfRelacionesAsignacion.class, MSConsultaRelaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAtributo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAtributo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "AtributosRelacion", scope = RelacionesVinculacion.class)
    public JAXBElement<ArrayOfRelacionesAtributo> createRelacionesVinculacionAtributosRelacion(ArrayOfRelacionesAtributo value) {
        return new JAXBElement<ArrayOfRelacionesAtributo>(_RelacionesVinculacionAtributosRelacion_QNAME, ArrayOfRelacionesAtributo.class, RelacionesVinculacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = RelacionesVinculacion.class)
    public JAXBElement<String> createRelacionesVinculacionIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, RelacionesVinculacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CausalVinculacion", scope = MEVinculado.class)
    public JAXBElement<String> createMEVinculadoCausalVinculacion(String value) {
        return new JAXBElement<String>(_MEVinculadoCausalVinculacion_QNAME, String.class, MEVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaVinculacion", scope = MEVinculado.class)
    public JAXBElement<XMLGregorianCalendar> createMEVinculadoFechaVinculacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MEVinculadoFechaVinculacion_QNAME, XMLGregorianCalendar.class, MEVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionCliente", scope = MEVinculado.class)
    public JAXBElement<String> createMEVinculadoIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEUsoDatosPersonalesIdentificacionCliente_QNAME, String.class, MEVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesVinculacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesVinculacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Relaciones", scope = MEVinculado.class)
    public JAXBElement<ArrayOfRelacionesVinculacion> createMEVinculadoRelaciones(ArrayOfRelacionesVinculacion value) {
        return new JAXBElement<ArrayOfRelacionesVinculacion>(_MSConsultaParticipacionAccionariaRelaciones_QNAME, ArrayOfRelacionesVinculacion.class, MEVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoVinculacion", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionCodigoVinculacion(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionCodigoVinculacion_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaVinculacion", scope = RelacionesAsignacion.class)
    public JAXBElement<XMLGregorianCalendar> createRelacionesAsignacionFechaVinculacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MEVinculadoFechaVinculacion_QNAME, XMLGregorianCalendar.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdInstancia", scope = RelacionesAsignacion.class)
    public JAXBElement<Integer> createRelacionesAsignacionIdInstancia(Integer value) {
        return new JAXBElement<Integer>(_RelacionesAsignacionIdInstancia_QNAME, Integer.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdRelacion", scope = RelacionesAsignacion.class)
    public JAXBElement<Integer> createRelacionesAsignacionIdRelacion(Integer value) {
        return new JAXBElement<Integer>(_RelacionesAsignacionIdRelacion_QNAME, Integer.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionD", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionIdentificacionD(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionIdentificacionD_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionI", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionIdentificacionI(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionIdentificacionI_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreD", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionNombreD(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionNombreD_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreI", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionNombreI(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionNombreI_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Relacion", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionRelacion(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionRelacion_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoRelacion", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionTipoRelacion(String value) {
        return new JAXBElement<String>(_MERelacionClienteTipoRelacion_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Validacion", scope = RelacionesAsignacion.class)
    public JAXBElement<String> createRelacionesAsignacionValidacion(String value) {
        return new JAXBElement<String>(_RelacionesAsignacionValidacion_QNAME, String.class, RelacionesAsignacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoVinculado", scope = MSVinculado.class)
    public JAXBElement<String> createMSVinculadoCodigoVinculado(String value) {
        return new JAXBElement<String>(_MSVinculadoCodigoVinculado_QNAME, String.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DescripcionVinculado", scope = MSVinculado.class)
    public JAXBElement<String> createMSVinculadoDescripcionVinculado(String value) {
        return new JAXBElement<String>(_MSVinculadoDescripcionVinculado_QNAME, String.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaFinFuncionario", scope = MSVinculado.class)
    public JAXBElement<XMLGregorianCalendar> createMSVinculadoFechaFinFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaFinFuncionario_QNAME, XMLGregorianCalendar.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaInicioFuncionario", scope = MSVinculado.class)
    public JAXBElement<XMLGregorianCalendar> createMSVinculadoFechaInicioFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaInicioFuncionario_QNAME, XMLGregorianCalendar.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaVinculacion", scope = MSVinculado.class)
    public JAXBElement<XMLGregorianCalendar> createMSVinculadoFechaVinculacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MEVinculadoFechaVinculacion_QNAME, XMLGregorianCalendar.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MSVinculado.class)
    public JAXBElement<String> createMSVinculadoIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresCompletos", scope = MSVinculado.class)
    public JAXBElement<String> createMSVinculadoNombresCompletos(String value) {
        return new JAXBElement<String>(_MSVinculadoNombresCompletos_QNAME, String.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRelacionesAsignacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Relaciones", scope = MSVinculado.class)
    public JAXBElement<ArrayOfRelacionesAsignacion> createMSVinculadoRelaciones(ArrayOfRelacionesAsignacion value) {
        return new JAXBElement<ArrayOfRelacionesAsignacion>(_MSConsultaParticipacionAccionariaRelaciones_QNAME, ArrayOfRelacionesAsignacion.class, MSVinculado.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaFinFuncionario", scope = MEFuncionario.class)
    public JAXBElement<XMLGregorianCalendar> createMEFuncionarioFechaFinFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaFinFuncionario_QNAME, XMLGregorianCalendar.class, MEFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaInicioFuncionario", scope = MEFuncionario.class)
    public JAXBElement<XMLGregorianCalendar> createMEFuncionarioFechaInicioFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaInicioFuncionario_QNAME, XMLGregorianCalendar.class, MEFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionCliente", scope = MEFuncionario.class)
    public JAXBElement<String> createMEFuncionarioIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEUsoDatosPersonalesIdentificacionCliente_QNAME, String.class, MEFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaFinFuncionario", scope = MSFuncionario.class)
    public JAXBElement<XMLGregorianCalendar> createMSFuncionarioFechaFinFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaFinFuncionario_QNAME, XMLGregorianCalendar.class, MSFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaInicioFuncionario", scope = MSFuncionario.class)
    public JAXBElement<XMLGregorianCalendar> createMSFuncionarioFechaInicioFuncionario(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MSVinculadoFechaInicioFuncionario_QNAME, XMLGregorianCalendar.class, MSFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MSFuncionario.class)
    public JAXBElement<String> createMSFuncionarioIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MSFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresCompletos", scope = MSFuncionario.class)
    public JAXBElement<String> createMSFuncionarioNombresCompletos(String value) {
        return new JAXBElement<String>(_MSVinculadoNombresCompletos_QNAME, String.class, MSFuncionario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaGenerado", scope = MECertificadoRelacionesComerciales.class)
    public JAXBElement<String> createMECertificadoRelacionesComercialesFechaGenerado(String value) {
        return new JAXBElement<String>(_MECertificadoRelacionesComercialesFechaGenerado_QNAME, String.class, MECertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "GeneradoOficina", scope = MECertificadoRelacionesComerciales.class)
    public JAXBElement<String> createMECertificadoRelacionesComercialesGeneradoOficina(String value) {
        return new JAXBElement<String>(_MECertificadoRelacionesComercialesGeneradoOficina_QNAME, String.class, MECertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdNumeroCuenta", scope = MECertificadoRelacionesComerciales.class)
    public JAXBElement<Integer> createMECertificadoRelacionesComercialesIdNumeroCuenta(Integer value) {
        return new JAXBElement<Integer>(_MECertificadoRelacionesComercialesIdNumeroCuenta_QNAME, Integer.class, MECertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroCuenta", scope = MECertificadoRelacionesComerciales.class)
    public JAXBElement<String> createMECertificadoRelacionesComercialesNumeroCuenta(String value) {
        return new JAXBElement<String>(_MECertificadoRelacionesComercialesNumeroCuenta_QNAME, String.class, MECertificadoRelacionesComerciales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "AtributoRelacionCasado", scope = MERelacion.class)
    public JAXBElement<String> createMERelacionAtributoRelacionCasado(String value) {
        return new JAXBElement<String>(_MERelacionAtributoRelacionCasado_QNAME, String.class, MERelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MERelacion.class)
    public JAXBElement<String> createMERelacionIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MERelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionPareja", scope = MERelacion.class)
    public JAXBElement<String> createMERelacionIdentificacionPareja(String value) {
        return new JAXBElement<String>(_MERelacionIdentificacionPareja_QNAME, String.class, MERelacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pasivos", scope = MEPasivos.class)
    public JAXBElement<ArrayOfDetallePasivo> createMEPasivosPasivos(ArrayOfDetallePasivo value) {
        return new JAXBElement<ArrayOfDetallePasivo>(_MEPasivosPasivos_QNAME, ArrayOfDetallePasivo.class, MEPasivos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pasivo", scope = MEPasivo.class)
    public JAXBElement<DetallePasivo> createMEPasivoPasivo(DetallePasivo value) {
        return new JAXBElement<DetallePasivo>(_MEPasivoPasivo_QNAME, DetallePasivo.class, MEPasivo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleProductoMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ListaDetalleProductos", scope = MEInformacionMicroempresa.class)
    public JAXBElement<ArrayOfDetalleProductoMicroempresa> createMEInformacionMicroempresaListaDetalleProductos(ArrayOfDetalleProductoMicroempresa value) {
        return new JAXBElement<ArrayOfDetalleProductoMicroempresa>(_MEInformacionMicroempresaListaDetalleProductos_QNAME, ArrayOfDetalleProductoMicroempresa.class, MEInformacionMicroempresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfManoObraMicroempresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ListaManoObra", scope = MEInformacionMicroempresa.class)
    public JAXBElement<ArrayOfManoObraMicroempresa> createMEInformacionMicroempresaListaManoObra(ArrayOfManoObraMicroempresa value) {
        return new JAXBElement<ArrayOfManoObraMicroempresa>(_MEInformacionMicroempresaListaManoObra_QNAME, ArrayOfManoObraMicroempresa.class, MEInformacionMicroempresa.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRubroIngresoEgreso }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Rubros", scope = MERubroEmpleo.class)
    public JAXBElement<ArrayOfRubroIngresoEgreso> createMERubroEmpleoRubros(ArrayOfRubroIngresoEgreso value) {
        return new JAXBElement<ArrayOfRubroIngresoEgreso>(_MERubroEmpleoRubros_QNAME, ArrayOfRubroIngresoEgreso.class, MERubroEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetalleActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Activo", scope = MEActivo.class)
    public JAXBElement<DetalleActivo> createMEActivoActivo(DetalleActivo value) {
        return new JAXBElement<DetalleActivo>(_MEActivoActivo_QNAME, DetalleActivo.class, MEActivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OrigenOtrosGastos", scope = EstadoSituacion.class)
    public JAXBElement<String> createEstadoSituacionOrigenOtrosGastos(String value) {
        return new JAXBElement<String>(_EstadoSituacionOrigenOtrosGastos_QNAME, String.class, EstadoSituacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OrigenOtrosIngresos", scope = EstadoSituacion.class)
    public JAXBElement<String> createEstadoSituacionOrigenOtrosIngresos(String value) {
        return new JAXBElement<String>(_EstadoSituacionOrigenOtrosIngresos_QNAME, String.class, EstadoSituacion.class, value);
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
        return new JAXBElement<String>(_AccionistaAdministradorTipo_QNAME, String.class, DetalleActivo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleActivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Activos", scope = MSInformacionFinanciera.class)
    public JAXBElement<ArrayOfDetalleActivo> createMSInformacionFinancieraActivos(ArrayOfDetalleActivo value) {
        return new JAXBElement<ArrayOfDetalleActivo>(_MSInformacionFinancieraActivos_QNAME, ArrayOfDetalleActivo.class, MSInformacionFinanciera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetallePasivo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pasivos", scope = MSInformacionFinanciera.class)
    public JAXBElement<ArrayOfDetallePasivo> createMSInformacionFinancieraPasivos(ArrayOfDetallePasivo value) {
        return new JAXBElement<ArrayOfDetallePasivo>(_MEPasivosPasivos_QNAME, ArrayOfDetallePasivo.class, MSInformacionFinanciera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EstadoSituacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ResumenEstadoSituacion", scope = MSInformacionFinanciera.class)
    public JAXBElement<EstadoSituacion> createMSInformacionFinancieraResumenEstadoSituacion(EstadoSituacion value) {
        return new JAXBElement<EstadoSituacion>(_MSInformacionFinancieraResumenEstadoSituacion_QNAME, EstadoSituacion.class, MSInformacionFinanciera.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Formulario", scope = MEFormularioOrigenFondos.class)
    public JAXBElement<DatosOrigenFondos> createMEFormularioOrigenFondosFormulario(DatosOrigenFondos value) {
        return new JAXBElement<DatosOrigenFondos>(_MEUsoDatosPersonalesFormulario_QNAME, DatosOrigenFondos.class, MEFormularioOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FormaRecepcion", scope = DetalleOrigenFondos.class)
    public JAXBElement<String> createDetalleOrigenFondosFormaRecepcion(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosFormaRecepcion_QNAME, String.class, DetalleOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Modulo", scope = DetalleOrigenFondos.class)
    public JAXBElement<String> createDetalleOrigenFondosModulo(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosModulo_QNAME, String.class, DetalleOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Oficina", scope = DetalleOrigenFondos.class)
    public JAXBElement<String> createDetalleOrigenFondosOficina(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosOficina_QNAME, String.class, DetalleOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Producto", scope = DetalleOrigenFondos.class)
    public JAXBElement<String> createDetalleOrigenFondosProducto(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosProducto_QNAME, String.class, DetalleOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "UsuarioTransaccion", scope = DetalleOrigenFondos.class)
    public JAXBElement<String> createDetalleOrigenFondosUsuarioTransaccion(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosUsuarioTransaccion_QNAME, String.class, DetalleOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomicaCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosActividadEconomicaCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosActividadEconomicaCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomicaClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosActividadEconomicaClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosActividadEconomicaClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Canton", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosCanton(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosCanton_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosCiudadCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosCiudadCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosCiudadClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosCiudadClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DestinoFondos", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosDestinoFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosDestinoFondos_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDetalleOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetallesFormulario", scope = DatosOrigenFondos.class)
    public JAXBElement<ArrayOfDetalleOrigenFondos> createDatosOrigenFondosDetallesFormulario(ArrayOfDetalleOrigenFondos value) {
        return new JAXBElement<ArrayOfDetalleOrigenFondos>(_DatosOrigenFondosDetallesFormulario_QNAME, ArrayOfDetalleOrigenFondos.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DomicilioCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosDomicilioCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosDomicilioCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DomicilioClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosDomicilioClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosDomicilioClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaEnvioOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<XMLGregorianCalendar> createDatosOrigenFondosFechaEnvioOtp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosOrigenFondosFechaEnvioOtp_QNAME, XMLGregorianCalendar.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaValidacionOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<XMLGregorianCalendar> createDatosOrigenFondosFechaValidacionOtp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatosOrigenFondosFechaValidacionOtp_QNAME, XMLGregorianCalendar.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<Integer> createDatosOrigenFondosIdClienteTransaccion(Integer value) {
        return new JAXBElement<Integer>(_DatosOrigenFondosIdClienteTransaccion_QNAME, Integer.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdControlFormulario", scope = DatosOrigenFondos.class)
    public JAXBElement<Integer> createDatosOrigenFondosIdControlFormulario(Integer value) {
        return new JAXBElement<Integer>(_DatosOrigenFondosIdControlFormulario_QNAME, Integer.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdDatosOrigenFondos", scope = DatosOrigenFondos.class)
    public JAXBElement<Integer> createDatosOrigenFondosIdDatosOrigenFondos(Integer value) {
        return new JAXBElement<Integer>(_DatosOrigenFondosIdDatosOrigenFondos_QNAME, Integer.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdGeneracionOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<Integer> createDatosOrigenFondosIdGeneracionOtp(Integer value) {
        return new JAXBElement<Integer>(_DatosOrigenFondosIdGeneracionOtp_QNAME, Integer.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdVerificacionBiometria", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosIdVerificacionBiometria(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosIdVerificacionBiometria_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdVerificacionOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<Integer> createDatosOrigenFondosIdVerificacionOtp(Integer value) {
        return new JAXBElement<Integer>(_DatosOrigenFondosIdVerificacionOtp_QNAME, Integer.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosIdentificacionCliente(String value) {
        return new JAXBElement<String>(_MEUsoDatosPersonalesIdentificacionCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosIdentificacionClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosIdentificacionClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "InfoGeneracionOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosInfoGeneracionOtp(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosInfoGeneracionOtp_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "InfoVerificacionOtp", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosInfoVerificacionOtp(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosInfoVerificacionOtp_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNombreCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosNombreCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNombreClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosNombreClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreDepositante", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNombreDepositante(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosNombreDepositante_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreUsuarioTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNombreUsuarioTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosNombreUsuarioTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroCuenta", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNumeroCuenta(String value) {
        return new JAXBElement<String>(_MECertificadoRelacionesComercialesNumeroCuenta_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroFormulario", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosNumeroFormulario(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosNumeroFormulario_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OcupacionCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosOcupacionCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosOcupacionCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OcupacionClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosOcupacionClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosOcupacionClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Oficina", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosOficina(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosOficina_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OrigenFondos", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosOrigenFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosOrigenFondos_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PaisResidencia", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosPaisResidencia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosPaisResidencia_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parroquia", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosParroquia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosParroquia_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProfesionCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosProfesionCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProfesionCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProfesionClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosProfesionClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProfesionClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Provincia", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosProvincia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProvincia_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "RepresentanteLegalCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosRepresentanteLegalCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosRepresentanteLegalCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoCliente", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosTelefonoCliente(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosTelefonoCliente_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoClienteTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosTelefonoClienteTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosTelefonoClienteTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoConvencional", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosTelefonoConvencional(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosTelefonoConvencional_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoProducto", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosTipoProducto(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosTipoProducto_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosTipoTransaccion(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosTipoTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "UsuarioTransaccion", scope = DatosOrigenFondos.class)
    public JAXBElement<String> createDatosOrigenFondosUsuarioTransaccion(String value) {
        return new JAXBElement<String>(_DetalleOrigenFondosUsuarioTransaccion_QNAME, String.class, DatosOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosOrigenFondos }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FormulariosOrigenFondos", scope = MSConsultaOrigenFondos.class)
    public JAXBElement<ArrayOfDatosOrigenFondos> createMSConsultaOrigenFondosFormulariosOrigenFondos(ArrayOfDatosOrigenFondos value) {
        return new JAXBElement<ArrayOfDatosOrigenFondos>(_MSConsultaOrigenFondosFormulariosOrigenFondos_QNAME, ArrayOfDatosOrigenFondos.class, MSConsultaOrigenFondos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEIdentificacion.class)
    public JAXBElement<String> createMEIdentificacionIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEIdentificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomica", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoActividadEconomica_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipal", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCallePrincipal_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleTransversal", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoCalleTransversal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCalleTransversal_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CantonDireccion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoCantonDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCantonDireccion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadDireccion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoCiudadDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCiudadDireccion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoOficial", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoCodigoOficial(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCodigoOficial_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Estudios", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoEstudios(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEstudios_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionPareja", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoIdentificacionPareja(String value) {
        return new JAXBElement<String>(_MERelacionIdentificacionPareja_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nacionalidad", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoNacionalidad(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNacionalidad_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoNombres(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresPareja", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoNombresPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombresPareja_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeracionDireccion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoNumeracionDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNumeracionDireccion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParroquiaDireccion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoParroquiaDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoParroquiaDireccion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrimerApellido", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoPrimerApellido(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoPrimerApellido_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrimerApellidoPareja", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoPrimerApellidoPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoPrimerApellidoPareja_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProvinciaDireccion", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoProvinciaDireccion(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoProvinciaDireccion_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "SegundoApellido", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoSegundoApellido(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoSegundoApellido_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "SegundoApellidoPareja", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoSegundoApellidoPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoSegundoApellidoPareja_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoCelular", scope = MECreacionClienteResumido.class)
    public JAXBElement<String> createMECreacionClienteResumidoTelefonoCelular(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoTelefonoCelular_QNAME, String.class, MECreacionClienteResumido.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEDatosEspecificosCliente.class)
    public JAXBElement<String> createMEDatosEspecificosClienteIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEDatosEspecificosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionOtro", scope = MSDatosContacto.class)
    public JAXBElement<String> createMSDatosContactoIdentificacionOtro(String value) {
        return new JAXBElement<String>(_MSDatosContactoIdentificacionOtro_QNAME, String.class, MSDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Celular", scope = MEDatosContacto.class)
    public JAXBElement<String> createMEDatosContactoCelular(String value) {
        return new JAXBElement<String>(_MEDatosContactoCelular_QNAME, String.class, MEDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoPais", scope = MEDatosContacto.class)
    public JAXBElement<String> createMEDatosContactoCodigoPais(String value) {
        return new JAXBElement<String>(_MEDatosContactoCodigoPais_QNAME, String.class, MEDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MEDatosContacto.class)
    public JAXBElement<String> createMEDatosContactoEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MEDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEDatosContacto.class)
    public JAXBElement<String> createMEDatosContactoIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEDatosContacto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DestinoFondos", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasDestinoFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosDestinoFondos_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaModificacion", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<XMLGregorianCalendar> createExtractoLegalSociosAccionistasFechaModificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExtractoLegalSociosAccionistasFechaModificacion_QNAME, XMLGregorianCalendar.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdCliente", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<Integer> createExtractoLegalSociosAccionistasIdCliente(Integer value) {
        return new JAXBElement<Integer>(_ExtractoLegalSociosAccionistasIdCliente_QNAME, Integer.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdSocio", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<Integer> createExtractoLegalSociosAccionistasIdSocio(Integer value) {
        return new JAXBElement<Integer>(_ExtractoLegalSociosAccionistasIdSocio_QNAME, Integer.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "LoginModificacion", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasLoginModificacion(String value) {
        return new JAXBElement<String>(_ExtractoLegalSociosAccionistasLoginModificacion_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MontoAporte", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<BigDecimal> createExtractoLegalSociosAccionistasMontoAporte(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExtractoLegalSociosAccionistasMontoAporte_QNAME, BigDecimal.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombre", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasNombre(String value) {
        return new JAXBElement<String>(_ExtractoLegalSociosAccionistasNombre_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OrigenFondos", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasOrigenFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosOrigenFondos_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Porcentaje", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<BigDecimal> createExtractoLegalSociosAccionistasPorcentaje(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ExtractoLegalSociosAccionistasPorcentaje_QNAME, BigDecimal.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoSocio", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<Integer> createExtractoLegalSociosAccionistasTipoSocio(Integer value) {
        return new JAXBElement<Integer>(_ExtractoLegalSociosAccionistasTipoSocio_QNAME, Integer.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Vinculado", scope = ExtractoLegalSociosAccionistas.class)
    public JAXBElement<String> createExtractoLegalSociosAccionistasVinculado(String value) {
        return new JAXBElement<String>(_ExtractoLegalSociosAccionistasVinculado_QNAME, String.class, ExtractoLegalSociosAccionistas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfExtractoLegalSociosAccionistas }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Accionistas", scope = MSConsultaClientes.class)
    public JAXBElement<ArrayOfExtractoLegalSociosAccionistas> createMSConsultaClientesAccionistas(ArrayOfExtractoLegalSociosAccionistas value) {
        return new JAXBElement<ArrayOfExtractoLegalSociosAccionistas>(_MSConsultaClientesAccionistas_QNAME, ArrayOfExtractoLegalSociosAccionistas.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomica", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoActividadEconomica_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ApellidosPareja", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesApellidosPareja(String value) {
        return new JAXBElement<String>(_MSConsultaClientesApellidosPareja_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ApellidosRepresentante", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesApellidosRepresentante(String value) {
        return new JAXBElement<String>(_MSConsultaClientesApellidosRepresentante_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipalEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCallePrincipalEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCallePrincipalEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleSecundariaEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCalleSecundariaEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCalleSecundariaEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Cargo", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCargo(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorCargo_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CargoDescripcion", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCargoDescripcion(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCargoDescripcion_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ciudad", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCiudad(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCiudad_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CiudadEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesCiudadEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCiudadEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DescripcionNacionalidad", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesDescripcionNacionalidad(String value) {
        return new JAXBElement<String>(_MSConsultaClientesDescripcionNacionalidad_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DestinoFondos", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesDestinoFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosDestinoFondos_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DetalleProductoServicios", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesDetalleProductoServicios(String value) {
        return new JAXBElement<String>(_MSConsultaClientesDetalleProductoServicios_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Direccion", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesDireccion(String value) {
        return new JAXBElement<String>(_MSConsultaClientesDireccion_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EmailOficina", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesEmailOficina(String value) {
        return new JAXBElement<String>(_MSConsultaClientesEmailOficina_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EmailRepresentante", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesEmailRepresentante(String value) {
        return new JAXBElement<String>(_MSConsultaClientesEmailRepresentante_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EstadoCivil", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesEstadoCivil(String value) {
        return new JAXBElement<String>(_MSConsultaClientesEstadoCivil_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EstadoRelacion", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesEstadoRelacion(String value) {
        return new JAXBElement<String>(_MSConsultaClientesEstadoRelacion_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionConyuge", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_MSConsultaClientesIdentificacionConyuge_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionRepresentante", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesIdentificacionRepresentante(String value) {
        return new JAXBElement<String>(_MSConsultaClientesIdentificacionRepresentante_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionTercero", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesIdentificacionTercero(String value) {
        return new JAXBElement<String>(_MSConsultaClientesIdentificacionTercero_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Institucion", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesInstitucion(String value) {
        return new JAXBElement<String>(_DetallePasivoInstitucion_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NacionalidadEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNacionalidadEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesNacionalidadEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NacionalidadRepresentante", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNacionalidadRepresentante(String value) {
        return new JAXBElement<String>(_MSConsultaClientesNacionalidadRepresentante_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNombreEmpresa(String value) {
        return new JAXBElement<String>(_AccionistaAdministradorNombreEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresCompletos", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNombresCompletos(String value) {
        return new JAXBElement<String>(_MSVinculadoNombresCompletos_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresPareja", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNombresPareja(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombresPareja_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresRepresentante", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNombresRepresentante(String value) {
        return new JAXBElement<String>(_MSConsultaClientesNombresRepresentante_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroDireccionEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesNumeroDireccionEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesNumeroDireccionEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "OrigenFondos", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesOrigenFondos(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosOrigenFondos_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pais", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesPais(String value) {
        return new JAXBElement<String>(_MSConsultaClientesPais_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PaisEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesPaisEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesPaisEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parentesco", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesParentesco(String value) {
        return new JAXBElement<String>(_MSConsultaClientesParentesco_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parroquia", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesParroquia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosParroquia_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ParroquiaEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesParroquiaEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesParroquiaEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Profesion", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesProfesion(String value) {
        return new JAXBElement<String>(_MSConsultaClientesProfesion_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Provincia", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesProvincia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProvincia_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ProvinciaEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesProvinciaEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesProvinciaEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Sexo", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesSexo(String value) {
        return new JAXBElement<String>(_MSConsultaClientesSexo_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoCelular", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesTelefonoCelular(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoTelefonoCelular_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoEmpresa", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesTelefonoEmpresa(String value) {
        return new JAXBElement<String>(_MSConsultaClientesTelefonoEmpresa_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoFijo", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesTelefonoFijo(String value) {
        return new JAXBElement<String>(_MSConsultaClientesTelefonoFijo_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoRepresentate", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesTelefonoRepresentate(String value) {
        return new JAXBElement<String>(_MSConsultaClientesTelefonoRepresentate_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoIdentificacionConyuge", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesTipoIdentificacionConyuge(String value) {
        return new JAXBElement<String>(_MSConsultaClientesTipoIdentificacionConyuge_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "UbicacionGeografica", scope = MSConsultaClientes.class)
    public JAXBElement<String> createMSConsultaClientesUbicacionGeografica(String value) {
        return new JAXBElement<String>(_MSConsultaClientesUbicacionGeografica_QNAME, String.class, MSConsultaClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenciaPersonal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ReferenciaPersonal", scope = MEReferenciasPersonales.class)
    public JAXBElement<ReferenciaPersonal> createMEReferenciasPersonalesReferenciaPersonal(ReferenciaPersonal value) {
        return new JAXBElement<ReferenciaPersonal>(_ReferenciaPersonal_QNAME, ReferenciaPersonal.class, MEReferenciasPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipal", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCallePrincipal_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ClienteReferencia", scope = ReferenciaPersonal.class)
    public JAXBElement<Integer> createReferenciaPersonalClienteReferencia(Integer value) {
        return new JAXBElement<Integer>(_ReferenciaPersonalClienteReferencia_QNAME, Integer.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaRegistro", scope = ReferenciaPersonal.class)
    public JAXBElement<XMLGregorianCalendar> createReferenciaPersonalFechaRegistro(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReferenciaPersonalFechaRegistro_QNAME, XMLGregorianCalendar.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdRelacion", scope = ReferenciaPersonal.class)
    public JAXBElement<Integer> createReferenciaPersonalIdRelacion(Integer value) {
        return new JAXBElement<Integer>(_RelacionesAsignacionIdRelacion_QNAME, Integer.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdTipoRelacion", scope = ReferenciaPersonal.class)
    public JAXBElement<Integer> createReferenciaPersonalIdTipoRelacion(Integer value) {
        return new JAXBElement<Integer>(_ReferenciaPersonalIdTipoRelacion_QNAME, Integer.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "LugarTrabajo", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalLugarTrabajo(String value) {
        return new JAXBElement<String>(_ReferenciaPersonalLugarTrabajo_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombre", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalNombre(String value) {
        return new JAXBElement<String>(_ExtractoLegalSociosAccionistasNombre_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nro", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalNro(String value) {
        return new JAXBElement<String>(_ReferenciaPersonalNro_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalObservaciones(String value) {
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ocupacion", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalOcupacion(String value) {
        return new JAXBElement<String>(_ReferenciaPersonalOcupacion_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parentesco", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalParentesco(String value) {
        return new JAXBElement<String>(_MSConsultaClientesParentesco_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Telefono", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalTelefono(String value) {
        return new JAXBElement<String>(_ReferenciaPersonalTelefono_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Transversal", scope = ReferenciaPersonal.class)
    public JAXBElement<String> createReferenciaPersonalTransversal(String value) {
        return new JAXBElement<String>(_ReferenciaPersonalTransversal_QNAME, String.class, ReferenciaPersonal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfReferenciaPersonal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ReferenciasPersonales", scope = MSConsultaReferenciasPersonales.class)
    public JAXBElement<ArrayOfReferenciaPersonal> createMSConsultaReferenciasPersonalesReferenciasPersonales(ArrayOfReferenciaPersonal value) {
        return new JAXBElement<ArrayOfReferenciaPersonal>(_MSConsultaReferenciasPersonalesReferenciasPersonales_QNAME, ArrayOfReferenciaPersonal.class, MSConsultaReferenciasPersonales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Empleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Empleo", scope = MEEmpleo.class)
    public JAXBElement<Empleo> createMEEmpleoEmpleo(Empleo value) {
        return new JAXBElement<Empleo>(_Empleo_QNAME, Empleo.class, MEEmpleo.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, Empleo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfEmpleo }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Empleos", scope = MSConsultaEmpleo.class)
    public JAXBElement<ArrayOfEmpleo> createMSConsultaEmpleoEmpleos(ArrayOfEmpleo value) {
        return new JAXBElement<ArrayOfEmpleo>(_MSConsultaEmpleoEmpleos_QNAME, ArrayOfEmpleo.class, MSConsultaEmpleo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoSeguridad", scope = MEDatosCodigoSeguridad.class)
    public JAXBElement<String> createMEDatosCodigoSeguridadCodigoSeguridad(String value) {
        return new JAXBElement<String>(_MEDatosCodigoSeguridadCodigoSeguridad_QNAME, String.class, MEDatosCodigoSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEDatosCodigoSeguridad.class)
    public JAXBElement<String> createMEDatosCodigoSeguridadIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEDatosCodigoSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Organizacion", scope = MEDatosCodigoSeguridad.class)
    public JAXBElement<String> createMEDatosCodigoSeguridadOrganizacion(String value) {
        return new JAXBElement<String>(_MEDatosCodigoSeguridadOrganizacion_QNAME, String.class, MEDatosCodigoSeguridad.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoOficial", scope = MeDatosCliente.class)
    public JAXBElement<String> createMeDatosClienteCodigoOficial(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCodigoOficial_QNAME, String.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MeDatosCliente.class)
    public JAXBElement<String> createMeDatosClienteEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaNacimiento", scope = MeDatosCliente.class)
    public JAXBElement<XMLGregorianCalendar> createMeDatosClienteFechaNacimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MeDatosClienteFechaNacimiento_QNAME, XMLGregorianCalendar.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdActividad", scope = MeDatosCliente.class)
    public JAXBElement<Integer> createMeDatosClienteIdActividad(Integer value) {
        return new JAXBElement<Integer>(_MeDatosClienteIdActividad_QNAME, Integer.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MeDatosCliente.class)
    public JAXBElement<String> createMeDatosClienteIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IngresoAnual", scope = MeDatosCliente.class)
    public JAXBElement<BigDecimal> createMeDatosClienteIngresoAnual(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_MeDatosClienteIngresoAnual_QNAME, BigDecimal.class, MeDatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Calificacion", scope = DatosCliente.class)
    public JAXBElement<String> createDatosClienteCalificacion(String value) {
        return new JAXBElement<String>(_DatosClienteCalificacion_QNAME, String.class, DatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Cliente", scope = DatosCliente.class)
    public JAXBElement<Cliente> createDatosClienteCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, DatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosDireccion", scope = DatosCliente.class)
    public JAXBElement<DatosDireccion> createDatosClienteDatosDireccion(DatosDireccion value) {
        return new JAXBElement<DatosDireccion>(_DatosDireccion_QNAME, DatosDireccion.class, DatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoCelular", scope = DatosCliente.class)
    public JAXBElement<String> createDatosClienteTelefonoCelular(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoTelefonoCelular_QNAME, String.class, DatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoLocal", scope = DatosCliente.class)
    public JAXBElement<String> createDatosClienteTelefonoLocal(String value) {
        return new JAXBElement<String>(_DatosClienteTelefonoLocal_QNAME, String.class, DatosCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Clientes", scope = MSConsultaClientesCondiciones.class)
    public JAXBElement<ArrayOfDatosCliente> createMSConsultaClientesCondicionesClientes(ArrayOfDatosCliente value) {
        return new JAXBElement<ArrayOfDatosCliente>(_MSConsultaClientesCondicionesClientes_QNAME, ArrayOfDatosCliente.class, MSConsultaClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ApellidoMaterno", scope = MEConsultaClientesCondiciones.class)
    public JAXBElement<String> createMEConsultaClientesCondicionesApellidoMaterno(String value) {
        return new JAXBElement<String>(_MEConsultaClientesCondicionesApellidoMaterno_QNAME, String.class, MEConsultaClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ApellidoPaterno", scope = MEConsultaClientesCondiciones.class)
    public JAXBElement<String> createMEConsultaClientesCondicionesApellidoPaterno(String value) {
        return new JAXBElement<String>(_MEConsultaClientesCondicionesApellidoPaterno_QNAME, String.class, MEConsultaClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MEConsultaClientesCondiciones.class)
    public JAXBElement<String> createMEConsultaClientesCondicionesIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MEConsultaClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = MEConsultaClientesCondiciones.class)
    public JAXBElement<String> createMEConsultaClientesCondicionesNombres(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, MEConsultaClientesCondiciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MSConsultaCelular.class)
    public JAXBElement<String> createMSConsultaCelularIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MSConsultaCelular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroCuenta", scope = MSConsultaCelular.class)
    public JAXBElement<String> createMSConsultaCelularNumeroCuenta(String value) {
        return new JAXBElement<String>(_MECertificadoRelacionesComercialesNumeroCuenta_QNAME, String.class, MSConsultaCelular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoCelular", scope = MEConsultaCelular.class)
    public JAXBElement<String> createMEConsultaCelularCodigoCelular(String value) {
        return new JAXBElement<String>(_MEConsultaCelularCodigoCelular_QNAME, String.class, MEConsultaCelular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NumeroCelular", scope = MEConsultaCelular.class)
    public JAXBElement<String> createMEConsultaCelularNumeroCelular(String value) {
        return new JAXBElement<String>(_MEConsultaCelularNumeroCelular_QNAME, String.class, MEConsultaCelular.class, value);
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
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, METelefono.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesPais_QNAME, String.class, METelefono.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipal", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCallePrincipal_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleTransversal", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionCalleTransversal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCalleTransversal_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Canton", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionCanton(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosCanton_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ciudad", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionCiudad(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCiudad_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdDireccion", scope = MEDireccion.class)
    public JAXBElement<Integer> createMEDireccionIdDireccion(Integer value) {
        return new JAXBElement<Integer>(_MEDireccionIdDireccion_QNAME, Integer.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Numeracion", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionNumeracion(String value) {
        return new JAXBElement<String>(_MEDireccionNumeracion_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pais", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionPais(String value) {
        return new JAXBElement<String>(_MSConsultaClientesPais_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parroquia", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionParroquia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosParroquia_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Provincia", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionProvincia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProvincia_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Sector", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionSector(String value) {
        return new JAXBElement<String>(_MEDireccionSector_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoDireccion", scope = MEDireccion.class)
    public JAXBElement<String> createMEDireccionTipoDireccion(String value) {
        return new JAXBElement<String>(_MEDireccionTipoDireccion_QNAME, String.class, MEDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = MSConsultaRepresentanteLegal.class)
    public JAXBElement<String> createMSConsultaRepresentanteLegalEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MSConsultaRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = MSConsultaRepresentanteLegal.class)
    public JAXBElement<String> createMSConsultaRepresentanteLegalIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MSConsultaRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombre", scope = MSConsultaRepresentanteLegal.class)
    public JAXBElement<String> createMSConsultaRepresentanteLegalNombre(String value) {
        return new JAXBElement<String>(_ExtractoLegalSociosAccionistasNombre_QNAME, String.class, MSConsultaRepresentanteLegal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Numero", scope = DatosTelefono.class)
    public JAXBElement<String> createDatosTelefonoNumero(String value) {
        return new JAXBElement<String>(_DatosTelefonoNumero_QNAME, String.class, DatosTelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoTelefono", scope = DatosTelefono.class)
    public JAXBElement<String> createDatosTelefonoTipoTelefono(String value) {
        return new JAXBElement<String>(_METelefonoTipoTelefono_QNAME, String.class, DatosTelefono.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CallePrincipal", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCallePrincipal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCallePrincipal_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CalleTransversal", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCalleTransversal(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoCalleTransversal_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Ciudad", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCiudad(String value) {
        return new JAXBElement<String>(_MSConsultaClientesCiudad_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoCiudad", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCodigoCiudad(String value) {
        return new JAXBElement<String>(_DatosDireccionCodigoCiudad_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoParroquia", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCodigoParroquia(String value) {
        return new JAXBElement<String>(_DatosDireccionCodigoParroquia_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoProvincia", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCodigoProvincia(String value) {
        return new JAXBElement<String>(_DatosDireccionCodigoProvincia_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoTipoVivienda", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionCodigoTipoVivienda(String value) {
        return new JAXBElement<String>(_DatosDireccionCodigoTipoVivienda_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Direccion", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionDireccion(String value) {
        return new JAXBElement<String>(_MSConsultaClientesDireccion_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Numeracion", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionNumeracion(String value) {
        return new JAXBElement<String>(_MEDireccionNumeracion_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Pais", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionPais(String value) {
        return new JAXBElement<String>(_MSConsultaClientesPais_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Parroquia", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionParroquia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosParroquia_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Provincia", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionProvincia(String value) {
        return new JAXBElement<String>(_DatosOrigenFondosProvincia_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoDireccion", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionTipoDireccion(String value) {
        return new JAXBElement<String>(_MEDireccionTipoDireccion_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TipoVivienda", scope = DatosDireccion.class)
    public JAXBElement<String> createDatosDireccionTipoVivienda(String value) {
        return new JAXBElement<String>(_DatosDireccionTipoVivienda_QNAME, String.class, DatosDireccion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosDireccion }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Direcciones", scope = MSConsultaDireccionesCliente.class)
    public JAXBElement<ArrayOfDatosDireccion> createMSConsultaDireccionesClienteDirecciones(ArrayOfDatosDireccion value) {
        return new JAXBElement<ArrayOfDatosDireccion>(_MSConsultaDireccionesClienteDirecciones_QNAME, ArrayOfDatosDireccion.class, MSConsultaDireccionesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosTelefono }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Telefonos", scope = MSConsultaDireccionesCliente.class)
    public JAXBElement<ArrayOfDatosTelefono> createMSConsultaDireccionesClienteTelefonos(ArrayOfDatosTelefono value) {
        return new JAXBElement<ArrayOfDatosTelefono>(_MSConsultaDireccionesClienteTelefonos_QNAME, ArrayOfDatosTelefono.class, MSConsultaDireccionesCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesCiudad_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesDireccion_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_DetalleActivoEstado_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_MeDatosClienteFechaNacimiento_QNAME, XMLGregorianCalendar.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesIdentificacionConyuge_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesProfesion_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_ReferenciaPersonalTelefono_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_MERelacionClienteTipoRelacion_QNAME, String.class, DatosGeneralesCliente.class, value);
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
        return new JAXBElement<String>(_DatosDireccionTipoVivienda_QNAME, String.class, DatosGeneralesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Apellido1", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteApellido1(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteApellido1_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Apellido2", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteApellido2(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteApellido2_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Apellidos", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteApellidos(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteApellidos_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Celular", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteCelular(String value) {
        return new JAXBElement<String>(_MEDatosContactoCelular_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombre1", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteNombre1(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteNombre1_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombre2", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteNombre2(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteNombre2_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteNombres(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Oficial", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteOficial(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteOficial_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "TelefonoAdicional", scope = DatosAdicionalesCliente.class)
    public JAXBElement<String> createDatosAdicionalesClienteTelefonoAdicional(String value) {
        return new JAXBElement<String>(_DatosAdicionalesClienteTelefonoAdicional_QNAME, String.class, DatosAdicionalesCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Agencia", scope = MSConsultasCliente.class)
    public JAXBElement<String> createMSConsultasClienteAgencia(String value) {
        return new JAXBElement<String>(_MSConsultasClienteAgencia_QNAME, String.class, MSConsultasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosAdicionalesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosAdicionales", scope = MSConsultasCliente.class)
    public JAXBElement<DatosAdicionalesCliente> createMSConsultasClienteDatosAdicionales(DatosAdicionalesCliente value) {
        return new JAXBElement<DatosAdicionalesCliente>(_MSConsultasClienteDatosAdicionales_QNAME, DatosAdicionalesCliente.class, MSConsultasCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatosGeneralesCliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DatosCliente", scope = MSConsultasCliente.class)
    public JAXBElement<DatosGeneralesCliente> createMSConsultasClienteDatosCliente(DatosGeneralesCliente value) {
        return new JAXBElement<DatosGeneralesCliente>(_DatosCliente_QNAME, DatosGeneralesCliente.class, MSConsultasCliente.class, value);
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
        return new JAXBElement<String>(_MEUsoDatosPersonalesIdentificacionCliente_QNAME, String.class, MEConsultasCliente.class, value);
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
        return new JAXBElement<String>(_MEDatosContactoCodigoPais_QNAME, String.class, ResidenciaFiscal.class, value);
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
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, RedSocial.class, value);
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
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "ActividadEconomica", scope = MECreacionCliente.class)
    public JAXBElement<String> createMECreacionClienteActividadEconomica(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoActividadEconomica_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoCallePrincipal_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoCalleTransversal_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoCantonDireccion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoCiudadDireccion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoCodigoOficial_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoEstudios_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MERelacionIdentificacionPareja_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoNacionalidad_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_AccionistaAdministradorNombreEmpresa_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoNombresPareja_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesPais_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoParroquiaDireccion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoPrimerApellido_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoPrimerApellidoPareja_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MSConsultaClientesProfesion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_DatosOrigenFondosProvincia_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoProvinciaDireccion_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoSegundoApellido_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_MECreacionClienteResumidoSegundoApellidoPareja_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_ReferenciaPersonalTelefono_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_EmpleoTipoActividad_QNAME, String.class, MECreacionCliente.class, value);
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
        return new JAXBElement<String>(_DatosDireccionTipoVivienda_QNAME, String.class, MECreacionCliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Cliente }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Cliente", scope = MSClientes.class)
    public JAXBElement<Cliente> createMSClientesCliente(Cliente value) {
        return new JAXBElement<Cliente>(_Cliente_QNAME, Cliente.class, MSClientes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoActividad", scope = Cliente.class)
    public JAXBElement<String> createClienteCodigoActividad(String value) {
        return new JAXBElement<String>(_ClienteCodigoActividad_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "CodigoNivelEstudios", scope = Cliente.class)
    public JAXBElement<String> createClienteCodigoNivelEstudios(String value) {
        return new JAXBElement<String>(_ClienteCodigoNivelEstudios_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DescripcionActividad", scope = Cliente.class)
    public JAXBElement<String> createClienteDescripcionActividad(String value) {
        return new JAXBElement<String>(_ClienteDescripcionActividad_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "DescripcionNacionalidad", scope = Cliente.class)
    public JAXBElement<String> createClienteDescripcionNacionalidad(String value) {
        return new JAXBElement<String>(_MSConsultaClientesDescripcionNacionalidad_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Email", scope = Cliente.class)
    public JAXBElement<String> createClienteEmail(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoEmail_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "EstadoCivil", scope = Cliente.class)
    public JAXBElement<String> createClienteEstadoCivil(String value) {
        return new JAXBElement<String>(_MSConsultaClientesEstadoCivil_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaCaducaPasaporte", scope = Cliente.class)
    public JAXBElement<XMLGregorianCalendar> createClienteFechaCaducaPasaporte(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClienteFechaCaducaPasaporte_QNAME, XMLGregorianCalendar.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaIngresoPais", scope = Cliente.class)
    public JAXBElement<XMLGregorianCalendar> createClienteFechaIngresoPais(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClienteFechaIngresoPais_QNAME, XMLGregorianCalendar.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "FechaIngresoPasaporte", scope = Cliente.class)
    public JAXBElement<XMLGregorianCalendar> createClienteFechaIngresoPasaporte(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClienteFechaIngresoPasaporte_QNAME, XMLGregorianCalendar.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Identificacion", scope = Cliente.class)
    public JAXBElement<String> createClienteIdentificacion(String value) {
        return new JAXBElement<String>(_MEAccionistaAdministradorIdentificacion_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "IdentificacionExtranjero", scope = Cliente.class)
    public JAXBElement<String> createClienteIdentificacionExtranjero(String value) {
        return new JAXBElement<String>(_ClienteIdentificacionExtranjero_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "MensajeMalasReferencias", scope = Cliente.class)
    public JAXBElement<String> createClienteMensajeMalasReferencias(String value) {
        return new JAXBElement<String>(_ClienteMensajeMalasReferencias_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NivelEstudios", scope = Cliente.class)
    public JAXBElement<String> createClienteNivelEstudios(String value) {
        return new JAXBElement<String>(_ClienteNivelEstudios_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombreOficial", scope = Cliente.class)
    public JAXBElement<String> createClienteNombreOficial(String value) {
        return new JAXBElement<String>(_ClienteNombreOficial_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Nombres", scope = Cliente.class)
    public JAXBElement<String> createClienteNombres(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoNombres_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "NombresCompletos", scope = Cliente.class)
    public JAXBElement<String> createClienteNombresCompletos(String value) {
        return new JAXBElement<String>(_MSVinculadoNombresCompletos_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "Observaciones", scope = Cliente.class)
    public JAXBElement<String> createClienteObservaciones(String value) {
        return new JAXBElement<String>(_DetallePasivoObservaciones_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "PrimerApellido", scope = Cliente.class)
    public JAXBElement<String> createClientePrimerApellido(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoPrimerApellido_QNAME, String.class, Cliente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DenariusCoreBanking.Web.ExternalServices.Clientes", name = "SegundoApellido", scope = Cliente.class)
    public JAXBElement<String> createClienteSegundoApellido(String value) {
        return new JAXBElement<String>(_MECreacionClienteResumidoSegundoApellido_QNAME, String.class, Cliente.class, value);
    }

}
