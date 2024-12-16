package com.bestore.BangleEShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class Registration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int regid;
private String name,address,city,gender,contact,emailid,password;
public Registration() {
	// TODO Auto-generated constructor stub
}
public Registration(int regid, String name, String address, String city, String gender, String contact, String emailid,
		String password) {
	super();
	this.regid = regid;
	this.name = name;
	this.address = address;
	this.city = city;
	this.gender = gender;
	this.contact = contact;
	this.emailid = emailid;
	this.password = password;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Registration [regid=" + regid + ", name=" + name + ", address=" + address + ", city=" + city + ", gender="
			+ gender + ", contact=" + contact + ", emailid=" + emailid + ", password=" + password + "]";
}


}
