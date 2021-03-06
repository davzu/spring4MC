package com.mitocode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "habilidad")
@Table(name = "habilidad")
public class Habilidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "id_persona", nullable = false)
	private Persona persona;

	// A: Alto B: Bueno R: Regular
	@Column(name = "experiencia", length = 1, nullable = false)
	private String experiencia;

	public Habilidad() {
	}

	public Habilidad(Integer id, String nombre, String experiencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Habilidad other = (Habilidad) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Habilidad [id=" + id + ", nombre=" + nombre + ", persona=" + persona + ", experiencia=" + experiencia
				+ "]";
	}
	
}
