package com.codewnw.jm3190309.hibernate.association.onetoone.uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniStudent {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(StudentDetail.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

//			StudentDetail studentDetail = new StudentDetail("IIT");
//			Student student = new Student("Sibasish", studentDetail);
//			Long id = (Long) session.save(student);
//			System.out.println(id);
			
//			Student studentFromDB = session.get(Student.class, 1L);
//			studentFromDB.setName("Alok");
//			studentFromDB.getStudentDetail().setCollegeName("IIT K");
//			System.out.println(studentFromDB);
			
			Student studentFromDB = session.get(Student.class, 1L);
			session.remove(studentFromDB);
			
//			Student studentFromDB = session.get(Student.class, 1L);
//			System.out.println(studentFromDB);

			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
