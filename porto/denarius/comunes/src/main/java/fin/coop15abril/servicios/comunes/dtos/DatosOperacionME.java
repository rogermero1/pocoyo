package fin.coop15abril.servicios.comunes.dtos;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosOperacionME {
	
	//@NotBlank(message = "tipoConsulta es obligatorio")
	private Integer tipoConsulta;
	@NotBlank(message = "codigo es obligatorio")
	private String codigo;

}
