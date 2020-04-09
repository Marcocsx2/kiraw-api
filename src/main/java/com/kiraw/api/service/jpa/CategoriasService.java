package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Categoria;
import com.kiraw.api.repository.CategoriasRepository;
import com.kiraw.api.service.ICategoriasService;

@Service
public class CategoriasService implements ICategoriasService {
	
	@Autowired
	private CategoriasRepository repoCategoria;
	
	@Override
	public List<Categoria> buscarTodos() {
		return repoCategoria.findAll();
	}

	@Override
	public void guardar(Categoria categoria) {
		repoCategoria.save(categoria);
	}

	@Override
	public void eliminar(int idCategoria) {
		repoCategoria.deleteById(idCategoria);
	}


}
