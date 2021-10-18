package com.bp.test.service;

import java.io.Serializable;
import java.util.List;

import com.bp.test.entity.Proveedor;

public interface ProveedorService extends Serializable {
	
	public Proveedor save(Proveedor proveedor, String operacion) throws Exception;
	
	public Proveedor findById(Long id);
	
	public List<Proveedor> findAll() throws Exception;

}
