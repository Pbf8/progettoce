package it.unisalento.myairbnb.service;

import java.util.List;

import org.springframework.data.domain.Page;

import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Categoria;
import it.unisalento.myairbnb.entities.Experience;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;

public interface CategoryService {
	
	
	
	public Categoria saveOrUpdate(Categoria category);
	
	public List<Categoria> getAll();  // metodi per avere diverse informaziono sull'utente in base a diversi input
	
	public Categoria getAllByName(String name);
	
	public Boolean getCategoriaToDeleteByName(String name);
}
