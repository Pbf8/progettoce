package it.unisalento.myairbnb.restcontrollers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.CarDTO;
import it.unisalento.myairbnb.dto.UserDTO;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.service.CarService;

@RestController
@RequestMapping("/admin")


public class AdminRestController {

	@Autowired
	CarService carService;

	
	
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
	

	
	
}
