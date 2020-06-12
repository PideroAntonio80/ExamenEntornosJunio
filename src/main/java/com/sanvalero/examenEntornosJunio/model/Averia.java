package com.sanvalero.examenEntornosJunio.model;

import java.time.LocalDate;

public class Averia {
	
	private int numeroAveria;
	private String descripcionAveria;
	private LocalDate fechaAveria;
	
	public Averia(int numeroAveria, String descripcionAveria, LocalDate fechaAveria) {
		super();
		this.numeroAveria = numeroAveria;
		this.descripcionAveria = descripcionAveria;
		this.fechaAveria = fechaAveria;
	}

	public int getNumeroAveria() {
		return numeroAveria;
	}

	public void setNumeroAveria(int numeroAveria) {
		this.numeroAveria = numeroAveria;
	}

	public String getDescripcionAveria() {
		return descripcionAveria;
	}

	public void setDescripcionAveria(String descripcionAveria) {
		this.descripcionAveria = descripcionAveria;
	}

	public LocalDate getFechaAveria() {
		return fechaAveria;
	}

	public void setFechaAveria(LocalDate fechaAveria) {
		this.fechaAveria = fechaAveria;
	}
	
	

}
