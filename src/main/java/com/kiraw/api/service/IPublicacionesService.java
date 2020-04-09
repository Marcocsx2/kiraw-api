package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.Publicacion;

public interface IPublicacionesService {
	
	List<Publicacion> buscarTodos();
	
	void guardar(Publicacion publicacion);
	
	void eliminar(int idPublicacion);
}
