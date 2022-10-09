package Clases;

import java.util.Date;

public class Venta {

	private String rutComprador;
	private String idCompra;
	private String[] idEntradas;
	private Date fechaDeCompra;
	private int subtotal;
	
	public Venta(String rutComprador, String idCompra, String[] idEntradas, int subtotal) {
		this.rutComprador = rutComprador;
		this.idCompra = idCompra;
		this.idEntradas = idEntradas;
		this.subtotal = subtotal;
	}

	public String getRutComprador() {
		return rutComprador;
	}

	public void setRutComprador(String rutComprador) {
		this.rutComprador = rutComprador;
	}

	public String getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(String idCompra) {
		this.idCompra = idCompra;
	}

	public String[] getIdEntradas() {
		return idEntradas;
	}

	public void setIdEntradas(String[] idEntradas) {
		this.idEntradas = idEntradas;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
	
}
