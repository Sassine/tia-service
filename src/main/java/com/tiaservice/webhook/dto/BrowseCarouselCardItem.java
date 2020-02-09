package com.tiaservice.webhook.dto;

public class BrowseCarouselCardItem {
	private OpenUrlAction openUrlAction;
	private String title;
	private String description;
	private Image image;
	private String footer;

	/**
	 * @return the openUrlAction
	 */
	public OpenUrlAction getOpenUrlAction() {
		return openUrlAction;
	}

	/**
	 * @param openUrlAction
	 *            the openUrlAction to set
	 */
	public void setOpenUrlAction(OpenUrlAction openUrlAction) {
		this.openUrlAction = openUrlAction;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the footer
	 */
	public String getFooter() {
		return footer;
	}

	/**
	 * @param footer
	 *            the footer to set
	 */
	public void setFooter(String footer) {
		this.footer = footer;
	}

}
