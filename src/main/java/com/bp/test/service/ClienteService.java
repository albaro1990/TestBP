package com.bp.test.service;

import java.io.Serializable;
import java.util.List;

import com.bp.test.entity.Cliente;

public interface ClienteService extends Serializable {
	
	public Cliente save(Cliente cliente, String operacion) throws Exception;
	
	public Cliente findById(Long id);
	
	public List<Cliente> findAll() throws Exception;

}
