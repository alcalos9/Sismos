package com.examen.sismo.entity.request;

public class ConsultaMagnitudRequest {

	private String minMagnitude;
	private String maxMagnitude;

	public String getMinMagnitude() {
		return minMagnitude;
	}
	public void setMinMagnitude(String minMagnitude) {
		this.minMagnitude = minMagnitude;
	}
	public String getMaxMagnitude() {
		return maxMagnitude;
	}
	public void setMaxMagnitude(String maxMagnitude) {
		this.maxMagnitude = maxMagnitude;
	}
	@Override
	public String toString() {
		return "ConsultaMagnitud [minMagnitude=" + minMagnitude + ", maxMagnitude=" + maxMagnitude + "]";
	}

	
}
