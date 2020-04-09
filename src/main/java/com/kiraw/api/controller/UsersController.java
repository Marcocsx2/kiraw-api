package com.kiraw.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiraw.api.entity.User;
import com.kiraw.api.service.IUsersService;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	private IUsersService serviceUsers;
	
	@GetMapping("/users")
	public List<User> buscarTodos(){
		return serviceUsers.buscarTodos();
	}
	
	@PostMapping("/users")
	public User guardar(User user) {
		serviceUsers.guardar(user);
		return user;
	}
	
	@PutMapping("/users")
	public User actualizar(User user) {
		serviceUsers.guardar(user);
		return user;
	}
}
