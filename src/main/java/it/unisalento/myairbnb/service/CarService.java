package it.unisalento.myairbnb.service;





import java.util.List;

import org.springframework.data.domain.Page;

import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;

public interface CarService {  
	
	//  interfaccia , disaccoppia restcontroller da oggetti di persistenza
	// nei restcontroller compare dipendenz da interfaccia e non da servizio, per cui eventuali modifiche al servizio
	//non intaccano direttamente i restcontroller
	
	public Car saveOrUpdate(Car car);
	
	public List<Car> getAll();  // metodi per avere diverse informaziono sull'utente in base a diversi input
	
	
	
	public List<Car> getByPrice(float price); 	
	
	public List<Car> getBySeats(int  seats);    // metodi user
  
	
	public List<Car> getByState(int state); 	 // metodo admin
	
	public List<Booking> getAllBooking(); 	  // metodo seller

	


	
	
	
	public User getById(int id) throws UserNotFoundException;     // una get per id, univoco, se id non esiste lancia un eccezione
	
	public List<User> getByName(String name);
	
	public void delete(int id) throws UserNotFoundException;
	
	public List<User> getByNameAndSurname(String name, String surname);
	
	public Page<User> getAll(int page, int size);
	
	
}
