package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Experience;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.CarRepository;
import it.unisalento.myairbnb.repositories.ExperienceRepository;
import it.unisalento.myairbnb.service.ExperienceService;

@Service
public class ExperienceServiceImpl implements ExperienceService{
	
	@Autowired
	ExperienceRepository experienceRepository;  //iniezione repository


	@Override
	public Experience saveOrUpdate(Experience experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getAll() {
		// TODO Auto-generated method stub
		return experienceRepository.findAll();
		
	}

	@Override
	public List<Experience> getByPrice(float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getBySeats(int seats) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Experience> getByState(int state) {
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
