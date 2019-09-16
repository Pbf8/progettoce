package it.unisalento.myairbnb.dto;

import javax.persistence.Column;

public class FeedbackDTO {

	
	int idfeedback;
   
	String text;
	
	SellerDTO seller;
	AdminDTO admin;
	UserDTO user;
	

	public int getIdfeedback() {
		return idfeedback;
	}

	public void setIdfeedback(int idfeedback) {
		this.idfeedback = idfeedback;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}

	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	
	
}
