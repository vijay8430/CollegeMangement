package com.security.demo.dto;

import com.security.demo.model.Teacher;

public class TeacherDtoResponse {
	private Integer id;
	private String name;
	private String email;
	private String mob;

	@Override
	public String toString() {
		return "TeacherDtoResponse [id=" + id + ", name=" + name + ", email=" + email + ", mob=" + mob + "]";
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

	public TeacherDtoResponse(Integer id, String name, String email, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}

	public TeacherDtoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static TeacherDtoResponse toDto(Teacher t) {
		TeacherDtoResponse temp = new TeacherDtoResponse();
		temp.setId(t.getId());
		temp.setName(t.getName());

		temp.setEmail(t.getEmail());
		temp.setMob(t.getMob());

		return temp;

	}

}
