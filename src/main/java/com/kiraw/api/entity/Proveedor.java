package com.kiraw.api.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	@Id
	private Integer id;
	private String pro_imagen;
	private String pro_nombre;
	private String pro_descripcion;
	private Date pro_fundacion;
	private String pro_telefono;
	private Integer pro_trabajadores;
	private String email;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPro_imagen() {
		return pro_imagen;
	}

	public void setPro_imagen(String pro_imagen) {
		this.pro_imagen = pro_imagen;
	}

	public String getPro_nombre() {
		return pro_nombre;
	}

	public void setPro_nombre(String pro_nombre) {
		this.pro_nombre = pro_nombre;
	}

	public String getPro_descripcion() {
		return pro_descripcion;
	}

	public void setPro_descripcion(String pro_descripcion) {
		this.pro_descripcion = pro_descripcion;
	}

	public Date getPro_fundacion() {
		return pro_fundacion;
	}

	public void setPro_fundacion(Date pro_fundacion) {
		this.pro_fundacion = pro_fundacion;
	}

	public String getPro_telefono() {
		return pro_telefono;
	}

	public void setPro_telefono(String pro_telefono) {
		this.pro_telefono = pro_telefono;
	}

	public Integer getPro_trabajadores() {
		return pro_trabajadores;
	}

	public void setPro_trabajadores(Integer pro_trabajadores) {
		this.pro_trabajadores = pro_trabajadores;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", pro_imagen=" + pro_imagen + ", pro_nombre=" + pro_nombre
				+ ", pro_descripcion=" + pro_descripcion + ", pro_fundacion=" + pro_fundacion + ", pro_telefono="
				+ pro_telefono + ", pro_trabajadores=" + pro_trabajadores + ", email=" + email + ", password="
				+ password + "]";
	}

}
