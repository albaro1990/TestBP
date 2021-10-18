package com.bp.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bp.test.entity.Producto;

public interface ProductoRepositoryDAO extends CrudRepository<Producto, Long> {

	@Query(value="SELECT * FROM PRODUCTOS WHERE PROVEEDOR = ?1 " , nativeQuery = true )
	List<Producto> findByProveedor(Long id);
}
