package ar.edu.unju.fi.sistmaterias.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Materia {
	private int id;
	private String nombre;
	@Autowired
	private Carrera carrera;
	
	public Materia() {
		// TODO Auto-generated constructor stub
	}

	public Materia(int id, String nombre, Carrera carrera) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carrera = carrera;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public Carrera getCarrera() {
		return carrera;
	}
	
	
}
