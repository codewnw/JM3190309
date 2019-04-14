package com.codewnw.jm3190309.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AgeController {

	@RequestMapping("/show-age-form")
	public String showAgeForm() {
		return "age-form";
	}

	@RequestMapping("/process-age")
	public String processAge(@RequestParam("age") int age, Model model) {
		String category;
		if (age >= 0 && age <= 12) {
			category = "Child";
		} else if (age > 12 && age <= 18) {
			category = "Teen";
		} else if (age > 18 && age <= 60) {
			category = "Adult";
		} else if (age > 60 && age <= 100) {
			category = "Senior Citizen";
		} else {
			category = "Not human";
		}
		
		List<String> categories = new ArrayList<>();
		categories.add("Child");
		categories.add("Teen");
		categories.add("Adult");
		categories.add("Senior Citizen");
		categories.add("Not human");
		
		model.addAttribute("category", category);
		model.addAttribute("categories", categories);
		
		return "age-category";
	}

}
