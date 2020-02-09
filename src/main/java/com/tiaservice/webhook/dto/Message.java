package com.tiaservice.webhook.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Message {
	private Platform platform;
	private Text text;
	private Image image;
	private QuickReplies quickReplies;
	private Card card;
	private Struct payload;
	private SimpleResponses simpleResponses;
	private BasicCard basicCard;
	private Suggestions suggestions;
	private LinkOutSuggestion linkOutSuggestion;
	private ListSelect listSelect;
	private CarouselSelect carouselSelect;
	private BrowseCarouselCard browseCarouselCard;
	private TableCard tableCard;
	private MediaContent mediaContent;

	/**
	 * @return the platform
	 */
	public Platform getPlatform() {
		return platform;
	}

	/**
	 * @param platform
	 *            the platform to set
	 */
	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	/**
	 * @return the text
	 */
	public Text getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(Text text) {
		this.text = text;
	}

	/**
	 * @return the image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the quickReplies
	 */
	public QuickReplies getQuickReplies() {
		return quickReplies;
	}

	/**
	 * @param quickReplies
	 *            the quickReplies to set
	 */
	public void setQuickReplies(QuickReplies quickReplies) {
		this.quickReplies = quickReplies;
	}

	/**
	 * @return the card
	 */
	public Card getCard() {
		return card;
	}

	/**
	 * @param card
	 *            the card to set
	 */
	public void setCard(Card card) {
		this.card = card;
	}

	/**
	 * @return the payload
	 */
	public Struct getPayload() {
		return payload;
	}

	/**
	 * @param payload
	 *            the payload to set
	 */
	public void setPayload(Struct payload) {
		this.payload = payload;
	}

	/**
	 * @return the simpleResponses
	 */
	public SimpleResponses getSimpleResponses() {
		return simpleResponses;
	}

	/**
	 * @param simpleResponses
	 *            the simpleResponses to set
	 */
	public void setSimpleResponses(SimpleResponses simpleResponses) {
		this.simpleResponses = simpleResponses;
	}

	/**
	 * @return the basicCard
	 */
	public BasicCard getBasicCard() {
		return basicCard;
	}

	/**
	 * @param basicCard
	 *            the basicCard to set
	 */
	public void setBasicCard(BasicCard basicCard) {
		this.basicCard = basicCard;
	}

	/**
	 * @return the suggestions
	 */
	public Suggestions getSuggestions() {
		return suggestions;
	}

	/**
	 * @param suggestions
	 *            the suggestions to set
	 */
	public void setSuggestions(Suggestions suggestions) {
		this.suggestions = suggestions;
	}

	/**
	 * @return the linkOutSuggestion
	 */
	public LinkOutSuggestion getLinkOutSuggestion() {
		return linkOutSuggestion;
	}

	/**
	 * @param linkOutSuggestion
	 *            the linkOutSuggestion to set
	 */
	public void setLinkOutSuggestion(LinkOutSuggestion linkOutSuggestion) {
		this.linkOutSuggestion = linkOutSuggestion;
	}

	/**
	 * @return the listSelect
	 */
	public ListSelect getListSelect() {
		return listSelect;
	}

	/**
	 * @param listSelect
	 *            the listSelect to set
	 */
	public void setListSelect(ListSelect listSelect) {
		this.listSelect = listSelect;
	}

	/**
	 * @return the carouselSelect
	 */
	public CarouselSelect getCarouselSelect() {
		return carouselSelect;
	}

	/**
	 * @param carouselSelect
	 *            the carouselSelect to set
	 */
	public void setCarouselSelect(CarouselSelect carouselSelect) {
		this.carouselSelect = carouselSelect;
	}

	/**
	 * @return the browseCarouselCard
	 */
	public BrowseCarouselCard getBrowseCarouselCard() {
		return browseCarouselCard;
	}

	/**
	 * @param browseCarouselCard
	 *            the browseCarouselCard to set
	 */
	public void setBrowseCarouselCard(BrowseCarouselCard browseCarouselCard) {
		this.browseCarouselCard = browseCarouselCard;
	}

	/**
	 * @return the tableCard
	 */
	public TableCard getTableCard() {
		return tableCard;
	}

	/**
	 * @param tableCard
	 *            the tableCard to set
	 */
	public void setTableCard(TableCard tableCard) {
		this.tableCard = tableCard;
	}

	/**
	 * @return the mediaContent
	 */
	public MediaContent getMediaContent() {
		return mediaContent;
	}

	/**
	 * @param mediaContent
	 *            the mediaContent to set
	 */
	public void setMediaContent(MediaContent mediaContent) {
		this.mediaContent = mediaContent;
	}

}
