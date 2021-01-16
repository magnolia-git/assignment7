package com.meritamerica.assignment7.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meritamerica.assignment7.models.User;

/* User Repository
 * 		This repository holds the users.
 * 
 */

public interface UserRepo extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
	boolean existsByUsername(String username);
}
