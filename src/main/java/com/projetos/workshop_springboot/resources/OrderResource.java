package com.projetos.workshop_springboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.workshop_springboot.entities.Order;
import com.projetos.workshop_springboot.services.OrderService;

@RestController // Definição de que será o Controller
@RequestMapping(value = "/orders") // Endpoint
public class OrderResource {
	
	@Autowired
	private OrderService service;

	// Mapeamento do Usuário
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order order = service.findById(id);
		return ResponseEntity.ok().body(order);
	}

}
