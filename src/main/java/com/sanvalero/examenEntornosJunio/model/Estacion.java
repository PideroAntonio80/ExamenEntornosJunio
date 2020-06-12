package com.sanvalero.examenEntornosJunio.model;

public class Estacion {
	
	private int idEstacion;
	private String direccion;
	private int cantidadBicicletas;
	
	public Estacion(int idEstacion, String direccion, int cantidadBicicletas) {
		super();
		this.idEstacion = idEstacion;
		this.direccion = direccion;
		this.cantidadBicicletas = cantidadBicicletas;
	}

	public int getIdEstacion() {
		return idEstacion;
	}

	public void setIdEstacion(int idEstacion) {
		this.idEstacion = idEstacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCantidadBicicletas() {
		return cantidadBicicletas;
	}

	public void setCantidadBicicletas(int cantidadBicicletas) {
		this.cantidadBicicletas = cantidadBicicletas;
	}
	
	
	
	
	
	

}
