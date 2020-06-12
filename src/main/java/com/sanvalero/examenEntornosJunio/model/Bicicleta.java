package com.sanvalero.examenEntornosJunio.model;

import java.time.LocalDate;

public class Bicicleta {
	
	private int numeroBicicleta;
	private int idModulo;
	private LocalDate tiempoUso;
	
	public Bicicleta(int numeroBicicleta, int idmodulo, LocalDate tiempoUso) {
		super();
		this.numeroBicicleta = numeroBicicleta;
		this.idModulo = idmodulo;
		this.tiempoUso = tiempoUso;
	}
	
	public int getNumeroBicicleta() {
		return numeroBicicleta;
	}
	public void setNumeroBicicleta(int numeroBicicleta) {
		this.numeroBicicleta = numeroBicicleta;
	}
	public int getIdmodulo() {
		return idModulo;
	}
	public void setIdmodulo(int idmodulo) {
		this.idModulo = idmodulo;
	}
	public LocalDate getTiempoUso() {
		return tiempoUso;
	}
	public void setTiempoUso(LocalDate tiempoUso) {
		this.tiempoUso = tiempoUso;
	}

}
