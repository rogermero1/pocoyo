package fin.coop15abril.servicios.comunes.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosConsultarCuentaME implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Número de cuenta es obligatorio")
	private String numeroCuenta;

}
