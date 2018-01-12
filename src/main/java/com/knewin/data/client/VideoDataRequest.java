package com.knewin.data.client;

import java.lang.reflect.Type;

import org.apache.http.impl.client.CloseableHttpClient;

import com.google.gson.JsonParseException;
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
	 * @throws DataRequestException error when requesting data from web service
	 * @throws ParseException if json is not a valid representation for an object of type
	 */
	public DataResponseInfo<VideoDataInfo> getVideos(final String url, final CloseableHttpClient httpClient)
		throws DataRequestException, ParseException {
		return buildResponse(super.get(url, httpClient));
	}


	/**
	 * Request videos from web service.
	 *
	 * @param url the web service URL
	 *
	 * @return a {@link DataResponseInfo} instance
	 *
	 * @throws DataRequestException error when requesting data from web service
	 * @throws ParseException if json is not a valid representation for an object of type
	 */
	public DataResponseInfo<VideoDataInfo> getVideos(final String url) throws DataRequestException, ParseException {
		return buildResponse(super.get(url));
	}


	private DataResponseInfo<VideoDataInfo> buildResponse(final String json) throws ParseException {
		try {
			return super.jsonBuilder.fromJson(json, responseTypeClass);
		} catch (JsonParseException e) {
			throw new ParseException(e, json);
		}
	}

}
