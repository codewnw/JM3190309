package com.codewnw.jm3190309.endtoend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codewnw.jm3190309.endtoend.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Person person) {
		sessionFactory.getCurrentSession().save(person);
	}

	@Override
	public Person get(Long id) {
		return sessionFactory.getCurrentSession().get(Person.class, id);
	}

	@Override
	public List<Person> getPersons() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Person");
		return query.getResultList();
	}

	@Override
	public void update(Person person) {
		sessionFactory.getCurrentSession().saveOrUpdate(person);
	}

	@Override
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Person person = session.get(Person.class, id);
		session.remove(person);
	}

}
