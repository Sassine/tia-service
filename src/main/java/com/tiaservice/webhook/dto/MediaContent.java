package com.tiaservice.webhook.dto;

import java.util.List;

public class MediaContent {
	private ResponseMediaType mediaType;
	private List<ResponseMediaObject> mediaObjects;

	/**
	 * @return the mediaType
	 */
	public ResponseMediaType getMediaType() {
		return mediaType;
	}

	/**
	 * @param mediaType
	 *            the mediaType to set
	 */
	public void setMediaType(ResponseMediaType mediaType) {
		this.mediaType = mediaType;
	}

	/**
	 * @return the mediaObjects
	 */
	public List<ResponseMediaObject> getMediaObjects() {
		return mediaObjects;
	}

	/**
	 * @param mediaObjects
	 *            the mediaObjects to set
	 */
	public void setMediaObjects(List<ResponseMediaObject> mediaObjects) {
		this.mediaObjects = mediaObjects;
	}

}
