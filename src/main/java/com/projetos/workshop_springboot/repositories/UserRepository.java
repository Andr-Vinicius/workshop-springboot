package com.projetos.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.workshop_springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{}
