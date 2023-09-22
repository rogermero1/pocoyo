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
public class Movimiento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	protected String fechaProceso;
	protected Integer idTransaccion;
	protected String Transaccion;
	protected String reversada;
	protected double total;
	protected double saldoDisponible;
	protected double saldoContable;
	protected String causal;
	protected String referencia;
	protected String referencia2;
	protected Integer idOficinaOrigen;
	protected String oficinaOrigen; //cod Oficina + Nombre de la oficina de la transaccion
	protected String usuario;
	protected String fechaTransaccion;
	protected String debitoCredito; // D=debito , C=Credito
	

}
