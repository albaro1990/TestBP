package com.bp.test.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CabeceraPedido")
public class CabeceraPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1285454306356845809L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="proveedorPed")
	private Proveedor proveedorPed;
	
	private Long cantTotal;

	@Column(name = "fecha_creacion")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date fechaPedido;
	
	@OneToMany(mappedBy = "cabeceraPedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<DetallePedido> listDetallesPedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Proveedor getProveedorPed() {
		return proveedorPed;
	}

	public void setProveedorPed(Proveedor proveedorPed) {
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

	public List<DetallePedido> getListDetallesPedido() {
		return listDetallesPedido;
	}

	public void setListDetallesPedido(List<DetallePedido> listDetallesPedido) {
		this.listDetallesPedido = listDetallesPedido;
	}

	

	
}
