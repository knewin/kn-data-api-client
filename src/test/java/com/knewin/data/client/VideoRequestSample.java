package com.knewin.data.client;

import java.io.IOException;

import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.VideoDataInfo;
import com.knewin.data.client.info.VideoRequest;

public class VideoRequestSample {

	public static void main(String[] args) throws IOException {
		final String url = args[0];
		final String key = args[1];
		final String query = args[2];

		final VideoRequest request = new VideoRequest();
		request.setKey(key);
		request.setQuery(query);

		final VideoClient client = new VideoClient();
		final DataResponseInfo<VideoDataInfo> response = client.request(request, url);

		System.out.println("Número de notícias encontradas: " + response.getNumDocs());

		System.out.println("Títulos das notícias recuperadas");
		response.getHits().forEach(n -> System.out.println("   - " + n.getTitle()));

	}
}
