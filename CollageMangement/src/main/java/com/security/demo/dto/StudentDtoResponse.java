package com.security.demo.dto;

import com.security.demo.model.Student;

public class StudentDtoResponse {
	private Integer roll;
	private String name;
	private String division;
	private String year;

	private String email;
	private Float marks;
	private String mob;

	

	@Override
	public String toString() {
		return "StudentDtoResponse [roll=" + roll + ", name=" + name + ", division=" + division + ", year=" + year
				+ ", email=" + email + ", marks=" + marks + ", mob=" + mob + "]";
	}



	/**
	 * @return the roll
	 */
	public Integer getRoll() {
		return roll;
	}



	/**
	 * @param roll the roll to set
	 */
	public void setRoll(Integer roll) {
		this.roll = roll;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}



	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	}



	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}



	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	/**
	 * @return the marks
	 */
	public Float getMarks() {
		return marks;
	}



	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Float marks) {
		this.marks = marks;
	}



	/**
	 * @return the mob
	 */
	public String getMob() {
		return mob;
	}



	/**
	 * @param mob the mob to set
	 */
	public void setMob(String mob) {
		this.mob = mob;
	}



	public StudentDtoResponse(Integer roll, String name, String division, String year, String email, Float marks,
			String mob) {
		super();
		this.roll = roll;
		this.name = name;
		this.division = division;
		this.year = year;
		this.email = email;
		this.marks = marks;
		this.mob = mob;
	}



	public StudentDtoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static StudentDtoResponse toStudent(Student s) {
		StudentDtoResponse temp = new StudentDtoResponse();
		temp.setRoll(s.getRoll());
		temp.setName(s.getName());
		temp.setDivision(s.getDivision());
		temp.setYear(s.getYear());

		temp.setEmail(s.getEmail());
		temp.setMarks(s.getMarks());
		temp.setMob(s.getMob());

		return temp;
	}

}
