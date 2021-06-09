package com.xpertree.organization;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xpertree.response.dto.GenericResponseDTO;
import com.xpertree.response.dto.Status;

@RestController
@RequestMapping("/gen")
public class OrganizationController {

	@Autowired
	OrganizationService orgService;
	
	@PostMapping("/getOrganizationList")
	public GenericResponseDTO<OrganizationResponse> getOrgList(HttpServletRequest request) {
		GenericResponseDTO<OrganizationResponse> orgres = new GenericResponseDTO<>();
		OrganizationResponse org = new OrganizationResponse();
		org.setList(orgService.getOrganizationList());
		orgres.setResponse(org);
		Status st= new Status();
		st.setCode("00");
		st.setStatus("SUCCESS");
		st.setMessage("good to go");
		orgres.setStatus(st);
		
		return orgres;
		
	
	}
	

}
