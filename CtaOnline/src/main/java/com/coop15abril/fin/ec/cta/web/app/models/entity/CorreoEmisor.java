/**
 * 
 */
package com.coop15abril.fin.ec.cta.web.app.models.entity;

/**
 * @author cristian.german
 *
 */
public class CorreoEmisor {

	private String correo;
	private String clave;

	public CorreoEmisor(String correo, String clave) {
		this.correo = correo;
		this.clave = clave;
	}

	public CorreoEmisor() {

	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "CorreoEmisor [correo=" + correo + ", clave=" + clave + "]";
	}

}
