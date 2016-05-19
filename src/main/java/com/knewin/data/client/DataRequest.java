package com.knewin.data.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

/**
 * Parent class that implements generic methods to request content from web service.
 * 
 * @since 1.0.0
 * 
 */
public abstract class DataRequest {

	protected final Gson jsonBuilder = new Gson();


	/**
	 * Request content using HTTP GET method.
	 * 
	 * @param url the URL
	 * 
	 * @return the response content
	 * 
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	String request(final String url) throws DataRequestException {
		final RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(30000).setSocketTimeout(30000)
			.setConnectTimeout(30000).build();

		try (final CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build()) {
			return this.request(url, httpClient);
		} catch (final DataRequestException e) {
			throw e;
		} catch (final Exception e) {
			throw new DataRequestException(e, url);
		}
	}


	/**
	 * Request content using HTTP GET method.
	 * 
	 * @param url the URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return the response content
	 * 
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	String request(final String url, final CloseableHttpClient httpClient) throws DataRequestException {
		try (final CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(url))) {
			return this.handleResponse(httpResponse);
		} catch (final DataRequestException e) {
			throw e;
		} catch (final Exception e) {
			throw new DataRequestException(e, url);
		}
	}


	/**
	 * Request content using HTTP POST method.
	 * 
	 * @param bodyContent the body content that contains the parameters request
	 * @param url the URL
	 * 
	 * @return the response content
	 * 
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	String request(final String bodyContent, final String url) throws DataRequestException {
		final RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(30000).setSocketTimeout(30000)
			.setConnectTimeout(30000).build();

		try (final CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).build()) {
			return this.request(bodyContent, url, httpClient);
		} catch (final DataRequestException e) {
			throw e;
		} catch (final Exception e) {
			throw new DataRequestException(e, bodyContent);
		}
	}


	/**
	 * Request content using HTTP POST method.
	 * 
	 * @param bodyContent the body content that contains the parameters request
	 * @param url the URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return the response content
	 * 
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	String request(final String postContent, final String url, final CloseableHttpClient httpClient) throws DataRequestException {
		final HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new StringEntity(postContent, StandardCharsets.UTF_8));

		try (final CloseableHttpResponse httpResponse = httpClient.execute(httpPost)) {
			return this.handleResponse(httpResponse);
		} catch (final DataRequestException e) {
			throw e;
		} catch (final Exception e) {
			throw new DataRequestException(e, postContent);
		}
	}


	private String handleResponse(final CloseableHttpResponse httpResponse) throws IOException, DataRequestException {
		final HttpEntity entity = httpResponse.getEntity();
		final String responseBody = EntityUtils.toString(entity, StandardCharsets.UTF_8);
		if (httpResponse.getStatusLine().getStatusCode() < 400) {
			return responseBody;
		}
		throw new DataRequestException(httpResponse.getStatusLine().getReasonPhrase() + "\nResponse body: " + responseBody);
	}

}
