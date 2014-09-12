package com.knewin.data.client;

import java.io.IOException;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.VideoDataInfo;

/**
 * Class that implements an example of how to get videos from web service.
 * 
 * @since 1.0.0
 */
public class VideoDataRequestSample {

	/**
	 * Show an example of how to call the web service to get videos.
	 * 
	 * @param args [0] the client's key; [1] the query
	 * 
	 * @throws IOException error in case of problems to request news
	 */
	public static void main(final String[] args) throws IOException {
		final String key = args[0];
		final String query = args[1];

		final String url = "http://data.knewin.com/video?k=" + key + "&q=" + query;

		final VideoDataRequest videoDataRequest = new VideoDataRequest();
		final DataResponseInfo<VideoDataInfo> responseInfo = videoDataRequest.getVideos(url);

		System.out.println("Número de vídeos encontrados: " + responseInfo.getNumDocs());

		System.out.println("Títulos dos vídeos recuperados");
		responseInfo.getHits().forEach(videoDataInfo -> System.out.println("   - " + videoDataInfo.getTitle()));
	}

}
