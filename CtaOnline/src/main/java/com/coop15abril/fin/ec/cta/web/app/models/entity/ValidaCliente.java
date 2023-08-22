package com.coop15abril.fin.ec.cta.web.app.models.entity;

public class ValidaCliente {

	private String mensaje ;
	private String error ;

	public ValidaCliente(String mensaje, String error) {
		this.mensaje = mensaje;
		this.error = error;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


}
