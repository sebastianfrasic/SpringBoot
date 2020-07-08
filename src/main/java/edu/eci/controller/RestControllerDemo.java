package edu.eci.controller;

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

import edu.eci.model.Persona;
import edu.eci.repo.PersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestControllerDemo {
	
	@Autowired
	private PersonaRepo repo;
	
	@GetMapping	
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void insertarPersona(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@PutMapping
	public void modificarPersona(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@DeleteMapping(value = "/{id}")
	public void insertarPersona(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
