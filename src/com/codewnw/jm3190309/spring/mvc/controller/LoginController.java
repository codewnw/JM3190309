package com.codewnw.jm3190309.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/login")
	public String showLoginPage() {
		System.out.println("Someone is asking for login page.");
		return "login";
	}

	@RequestMapping("/performLogin")
	public String perfomrLogin(@RequestParam("username") String un, @RequestParam("password") String p) {
		if (un.equals(p)) {
			return "index";
		} else {
			return "login";
		}
	}
}
