package it.unisalento.myairbnb.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.CarRepository;
import it.unisalento.myairbnb.repositories.UserRepository;
import it.unisalento.myairbnb.service.CarService;
import it.unisalento.myairbnb.service.UserService;

@Service     //specializzazione di component
public class CarServiceImpl implements CarService  {
	
	// deve implementare TUTTI i metodi dell'interfaccia
		@Autowired
		CarRepository carrepository;  //iniezione repository
	
		
		@Override
		@Transactional
		public List<Car> getAll() {
			// TODO Auto-generated method stub
			return carrepository.findAll(); // getall è gia implementata di default
			
		}


		@Override
		public Car saveOrUpdate(Car car) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Car> getByPrice(float price) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Car> getBySeats(int seats) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Car> getByState(int state) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<Booking> getAllBooking() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public User getById(int id) throws UserNotFoundException {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public List<User> getByName(String name) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public void delete(int id) throws UserNotFoundException {
			// TODO Auto-generated method stub
			
		}


		@Override
		public List<User> getByNameAndSurname(String name, String surname) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Page<User> getAll(int page, int size) {
			// TODO Auto-generated method stub
			return null;
		}


		

}
