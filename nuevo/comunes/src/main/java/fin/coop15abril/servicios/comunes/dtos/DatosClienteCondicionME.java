package fin.coop15abril.servicios.comunes.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosClienteCondicionME implements Serializable {

	private static final long serialVersionUID = 1L;


	private Integer tipoConsulta;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String nombres;
	private String identificacion;
	private Integer idCliente;
}
