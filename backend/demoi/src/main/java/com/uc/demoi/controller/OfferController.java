package com.uc.demoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uc.demoi.model.Offer;
import com.uc.demoi.service.OfferService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/offer")
public class OfferController {
	@Autowired
	OfferService availsService;
	
	private static final Logger logger = LogManager.getLogger(OfferController.class);
	
	@RequestMapping(value="/offer", method=RequestMethod.POST)
	public Offer createOffer(@RequestBody Offer av) {
	    return availsService.createOffer(av);
	}
	
	@RequestMapping(value="/offer", method=RequestMethod.GET)
	public List<Offer> readOffer() {
		logger.info("Welcome to UrbanController");
	    return availsService.getOffer();
	}

	@RequestMapping(value="/offer/{offId}", method=RequestMethod.PUT)
	public Offer readOffer(@PathVariable(value = "offId") Integer id, @RequestBody Offer availDetails) {
	    return availsService.updateOffer(id, availDetails);
	}

	@RequestMapping(value="/offer/{offId}", method=RequestMethod.DELETE)
	public void deleteOffer(@PathVariable(value = "offId") Integer id) {
		availsService.deleteOffer(id);
	}
}