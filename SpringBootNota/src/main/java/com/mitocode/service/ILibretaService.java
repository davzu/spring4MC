package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Libreta;

public interface ILibretaService {
	
	public List<Libreta> findAll();
	
	public Libreta find(Integer id);
	
	public Libreta create(Libreta libreta);
	
	public Libreta update(Libreta libreta);
	
	public void delete(Integer id);
	

}
