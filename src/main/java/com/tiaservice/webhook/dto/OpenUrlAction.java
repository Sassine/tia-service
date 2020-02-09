package com.tiaservice.webhook.dto;

public class OpenUrlAction {
	private String url;
	private UrlTypeHint urlTypeHint;

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the urlTypeHint
	 */
	public UrlTypeHint getUrlTypeHint() {
		return urlTypeHint;
	}

	/**
	 * @param urlTypeHint
	 *            the urlTypeHint to set
	 */
	public void setUrlTypeHint(UrlTypeHint urlTypeHint) {
		this.urlTypeHint = urlTypeHint;
	}

}
