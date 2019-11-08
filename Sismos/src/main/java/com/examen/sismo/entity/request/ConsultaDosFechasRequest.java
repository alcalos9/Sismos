package com.examen.sismo.entity.request;

public class ConsultaDosFechasRequest {

	private String fechaInicioR1;
	private String fechaTerminoR1;
	
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
	@Override
	public String toString() {
		return "ConsultaDosFechasRequest [fechaInicioR1=" + fechaInicioR1 + ", fechaTerminoR1=" + fechaTerminoR1 + "]";
	}

	
}
