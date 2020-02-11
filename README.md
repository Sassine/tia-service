# # (Technology Intelligence Assistant) tia-service !

This is a simple Agent Fulfillment Webhook project to be integrated with  [dialogflow](https://dialogflow.cloud.google.com/) used to return a personalized message for an intent named "Hello".

> http://localhost:8090/api/webhook 

![Agent Fulfillment Webhook](https://dialogflow.com/docs/images/integrations/actions/aog-dialogflow-protocol.png)

To create new intent configurations, simply create getters and setters in the **TiaResourcesProperties.java** file and add your name to **application.yml**

*Example:*

    tia-service:
	    hiMessage: #Getter/Setter Name
		    name:${TIA_HI_MESSAGE:Hello} #Intent name
		byeMessage: #Getter/Setter Name
			name:${TIA_BYE_MESSAGE:Bye} #Intent name
		
For the dialogflow to communicate with the webhook it must be running with ssl active and accepting an external connection.
