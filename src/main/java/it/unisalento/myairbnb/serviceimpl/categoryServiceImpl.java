package it.unisalento.myairbnb.serviceimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.unisalento.myairbnb.entities.Admin;
import it.unisalento.myairbnb.entities.Categoria;
import it.unisalento.myairbnb.repositories.AdminRpository;
import it.unisalento.myairbnb.repositories.CategoryRepository;
import it.unisalento.myairbnb.service.CategoryService;

@Service
public class categoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	AdminRpository adminRepository;
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	AdminRpository adminRpository;
	

	@Override
	@Transactional
	public Categoria saveOrUpdate(Categoria category) {
		// TODO Auto-generated method stub
		//Admin admin = em.getReference(Admin.class, 1);
		Admin admin = adminRepository.findByIdadmin(1);
		
		category.setAdmin(admin);
		

		return categoryRepository.save(category); 
		
	}

	@Override
	public List<Categoria> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Categoria getAllByName(String name) {
		// TODO Auto-generated method stub
		return categoryRepository.findByName(name);
	}

	@Override
	@Transactional
	public Boolean getCategoriaToDeleteByName(String name) {
		
		// TODO Auto-generated method stub
		Categoria category = categoryRepository.findByName(name);
		
		 categoryRepository.delete(category);
		 return true;
		 
	}
	
	
	

}
