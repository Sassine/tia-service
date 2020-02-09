package com.tiaservice.webhook.dto;

public class WebhookRequest {

	private String session;
	private String responseId;
	private QueryResult queryResult;
	private OriginalDetectIntentRequest originalDetectIntentRequest;

	/**
	 * @return the session
	 */
	public String getSession() {
		return session;
	}

	/**
	 * @param session
	 *            the session to set
	 */
	public void setSession(String session) {
		this.session = session;
	}

	/**
	 * @return the responseId
	 */
	public String getResponseId() {
		return responseId;
	}

	/**
	 * @param responseId
	 *            the responseId to set
	 */
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	/**
	 * @return the queryResult
	 */
	public QueryResult getQueryResult() {
		return queryResult;
	}

	/**
	 * @param queryResult
	 *            the queryResult to set
	 */
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	/**
	 * @return the originalDetectIntentRequest
	 */
	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	/**
	 * @param originalDetectIntentRequest
	 *            the originalDetectIntentRequest to set
	 */
	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

}
