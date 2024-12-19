package com.bestore.BangleEShop.service;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Service;

	import com.bestore.BangleEShop.model.Contact;
	import com.bestore.BangleEShop.repository.ContactRepository;
	@Service
	public class ContactServiceImpl implements ContactService {

		@Autowired
		@Qualifier("conRepo")
		private ContactRepository conRepo;

		@Override
		public Contact insertrecord(Contact r) {
			// TODO Auto-generated method stub
			return conRepo.save(r);
		}

		@Override
		public List<Contact> getAll() {
			// TODO Auto-generated method stub
			return conRepo.findAll();
		}

		@Override
		public void del(int ri) {
			// TODO Auto-generated method stub
			conRepo.deleteById(ri);
			
		}

		@Override
		public Contact updaterecord(int i, Contact r) {
			Optional<Contact> opt=conRepo.findById(i);
			if(opt.isPresent())
			{
				Contact rold=opt.get();
				rold.setName(r.getName());
				rold.setAddress(r.getAddress());
				rold.setEmailid(r.getEmailid());
				rold.setContact(r.getContact());
				rold.setMessage(r.getMessage());
				return conRepo.save(rold);
			}
			return null;
		}
	}

