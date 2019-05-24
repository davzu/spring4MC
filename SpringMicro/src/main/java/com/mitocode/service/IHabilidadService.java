package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Habilidad;
import com.mitocode.model.Persona;

public interface IHabilidadService extends CRUD<Habilidad> {

	public List<Habilidad> getHabilidadByPersonaId(Integer id);	
	
}
