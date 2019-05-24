package com.mitocode.service;

import java.util.List;

public interface CRUD<T> {
	
	public List<T> findAll();
	
	public T create(T obj);
	
	public T find(Integer id);
	
	public T update(T obj);
	
	public void delete(Integer id);

}
