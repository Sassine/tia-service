package com.tiaservice.webhook.dto;

import java.util.List;

public class CarouselSelect {
	private List<Item> items;

	/**
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/**
	 * @param items
	 *            the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}
}
