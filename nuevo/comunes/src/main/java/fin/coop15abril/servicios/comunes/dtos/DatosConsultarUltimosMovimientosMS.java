package fin.coop15abril.servicios.comunes.dtos;

import java.util.List;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DatosConsultarUltimosMovimientosMS{
	private List<Movimiento> listaMovimientos;	
}
