package com.codewnw.jm3190309.hibernate.id.table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "JM3190309_ID_TABLE_STUDENT")
public class Student {

	@Id
	@TableGenerator(name = "rollNumber", allocationSize = 1, schema = "PUBLIC", pkColumnName = "SEQ_NAME", pkColumnValue = "JM3190309_ID_TABLE_STUDENT_SEQUENCE", valueColumnName = "NEXT_VAL", table = "JM3190309_ID_TABLE_ALL_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "rollNumber")
	@Column(name = "ROLL_NUMBER")
	private Long rollNumber;

	@Column(name = "NAME")
	private String name;

	@Column(name = "COURSE")
	private String course;

	@Column(name = "AGE")
	private int age;

	public Long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + ", age=" + age + "]";
	}

	public Student() {
	}

	public Student(String name, String course, int age) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
	}

}
