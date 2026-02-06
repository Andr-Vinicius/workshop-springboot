package com.projetos.workshop_springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.workshop_springboot.entities.Product;
import com.projetos.workshop_springboot.services.ProductService;

@RestController // Definição de que será o Controller
@RequestMapping(value = "/products") // Endpoint
public class ProductResource {
	
	@Autowired
	private ProductService service;

	// Mapeamento do Usuário
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product product = service.findById(id);
		return ResponseEntity.ok().body(product);
	}

}
