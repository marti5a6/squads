package com.squads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SquadsController {
	@Autowired
	
	@RequestMapping("/login")
	public String login() {
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
