package com.kiraw.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transportes")
public class Transporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String tra_nombre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTra_nombre() {
		return tra_nombre;
	}

	public void setTra_nombre(String tra_nombre) {
		this.tra_nombre = tra_nombre;
	}

	@Override
	public String toString() {
		return "Transporte [id=" + id + ", tra_nombre=" + tra_nombre + "]";
	}

}
