package it.unisalento.myairbnb.restcontrollers;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.ApartmentDTO;
import it.unisalento.myairbnb.dto.CarDTO;
import it.unisalento.myairbnb.dto.SellerDTO;
import it.unisalento.myairbnb.dto.UserDTO;
import it.unisalento.myairbnb.dto.experienceDTO;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Experience;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.service.ApartmentService;
import it.unisalento.myairbnb.service.CarService;
import it.unisalento.myairbnb.service.ExperienceService;

@RestController
@RequestMapping("/admin")


public class AdminRestController {

	@Autowired
	CarService carService;
	
	@Autowired
	ApartmentService apartmentService;
	
	@Autowired
	ExperienceService experienceService;

	List<SellerDTO> dtoSellerList = new ArrayList<SellerDTO>();

	
	@GetMapping(value= "/getAllCar", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<CarDTO> getAllCar(){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		List<Car> list = carService.getAll();
		List<CarDTO> dtoList = new ArrayList<CarDTO>();
		
		for (Car car : list) {
			CarDTO carDTO= new CarDTO();
			carDTO.setIdcar(car.getIdcar());
			carDTO.setPlate(car.getPlate());
			
			carDTO.setDescription(car.getDescription());			
			carDTO.setPrice(car.getPrice());
			
			carDTO.setImage(car.getPicture());
			carDTO.setSeats(car.getSeats());
			carDTO.setState(car.getState());
			
			dtoList.add(carDTO);
			
		}
		
		return dtoList;
	}
	
	
	
	@GetMapping(value= "/getAllApartment", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<ApartmentDTO> getAllApartment(){ //ritorna tutte le car (una lista)
		 
		dtoSellerList = getAllSeller();
		// niente più dati moke
		List<Apartment> list = apartmentService.getAll();
		List<ApartmentDTO> dtoList = new ArrayList<ApartmentDTO>();
		int i=0;
		for (Apartment apartment : list) {
			
			
			SellerDTO sellerDTO = new SellerDTO();
			sellerDTO =(dtoSellerList.get(i));
			//sellerDTO.setSurname(apartment.getSurname());

			ApartmentDTO apartmentDTO = new ApartmentDTO();

			apartmentDTO.setIdapartment(apartment.getIdapartment());
			apartmentDTO.setDescription(apartment.getDescription());
			apartmentDTO.setPrice(apartment.getPrice());
			apartmentDTO.setLat(apartment.getLat());
			apartmentDTO.setLon(apartment.getLon());
			apartmentDTO.setPicture(apartment.getPicture());
			apartmentDTO.setState(apartment.getState());
			apartmentDTO.setSeller(sellerDTO);
			dtoList.add(apartmentDTO);
			i=i+1;
			
		}
		
		return dtoList;
	}
	
	
	@GetMapping(value= "/getAllApartmentNotApproved", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<ApartmentDTO> getAllApartmentNotApproved(){ //ritorna tutte le car (una lista)
		 
		dtoSellerList = getAllSeller();
		// niente più dati moke
		List<Apartment> list = apartmentService.getByState(0);
		List<ApartmentDTO> dtoList = new ArrayList<ApartmentDTO>();
		int i=0;
		for (Apartment apartment : list) {
			
			
			SellerDTO sellerDTO = new SellerDTO();
			sellerDTO =(dtoSellerList.get(i));
			//sellerDTO.setSurname(apartment.getSurname());

			ApartmentDTO apartmentDTO = new ApartmentDTO();

			apartmentDTO.setIdapartment(apartment.getIdapartment());
			apartmentDTO.setDescription(apartment.getDescription());
			apartmentDTO.setPrice(apartment.getPrice());
			apartmentDTO.setLat(apartment.getLat());
			apartmentDTO.setLon(apartment.getLon());
			apartmentDTO.setPicture(apartment.getPicture());
			apartmentDTO.setState(apartment.getState());
			apartmentDTO.setSeller(sellerDTO);
			dtoList.add(apartmentDTO);
			i=i+1;
			
		}
		
		return dtoList;
	}
	
	
	
	
	@GetMapping(value= "/getAllSeller", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<SellerDTO> getAllSeller(){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		List<Seller> list = apartmentService.getAllSeller();
		
		for (Seller seller: list) {
			SellerDTO sellerDTO = new SellerDTO();
			sellerDTO.setIdseller(seller.getIdseller());
			sellerDTO.setName(seller.getName());
			sellerDTO.setSurname(seller.getSurname());

			
			dtoSellerList.add(sellerDTO);
			
		}
		
		return dtoSellerList;
	}
	
	@GetMapping(value= "/getAllExperience", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<experienceDTO> getAllExperience(){ //ritorna tutte le experience (una lista)
		 
		
		// niente più dati moke
		List<Experience> list = experienceService.getAll();
		List<experienceDTO> dtoList = new ArrayList<experienceDTO>();
		
		for (Experience experience : list) {
			experienceDTO experienceDTO= new experienceDTO();
			
			experienceDTO.setIdexperience(experience.getIdexperience());
			experienceDTO.setDescription(experience.getDescription());
			experienceDTO.setPrice(experience.getPrice());
		
			experienceDTO.setPicture(experience.getPicture());
			
			experienceDTO.setState(experience.getState());
			
			dtoList.add(experienceDTO);
			
		}
		
		return dtoList;
	}
	
	
	
	
	
	
	

	
}
