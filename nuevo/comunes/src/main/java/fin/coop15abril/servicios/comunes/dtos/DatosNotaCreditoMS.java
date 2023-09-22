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
public class DatosNotaCreditoMS implements Serializable {

	private static final long serialVersionUID = 1L;

	//MSNotaCredito – Mensaje de salida que hereda de MensajeSalidaBase. 
	private String numeroTransaccion; //Identiicador única de la transacción asignado por el Core.
	private String fechaProceso; //Fecha de proceso del sistema.
	private Boolean generarFormularioOrigenFondos; //Si va a generar o no el formulario de Origen de Fondos.
	private Double montoAcumulado; //Monto acumulado para la generación del formulario de Origen de Fondos.
	private Integer idOficina; //Identificador de la Oficina de Manejo de la Cuenta. 
	private String oficina; //Nombre de la sucursal de la cuenta. 
	private String signoSaldoDisponible; //Signo del saldo disponible. 
	private Double saldoDisponible; //Saldo disponible. 
	private CuentaAhorro datosCuenta; //Clase con información de la cuenta
	private DatosClienteMS datosCliente; //Clase que tiene datos para retornar del Cliente. 

}
