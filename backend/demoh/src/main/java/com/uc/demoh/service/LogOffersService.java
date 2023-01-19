package com.uc.demoh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demoh.model.LogOffers;
import com.uc.demoh.repository.LogOffersRepo;
import java.util.List;

@Service
public class LogOffersService {

	@Autowired
	private LogOffersRepo fbRepo;
	
	// CREATE 
	public LogOffers createLogOffers(LogOffers av) {
	    return fbRepo.save(av);
	}

	// READ
	public List<LogOffers> getLogOffers() {
	    return fbRepo.findAll();
	}

	// DELETE
	public void deleteLogOffers(Integer idLogOffers) {
		fbRepo.deleteById(idLogOffers);
	}
	
	// UPDATE
	public LogOffers updateLogOffers(Integer idLogOffers, LogOffers availDetails) {
		LogOffers av = fbRepo.findById(idLogOffers).get();
		av.setAction(availDetails.getAction());
		av.setChangedOn(availDetails.getChangedOn());
		av.setIdLogOffers(availDetails.getIdLogOffers());
		av.setOffDesc(availDetails.getOffDesc());
		av.setOffDiscount(availDetails.getOffDiscount());
		av.setOffId(availDetails.getOffId());
		av.setOffName(availDetails.getOffName());
	    return fbRepo.save(av);
	}
}
