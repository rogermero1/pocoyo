package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class Canton {

	private Integer codigoMunicipio;
	private String nombre;

	public Canton(Integer codigoMunicipio, String nombre) {
		this.codigoMunicipio = codigoMunicipio;
		this.nombre = nombre;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
