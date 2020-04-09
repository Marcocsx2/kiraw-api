package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Factura;
import com.kiraw.api.repository.FacturasRepository;
import com.kiraw.api.service.IFacturaService;

@Service
public class FacturasService implements IFacturaService {

	@Autowired
	private FacturasRepository repoFacturas;
	
	@Override
	public List<Factura> buscarTodos() {
		return repoFacturas.findAll();
	}

	@Override
	public void guardar(Factura factura) {
		repoFacturas.save(factura);
	}

	@Override
	public void eliminar(int idFactura) {
		repoFacturas.deleteById(idFactura);
	}
	
}
