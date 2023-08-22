package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Profesion {

	private Integer codigoProfesion;
	private String descripcion;

	public Profesion(Integer codigoProfesion, String descripcion) {
		this.codigoProfesion = codigoProfesion;
		this.descripcion = descripcion;
	}

	public Integer getCodigoProfesion() {
		return codigoProfesion;
	}

	public void setCodigoProfesion(Integer codigoProfesion) {
		this.codigoProfesion = codigoProfesion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
