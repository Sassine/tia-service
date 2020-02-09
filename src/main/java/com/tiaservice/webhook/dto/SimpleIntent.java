package com.tiaservice.webhook.dto;

public final class SimpleIntent {
	private String name;
	private String contextName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContextName() {
		return contextName;
	}

	public void setContextName(String contextName) {
		this.contextName = contextName;
	}

}