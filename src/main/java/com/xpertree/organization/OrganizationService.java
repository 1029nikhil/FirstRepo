package com.xpertree.organization;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
	
	@Autowired
	OrganizationRepository orgrepo;
	
	public List<Organization> getOrganizationList()
	{
		
		List<Organization> org = new ArrayList<>();
		orgrepo.findAll().forEach(org::add);
		return org;
		
	}

}
