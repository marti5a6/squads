package com.marti5a6.squads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SquadsController {
	
	@Autowired
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String read() {
		return "index";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
