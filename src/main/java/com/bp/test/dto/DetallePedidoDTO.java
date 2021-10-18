package com.bp.test.dto;

import java.io.Serializable;
import java.util.Date;


public class DetallePedidoDTO implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 7388538476601982192L;




	private Long id;
	

	private CabeceraPedidoDTO cabeceraPedidoDTO;
	
	private ProductoDTO producto;
	
	private Long cantidadPedida;

	
	private Date fechaCreacion;
	
	
	
	private Date fechaPedido;
	
	
	private Double valorDet;


	public Long getId() {
		return id;
	}

	
	

	public CabeceraPedidoDTO getCabeceraPedidoDTO() {
		return cabeceraPedidoDTO;
	}




	public void setCabeceraPedidoDTO(CabeceraPedidoDTO cabeceraPedidoDTO) {
		this.cabeceraPedidoDTO = cabeceraPedidoDTO;
	}




	public ProductoDTO getProducto() {
		return producto;
	}


	public void setProducto(ProductoDTO producto) {
		this.producto = producto;
	}


	public Long getCantidadPedida() {
		return cantidadPedida;
	}


	public void setCantidadPedida(Long cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Date getFechaPedido() {
		return fechaPedido;
	}


	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}


	public Double getValorDet() {
		return valorDet;
	}


	public void setValorDet(Double valorDet) {
		this.valorDet = valorDet;
	}


	public void setId(Long id) {
		this.id = id;
	}


	
}
