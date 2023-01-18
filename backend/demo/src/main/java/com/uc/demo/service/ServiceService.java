package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Services;
import com.uc.demo.repository.ServiceRepo;
import java.util.List;

@Service
public class ServiceService {

	@Autowired
	private ServiceRepo partnerRepo;
	
	// CREATE 
	public Services createService(Services av) {
	    return partnerRepo.save(av);
	}

	// READ
	public List<Services> getService() {
	    return partnerRepo.findAll();
	}

	// DELETE
	public void deleteService(Integer servId) {
		partnerRepo.deleteById(servId);
	}
	
	// UPDATE
	public Services updateService(Integer servId, Services availDetails) {
		Services av = partnerRepo.findById(servId).get();
		av.setCityId(availDetails.getCityId());
		av.setCreatedAt(availDetails.getCreatedAt());
		av.setCreatedBy(availDetails.getCreatedBy());
		av.setServCommission(availDetails.getServCommission());
		av.setServCost(availDetails.getServCost());
		av.setServDesc(availDetails.getServDesc());
		av.setServEmail(availDetails.getServEmail());
		av.setServMobile(availDetails.getServMobile());
		av.setServName(availDetails.getServName());
		av.setServRating(availDetails.getServRating());
		av.setServStreet(availDetails.getServStreet());
		av.setUpdatedAt(availDetails.getUpdatedAt());
		av.setUpdatedBy(availDetails.getUpdatedBy());
	    return partnerRepo.save(av);
	}
}
