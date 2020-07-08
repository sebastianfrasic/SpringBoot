package edu.eci.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.model.Persona;

public interface PersonaRepo extends JpaRepository<Persona, Integer>{

}
