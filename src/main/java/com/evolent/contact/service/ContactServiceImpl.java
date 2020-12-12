package com.evolent.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evolent.contact.model.Contact;
import com.evolent.contact.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository repo;
	
	@Override
	public List<Contact> getAllList() {
		return repo.findAll();
	}

	@Override
	public Contact saveContact(Contact contact) {
		return repo.save(contact);
	}

	@Override
	public Contact updateContact(Contact contact) {
		return repo.save(contact);
	}

	@Override
	public void deleteContact(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Contact getById(Integer id) {
		return repo.getOne(id);
	}

	
}
