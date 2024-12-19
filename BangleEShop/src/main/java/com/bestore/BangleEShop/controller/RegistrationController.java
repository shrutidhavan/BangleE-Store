package com.bestore.BangleEShop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bestore.BangleEShop.model.Registration;
import com.bestore.BangleEShop.service.RegistrationService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/registration/")
public class RegistrationController {
@Autowired
private RegistrationService rs;

@GetMapping("/registrations")
public List<Registration> handleget()
{
	return rs.getAll();
}

@PostMapping("/addreg")
public Registration add(@RequestBody Registration r)
{
	return rs.insertrecord(r);
}

@DeleteMapping("/delreg/{rid}")
public void delr(@PathVariable("rid")int r)
{
	rs.del(r);
}
@PutMapping("/upreg/{rid}")
public Registration update(@PathVariable("rid")int i,@RequestBody Registration r)
{
	return rs.updaterecord(i,r);
}
@GetMapping("/login/{emailid}/{password}")
public List<Registration> login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
{
	return rs.login(emailid, password);
}
}
