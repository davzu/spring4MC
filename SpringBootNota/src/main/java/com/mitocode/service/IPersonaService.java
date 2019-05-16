package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Persona;

public interface IPersonaService {

	public List<Persona> findAll();
	
	public Persona find(Integer id);

	public Persona create(Persona persona);

	public Persona update(Persona persona);

	public void delete(Integer id);

}
