package com.codewnw.jm3190309.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewnw.jm3190309.spring.mvc.model.Student;

@Controller
public class StudentController {
	
	@InitBinder
	public void preProcessing(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@GetMapping("/show-student-form")
	public String showStudentForm(Model model) {
		Student student = new Student();
		student.setLastName("Dwivedi");
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@PostMapping("/process-student-form")
	public String processStudentForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "student-form";
		}
		return "student-profile";
	}

}
