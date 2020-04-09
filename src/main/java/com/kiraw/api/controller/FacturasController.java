package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.Factura;
import com.kiraw.api.service.jpa.FacturasService;



@RestController
@RequestMapping("/api")
public class FacturasController {
	
	@Autowired
	private FacturasService serviceFacturas;
	
	@GetMapping("/facturas")
	public List<Factura> buscarTodos(){
		return serviceFacturas.buscarTodos();
	}
	
	@PostMapping("/facturas")
	public Factura guardar(@RequestBody Factura factura) {
		serviceFacturas.guardar(factura);
		return factura;
	}
	
	@PutMapping("/facturas")
	public Factura actualizar(@RequestBody Factura factura) {
		serviceFacturas.guardar(factura);
		return factura;
	}
}
