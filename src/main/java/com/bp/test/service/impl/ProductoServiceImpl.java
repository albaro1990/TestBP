package com.bp.test.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.test.dao.ProductoDao;
import com.bp.test.entity.Producto;
import com.bp.test.repositories.ProductoRepositoryDAO;
import com.bp.test.service.ProductoService;

@Scope("singleton")
@Service("ProductoServiceImpl")
public class ProductoServiceImpl implements ProductoService {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128872387084579404L;


	private static final Logger LOG = LoggerFactory.getLogger(ProductoServiceImpl.class);
	
	
	@Autowired
	private ProductoDao productoDao;
	

	@Autowired
	private ProductoRepositoryDAO productoRepositoryDAO;
	
	@Override
	@Transactional(readOnly = false)
	public Producto save(Producto producto) throws Exception {
		
		try {
			return productoDao.save(producto);
		} catch (Exception e) {
			LOG.error("save: ", e);
			throw new Exception("Error al guardar el registro");
		}
		
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Producto> findById(Long id) throws Exception{
		
		try {
			
			return productoDao.findById(id);
			
		} catch (Exception e) {
			LOG.error("findById: ", e);
			throw new Exception("Error al buscar el registro");
		}
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findByProveedor(Long id) throws Exception{
		
		try {
			return productoRepositoryDAO.findByProveedor(id);
		} catch (Exception e) {
			LOG.error("findByProveedor: ", e);
			throw new Exception("Error al buscar los registros");
		}
		
	}
	


}
