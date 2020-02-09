package com.tiaservice.webhook.dto;

import java.util.List;

public class TableCard {
	private String title;
	private String subtitle;
	private Image image;
	private List<ColumnProperties> columnProperties;
	private List<TableCardRow> rows;
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
	 * @return the columnProperties
	 */
	public List<ColumnProperties> getColumnProperties() {
		return columnProperties;
	}

	/**
	 * @param columnProperties
	 *            the columnProperties to set
	 */
	public void setColumnProperties(List<ColumnProperties> columnProperties) {
		this.columnProperties = columnProperties;
	}

	/**
	 * @return the rows
	 */
	public List<TableCardRow> getRows() {
		return rows;
	}

	/**
	 * @param rows
	 *            the rows to set
	 */
	public void setRows(List<TableCardRow> rows) {
		this.rows = rows;
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
