package com.tiaservice.webhook.dto;

import java.util.List;

public class BasicCard {
	private String title;
	private String subtitle;
	private String formattedText;
	private Image image;
	private List<Button> buttons;

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
	 * @return the subtitle
	 */
	public String getSubtitle() {
		return subtitle;
	}

	/**
	 * @param subtitle
	 *            the subtitle to set
	 */
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * @return the formattedText
	 */
	public String getFormattedText() {
		return formattedText;
	}

	/**
	 * @param formattedText
	 *            the formattedText to set
	 */
	public void setFormattedText(String formattedText) {
		this.formattedText = formattedText;
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
	 * @return the buttons
	 */
	public List<Button> getButtons() {
		return buttons;
	}

	/**
	 * @param buttons
	 *            the buttons to set
	 */
	public void setButtons(List<Button> buttons) {
		this.buttons = buttons;
	}

}
