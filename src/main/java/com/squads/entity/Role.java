package com.squads.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="authorities")
public class Role {
	@Id
	@Column(unique=true, name="username")
	private String username;
	
    @Column(name="authority")
	private String role = "ROLE_USER";
	
	// Set the constructors
	public Role() {
		
	}
	
	public Role(String username, String role) {
		this.username = username;
		this.role = "ROLE_USER";
	}

	// Getters and Setters
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = "ROLE_USER";
	}

	// toString method
	@Override
	public String toString() {
		return "User [username=" + username + ", role=" + role + "]";
	}	
}