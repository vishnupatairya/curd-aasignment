package com.evolent.contact.service;

import java.util.List;

import com.evolent.contact.model.Contact;

public interface ContactService {

	public List<Contact> getAllList();
	
	public Contact saveContact(Contact contact);
	
	public Contact updateContact(Contact contact);
	
	public void deleteContact(Integer id);
	
	public Contact getById(Integer id);
}
