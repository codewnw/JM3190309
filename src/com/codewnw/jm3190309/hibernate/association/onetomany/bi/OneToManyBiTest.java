package com.codewnw.jm3190309.hibernate.association.onetomany.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codewnw.jm3190309.hibernate.association.onetomany.bi.Assignment;
import com.codewnw.jm3190309.hibernate.association.onetomany.bi.Course;

public class OneToManyBiTest {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Assignment.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();
			/*
			Course course = new Course("Java Frameworks");

			Assignment spring = new Assignment("Spring Assignement");
			Assignment hibernate = new Assignment("Hibernate Assignement");
			

			course.addAssignment(spring);
			course.addAssignment(hibernate);
			
			session.save(spring);
			*/
			
			/*
			 Assignment project = new Assignment("Project Assignement");
			Course course = session.get(Course.class, 1L);
			course.addAssignment(project);
			*/
			
			/*
			Assignment assignment = session.get(Assignment.class, 1L);
			System.out.println(assignment);
			System.out.println(assignment.getCourse());
			*/
			
			Assignment assignment = session.get(Assignment.class, 1L);
			session.remove(assignment);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
