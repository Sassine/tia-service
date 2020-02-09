package com.tiaservice.webhook.dto;

public class SentimentAnalysisResult {
	private Sentiment queryTextSentiment;

	/**
	 * @return the queryTextSentiment
	 */
	public Sentiment getQueryTextSentiment() {
		return queryTextSentiment;
	}

	/**
	 * @param queryTextSentiment
	 *            the queryTextSentiment to set
	 */
	public void setQueryTextSentiment(Sentiment queryTextSentiment) {
		this.queryTextSentiment = queryTextSentiment;
	}

}
