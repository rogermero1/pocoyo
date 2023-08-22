/**
 * 
 */
package com.coop15abril.fin.ec.cta.web.app.models.entity;

/**
 * @author cristian.german
 *
 */
public class Pais {
	
	private Integer codigoPais;
	private String nombre;

	public Pais() {

	}

	public Pais(Integer codigoPais, String nombre) {
		this.codigoPais = codigoPais;
		this.nombre = nombre;
	}

	public Integer getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pais [codigoPais=" + codigoPais + ", nombre=" + nombre + "]";
	}
	

}
