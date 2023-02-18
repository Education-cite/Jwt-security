package com.security.jwt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	
	private String rollName;
	
	private String rollDescription;
	
	

	public Role() {

	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	public String getRollDescription() {
		return rollDescription;
	}

	public void setRollDescription(String rollDescription) {
		this.rollDescription = rollDescription;
	}

	public Role(String rollName, String rollDescription) {

		this.rollName = rollName;
		this.rollDescription = rollDescription;
	}

	
	

}
