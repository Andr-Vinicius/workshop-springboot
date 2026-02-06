package com.projetos.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.workshop_springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}
