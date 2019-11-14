package it.unisalento.myairbnb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import it.unisalento.myairbnb.entities.Altro;
import it.unisalento.myairbnb.entities.Car;
import it.unisalento.myairbnb.entities.Categoria;
import it.unisalento.myairbnb.entities.Seller;
import it.unisalento.myairbnb.entities.User;


public interface OtherRepository extends JpaRepository<Altro, Integer>  {
	
	public List<Altro> findBycategoria(int idcategoria);
	
	@Query("select o from altro o inner join o.categoria c where c.name=:name ") //Jquery
	public List<Altro> findByIdCategoriaUsingQuery(@Param("name")String name);


	
	

}