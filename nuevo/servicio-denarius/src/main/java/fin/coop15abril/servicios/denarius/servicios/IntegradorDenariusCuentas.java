package fin.coop15abril.servicios.denarius.servicios;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fin.coop15abril.servicios.comunes.dtos.DatosClienteME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultaSaldoAtmME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultaSaldoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarCuentaME;
import fin.coop15abril.servicios.comunes.dtos.DatosConsultarCuentaMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNdNcAtmME;
import fin.coop15abril.servicios.comunes.dtos.DatosNdNcME;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaCreditoMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoAtmMS;
import fin.coop15abril.servicios.comunes.dtos.DatosNotaDebitoMS;
import fin.coop15abril.servicios.comunes.dtos.DatosReversoNdNcME;
import fin.coop15abril.servicios.comunes.excepciones.ExcepcionApp;
import fin.coop15abril.servicios.comunes.utilerias.JsonUtils;
import fin.coop15abril.servicios.denarius.clientesrest.ApisClientes;
import fin.coop15abril.servicios.denarius.clientesrest.ApisCuentas;
import fin.coop15abril.servicios.denarius.configuracion.ConfiguradorIntegraciones;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultaClienteME;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultaSaldoAtmME;
import fin.coop15abril.servicios.denarius.servicios.dtos.ConsultarCuentaME;
import fin.coop15abril.servicios.denarius.servicios.dtos.NdNcAtmME;
import fin.coop15abril.servicios.denarius.servicios.dtos.NdNcME;
import fin.coop15abril.servicios.denarius.servicios.dtos.ReversoNdNcME;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class IntegradorDenariusCuentas {
	private static final String ERROR_CONSULTA = "Error al procesar consulta";

	@Autowired
	private ConfiguradorIntegraciones integradorConfig;

	@Autowired
	private ApisCuentas apiCuentas;
	
	@Autowired
	private ApisClientes apiClientes;
	
//	@Autowired
//	private ApisCreditos apiCreditos;

//	@Autowired
//	private ApisInversiones apiInversiones;
	
	public String bloquearCuentasCliente(String data) throws ExcepcionApp{
		ConsultaClienteME consultaClienteME = JsonUtils.jsonToClass(data, ConsultaClienteME.class);
		if (consultaClienteME != null) {
			String bloquearCuenta = apiCuentas.bloquearCuentasCliente(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosClienteME(consultaClienteME.getIdentificacion()));			
			return JsonUtils.classToJson(bloquearCuenta);
		} else {
			log.error("IntegracionDenarius: consultaClienteME vacio");
			throw new ExcepcionApp("500", "Error al procesar bloqueo", "consultaClienteME vacio");
		}
	}
	
	public String consultarCuentaPorNumeroCta(String data) throws Exception {

		ConsultarCuentaME consultarCuentaME = JsonUtils.jsonToClass(data, ConsultarCuentaME.class);

		if (consultarCuentaME != null) {
			DatosConsultarCuentaMS cuenta = apiCuentas.consultarCuentaPorNumeroCta(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosConsultarCuentaME(consultarCuentaME.getNumeroCuenta()));

			if (Boolean.TRUE.equals(consultarCuentaME.getConsultarDatosCliente())) {
				cuenta.setDatosCliente(
						apiClientes.consultaClientesPorIdentificacion(URI.create(integradorConfig.getUrlApisClientes()),
								new DatosClienteME(cuenta.getIdentificacionCliente())));
			}

			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: ConsultarCuentaME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "ConsultarCuentaME vacio");
		}

	}
	
	public String consultaSaldoAtm(String data) throws Exception {

		ConsultaSaldoAtmME consultaSaldoAtmME = JsonUtils.jsonToClass(data, ConsultaSaldoAtmME.class);

		if (consultaSaldoAtmME != null) {
			DatosConsultaSaldoAtmMS cuenta = apiCuentas.consultaSaldoAtm(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosConsultaSaldoAtmME(consultaSaldoAtmME.getNumeroCuenta(), consultaSaldoAtmME.getCausal(), consultaSaldoAtmME.getReferencia2()));



			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: consultaSaldoAtmME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "consultaSaldoAtmME vacio");
		}

	}	

	public String compensarNotaDebitoAtm(String data) throws Exception {

		ReversoNdNcME compensarNotaDebitoAtmME = JsonUtils.jsonToClass(data, ReversoNdNcME.class);

		if (compensarNotaDebitoAtmME != null) {
			DatosNotaDebitoAtmMS cuenta = apiCuentas.compensarNotaDebitoAtm(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosReversoNdNcME(compensarNotaDebitoAtmME.getCausalReverso(),
							compensarNotaDebitoAtmME.getIdMoneda(), 
							compensarNotaDebitoAtmME.getMonto(), 
					compensarNotaDebitoAtmME.getNumeroCuenta(), 
					compensarNotaDebitoAtmME.getReferencia(), 
					compensarNotaDebitoAtmME.getReferencia2(), 
					compensarNotaDebitoAtmME.getCausalReversoConsulta(),
					compensarNotaDebitoAtmME.getIdCausalRetencion()));

			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: compensarNotaDebitoAtmME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "compensarNotaDebitoAtmME vacio");
		}

	}
	
	public String generarNotaDebitoAtm(String data) throws Exception {

		NdNcAtmME nNdNcAtmME = JsonUtils.jsonToClass(data, NdNcAtmME.class);

		if (nNdNcAtmME != null) {
			DatosNotaDebitoAtmMS cuenta = apiCuentas.generarNotaDebitoAtm(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosNdNcAtmME(nNdNcAtmME.getNumeroCuenta(),
							nNdNcAtmME.getCausal(), 
							nNdNcAtmME.getCausalConsulta(), 
					nNdNcAtmME.getIdMoneda(), 
					nNdNcAtmME.getMonto(), 
					nNdNcAtmME.getReferencia(), 
					nNdNcAtmME.getReferencia2()));
			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: nNdNcAtmME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "generarNotaDebitoAtm vacio");
		}

	}		
	
	public String compensarNotaDebito(String data) throws Exception {

		ReversoNdNcME compensarNotaDebitoME = JsonUtils.jsonToClass(data, ReversoNdNcME.class);

		if (compensarNotaDebitoME != null) {
			DatosNotaDebitoMS cuenta = apiCuentas.compensarNotaDebito(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosReversoNdNcME(compensarNotaDebitoME.getCausalReverso(),
							compensarNotaDebitoME.getIdMoneda(), 
							compensarNotaDebitoME.getMonto(), 
					compensarNotaDebitoME.getNumeroCuenta(), 
					compensarNotaDebitoME.getReferencia(), 
					compensarNotaDebitoME.getReferencia2(), 
					compensarNotaDebitoME.getCausalReversoConsulta(),
					compensarNotaDebitoME.getIdCausalRetencion()));

			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: compensarNotaDebitoME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "compensarNotaDebitoME vacio");
		}

	}
	
	public String generarNotaDebito(String data) throws Exception {

		NdNcME nNdNcME = JsonUtils.jsonToClass(data, NdNcME.class);

		if (nNdNcME != null) {
			DatosNotaDebitoMS cuenta = apiCuentas.generarNotaDebito(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosNdNcME(nNdNcME.getNumeroCuenta(),
							nNdNcME.getCausal(), 
					nNdNcME.getIdMoneda(), 
					nNdNcME.getMonto(), 
					nNdNcME.getReferencia(), 
					nNdNcME.getReferencia2(),
					nNdNcME.getIdCausalRetencion()));
			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: nNdNcME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "generarNotaDebito vacio");
		}

	}
	
	public String compensarNotaCredito(String data) throws Exception {

		ReversoNdNcME compensarNotaCreditoME = JsonUtils.jsonToClass(data, ReversoNdNcME.class);

		if (compensarNotaCreditoME != null) {
			DatosNotaCreditoMS cuenta = apiCuentas.compensarNotaCredito(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosReversoNdNcME(compensarNotaCreditoME.getCausalReverso(),
							compensarNotaCreditoME.getIdMoneda(), 
							compensarNotaCreditoME.getMonto(), 
							compensarNotaCreditoME.getNumeroCuenta(), 
							compensarNotaCreditoME.getReferencia(), 
							compensarNotaCreditoME.getReferencia2(), 
							compensarNotaCreditoME.getCausalReversoConsulta(),
							compensarNotaCreditoME.getIdCausalRetencion()));

			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: compensarNotaCreditoME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "compensarNotaCreditoME vacio");
		}

	}
	
	public String generarNotaCredito(String data) throws Exception {

		NdNcME nNdNcME = JsonUtils.jsonToClass(data, NdNcME.class);

		if (nNdNcME != null) {
			DatosNotaCreditoMS cuenta = apiCuentas.generarNotaCredito(
					URI.create(integradorConfig.getUrlApisCuentas()),
					new DatosNdNcME(nNdNcME.getNumeroCuenta(),
							nNdNcME.getCausal(), 
					nNdNcME.getIdMoneda(), 
					nNdNcME.getMonto(), 
					nNdNcME.getReferencia(), 
					nNdNcME.getReferencia2(), null));
			return JsonUtils.classToJson(cuenta);
		} else {
			log.error("IntegracionDenarius: nNdNcME vacio");
			throw new ExcepcionApp("500", ERROR_CONSULTA, "generarNotaCredito vacio");
		}

	}
	
}
