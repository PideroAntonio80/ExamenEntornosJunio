package com.sanvalero.examenEntornosJunio.model;

public class Tecnico {
	
	private int idTecnico;
	private String nombre;
	private String apellidos;
	private int dni;
	
	public Tecnico(int idTecnico, String nombre, String apellidos, int dni) {
		super();
		this.idTecnico = idTecnico;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public int getIdTecnico() {
		return idTecnico;
	}

	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
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
	
	
	

}
