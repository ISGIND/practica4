package com.everis.practicacloudinventario.reponses;

import com.everis.practicacloudinventario.model.Inventario;

public class InventarioResponse {

	private boolean successful;
	private String message;
	private Inventario value;
	private int port;
	public boolean isSuccessful() {
		return successful;
	}
	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Inventario getValue() {
		return value;
	}
	public void setValue(Inventario value) {
		this.value = value;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
}
