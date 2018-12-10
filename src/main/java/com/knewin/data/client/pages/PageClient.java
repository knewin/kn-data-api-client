package com.knewin.data.client.pages;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.knewin.data.client.RestRequest;

public class PageClient extends RestRequest {

	private final Gson jsonBuilder = new GsonBuilder().disableHtmlEscaping().create();

	private final String url;


	public PageClient(String url) {
		this.url = url;
	}


	public PagesResponse requestPages(PagesRequest request) throws IOException {
		return this.jsonBuilder.fromJson(post(this.jsonBuilder.toJson(request), this.url), PagesResponse.class);
	}


	/**
	 * @param request the request
	 * @return the page url
	 * @throws IOException if an I/O exception occurs
	 */
	public String requestPage(PageRequest request) throws IOException {
		final HttpURLConnection conn = (HttpURLConnection) new URL(this.url).openConnection();
		conn.setConnectTimeout((int) Duration.ofSeconds(30).toMillis());
		conn.setReadTimeout((int) Duration.ofSeconds(30).toMillis());
		conn.setDoOutput(true);
		conn.setInstanceFollowRedirects(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "application/json");

		try (DataOutputStream out = new DataOutputStream(conn.getOutputStream())) {
			out.writeBytes(this.jsonBuilder.toJson(request));
		}

		final int status = conn.getResponseCode();
		if (status > 399) {
			String body = "";
			final InputStream in = conn.getErrorStream();
			if (in != null) {
				try (BufferedReader br = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8))) {
					body = br.lines().collect(Collectors.joining(System.getProperty("line.separator")));
				}
			}
			throw new IOException(conn.getResponseMessage() + ":" + body);
		}

		if (status == HttpURLConnection.HTTP_MOVED_TEMP || status == HttpURLConnection.HTTP_MOVED_PERM
			|| status == HttpURLConnection.HTTP_SEE_OTHER) {
			return conn.getHeaderField("Location");
		}

		try (BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
			return br.lines().collect(Collectors.joining(System.getProperty("line.separator")));
		}
	}
}
