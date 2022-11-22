package com.squads;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.squads.dto.Messages;




@Controller
public class SquadsController {
	//@Autowired
	
	List<Messages> allMessages = new ArrayList<Messages>();
	@RequestMapping("/login")
	public String login() {
		Messages test1 = new Messages("This is a test MEssage");
		Messages test2 = new Messages("This is a test MEssage 2");
		Messages test3 = new Messages("This is a test MEssage 3");
		allMessages.add(test1);
		allMessages.add(test2);
		allMessages.add(test3);
		
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/settings")
	public String settings() {
		return "settings";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
	
}
