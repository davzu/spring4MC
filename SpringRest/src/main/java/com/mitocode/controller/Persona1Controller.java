package com.mitocode.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Curso;
import com.mitocode.model.Persona;

@RestController
@RequestMapping("/persona1")
public class Persona1Controller {

	@RequestMapping(value="/", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Persona>> mostrar() {
		List<Persona> lstPersonas = new ArrayList<Persona>();
		Persona persona = new Persona();
		persona.setId(1);
		persona.setNombre("MitoCode");

		Curso curso = new Curso();
		curso.setId(1);
		curso.setNombre("Spring Developer");

		persona.setCurso(curso);
		
		lstPersonas.add(persona);
		
		persona = new Persona();
		persona.setId(2);
		persona.setNombre("Code");
		
		curso = new Curso();
		curso.setId(2);
		curso.setNombre("Java EE");
		
		persona.setCurso(curso);
		
		lstPersonas.add(persona);		
		
		return new ResponseEntity<List<Persona>>(lstPersonas, HttpStatus.OK);
	}
	
	

}
