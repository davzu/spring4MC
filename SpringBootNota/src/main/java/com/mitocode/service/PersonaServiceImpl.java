package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Persona;
import com.mitocode.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaRepo repository;

	@Override
	public List<Persona> findAll() {
		return repository.findAll();
	}
	
	@Override
	public Persona find(Integer id) {
		return repository.findOne(id);
	}

	@Override
	public Persona create(Persona persona) {
		return repository.save(persona);
	}

	@Override
	public Persona update(Persona persona) {
		return repository.save(persona);
	}

	@Override
	public void delete(Integer id) {
		repository.delete(id);
		
	}

}
