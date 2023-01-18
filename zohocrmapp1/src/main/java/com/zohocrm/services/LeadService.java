package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	Lead findLeadBy(long id);

	void deleteLeadById(long id);

	public List<Lead> getAllLeads();

	

}
