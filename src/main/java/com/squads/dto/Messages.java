package com.squads.dto;

import java.util.UUID;

public class Messages {
	private UUID uuid = UUID.randomUUID();

	public String messageId = uuid.toString();
	public String message;
	
	public String getMessageId() {
		return messageId;
	}
	//public void setMessageId(String messageId) {
	//	this.messageId = messageId;
	//}
	public String getMessage() {
		return message;
	}
	public Messages(String message) {
		super();
		this.message = message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
