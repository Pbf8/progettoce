package it.unisalento.myairbnb.dto;

import javax.persistence.Column;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import it.unisalento.myairbnb.validators.UserDTONameConstraint;

public class AdminDTO {

	
	int idadmin;
	   
	@NotEmpty
	String name;
	
	@NotEmpty
	String surname;
	  
    @Email(message = "Email should be valid")
    String email;
	  
	String pass;

	public int getIdadmin() {
		return idadmin;
	}

	public void setIdadmin(int idadmin) {
		this.idadmin = idadmin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
