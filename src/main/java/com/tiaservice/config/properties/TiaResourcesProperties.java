package com.tiaservice.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.tiaservice.webhook.dto.SimpleIntent;

@Component
@ConfigurationProperties("tia-service")
public class TiaResourcesProperties {

	private SimpleIntent hiMessage;

	public SimpleIntent getHiMessage() {
		return hiMessage;
	}

	public void setHiMessage(SimpleIntent hiMessage) {
		this.hiMessage = hiMessage;
	}

}
