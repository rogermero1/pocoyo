package com.coop15abril.fin.ec.cta.web.app.models.entity;


public class Nacionalidad {
	
	private Integer codigo_pais;
	private String nacionalidad;
	

	public Nacionalidad(Integer codigo_pais, String nacionalidad) {
		this.codigo_pais = codigo_pais;
		this.nacionalidad = nacionalidad;
	}

	public Integer getCodigo_pais() {
		return codigo_pais;
	}

	public void setCodigo_pais(Integer codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	

}
