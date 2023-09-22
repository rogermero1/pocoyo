package fin.coop15abril.servicios.comunes.excepciones;

import lombok.Getter;

@Getter
public class ExcepcionApp extends Exception {

	private static final long serialVersionUID = 1L;

	private final String codigo;
	private final String mensajeUsuario;
	private final String mensajeTecnico;

	public ExcepcionApp(Exception e) {
		super(e);
		this.codigo = "500";
		this.mensajeUsuario = "error";
		this.mensajeTecnico = e.getMessage();
	}

	public ExcepcionApp(String codigo, String mensajeUsuario, String mensajeTecnico) {
		super(new Exception(mensajeTecnico));
		this.codigo = codigo;
		this.mensajeUsuario = mensajeUsuario;
		this.mensajeTecnico = mensajeTecnico;
	}

}
