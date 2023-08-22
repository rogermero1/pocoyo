package com.coop15abril.fin.ec.cta.web.app.models.dao;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.ICuentaAhorro;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Cliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CuentaAhorro;

@Repository
public class CuentaAhorroDao  implements ICuentaAhorro {

    private static final Logger logger = LoggerFactory.getLogger(CuentaAhorroDao.class);

    @PersistenceContext
    private EntityManager entityManager;

 

    @Transactional
    @Override
    public CuentaAhorro  CrearCuentaAgregarCliente(Cliente cliente){

        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_Registra_Cliente_PerNat");
        query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(5, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(10, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(11, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(12, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(13, Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(14, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(15, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(16, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(17, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(18, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(19, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(20, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(21, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(22, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(23, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(24, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(25, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(26, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(27, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(28, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(29, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(30, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(31, Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(32, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(33, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(34, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(35, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(36, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(37, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(38, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(39, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(40, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(41, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(42, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(43, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(44, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(45, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(46, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(47, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(48, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(49, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(50, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(51, Long.class, ParameterMode.OUT);
        query.registerStoredProcedureParameter(52, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(53, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(54, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(55, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(56, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(57, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(58, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(59, String.class, ParameterMode.OUT);
        // set parameter
        query.setParameter(1, cliente.getCodigoIdentificacion());//Gv_Codigo_Identificacion  
        query.setParameter(2, cliente.getNombres());// Gv_Nombres   
        query.setParameter(3, cliente.getApellidoUno()+" "+cliente.getApellidosDos());//  Gv_Apellidos  
        query.setParameter(4, cliente.getCodigoAgencia());//Gn_Codigo_Agencia  
        query.setParameter(5, cliente.getTipoIdentificacion());//Gn_Tipo_Identificacion
        query.setParameter(6, cliente.getNivelEducativo());//Gv_Nivel_Educativo
        query.setParameter(7, cliente.getEstadoCivil());//Gv_Estado_Civil 
        query.setParameter(8, cliente.getLugarNacimiento());//Gv_Lugar_De_Nacimiento 
        query.setParameter(9, cliente.getDescripcionNegocio());//Gv_Descripcion_Negocio
        query.setParameter(10, cliente.getTipoResidencia());// Gv_Tipo_Residencia   
        query.setParameter(11, cliente.getSexo());//Gv_Sexo  
        query.setParameter(12, cliente.getCodigoPais());//Gn_Codigo_Pais 
        query.setParameter(13,  cliente.getFechaNacimiento() );//Gd_Fecha_De_Nacimiento
        query.setParameter(14, cliente.getCodigoActividadEconomica());//Gv_Codigo_Actividad_Economica
        query.setParameter(15, cliente.getCodigoProfesion());//Gn_Codigo_Profesion 
        query.setParameter(16, cliente.getCodigoDepartamento());//Gn_Codigo_Departamento
        query.setParameter(17, cliente.getCodigoMunicipio());//Gn_Codigo_Municipio
        query.setParameter(18, cliente.getCodigoParroquia());//Gn_Codigo_Parroquia
        query.setParameter(19, cliente.getBarrio());//Gn_Barrio 
        query.setParameter(20, cliente.getCalle());//Gv_Calle
        query.setParameter(21, cliente.getNomenclatura());//Gv_Nomenclatura   
        query.setParameter(22, cliente.getEmail() );//Gv_Email
        query.setParameter(23, cliente.getNumeroConvencional());//Gv_Numero_Convencional
        query.setParameter(24, cliente.getNumeroCelular());//Gv_Numero_Celular
        query.setParameter(25, cliente.getOperadoraCelular());//Gn_Operadora_Celular
        query.setParameter(26, cliente.getCodigoMunicipioEmpleo());//Gn_Codigo_Municipio_Empleo
        query.setParameter(27, cliente.getCodigoDepartamentoEmpleo());//Gn_Codigo_Departamento_Empleo
        query.setParameter(28, cliente.getTipoDependenciaEmpleo());//Gv_Tipo_Dependencia_Empleo
        query.setParameter(29, cliente.getCargoEmpleo());//Gv_Cargo_Empleo
        query.setParameter(30, cliente.getNombreEmpresaEmpleo());// Gv_Nombre_Empresa_Empleo 
        query.setParameter(31, cliente.getFechaIngreso() );//Gd_Fecha_Ingreso
        query.setParameter(32, cliente.getIngresoSueldo());//Gn_Ingreso_Sueldo
        query.setParameter(33, cliente.getIngresoNegocio());//Gn_Ingreso_Negocio
        query.setParameter(34, cliente.getIngresoRenta());//Gn_Ingreso_Renta 
        query.setParameter(35, cliente.getIngresoConyuge());//Gn_Ingreso_Conyuge 
        query.setParameter(36, cliente.getIngresoOtros());//Gn_Ingreso_Otros
        query.setParameter(37, cliente.getEgresosAlimentacion());//Gn_Egresos_Alimentacion
        query.setParameter(38, cliente.getEgresosServiciosBasicos());// Gn_Egresos_Servicios_Basicos
        query.setParameter(39, cliente.getEgresosvehiculo());//Gn_Egresos_Vehiculo
        query.setParameter(40, cliente.getEgresosTransporte());//Gn_Egresos_Transporte
        query.setParameter(41, cliente.getEgresosSalud());//Gn_Egresos_Salud 
        query.setParameter(42, cliente.getEgresosEducacion());// Gn_Egresos_Educacion 
        query.setParameter(43, cliente.getEgresosOtros());//Gn_Egresos_Otros
        query.setParameter(44, cliente.getComentario() );//Gv_comentario 
        query.setParameter(45, cliente.getPrimerApellidoRef());//Gv_Primer_Apellido_Ref
        query.setParameter(46, cliente.getSegundoApellidoRef());//Gv_Segundo_Apellido_Ref
        query.setParameter(47, cliente.getNombresRef());//Gv_Nombres_Ref 
        query.setParameter(48, cliente.getTipoRef());//Gn_Tipo_Ref 
        query.setParameter(49, cliente.getTelefonoRef());//Gv_Telefono_Ref
        query.setParameter(50, cliente.getDireccionRef());//Gv_Direccion_Ref
        query.setParameter(52, cliente.getEstadounidense());//Gv_estadounidense
        query.setParameter(53, cliente.getResidenteOtroPais());// Gv_residente_otro_pais
        query.setParameter(54, cliente.getDescripcionResidencia());// Gv_descripcion_residencia
        query.setParameter(55, cliente.getTerminosTarjeta());//Gv_TERMINOS_TARJETA  
        query.setParameter(56, cliente.getTerminosCertificado());//Gv_TERMINOS_CERTIFICADO  
        query.setParameter(57, cliente.getTerminosContrato());//Gv_TERMINOS_CONTRATO 
        query.setParameter(58, cliente.getPersonaExpuesta());//Gv_PERSONA_EXPUESTA 
        // execute
        query.execute();

        //Gv_Codigoerror
        if ( query.getOutputParameterValue(59) != null )
            logger.info("Error Crear Cliente "+ (String)  query.getOutputParameterValue(59));

        return new CuentaAhorro( (Long) query.getOutputParameterValue(51), (String) query.getOutputParameterValue(59) );


    }

    @Transactional
    @Override
    public CuentaAhorro  CrearCuentaActualizaCliente(Cliente cliente)  {
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("mg_k_servicios_web_interna.mg_p_actualiza_cliente_pernat");
        query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(4, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(5, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(6, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(7, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(8, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(9, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(10, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(11, Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(12, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(13, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(14, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(15, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(16, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(17, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(18, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(19, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(20, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(21, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(22, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(23, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(24, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(25, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(26, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(27, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(28, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(29, Date.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(30, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(31, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(32, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(33, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(34, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(35, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(36, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(37, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(38, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(39, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(40, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(41, double.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(42, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(43, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(44, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(45, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(46, Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(47, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(48, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(49, Long.class, ParameterMode.OUT);
        query.registerStoredProcedureParameter(50, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(51, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(52, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(53, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(54, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(55, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(56, String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter(57, String.class, ParameterMode.OUT);

        //parameters
        query.setParameter(1, cliente.getCodigoIdentificacion());//Gv_Codigo_Identificacion
        query.setParameter(2, cliente.getNombres());// Gv_Nombres  
        query.setParameter(3, cliente.getApellidoUno()+" "+cliente.getApellidosDos());//Gv_Apellidos
        query.setParameter(4, cliente.getCodigoAgencia());// Gn_Codigo_Agencia 
        query.setParameter(5, cliente.getNivelEducativo());//Gv_Nivel_Educativo 
        query.setParameter(6, cliente.getEstadoCivil());//Gv_Estado_Civil 
        query.setParameter(7, cliente.getLugarNacimiento());//Gv_Lugar_De_Nacimiento 
        query.setParameter(8, cliente.getDescripcionNegocio());//Gv_Descripcion_Negocio
        query.setParameter(9, cliente.getTipoResidencia());//Gv_Tipo_Residencia
        query.setParameter(10, cliente.getCodigoPais());//Gn_Codigo_Pais
        query.setParameter(11, cliente.getFechaNacimiento());//Gd_Fecha_De_Nacimiento
        query.setParameter(12, cliente.getCodigoActividadEconomica());// Gv_Codigo_Actividad_Economica
        query.setParameter(13, cliente.getCodigoProfesion());//Gn_Codigo_Profesion
        query.setParameter(14, cliente.getCodigoDepartamento());//Gn_Codigo_Departamento
        query.setParameter(15, cliente.getCodigoMunicipio());//Gn_Codigo_Municipio 
        query.setParameter(16, cliente.getCodigoParroquia());//Gn_Codigo_Parroquia
        query.setParameter(17, cliente.getBarrio());//Gn_Barrio
        query.setParameter(18, cliente.getCalle());// Gv_Calle  
        query.setParameter(19, cliente.getNomenclatura());//Gv_Nomenclatura
        query.setParameter(20, cliente.getEmail());//Gv_Email 
        query.setParameter(21, cliente.getNumeroConvencional());//Gv_Numero_Convencional 
        query.setParameter(22, cliente.getNumeroCelular());// Gv_Numero_Celular
        query.setParameter(23, cliente.getOperadoraCelular());//Gn_Operadora_Celular
        query.setParameter(24, cliente.getCodigoMunicipioEmpleo());//Gn_Codigo_Municipio_Empleo
        query.setParameter(25, cliente.getCodigoDepartamentoEmpleo());//Gn_Codigo_Departamento_Empleo
        query.setParameter(26, cliente.getTipoDependenciaEmpleo());// Gv_Tipo_Dependencia_Empleo
        query.setParameter(27, cliente.getCargoEmpleo());//Gv_Cargo_Empleo
        query.setParameter(28, cliente.getNombreEmpresaEmpleo());//Gv_Nombre_Empresa_Empleo
        query.setParameter(29, cliente.getFechaIngreso()  );// Gd_Fecha_Ingreso
        query.setParameter(30, cliente.getIngresoSueldo());//Gn_Ingreso_Sueldo
        query.setParameter(31, cliente.getIngresoNegocio());//Gn_Ingreso_Negocio
        query.setParameter(32, cliente.getIngresoRenta());//Gn_Ingreso_Renta
        query.setParameter(33, cliente.getIngresoConyuge());//Gn_Ingreso_Conyuge  
        query.setParameter(34, cliente.getIngresoOtros());//Gn_Ingreso_Otros
        query.setParameter(35, cliente.getEgresosAlimentacion());//Gn_Egresos_Alimentacion
        query.setParameter(36, cliente.getEgresosServiciosBasicos());// Gn_Egresos_Servicios_Basicos
        query.setParameter(37, cliente.getEgresosvehiculo());//Gn_Egresos_Vehiculo
        query.setParameter(38, cliente.getEgresosTransporte());//Gn_Egresos_Transporte 
        query.setParameter(39, cliente.getEgresosSalud());//Gn_Egresos_Salud
        query.setParameter(40, cliente.getEgresosEducacion());// Gn_Egresos_Educacion
        query.setParameter(41, cliente.getEgresosOtros());// Gn_Egresos_Otros
        query.setParameter(42, cliente.getComentario());//Gv_comentario
        query.setParameter(43, cliente.getPrimerApellidoRef());//Gv_Primer_Apellido_Ref
        query.setParameter(44, cliente.getSegundoApellidoRef());// Gv_Segundo_Apellido_Ref 
        query.setParameter(45, cliente.getNombresRef());//Gv_Nombres_Ref
        query.setParameter(46, cliente.getTipoRef());//Gn_Tipo_Ref
        query.setParameter(47, cliente.getTelefonoRef());//Gv_Telefono_Ref
        query.setParameter(48, cliente.getDireccionRef());//Gv_Direccion_Ref
        query.setParameter(50, cliente.getEstadounidense());// Gv_estadounidense
        query.setParameter(51, cliente.getResidenteOtroPais());//Gv_residente_otro_pais
        query.setParameter(52, cliente.getDescripcionResidencia());//Gv_descripcion_residencia
        query.setParameter(53, cliente.getTerminosTarjeta());// Gv_TERMINOS_TARJETA 
        query.setParameter(54, cliente.getTerminosCertificado());// Gv_TERMINOS_CERTIFICADO
        query.setParameter(55, cliente.getTerminosContrato());// Gv_TERMINOS_CONTRATO
        query.setParameter(56, cliente.getPersonaExpuesta());// Gv_Gv_PERSONA_EXPUESTA 

        // execute
        query.execute();
        
        // Gv_Codigoerror 
        if ( query.getOutputParameterValue(57) != null )
            logger.info("Error Actualiza Cliente :" + (String)  query.getOutputParameterValue(57) );

        return new CuentaAhorro( (Long) query.getOutputParameterValue(49), (String) query.getOutputParameterValue(57) );
    }



}
