package com.tiaservice.webhook.dto;

public class ResponseMediaObject {
	private String name;
	private String description;
	private String contentUrl;
	private Image largeImage;
	private Image icon;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the contentUrl
	 */
	public String getContentUrl() {
		return contentUrl;
	}

	/**
	 * @param contentUrl
	 *            the contentUrl to set
	 */
	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	/**
	 * @return the largeImage
	 */
	public Image getLargeImage() {
		return largeImage;
	}

	/**
	 * @param largeImage
	 *            the largeImage to set
	 */
	public void setLargeImage(Image largeImage) {
		this.largeImage = largeImage;
	}

	/**
	 * @return the icon
	 */
	public Image getIcon() {
		return icon;
	}

	/**
	 * @param icon
	 *            the icon to set
	 */
	public void setIcon(Image icon) {
		this.icon = icon;
	}

}
