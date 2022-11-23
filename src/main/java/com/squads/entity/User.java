package com.squads.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@Column(unique=true, name="username")
	private String username;
	
    @Column(name="password")
	private String password;

	@Column(name="enabled")
	private Boolean enabled = true;
	
	// Set the constructors
	public User() {
		
	}
	
	public User(String username, String password, Boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = true;
	}

	// Getters and Setters
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEmail(Boolean enabled) {
		this.enabled = true;
	}

	// toString method
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
	}	
}