package com.evolent.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evolent.contact.model.Contact;
import com.evolent.contact.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	
	@GetMapping(value = "/contacts")
	public List<Contact> getAllContact() {
		return contactService.getAllList();
	}
	
	@PostMapping(value = "/saveContact")
	public Contact saveContact(@RequestBody Contact contact) {
		return contactService.saveContact(contact);
	}
	
	@PutMapping(value = "/updateContact")
	public Contact updateContact(@RequestBody Contact contact) {
		return contactService.updateContact(contact);
	}
	
	@DeleteMapping(value = "/deleteContact/{id}")
	public String deleteContact(@PathVariable Integer id) {
		contactService.deleteContact(id);
		return "Success";
	}
}
