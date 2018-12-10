package com.knewin.data.client.pages;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PagesResponse {

	private volatile String key;

	@SerializedName("source_id")
	private Integer sourceId;

	private String date;

	@SerializedName("total_pages")
	private Integer totalPages;

	private List<PageItem> pages;


	public String getKey() {
		return this.key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public Integer getSourceId() {
		return this.sourceId;
	}


	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}


	public String getDate() {
		return this.date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Integer getTotalPages() {
		return this.totalPages;
	}


	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}


	public List<PageItem> getPages() {
		return this.pages;
	}


	public void setPages(List<PageItem> pages) {
		this.pages = pages;
	}


	@Override
	public String toString() {
		return "[key=" + this.key + ", sourceId=" + this.sourceId + ", date=" + this.date + ", totalPages=" + this.totalPages
			+ ", pages=" + this.pages + "]";
	}

}
