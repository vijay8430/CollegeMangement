package com.security.demo.dto;

import com.security.demo.model.HoD;

public class HodDtoRequest {
	private Integer id;
	private String name;
	private Float exp;

	private String password;
	private String email;
	private String dept;

	private String mob;

	public HodDtoRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HodDtoRequest(Integer id, String name, Float exp, String password, String email, String dept, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.password = password;
		this.email = email;
		this.dept = dept;
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
		return "HodDtoRequest [id=" + id + ", name=" + name + ", exp=" + exp + ", password=" + password + ", email="
				+ email + ", dept=" + dept + ", mob=" + mob + "]";
	}

	public static HoD toEntity(HodDtoRequest h) {
		HoD temp = new HoD();
		temp.setId(h.getId());
		temp.setName(h.getName());
		temp.setExp(h.getExp());
		temp.setPassword(h.getPassword());
		temp.setEmail(h.getEmail());
		temp.setDept(h.getDept());
		temp.setMob(h.getMob());
		temp.setRole("HOD");
		temp.setUsername(h.getName() + h.getId());
		return temp;

	}

}
