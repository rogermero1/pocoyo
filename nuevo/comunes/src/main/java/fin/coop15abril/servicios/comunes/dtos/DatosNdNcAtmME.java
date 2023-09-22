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
public class DatosNdNcAtmME implements Serializable {

	private static final long serialVersionUID = 1L;

	//@NotBlank(message = "numeroCuenta es obligatorio")
	private String numeroCuenta; //Número de Cuenta a la que se va a realizar el débito o crédito respectivo.
    private Short causal; //Número de Causal con el cuál se va a registrar la operación respectiva.
    private Short causalConsulta; /*Número de Causal con el cuál se va a registrar la comisión de la consulta 
									respectiva (0 si no se cobra consulta por impresión)*/ 
    private Integer idMoneda; //Identificador de moneda de la transacción. Por Defecto “1” equivalente a dólares.
	private Double monto; //Valor a acreditar o debitar respectivamente.
    private String referencia; //Referencia de la transacción. 
    private String referencia2; //Referencia secundaria de la transacción. 
    
	
	
}
