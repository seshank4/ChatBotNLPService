package com.aetna.dataeng.chatbot.service;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.JSONException;

@Path("/chatservice")
public class ChatService {
	/**
	 * @author ganesh 
	 * @param ChatModel
	 * function for chat
	 * @return 
	 * @throws JSONException 
	 */
	@POST
	@Path("/interact")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ChatModel chat(ChatModel model) throws JSONException{
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("hi", "Hello");
		map.put("how are you", "I'am fine! How are you?");
		String msg = model.getMessage();
		if(msg.trim().toLowerCase().contains("how are you")){
			msg = "how are you";
		}
		String response = map.get(msg.trim().toLowerCase());
		if(response == null){
			response = "Sorry, I don't know how to respond to that yet";
		}
		ChatModel resModel = new ChatModel();
		resModel.setMessage(response);
		return resModel;
		
	}
	
	
	@Path("/test")
	@GET
	@Produces("text/plain")
	public String test() {
		
		return "Hi";
	}
	
	
}
