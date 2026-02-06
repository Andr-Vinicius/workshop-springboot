package com.projetos.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.workshop_springboot.entities.OrderItem;
import com.projetos.workshop_springboot.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{}
