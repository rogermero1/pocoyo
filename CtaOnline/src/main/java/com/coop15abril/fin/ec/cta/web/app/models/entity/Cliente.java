package com.coop15abril.fin.ec.cta.web.app.models.entity;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Cliente {

	@NotNull
	@Size(min = 10, max = 10)
	private String codigoIdentificacion;// 1

	@Size(min = 1, max = 200)
	private String nombres;// 2

	@Size(min = 1, max = 100)
	private String apellidoUno;// 3
	
	@Size(min = 1, max = 100)
	private String apellidosDos;// 3

	@NotNull
	private Integer codigoAgencia;// 4

	@NotNull
	private final Integer tipoIdentificacion = 1;// 5

	@NotNull
	private String nivelEducativo;// 6

	@NotNull
	private String estadoCivil;// 7

	@Size(min = 1, max = 200)
	private String lugarNacimiento;// 8

	@Size(min = 1, max = 300)
	private String descripcionNegocio;// 9

	@NotNull
	private String tipoResidencia;// 10

	@NotNull
	private String sexo;// 11

	@NotNull
	private Integer codigoPais;// 12

	@NotNull
	@Temporal(TemporalType.DATE)
	@JsonFormat(locale="es_EC", timezone="GMT-5", pattern="dd/MM/yyyy")
	private Date fechaNacimiento;// 13

	@NotNull
	private String codigoActividadEconomica;// 14

	@NotNull
	private Integer codigoProfesion;// 15

	@NotNull
	private Integer codigoDepartamento;// 16

	@NotNull
	private Integer codigoMunicipio;// 17

	@NotNull
	private Integer codigoParroquia;// 18

	@NotNull
	private Integer barrio;// 19

	@Size(min = 1, max = 200)
	private String calle;// 20
	private String nomenclatura;// 21
	private String email;// 22
	private String numeroConvencional;// 23

	@Size(min = 10, max = 10)
	private String numeroCelular;// 24

	@NotNull
	private Integer operadoraCelular;// 25
	private Integer codigoMunicipioEmpleo;// 26
	private Integer codigoDepartamentoEmpleo;// 27
	private String tipoDependenciaEmpleo;// 28
	private String cargoEmpleo;// 29
	private String nombreEmpresaEmpleo;// 30
	@Temporal(TemporalType.DATE)
	@JsonFormat(locale="es_EC", timezone="GMT-5", pattern="dd/MM/yyyy")
	private Date fechaIngreso;// 31
	private double ingresoSueldo = 0.00;// 32
	private double ingresoNegocio = 0.00;// 33
	private double ingresoRenta = 0.00;// 34
	private double ingresoConyuge = 0.00;// 35
	private double ingresoOtros = 0.00;// 36
	private double egresosAlimentacion = 0.00;// 37
	private double egresosServiciosBasicos = 0.00;// 38
	private double egresosvehiculo = 0.00;// 39
	private double egresosTransporte = 0.00;// 40
	private double egresosSalud = 0.00;// 41
	private double egresosEducacion = 0.00;// 42
	private double egresosOtros = 0.00;// 43
	private String comentario;// 44

	@Size(min = 1, max = 200)
	private String primerApellidoRef;// 45

	@Size(min = 1, max = 200)
	private String segundoApellidoRef;// 46

	@Size(min = 1, max = 200)
	private String nombresRef;// 47

	@NotNull
	private Integer tipoRef;// 48

	@Size(min = 7, max = 10)
	private String telefonoRef;// 49

	@Size(min = 1, max = 200)
	private String direccionRef;// 50
	private String estadounidense = "N";// 51
	private String residenteOtroPais = "N";// 52
	private String descripcionResidencia = "";// 53
	@NotNull
	@Size(max = 1)
	private String terminosTarjeta;// 54
	@NotNull
	@Size(max = 1)
	private String terminosCertificado;// 55
	@NotNull
	@Size(max = 1)
	private String terminosContrato;// 56
	@NotNull
	@Size(max = 1)
	private String PersonaExpuesta ="N";// 57
	private Integer opt;
	private String cedulaFileF;
	private String cedulaFileP;
	private String sbFile;

	
	public Cliente() {

	}

	public Cliente(@NotNull @Size(min = 10, max = 10) String codigoIdentificacion,
			@Size(min = 1, max = 200) String nombres, 
			@Size(min = 1, max = 100) String apellidosUno,
			@Size(min = 1, max = 100) String apellidosDos,
			@NotNull Integer codigoAgencia, @NotNull String nivelEducativo, @NotNull String estadoCivil,
			@Size(min = 1, max = 200) String lugarNacimiento, @Size(min = 1, max = 300) String descripcionNegocio,
			@NotNull String tipoResidencia, @NotNull String sexo, @NotNull Integer codigoPais,
			@NotNull Date fechaNacimiento, @NotNull String codigoActividadEconomica, @NotNull Integer codigoProfesion,
			@NotNull Integer codigoDepartamento, @NotNull Integer codigoMunicipio, @NotNull Integer codigoParroquia,
			@NotNull Integer barrio, @Size(min = 1, max = 200) String calle, String nomenclatura, String email,
			String numeroConvencional, @Size(min = 10, max = 10) String numeroCelular,
			@NotNull Integer operadoraCelular, Integer codigoMunicipioEmpleo, Integer codigoDepartamentoEmpleo,
			String tipoDependenciaEmpleo, String cargoEmpleo, String nombreEmpresaEmpleo, Date fechaIngreso,
			double ingresoSueldo, double ingresoNegocio, double ingresoRenta, double ingresoConyuge,
			double ingresoOtros, double egresosAlimentacion, double egresosServiciosBasicos, double egresosvehiculo,
			double egresosTransporte, double egresosSalud, double egresosEducacion, double egresosOtros,
			String comentario, @Size(min = 1, max = 200) String primerApellidoRef,
			@Size(min = 1, max = 200) String segundoApellidoRef, @Size(min = 1, max = 200) String nombresRef,
			@NotNull Integer tipoRef, @Size(min = 10, max = 10) String telefonoRef,
			@Size(min = 1, max = 200) String direccionRef, String estadounidense, String residenteOtroPais,
			String descripcionResidencia, @NotNull @Size(max = 1) String terminosTarjeta,
			@NotNull @Size(max = 1) String terminosCertificado, 
			@NotNull @Size(max = 1) String terminosContrato,
			@NotNull @Size(max = 1) String PersonaExpuesta,
			String cedulaFileF, 
			String cedulaFileP, 
			String sbFile) {
		this.codigoIdentificacion = codigoIdentificacion;
		this.nombres = nombres;
		this.apellidoUno = apellidosUno;
		this.apellidosDos = apellidosDos;
		this.codigoAgencia = codigoAgencia;
		this.nivelEducativo = nivelEducativo;
		this.estadoCivil = estadoCivil;
		this.lugarNacimiento = lugarNacimiento;
		this.descripcionNegocio = descripcionNegocio;
		this.tipoResidencia = tipoResidencia;
		this.sexo = sexo;
		this.codigoPais = codigoPais;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoActividadEconomica = codigoActividadEconomica;
		this.codigoProfesion = codigoProfesion;
		this.codigoDepartamento = codigoDepartamento;
		this.codigoMunicipio = codigoMunicipio;
		this.codigoParroquia = codigoParroquia;
		this.barrio = barrio;
		this.calle = calle;
		this.nomenclatura = nomenclatura;
		this.email = email;
		this.numeroConvencional = numeroConvencional;
		this.numeroCelular = numeroCelular;
		this.operadoraCelular = operadoraCelular;
		this.codigoMunicipioEmpleo = codigoMunicipioEmpleo;
		this.codigoDepartamentoEmpleo = codigoDepartamentoEmpleo;
		this.tipoDependenciaEmpleo = tipoDependenciaEmpleo;
		this.cargoEmpleo = cargoEmpleo;
		this.nombreEmpresaEmpleo = nombreEmpresaEmpleo;
		this.fechaIngreso = fechaIngreso;
		this.ingresoSueldo = ingresoSueldo;
		this.ingresoNegocio = ingresoNegocio;
		this.ingresoRenta = ingresoRenta;
		this.ingresoConyuge = ingresoConyuge;
		this.ingresoOtros = ingresoOtros;
		this.egresosAlimentacion = egresosAlimentacion;
		this.egresosServiciosBasicos = egresosServiciosBasicos;
		this.egresosvehiculo = egresosvehiculo;
		this.egresosTransporte = egresosTransporte;
		this.egresosSalud = egresosSalud;
		this.egresosEducacion = egresosEducacion;
		this.egresosOtros = egresosOtros;
		this.comentario = comentario;
		this.primerApellidoRef = primerApellidoRef;
		this.segundoApellidoRef = segundoApellidoRef;
		this.nombresRef = nombresRef;
		this.tipoRef = tipoRef;
		this.telefonoRef = telefonoRef;
		this.direccionRef = direccionRef;
		this.estadounidense = estadounidense;
		this.residenteOtroPais = residenteOtroPais;
		this.descripcionResidencia = descripcionResidencia;
		this.terminosTarjeta = terminosTarjeta;
		this.terminosCertificado = terminosCertificado;
		this.terminosContrato = terminosContrato;
		this.PersonaExpuesta = PersonaExpuesta;
		this.cedulaFileF = cedulaFileF;
		this.cedulaFileP = cedulaFileP;
		this.sbFile = sbFile;
	}


	public String getPersonaExpuesta() {
		return PersonaExpuesta;
	}

	public void setPersonaExpuesta(String personaExpuesta) {
		PersonaExpuesta = personaExpuesta;
	}

	public String getCedulaFileF() {
		return cedulaFileF;
	}

	public void setCedulaFileF(String cedulaFileF) {
		this.cedulaFileF = cedulaFileF;
	}

	public String getCedulaFileP() {
		return cedulaFileP;
	}

	public void setCedulaFileP(String cedulaFileP) {
		this.cedulaFileP = cedulaFileP;
	}

	public String getSbFile() {
		return sbFile;
	}

	public void setSbFile(String sbFile) {
		this.sbFile = sbFile;
	}

	public String getEstadounidense() {
		return estadounidense;
	}

	public void setEstadounidense(String estadounidense) {
		this.estadounidense = estadounidense;
	}

	public String getResidenteOtroPais() {
		return residenteOtroPais;
	}

	public void setResidenteOtroPais(String residenteOtroPais) {
		this.residenteOtroPais = residenteOtroPais;
	}

	public String getDescripcionResidencia() {
		return descripcionResidencia;
	}

	public void setDescripcionResidencia(String descripcionResidencia) {
		this.descripcionResidencia = descripcionResidencia;
	}

	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}

	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoUno() {
		return apellidoUno;
	}

	public void setApellidoUno(String apellidoUno) {
		this.apellidoUno = apellidoUno;
	}

	public String getApellidosDos() {
		return apellidosDos;
	}

	public void setApellidosDos(String apellidosDos) {
		this.apellidosDos = apellidosDos;
	}

	public Integer getCodigoAgencia() {
		return codigoAgencia;
	}

	public void setCodigoAgencia(Integer codigoAgencia) {
		this.codigoAgencia = codigoAgencia;
	}

	public Integer getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public String getNivelEducativo() {
		return nivelEducativo;
	}

	public void setNivelEducativo(String nivelEducativo) {
		this.nivelEducativo = nivelEducativo;
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

	public String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	public void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	public String getTipoResidencia() {
		return tipoResidencia;
	}

	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(@NotNull Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoActividadEconomica() {
		return codigoActividadEconomica;
	}

	public void setCodigoActividadEconomica(String codigoActividadEconomica) {
		this.codigoActividadEconomica = codigoActividadEconomica;
	}

	public Integer getCodigoProfesion() {
		return codigoProfesion;
	}

	public void setCodigoProfesion(Integer codigoProfesion) {
		this.codigoProfesion = codigoProfesion;
	}

	public Integer getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(Integer codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public Integer getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public void setCodigoMunicipio(Integer codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public Integer getCodigoParroquia() {
		return codigoParroquia;
	}

	public void setCodigoParroquia(Integer codigoParroquia) {
		this.codigoParroquia = codigoParroquia;
	}

	public Integer getBarrio() {
		return barrio;
	}

	public void setBarrio(Integer barrio) {
		this.barrio = barrio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNomenclatura() {
		return nomenclatura;
	}

	public void setNomenclatura(String nomenclatura) {
		this.nomenclatura = nomenclatura;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroConvencional() {
		return numeroConvencional;
	}

	public void setNumeroConvencional(String numeroConvencional) {
		this.numeroConvencional = numeroConvencional;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public Integer getOperadoraCelular() {
		return operadoraCelular;
	}

	public void setOperadoraCelular(Integer operadoraCelular) {
		this.operadoraCelular = operadoraCelular;
	}

	public Integer getCodigoMunicipioEmpleo() {
		return codigoMunicipioEmpleo;
	}

	public void setCodigoMunicipioEmpleo(Integer codigoMunicipioEmpleo) {
		this.codigoMunicipioEmpleo = codigoMunicipioEmpleo;
	}

	public Integer getCodigoDepartamentoEmpleo() {
		return codigoDepartamentoEmpleo;
	}

	public void setCodigoDepartamentoEmpleo(Integer codigoDepartamentoEmpleo) {
		this.codigoDepartamentoEmpleo = codigoDepartamentoEmpleo;
	}

	public String getTipoDependenciaEmpleo() {
		return tipoDependenciaEmpleo;
	}

	public void setTipoDependenciaEmpleo(String tipoDependenciaEmpleo) {
		this.tipoDependenciaEmpleo = tipoDependenciaEmpleo;
	}

	public String getCargoEmpleo() {
		return cargoEmpleo;
	}

	public void setCargoEmpleo(String cargoEmpleo) {
		this.cargoEmpleo = cargoEmpleo;
	}

	public String getNombreEmpresaEmpleo() {
		return nombreEmpresaEmpleo;
	}

	public void setNombreEmpresaEmpleo(String nombreEmpresaEmpleo) {
		this.nombreEmpresaEmpleo = nombreEmpresaEmpleo;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public double getIngresoSueldo() {
		return ingresoSueldo;
	}

	public void setIngresoSueldo(double ingresoSueldo) {
		this.ingresoSueldo = ingresoSueldo;
	}

	public double getIngresoNegocio() {
		return ingresoNegocio;
	}

	public void setIngresoNegocio(double ingresoNegocio) {
		this.ingresoNegocio = ingresoNegocio;
	}

	public double getIngresoRenta() {
		return ingresoRenta;
	}

	public void setIngresoRenta(double ingresoRenta) {
		this.ingresoRenta = ingresoRenta;
	}

	public double getIngresoConyuge() {
		return ingresoConyuge;
	}

	public void setIngresoConyuge(double ingresoConyuge) {
		this.ingresoConyuge = ingresoConyuge;
	}

	public double getIngresoOtros() {
		return ingresoOtros;
	}

	public void setIngresoOtros(double ingresoOtros) {
		this.ingresoOtros = ingresoOtros;
	}

	public double getEgresosAlimentacion() {
		return egresosAlimentacion;
	}

	public void setEgresosAlimentacion(double egresosAlimentacion) {
		this.egresosAlimentacion = egresosAlimentacion;
	}

	public double getEgresosServiciosBasicos() {
		return egresosServiciosBasicos;
	}

	public void setEgresosServiciosBasicos(double egresosServiciosBasicos) {
		this.egresosServiciosBasicos = egresosServiciosBasicos;
	}

	public double getEgresosvehiculo() {
		return egresosvehiculo;
	}

	public void setEgresosvehiculo(double egresosvehiculo) {
		this.egresosvehiculo = egresosvehiculo;
	}

	public double getEgresosTransporte() {
		return egresosTransporte;
	}

	public void setEgresosTransporte(double egresosTransporte) {
		this.egresosTransporte = egresosTransporte;
	}

	public double getEgresosSalud() {
		return egresosSalud;
	}

	public void setEgresosSalud(double egresosSalud) {
		this.egresosSalud = egresosSalud;
	}

	public double getEgresosEducacion() {
		return egresosEducacion;
	}

	public void setEgresosEducacion(double egresosEducacion) {
		this.egresosEducacion = egresosEducacion;
	}

	public double getEgresosOtros() {
		return egresosOtros;
	}

	public void setEgresosOtros(double egresosOtros) {
		this.egresosOtros = egresosOtros;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getPrimerApellidoRef() {
		return primerApellidoRef;
	}

	public void setPrimerApellidoRef(String primerApellidoRef) {
		this.primerApellidoRef = primerApellidoRef;
	}

	public String getSegundoApellidoRef() {
		return segundoApellidoRef;
	}

	public void setSegundoApellidoRef(String segundoApellidoRef) {
		this.segundoApellidoRef = segundoApellidoRef;
	}

	public String getNombresRef() {
		return nombresRef;
	}

	public void setNombresRef(String nombresRef) {
		this.nombresRef = nombresRef;
	}

	public Integer getTipoRef() {
		return tipoRef;
	}

	public void setTipoRef(Integer tipoRef) {
		this.tipoRef = tipoRef;
	}

	public String getTelefonoRef() {
		return telefonoRef;
	}

	public void setTelefonoRef(String telefonoRef) {
		this.telefonoRef = telefonoRef;
	}

	public String getDireccionRef() {
		return direccionRef;
	}

	public void setDireccionRef(String direccionRef) {
		this.direccionRef = direccionRef;
	}

	public String getTerminosTarjeta() {
		return terminosTarjeta;
	}

	public void setTerminosTarjeta(String terminosTarjeta) {
		this.terminosTarjeta = terminosTarjeta;
	}

	public String getTerminosCertificado() {
		return terminosCertificado;
	}

	public void setTerminosCertificado(String terminosCertificado) {
		this.terminosCertificado = terminosCertificado;
	}

	public String getTerminosContrato() {
		return terminosContrato;
	}

	public void setTerminosContrato(String terminosContrato) {
		this.terminosContrato = terminosContrato;
	}

	public Integer getOpt() {
		return opt;
	}

	public void setOpt(Integer opt) {
		this.opt = opt;
	}

	@Override
	public String toString() {
		return "Cliente [codigoIdentificacion=" + codigoIdentificacion + ", nombres=" + nombres + ", apellidoUno="
				+ apellidoUno + ", apellidosDos=" + apellidosDos + ", codigoAgencia=" + codigoAgencia
				+ ", tipoIdentificacion=" + tipoIdentificacion + ", nivelEducativo=" + nivelEducativo + ", estadoCivil="
				+ estadoCivil + ", lugarNacimiento=" + lugarNacimiento + ", descripcionNegocio=" + descripcionNegocio
				+ ", tipoResidencia=" + tipoResidencia + ", sexo=" + sexo + ", codigoPais=" + codigoPais
				+ ", fechaNacimiento=" + fechaNacimiento + ", codigoActividadEconomica=" + codigoActividadEconomica
				+ ", codigoProfesion=" + codigoProfesion + ", codigoDepartamento=" + codigoDepartamento
				+ ", codigoMunicipio=" + codigoMunicipio + ", codigoParroquia=" + codigoParroquia + ", barrio=" + barrio
				+ ", calle=" + calle + ", nomenclatura=" + nomenclatura + ", email=" + email + ", numeroConvencional="
				+ numeroConvencional + ", numeroCelular=" + numeroCelular + ", operadoraCelular=" + operadoraCelular
				+ ", codigoMunicipioEmpleo=" + codigoMunicipioEmpleo + ", codigoDepartamentoEmpleo="
				+ codigoDepartamentoEmpleo + ", tipoDependenciaEmpleo=" + tipoDependenciaEmpleo + ", cargoEmpleo="
				+ cargoEmpleo + ", nombreEmpresaEmpleo=" + nombreEmpresaEmpleo + ", fechaIngreso=" + fechaIngreso
				+ ", ingresoSueldo=" + ingresoSueldo + ", ingresoNegocio=" + ingresoNegocio + ", ingresoRenta="
				+ ingresoRenta + ", ingresoConyuge=" + ingresoConyuge + ", ingresoOtros=" + ingresoOtros
				+ ", egresosAlimentacion=" + egresosAlimentacion + ", egresosServiciosBasicos="
				+ egresosServiciosBasicos + ", egresosvehiculo=" + egresosvehiculo + ", egresosTransporte="
				+ egresosTransporte + ", egresosSalud=" + egresosSalud + ", egresosEducacion=" + egresosEducacion
				+ ", egresosOtros=" + egresosOtros + ", comentario=" + comentario + ", primerApellidoRef="
				+ primerApellidoRef + ", segundoApellidoRef=" + segundoApellidoRef + ", nombresRef=" + nombresRef
				+ ", tipoRef=" + tipoRef + ", telefonoRef=" + telefonoRef + ", direccionRef=" + direccionRef
				+ ", estadounidense=" + estadounidense + ", residenteOtroPais=" + residenteOtroPais
				+ ", descripcionResidencia=" + descripcionResidencia + ", terminosTarjeta=" + terminosTarjeta
				+ ", terminosCertificado=" + terminosCertificado + ", terminosContrato=" + terminosContrato
				+ ", PersonaExpuesta=" + PersonaExpuesta + ", cedulaFileF=" + cedulaFileF + ", cedulaFileP="
				+ cedulaFileP + ", sbFile=" + sbFile + "]";
	}

    

	
	

}
