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

import com.kiraw.api.entity.Comentario;
import com.kiraw.api.service.jpa.ComentariosService;



@RestController
@RequestMapping("/api")
public class ComentariosController {
	
	@Autowired
	private ComentariosService serviceComentarios;
	
	@GetMapping("/comentarios")
	public List<Comentario> buscarTodos(){
		return serviceComentarios.buscarTodos();
	}
	
	@PostMapping("/comentarios")
	public Comentario guardar(@RequestBody Comentario comentario) {
		serviceComentarios.guardar(comentario);
		return comentario;
	}
	
	@PutMapping("/comentarios")
	public Comentario actualizar(@RequestBody Comentario comentario) {
		serviceComentarios.guardar(comentario);
		return comentario;
	}
	
	@DeleteMapping("/comentarios/{id}")
	public String eliminar(@PathVariable("id") int idComentario) {
		serviceComentarios.eliminar(idComentario);
		return "Comentario "+idComentario+" Eliminado";
	}
}
