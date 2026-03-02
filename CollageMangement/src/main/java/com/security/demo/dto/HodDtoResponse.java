package com.security.demo.dto;

import com.security.demo.model.HoD;

public class HodDtoResponse {
	private Integer id;
	private String name;
	private Float exp;

	
	private String email;
	private String dept;

	private String mob;



	@Override
	public String toString() {
		return "HodDtoResponse [id=" + id + ", name=" + name + ", exp=" + exp + ", email=" + email + ", dept=" + dept
				+ ", mob=" + mob + "]";
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



	public HodDtoResponse(Integer id, String name, Float exp, String email, String dept, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.email = email;
		this.dept = dept;
		this.mob = mob;
	}



	public HodDtoResponse() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static HodDtoResponse toDto(HoD h) {
		HodDtoResponse temp = new HodDtoResponse();
		temp.setId(h.getId());
		temp.setName(h.getName());
		temp.setExp(h.getExp());
		
		temp.setEmail(h.getEmail());
		temp.setDept(h.getDept());
		temp.setMob(h.getMob());

		return temp;

	}

}
