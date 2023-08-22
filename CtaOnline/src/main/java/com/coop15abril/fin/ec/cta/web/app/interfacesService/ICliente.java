package com.coop15abril.fin.ec.cta.web.app.interfacesService;

import com.coop15abril.fin.ec.cta.web.app.models.entity.Balance;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosComplementario;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosPersonal;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Domicilio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Empleo;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ReferenciaCliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Telefono;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ValidaCliente;

public interface ICliente {

	ValidaCliente VerificaCliente(String dni);

	DatosPersonal getDatosPersonales(String dni);

	Domicilio getDireccionCliente(String dni);

	Telefono getTelefonoCliente(String dni);

	Empleo getEmpleo(String dni);

	Balance getBalance(String dni);

	ReferenciaCliente getReferenciaCliente(String dni);

	DatosComplementario getDatosComplementario(String dni);

}
