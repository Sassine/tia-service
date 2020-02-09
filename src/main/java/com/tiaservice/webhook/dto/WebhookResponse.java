package com.tiaservice.webhook.dto;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class WebhookResponse {
	private String fulfillmentText;
	private List<Message> fulfillmentMessages;
	private String source;
	private Struct payload;
	private List<Context> outputContexts;
	private EventInput followupEventInput;
	private List<SessionEntityType> sessionEntityTypes;

	/**
	 * @return the fulfillmentText
	 */
	public String getFulfillmentText() {
		return fulfillmentText;
	}

	/**
	 * @param fulfillmentText the fulfillmentText to set
	 */
	public void setFulfillmentText(String fulfillmentText) {
		this.fulfillmentText = fulfillmentText;
	}

	/**
	 * @return the fulfillmentMessages
	 */
	public List<Message> getFulfillmentMessages() {
		return fulfillmentMessages;
	}

	/**
	 * @param fulfillmentMessages the fulfillmentMessages to set
	 */
	public void setFulfillmentMessages(List<Message> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	/**
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the payload
	 */
	public Struct getPayload() {
		return payload;
	}

	/**
	 * @param payload the payload to set
	 */
	public void setPayload(Struct payload) {
		this.payload = payload;
	}

	/**
	 * @return the outputContexts
	 */
	public List<Context> getOutputContexts() {
		return outputContexts;
	}

	/**
	 * @param outputContexts the outputContexts to set
	 */
	public void setOutputContexts(List<Context> outputContexts) {
		this.outputContexts = outputContexts;
	}

	/**
	 * @return the followupEventInput
	 */
	public EventInput getFollowupEventInput() {
		return followupEventInput;
	}

	/**
	 * @param followupEventInput the followupEventInput to set
	 */
	public void setFollowupEventInput(EventInput followupEventInput) {
		this.followupEventInput = followupEventInput;
	}

	/**
	 * @return the sessionEntityTypes
	 */
	public List<SessionEntityType> getSessionEntityTypes() {
		return sessionEntityTypes;
	}

	/**
	 * @param sessionEntityTypes the sessionEntityTypes to set
	 */
	public void setSessionEntityTypes(List<SessionEntityType> sessionEntityTypes) {
		this.sessionEntityTypes = sessionEntityTypes;
	}
	
	public static WebhookResponseBuilder builder() {
		return new WebhookResponseBuilder();
	}

	public static class WebhookResponseBuilder {
		private String fulfillmentText;
		private List<Message> fulfillmentMessages;
		private String source;
		private Struct payload;
		private List<Context> outputContexts;
		private EventInput followupEventInput;
		private List<SessionEntityType> sessionEntityTypes;

		public WebhookResponseBuilder() {
		}

		public WebhookResponseBuilder fulfillmentText(String fulfillmentText) {
			this.fulfillmentText = fulfillmentText;
			return this;
		}

		public WebhookResponseBuilder fulfillmentMessages(List<Message> fulfillmentMessages) {
			this.fulfillmentMessages = fulfillmentMessages;
			return this;
		}

		public WebhookResponseBuilder source(String source) {
			this.source = source;
			return this;
		}

		public WebhookResponseBuilder payload(Struct payload) {
			this.payload = payload;
			return this;
		}

		public WebhookResponseBuilder outputContexts(List<Context> outputContexts) {
			this.outputContexts = outputContexts;
			return this;
		}

		public WebhookResponseBuilder followupEventInput(EventInput followupEventInput) {
			this.followupEventInput = followupEventInput;
			return this;
		}
		
		public WebhookResponseBuilder followupEventInput(String name) {
			this.followupEventInput = new EventInput(name);
			return this;
		}

		public WebhookResponseBuilder followupEventInput(String name, Struct parameters) {
			this.followupEventInput = new EventInput(name, parameters);
			return this;
		}
		
		public WebhookResponseBuilder followupEventInput(String name, Struct parameters, String languageCode) {
			this.followupEventInput = new EventInput(name, parameters, languageCode);
			return this;
		}

		public WebhookResponseBuilder sessionEntityTypes(List<SessionEntityType> sessionEntityTypes) {
			this.sessionEntityTypes = sessionEntityTypes;
			return this;
		}

		public WebhookResponseBuilder endOfConversation() {
			payload = new Struct();
			payload.put("google", Map.of("expectUserResponse", false, "richResponse",
					Map.of("items",
							Arrays.asList(Map.of("simpleResponse", Map.of("textToSpeech", this.fulfillmentText)))),
					"isSsml", false, "userStorage", "{\"data\":{}}"));
			return this;
		}

		public WebhookResponse build() {
			WebhookResponse webhookResponse = new WebhookResponse();
			webhookResponse.setFollowupEventInput(this.followupEventInput);
			webhookResponse.setFulfillmentMessages(fulfillmentMessages);
			webhookResponse.setFulfillmentText(fulfillmentText);
			webhookResponse.setOutputContexts(outputContexts);
			webhookResponse.setPayload(payload);
			webhookResponse.setSessionEntityTypes(sessionEntityTypes);
			webhookResponse.setSource(source);
			return webhookResponse;

		}

	}

}
