package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	
	
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	
	
	
	
	
	
}
