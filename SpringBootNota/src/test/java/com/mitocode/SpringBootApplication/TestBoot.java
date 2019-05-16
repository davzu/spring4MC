package com.mitocode.SpringBootApplication;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.mitocode.model.Usuario;
import com.mitocode.service.IUsuarioService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBoot {
	
	@Autowired
	private IUsuarioService service;
	
	@Autowired
	private BCryptPasswordEncoder bCryptEncoder;
	
	@Test
	public void crearUsuario() {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		usuario.setNombre("MITO");
		usuario.setClave(bCryptEncoder.encode("mitocode"));
		usuario.setTipo("ROLE_ADMIN");
		usuario.setEstado("1");
		
		Usuario usuReturn = service.create(usuario);
		
		assertEquals(usuario.getId(), usuReturn.getId());
	}

}
