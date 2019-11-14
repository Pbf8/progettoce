package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Altro;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Booking;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.repositories.OtherRepository;
import it.unisalento.myairbnb.service.OtherService;

@Service
public class OtherSeviceImpl implements OtherService {
	
	@Autowired
	OtherRepository otherRepository;

	@Override
	public Altro saveOrUpdate(Altro other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public List<Altro> getAll() {
		// TODO Auto-generated method stub
		
		
		return otherRepository.findAll();
	}

	@Override
	public List<Altro> getByPrice(float price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Altro> getByPosition(float lat, float lon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> getAllSeller() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Altro> getByState(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Altro> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Booking> getAllBooking(Altro other) {
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
	public List<Altro> getByCategoryid(String name) {
		// TODO Auto-generated method stub
		return otherRepository.findByIdCategoriaUsingQuery(name);
	}

}
