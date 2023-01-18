package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Avails;
import com.uc.demo.repository.AvailsRepo;
import java.util.List;

@Service
public class AvailsService {

	@Autowired
	private AvailsRepo availsRepo;
	
	// CREATE 
	public Avails createAvailability(Avails av) {
	    return availsRepo.save(av);
	}

	// READ
	public List<Avails> getAvailability() {
	    return availsRepo.findAll();
	}

	// DELETE
	public void deleteAvailability(Integer availId) {
		availsRepo.deleteById(availId);
	}
	
	// UPDATE
	public Avails updateAvailability(Integer availId, Avails availDetails) {
		Avails av = availsRepo.findById(availId).get();
		av.setCustId(availDetails.getCustId());
		av.setOffId(availDetails.getOffId());
	    
	    return availsRepo.save(av);
	}
}
