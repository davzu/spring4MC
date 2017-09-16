package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaDAO daoPersona;
	

	@Override
	public void create(Persona persona) {		
		daoPersona.create(persona);
	}

	@Override
	public void update(Persona persona) {
		daoPersona.update(persona);
	}

	@Override
	public List<Persona> listAll() {
		List<Persona> lista = daoPersona.listAll();
		return lista;
	}

	@Override
	public Persona find(Integer id) {
		Persona persona = daoPersona.find(id);
		return persona;
	}

	@Override
	public void delete(Integer id) {
		daoPersona.delete(id);
	}	

}
