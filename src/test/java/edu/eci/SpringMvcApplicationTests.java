package edu.eci;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import edu.eci.model.Usuario;
import edu.eci.repo.UsuarioRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringMvcApplicationTests {

	@Autowired
	private UsuarioRepo repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Test
	public void deberiaCrearUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(6);
		usuario.setNombre("baikal");
		usuario.setContrasenha(encoder.encode("equisde1234"));
		Usuario usuarioRetornado = repo.save(usuario);
		
		assertTrue(usuarioRetornado.getContrasenha().equalsIgnoreCase(usuario.getContrasenha()));
		
		
		
	}

}
