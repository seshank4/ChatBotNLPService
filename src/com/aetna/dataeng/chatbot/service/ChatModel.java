package com.aetna.dataeng.chatbot.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ChatModel {

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString(){
		
		
		return new StringBuffer("message : ").append(this.message).toString();
	}
}
