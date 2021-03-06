package com.codewnw.jm3190309.hibernate.id.identity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			
			Student student = new Student("Sibasish", "CSE", 10);
			Long rollNumber = (Long) session.save(student);
			System.out.println(rollNumber);
			
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
