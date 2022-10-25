package com.squads.dto;

public class userDTO {
	// Declare Variables
    private String username;
    
    private String email;

    private String password;
    private String matchingPassword;
    
    
    // Getters and Setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMatchingPassword() {
		return matchingPassword;
	}
	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}
	
	
	// toString method
	@Override
	public String toString() {
		return "userDTO [username=" + username + ", email=" + email + ", password=" + password + ", matchingPassword="
				+ matchingPassword + "]";
	}
}