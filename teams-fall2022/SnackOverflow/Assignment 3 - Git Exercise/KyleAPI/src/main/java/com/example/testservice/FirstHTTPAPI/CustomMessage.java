package com.example.testservice.FirstHTTPAPI;

public class CustomMessage 
{
	private final String messageContent;

	public CustomMessage(String messageContent) 
	{
		this.messageContent = messageContent;
	}

	public String getContent() 
	{
		return messageContent;
	}
}
