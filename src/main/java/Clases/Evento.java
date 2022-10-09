package Clases;

public class Evento {

	private String idLocacion;
	private String nombre;
	private String id;
	
	public Evento(String idLocacion, String nombre, String id) {
		this.idLocacion = idLocacion;
		this.nombre = nombre;
		this.id = id;
	}

	public String getIdLocacion() {
		return idLocacion;
	}

	public void setIdLocacion(String idLocacion) {
		this.idLocacion = idLocacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
