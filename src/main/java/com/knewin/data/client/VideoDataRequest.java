package com.knewin.data.client;

import java.io.IOException;
import java.lang.reflect.Type;

import org.apache.http.impl.client.CloseableHttpClient;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.VideoDataInfo;

/**
 * Class responsible for requesting videos from web service.
 * 
 * @since 1.0.0
 * 
 */
public class VideoDataRequest extends DataRequest {

	private final Type responseTypeClass = new TypeToken<DataResponseInfo<VideoDataInfo>>() {
	}.getType();


	/**
	 * Request videos from web service.
	 * 
	 * @param url the web service URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws IOException error when requesting data from web service
	 */
	public DataResponseInfo<VideoDataInfo> getVideos(final String url, final CloseableHttpClient httpClient) throws IOException {
		return super.jsonBuilder.fromJson(super.request(url, httpClient), this.responseTypeClass);
	}


	/**
	 * Request videos from web service.
	 * 
	 * @param url the web service URL
	 * @param httpClient a {@link CloseableHttpClient} instance
	 * 
	 * @return a {@link DataResponseInfo} instance
	 * 
	 * @throws IOException error when requesting data from web service
	 */
	public DataResponseInfo<VideoDataInfo> getVideos(final String url) throws IOException {
		return super.jsonBuilder.fromJson(super.request(url), this.responseTypeClass);
	}

}
