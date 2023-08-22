package com.coop15abril.fin.ec.cta.web.app.interfacesService;

import java.text.ParseException;

import com.coop15abril.fin.ec.cta.web.app.models.entity.Cliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.CuentaAhorro;

public interface ICuentaAhorro {

	CuentaAhorro CrearCuentaAgregarCliente(Cliente cliente) throws ParseException;

	CuentaAhorro CrearCuentaActualizaCliente(Cliente cliente) throws ParseException;


}
