package com.knewin.data.client.pages;

import com.google.gson.annotations.SerializedName;

public class PageItem {

	private String token;

	@SerializedName("resource_type")
	private String resourceType;

	private String page;

	private Long size;


	public String getToken() {
		return this.token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	public String getResourceType() {
		return this.resourceType;
	}


	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}


	public String getPage() {
		return this.page;
	}


	public void setPage(String page) {
		this.page = page;
	}


	public Long getSize() {
		return this.size;
	}


	public void setSize(Long size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "[token=" + this.token + ", resourceType=" + this.resourceType + ", page=" + this.page + ", size=" + this.size
			+ "]";
	}

}
