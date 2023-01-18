package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.BelongsTo;
import com.uc.demo.repository.BelongsToRepo;
import java.util.List;

@Service
public class BelongsToService {

	@Autowired
	private BelongsToRepo belongstoRepo;
	
	// CREATE 
	public BelongsTo createBelongsTo(BelongsTo av) {
	    return belongstoRepo.save(av);
	}

	// READ
	public List<BelongsTo> getBelongsTo() {
	    return belongstoRepo.findAll();
	}

	// DELETE
	public void deleteBelongsTo(Integer belongsId) {
		belongstoRepo.deleteById(belongsId);
	}
	
	// UPDATE
	public BelongsTo updateBelongsTo(Integer belongsId, BelongsTo availDetails) {
		BelongsTo av = belongstoRepo.findById(belongsId).get();
		av.setServId(availDetails.getServId());
		av.setCatId(availDetails.getCatId());
	    
	    return belongstoRepo.save(av);
	}
}
