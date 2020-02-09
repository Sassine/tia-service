package com.tiaservice.webhook.usecase;

import java.io.IOException;

import javax.websocket.EncodeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tiaservice.config.properties.TiaResourcesProperties;
import com.tiaservice.webhook.dto.WebhookRequest;
import com.tiaservice.webhook.dto.WebhookResponse;
import com.tiaservice.webhook.service.ProcessWebhookRequestService;

@Component
public class ProcessWebhookRequestUseCase {

	@Autowired
	private TiaResourcesProperties tiaProperties;

	@Autowired
	private ProcessWebhookRequestService processWebhookRequestService;

	public WebhookResponse execute(WebhookRequest webhookRequest) throws IOException, EncodeException {
		if (webhookRequest.getQueryResult().getIntent().getDisplayName().equals(tiaProperties.getHiMessage().getName()))
			return processWebhookRequestService.about(webhookRequest);
		return null;
	}
}
