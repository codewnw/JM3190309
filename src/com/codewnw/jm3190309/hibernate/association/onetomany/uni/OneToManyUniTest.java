package com.codewnw.jm3190309.hibernate.association.onetomany.uni;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToManyUniTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Course.class).addAnnotatedClass(Assignment.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			Assignment spring = new Assignment("Spring Assignement");
//			Assignment hibernate = new Assignment("Hibernate Assignement");
//			Assignment project = new Assignment("Project Assignement");
//			
//			List<Assignment> assignments = new ArrayList<>();
//			assignments.add(spring);
//			assignments.add(hibernate);
//			assignments.add(project);
//			
//			Course javaFrameworks = new Course("Java Frameworks", assignments);
//			
//			session.save(javaFrameworks);

//			Course course = session.get(Course.class, 1L);
//			System.out.println(course);
			
//			Course course = session.get(Course.class, 1L);
//			course.setName("Popular Java Frameworks");
//			course.getAssignments().get(0).setName("Spring IoC Assignment");
			
			Course course = session.get(Course.class, 1L);
			session.remove(course);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
