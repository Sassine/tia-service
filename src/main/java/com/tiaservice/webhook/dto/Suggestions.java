package com.tiaservice.webhook.dto;

import java.util.List;

public class Suggestions {
	private List<Suggestion> suggestions;

	/**
	 * @return the suggestions
	 */
	public List<Suggestion> getSuggestions() {
		return suggestions;
	}

	/**
	 * @param suggestions
	 *            the suggestions to set
	 */
	public void setSuggestions(List<Suggestion> suggestions) {
		this.suggestions = suggestions;
	}

}
