package com.tiaservice.webhook.dto;

public class Part {
	private String text;
	private String entityType;
	private String alias;
	private Boolean userDefined;

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the entityType
	 */
	public String getEntityType() {
		return entityType;
	}

	/**
	 * @param entityType
	 *            the entityType to set
	 */
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	/**
	 * @return the alias
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * @param alias
	 *            the alias to set
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}

	/**
	 * @return the userDefined
	 */
	public Boolean getUserDefined() {
		return userDefined;
	}

	/**
	 * @param userDefined
	 *            the userDefined to set
	 */
	public void setUserDefined(Boolean userDefined) {
		this.userDefined = userDefined;
	}

}
