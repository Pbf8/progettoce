package it.unisalento.myairbnb.service;


import java.util.List;

import org.springframework.data.domain.Page;

import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;

public interface ApartmentService {  
	
	//  interfaccia , disaccoppia restcontroller da oggetti di persistenza
	// nei restcontroller compare dipendenz da interfaccia e non da servizio, per cui eventuali modifiche al servizio
	//non intaccano direttamente i restcontroller
	
	public Apartment saveOrUpdate(Apartment apartment);
	
	public List<Apartment> getAll();  // metodi per avere diverse informaziono sull'appartamento in base a diversi input
	
	
	
	public List<Apartment> getByPrice(float price); 	
	
	public List<Apartment> getByPosition(float lat, float lon);   // metodi user
	
	
  
	public List<Seller> getAllSeller();

	public List<Apartment> getByState(int state); 	 // metodo admin
	
	public List<Booking> getAllBooking(Apartment apartment); 	  // metodo seller

	


	
	
	
	public User getById(int id) throws UserNotFoundException;     // una get per id, univoco, se id non esiste lancia un eccezione
	
	public List<User> getByName(String name);
	
	public void delete(int id) throws UserNotFoundException;
	
	public List<User> getByNameAndSurname(String name, String surname);
	
	public Page<User> getAll(int page, int size);
	
	
}
