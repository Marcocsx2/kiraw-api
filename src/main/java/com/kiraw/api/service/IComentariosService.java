package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.Comentario;

public interface IComentariosService {
	
	List<Comentario> buscarTodos();
	
	void guardar(Comentario comentario);
	
	void eliminar (int idComentario);
}
