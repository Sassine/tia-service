package com.tiaservice.webhook.dto;

import java.util.List;

public class Intent {
	private String name;
	private String displayName;
	private WebhookState webhookState;
	private Integer priority;
	private Boolean isFallback;
	private Boolean mlDisabled;
	private List<String> inputContextNames;
	private List<String> events;
	private List<TrainingPhrase> trainingPhrases;
	private String action;
	private List<Context> outputContexts;
	private Boolean resetContexts;
	private List<Parameter> parameters;
	private List<Message> messages;
	private List<Platform> defaultResponsePlatforms;
	private String rootFollowupIntentName;
	private String parentFollowupIntentName;
	private List<FollowupIntentInfo> followupIntentInfo;

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
	 * @return the webhookState
	 */
	public WebhookState getWebhookState() {
		return webhookState;
	}

	/**
	 * @param webhookState
	 *            the webhookState to set
	 */
	public void setWebhookState(WebhookState webhookState) {
		this.webhookState = webhookState;
	}

	/**
	 * @return the priority
	 */
	public Integer getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/**
	 * @return the isFallback
	 */
	public Boolean getIsFallback() {
		return isFallback;
	}

	/**
	 * @param isFallback
	 *            the isFallback to set
	 */
	public void setIsFallback(Boolean isFallback) {
		this.isFallback = isFallback;
	}

	/**
	 * @return the mlDisabled
	 */
	public Boolean getMlDisabled() {
		return mlDisabled;
	}

	/**
	 * @param mlDisabled
	 *            the mlDisabled to set
	 */
	public void setMlDisabled(Boolean mlDisabled) {
		this.mlDisabled = mlDisabled;
	}

	/**
	 * @return the inputContextNames
	 */
	public List<String> getInputContextNames() {
		return inputContextNames;
	}

	/**
	 * @param inputContextNames
	 *            the inputContextNames to set
	 */
	public void setInputContextNames(List<String> inputContextNames) {
		this.inputContextNames = inputContextNames;
	}

	/**
	 * @return the events
	 */
	public List<String> getEvents() {
		return events;
	}

	/**
	 * @param events
	 *            the events to set
	 */
	public void setEvents(List<String> events) {
		this.events = events;
	}

	/**
	 * @return the trainingPhrases
	 */
	public List<TrainingPhrase> getTrainingPhrases() {
		return trainingPhrases;
	}

	/**
	 * @param trainingPhrases
	 *            the trainingPhrases to set
	 */
	public void setTrainingPhrases(List<TrainingPhrase> trainingPhrases) {
		this.trainingPhrases = trainingPhrases;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the outputContexts
	 */
	public List<Context> getOutputContexts() {
		return outputContexts;
	}

	/**
	 * @param outputContexts
	 *            the outputContexts to set
	 */
	public void setOutputContexts(List<Context> outputContexts) {
		this.outputContexts = outputContexts;
	}

	/**
	 * @return the resetContexts
	 */
	public Boolean getResetContexts() {
		return resetContexts;
	}

	/**
	 * @param resetContexts
	 *            the resetContexts to set
	 */
	public void setResetContexts(Boolean resetContexts) {
		this.resetContexts = resetContexts;
	}

	/**
	 * @return the parameters
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters
	 *            the parameters to set
	 */
	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return the messages
	 */
	public List<Message> getMessages() {
		return messages;
	}

	/**
	 * @param messages
	 *            the messages to set
	 */
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	/**
	 * @return the defaultResponsePlatforms
	 */
	public List<Platform> getDefaultResponsePlatforms() {
		return defaultResponsePlatforms;
	}

	/**
	 * @param defaultResponsePlatforms
	 *            the defaultResponsePlatforms to set
	 */
	public void setDefaultResponsePlatforms(List<Platform> defaultResponsePlatforms) {
		this.defaultResponsePlatforms = defaultResponsePlatforms;
	}

	/**
	 * @return the rootFollowupIntentName
	 */
	public String getRootFollowupIntentName() {
		return rootFollowupIntentName;
	}

	/**
	 * @param rootFollowupIntentName
	 *            the rootFollowupIntentName to set
	 */
	public void setRootFollowupIntentName(String rootFollowupIntentName) {
		this.rootFollowupIntentName = rootFollowupIntentName;
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

	/**
	 * @return the followupIntentInfo
	 */
	public List<FollowupIntentInfo> getFollowupIntentInfo() {
		return followupIntentInfo;
	}

	/**
	 * @param followupIntentInfo
	 *            the followupIntentInfo to set
	 */
	public void setFollowupIntentInfo(List<FollowupIntentInfo> followupIntentInfo) {
		this.followupIntentInfo = followupIntentInfo;
	}

}
