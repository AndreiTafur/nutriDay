package com.project.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Persona;
import com.project.repository.IpersonRepo;

@RestController
@RequestMapping("/personas")
public class RestControllerDemo {

	@Autowired
	private IpersonRepo repo;
	
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void createPerson(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@PutMapping
	public void modify(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@DeleteMapping(value = "/{id}")
	public void personDelete (@PathVariable Integer id) {
		repo.deleteById(id);
	}
	
	
	
	
	
}
