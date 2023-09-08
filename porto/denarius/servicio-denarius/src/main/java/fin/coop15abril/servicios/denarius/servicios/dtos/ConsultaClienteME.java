package fin.coop15abril.servicios.denarius.servicios.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultaClienteME {

	private String identificacion;
	private Boolean consultarCuentas;
	private Boolean consultarCreditos;
	private Boolean consultarInversiones;
	private Boolean consultarDatosAdicionales;

}
