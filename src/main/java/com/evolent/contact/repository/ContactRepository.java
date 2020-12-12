package com.evolent.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evolent.contact.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
