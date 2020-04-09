package com.kiraw.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiraw.api.entity.User;
import com.kiraw.api.repository.UsersRepository;
import com.kiraw.api.service.IUsersService;

@Service
public class UsersService implements IUsersService {
	
	@Autowired
	private UsersRepository repoUsers;
	
	@Override
	public List<User> buscarTodos() {
		return repoUsers.findAll();
	}

	@Override
	public void guardar(User user) {
		repoUsers.save(user);
	}

	@Override
	public void eliminar(int idUser) {
		repoUsers.deleteById(idUser);
	}
	
	
}
