package com.codewnw.jm3190309.hibernate.association.onetoone.bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneBiStudent {

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
			
//			Student studentFromDB = session.get(Student.class, 1L);
//			session.remove(studentFromDB);
			
//			Student studentFromDB = session.get(Student.class, 1L);
//			System.out.println(studentFromDB);
			
			
//			From StudentDetail to Student
			
//			StudentDetail studentDetail = new StudentDetail("MIT");
//			Student student = new Student("John", studentDetail);
//			studentDetail.setStudent(student);
//			session.save(studentDetail);
			
//			StudentDetail studentDetailFromDb = session.get(StudentDetail.class, 2L);
//			System.out.println(studentDetailFromDb);
//			System.out.println(studentDetailFromDb.getStudent());
			
//			StudentDetail studentDetailFromDb = session.get(StudentDetail.class, 2L);
//			studentDetailFromDb.setCollegeName("Some University");;
//			studentDetailFromDb.getStudent().setName("Martin Fowler");
			
			StudentDetail studentDetailFromDb = session.get(StudentDetail.class, 2L);
			session.remove(studentDetailFromDb);



			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
	}

}
