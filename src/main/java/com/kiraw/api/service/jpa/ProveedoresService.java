package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Proveedor;
import com.kiraw.api.repository.ProveedoresRepository;
import com.kiraw.api.service.IProveedoresService;

@Service
public class ProveedoresService implements IProveedoresService {
	
	@Autowired
	private ProveedoresRepository repoProveedores;
	
	@Override
	public List<Proveedor> buscarTodos() {
		return repoProveedores.findAll();
	}

	@Override
	public void guardar(Proveedor proveedor) {
		repoProveedores.save(proveedor);
	}

	@Override
	public void eliminar(int idProveedor) {
		repoProveedores.deleteById(idProveedor);
	}

}
