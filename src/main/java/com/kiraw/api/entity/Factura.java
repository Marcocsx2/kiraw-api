package com.kiraw.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_facturas")
public class Factura {

	@Id
	private Integer id;
	private Integer transportes_id;
	private Integer users_id;
	private Integer productos_id;
	private Double df_precio;
	private Integer df_cantidad;
	private String df_destino;
	private Date df_fecha_entrega;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTransportes_id() {
		return transportes_id;
	}

	public void setTransportes_id(Integer transportes_id) {
		this.transportes_id = transportes_id;
	}

	public Integer getUsers_id() {
		return users_id;
	}

	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}

	public Integer getProductos_id() {
		return productos_id;
	}

	public void setProductos_id(Integer productos_id) {
		this.productos_id = productos_id;
	}

	public Double getDf_precio() {
		return df_precio;
	}

	public void setDf_precio(Double df_precio) {
		this.df_precio = df_precio;
	}

	public Integer getDf_cantidad() {
		return df_cantidad;
	}

	public void setDf_cantidad(Integer df_cantidad) {
		this.df_cantidad = df_cantidad;
	}

	public String getDf_destino() {
		return df_destino;
	}

	public void setDf_destino(String df_destino) {
		this.df_destino = df_destino;
	}

	public Date getDf_fecha_entrega() {
		return df_fecha_entrega;
	}

	public void setDf_fecha_entrega(Date df_fecha_entrega) {
		this.df_fecha_entrega = df_fecha_entrega;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", transportes_id=" + transportes_id + ", users_id=" + users_id + ", productos_id="
				+ productos_id + ", df_precio=" + df_precio + ", df_cantidad=" + df_cantidad + ", df_destino="
				+ df_destino + ", df_fecha_entrega=" + df_fecha_entrega + "]";
	}

}
