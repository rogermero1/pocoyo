package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class NivelEstudio {

	private String nivel;
	private String descripcion;

	public NivelEstudio(String nivel, String descripcion) {
		this.nivel = nivel;
		this.descripcion = descripcion;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
