package com.kiraw.api.service;

import java.util.List;
import com.kiraw.api.entity.Transporte;

public interface ITransportesService {
	
	List<Transporte> buscarTodos();
	
	void guardar(Transporte transporte);
	
	void eliminar(int idTransporte);
}
