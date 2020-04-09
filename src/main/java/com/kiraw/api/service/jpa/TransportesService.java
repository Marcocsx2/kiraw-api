package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.Transporte;
import com.kiraw.api.repository.TransportesRepository;
import com.kiraw.api.service.ITransportesService;

@Service
public class TransportesService implements ITransportesService {
	
	@Autowired
	private TransportesRepository repoTransporte;
	
	@Override
	public List<Transporte> buscarTodos() {
		return repoTransporte.findAll();
	}

	@Override
	public void guardar(Transporte transporte) {
		repoTransporte.save(transporte);
	}

	@Override
	public void eliminar(int idTransporte) {
		repoTransporte.deleteById(idTransporte);
	}

}
