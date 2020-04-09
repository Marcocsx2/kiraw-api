package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.Producto;

public interface IProductosService {
	
	List<Producto> buscarTodos();
	
	void guardar(Producto producto);
	
	void eliminar (int idProducto);
}
