package fin.coop15abril.servicios.denarius.controladores.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RequestApi implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "nombreMetodo es obligatorio")
	private String nombreMetodo;
	@NotBlank(message = "dataJson es obligatorio")
	private String dataJson;

}
