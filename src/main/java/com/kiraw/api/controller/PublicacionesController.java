package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Publicacion;
import com.kiraw.api.service.jpa.PublicacionesService;

@RestController
@RequestMapping("/api")
public class PublicacionesController {
	
	@Autowired
	private PublicacionesService servicePublicaciones;
	
	@GetMapping("/publicaciones")
	public List<Publicacion> buscarTodos(){
		return servicePublicaciones.buscarTodos();
	}
	
	@PostMapping("/publicaciones")
	public Publicacion guardar(@RequestBody Publicacion publicacion) {
		servicePublicaciones.guardar(publicacion);
		return publicacion;
	}
	
	@PutMapping("/publicaciones")
	public Publicacion actualizar(@RequestBody Publicacion publicacion) {
		servicePublicaciones.guardar(publicacion);
		return publicacion;
	}
}
