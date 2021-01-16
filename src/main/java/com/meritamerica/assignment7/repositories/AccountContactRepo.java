package com.meritamerica.assignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7.models.AccountContact;

/* Account Contact Repository
 * 
 * 		This repository holds the account contact information.
 * 
 */

public interface AccountContactRepo extends JpaRepository<AccountContact, Long>{

}
