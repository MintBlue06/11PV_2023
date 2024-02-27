package ar.edu.unju.fi.sistmaterias.model;

import org.springframework.stereotype.Component;

@Component
public class Carrera {
	private int id;
	private String nombre;
	
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	public Carrera(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
}

