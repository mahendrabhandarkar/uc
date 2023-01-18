package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Offer;
import com.uc.demo.repository.OfferRepo;
import java.util.List;

@Service
public class OfferService {

	@Autowired
	private OfferRepo fbRepo;
	
	// CREATE 
	public Offer createOffer(Offer av) {
	    return fbRepo.save(av);
	}

	// READ
	public List<Offer> getOffer() {
	    return fbRepo.findAll();
	}

	// DELETE
	public void deleteOffer(Integer offId) {
		fbRepo.deleteById(offId);
	}
	
	// UPDATE
	public Offer updateOffer(Integer offId, Offer availDetails) {
		Offer av = fbRepo.findById(offId).get();
		av.setOffDesc(availDetails.getOffDesc());
		av.setOffDiscount(availDetails.getOffDiscount());
		av.setOffId(availDetails.getOffId());
		av.setOffName(availDetails.getOffName());
	    return fbRepo.save(av);
	}
}
