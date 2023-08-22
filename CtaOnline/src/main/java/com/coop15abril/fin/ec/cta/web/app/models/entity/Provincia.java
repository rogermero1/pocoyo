package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Provincia {

	private Integer codigoDepartamento;
	private String nombre;

	public Provincia(Integer codigoDepartamento, String nombre) {
		this.codigoDepartamento = codigoDepartamento;
		this.nombre = nombre;
	}

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
