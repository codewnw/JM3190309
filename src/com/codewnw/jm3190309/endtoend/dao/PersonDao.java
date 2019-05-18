package com.codewnw.jm3190309.endtoend.dao;

import java.util.List;

import com.codewnw.jm3190309.endtoend.model.Person;

public interface PersonDao {

	void save(Person person);

	Person get(Long id);

	List<Person> getPersons();

	void update(Person person);

	void delete(Long id);

}
