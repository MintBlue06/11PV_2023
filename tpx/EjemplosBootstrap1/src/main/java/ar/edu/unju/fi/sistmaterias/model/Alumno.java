package ar.edu.unju.fi.sistmaterias.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/**
 * Representa un alumno del sistema
 * @author Ariel Vega
 * @version 1.0 date: 24/05/23
 *
 */
@Component
public class Alumno {
	/**Representa el nombre del alumno*/
	@NotBlank(message = "Debe ingresar un apellido")
	@Size(min = 3,max = 20, message = "El apellido debe tener entre 3 y 20 caracteres")
	@Pattern(regexp = "[a-zA-Z]+",message = "El apellido solo puede contener letras")
	private String apellido;
	/**Representa el apellido del alumno*/
	@NotBlank(message = "Debe ingresar los nombres")
	@Size(min = 3,max = 30, message = "Los nombres debe tener entre 3 y 30 caracteres")
	@Pattern(regexp = "[a-zA-Z]+",message = "Los nombres solo pueden contener letras")
	private String nombres;
	/**Representa el dni del alumno*/
	@NotNull(message = "Debe ingresar el dni")
	private Integer dni;
	
	/**Representa la fecha de nacimiento del alumno*/
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "Debe ingresar una fecha de nacimiento")
	private Date fechaNacimiento;
	
	//---------constructores-----------------
	
	/**
	 * Constructor por defecto
	 */
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor parametrizado
	 * @param apellido es el apellido del alumno
	 * @param nombres es el nombre del alumno
	 * @param dni es el dni del alumno
	 * @param fechaNacimiento es la fecha de nacimiento del alumno
	 */
	public Alumno(String apellido, String nombres, Integer dni, Date fechaNacimiento) {
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [apellido=" + apellido + ", nombres=" + nombres + ", dni=" + dni + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	


}
