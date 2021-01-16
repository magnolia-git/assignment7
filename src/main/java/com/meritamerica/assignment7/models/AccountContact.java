package com.meritamerica.assignment7.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* Account Contact Information
 * 
 * 		This will hold contact information for the user accounts.
 * 		It holds an id and phone number.
 * 
 * 		Basic getters and setters have been implemented here.
 * 
 */

@Entity
@Table(name = "AccountContact")
public class AccountContact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_contact_id")
	long id;
	int phone;
	
	public AccountContact() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

}
