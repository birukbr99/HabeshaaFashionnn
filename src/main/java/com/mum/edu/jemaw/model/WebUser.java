package com.mum.edu.jemaw.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WebUser {
    @Id
    private int id;
	
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
