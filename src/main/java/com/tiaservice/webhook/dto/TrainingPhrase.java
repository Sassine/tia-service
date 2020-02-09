package com.tiaservice.webhook.dto;

import java.util.List;

public class TrainingPhrase {
	private String name;
	private Type type;
	private List<Part> parts;
	private Integer timesAddedCount;

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
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the parts
	 */
	public List<Part> getParts() {
		return parts;
	}

	/**
	 * @param parts
	 *            the parts to set
	 */
	public void setParts(List<Part> parts) {
		this.parts = parts;
	}

	/**
	 * @return the timesAddedCount
	 */
	public Integer getTimesAddedCount() {
		return timesAddedCount;
	}

	/**
	 * @param timesAddedCount
	 *            the timesAddedCount to set
	 */
	public void setTimesAddedCount(Integer timesAddedCount) {
		this.timesAddedCount = timesAddedCount;
	}

}
