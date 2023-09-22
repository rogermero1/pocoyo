package fin.coop15abril.servicios.denarius.servicios.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultarClientesCondicionesME {

	private Integer tipoConsulta;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String nombres;
	private String identificacion;
	private Integer idCliente;
	/*
	TipoConsulta – Código para definir el tipo de consulta. (0 – Nombres y Apellidos, 
															 1 – Identificación,
															 2 – Código Cliente) 
	Nombres (string) – Nombres del cliente. 
	ApellidoPaterno (string) – Apellido paterno del cliente. 
	ApellidoMaterno (string) – Apellido materno del cliente. 
	Identificación (string) – Identificación del cliente. 
	IdCliente (int) – Código interno del cliente. 
	*/

}
