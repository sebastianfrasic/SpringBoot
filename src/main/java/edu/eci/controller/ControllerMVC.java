package edu.eci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.model.Persona;
import edu.eci.repo.PersonaRepo;

@Controller
public class ControllerMVC {
	
	@Autowired
	private PersonaRepo repo;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		Persona p = new Persona();
		
		
		p.setCedula(2);
		p.setNombre("Maria");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model) {
		
		
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}

}