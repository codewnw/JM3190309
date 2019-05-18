package com.codewnw.jm3190309.endtoend.service;

import java.util.List;

import com.codewnw.jm3190309.endtoend.model.Person;

public interface PersonService {

	void save(Person person);

	Person get(Long id);

	List<Person> getPersons();

	void update(Person person);

	void delete(Long id);

}
