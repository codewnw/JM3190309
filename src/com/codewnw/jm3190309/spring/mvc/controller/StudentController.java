package com.codewnw.jm3190309.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewnw.jm3190309.spring.mvc.model.Student;

@Controller
public class StudentController {

	@GetMapping("/show-student-form")
	public String showStudentForm(Model model) {
		Student student = new Student();
		student.setLastName("Dwivedi");
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@PostMapping("/process-student-form")
	public String processStudentForm(@ModelAttribute("student") Student student){
		return "student-profile";
	}

}
