package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.ContactRepositary;
import com.zohocrm.entities.Contact;

@Service //@service means ---ita a stereotype ..it help us to define the sevice layer in spring boot project..and this calss is maintain bry spring framework. 
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepositary contactRepo;
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getAllContact() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
		
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
