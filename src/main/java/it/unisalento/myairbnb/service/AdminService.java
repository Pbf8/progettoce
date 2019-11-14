package it.unisalento.myairbnb.service;

import java.util.List;

import it.unisalento.myairbnb.entities.Admin;
import it.unisalento.myairbnb.entities.Apartment;

public interface AdminService {

	
public Admin saveOrUpdate(Admin admin);
	
	public Admin getAdminById(int id);  // metodi per avere diverse informaziono sull'appartamento in base a diversi input
	
}
