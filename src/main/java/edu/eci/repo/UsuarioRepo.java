package edu.eci.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.eci.model.Persona;
import edu.eci.model.Usuario;

public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	Usuario findByNombre(String nombre);

}
