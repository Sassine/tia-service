package com.tiaservice.webhook.dto;

import java.util.List;

public class BrowseCarouselCard {
	private List<BrowseCarouselCardItem> items;
	private ImageDisplayOptions imageDisplayOptions;

	/**
	 * @return the items
	 */
	public List<BrowseCarouselCardItem> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<BrowseCarouselCardItem> items) {
		this.items = items;
	}

	/**
	 * @return the imageDisplayOptions
	 */
	public ImageDisplayOptions getImageDisplayOptions() {
		return imageDisplayOptions;
	}

	/**
	 * @param imageDisplayOptions
	 *            the imageDisplayOptions to set
	 */
	public void setImageDisplayOptions(ImageDisplayOptions imageDisplayOptions) {
		this.imageDisplayOptions = imageDisplayOptions;
	}

}
