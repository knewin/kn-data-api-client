package com.knewin.data.client;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class RestRequest {

	private static final Duration DEFAULT_CONNECT_TIMEOUT = Duration.ofSeconds(30);

	private static final Duration DEFAULT_READ_TIMEOUT = Duration.ofMinutes(3);

	/**
	 * Request content using HTTP POST method.
	 *
	 * @param postContent the body content that contains the parameters request
	 * @param url the URL
	 *
	 * @return the response content
	 *
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	protected String post(final String postContent, final String url, final Map<String, String> headers)
		throws DataRequestException {

		final RequestConfig requestConfig = RequestConfig.custom()
			.setConnectionRequestTimeout((int) DEFAULT_CONNECT_TIMEOUT.toMillis())
			.setSocketTimeout((int) DEFAULT_READ_TIMEOUT.toMillis())
			.setConnectTimeout((int) DEFAULT_READ_TIMEOUT.toMillis())//
			.build();

		try (final CloseableHttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig)
			.build()) {
			return this.post(postContent, url, httpClient, headers);
		} catch (final Exception e) {
			throw new DataRequestException(e, postContent);
		}
	}


	/**
	 * Request content using HTTP POST method.
	 *
	 * @param postContent the body content that contains the parameters request
	 * @param url the URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * @param headers
	 *
	 * @return the response content
	 *
	 * @throws DataRequestException error in case of problems to request remote content
	 */
	protected String post(final String postContent, final String url, final CloseableHttpClient httpClient,
		final Map<String, String> headers) throws DataRequestException {

		final HttpPost httpPost = new HttpPost(url);
		headers.forEach(httpPost::addHeader);
		httpPost.setEntity(new StringEntity(postContent, StandardCharsets.UTF_8));

		try (final CloseableHttpResponse httpResponse = httpClient.execute(httpPost)) {
			return handleResponse(httpResponse);
		} catch (final DataRequestException e) {
			e.setRequest(postContent);
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
