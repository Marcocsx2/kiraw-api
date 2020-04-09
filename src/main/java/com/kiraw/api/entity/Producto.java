package com.kiraw.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

	@Id
	private Integer id;
	private String prod_imagen;
	private String prod_nombre;
	private Double prod_precio;
	private Integer prod_stock;
	private String prod_descripcion;
	private Integer categorias_id;
	private Integer proveedores_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProd_imagen() {
		return prod_imagen;
	}

	public void setProd_imagen(String prod_imagen) {
		this.prod_imagen = prod_imagen;
	}

	public String getProd_nombre() {
		return prod_nombre;
	}

	public void setProd_nombre(String prod_nombre) {
		this.prod_nombre = prod_nombre;
	}

	public Double getProd_precio() {
		return prod_precio;
	}

	public void setProd_precio(Double prod_precio) {
		this.prod_precio = prod_precio;
	}

	public Integer getProd_stock() {
		return prod_stock;
	}

	public void setProd_stock(Integer prod_stock) {
		this.prod_stock = prod_stock;
	}

	public String getProd_descripcion() {
		return prod_descripcion;
	}

	public void setProd_descripcion(String prod_descripcion) {
		this.prod_descripcion = prod_descripcion;
	}

	public Integer getCategorias_id() {
		return categorias_id;
	}

	public void setCategorias_id(Integer categorias_id) {
		this.categorias_id = categorias_id;
	}

	public Integer getProveedores_id() {
		return proveedores_id;
	}

	public void setProveedores_id(Integer proveedores_id) {
		this.proveedores_id = proveedores_id;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", prod_imagen=" + prod_imagen + ", prod_nombre=" + prod_nombre + ", prod_precio="
				+ prod_precio + ", prod_stock=" + prod_stock + ", prod_descripcion=" + prod_descripcion
				+ ", categorias_id=" + categorias_id + ", proveedores_id=" + proveedores_id + "]";
	}

}
