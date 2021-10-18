package com.bp.test.dto;

import java.io.Serializable;
import java.util.Date;

public class ProductoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1285454306356845809L;

	
	private Long id;
	
	private String nombre;
	private Double precio;
	private Date createAt;
	private ProveedorDTO proveedorDTO;
	private Long cantidadStock;
	 
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	public Long getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(Long cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public ProveedorDTO getProveedorDTO() {
		return proveedorDTO;
	}
	public void setProveedorDTO(ProveedorDTO proveedorDTO) {
		this.proveedorDTO = proveedorDTO;
	}

	
}
