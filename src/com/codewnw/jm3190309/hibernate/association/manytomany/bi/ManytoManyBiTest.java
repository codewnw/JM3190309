package com.codewnw.jm3190309.hibernate.association.manytomany.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManytoManyBiTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class).addAnnotatedClass(Address.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			Person p1 = new Person("P1");
			Person p2 = new Person("P2");

			Address ad1 = new Address("Ad1");
			Address ad2 = new Address("Ad2");
			Address ad3 = new Address("Ad3");
			
			p1.addAddress(ad1);
			p1.addAddress(ad2);
			p2.addAddress(ad2);
			p2.addAddress(ad3);
			
			session.save(ad1);
			session.save(ad2);
			
			
			/*
			Address ad4 = new Address("Ad1");
			session.save(ad4);

			
			*/
			/*
			Person p2 = session.get(Person.class, 2L);
			Address ad4 = session.get(Address.class, 4L);
			p2.getAddress().add(ad4);
			*/
			
			/*Person p1 = session.get(Person.class, 1L);
			session.remove(p1);*/
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
