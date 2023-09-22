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
public class DatosNdNcME implements Serializable {

	private static final long serialVersionUID = 1L;

	//@NotBlank(message = "numeroCuenta es obligatorio")
	private String numeroCuenta; //Número de Cuenta a la que se va a realizar el débito.
    private Short causal; /*Número de causal para realizar el débito. Las causales las define la organización y 
    					   deben estar parametrizada previamente, incluyendo costos cuando corresponde.*/
    private Integer idMoneda; //Identificador de moneda de la transacción. Por Defecto “1” equivalente a dólares.
	private Double monto; //Valor a debitar, sin costos ni impuestos.
    private String referencia; //Referencia de la transacción.
    private String referencia2; //Referencia Adicional de la transacción (opcional).
    private Short idCausalRetencion; /*Id de la causal de retención de IVA por servicios digitales. Solo se debe enviar
    								   cuando el control de la lista de proveedores de servicios digitales la realiza la
    								   aplicación que ejecuta este método.*/
	
	
}
