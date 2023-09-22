package fin.coop15abril.servicios.denarius.servicios.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReversoNdNcME implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotBlank(message = "numeroCuenta es obligatorio")
	private Short causalReverso; //Número de Causal con el cuál se va a registrar la operación respectiva.
	private Integer idMoneda; //Identificador de moneda de la transacción. Por Defecto “1” equivalente a dólares.
	private Double monto; //Valor debitado.
    private String numeroCuenta; //Número de Cuenta a la que se va a realizar la compensación.
    private String referencia; //Referencia de la transacción. 
    private String referencia2; //Referencia secundaria de la transacción. 
    private Short causalReversoConsulta; //Número de Causal de consulta impresa. Para indicar que no se debe reversar el
    									//costo de impresión se debe enviar 0. 
    private Short idCausalRetencion; /*Id de la causal de retención de IVA por servicios digitales. Solo se debe enviar cuando 
	   el control de la lista de proveedores de servicios digitales la realiza la aplicación que
	   ejecuta este método*/ 

	
	
}
