package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Publicacion;
import com.kiraw.api.repository.PublicacionesRepository;
import com.kiraw.api.service.IPublicacionesService;

@Service
public class PublicacionesService implements IPublicacionesService {

	@Autowired
	private PublicacionesRepository repoPublicaciones;

	@Override
	public List<Publicacion> buscarTodos() {
		return repoPublicaciones.findAll();
	}

	@Override
	public void guardar(Publicacion publicacion) {
		repoPublicaciones.save(publicacion);
	}

	@Override
	public void eliminar(int idPublicacion) {
		repoPublicaciones.deleteById(idPublicacion);
	}

}
