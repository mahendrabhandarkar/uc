package com.uc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demo.model.Feedbacks;
import com.uc.demo.service.FeedbacksService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/feedbacks")
public class FeedbacksController {
	@Autowired
	FeedbacksService availsService;
	
	private static final Logger logger = LogManager.getLogger(FeedbacksController.class);
	
	@RequestMapping(value="/feedbacks", method=RequestMethod.POST)
	public Feedbacks createFeedbacks(@RequestBody Feedbacks av) {
	    return availsService.createFeedbacks(av);
	}
	
	@RequestMapping(value="/feedbacks", method=RequestMethod.GET)
	public List<Feedbacks> readFeedbacks() {
		logger.info("Welcome to UrbanController");
	    return availsService.getFeedbacks();
	}

	@RequestMapping(value="/feedbacks/{fbId}", method=RequestMethod.PUT)
	public Feedbacks readFeedbacks(@PathVariable(value = "fbId") Integer id, @RequestBody Feedbacks availDetails) {
	    return availsService.updateFeedbacks(id, availDetails);
	}

	@RequestMapping(value="/feedbacks/{fbId}", method=RequestMethod.DELETE)
	public void deleteFeedbacks(@PathVariable(value = "fbId") Integer id) {
		availsService.deleteFeedbacks(id);
	}
}