package com.knewin.data.client;

import java.io.IOException;
import java.lang.reflect.Type;

import org.apache.http.impl.client.CloseableHttpClient;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.NewsDataInfo;

/**
 * Class responsible for requesting news from web service.
 * 
 * @since 1.0.0
 * 
 */
public class NewsDataRequest extends DataRequest {

	private final Type responseTypeClass = new TypeToken<DataResponseInfo<NewsDataInfo>>() {
	}.getType();


	/**
	 * Request news from web service.
	 * 
	 * @param request a {@link NewsDataRequest} instance
	 * @param url the web service URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws IOException error when requesting data from web service
	 */
	public DataResponseInfo<NewsDataInfo> getNews(final NewsDataRequest request, final String url,
		final CloseableHttpClient httpClient) throws IOException {
		return this.buildResponse(super.request(super.jsonBuilder.toJson(request), url, httpClient));
	}


	/**
	 * Request news from web service.
	 * 
	 * @param request a {@link NewsDataRequest} instance
	 * @param url the web service URL
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws IOException error when requesting data from web service
	 */
	public DataResponseInfo<NewsDataInfo> getNews(final NewsDataRequest request, final String url) throws IOException {
		return this.buildResponse(super.request(super.jsonBuilder.toJson(request), url));
	}


	private DataResponseInfo<NewsDataInfo> buildResponse(final String json) {
		return super.jsonBuilder.fromJson(json, this.responseTypeClass);
	}

}
