package it.unisalento.myairbnb.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.unisalento.myairbnb.entities.Admin;


@Repository
public interface AdminRpository extends JpaRepository<Admin, Integer> { // interfaccia Dao , primo campo è il nome della
	//classe entities il secondo il tipo della chiave primaria
	// il nome del metodo definisce la qury da effettuare
	
	
	
	public Admin findByIdadmin(int id);
}
	
