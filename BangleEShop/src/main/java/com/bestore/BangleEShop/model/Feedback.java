package com.bestore.BangleEShop.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int feedbackid;

private String emailid,message;

public Feedback() {
	super();
	// TODO Auto-generated constructor stub
}

public Feedback(String emailid, String message) {
	super();
	this.emailid = emailid;
	this.message = message;
}

public int getFeedbackid() {
	return feedbackid;
}

public void setFeedbackid(int feedbackid) {
	this.feedbackid = feedbackid;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "Feedback [feedbackid=" + feedbackid + ", emailid=" + emailid + ", message=" + message + "]";
}

}
