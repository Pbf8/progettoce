package it.unisalento.myairbnb.dto;

import javax.validation.constraints.NotEmpty;

public class AltroDTO {
	

	
	int idaltro;
	@NotEmpty
	String name;
	@NotEmpty
	String description;
	float price;
	byte[] image;
	float lat;
	float Lon;
	CategoryDTO categoryDTO;
	
	
	public CategoryDTO getCategoryDTO() {
		return categoryDTO;
	}
	public void setCategoryDTO(CategoryDTO categoryDTO) {
		this.categoryDTO = categoryDTO;
	}
	public int getIdaltro() {
		return idaltro;
	}
	public void setIdaltro(int idaltro) {
		this.idaltro = idaltro;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
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
	float lon;
	int state;
	
	
	SellerDTO seller;
	AdminDTO admin;

}
