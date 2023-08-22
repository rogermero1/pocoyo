/**
 * 
 */
package com.coop15abril.fin.ec.cta.web.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.ICliente;
import com.coop15abril.fin.ec.cta.web.app.models.dao.IClienteDao;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Balance;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosComplementario;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosPersonal;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Domicilio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Empleo;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ReferenciaCliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Telefono;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ValidaCliente;

/**
 * @author cristian.german
 *
 */
@Component
@Service
public class ClienteService implements ICliente {
	private static final Logger logger = LoggerFactory.getLogger(ClienteService.class);

	@Autowired
	private IClienteDao clienteDao;

	@Override
	public ValidaCliente VerificaCliente(String dni) {
		
		return null;
	}

	@Override
	public DatosPersonal getDatosPersonales(String dni) {
		DatosPersonal datosP = null;
		try {
			datosP = clienteDao.getDatosPersonales(dni);
			if (datosP.getError() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER LOS DATOS PERSONALES CLIENTE ", e);
			return null;
		}
		return datosP;
	}

	@Override
	public Domicilio getDireccionCliente(String dni) {		 
		try {
			
			Domicilio domicilio = clienteDao.getDireccionCliente(dni);
			if (domicilio.getErrors() != null) {
				return null;
			}
			return domicilio;
			
		} catch (Throwable e) {
			
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS DIRECCION CLIENTE ", e);
			return null;
		}
	}

	@Override
	public Telefono getTelefonoCliente(String dni) {
		Telefono telefono = null;
		try {
			telefono = clienteDao.getTelefonoCliente(dni);
			if (telefono.getError() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS TELEFONO CLIENTE ", e);
			return null;
		}
		return telefono;
	}

	@Override
	public Empleo getEmpleo(String dni) {
		Empleo empleo = null;
		try {
			empleo = clienteDao.getEmpleo(dni);
			if (empleo.getError() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS EMPLEO CLIENTE ", e);
			return null;
		}
		return empleo;
	}

	@Override
	public Balance getBalance(String dni) {
		Balance balance = null;
		try {
			balance = clienteDao.getBalance(dni);
			if (balance.getError() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS BALANCE CLIENTE ", e);
			return null;
		}
		return balance;
	}

	@Override
	public ReferenciaCliente getReferenciaCliente(String dni) {
		ReferenciaCliente referenciaCliente = null;
		try {
			referenciaCliente = clienteDao.getReferenciaCliente(dni);
			if (referenciaCliente.getError() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS REFERENCIA CLIENTE ", e);
			return null;
		}

		return referenciaCliente;
	}

	@Override
	public DatosComplementario getDatosComplementario(String dni) {
		DatosComplementario complementario=null;
		try {
			complementario = clienteDao.getDatosComplementario(dni);
			if (complementario.getErrors() != null) {
				return null;
			}
		} catch (Throwable e) {
			e.printStackTrace();
			logger.error("ERROR AL OBTENER DATOS COMPLEMENTARIO CLIENTE ", e);
			return null;
		}
		return complementario;
	}

}
