package edu.eci.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import edu.eci.SpringMvcApplication;



@Repository
@Qualifier("Memory")
public class PersonaRepoImplMemory implements PersonaRepository{

	private static Logger LOG = LoggerFactory.getLogger(SpringMvcApplication.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("Se registró a " + nombre);
		
	}

}
