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
public class DatosCreditoME implements Serializable {

	private static final long serialVersionUID = 1L;

	private String numeroOperacion;
	private String idCliente;
	private Boolean consultarPlanPagos;
	private Boolean consultarDatosAdicionales;

}
