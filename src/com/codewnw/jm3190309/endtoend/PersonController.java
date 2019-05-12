package com.codewnw.jm3190309.endtoend;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codewnw.jm3190309.endtoend.model.Person;

@Controller
public class PersonController {

	@Autowired
	private SessionFactory sessionFactory;

	@InitBinder
	public void preProcessing(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}

	@GetMapping("/show-person-form")
	public String showStudentForm(Model model) {
		Person person = new Person();
		model.addAttribute("person", person);
		return "person-form";
	}

	@PostMapping("/process-person-form")
	@Transactional
	public String processStudentForm(@ModelAttribute("person") Person person) {
		Long id = (Long) sessionFactory.openSession().save(person);
		System.out.println("ID: " + id);
		return "person-profile";
	}

}
