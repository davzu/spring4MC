package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario find(Integer id);
	
	public Usuario create(Usuario usuario);
	
	public Usuario update(Usuario usuario);
	
	public void delete(Integer id);

}
