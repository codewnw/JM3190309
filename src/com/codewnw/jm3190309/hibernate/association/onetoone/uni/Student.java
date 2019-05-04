package com.codewnw.jm3190309.hibernate.association.onetoone.uni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190309_OTO_UNI_STUDENT")
public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@JoinColumn(name = "STUDENT_DETAIL_ID")
	@OneToOne(cascade = CascadeType.ALL)
	private StudentDetail studentDetail;

	public Student(String name, StudentDetail studentDetail) {
		super();
		this.name = name;
		this.studentDetail = studentDetail;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", studentDetail=" + studentDetail + "]";
	}

	public Student() {
		super();
	}
}
