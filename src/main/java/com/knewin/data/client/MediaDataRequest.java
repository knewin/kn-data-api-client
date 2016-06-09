package com.knewin.data.client;

import com.knewin.data.client.info.MediaDataInfo;
import com.knewin.data.client.info.MediaRequestFilter;
import com.knewin.data.client.info.MediaRequestInfo;

/**
 * Class responsible for requesting media from web service.
 *
 * @param <R> the {@link MediaRequestInfo}
 * @param <D> the {@link MediaDataInfo}
 */
public abstract class MediaDataRequest<R extends MediaRequestInfo<? extends MediaRequestFilter>, D extends MediaDataInfo>
	extends DataRequest<R, D> {

}
