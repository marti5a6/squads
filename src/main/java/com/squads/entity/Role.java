package com.squads.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Role Entity is used for user role management.
* Interacts with 'authorities' table in the database.
* @author <<Insert author>>
*/
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
	
/**
* Constructor for the Role class
* @param username - The username created by the user.
* @param role - Roles assigned to the user. (Default: "ROLE_USER")
* @return None
*/
	public Role(String username, String role) {
		this.username = username;
		this.role = "ROLE_USER";
	}

	// Getters and Setters
/**
* Returns the username for the current user object during runtime.
* @return [String] : Username of the current user.
*/
	public String getUsername() {
		return username;
	}

/**
* Sets the username for the current user object during runtime.
* @param username - Username to be assigned.
*/
	public void setUsername(String username) {
		this.username = username;
	}

/**
* Returns the role for the current user object during runtime.
* @return [String] : Username of the current user.
*/
    public String getRole() {
		return role;
	}

/**
* Sets the role for a user object.
* @param role - Role to be assigned to the user.
*/

	public void setRole(String role) {
		this.role = "ROLE_USER";
	}

	// toString method

/**
* Returns the details of the user object.
* @return [String] : Formatted as [username=$Username, role=$role]
*/
	@Override
	public String toString() {
		return "User [username=" + username + ", role=" + role + "]";
	}	
}