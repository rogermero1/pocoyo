package com.coop15abril.fin.ec.cta.web.app.service;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.ICuentaAhorro;
import com.coop15abril.fin.ec.cta.web.app.models.dao.CuentaAhorroDao;
import com.coop15abril.fin.ec.cta.web.app.models.dao.IClienteDao;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Cliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CuentaAhorro;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ValidaCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class CuentaAhorroService implements ICuentaAhorro {

	@Autowired
	private CuentaAhorroDao cuentaAhorroDao;

	@Autowired
	private IClienteDao clienteDao;

	@Override
	public CuentaAhorro CrearCuentaAgregarCliente(Cliente cliente) {

		return cuentaAhorroDao.CrearCuentaAgregarCliente(cliente);

	}

	@Override
	public CuentaAhorro CrearCuentaActualizaCliente(Cliente cliente) {
		return cuentaAhorroDao.CrearCuentaActualizaCliente(cliente);
	}

	
	public ValidaCliente VerificaCliente(String dni) {
		return clienteDao.VerificaCliente(dni);
	}

}
