package com.bestore.BangleEShop.service;

import java.util.List;

import com.bestore.BangleEShop.model.Registration;

public interface RegistrationService {
	
Registration insertrecord(Registration r);
List<Registration> getAll();
void del(int ri);
Registration updaterecord(int i,Registration r);

List<Registration> login(String emailid,String password);



}