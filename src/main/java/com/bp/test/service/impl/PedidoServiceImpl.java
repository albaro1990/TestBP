package com.bp.test.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bp.test.dao.PedidoDao;
import com.bp.test.entity.CabeceraPedido;
import com.bp.test.entity.DetallePedido;
import com.bp.test.service.PedidoService;

@Scope("singleton")
@Service("PedidoServiceImpl")
public class PedidoServiceImpl implements PedidoService {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4035771792561170412L;


	private static final Logger LOG = LoggerFactory.getLogger(PedidoServiceImpl.class);
	
	
	@Autowired
	private PedidoDao pedidoDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public CabeceraPedido save(CabeceraPedido cabeceraPedido, List<DetallePedido> detallesPedido ) throws Exception{
		try {
			
			
				return pedidoDao.save(cabeceraPedido);
				
		} catch (Exception e) {
			LOG.error("save: ", e);
			throw new Exception("Error al guardar el registros");
		}
		
	}
	
	
	@Override
	@Transactional
	public void delete(Long id) throws Exception{
		try {
			pedidoDao.deleteById(id);
		} catch (Exception e) {
			LOG.error("delete: ", e);
			throw new Exception("Error al Eliminar  los registros");
		}
		
	}
	
	

}
