package com.bestore.BangleEShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bestore.BangleEShop.model.Feedback;
import com.bestore.BangleEShop.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	@Qualifier("feedRepo")
	private FeedbackRepository feedRepo;
	@Override
	public Feedback insertrecord(Feedback r) {
		// TODO Auto-generated method stub
		return feedRepo.save(r);
	}

	@Override
	public List<Feedback> getAll() {
		// TODO Auto-generated method stub
		return feedRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		feedRepo.deleteById(ri);
		
	}

	@Override
	public Feedback updaterecord(int i, Feedback r) {
		Optional<Feedback> opt=feedRepo.findById(i);
		if(opt.isPresent())
		{
			Feedback rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setMessage(r.getMessage());
			return feedRepo.save(rold);
		}
		return null;
	}
}

