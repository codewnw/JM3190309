package com.codewnw.jm3190309.endtoend.rest;

import java.util.List;

import javax.transaction.Transactional;

import org.infinispan.commons.dataconversion.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewnw.jm3190309.endtoend.model.Person;
import com.codewnw.jm3190309.endtoend.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonRestController {

	@Autowired
	private PersonService personService;

	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_TYPE })
	@Transactional
	public Person getPerson(@PathVariable("id") Long id) {
//		int i = 10/0;
		return personService.get(id);
	}

	@GetMapping
	@Transactional
	public List<Person> getPersons() {
		return personService.getPersons();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_TYPE })
	@Transactional
	public void save(@RequestBody Person person) {
		personService.save(person);
	}

	@PutMapping
	@Transactional
	public void update(@RequestBody Person person) {
		personService.update(person);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void delete(@PathVariable Long id) {
		personService.delete(id);
	}

}
