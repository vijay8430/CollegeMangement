package com.security.demo.dto;

import com.security.demo.model.Teacher;

public class TeacherDtoRequset {
	private Integer id;
	private String name;

	private String password;
	private String email;
	private String mob;

	public TeacherDtoRequset() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TeacherDtoRequset(Integer id, String name, String password, String email, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.mob = mob;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
		return "TeacherDtoRequset [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", mob=" + mob + "]";
	}

	public static Teacher toEntity(TeacherDtoRequset t) {
		Teacher temp = new Teacher();
		temp.setId(t.getId());
		temp.setName(t.getName());
		temp.setPassword(t.getPassword());
		temp.setEmail(t.getEmail());
		temp.setMob(t.getMob());
		temp.setRole("Teacher");
		temp.setUsername(t.getName() + t.getId());
		return temp;

	}

}
