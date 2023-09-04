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
public class Credito implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numeroOperacion;
	private String operacionBanco;
	private Integer codigoEstado;
	private String estado;
	private String estadoOperacion;
	private Integer codigoOficial;
	private String codigoProducto;
	private String tipo;
	private String codigoTipoCredito;
	private Integer numeroDividendo;
	private Integer cuotasPagadas;
	private Integer plazo;
	private String fechaApertura;
	private String fechaPago;
	private String fechaVencimiento;
	private String fechaVencimientoProximaCuota;
	private Boolean renovacion;
	private Integer diaPago;
	private Integer diasMora;
	private Integer diasXDividendo;
	private Double monto;
	private Double valorEncaje;
	private Double intereses;
	private Double interesesMora;
	private Double montoVencido;
	private Double saldoCapital;
	private Double saldoOperacion;
	private Double tasa;
	private Double tea;
	private Double valor;
	private Double valorCuota;

}
