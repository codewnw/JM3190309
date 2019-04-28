package com.codewnw.jm3190309.hibernate.crud;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentUsingHQL {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from Student where rollNumber = " + 1001L);
			List<Student> students = (List<Student>)query.getResultList();
			Student student = students.get(0);
			System.out.println(student);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
