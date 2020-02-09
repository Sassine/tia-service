package com.tiaservice.webhook.service;

import java.io.IOException;

import javax.websocket.EncodeException;

import org.springframework.stereotype.Service;

import com.tiaservice.webhook.dto.WebhookRequest;
import com.tiaservice.webhook.dto.WebhookResponse;
import com.tiaservice.webhook.dto.WebhookResponse.WebhookResponseBuilder;

@Service
public class ProcessWebhookRequestService {

	public WebhookResponse about(final WebhookRequest webhookRequest) throws IOException, EncodeException {
		WebhookResponseBuilder rspBuilder = WebhookResponse.builder();
		
		rspBuilder
		.fulfillmentText(
				"<speak>" 
				+ "Hi ! , my name is Tia."
				+ "Your new virtual assistant." 
				+ "</speak>"
		);
		
		return rspBuilder.build();
	}
}
