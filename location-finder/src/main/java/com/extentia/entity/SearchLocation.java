package com.extentia.entity;

public class SearchLocation {

	private Meta meta;
	private Response response;
	
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	@Override
	public String toString() {
		return "SearchLocation []";
	}
	
	
}
