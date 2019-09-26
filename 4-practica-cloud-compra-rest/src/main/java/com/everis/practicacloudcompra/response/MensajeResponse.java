package com.everis.practicacloudcompra.response;

import java.math.BigDecimal;

public class MensajeResponse {
	
	private boolean exito;
	private BigDecimal codigo;
	private String instancia;
	private String mensajeError;
	private String respuesta;
	public boolean isExito() {
		return exito;
	}
	public void setExito(boolean exito) {
		this.exito = exito;
	}
	public BigDecimal getCodigo() {
		return codigo;
	}
	public void setCodigo(BigDecimal codigo) {
		this.codigo = codigo;
	}
	public String getInstancia() {
		return instancia;
	}
	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}
	public String getMensajeError() {
		return mensajeError;
	}
	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
	

}
