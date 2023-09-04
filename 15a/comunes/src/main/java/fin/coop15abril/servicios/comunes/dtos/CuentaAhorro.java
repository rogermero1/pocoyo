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
public class CuentaAhorro implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idCuenta;
	private Integer idCliente;
	private Integer idClientePrincipal;
	private String numeroCuenta;
	private String codigoSubProducto;
	private String descripcionSubProducto;
	private String nombreProducto;
	private String nombreMoneda;
	private String estado;
	private String fechaApertura;
	private Boolean bloqueada;
	private String tipoBloqueo;
	private Double saldoAGirar;
	private Double saldoContable;
	private Double saldoDisponible;
	private Double montoBloqueado;
	private Double porEfectivizar;
	private Double porEfectivizarHoy;
	private Double valorRetenido;
	private Double valorSuspenso;

}
