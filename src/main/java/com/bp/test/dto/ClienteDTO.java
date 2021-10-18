package com.bp.test.dto;

import java.io.Serializable;
import java.util.List;


public class ClienteDTO implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -928069077702393879L;

	private Long id;
	
	private String nombre;
	private String direccion;
	private String cedulaRuc;

	
	private List<CabeceraPedidoDTO> listPedidoDTO;

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

	public String getCedulaRuc() {
		return cedulaRuc;
	}

	public void setCedulaRuc(String cedulaRuc) {
		this.cedulaRuc = cedulaRuc;
	}

	
	public List<CabeceraPedidoDTO> getListPedidoDTO() {
		return listPedidoDTO;
	}

	public void setListPedidoDTO(List<CabeceraPedidoDTO> listPedidoDTO) {
		this.listPedidoDTO = listPedidoDTO;
	}

	
	



	

}
