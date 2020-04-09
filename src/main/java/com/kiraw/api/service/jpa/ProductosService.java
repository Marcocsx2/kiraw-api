package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Producto;
import com.kiraw.api.repository.ProductosRepository;
import com.kiraw.api.service.IProductosService;

@Service
public class ProductosService implements IProductosService {
	
	@Autowired
	private ProductosRepository repoProductos;
	
	@Override
	public List<Producto> buscarTodos() {
		return repoProductos.findAll();
	}

	@Override
	public void guardar(Producto producto) {
		repoProductos.save(producto);
	}

	@Override
	public void eliminar(int idProducto) {
		repoProductos.deleteById(idProducto);
	}
	

}
