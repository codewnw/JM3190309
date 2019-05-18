package com.codewnw.jm3190309.endtoend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewnw.jm3190309.endtoend.dao.PersonDao;
import com.codewnw.jm3190309.endtoend.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;

	@Override
	public void save(Person person) {
		personDao.save(person);
	}

	@Override
	public Person get(Long id) {
		return personDao.get(id);
	}

	@Override
	public List<Person> getPersons() {
		return personDao.getPersons();
	}

	@Override
	public void update(Person person) {
		personDao.update(person);
	}

	@Override
	public void delete(Long id) {
		personDao.delete(id);
	}

}
