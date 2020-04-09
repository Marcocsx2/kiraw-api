package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.Factura;

public interface IFacturaService {
	
	List<Factura> buscarTodos();
	
	void guardar(Factura factura);
	
	void eliminar (int idFactura);
}
