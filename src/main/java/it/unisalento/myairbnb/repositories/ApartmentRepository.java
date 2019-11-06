 package it.unisalento.myairbnb.repositories;



import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Apartment;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;


@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> { // interfaccia Dao , primo campo è il nome della
	//classe entities il secondo il tipo della chiave primaria
	// il nome del metodo definisce la qury da effettuare
	
	@Query("select s from seller s inner join s.apartment a ") //Jquery
	public List<Seller> findByIdsellerUsingQuery();
	
	
	public List<Apartment> findByState(int state)	;
	
//public List<Apartment> findByState (short state); // possiamo anche ordinare i risultati
	
	//@Query("select a from Apartment a where a.state=: state")   //se vogliamo usare una certa query personalizzata
	//public List<Apartment> findByStateUsingQuery(@Param("state") int state);  // il nome della query deve essere il parametro di questa funzione
}
//scrive nel db