package com.bestore.BangleEShop.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bestore.BangleEShop.model.Registration;

@Repository
@Qualifier("regRepo")
public interface RegistrationRepository extends JpaRepository<Registration, Integer>
{
@Query(value="select * from registration where emailid=:emailid and password=:password",nativeQuery=true)
List<Registration>findAllByEmailidAndPassword(String emailid,String password);	




}
