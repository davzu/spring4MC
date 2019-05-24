package com.mitocode.service;

import com.mitocode.model.Persona;

public interface IPersonaService extends CRUD<Persona> {
	
	public Integer getUserIdByEmail(String correo) throws Exception;


}
