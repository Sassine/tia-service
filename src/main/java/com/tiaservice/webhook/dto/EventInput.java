package com.tiaservice.webhook.dto;

/**
 * @author ricardo.camargo
 * 
 *         Events allow for matching intents by event name instead of the
 *         natural language input. For instance, input <event: { name:
 *         "welcome_event", parameters: { name: "Sam" } }> can trigger a
 *         personalized welcome response. The parameter name may be used by the
 *         agent in the response: "Hello #welcome_event.name! What can I do for
 *         you today?".
 */
public class EventInput {
	private String name;
	private Struct parameters;
	private String languageCode;

	public EventInput() {
	}

	public EventInput(String name) {
		this.name = name;
	}

	public EventInput(String name, Struct parameters) {
		this(name);
		this.parameters = parameters;
	}

	public EventInput(String name, Struct parameters, String languageCode) {
		this(name, parameters);
		this.languageCode = languageCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the parameters
	 */
	public Struct getParameters() {
		return parameters;
	}

	/**
	 * @param parameters the parameters to set
	 */
	public void setParameters(Struct parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @param languageCode the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

}
