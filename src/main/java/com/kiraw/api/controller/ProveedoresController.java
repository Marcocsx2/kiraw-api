package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Proveedor;
import com.kiraw.api.service.jpa.ProveedoresService;

@RestController
@RequestMapping("/api")
public class ProveedoresController {
	
	@Autowired
	private ProveedoresService serviceProveedores;
	
	@GetMapping("/proveedores")
	public List<Proveedor> buscarTodos(){
		return serviceProveedores.buscarTodos();
	}
	
	@PostMapping("/proveedores")
	public Proveedor guardar(Proveedor proveedor) {
		serviceProveedores.guardar(proveedor);
		return proveedor;
	}
	
	@PutMapping("/proveedores")
	public Proveedor actualizar(Proveedor proveedor) {
		serviceProveedores.guardar(proveedor);
		return proveedor;
	}
}
