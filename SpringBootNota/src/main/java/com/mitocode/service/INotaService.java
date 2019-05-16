package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Nota;

public interface INotaService {
	
	public List<Nota> findAll();
	
	public Nota find(Integer id);
	
	public Nota create(Nota nota);
	
	public Nota update(Nota nota);
	
	public void delete(Integer id);

}
