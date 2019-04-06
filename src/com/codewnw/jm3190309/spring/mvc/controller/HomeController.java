package com.codewnw.jm3190309.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		System.out.println("I'm running");
		return "index";
	}
	
	@RequestMapping("/who")
	public @ResponseBody String whoAreYou() {
		return "I'm spring";
	}
	
/*	
 * @RequestMapping("/who")
	public @ResponseBody String sfmlksdmfls() {
		return "I'm spring";
	}
	
	*/
}
