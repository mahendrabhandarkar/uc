package com.uc.demoj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demoj.model.Partner;
import com.uc.demoj.repository.PartnerRepo;
import java.util.List;

@Service
public class PartnerService {

	@Autowired
	private PartnerRepo partnerRepo;
	
	// CREATE 
	public Partner createPartner(Partner av) {
	    return partnerRepo.save(av);
	}

	// READ
	public List<Partner> getPartner() {
	    return partnerRepo.findAll();
	}

	// DELETE
	public void deletePartner(Integer partId) {
		partnerRepo.deleteById(partId);
	}
	
	// UPDATE
	public Partner updatePartner(Integer partId, Partner availDetails) {
		Partner av = partnerRepo.findById(partId).get();
		av.setCreatedAt(availDetails.getCreatedAt());
		av.setCreatedBy(availDetails.getCreatedBy());
		av.setPartEmail(availDetails.getPartEmail());
		av.setPartGender(availDetails.getPartGender());
		av.setPartId(availDetails.getPartId());
		av.setPartMobile(availDetails.getPartMobile());
		av.setPartName(availDetails.getPartName());
		av.setPartProfession(availDetails.getPartProfession());
		av.setServId(availDetails.getServId());
		av.setUpdatedAt(availDetails.getUpdatedAt());
		av.setUpdatedBy(availDetails.getUpdatedBy());
	    return partnerRepo.save(av);
	}
}
