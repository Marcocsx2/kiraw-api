package com.kiraw.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publicaciones")
public class Publicacion {

	@Id
	private Integer id;
	private String publi_imagen;
	private String publi_titulo;
	private String publi_descripcion;
	private Integer proveedores_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPubli_imagen() {
		return publi_imagen;
	}

	public void setPubli_imagen(String publi_imagen) {
		this.publi_imagen = publi_imagen;
	}

	public String getPubli_titulo() {
		return publi_titulo;
	}

	public void setPubli_titulo(String publi_titulo) {
		this.publi_titulo = publi_titulo;
	}

	public String getPubli_descripcion() {
		return publi_descripcion;
	}

	public void setPubli_descripcion(String publi_descripcion) {
		this.publi_descripcion = publi_descripcion;
	}

	public Integer getProveedores_id() {
		return proveedores_id;
	}

	public void setProveedores_id(Integer proveedores_id) {
		this.proveedores_id = proveedores_id;
	}

	@Override
	public String toString() {
		return "Publicacion [id=" + id + ", publi_imagen=" + publi_imagen + ", publi_titulo=" + publi_titulo
				+ ", publi_descripcion=" + publi_descripcion + ", proveedores_id=" + proveedores_id + "]";
	}

}
