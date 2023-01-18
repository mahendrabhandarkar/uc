package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Proposes;
import com.uc.demo.repository.ProposesRepo;
import java.util.List;

@Service
public class ProposesService {

	@Autowired
	private ProposesRepo partnerRepo;
	
	// CREATE 
	public Proposes createProposes(Proposes av) {
	    return partnerRepo.save(av);
	}

	// READ
	public List<Proposes> getProposes() {
	    return partnerRepo.findAll();
	}

	// DELETE
	public void deleteProposes(Integer proposesId) {
		partnerRepo.deleteById(proposesId);
	}
	
	// UPDATE
	public Proposes updateProposes(Integer proposesId, Proposes availDetails) {
		Proposes av = partnerRepo.findById(proposesId).get();
		av.setOffId(availDetails.getOffId());
		av.setProposesId(availDetails.getProposesId());
		av.setServId(availDetails.getServId());
	    return partnerRepo.save(av);
	}
}
