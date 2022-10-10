package com.framework.Ticketera.models;

public class Locacion {
	private String id;
	private String direccion;
	private String nombre;
	private int capacidad;

	public Locacion (String _id, String _dir, String _nombre, int _capacidad) {
		this.id = _id;
		this.direccion = _dir;
		this.nombre = _nombre;
		this.capacidad = _capacidad;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Locacion [id=" + id + ", direccion=" + direccion + ", nombre=" + nombre + "]";
	}
	
}
