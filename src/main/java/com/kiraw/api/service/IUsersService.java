package com.kiraw.api.service;

import java.util.List;

import com.kiraw.api.entity.User;

public interface IUsersService {
	
	List<User> buscarTodos();
	
	void guardar(User user);
	
	void eliminar(int idUser);
}
