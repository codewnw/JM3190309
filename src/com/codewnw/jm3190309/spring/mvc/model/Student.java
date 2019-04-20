package com.codewnw.jm3190309.spring.mvc.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.codewnw.jm3190309.spring.mvc.validation.RegistrationCode;

public class Student {

	@Size(min = 2, max = 10, message = " first name shoul have at least 2 and max 10 charcters")
	@NotNull(message = " is mandatory")
	private String firstName;

	@NotNull
	@Size(min = 2, max = 10)
	private String lastName;

	@Past(message = " Date of Birth should be in past")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date dob;

	@Future(message = " Course cannot start in past")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private Date courseStartDate;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	@NotNull
	@RegistrationCode(prefix = "CODE", message = " should start with code")
	@Pattern(regexp = "^[a-zA-Z0-9]{9}", message = " must have combination of 9 lower/upper character and digits")
	private String regCode;

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	@Min(value = 4, message = " go and play your age is less than 4")
	@Max(value = 60, message = " you are too old")
	private int age;

	private String gender;

	private String country = "SCT";

	private String[] courses;

	private boolean graduate;

	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean isGraduate() {
		return graduate;
	}

	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
