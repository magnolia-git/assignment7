package com.meritamerica.assignment7.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7.models.AccountHolder;

/* Account Holder Repository
 * 
 * This is the repository for account holders.
 */

public interface AccountHolderRepo extends JpaRepository<AccountHolder, Long> {
	
}
