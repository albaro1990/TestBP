package com.bp.test.dto;

import java.io.Serializable;
import java.util.Date;


public class CabeceraPedidoDTO implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9063240666971911629L;


	private Long id;
	

	private ClienteDTO clienteDTO;

	private ProveedorDTO proveedorPed;
	
	private Long cantTotal;


	private Date fechaCreacion;
	

	private Date fechaPedido;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public ClienteDTO getClienteDTO() {
		return clienteDTO;
	}


	public void setClienteDTO(ClienteDTO clienteDTO) {
		this.clienteDTO = clienteDTO;
	}


	public ProveedorDTO getProveedorPed() {
		return proveedorPed;
	}


	public void setProveedorPed(ProveedorDTO proveedorPed) {
		this.proveedorPed = proveedorPed;
	}


	public Long getCantTotal() {
		return cantTotal;
	}


	public void setCantTotal(Long cantTotal) {
		this.cantTotal = cantTotal;
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


	

}
