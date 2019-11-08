package com.examen.sismo.entity.request;

public class ConsultaCuantroFechasRequest {

	private String fechaInicioR1;
	private String fechaTerminoR1;
	private String fechaInicioR2;
	private String fechaTerminoR2;
	
	public String getFechaInicioR1() {
		return fechaInicioR1;
	}
	public void setFechaInicioR1(String fechaInicioR1) {
		this.fechaInicioR1 = fechaInicioR1;
	}
	public String getFechaTerminoR1() {
		return fechaTerminoR1;
	}
	public void setFechaTerminoR1(String fechaTerminoR1) {
		this.fechaTerminoR1 = fechaTerminoR1;
	}
	public String getFechaInicioR2() {
		return fechaInicioR2;
	}
	public void setFechaInicioR2(String fechaInicioR2) {
		this.fechaInicioR2 = fechaInicioR2;
	}
	public String getFechaTerminoR2() {
		return fechaTerminoR2;
	}
	public void setFechaTerminoR2(String fechaTerminoR2) {
		this.fechaTerminoR2 = fechaTerminoR2;
	}
	@Override
	public String toString() {
		return "ConsultaCuantroFechasRequest [fechaInicioR1=" + fechaInicioR1 + ", fechaTerminoR1=" + fechaTerminoR1
				+ ", fechaInicioR2=" + fechaInicioR2 + ", fechaTerminoR2=" + fechaTerminoR2 + "]";
	}
	
	
	
}
