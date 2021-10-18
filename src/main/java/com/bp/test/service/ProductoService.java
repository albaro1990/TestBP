package com.bp.test.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import com.bp.test.entity.Producto;

public interface ProductoService extends Serializable {
	
	public Producto save(Producto producto) throws Exception;

	public Optional<Producto> findById(Long id) throws Exception;

	
	public List<Producto> findByProveedor(Long id) throws Exception;
}
