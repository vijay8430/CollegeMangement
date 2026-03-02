package com.security.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HoD {
	@Id
	private Integer id;
	private String name;
	private Float exp;
	private String username;
	private String password;
	private String email;
	private String dept;
	private String role;
	private String mob;

	public HoD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoD(Integer id, String name, Float exp, String username, String password, String email, String dept,
			String role, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dept = dept;
		this.role = role;
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
	 * @return the exp
	 */
	public Float getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(Float exp) {
		this.exp = exp;
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
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
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
		return "HoD [id=" + id + ", name=" + name + ", exp=" + exp + ", username=" + username + ", password=" + password
				+ ", email=" + email + ", dept=" + dept + ", role=" + role + ", mob=" + mob + "]";
	}

}
