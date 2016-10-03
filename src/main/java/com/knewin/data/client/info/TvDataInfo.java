package com.knewin.data.client.info;

/**
 * Class that stores tv data.
 * 
 * @since 1.5.0
 *
 */
public class TvDataInfo extends MediaDataInfo {

	@Override
	public String toString() {
		return "TvDataInfo [getMediaUrl()=" + this.getMediaUrl() + ", getStartTime()=" + this.getStartTime()
			+ ", getEndTime()=" + this.getEndTime() + ", getDuration()=" + this.getDuration() + ", getContent()="
			+ this.getContent() + ", getCrawledDate()=" + this.getCrawledDate() + ", getId()=" + this.getId()
			+ ", getLanguage()=" + this.getLanguage() + ", getPublishedDate()=" + this.getPublishedDate()
			+ ", getSource()=" + this.getSource() + ", getSourceId()=" + this.getSourceId() + ", getSourceLocalities()="
			+ this.getSourceLocalities() + "]";
	}

}
