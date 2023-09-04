package fin.coop15abril.servicios.denarius.controladores.dtos;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseApi implements Serializable {

	private static final long serialVersionUID = 1L;

	private String codigo;
	private String mensaje;
	private String dataJson;

}
