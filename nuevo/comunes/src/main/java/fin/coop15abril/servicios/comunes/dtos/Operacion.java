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
public class Operacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected String actividadEconomica;//JAXBElement<String>    
    protected Integer codOficial;    
    protected Integer codOficina;//JAXBElement<Short>    
    protected String codigoActividadEconomica;    
    protected String codigoCantonDestino;    
    protected String codigoCiudadDestino;    
    protected Integer codigoCliente;    
    protected String codigoDesEspecifico;    
    protected String codigoMoneda;    
    protected String codigoOficina;    
    protected String codigoOrigenRecursos;    
    protected String codigoParroquiaDestino;    
    protected String codigoProvinciaDestino;    
    protected String codigoSector;    
    protected String codigoSegmento;    
    protected String codigoTipoCredito;    
    protected String codigoTipoOp;    
    protected String cuenta;    
    protected String desMoneda;    
    protected String desSector;    
    protected String desTipoOperacion;    
    protected String descFormaRecepcion;    
    protected String descTipoCuota;    
    protected String descTipoPlazo;    
    protected String descripcionCantonDestino;    
    protected String descripcionCiudadDestino;    
    protected String descripcionDesEspecifico;    
    protected String descripcionOficina;    
    protected String descripcionOrigenRecursos;    
    protected String descripcionParroquiaDestino;    
    protected String descripcionProvinciaDestino;    
    protected String descripcionSegmento;    
    protected Boolean enviadoCartera;    
    protected String estado;    
    protected Integer estadoOper;//Short    
    protected String estadoSolicitud;    
    protected String fechaDeEmision;//JAXBElement<XMLGregorianCalendar>
    protected String fechaDeVencimiento;//JAXBElement<XMLGregorianCalendar>    
    protected String fechaLiquidacion;//JAXBElement<XMLGregorianCalendar>
    protected Integer idOperacionCartera;    
    protected Integer idTipoCredito;    
    protected String identificacionCliente;    
    protected Double montoAprobado;    
    protected Double montoDesembolsado;    
    protected String nombreCliente;    
    protected String nombreOficial;    
    protected Integer numeroCuotas;    
    protected Integer numeroDeTramite;    
    protected String numeroOperacionCartera;    
    protected Integer periodoCapital;    
    protected Integer periodoInteres;    
    protected Integer plazo;    
    protected Double saldoCapital;    
    protected Integer segmento;    
    protected Double tasaInteres;    
    protected String tipoCredito;    
    protected String tipoCuota;    
    protected String tipoPlazo;    
    protected Double valorCuota;
	
}
