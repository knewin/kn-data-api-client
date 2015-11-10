package com.knewin.data.client;

import java.io.IOException;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.VideoDataInfo;

/**
 * Class that implements an example of how to get videos from web service.
 * 
 * @since 1.0.0
 */
public final class VideoDataRequestSample {

	private VideoDataRequestSample() {

	}


	/**
	 * Show an example of how to call the web service to get videos.
	 * 
	 * @param args [0] the web service URL; [1] the client's key; [2] the query
	 * 
	 * @throws IOException error in case of problems to request news
	 */
	public static void main(final String[] args) throws IOException {
		final String url = args[0];
		final String key = args[1];
		final String query = args[2];

		final String fullUrl = url + "?k=" + key + "&q=" + query;

		final VideoDataRequest videoDataRequest = new VideoDataRequest();
		final DataResponseInfo<VideoDataInfo> responseInfo = videoDataRequest.getVideos(fullUrl);

		System.out.println("Número de vídeos encontrados: " + responseInfo.getNumDocs());

		System.out.println("Títulos dos vídeos recuperados");
		for (final VideoDataInfo info : responseInfo.getHits()) {
			final String title = info.getTitle();
			if (title != null) {
				System.out.println("   - " + title);
			}
		}
	}

}
