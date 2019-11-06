package it.unisalento.myairbnb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Integer>  {
	
	

}
