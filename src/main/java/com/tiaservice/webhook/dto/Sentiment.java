package com.tiaservice.webhook.dto;

public class Sentiment {
	private Double score;
	private Double magnitude;

	/**
	 * @return the score
	 */
	public Double getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(Double score) {
		this.score = score;
	}

	/**
	 * @return the magnitude
	 */
	public Double getMagnitude() {
		return magnitude;
	}

	/**
	 * @param magnitude
	 *            the magnitude to set
	 */
	public void setMagnitude(Double magnitude) {
		this.magnitude = magnitude;
	}

}
