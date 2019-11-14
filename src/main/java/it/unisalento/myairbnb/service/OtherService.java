package it.unisalento.myairbnb.service;


import java.util.List;

import org.springframework.data.domain.Page;

import it.unisalento.myairbnb.entities.Altro;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;

public interface OtherService {  
	
	//  interfaccia , disaccoppia restcontroller da oggetti di persistenza
	// nei restcontroller compare dipendenz da interfaccia e non da servizio, per cui eventuali modifiche al servizio
	//non intaccano direttamente i restcontroller
	
	public Altro saveOrUpdate(Altro other);
	
	public List<Altro> getAll();  // metodi per avere diverse informaziono sull'appartamento in base a diversi input
	
	
	
	public List<Altro> getByPrice(float price); 	
	
	public List<Altro> getByPosition(float lat, float lon);   // metodi user
	
	
  
	public List<Seller> getAllSeller();

	public List<Altro> getByState(int state); 	 // metodo admin
	public List<Altro> getByCategory(String category);
	public List<Altro> getByCategoryid(String name);

	public List<Booking> getAllBooking(Altro other); 	  // metodo seller

	


	
	
	
	public User getById(int id) throws UserNotFoundException;     // una get per id, univoco, se id non esiste lancia un eccezione
	
	public List<User> getByName(String name);
	
	public void delete(int id) throws UserNotFoundException;
	
	public List<User> getByNameAndSurname(String name, String surname);
	
	public Page<User> getAll(int page, int size);
	
	
}
