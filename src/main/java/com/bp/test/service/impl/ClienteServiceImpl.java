package com.bp.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.test.dao.ClienteDao;
import com.bp.test.entity.Cliente;
import com.bp.test.service.ClienteService;

@Scope("singleton")
@Service("ClienteServiceImpl")
public class ClienteServiceImpl implements ClienteService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4035771792561170412L;


	private static final Logger LOG = LoggerFactory.getLogger(ClienteServiceImpl.class);
	
	
	@Autowired
	private ClienteDao clienteDao;
	
	
	
	@Override
	@Transactional(readOnly = true)
	public Cliente save(Cliente cliente, String operacion) throws Exception{
		try {
			

			return clienteDao.save(cliente);
		} catch (Exception e) {
			LOG.error("save: ", e);
			throw new Exception("Error al guardar el registros");
		}
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() throws Exception{
		
		try {
			return clienteDao.findAll();
			
		} catch (Exception e) {
			LOG.error("findAll: ", e);
			throw new Exception("Error al buscar los registros");
		}

	}
	
	

}
