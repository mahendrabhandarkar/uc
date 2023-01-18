package com.uc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uc.demo.model.Feedbacks;
import com.uc.demo.repository.FeedbacksRepo;
import java.util.List;

@Service
public class FeedbacksService {

	@Autowired
	private FeedbacksRepo fbRepo;
	
	// CREATE 
	public Feedbacks createFeedbacks(Feedbacks av) {
	    return fbRepo.save(av);
	}

	// READ
	public List<Feedbacks> getFeedbacks() {
	    return fbRepo.findAll();
	}

	// DELETE
	public void deleteFeedbacks(Integer fbId) {
		fbRepo.deleteById(fbId);
	}
	
	// UPDATE
	public Feedbacks updateFeedbacks(Integer fbId, Feedbacks availDetails) {
		Feedbacks av = fbRepo.findById(fbId).get();
		av.setFbRating(availDetails.getFbRating());
		av.setFbDesc(availDetails.getFbDesc());
		av.setFbDate(availDetails.getFbDate());
		av.setCustId(availDetails.getCustId());
		av.setPartId(availDetails.getPartId());
	    return fbRepo.save(av);
	}
}
