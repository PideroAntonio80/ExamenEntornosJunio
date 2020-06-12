package com.sanvalero.examenEntornosJunio.model;

import java.time.LocalDate;

public class Usuario {
	private String nombre;
	private String apellidos;
	private int dni;
	private String email;
	private LocalDate fechaNacimiento;
	
	public Usuario(String nombre, String apellidos, int dni, String email, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

}
