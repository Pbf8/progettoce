package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.ApartmentRepository;
import it.unisalento.myairbnb.repositories.CarRepository;
import it.unisalento.myairbnb.service.ApartmentService;

@Service
public class ApartmentServiceImpl implements ApartmentService {
	

	@Autowired
	ApartmentRepository apartmentRepository;  //iniezione repository

	
	@Override
	@Transactional
	public List<Apartment> getAll() {
		// TODO Auto-generated method stub
		return apartmentRepository.findAll(); // getall è gia implementata di default
		
	}


	@Override
	public Apartment saveOrUpdate(Apartment apartment) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Apartment> getByPrice(float price) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Apartment> getByPosition(float lat, float lon) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Apartment> getByState(int state) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Booking> getAllBooking(Apartment apartment) {
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


	@Override
	public List<Seller> getAllSeller() {
		// TODO Auto-generated method stub
		return apartmentRepository.findByIdsellerUsingQuery();
	}
	
	
	
}
