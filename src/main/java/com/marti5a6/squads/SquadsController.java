package com.marti5a6.squads;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class SquadsController {
	@Autowired
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
