package com.knewin.data.client;

import java.lang.reflect.Type;

import com.google.gson.reflect.TypeToken;
import com.knewin.data.client.info.DataResponseInfo;
import com.knewin.data.client.info.VideoDataInfo;
import com.knewin.data.client.info.VideoRequest;

/**
 * Class responsible for requesting videos from web service.
 *
 * @since 3.0.0
 *
 */
public class VideoClient extends DataRequest<VideoRequest, VideoDataInfo> {

	@Override
	protected Type getTypeToken() {
		return new TypeToken<DataResponseInfo<VideoDataInfo>>() {
		}.getType();
	}
}
