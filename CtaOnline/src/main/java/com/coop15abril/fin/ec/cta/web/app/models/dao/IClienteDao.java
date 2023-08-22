package com.coop15abril.fin.ec.cta.web.app.models.dao;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.coop15abril.fin.ec.cta.web.app.interfacesService.ICliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Balance;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosComplementario;
import com.coop15abril.fin.ec.cta.web.app.models.entity.DatosPersonal;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Domicilio;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Empleo;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ReferenciaCliente;
import com.coop15abril.fin.ec.cta.web.app.models.entity.Telefono;
import com.coop15abril.fin.ec.cta.web.app.models.entity.ValidaCliente;

@Repository
public class IClienteDao implements ICliente {

	private static final Logger logger = LoggerFactory.getLogger(IClienteDao.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional(readOnly = true)
	@Override
	public ValidaCliente VerificaCliente(String dni) {

		StoredProcedureQuery query = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.mg_p_valida_cliente");
		query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);
		query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);

		query.setParameter(1, dni);
		query.execute();

		return new ValidaCliente((String) query.getOutputParameterValue(2), (String) query.getOutputParameterValue(3));
	}

	@Transactional(readOnly = true)
	@Override
	public DatosPersonal getDatosPersonales(String dni) {
     
		StoredProcedureQuery queryDataCliente = entityManager.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_cliente2");
		queryDataCliente.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryDataCliente.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(5, Date.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(10, String.class, ParameterMode.OUT);
		queryDataCliente.setParameter(1, dni);

		queryDataCliente.execute();

		if (queryDataCliente.getOutputParameterValue(10) != null)
			logger.error("error getDataCliente2 :" + (String) queryDataCliente.getOutputParameterValue(10));
        
		
		return new DatosPersonal((String) queryDataCliente.getOutputParameterValue(2),
				                 (String) queryDataCliente.getOutputParameterValue(3),
				                 (String) queryDataCliente.getOutputParameterValue(4),
				                  (Date) queryDataCliente.getOutputParameterValue(5),
				                 (String) queryDataCliente.getOutputParameterValue(6),
				                 (String) queryDataCliente.getOutputParameterValue(7),
				                 (String) queryDataCliente.getOutputParameterValue(8),
				                 (String) queryDataCliente.getOutputParameterValue(9),
				                 (String) queryDataCliente.getOutputParameterValue(10));

	}

	@Transactional(readOnly = true)
	@Override
	public DatosComplementario getDatosComplementario(String dni) {
		StoredProcedureQuery queryDataCliente = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_cliente");
		queryDataCliente.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryDataCliente.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(5, Integer.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);
		queryDataCliente.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
		queryDataCliente.setParameter(1, dni);

		if (queryDataCliente.getOutputParameterValue(7) != null)
			logger.error("error getDataCliente :" + (String) queryDataCliente.getOutputParameterValue(7));

		queryDataCliente.execute();

		return new DatosComplementario((String) queryDataCliente.getOutputParameterValue(2),
				(String) queryDataCliente.getOutputParameterValue(3),
				(String) queryDataCliente.getOutputParameterValue(4),
				(Integer) queryDataCliente.getOutputParameterValue(5),
				(String) queryDataCliente.getOutputParameterValue(6),
				(String) queryDataCliente.getOutputParameterValue(7));

	}

	@Transactional(readOnly = true)
	@Override
	public Domicilio getDireccionCliente(String dni) {
		
		StoredProcedureQuery queryDireccion = entityManager.createStoredProcedureQuery("mg_k_servicios_web_interna.mg_p_carga_direccion");
		queryDireccion.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryDireccion.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(3, Integer.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(4, Integer.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(5, Integer.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(6, Integer.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(9, String.class, ParameterMode.OUT);
		queryDireccion.registerStoredProcedureParameter(10,String.class, ParameterMode.OUT);
		
		queryDireccion.setParameter(1, dni);
		queryDireccion.execute();

		if (queryDireccion.getOutputParameterValue(10) != null)
			logger.error("error getDireccion :" + (String) queryDireccion.getOutputParameterValue(10));
				
		return new Domicilio((Integer) queryDireccion.getOutputParameterValue(2),
							 (Integer) queryDireccion.getOutputParameterValue(3),
				             (Integer) queryDireccion.getOutputParameterValue(4),
				             (Integer) queryDireccion.getOutputParameterValue(5),
				             (Integer) queryDireccion.getOutputParameterValue(6), 
				             (String)  queryDireccion.getOutputParameterValue(7),
				             (String)  queryDireccion.getOutputParameterValue(8), 
				             (String)  queryDireccion.getOutputParameterValue(9),
				             (String)  queryDireccion.getOutputParameterValue(10));

	}

	@Transactional(readOnly = true)
	@Override
	public Telefono getTelefonoCliente(String dni) {

		StoredProcedureQuery queryTelefono = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_telefono");
		queryTelefono.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryTelefono.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);
		queryTelefono.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		queryTelefono.registerStoredProcedureParameter(4, Integer.class, ParameterMode.OUT);
		queryTelefono.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
		queryTelefono.setParameter(1, dni);

		queryTelefono.execute();

		if (queryTelefono.getOutputParameterValue(5) != null)
			logger.error("error getTelefono :" + (String) queryTelefono.getOutputParameterValue(5));

		return new Telefono((String) queryTelefono.getOutputParameterValue(2),
				(String) queryTelefono.getOutputParameterValue(3), (Integer) queryTelefono.getOutputParameterValue(4),
				(String) queryTelefono.getOutputParameterValue(5));
	}

	@Transactional(readOnly = true)
	@Override
	public Empleo getEmpleo(String dni) {

		StoredProcedureQuery queryEmpleo = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_empleo");
		queryEmpleo.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryEmpleo.registerStoredProcedureParameter(2, Integer.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(3, Integer.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(5, String.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(7, Date.class, ParameterMode.OUT);
		queryEmpleo.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);

		queryEmpleo.setParameter(1, dni);

		queryEmpleo.execute();

		if (queryEmpleo.getOutputParameterValue(8) != null)
			logger.error("error getEmpleo :" + (String) queryEmpleo.getOutputParameterValue(8));

		return new Empleo((Integer) queryEmpleo.getOutputParameterValue(2),
				(Integer) queryEmpleo.getOutputParameterValue(3), (String) queryEmpleo.getOutputParameterValue(4),
				(String) queryEmpleo.getOutputParameterValue(5), (String) queryEmpleo.getOutputParameterValue(6),
				(Date) queryEmpleo.getOutputParameterValue(7), (String) queryEmpleo.getOutputParameterValue(8));
	}

	@Transactional(readOnly = true)
	@Override
	public Balance getBalance(String dni) {

		StoredProcedureQuery queryBalance = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_balace");
		queryBalance.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryBalance.registerStoredProcedureParameter(2, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(3, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(4, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(5, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(6, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(7, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(8, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(9, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(10, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(11, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(12, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(13, double.class, ParameterMode.OUT);
		queryBalance.registerStoredProcedureParameter(14, String.class, ParameterMode.OUT);

		queryBalance.setParameter(1, dni);

		queryBalance.execute();

		if (queryBalance.getOutputParameterValue(14) != null)
			logger.error("error getBalance :" + (String) queryBalance.getOutputParameterValue(14));

		return new Balance((double) queryBalance.getOutputParameterValue(2),
				(double) queryBalance.getOutputParameterValue(3), (double) queryBalance.getOutputParameterValue(4),
				(double) queryBalance.getOutputParameterValue(5), (double) queryBalance.getOutputParameterValue(6),
				(double) queryBalance.getOutputParameterValue(7), (double) queryBalance.getOutputParameterValue(8),
				(double) queryBalance.getOutputParameterValue(9), (double) queryBalance.getOutputParameterValue(10),
				(double) queryBalance.getOutputParameterValue(11), (double) queryBalance.getOutputParameterValue(12),
				(double) queryBalance.getOutputParameterValue(13), (String) queryBalance.getOutputParameterValue(14));

	}

	@Transactional(readOnly = true)
	@Override
	public ReferenciaCliente getReferenciaCliente(String dni) {
		StoredProcedureQuery queryReferencia = entityManager
				.createStoredProcedureQuery("mg_k_servicios_web_interna.Mg_p_carga_referencias");
		queryReferencia.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		queryReferencia.registerStoredProcedureParameter(2, String.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(4, String.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(5, Integer.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(6, String.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(7, String.class, ParameterMode.OUT);
		queryReferencia.registerStoredProcedureParameter(8, String.class, ParameterMode.OUT);
		queryReferencia.setParameter(1, dni);
		queryReferencia.execute();

		if (queryReferencia.getOutputParameterValue(8) != null)
			logger.error("error getReferencia :" + (String) queryReferencia.getOutputParameterValue(8));

		return new ReferenciaCliente((String) queryReferencia.getOutputParameterValue(2),
				(String) queryReferencia.getOutputParameterValue(3),
				(String) queryReferencia.getOutputParameterValue(4),
				(Integer) queryReferencia.getOutputParameterValue(5),
				(String) queryReferencia.getOutputParameterValue(6),
				(String) queryReferencia.getOutputParameterValue(7),
				(String) queryReferencia.getOutputParameterValue(8));
	}



}
