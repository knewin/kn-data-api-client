package com.knewin.data.client;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.TvDataInfo;
import com.knewin.data.client.info.TvRequestFilter;
import com.knewin.data.client.info.TvRequestInfo;

/**
 * Class that implements an example of how to get tv documents from web service.
 *
 * @since 1.5.0
 */
public final class TvDataRequestSample {

	private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

	private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

	private TvDataRequestSample() {

	}


	/**
	 * Show an example of how to call the web service to get documents.
	 *
	 * @param args [0] the web service URL; [1] the client's key; [2] the query
	 *
	 * @throws IOException error in case of problems to request documents
	 */
	public static void main(final String[] args) throws IOException {
		final String url = args[0];
		final String key = args[1];
		final String query = args[2];

		final ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
		final OffsetDateTime sinceCrawled = OffsetDateTime.now(zoneId).minusHours(1);

		final TvRequestFilter filter = new TvRequestFilter();
		filter.setSinceCrawled(sinceCrawled.format(DATE_TIME_FORMATTER));

		final TvRequestInfo requestInfo = new TvRequestInfo();
		requestInfo.setKey(key);
		requestInfo.setQuery(query);
		requestInfo.setGmt(sinceCrawled.getOffset().getId());
		requestInfo.setFilter(filter);

		final TvDataRequest dataRequest = new TvDataRequest();
		final DataResponseInfo<TvDataInfo> responseInfo = dataRequest.request(requestInfo, url);

		System.out.println("Número de notícias encontradas: " + responseInfo.getNumDocs());

		System.out.println("Conteúdo recuperado na primeira página");
		System.out.println(GSON.toJson(responseInfo));
	}

}
