package com.mitocode.model;

import org.springframework.beans.factory.annotation.Value;

public class Persona {

	@Value("1")
	public int id;
	@Value("Mito")
	private String nombres;
	@Value("Code")
	private String apellidos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
	
}
