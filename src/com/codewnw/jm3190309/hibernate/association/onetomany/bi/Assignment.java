package com.codewnw.jm3190309.hibernate.association.onetomany.bi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190309_OTM_BI_ASSIGNMENT")
public class Assignment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@JoinColumn(name = "COURSE_ID")
	@ManyToOne(cascade = CascadeType.ALL)
	private Course course;

	Long getId() {
		return id;
	}

	void setId(Long id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Course getCourse() {
		return course;
	}

	void setCourse(Course course) {
		this.course = course;
	}

	public Assignment() {
		super();
	}

	public Assignment(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Assignment [id=" + id + ", name=" + name + "]";
	}

}
