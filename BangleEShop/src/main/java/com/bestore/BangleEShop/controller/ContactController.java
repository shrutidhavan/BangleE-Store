package com.bestore.BangleEShop.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.bestore.BangleEShop.model.Contact;
	import com.bestore.BangleEShop.service.ContactService;

	@RestController
	public class ContactController {
		@Autowired
		private ContactService cs;

		@GetMapping("/ Contacts")
		public List<Contact> handleget()
		{
			return cs.getAll();
		}
		@PostMapping("/addcon")
		public Contact add(@RequestBody  Contact r)
		{
			return cs.insertrecord(r);
		}
		@DeleteMapping("/delcon/{rid}")
		public void delr(@PathVariable("cid")int r)
		{
			cs.del(r);	
		}
		@PutMapping("/upcon/{rid}")
		public  Contact update(@PathVariable("rid")int i,@RequestBody  Contact r)
		{
			return cs.updaterecord(i,r);
		}
	}

