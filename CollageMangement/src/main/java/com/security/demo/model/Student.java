package com.security.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer roll;
	private String name;
	private String division;
	private String year;
	private String username;
	private String pasword;
	private String email;
	private Float marks;
	private String role;
	private String mob;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer roll, String name, String division, String year, String username, String pasword,
			String email, Float marks, String role, String mob) {
		super();
		this.roll = roll;
		this.name = name;
		this.division = division;
		this.year = year;
		this.username = username;
		this.pasword = pasword;
		this.email = email;
		this.marks = marks;
		this.role = role;
		this.mob = mob;
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the pasword
	 */
	public String getPasword() {
		return pasword;
	}
	/**
	 * @param pasword the pasword to set
	 */
	public void setPasword(String pasword) {
		this.pasword = pasword;
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
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
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
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", division=" + division + ", year=" + year + ", username="
				+ username + ", pasword=" + pasword + ", email=" + email + ", marks=" + marks + ", role=" + role
				+ ", mob=" + mob + "]";
	}
	
	
	
	

}
