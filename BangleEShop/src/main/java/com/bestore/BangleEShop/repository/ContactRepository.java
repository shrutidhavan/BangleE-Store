package com.bestore.BangleEShop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bestore.BangleEShop.model.Contact;

@Repository
@Qualifier("conRepo")
public interface ContactRepository extends JpaRepository<Contact,Integer>
{

	List<Contact> findAll();

}

