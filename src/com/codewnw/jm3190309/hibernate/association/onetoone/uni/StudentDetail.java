package com.codewnw.jm3190309.hibernate.association.onetoone.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JM3190309_OTO_UNI_STUDENT_DETAIL")
public class StudentDetail {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "college_name")
	private String collegeName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public StudentDetail() {
		super();
	}

	public StudentDetail(String collegeName) {
		super();
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", collegeName=" + collegeName + "]";
	}

}
