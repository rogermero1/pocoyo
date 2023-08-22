package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class ActividadEconomica {

	private String codigoActividadEconomica;
	private String descripcion;

	public ActividadEconomica(String codigoActividadEconomica, String descripcion) {
		this.codigoActividadEconomica = codigoActividadEconomica;
		this.descripcion = descripcion;
	}

	public String getCodigoActividadEconomica() {
		return codigoActividadEconomica;
	}

	public void setCodigoActividadEconomica(String codigoActividadEconomica) {
		this.codigoActividadEconomica = codigoActividadEconomica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
