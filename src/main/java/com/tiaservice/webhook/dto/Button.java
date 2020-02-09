package com.tiaservice.webhook.dto;

public class Button {
	private String text;
	private String postback;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the postback
	 */
	public String getPostback() {
		return postback;
	}

	/**
	 * @param postback
	 *            the postback to set
	 */
	public void setPostback(String postback) {
		this.postback = postback;
	}

}
