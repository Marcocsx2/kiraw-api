package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Categoria;
import com.kiraw.api.service.ICategoriasService;

@RestController
@RequestMapping("/api")
public class CategoriasController {
	
	@Autowired
	private ICategoriasService serviceCategorias;
	
	@GetMapping("/categorias")
	public List<Categoria> buscarTodos(){
		return serviceCategorias.buscarTodos();
	}
	
	@PostMapping("/categorias")
	public Categoria guardar(@RequestBody Categoria categoria) {
		serviceCategorias.guardar(categoria);
		return categoria;
	}
	
	@PutMapping("/categorias")
	public Categoria actualizar(@RequestBody Categoria categoria) {
		serviceCategorias.guardar(categoria);
		return categoria;
	}
	
	@DeleteMapping("/categorias/{id}")
	public String eliminar(@PathVariable("id") int idCategoria) {
		serviceCategorias.eliminar(idCategoria);
		return "Categoria "+idCategoria+" Eliminada";
	}
}
