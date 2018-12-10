package com.knewin.data.client.pages;

import com.google.gson.annotations.SerializedName;

public class PageRequest {

	private String key;

	@SerializedName("source_id")
	private Integer sourceId;

	private String date;

	private String token;


	private PageRequest(Builder builder) {
		this.key = builder.key;
		this.sourceId = builder.sourceId;
		this.date = builder.date;
		this.token = builder.token;
	}


	public PageRequest() {
	}


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


	public String getToken() {
		return this.token;
	}


	public void setToken(String token) {
		this.token = token;
	}


	@Override
	public String toString() {
		return "[key=" + this.key + ", sourceId=" + this.sourceId + ", date=" + this.date + ", token=" + this.token + "]";
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private Integer sourceId;

		private String date;

		private String token;


		private Builder() {
		}


		public Builder withKey(String key) {
			this.key = key;
			return this;
		}


		public Builder withSourceId(Integer sourceId) {
			this.sourceId = sourceId;
			return this;
		}


		public Builder withDate(String date) {
			this.date = date;
			return this;
		}


		public Builder withToken(String token) {
			this.token = token;
			return this;
		}


		public PageRequest build() {
			return new PageRequest(this);
		}
	}

}
