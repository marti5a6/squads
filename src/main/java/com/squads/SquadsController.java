package com.squads;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.squads.dto.Messages;
import com.squads.service.IMessageService;

@Controller
public class SquadsController {
	
	@Autowired
	private IMessageService service;


	List<Messages> allMessages = new ArrayList<Messages>();
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Messages> data = service.fetchAll();
		model.addAttribute("messages", data);
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
