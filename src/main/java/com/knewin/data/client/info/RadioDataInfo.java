package com.knewin.data.client.info;

/**
 * Class that stores radio data.
 *
 * @since 1.5.0
 *
 */
public class RadioDataInfo extends MediaDataInfo {

	@Override
	public String toString() {
		return "RadioDataInfo [getMediaUrl()=" + getMediaUrl() + ", getStartTime()=" + getStartTime() + ", getEndTime()="
			+ getEndTime() + ", getDuration()=" + getDuration() + ", getTitle()=" + getTitle() + ", getContent()="
			+ getContent() + ", getTimes()=" + getTimes() + ", getCrawledDate()=" + getCrawledDate() + ", getId()="
			+ getId() + ", getLanguage()=" + getLanguage() + ", getPublishedDate()=" + getPublishedDate()
			+ ", getSource()=" + getSource() + ", getSourceId()=" + getSourceId() + ", getSourceLocalities()="
			+ getSourceLocalities() + ", getTerms()=" + getTerms() + "]";
	}

}
