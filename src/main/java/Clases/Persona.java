package Clases;

import java.util.Date;

public class Persona {
	private String nombres;
	private String apellidos;
	private Date fechaDeNacimiento;
	private String rut;
	private String genero;
	
	public Persona (String _nombres, String _apellidos, String _rut) {
		this.nombres = _nombres;
		this.apellidos= _nombres;
		this.rut = _rut;
	}
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apellidos=" + apellidos + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", rut=" + rut + ", genero=" + genero + "]";
	}
	
}
