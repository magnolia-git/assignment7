package com.meritamerica.assignment7.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Roles
 * 
 * 		This lets us give users a role, or more than one.
 * 
 * 		Basic getters and setters implemented here.
 * 
 */


@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	@Column
	private ValidRoles name;
	
	public Role() {
		
	}
	
	public Role(ValidRoles name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ValidRoles getName() {
		return name;
	}

	public void setName(ValidRoles name) {
		this.name = name;
	}
	
}
