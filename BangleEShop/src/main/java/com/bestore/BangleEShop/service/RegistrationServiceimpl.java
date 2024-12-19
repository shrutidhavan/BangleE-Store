package com.bestore.BangleEShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bestore.BangleEShop.model.Registration;
import com.bestore.BangleEShop.repository.RegistrationRepository;

@Service
public class RegistrationServiceimpl implements RegistrationService{

	@Autowired
	@Qualifier("regRepo")
	private RegistrationRepository regRepo;
	
	public Registration insertrecord(Registration r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Registration> getAll() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		regRepo.deleteById(ri);
	}

	@Override
	public Registration updaterecord(int i,Registration r) {
		// TODO Auto-generated method stub
		java.util.Optional<Registration> opt=regRepo.findById(i);
		if(opt.isPresent())
		{
			Registration rold=opt.get();
			rold.setName(r.getName());
			rold.setAddress(r.getAddress());
			rold.setCity(r.getCity());
			rold.setContact(r.getContact());
			rold.setEmailid(r.getEmailid());
			rold.setPassword(r.getPassword());
			regRepo.save(rold);
			return regRepo.save(rold);

		}
		return null;
	}

	@Override
	public List<Registration> login(String emailid, String password) {
		// TODO Auto-generated method stub
		return regRepo.findAllByEmailidAndPassword(emailid, password);
	}

	
   

}
