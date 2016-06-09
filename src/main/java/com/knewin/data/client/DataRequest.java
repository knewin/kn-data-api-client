package com.knewin.data.client;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
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
import com.knewin.data.client.info.DataInfo;
import com.knewin.data.client.info.DataRequestInfo;
import com.knewin.data.client.info.DataResponseInfo;

import sun.reflect.generics.reflectiveObjects.ParameterizedTypeImpl;

/**
 * Parent class that implements generic methods to request content from web service.
 * 
 * @since 1.0.0
 *
 * @param <R> the {@link DataRequestInfo}
 * @param <D> the {@link DataInfo}
 */
public abstract class DataRequest<R extends DataRequestInfo, D extends DataInfo> {

	protected final Gson jsonBuilder = new Gson();


	/**
	 * Request content from web service.
	 * 
	 * @param requestInfo a {@link MediaDataRequest} instance
	 * @param url the web service URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws DataRequestException error when requesting data from web service
	 */
	public final DataResponseInfo<D> request(final R requestInfo, final String url, final CloseableHttpClient httpClient)
		throws DataRequestException {
		return this.buildResponse(this.request(this.jsonBuilder.toJson(requestInfo), url, httpClient));
	}


	/**
	 * Request content from web service.
	 * 
	 * @param requestInfo a {@link MediaDataRequest} instance
	 * @param url the web service URL
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws DataRequestException error when requesting data from web service
	 */
	public final DataResponseInfo<D> request(final R requestInfo, final String url) throws DataRequestException {
		return this.buildResponse(this.request(this.jsonBuilder.toJson(requestInfo), url));
	}


	private DataResponseInfo<D> buildResponse(final String json) {
		final Type argumentType = ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
		final Type responseType = ParameterizedTypeImpl.make(DataResponseInfo.class, new Type[] { argumentType}, null);
		return this.jsonBuilder.fromJson(json, responseType);
	}


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
			e.setRequest(url);
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
			e.setRequest(url);
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
			e.setRequest(bodyContent);
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
