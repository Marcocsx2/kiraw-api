package com.kiraw.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comentarios")
public class Comentario {

	@Id
	private Integer id;
	private Integer users_id;
	private Integer publicaciones_id;
	private String comentario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUsers_id() {
		return users_id;
	}

	public void setUsers_id(Integer users_id) {
		this.users_id = users_id;
	}

	public Integer getPublicaciones_id() {
		return publicaciones_id;
	}

	public void setPublicaciones_id(Integer publicaciones_id) {
		this.publicaciones_id = publicaciones_id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", users_id=" + users_id + ", publicaciones_id=" + publicaciones_id
				+ ", comentario=" + comentario + "]";
	}

}
