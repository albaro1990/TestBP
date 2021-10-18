package com.bp.test.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bp.test.entity.Proveedor;

public interface ProveedorRepositoryDAO extends CrudRepository<Proveedor, Long> {

	Optional<Proveedor> findByCedulaRuc(String cedulaRuc);
}
