package fin.coop15abril.servicios.denarius.servicios.dtos;

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
public class ConsultaSaldoAtmME implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "numeroCuenta es obligatorio")
	private String numeroCuenta;
	private Short causal;
	private String referencia2;

	
}
