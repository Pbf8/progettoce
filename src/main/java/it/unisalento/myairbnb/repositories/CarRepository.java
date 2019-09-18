 package it.unisalento.myairbnb.repositories;



import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Car;


@Repository
public interface CarRepository extends JpaRepository<Car, Integer> { // interfaccia Dao , primo campo è il nome della
	//classe entities il secondo il tipo della chiave primaria
	// il nome del metodo definisce la qury da effettuare
	
	
}
//scrive nel db