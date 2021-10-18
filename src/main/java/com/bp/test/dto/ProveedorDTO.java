package com.bp.test.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class ProveedorDTO implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 6719482604624854349L;

	private Long id;
	
	private String nombre;
	private String direccion;
	private String cedulaRuc;
	
	private Date createAt;
	
	
	private List<ProductoDTO> productosDto;
	private List<CabeceraPedidoDTO> listPedidoDto;
	


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


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Date getCreateAt() {
		return createAt;
	}


	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	




	public List<CabeceraPedidoDTO> getListPedidoDto() {
		return listPedidoDto;
	}


	public void setListPedidoDto(List<CabeceraPedidoDTO> listPedidoDto) {
		this.listPedidoDto = listPedidoDto;
	}


	public List<ProductoDTO> getProductosDto() {
		return productosDto;
	}


	public void setProductosDto(List<ProductoDTO> productosDto) {
		this.productosDto = productosDto;
	}


	public String getCedulaRuc() {
		return cedulaRuc;
	}


	public void setCedulaRuc(String cedulaRuc) {
		this.cedulaRuc = cedulaRuc;
	}


	



}
