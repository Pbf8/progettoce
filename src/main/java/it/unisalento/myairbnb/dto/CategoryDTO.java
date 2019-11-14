package it.unisalento.myairbnb.dto;

import javax.validation.constraints.NotEmpty;

public class CategoryDTO {
	
	int idCategory;
	
	@NotEmpty
	String name;
	
	AdminDTO admin;

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AdminDTO getAdmin() {
		return admin;
	}

	public void setAdmin(AdminDTO admin) {
		this.admin = admin;
	}

}
