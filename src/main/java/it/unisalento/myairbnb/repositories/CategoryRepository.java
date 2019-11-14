package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unisalento.myairbnb.entities.Altro;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Categoria;


public interface CategoryRepository extends JpaRepository<Categoria, Integer>  {
	
	public Categoria findByName(String name);
	
	

}