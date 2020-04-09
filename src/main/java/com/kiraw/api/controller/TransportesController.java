package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Transporte;
import com.kiraw.api.service.ITransportesService;

@RestController
@RequestMapping("/api")
public class TransportesController {
	
	@Autowired
	private ITransportesService serviceTransportes;
	
	@GetMapping("/transportes")
	public List<Transporte> buscarTodos(){
		return serviceTransportes.buscarTodos();
	}
	
	@PostMapping("/transporte")
	public Transporte guardar(@RequestBody Transporte transporte) {
		serviceTransportes.guardar(transporte);
		return transporte;
	}
	
	@PutMapping("/transporte")
	public Transporte actualizar(@RequestBody Transporte transporte) {
		serviceTransportes.guardar(transporte);
		return transporte;
	}
}
