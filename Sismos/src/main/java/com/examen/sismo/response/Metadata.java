package com.examen.sismo.response;

public class Metadata {
	
	private Double generated;
	private String url;
	private String title;
	private Double status;
	private String api;
	private Double count;
	
	public Double getGenerated() {
		return generated;
	}
	public void setGenerated(Double generated) {
		this.generated = generated;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getStatus() {
		return status;
	}
	public void setStatus(Double status) {
		this.status = status;
	}
	public String getApi() {
		return api;
	}
	public void setApi(String api) {
		this.api = api;
	}
	public Double getCount() {
		return count;
	}
	public void setCount(Double count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Metadata [generated=" + generated + ", url=" + url + ", title=" + title + ", status=" + status
				+ ", api=" + api + ", count=" + count + "]";
	}
	
	
}
