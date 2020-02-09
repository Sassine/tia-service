package com.tiaservice.webhook.controller;

import java.io.IOException;

import javax.websocket.EncodeException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiaservice.webhook.dto.WebhookRequest;
import com.tiaservice.webhook.dto.WebhookResponse;
import com.tiaservice.webhook.usecase.ProcessWebhookRequestUseCase;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

	
	@Autowired
	private ProcessWebhookRequestUseCase processWebhookRequestUseCase;

	@PostMapping
	public ResponseEntity<WebhookResponse> request(@RequestBody WebhookRequest webhookRequest) throws IOException, EncodeException {
		return ResponseEntity.ok(processWebhookRequestUseCase.execute(webhookRequest));
	}
	
	@GetMapping
	public ResponseEntity<String> status(){
		return ResponseEntity.ok("Webhook online");
	}
}
