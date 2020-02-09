package com.tiaservice.webhook.dto;

public class Image {
	private String imageUri;
	private String accessibilityText;

	/**
	 * @return the imageUri
	 */
	public String getImageUri() {
		return imageUri;
	}

	/**
	 * @param imageUri
	 *            the imageUri to set
	 */
	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	/**
	 * @return the accessibilityText
	 */
	public String getAccessibilityText() {
		return accessibilityText;
	}

	/**
	 * @param accessibilityText
	 *            the accessibilityText to set
	 */
	public void setAccessibilityText(String accessibilityText) {
		this.accessibilityText = accessibilityText;
	}

}
