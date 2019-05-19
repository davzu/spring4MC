package com.mitocode.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mitocode.model.Curso;
import com.mitocode.model.Persona;

@Controller
@RequestMapping("/persona")
public class PersonaController {

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Persona mostrar() {
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("MitoCode");

		Curso curso = new Curso();
		curso.setId(1);
		curso.setNombre("Spring Developer");

		persona.setCurso(curso);

		return persona;
	}

}
