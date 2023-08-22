package com.coop15abril.fin.ec.cta.web.app.models.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatosPersonal {

	private String apellidoUno;
	private String apellidoDos;
	private String nombres;
	private Date fechaNacimiento;
	private String sexo;
	private String estadoCivil;
	private String lugarNacimiento;
	private String nivelEstudio;
	private String error;

	public DatosPersonal(String apellidoUno, String apellidoDos, String nombres, Date fechaNacimiento, String sexo,
			String estadoCivil, String lugarNacimiento, String nivelEstudio, String error) {
		this.apellidoUno = apellidoUno;
		this.apellidoDos = apellidoDos;
		this.nombres = nombres;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo != null ? sexo : "";
		this.estadoCivil = estadoCivil != null ? estadoCivil : "";
		this.lugarNacimiento = lugarNacimiento;
		this.nivelEstudio = nivelEstudio != null ? nivelEstudio : "";
		this.error = error;
	}

	public String getApellidoUno() {
		return apellidoUno;
	}

	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	public String getApellidoDos() {
		return apellidoDos;
	}

	public void setApellidoDos(String apellidoDos) {
		this.apellidoDos = apellidoDos;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getFechaNacimiento() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return fechaNacimiento != null ? formatter.format(fechaNacimiento) : null;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getNivelEstudio() {
		return nivelEstudio;
	}

	public void setNivelEstudio(String nivelEstudio) {
		this.nivelEstudio = nivelEstudio;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "DatosPersonal [apellidoUno=" + apellidoUno + ", apellidoDos=" + apellidoDos + ", nombres=" + nombres
				+ ", fechaNacimiento=" + fechaNacimiento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", lugarNacimiento=" + lugarNacimiento + ", nivelEstudio=" + nivelEstudio + "]";
	}

}
