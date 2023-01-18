package com.zohocrm.controller;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContractContoller {
	
	   
		//@Autowired
		private ContactService contactService;
		
		public  ContractContoller(ContactService contactService) {
			this.contactService=contactService;
		}

	@RequestMapping("/listallcontact")
	public String listallContacts(Model model ){
		List<Contact> contacts = contactService.getAllContact();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
}
