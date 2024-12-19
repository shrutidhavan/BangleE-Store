package com.bestore.BangleEShop.service;

import java.util.List;

import com.bestore.BangleEShop.model.Feedback;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);

}
