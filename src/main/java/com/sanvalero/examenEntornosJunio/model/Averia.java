package com.sanvalero.examenEntornosJunio.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Averia {
	
	private int numeroAveria;
	private String descripcionAveria;
	private LocalDate fechaAveria;
	
	private List<Averia> averias;
	
	public Averia(int numeroAveria, String descripcionAveria, LocalDate fechaAveria) {
		super();
		this.numeroAveria = numeroAveria;
		this.descripcionAveria = descripcionAveria;
		this.fechaAveria = fechaAveria;
		
		averias = new ArrayList<>();
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
	

	public boolean registro2(int numeroAveria, String descripcionAveria, LocalDate fechaAveria) {
		
		if(numeroAveria>0) return true;
		
		else return false;
		
		
	}
	
	

}
