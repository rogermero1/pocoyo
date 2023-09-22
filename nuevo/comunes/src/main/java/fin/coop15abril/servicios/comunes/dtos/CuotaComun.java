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
public class CuotaComun implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	
    private Double capitalPagado;    
    private Double capitalProyectado;    
    private Integer codEstado;    
    private String estado; 
    private String fechaInicio;    
    private String fechaVencimiento;    
    private Integer idCliente;    
    private Integer idCuota;    
    private Integer idOperacion;    
    private Double interesPagado;    
    private Double interesProyectado;    
    private Double moraPagado; 
    private Double moraProyectado;    
    private Integer numeroCuota;    
    private String numeroOperacion;    
    private Double otrosPagado;    
    private Double otrosProyectado;    
    private Double saldoCapital;    
    private Double seguroPagado;    
    private Double seguroProyectado;    
    private Double totalProyectado;    
    private Double valor;

}
