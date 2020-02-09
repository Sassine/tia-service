package com.tiaservice.webhook.dto;

public class SimpleResponse {
	private String textToSpeech;
	private String ssml;
	private String displayText;

	/**
	 * @return the textToSpeech
	 */
	public String getTextToSpeech() {
		return textToSpeech;
	}

	/**
	 * @param textToSpeech
	 *            the textToSpeech to set
	 */
	public void setTextToSpeech(String textToSpeech) {
		this.textToSpeech = textToSpeech;
	}

	/**
	 * @return the ssml
	 */
	public String getSsml() {
		return ssml;
	}

	/**
	 * @param ssml
	 *            the ssml to set
	 */
	public void setSsml(String ssml) {
		this.ssml = ssml;
	}

	/**
	 * @return the displayText
	 */
	public String getDisplayText() {
		return displayText;
	}

	/**
	 * @param displayText
	 *            the displayText to set
	 */
	public void setDisplayText(String displayText) {
		this.displayText = displayText;
	}

}
