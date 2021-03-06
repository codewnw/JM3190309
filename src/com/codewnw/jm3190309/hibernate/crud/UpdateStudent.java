package com.codewnw.jm3190309.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			Student student = session.get(Student.class, 1001L);
			student.setName("Sibasish");
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
