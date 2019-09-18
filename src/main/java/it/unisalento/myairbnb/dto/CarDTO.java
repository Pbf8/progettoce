package it.unisalento.myairbnb.dto;

import java.io.File;

import javax.validation.constraints.NotEmpty;

public class CarDTO {

	
	
	
	int idcar;
	@NotEmpty
	String plate;
	@NotEmpty
	String description;
	float price;
	byte[] image;
	int seats;
	int state;
	
	SellerDTO seller;
	AdminDTO admin;
	
	
	
	
	public int getIdcar() {
		return idcar;
	}
	public void setIdcar(int idcar) {
		this.idcar = idcar;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
