package com.bp.test.dto;

import java.io.Serializable;
import java.util.List;

public class PedidoDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7556670786957317542L;

	private CabeceraPedidoDTO cabeceraPedidoDto;
	
	private List<DetallePedidoDTO> detallesPedidoDto;

	public CabeceraPedidoDTO getCabeceraPedidoDto() {
		return cabeceraPedidoDto;
	}

	public void setCabeceraPedidoDto(CabeceraPedidoDTO cabeceraPedidoDto) {
		this.cabeceraPedidoDto = cabeceraPedidoDto;
	}

	public List<DetallePedidoDTO> getDetallesPedidoDto() {
		return detallesPedidoDto;
	}

	public void setDetallesPedidoDto(List<DetallePedidoDTO> detallesPedidoDto) {
		this.detallesPedidoDto = detallesPedidoDto;
	}
	
	
	
}
