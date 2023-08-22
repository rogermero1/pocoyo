package com.coop15abril.fin.ec.cta.web.app.models.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.coop15abril.fin.ec.cta.web.app.models.entity.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.IOptions;

@Repository
public class OptionsDao implements IOptions {
	  private static final Logger logger = LoggerFactory.getLogger(OptionsDao.class);

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Nacionalidad> getAllNacionalidad() {

		List<Nacionalidad> listaNacionalidad = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(
				" select codigo_pais, nacionalidad from mg_paises where codigo_pais <> 100 order by nacionalidad ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {
			listaNacionalidad.add(
					new Nacionalidad(Integer.valueOf(elementoResultado[0].toString()), (String) elementoResultado[1]));

			// System.out.println( Integer.valueOf( elementoResultado[0].toString() ) +" -
			// "+ (String) elementoResultado[1] );
		}

		return listaNacionalidad;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Residencia> getAllResidencia() {

		List<Residencia> listaResidencia = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" SELECT Codigo, Descripcion FROM Mg_Residencias ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {
			listaResidencia
					.add(new Residencia((String) elementoResultado[0].toString(), (String) elementoResultado[1]));

			// System.out.println( (String) elementoResultado[0].toString() +" "+ (String)
			// elementoResultado[1] );
		}

		return listaResidencia;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<NivelEstudio> getAllNivelEstudios() {

		List<NivelEstudio> listaNivelEstudios = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" SELECT Nivel, Descripcion FROM Mg_Niveles_Estudio ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {
			listaNivelEstudios
					.add(new NivelEstudio((String) elementoResultado[0].toString(), (String) elementoResultado[1]));

			// System.out.println( (String) elementoResultado[0].toString() +" "+ (String)
			// elementoResultado[1] );
		}

		return listaNivelEstudios;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Profesion> getAllProfesion() {

		List<Profesion> listaProfesiones = new ArrayList<>();

		List<Object[]> listaResultado = em
				.createNativeQuery(
						" select codigo_profesion, descripcion from mg_profesiones order by codigo_profesion ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaProfesiones.add(new Profesion(Integer.parseInt((String) elementoResultado[0].toString()),
					(String) elementoResultado[1]));

			// System.out.println( Integer.parseInt((String) elementoResultado[0].toString()
			// ) +" "+ (String) elementoResultado[1] );
		}

		return listaProfesiones;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<ActividadEconomica> getAllActividadEconomica() {

		List<ActividadEconomica> listaActividadEconomica = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(
				" select codigo_actividad_economica, descripcion  from mg_actividades_economicas where nivel = 6 order by codigo_actividad_economica ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaActividadEconomica.add(
					new ActividadEconomica((String) elementoResultado[0].toString(), (String) elementoResultado[1]));

			// System.out.println( (String) elementoResultado[0].toString() +" "+ (String)
			// elementoResultado[1] );
		}

		return listaActividadEconomica;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Provincia> getAllProvincia() {
		
		List<Provincia> listaProvincias = new ArrayList<>();
		
		
		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_departamento, nombre from mg_departamentos where codigo_pais = 1 order by nombre ")
				.getResultList();
		
		for (Object[] elementoResultado : listaResultado) {

			listaProvincias.add(new Provincia( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]));
		}
		
		return listaProvincias;
	}

	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Canton> getAllCantonByProvincia(int provincia_id) {
	
		List<Canton> listaCantones = new ArrayList<>();

		Query query =  em.createNativeQuery(" select codigo_municipio, nombre from mg_municipios where codigo_pais = 1 and codigo_departamento = ? order by nombre ");

		query.setParameter(1, provincia_id);

		List<Object[]> listaResultado = query.getResultList();
		
		for (Object[] elementoResultado : listaResultado) {

			listaCantones.add(
					new Canton( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]));

			// System.out.println(  Integer.parseInt( (String) elementoResultado[0].toString() ) +" "+ (String)
			// elementoResultado[1] );
		}
		
		
		return listaCantones;
		
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Parroquia> getAllParroquiaByCanton(int provincia_id, int canton_id) {

		List<Parroquia> listaParroquias = new ArrayList<>();

		Query query = em.createNativeQuery(" select codigo_parroquia, descripcion from mg_parroquias where codigo_departamento = ? and codigo_municipio = ? order by descripcion ");
		query.setParameter(1, provincia_id );
		query.setParameter(2, canton_id );

		List<Object[]> listaResultado = query.getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaParroquias.add(
					new Parroquia( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]));

		}

		return  listaParroquias;


	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Barrio> getAllBarriosByParroquias(int provincia_id, int canton_id, int parroquia_id) {

		List<Barrio> listaBarrios = new ArrayList<>();
		Query query = em.createNativeQuery(" select codigo_barrio, nombre from mg_barrios where codigo_departamento = ? and codigo_municipio = ? and codigo_parroquia = ? order by nombre ");
		query.setParameter(1, provincia_id );
		query.setParameter(2, canton_id );
		query.setParameter(3, parroquia_id );

		List<Object[]> listaResultado = query.getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaBarrios.add(
					new Barrio( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]));

		}

		return listaBarrios;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<DependeciaLaboral> getAllDependenciaLaboral() {

		List<DependeciaLaboral> listaDependecias = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_tipo_dependencia,descripcion from mg_tipos_dependencia_laboral ").getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaDependecias.add(
					new DependeciaLaboral(  (String) elementoResultado[0].toString() , (String) elementoResultado[1]));
		}

		return  listaDependecias;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Parentesco> getAllParentesco() {

		List<Parentesco> listaparentesco = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_referencia_personal, descripcion from mg_tipos_referencias_per order by codigo_referencia_personal ")
				.getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaparentesco.add(
					new Parentesco( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]) );
		}

		return listaparentesco;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<EstadoCivil> getALLEstadoCivil() {

		List<EstadoCivil> listaEstadoCivil = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_estado_civil , estado_civil  from mg_estado_civil ").getResultList();

		for (Object[] elementoResultado : listaResultado) {

			listaEstadoCivil.add(
					new EstadoCivil(  (String) elementoResultado[0].toString() , (String) elementoResultado[1]) );
		}

		return listaEstadoCivil;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<OperadoraCelular> getAllOperadora() {
		List<OperadoraCelular> listaOperadoras = new ArrayList<>();

		List<Object[]> listaResultado = em.createNativeQuery(" SELECT Codigo_Tipo_Operadora, Descripcion FROM Mg_Operadoras_Telefonicas ")
				.getResultList();
		for (Object[] elementoResultado : listaResultado) {

			listaOperadoras.add(
					new OperadoraCelular( Integer.parseInt( (String) elementoResultado[0].toString() ) , (String) elementoResultado[1]) );
		}

		return listaOperadoras;

	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public CorreoEmisor getCorreoEmisor() {
		 CorreoEmisor correo = null;
		 List<Object[]> listaResultado = em.createNativeQuery(" select correo, clave from mg_emisores_correo t where t.correo='info@coop15abril.fin.ec' ").getResultList();
		 for (Object[] elementoResultado : listaResultado) {
			 correo = new CorreoEmisor((String) elementoResultado[0], (String) elementoResultado[1]);
		 }		 
		 return correo;		
		
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public List<Pais> getAllPaises() {
		List<Pais> lisPais = new ArrayList<>();
		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_pais, nombre from mg_paises order by nombre  ").getResultList();
		 for (Object[] elementoResultado : listaResultado) {
			  lisPais.add( new Pais( Integer.parseInt( elementoResultado[0].toString() ) ,(String) elementoResultado[1]) );
		 }
		return lisPais;
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	@Override
	public String getCorreoEmpleado() {
		String correo = "";
		StringBuilder querySql = new StringBuilder();
		              querySql.append(" SELECT z.Email  FROM Mg_Usuarios_Envio_Correo x, Rp_Empleados y, Mg_Direcciones z ")
					          .append(" WHERE x.Codigo_Empleado = y.Codigo_Empleado ")
					          .append(" AND y.Codigo_Cliente = z.Codigo_Cliente AND z.Codigo_tipo_Direccion = 2 ")
					          .append(" AND x.Estado = 'A' AND x.Codigo_Agencia = 101  AND x.Aplicacion = 'CAO' ");
		try {
		    Object resultado =  em.createNativeQuery(querySql.toString()).getResultList().stream().findFirst().orElse(null);
		    if ( resultado != null )
		         correo = resultado.toString(); 
			
		} catch (Exception e) {
			 e.printStackTrace();
	         logger.error(" ERROR EN GET CORREO EMPLEADO " + e.getMessage());
		}            
		              
	   return correo;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Provincia> getProvincia() {
		
		List<Provincia> listaProvincias = new ArrayList<>();
		
		List<Object[]> listaResultado = em.createNativeQuery(" select codigo_departamento, nombre from mg_departamentos where codigo_pais = 1 order by nombre ").getResultList();
		
		for (Object[] elementoResultado : listaResultado) {
			listaProvincias.add(new Provincia( Integer.parseInt( (String) elementoResultado[0].toString() ), (String) elementoResultado[1]));
		}
		
		return listaProvincias;
	}


}
