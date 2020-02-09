package com.tiaservice.webhook.dto;

public class FollowupIntentInfo {
	private String followupIntentName;
	private String parentFollowupIntentName;

	/**
	 * @return the followupIntentName
	 */
	public String getFollowupIntentName() {
		return followupIntentName;
	}

	/**
	 * @param followupIntentName
	 *            the followupIntentName to set
	 */
	public void setFollowupIntentName(String followupIntentName) {
		this.followupIntentName = followupIntentName;
	}

	/**
	 * @return the parentFollowupIntentName
	 */
	public String getParentFollowupIntentName() {
		return parentFollowupIntentName;
	}

	/**
	 * @param parentFollowupIntentName
	 *            the parentFollowupIntentName to set
	 */
	public void setParentFollowupIntentName(String parentFollowupIntentName) {
		this.parentFollowupIntentName = parentFollowupIntentName;
	}

}
