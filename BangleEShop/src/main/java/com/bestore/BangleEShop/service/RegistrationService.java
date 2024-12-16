package com.bestore.BangleEShop.service;

import java.util.List;

import com.bestore.BangleEShop.model.Registration;

public interface RegistrationService {
	
Registration insertrecord(Registration r);
List<Registration> getAll11();
void del(int ri);
Registration updaterecord(int i,Registration r);
List<Registration> getAll1();
List<Registration> getAll();
Registration insertrecord1(Registration r);




}
