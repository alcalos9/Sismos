package com.examen.sismo.response;

import java.util.Arrays;

public class Geometry {
	
	private String type;
	private Double[] coordinates;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Double[] coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return "Geometry [type=" + type + ", coordinates=" + Arrays.toString(coordinates) + "]";
	}
	
	
}
