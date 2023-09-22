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
public class DatosNotaDebitoAtmMS implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroTransaccion; //Número único de la transacción de compensación del retiro de ATM.
	private Double comisionDebito; //Costo comisión del retiro, que fue compensado. 
	private String numeroTransaccionConsulta; /* Número único de la transacción de compensación de la consulta impresa de ATM.
												 Solo cuando se pide compensar la consulta impresa, en caso contrario “null”.*/
	private Double comisionConsulta; /* Costo comisión de la consulta impresa que fue compensado. Solo cuando se pide 
										compensar la consulta impresa, en caso contrario 0.*/
	private Integer idOficina; // Id de la oficina de la cuenta.
	private String oficina; // Nombre de la Oficina de la cuenta.
	private Double saldoDisponible; // Saldo disponible de la cuenta.
	private Double saldoContable; // Saldo contable de la cuenta
	private Double saldoAGirar; // Saldo que se puede retirar de la cuenta
	private String fechaProceso; // Fecha de Proceso del Core.

}
