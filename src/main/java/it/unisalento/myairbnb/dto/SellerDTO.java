package it.unisalento.myairbnb.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;


import it.unisalento.myairbnb.validators.UserDTONameConstraint;

public class SellerDTO {
	
	
	
	int idseller;
	

	@NotEmpty
    String name;
   
	@NotEmpty
    String surname;
   
    @Email(message = "Email should be valid")
    String email;
    
    String pass;
    
    String username;
    
    public int getIdseller() {
		return idseller;
	}

	public void setIdseller(int idseller) {
		this.idseller = idseller;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	

}


