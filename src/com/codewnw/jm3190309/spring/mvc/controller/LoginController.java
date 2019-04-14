package com.codewnw.jm3190309.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@GetMapping("/login")
//	@RequestMapping("/login")
	public String showLoginPage() {
		System.out.println("Someone is asking for login page.");
		return "login";
	}

	@PostMapping("/performLogin")
//	@RequestMapping(value = "/performLogin", method = RequestMethod.POST)
	public String perfomrLogin(@RequestParam("username") String un, @RequestParam("password") String p) {
		if (un.equals(p)) {
			return "index";
		} else {
			return "login";
		}
	}
}
