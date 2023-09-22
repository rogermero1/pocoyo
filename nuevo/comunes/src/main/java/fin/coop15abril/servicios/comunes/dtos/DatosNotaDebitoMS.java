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
public class DatosNotaDebitoMS implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroTransaccion; //Identiicador única de la transacción asignado por el Core.
	private String fechaProceso; //Fecha de proceso del sistema.
	//Resultado (ResultadoNdNc) – Clase que contiene los datos resultantes de la Nota de Débito. 
	private Integer idOficina; //Identificador de la Oficina de Manejo de la Cuenta. 
	private String oficina; //Nombre de la sucursal de la cuenta. 
	private String signoSaldoDisponible; //Signo del saldo disponible. 
	private Double saldoDisponible; //Saldo disponible. 
	private Double comision; //Costo de la transacción.
	private CuentaAhorro datosCuenta; //Clase con información de la cuenta.

}
