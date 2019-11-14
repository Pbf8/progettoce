package it.unisalento.myairbnb.restcontrollers;

import static org.assertj.core.api.Assertions.setAllowComparingPrivateFields;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.io.Console;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.hibernate.engine.query.spi.sql.NativeSQLQueryCollectionReturn;
import org.jboss.logging.Param;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.unisalento.myairbnb.dto.AdminDTO;
import it.unisalento.myairbnb.dto.AltroDTO;
import it.unisalento.myairbnb.dto.ApartmentDTO;
import it.unisalento.myairbnb.dto.CarDTO;
import it.unisalento.myairbnb.dto.CategoryDTO;
import it.unisalento.myairbnb.dto.SellerDTO;
import it.unisalento.myairbnb.dto.UserDTO;
import it.unisalento.myairbnb.dto.experienceDTO;
import it.unisalento.myairbnb.entities.Admin;
import it.unisalento.myairbnb.entities.Altro;
import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Categoria;
import it.unisalento.myairbnb.entities.Experience;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;
import it.unisalento.myairbnb.exceptions.UserNotFoundException;
import it.unisalento.myairbnb.service.AdminService;
import it.unisalento.myairbnb.service.ApartmentService;
import it.unisalento.myairbnb.service.CarService;
import it.unisalento.myairbnb.service.CategoryService;
import it.unisalento.myairbnb.service.ExperienceService;
import it.unisalento.myairbnb.service.OtherService;
import it.unisalento.myairbnb.serviceimpl.categoryServiceImpl;
import javassist.expr.NewArray;
import net.bytebuddy.asm.Advice.This;

@RestController
@RequestMapping("/admin")


public class AdminRestController {

	@Autowired
	CarService carService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ApartmentService apartmentService;
	
	@Autowired
	ExperienceService experienceService;
	
	@Autowired
	OtherService otherService;
	
	@Autowired
	AdminService adminService;

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
	
	@GetMapping(value= "/getAllOther", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<AltroDTO> getAllOther(){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		List<Altro> list = otherService.getAll();
		List<AltroDTO> dtoList = new ArrayList<AltroDTO>();
		
		for (Altro other : list) {
			
			AltroDTO otherDTO= new AltroDTO();
			
			otherDTO.setIdaltro(other.getIdaltro());
			otherDTO.setName(other.getName());
			otherDTO.setDescription(other.getDescription());			
			otherDTO.setPrice(other.getPrice());
			
			otherDTO.setImage(other.getPicture());
			
			otherDTO.setState(other.getState());
			otherDTO.setLat(other.getLat());
			otherDTO.setLon(other.getLon());
			
			dtoList.add(otherDTO);
			
		}
		
		return dtoList;
	}
	

	@GetMapping(value= "/getAllCategory", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<CategoryDTO> getAllCategory(){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		List<Categoria> list = categoryService.getAll();
		List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();
		
		for (Categoria category : list) {
			CategoryDTO categoryDTO= new CategoryDTO();
			categoryDTO.setIdCategory(category.getIdcategoria());
			categoryDTO.setName(category.getName());
			dtoList.add(categoryDTO);
			
		}
		
		return dtoList;
	}
	
	@GetMapping(value= "/getAllCategoryByName/{name}", produces = MediaType.APPLICATION_JSON_VALUE )
	
	public List<CategoryDTO> getAllCategoryByName(@PathVariable String name){ //ritorna tutte le car (una lista)
		 
		
		
		
		// niente più dati moke
		
		List<Categoria> list = (List<Categoria>) categoryService.getAllByName(name);
		List<CategoryDTO> dtoList = new ArrayList<CategoryDTO>();
		
		for (Categoria category : list) {
			CategoryDTO categoryDTO= new CategoryDTO();
			categoryDTO.setIdCategory(category.getIdcategoria());
			categoryDTO.setName(category.getName());
			dtoList.add(categoryDTO);
			
		}
		
		return dtoList;
	}
	
	
	
	@GetMapping(value= "/getAllOtherByCategory/{name}", produces = MediaType.APPLICATION_JSON_VALUE )
	public List<AltroDTO> getAllOtherByCategory(@PathVariable String name ){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		
		List<Altro> list = otherService.getByCategoryid(name);
		List<AltroDTO> dtoList = new ArrayList<AltroDTO>();
		
		for (Altro other : list) {
			
			AltroDTO otherDTO= new AltroDTO();
			
			otherDTO.setIdaltro(other.getIdaltro());
			otherDTO.setName(other.getName());
			otherDTO.setDescription(other.getDescription());			
			otherDTO.setPrice(other.getPrice());
			
			otherDTO.setImage(other.getPicture());
			
			otherDTO.setState(other.getState());
			otherDTO.setLat(other.getLat());
			otherDTO.setLon(other.getLon());
			
			dtoList.add(otherDTO);
			
		}
		
		return dtoList;
			
		
		
	}
	
	@PostMapping(value="/save", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE) 
	//consumes si usa per il post , specifica il formato dati inviato dall'utente
	
	
	
	public Categoria post(@RequestBody @Valid CategoryDTO categoryDTO) {  
		
		//oggetto contenuto nel body convertilo in oggetto java
		//@valid permette di specificare validation definiti in DTO
		
		 // l'id viene restituito dal sistema e non dall'utente
		Categoria category = new Categoria();
		Set <Categoria> categoria = new HashSet<>();
		
		
		
		//int id= admin.getIdadmin();
		//category.setAdmin(admin);
		
		category.setName(categoryDTO.getName());
		//categoria.add(category);
		
		

		
		
		
		
		System.out.println(categoryDTO.getName());
		//categoryService.saveOrUpdate(category);    
			
		//
		
		return categoryService.saveOrUpdate(category);
		
			
	}
	
	@GetMapping(value= "/getAdmin", produces = MediaType.APPLICATION_JSON_VALUE )
	public Admin getAdmin(){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		Admin admin = adminService.getAdminById(1);		
		
		
		return admin;
	}
	
	
	@PutMapping(value="/ApproveApartment", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE) 
	//consumes si usa per il post , specifica il formato dati inviato dall'utente
	
	
	public Apartment postApproveApartment(@RequestBody @Valid ApartmentDTO apartmentDTO) throws UserNotFoundException  {  
		
		
		if (apartmentDTO.getIdapartment() != 0) {
			
				Apartment apartment1 = new Apartment();
				//apartment1 = getApartment(apartmentDTO.getIdapartment());
		
		 
				int state=1;
				//apartment1.setState(state);
				//category.setName(categoryDTO.getName());
				
		
				//System.out.println(apartment1.getState());
				//System.out.println(apartment1.getDescription());
		
				apartment1= apartmentService.saveOrUpdateById(apartmentDTO.getIdapartment());    
			
				return apartmentService.saveOrUpdateById(apartmentDTO.getIdapartment());    
		
		}
	else
		{
			throw new UserNotFoundException();
		}
		
		
	}
	
	@GetMapping(value= "/getApartment", produces = MediaType.APPLICATION_JSON_VALUE )
	public Apartment getApartment(int id){ //ritorna tutte le car (una lista)
		 
		
		// niente più dati moke
		Apartment apartment = apartmentService.getApartmentById(id);
		System.out.println(apartment);
		
		return apartment;
	}
	
	@PutMapping(value="/approveApartment", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE) 
    
    public int post(@RequestBody @Valid ApartmentDTO apartmentDTO) {  
        
        Apartment apartment = new Apartment();
        
        Integer id= (apartmentDTO.getIdapartment());
        //System.out.println("IIIIIIIIIIIIIIIIIIIIIDDDDDDDDDDDDDDAPARTMENT= "+ id);
        
        apartment.setName(apartment.getName());
        apartment.setAdmin(apartment.getAdmin());
        apartment.setBooking(apartment.getBooking());
        apartment.setDescription(apartment.getDescription());
        apartment.setFeedback(apartment.getFeedback());
        apartment.setIdapartment(apartment.getIdapartment());
        apartment.setLat(apartment.getLat());
        apartment.setLon(apartment.getLon());
        apartment.setPicture(apartment.getPicture());
        apartment.setPrice(apartment.getPrice());
        apartment.setSeller(apartment.getSeller());
        apartment.setState(1);
        
        //apartmentService.approveApartment(Integer apartment.setIdapartment(apartmentDTO.getIdapartment()));    
        return  apartmentService.approveApartment(id);
        
            
    }
	
	
	@DeleteMapping(value="/deleteCategory/{category}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	//consumes si usa per il post , specifica il formato dati inviato dall'utente
	
	
	public Boolean deleteCategory(@PathVariable("category") String name) throws UserNotFoundException  {  
		
		
		Categoria category = new Categoria();
	System.out.println(name);

		
		return categoryService.getCategoriaToDeleteByName(name);
	}
	
	@DeleteMapping(value="/deleteApartment/{idapartment}",  consumes = MediaType.APPLICATION_JSON_VALUE,    produces = MediaType.APPLICATION_JSON_VALUE) 

    public int deleteApartment(@PathVariable int idapartment) {    
        
        
       System.out.println("IIIIIIIIIIIIIIIIIIIIIDDDDDDDDDDDDDDAPARTMENT= "+ idapartment);        
        return apartmentService.deleteApartment(idapartment);
        

    }

	
}
