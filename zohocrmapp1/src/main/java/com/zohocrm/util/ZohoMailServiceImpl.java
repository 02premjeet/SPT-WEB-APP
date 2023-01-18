package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class ZohoMailServiceImpl implements ZohoMailService {

	 @Autowired
		private JavaMailSender javaMailSender;

	@Override
	public void sendEmail(String to, String sub, String emailbody) {
		
		SimpleMailMessage mailMessage= new SimpleMailMessage();
		mailMessage.setTo(to);
		mailMessage.setSubject(sub);
		mailMessage.setText(emailbody);
		
		javaMailSender.send(mailMessage);
		
	}
	 
	
	 
	
	
	
}
