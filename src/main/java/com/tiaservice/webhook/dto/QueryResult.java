package com.tiaservice.webhook.dto;

import java.util.List;

public class QueryResult {
	private String queryText;
	private String languageCode;
	private Double speechRecognitionConfidence;
	private String action;
	private Struct parameters;
	private Boolean allRequiredParamsPresent;
	private String fulfillmentText;
	private List<Message> fulfillmentMessages;
	private String webhookSource;
	private Struct webhookPayload;
	private List<Context> outputContexts;
	private Intent intent;
	private Double intentDetectionConfidence;
	private Struct diagnosticInfo;
	private SentimentAnalysisResult sentimentAnalysisResult;

	/**
	 * @return the queryText
	 */
	public String getQueryText() {
		return queryText;
	}

	/**
	 * @param queryText
	 *            the queryText to set
	 */
	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	/**
	 * @return the languageCode
	 */
	public String getLanguageCode() {
		return languageCode;
	}

	/**
	 * @param languageCode
	 *            the languageCode to set
	 */
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	/**
	 * @return the speechRecognitionConfidence
	 */
	public Double getSpeechRecognitionConfidence() {
		return speechRecognitionConfidence;
	}

	/**
	 * @param speechRecognitionConfidence
	 *            the speechRecognitionConfidence to set
	 */
	public void setSpeechRecognitionConfidence(Double speechRecognitionConfidence) {
		this.speechRecognitionConfidence = speechRecognitionConfidence;
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

	/**
	 * @return the allRequiredParamsPresent
	 */
	public Boolean getAllRequiredParamsPresent() {
		return allRequiredParamsPresent;
	}

	/**
	 * @param allRequiredParamsPresent
	 *            the allRequiredParamsPresent to set
	 */
	public void setAllRequiredParamsPresent(Boolean allRequiredParamsPresent) {
		this.allRequiredParamsPresent = allRequiredParamsPresent;
	}

	/**
	 * @return the fulfillmentText
	 */
	public String getFulfillmentText() {
		return fulfillmentText;
	}

	/**
	 * @param fulfillmentText
	 *            the fulfillmentText to set
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
	 * @param fulfillmentMessages
	 *            the fulfillmentMessages to set
	 */
	public void setFulfillmentMessages(List<Message> fulfillmentMessages) {
		this.fulfillmentMessages = fulfillmentMessages;
	}

	/**
	 * @return the webhookSource
	 */
	public String getWebhookSource() {
		return webhookSource;
	}

	/**
	 * @param webhookSource
	 *            the webhookSource to set
	 */
	public void setWebhookSource(String webhookSource) {
		this.webhookSource = webhookSource;
	}

	/**
	 * @return the webhookPayload
	 */
	public Struct getWebhookPayload() {
		return webhookPayload;
	}

	/**
	 * @param webhookPayload
	 *            the webhookPayload to set
	 */
	public void setWebhookPayload(Struct webhookPayload) {
		this.webhookPayload = webhookPayload;
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
	 * @return the intent
	 */
	public Intent getIntent() {
		return intent;
	}

	/**
	 * @param intent
	 *            the intent to set
	 */
	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	/**
	 * @return the intentDetectionConfidence
	 */
	public Double getIntentDetectionConfidence() {
		return intentDetectionConfidence;
	}

	/**
	 * @param intentDetectionConfidence
	 *            the intentDetectionConfidence to set
	 */
	public void setIntentDetectionConfidence(Double intentDetectionConfidence) {
		this.intentDetectionConfidence = intentDetectionConfidence;
	}

	/**
	 * @return the diagnosticInfo
	 */
	public Struct getDiagnosticInfo() {
		return diagnosticInfo;
	}

	/**
	 * @param diagnosticInfo
	 *            the diagnosticInfo to set
	 */
	public void setDiagnosticInfo(Struct diagnosticInfo) {
		this.diagnosticInfo = diagnosticInfo;
	}

	/**
	 * @return the sentimentAnalysisResult
	 */
	public SentimentAnalysisResult getSentimentAnalysisResult() {
		return sentimentAnalysisResult;
	}

	/**
	 * @param sentimentAnalysisResult
	 *            the sentimentAnalysisResult to set
	 */
	public void setSentimentAnalysisResult(SentimentAnalysisResult sentimentAnalysisResult) {
		this.sentimentAnalysisResult = sentimentAnalysisResult;
	}

}
