package com.bestore.BangleEShop.service;


import com.bestore.BangleEShop.model.Contact;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ContactService 
{
	Contact insertrecord(Contact r);
	List<Contact> getAll();
	void del(int ri);
	Contact updaterecord(int i,Contact r);


}
