package fin.coop15abril.servicios.comunes.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosCarteraMS {
	
	private List<CuotaComun> tablaAmortizacion;

}
