package com.kiraw.api.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	private Integer id;
	private String Imagen;
	private String fondo;
	private String name;
	private String descripcion;
	private String profesion;
	private Date nacimiento;
	private String email;
	private Timestamp email_verified_at;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEmail_verified_at() {
		return email_verified_at;
	}

	public void setEmail_verified_at(Timestamp email_verified_at) {
		this.email_verified_at = email_verified_at;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", Imagen=" + Imagen + ", fondo=" + fondo + ", name=" + name + ", descripcion="
				+ descripcion + ", profesion=" + profesion + ", nacimiento=" + nacimiento + ", email=" + email
				+ ", email_verified_at=" + email_verified_at + ", password=" + password + ", remember_token="
				+"]";
	}

}
