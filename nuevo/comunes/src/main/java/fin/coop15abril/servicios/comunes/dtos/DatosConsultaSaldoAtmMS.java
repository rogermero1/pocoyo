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
public class DatosConsultaSaldoAtmMS implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroTransaccion;
	private Integer idOficina;
	private String oficina;
	private String signoSaldoDisponible;
	private Double saldoDisponible;
	private Double comision;
	private Double saldoContable;
	private Double saldoAGirar;
	private String fechaProceso;

}
