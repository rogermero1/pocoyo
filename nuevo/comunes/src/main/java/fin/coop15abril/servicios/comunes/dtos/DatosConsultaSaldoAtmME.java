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
public class DatosConsultaSaldoAtmME implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "numeroCuenta es obligatorio")
	private String numeroCuenta; //Número de la cuenta.
	private Short causal; //Causal con el cuál se realizará el cobro de comisión de la consulta.
	private String referencia2; //Referencia transacción

	
}
