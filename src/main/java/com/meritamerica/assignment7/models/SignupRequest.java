package com.meritamerica.assignment7.models;

import java.util.Set;

import javax.validation.constraints.*;

/* Sign-up request class
 * 
 * 		This holds the username, password, role, and active values when creating an account.
 */

public class SignupRequest {
    @NotBlank
    @Size(min = 3, max = 20)
    private String username;
  
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
    
    private boolean active;
  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}