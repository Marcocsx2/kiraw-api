package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Comentario;
import com.kiraw.api.repository.ComentariosRepository;
import com.kiraw.api.service.IComentariosService;

@Service
public class ComentariosService implements IComentariosService {
	
	@Autowired
	private ComentariosRepository repoComentarios;
	
	@Override
	public List<Comentario> buscarTodos() {
		return repoComentarios.findAll();
	}

	@Override
	public void guardar(Comentario comentario) {
		repoComentarios.save(comentario);
	}

	@Override
	public void eliminar(int idComentario) {
		repoComentarios.deleteById(idComentario);
	}
	
}
