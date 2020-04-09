package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Producto;
import com.kiraw.api.service.jpa.ProductosService;



@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	private ProductosService serviceProductos;
	
	@GetMapping("/productos")
	public List<Producto> buscarTodos(){
		return serviceProductos.buscarTodos();
	}
	
	@PostMapping("/productos")
	public Producto guardar(Producto producto) {
		serviceProductos.guardar(producto);
		return producto;
	}
	
	@PutMapping("/productos")
	public Producto actualizar(Producto producto) {
		serviceProductos.guardar(producto);
		return producto;
	}
}
