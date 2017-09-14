package com.mitocode.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mitocode.model.Persona;

@Repository
public class PersonaDAOImpl implements IPersonaDAO{

	@Override
	public void create(Persona persona) {
		System.out.println("Persona creada " + persona.getNombre() + " " + persona.getApellidos());		
	}

	@Override
	public void update(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Persona> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
