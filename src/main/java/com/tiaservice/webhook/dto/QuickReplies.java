package com.tiaservice.webhook.dto;

import java.util.List;

public class QuickReplies {
	private String title;
	private List<String> quickReplies;

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
	 * @return the quickReplies
	 */
	public List<String> getQuickReplies() {
		return quickReplies;
	}

	/**
	 * @param quickReplies
	 *            the quickReplies to set
	 */
	public void setQuickReplies(List<String> quickReplies) {
		this.quickReplies = quickReplies;
	}

}
