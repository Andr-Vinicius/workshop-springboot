package com.projetos.workshop_springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.workshop_springboot.entities.User;

@RestController // Definição de que será o Controller
@RequestMapping(value = "/users") // Endpoint
public class UserResource {

	// Mapeamento do Usuário
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "teste@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
