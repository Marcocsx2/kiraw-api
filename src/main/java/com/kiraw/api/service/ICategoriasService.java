package com.kiraw.api.service;

import java.util.List;
import com.kiraw.api.entity.Categoria;

public interface ICategoriasService {
	
	List<Categoria> buscarTodos();
	
	void guardar(Categoria categoria);
	
	void eliminar(int idCategoria);
}
