package com.codewnw.jm3190309.hibernate.association.manytomany.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JM3190309_MTM_UNI_ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

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

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", name=" + name + "]";
	}

}
