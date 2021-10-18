package com.bp.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.test.dao.ProveedorDao;
import com.bp.test.entity.Proveedor;
import com.bp.test.repositories.ProveedorRepositoryDAO;
import com.bp.test.service.ProveedorService;

@Scope("singleton")
@Service("ProveedorServiceImpl")
public class ProveedorServiceImpl implements ProveedorService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4035771792561170412L;


	private static final Logger LOG = LoggerFactory.getLogger(ProveedorServiceImpl.class);
	
	
	@Autowired
	private ProveedorDao proveedorDao;
	
	@Autowired
	private ProveedorRepositoryDAO proveedorRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Proveedor save(Proveedor proveedor, String operacion) throws Exception{
		try {
			
			if(operacion.equalsIgnoreCase("INS")) {
			if(proveedorRepository.findByCedulaRuc(proveedor.getCedulaRuc()).isPresent()) {
				throw new Exception("Proveedor con esa cedulaRuc ya existe");
		    	}
			}
			
			return proveedorDao.save(proveedor);
		} catch (Exception e) {
			LOG.error("save: ", e);
			throw new Exception("Error al guardar el registros");
		}
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Proveedor findById(Long id) {
		return proveedorDao.findById(id).orElse(null);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Proveedor> findAll() throws Exception{
		
		try {
			return proveedorDao.findAll();
			
		} catch (Exception e) {
			LOG.error("findAll: ", e);
			throw new Exception("Error al buscar los registros");
		}

	}
	
	

}
