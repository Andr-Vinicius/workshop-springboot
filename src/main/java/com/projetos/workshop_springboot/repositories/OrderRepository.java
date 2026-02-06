package com.projetos.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.workshop_springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{}
