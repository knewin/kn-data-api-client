package com.knewin.data.client.info;

/**
 * Class that stores news image data.
 * 
 * @since 1.0.0
 * 
 */
public class ImageNewsDataInfo {

	private String url;

	private String caption;

	private String credit;


	/**
	 * Get the image caption.
	 * 
	 * @return the image caption
	 */
	public String getCaption() {
		return caption;
	}


	/**
	 * Get the image credit.
	 * 
	 * @return the image credit
	 */
	public String getCredit() {
		return credit;
	}


	/**
	 * Get the image URL.
	 * 
	 * @return the image URL
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * Set the image caption.
	 * 
	 * @param caption the image caption
	 */
	public void setCaption(final String caption) {
		this.caption = caption;
	}


	/**
	 * Set the image credit.
	 * 
	 * @param credit the image credit
	 */
	public void setCredit(final String credit) {
		this.credit = credit;
	}


	/**
	 * Set the image URL.
	 * 
	 * @param url the image URL
	 */
	public void setUrl(final String url) {
		this.url = url;
	}


	@Override
	public String toString() {
		return "ImageNewsDataInfo [url=" + url + ", caption=" + caption + ", credit=" + credit + "]";
	}

}
