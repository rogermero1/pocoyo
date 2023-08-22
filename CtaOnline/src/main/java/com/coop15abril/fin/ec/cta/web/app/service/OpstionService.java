package com.coop15abril.fin.ec.cta.web.app.service;

import java.util.List;

import com.coop15abril.fin.ec.cta.web.app.models.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.coop15abril.fin.ec.cta.web.app.interfacesService.IOptions;
import com.coop15abril.fin.ec.cta.web.app.models.dao.OptionsDao;

@Component
@Service
public class OpstionService implements IOptions {

	@Autowired
	private OptionsDao optionDao;

	@Override
	public List<Nacionalidad> getAllNacionalidad() {

		return (List<Nacionalidad>) optionDao.getAllNacionalidad();
	}

	@Override
	public List<Residencia> getAllResidencia() {
		return (List<Residencia>) optionDao.getAllResidencia();
	}

	@Override
	public List<NivelEstudio> getAllNivelEstudios() {
		
		return (List<NivelEstudio>) optionDao.getAllNivelEstudios();  
	}

	@Override
	public List<Profesion> getAllProfesion() {
		
		return (List<Profesion>) optionDao.getAllProfesion();
	
	}

	@Override
	public List<ActividadEconomica> getAllActividadEconomica() {
		
		return (List<ActividadEconomica>) optionDao.getAllActividadEconomica();
	}

	@Override
	public List<Provincia> getAllProvincia() {
		
		return (List<Provincia>) optionDao.getAllProvincia();
	}

	@Override
	public List<Canton> getAllCantonByProvincia(int provincia_id) {
		
		return (List<Canton>) optionDao.getAllCantonByProvincia(provincia_id);
		
	}

	@Override
	public List<Parroquia> getAllParroquiaByCanton(int provincia_id, int canton_id) {
		return (List<Parroquia>) optionDao.getAllParroquiaByCanton( provincia_id, canton_id);
	}

	@Override
	public List<Barrio> getAllBarriosByParroquias(int provincia_id, int canton_id, int parroquia_id) {
		return (List<Barrio>) optionDao.getAllBarriosByParroquias( provincia_id, canton_id, parroquia_id );
	}

	@Override
	public List<DependeciaLaboral> getAllDependenciaLaboral() {
		return (List<DependeciaLaboral>) optionDao.getAllDependenciaLaboral();
	}

	@Override
	public List<Parentesco> getAllParentesco() {
		return ( List<Parentesco> ) optionDao.getAllParentesco();
	}

	@Override
	public List<EstadoCivil> getALLEstadoCivil() {
		return (List<EstadoCivil>) optionDao.getALLEstadoCivil();
	}

	@Override
	public List<OperadoraCelular> getAllOperadora() {
		return (List<OperadoraCelular>) optionDao.getAllOperadora();
	}

	@Override
	public CorreoEmisor getCorreoEmisor() {
		return optionDao.getCorreoEmisor();
	}

	@Override
	public List<Pais> getAllPaises() {
		return optionDao.getAllPaises();
	}

	@Override
	public String getCorreoEmpleado() {
		return optionDao.getCorreoEmpleado();
	}

	@Override
	public List<Provincia> getProvincia() {
		return optionDao.getProvincia();
	}

}
