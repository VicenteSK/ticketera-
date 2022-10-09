package Clases;

public class Entrada {
	private String id;
	private String idEvento;
	private String idLocacion;

	private int numeroTicket;
	private String rutInvitado;
	private int precio;

	public Entrada(String _id, String _evento, int _numeroTicket, int _precio, String _rutInvitado, String _idLocacion) {
		this.id = _id;
		this.idEvento = _evento;
		this.numeroTicket = _numeroTicket;
		this.rutInvitado = _rutInvitado;
		this.precio = _precio;
		this.idLocacion = _idLocacion;
	}
	
	public String getIdLocacion() {
		return idLocacion;
	}

	public void setIdLocacion(String idLocacion) {
		this.idLocacion = idLocacion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEvento() {
		return idEvento;
	}
	public void setEvento(String evento) {
		this.idEvento = evento;
	}
	public int getNumeroTicket() {
		return numeroTicket;
	}
	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}
	public String getRutInvitado() {
		return rutInvitado;
	}
	public void setRutInvitado(String rutInvitado) {
		this.rutInvitado = rutInvitado;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", evento=" + idEvento + ", numeroTicket=" + numeroTicket + ", rutInvitado="
				+ rutInvitado + "]";
	}

}
