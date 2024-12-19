package com.bestore.BangleEShop.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactid;
	private String name,address,emailid,contact,message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String address, String emailid, String contact, String message) {
		super();
		this.name = name;
		this.address = address;
		this.emailid = emailid;
		this.contact = contact;
		this.message = message;
	}
	public int getContactid() {
		return contactid;
	}
	public void setContactid(int contactid) {
		this.contactid = contactid;
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
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", name=" + name + ", address=" + address + ", emailid=" + emailid
				+ ", contact=" + contact + ", message=" + message + "]";
	}
}
