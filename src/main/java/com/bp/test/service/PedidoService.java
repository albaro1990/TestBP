package com.bp.test.service;

import java.io.Serializable;
import java.util.List;

import com.bp.test.entity.CabeceraPedido;
import com.bp.test.entity.DetallePedido;

public interface PedidoService extends Serializable {
	
	public void delete(Long id) throws Exception;
	
	public CabeceraPedido save(CabeceraPedido cabeceraPedido, List<DetallePedido> detallesPedido ) throws Exception;

}
