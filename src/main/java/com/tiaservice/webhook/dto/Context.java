package com.tiaservice.webhook.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Context {
	private String name;
	private Integer lifespanCount;
	private Struct parameters;

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
	 * @return the lifespanCount
	 */
	public Integer getLifespanCount() {
		return lifespanCount;
	}

	/**
	 * @param lifespanCount
	 *            the lifespanCount to set
	 */
	public void setLifespanCount(Integer lifespanCount) {
		this.lifespanCount = lifespanCount;
	}

	/**
	 * @return the parameters
	 */
	public Struct getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(Struct parameters) {
		this.parameters = parameters;
	}

}
