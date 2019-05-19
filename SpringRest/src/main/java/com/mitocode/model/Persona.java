package com.mitocode.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "persona")
public class Persona {

	private int id;
	private String nombre;
	private Curso curso;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
