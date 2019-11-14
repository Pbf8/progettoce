package it.unisalento.myairbnb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.unisalento.myairbnb.entities.Admin;
import it.unisalento.myairbnb.repositories.AdminRpository;
import it.unisalento.myairbnb.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRpository adminRepository;

	@Override
	public Admin saveOrUpdate(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub
		return adminRepository.findByIdadmin(id);
	}

}
