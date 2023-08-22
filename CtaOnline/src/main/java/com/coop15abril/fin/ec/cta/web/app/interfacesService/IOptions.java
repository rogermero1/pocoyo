package com.coop15abril.fin.ec.cta.web.app.interfacesService;

import java.util.List;

import com.coop15abril.fin.ec.cta.web.app.models.entity.*;

public interface IOptions {

	public List<Nacionalidad> getAllNacionalidad();

	public List<Pais> getAllPaises();

	public List<Residencia> getAllResidencia();

	public List<NivelEstudio> getAllNivelEstudios();

	public List<Profesion> getAllProfesion();

	public List<ActividadEconomica> getAllActividadEconomica();

	public List<Provincia> getAllProvincia();
	
	public List<Provincia> getProvincia();

	public List<Canton> getAllCantonByProvincia(int provincia_id);

	public List<Parroquia> getAllParroquiaByCanton(int provincia_id, int canton_id);

	public List<Barrio> getAllBarriosByParroquias(int provincia_id, int canton_id, int parroquia_id);

	public List<DependeciaLaboral> getAllDependenciaLaboral();

	public List<Parentesco> getAllParentesco();

	public List<EstadoCivil> getALLEstadoCivil();

	public List<OperadoraCelular> getAllOperadora();

	public CorreoEmisor getCorreoEmisor();
	
	public String getCorreoEmpleado();

}
