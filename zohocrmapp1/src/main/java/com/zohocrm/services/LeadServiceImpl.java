package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repositories.LeadRepository;
import com.zohocrm.entities.Lead;
@Service
public class LeadServiceImpl implements LeadService {
	
	@Autowired
	LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public Lead findLeadBy(long id) {
		
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead=findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
   leadRepo.deleteById(id);		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}

}
