package com.knewin.data.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.http.impl.client.CloseableHttpClient;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
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
@SuppressWarnings("restriction")
public abstract class DataRequest<R extends DataRequestInfo, D extends DataInfo> extends RestRequest {

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
	 * @throws ParseException if json is not a valid representation for an object of type
	 */
	public DataResponseInfo<D> request(final R requestInfo, final String url, final CloseableHttpClient httpClient)
		throws DataRequestException, ParseException {
		return this.buildResponse(super.post(this.jsonBuilder.toJson(requestInfo), url, httpClient));
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
	 * @throws ParseException if json is not a valid representation for an object of type
	 */
	public DataResponseInfo<D> request(final R requestInfo, final String url) throws DataRequestException, ParseException {
		return this.buildResponse(super.post(this.jsonBuilder.toJson(requestInfo), url));
	}


	private DataResponseInfo<D> buildResponse(final String json) throws ParseException {
		try {
			final Type argumentType = ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[1];
			final Type responseType = ParameterizedTypeImpl.make(DataResponseInfo.class, new Type[] {argumentType}, null);
			return this.jsonBuilder.fromJson(json, responseType);
		} catch (JsonParseException e) {
			throw new ParseException(e, json);
		}
	}

}
