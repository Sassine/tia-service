package com.tiaservice.webhook.dto;

import java.util.List;

public class Parameter {
	private String name;
	private String displayName;
	private String value;
	private String defaultValue;
	private String entityTypeDisplayName;
	private Boolean mandatory;
	private List<String> prompts;
	private Boolean isList;

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
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param displayName
	 *            the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the defaultValue
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * @param defaultValue
	 *            the defaultValue to set
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * @return the entityTypeDisplayName
	 */
	public String getEntityTypeDisplayName() {
		return entityTypeDisplayName;
	}

	/**
	 * @param entityTypeDisplayName
	 *            the entityTypeDisplayName to set
	 */
	public void setEntityTypeDisplayName(String entityTypeDisplayName) {
		this.entityTypeDisplayName = entityTypeDisplayName;
	}

	/**
	 * @return the mandatory
	 */
	public Boolean getMandatory() {
		return mandatory;
	}

	/**
	 * @param mandatory
	 *            the mandatory to set
	 */
	public void setMandatory(Boolean mandatory) {
		this.mandatory = mandatory;
	}

	/**
	 * @return the prompts
	 */
	public List<String> getPrompts() {
		return prompts;
	}

	/**
	 * @param prompts
	 *            the prompts to set
	 */
	public void setPrompts(List<String> prompts) {
		this.prompts = prompts;
	}

	/**
	 * @return the isList
	 */
	public Boolean getIsList() {
		return isList;
	}

	/**
	 * @param isList
	 *            the isList to set
	 */
	public void setIsList(Boolean isList) {
		this.isList = isList;
	}

}
