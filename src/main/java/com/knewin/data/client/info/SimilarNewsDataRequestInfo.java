package com.knewin.data.client.info;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SimilarNewsDataRequestInfo implements DataRequestInfo {

	private String key;

	private int offset;

	private String since;

	private String until;

	private String gmt;

	private String title;

	private String content;

	private transient final Map<String, String> headers = new HashMap<String, String>();;

	private SimilarNewsDataRequestInfo(final Builder builder) {
		key = builder.key;
		offset = builder.offset;
		since = builder.since;
		until = builder.until;
		gmt = builder.gmt;
		title = builder.title;
		content = builder.content;
	}


	public String getKey() {
		return key;
	}


	public void setKey(final String key) {
		this.key = key;
	}


	public String getSince() {
		return since;
	}


	public void setSince(final String since) {
		this.since = since;
	}


	public String getUntil() {
		return until;
	}


	public void setUntil(final String until) {
		this.until = until;
	}


	public String getGmt() {
		return gmt;
	}


	public void setGmt(final String gmt) {
		this.gmt = gmt;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(final String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(final String content) {
		this.content = content;
	}


	@Override
	public int getOffset() {
		return offset;
	}


	@Override
	public void setOffset(final int offset) {
		this.offset = offset;
	}


	@Override
	public Map<String, String> getHeaders() {
		return headers == null ? Collections.emptyMap() : headers;
	}


	public void addHeader(final String name, final String value) {
		headers.put(name, value);
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {

		private String key;

		private int offset;

		private String since;

		private String until;

		private String gmt;

		private String title;

		private String content;

		private Builder() {
		}


		public Builder withKey(final String key) {
			this.key = key;
			return this;
		}


		public Builder withOffset(final int offset) {
			this.offset = offset;
			return this;
		}


		public Builder withSince(final String since) {
			this.since = since;
			return this;
		}


		public Builder withUntil(final String until) {
			this.until = until;
			return this;
		}


		public Builder withGmt(final String gmt) {
			this.gmt = gmt;
			return this;
		}


		public Builder withTitle(final String title) {
			this.title = title;
			return this;
		}


		public Builder withContent(final String content) {
			this.content = content;
			return this;
		}


		public SimilarNewsDataRequestInfo build() {
			return new SimilarNewsDataRequestInfo(this);
		}
	}

}
