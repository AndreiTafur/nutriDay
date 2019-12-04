package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Persona;

public interface IpersonRepo extends JpaRepository<Persona, Integer> {
	Persona findByNombre(String nombre);

}
