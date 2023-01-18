package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.dto.Email;
import com.zohocrm.util.ZohoMailService;

@Controller
public class EmailController {

	@Autowired
	private  ZohoMailService emailService;
	
	@PostMapping("/sendEmail")
	public String getEmailId(@RequestParam ("email") String email,Model model1) {
		model1.addAttribute("email", email);
		return  "compose_email";
		
	}
	@PostMapping("/tiggerEmail")
	public String tiggerEmail(Email email,Model model) {
		emailService.sendEmail(email.getEmail(), email.getSubject(), email.getContent());
		model.addAttribute("msg", "Email sent!");
		return "compose_email";
		
	}
}
