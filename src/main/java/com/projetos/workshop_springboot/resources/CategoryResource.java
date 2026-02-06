package com.projetos.workshop_springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.workshop_springboot.entities.Category;
import com.projetos.workshop_springboot.services.CategoryService;

@RestController // Definição de que será o Controller
@RequestMapping(value = "/categories") // Endpoint
public class CategoryResource {
	
	@Autowired
	private CategoryService service;

	// Mapeamento do Usuário
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category category = service.findById(id);
		return ResponseEntity.ok().body(category);
	}

}
