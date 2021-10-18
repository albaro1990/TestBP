package com.bp.test.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DetallePedido")
public class DetallePedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1285454306356845809L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cabecera_pedido")
	private CabeceraPedido cabeceraPedido;
	
	@ManyToOne
	@JoinColumn(name="producto")
	private Producto producto;
	
	private Long cantidadPedida;

	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date fechaPedido;
	
	private Double valorDet;
	



	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public CabeceraPedido getCabeceraPedido() {
		return cabeceraPedido;
	}


	public void setCabeceraPedido(CabeceraPedido cabeceraPedido) {
		this.cabeceraPedido = cabeceraPedido;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
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


	

}
