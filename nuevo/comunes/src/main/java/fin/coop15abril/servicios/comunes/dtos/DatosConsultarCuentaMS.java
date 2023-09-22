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
public class DatosConsultarCuentaMS implements Serializable {

	private static final long serialVersionUID = 1L;

	private CuentaAhorro cuentaAhorro;
	private String identificacionCliente;
	private DatosClienteMS datosCliente;

}
