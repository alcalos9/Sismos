package com.examen.sismo.response;

import java.util.Arrays;

public class Result {

	private String type;
	private Metadata metadata;
	private Feature[] features;
	private Double[] bbox;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public Feature[] getFeatures() {
		return features;
	}
	public void setFeatures(Feature[] features) {
		this.features = features;
	}
	public Double[] getBbox() {
		return bbox;
	}
	public void setBbox(Double[] bbox) {
		this.bbox = bbox;
	}
	@Override
	public String toString() {
		return "Result [type=" + type + ", metadata=" + metadata + ", features=" + Arrays.toString(features) + ", bbox="
				+ Arrays.toString(bbox) + "]";
	}

}
