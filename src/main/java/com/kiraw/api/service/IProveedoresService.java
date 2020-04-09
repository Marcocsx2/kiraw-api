package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.Proveedor;

public interface IProveedoresService {
	
	List<Proveedor> buscarTodos();
	
	void guardar(Proveedor proveedor);
	
	void eliminar (int idProveedor);
}
